#ifdef GL_ES
precision mediump float;
#endif

#extension GL_OES_standard_derivatives : enable

uniform float time;
uniform vec2 mouse;
uniform vec2 resolution;

float N21(vec2 p) {
    return fract(sin(p.x*100.+p.y*7446.)*8345.);
}

float SS(vec2 uv) {
    vec2 lv = fract(uv);
    lv = lv*lv*(3.-2.*lv);
    vec2 id = floor(uv);
    
    float bl = N21(id);
    float br = N21(id+vec2(1., 0.));
    float b = mix(bl, br, lv.x);

    float tl = N21(id+vec2(0., 1.));
    float tr = N21(id+vec2(1., 1.));
    float t = mix(tl, tr, lv.x);

    return mix(b, t, lv.y);
}


void main( void ) {

	vec2 position = ( gl_FragCoord.xy / resolution.xy ) + mouse / 4.0;
	
	vec2 uv = gl_FragCoord.xy / resolution.xy; 
    
    	uv.x += time*.03;
    
    
	float c = 0.;
	    
	    for(float i = 1.; i < 8.; i+=1.) {
		c += SS(uv*pow(2.,i))*pow(0.5, i);
	    }
    
	gl_FragColor = vec4(c);

}