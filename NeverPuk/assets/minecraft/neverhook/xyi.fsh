
#ifdef GL_ES
precision highp float;
#endif

// ↙
//  ↙
//   ↙
// http://66.media.tumblr.com/2a2f183dc4a6a040ff6535c5418b9403/tumblr_ncbj5rJvLI1tmxmpzo1_500.jpg

vec2 uv;

uniform float time;
uniform vec2 resolution;

const vec2 ch_size  = vec2(1.0, 2.0) * 0.6;              // character size (X,Y)
const vec2 ch_space = ch_size + vec2(1.0, 1.0);    // character distance Vector(X,Y)
const vec2 ch_start = vec2 (ch_space.x * -5., 1.); // start position
      vec2 ch_pos   = vec2 (0.0, 0.0);             // character position(X,Y)
//      vec3 ch_color = vec3 (1.5, 0.75, 0.5);        // character color (R,G,B)
//const vec3 bg_color = vec3 (0.2, 0.2, 0.2);        // background color (R,G,B)

#define REPEAT_SIGN false // True/False; True=Multiple, False=Single

/* 16 segment display...Akin to LED Display.

Segment bit positions:
  __2__ __1__
 |\    |    /|
 | \   |   / |
 3  11 40 9  0
 |   \ | /   |
 |    \|/    |
  _12__ __8__
 |           |
 |    /|\    |
 4   / | \   7
 | 13 14  15 |
 | /   |   \ |
  __5__|__6__

15 12 11 8 7  4 3  0
 |  | |  | |  | |  |
 0000 0000 0000 0000

example: letter A

   12    8 7  4 3210
    |    | |  | ||||
 0001 0001 1001 1111

 binary to hex -> 0x119F
*/
// xxx it
#define DRAW(u,v) ddigit((v-u)*Time/0xff +u)

#define n0 0x22FF
#define n1 0x0281
#define n2 0x1177
#define n3 0x11E7
#define n4 0x5508
#define n5 0x11EE
#define n6 0x11FE
#define n7 0x2206
#define n8 0x11FF
#define n9 0x11EF

#define A 0x119F
#define B 0x927E
#define C 0x007E
#define D 0x44E7
#define E 0x107E
#define F 0x101E
#define G 0x807E
#define H 0x1199
#define I 0x4466
#define J 0x4436
#define K 0x9218
#define L 0x0078
#define M 0x0A99
#define N 0x8899
#define O 0x00FF
#define P 0x111F
#define Q 0x80FF
#define R 0x911F
#define S 0x8866
#define T 0x4406
#define U 0x00F9
#define V 0x2218
#define W 0xA099
#define X 0xAA00
#define Y 0x4A00
#define Z 0x2266
#define _ ch_pos.x += ch_space.x;
#define s_dot     0
#define s_minus   0x1100
#define s_plus    0x5500
#define s_greater 0x2800
#define s_less    0x8200
#define s_sqrt    0x0C02
#define nl1 ch_pos = ch_start;  ch_pos.y -= 3.0;
#define nl2 ch_pos = ch_start;  ch_pos.y -= 6.0;
#define nl3 ch_pos = ch_start;	ch_pos.y -= 9.0;

float dseg(vec2 p0, vec2 p1)
{
	vec2 dir = normalize(p1 - p0);
	vec2 cp = (uv - ch_pos - p0) * mat2(dir.x, dir.y,-dir.y, dir.x);
	return distance(cp, clamp(cp, vec2(0), vec2(distance(p0, p1), 0)));   
}

bool bit(int n, int b)
{
	return mod(floor(float(n) / exp2(floor(float(b)))), 2.0) != 0.0;
}

float d = 1e6;

