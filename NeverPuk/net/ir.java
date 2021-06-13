package net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import net.u.d;
import org.lwjgl.opengl.GL20;

public class ir {
   private final int v;
   private final int R;
   private final int u;
   private final int k;
   private static d[] b;

   public ir(String var1) throws IOException {
      int var3 = GL20.glCreateProgram();
      m();
      GL20.glAttachShader(var3, this.x(ir.class.getResourceAsStream("/passthrough.vsh"), '謱'));
      GL20.glAttachShader(var3, this.x(ir.class.getResourceAsStream(var1), '謰'));
      GL20.glLinkProgram(var3);
      this.v = var3;
      GL20.glUseProgram(var3);
      this.R = GL20.glGetUniformLocation(var3, "time");
      this.u = GL20.glGetUniformLocation(var3, "mouse");
      this.k = GL20.glGetUniformLocation(var3, "resolution");
      GL20.glUseProgram(0);
      d.h(new d[5]);
   }

   public void n(int var1, int var2, float var3, float var4, float var5) {
      GL20.glUseProgram(this.v);
      m();
      GL20.glUniform2f(this.k, (float)var1, (float)var2);
      GL20.glUniform2f(this.u, var3 / (float)var1, 1.0F - var4 / (float)var2);
      GL20.glUniform1f(this.R, var5);
      if(d.y() == null) {
         F(new d[3]);
      }

   }

   private int x(InputStream var1, int var2) throws IOException {
      int var3 = GL20.glCreateShader(var2);
      GL20.glShaderSource(var3, this.B(var1));
      GL20.glCompileShader(var3);
      return var3;
   }

   private String B(InputStream var1) throws IOException {
      m();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var4 = new byte[512];
      int var5;
      if((var5 = var1.read(var4, 0, var4.length)) != -1) {
         var3.write(var4, 0, var5);
      }

      return new String(var3.toByteArray(), StandardCharsets.UTF_8);
   }

   public static void F(d[] var0) {
      b = var0;
   }

   public static d[] m() {
      return b;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      F((d[])null);
   }
}