void ddigit(int n)
{
	float v = 1e6;
	vec2 cp = uv - ch_pos;
	if (n == 0)     v = min(v, dseg(vec2(-0.405, -1.000), vec2(-0.500, -1.000)));
	if (bit(n,  0)) v = min(v, dseg(vec2( 0.500,  0.063), vec2( 0.500,  0.937)));
	if (bit(n,  1)) v = min(v, dseg(vec2( 0.438,  1.000), vec2( 0.063,  1.000)));
	if (bit(n,  2)) v = min(v, dseg(vec2(-0.063,  1.000), vec2(-0.438,  1.000)));
	if (bit(n,  3)) v = min(v, dseg(vec2(-0.500,  0.937), vec2(-0.500,  0.062)));
	if (bit(n,  4)) v = min(v, dseg(vec2(-0.500, -0.063), vec2(-0.500, -0.938)));
	if (bit(n,  5)) v = min(v, dseg(vec2(-0.438, -1.000), vec2(-0.063, -1.000)));
	if (bit(n,  6)) v = min(v, dseg(vec2( 0.063, -1.000), vec2( 0.438, -1.000)));
	if (bit(n,  7)) v = min(v, dseg(vec2( 0.500, -0.938), vec2( 0.500, -0.063)));
	if (bit(n,  8)) v = min(v, dseg(vec2( 0.063,  0.000), vec2( 0.438, -0.000)));
	if (bit(n,  9)) v = min(v, dseg(vec2( 0.063,  0.063), vec2( 0.438,  0.938)));
	if (bit(n, 10)) v = min(v, dseg(vec2( 0.000,  0.063), vec2( 0.000,  0.937)));
	if (bit(n, 11)) v = min(v, dseg(vec2(-0.063,  0.063), vec2(-0.438,  0.938)));
	if (bit(n, 12)) v = min(v, dseg(vec2(-0.438,  0.000), vec2(-0.063, -0.000)));
	if (bit(n, 13)) v = min(v, dseg(vec2(-0.063, -0.063), vec2(-0.438, -0.938)));
	if (bit(n, 14)) v = min(v, dseg(vec2( 0.000, -0.938), vec2( 0.000, -0.063)));
	if (bit(n, 15)) v = min(v, dseg(vec2( 0.063, -0.063), vec2( 0.438, -0.938)));
	ch_pos.x += ch_space.x;
	d = min(d, v);
}

mat2 rotate(float a)
{
	float c = cos(a);
	float s = sin(a);
	return mat2(c, s, -s, c);
}
vec3 hsv2rgb_smooth( in vec3 c )
{
    vec3 rgb = clamp( abs(mod(c.x*6.0+vec3(0.0,4.0,2.0),6.0)-3.0)-1.0, 0.0, 1.0 );

	rgb = rgb*rgb*(3.0-2.0*rgb); // cubic smoothing

	return c.z * mix( vec3(1.0), rgb, c.y);
}
void main( void )
{
	int Time = int(fract(time/4.)*1024.) -512;
	if (Time>255) Time=255;
	else if(Time>-255&&Time<128) Time=0;
	else Time = int(sin(floor(time*10.))*65535.);	// try to force randomize all segments

	vec2 aspect = resolution.xy / resolution.y;
	uv = ( gl_FragCoord.xy / resolution.y ) - aspect / 2.0;
	float _d =  1.0-length(uv);
	uv *= 8.0 ;
	uv -= vec2(4.9, -0.5);
	//uv *= rotate(time+uv.x*0.05);

	vec3 ch_color = hsv2rgb_smooth(vec3(.83));

	vec3 bg_color = vec3(0.);
	uv.x += 0.5;//+sin(uv.y*0.7)*0.5;
	ch_pos = ch_start;

	DRAW(W,B);
	DRAW(I,E);
	DRAW(N,S);
	DRAW(T,T);
	DRAW(W,H);
	DRAW(A,A);
	DRAW(R,C);
	DRAW(E,K);
			// <https://youtu.be/CcZHxomhwzg?t=38> //



	vec3 color = mix(ch_color, bg_color, .70- (0.8 / d*.30));  // shading
	gl_FragColor = vec4(color, 1.0);
}