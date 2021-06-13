package net.y;

import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import net.z9;
import net.y.d;
import net.y.p;
import net.y.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import oshi.SystemInfo;
import oshi.hardware.Processor;

public class ui {
   private static final Logger L = LogManager.getLogger();
   public static boolean i;
   public static boolean t;
   public static int g;
   public static int n;
   public static int v;
   public static int qF;
   public static int o;
   public static int R;
   public static int b;
   public static int B;
   public static int T;
   private static ui.d P;
   public static boolean s;
   private static boolean Q;
   private static boolean y;
   public static int E;
   public static int X;
   public static int q3;
   public static int l;
   private static boolean I;
   public static int V;
   public static int w;
   public static int a;
   private static boolean x;
   public static int r;
   public static int Z;
   public static int W;
   public static int J;
   public static int z;
   public static int S;
   public static int D;
   public static int qG;
   public static int qB;
   public static int Y;
   public static int k;
   public static int G;
   public static int e;
   public static int qZ;
   public static int N;
   public static int U;
   public static int c;
   public static int C;
   public static int u;
   private static boolean j;
   public static boolean m;
   public static boolean F;
   public static boolean H;
   private static String d = "";
   private static String h;
   public static boolean p;
   public static boolean O;
   private static boolean q;
   public static int K;
   public static int A;
   public static float M = 0.0F;
   public static float f = 0.0F;

   public static void S() {
      p.S();
      z9.m();
      ContextCapabilities var1 = GLContext.getCapabilities();
      I = var1.GL_ARB_multitexture && !var1.OpenGL13;
      x = var1.GL_ARB_texture_env_combine && !var1.OpenGL13;
      if(I) {
         d = d + "Using ARB_multitexture.\n";
         V = '蓀';
         w = '蓁';
         a = '蓂';
      }

      d = d + "Using GL 1.3 multitexturing.\n";
      V = '蓀';
      w = '蓁';
      a = '蓂';
      if(x) {
         d = d + "Using ARB_texture_env_combine.\n";
         r = '蕰';
         Z = '蕵';
         W = '蕷';
         J = '蕶';
         z = '蕸';
         S = '蕱';
         D = '薀';
         qG = '薁';
         qB = '薂';
         Y = '薐';
         k = '薑';
         G = '薒';
         e = '蕲';
         qZ = '薈';
         N = '薉';
         U = '薊';
         c = '薘';
         C = '薙';
         u = '薚';
      }

      label566: {
         d = d + "Using GL 1.3 texture combiners.\n";
         r = '蕰';
         Z = '蕵';
         W = '蕷';
         J = '蕶';
         z = '蕸';
         S = '蕱';
         D = '薀';
         qG = '薁';
         qB = '薂';
         Y = '薐';
         k = '薑';
         G = '薒';
         e = '蕲';
         qZ = '薈';
         N = '薉';
         U = '薊';
         c = '薘';
         C = '薙';
         u = '薚';
         m = var1.GL_EXT_blend_func_separate && !var1.OpenGL14;
         j = var1.OpenGL14 || var1.GL_EXT_blend_func_separate;
         s = j && (var1.GL_ARB_framebuffer_object || var1.GL_EXT_framebuffer_object || var1.OpenGL30);
         if(s) {
            d = d + "Using framebuffer objects because ";
            if(var1.OpenGL30) {
               d = d + "OpenGL 3.0 is supported and separate blending is supported.\n";
               P = ui.d.BASE;
               g = '赀';
               n = '赁';
               v = '賠';
               qF = '贀';
               o = '賕';
               R = '賖';
               b = '賗';
               B = '賛';
               T = '賜';
            }

            if(var1.GL_ARB_framebuffer_object) {
               d = d + "ARB_framebuffer_object is supported and separate blending is supported.\n";
               P = ui.d.ARB;
               g = '赀';
               n = '赁';
               v = '賠';
               qF = '贀';
               o = '賕';
               b = '賗';
               R = '賖';
               B = '賛';
               T = '賜';
            }

            if(!var1.GL_EXT_framebuffer_object) {
               break label566;
            }

            d = d + "EXT_framebuffer_object is supported.\n";
            P = ui.d.EXT;
            g = '赀';
            n = '赁';
            v = '賠';
            qF = '贀';
            o = '賕';
            b = '賗';
            R = '賖';
            B = '賛';
            T = '賜';
         }

         d = d + "Not using framebuffer objects because ";
         d = d + "OpenGL 1.4 is " + (var1.OpenGL14?"":"not ") + "supported, ";
         d = d + "EXT_blend_func_separate is " + (var1.GL_EXT_blend_func_separate?"":"not ") + "supported, ";
         d = d + "OpenGL 3.0 is " + (var1.OpenGL30?"":"not ") + "supported, ";
         d = d + "ARB_framebuffer_object is " + (var1.GL_ARB_framebuffer_object?"":"not ") + "supported, and ";
         d = d + "EXT_framebuffer_object is " + (var1.GL_EXT_framebuffer_object?"":"not ") + "supported.\n";
      }

      F = var1.OpenGL21;
      Q = F || var1.GL_ARB_vertex_shader && var1.GL_ARB_fragment_shader && var1.GL_ARB_shader_objects;
      d = d + "Shaders are " + (Q?"":"not ") + "available because ";
      if(Q) {
         if(var1.OpenGL21) {
            d = d + "OpenGL 2.1 is supported.\n";
            y = false;
            E = '讂';
            X = '讁';
            q3 = '謱';
            l = '謰';
         }

         d = d + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
         y = true;
         E = '讂';
         X = '讁';
         q3 = '謱';
         l = '謰';
      }

      d = d + "OpenGL 2.1 is " + (var1.OpenGL21?"":"not ") + "supported, ";
      d = d + "ARB_shader_objects is " + (var1.GL_ARB_shader_objects?"":"not ") + "supported, ";
      d = d + "ARB_vertex_shader is " + (var1.GL_ARB_vertex_shader?"":"not ") + "supported, and ";
      d = d + "ARB_fragment_shader is " + (var1.GL_ARB_fragment_shader?"":"not ") + "supported.\n";
      H = s && Q;
      String var2 = GL11.glGetString(7936).toLowerCase(Locale.ROOT);
      i = var2.contains("nvidia");
      q = !var1.OpenGL15 && var1.GL_ARB_vertex_buffer_object;
      p = var1.OpenGL15 || q;
      d = d + "VBOs are " + (p?"":"not ") + "available because ";
      if(p) {
         if(q) {
            d = d + "ARB_vertex_buffer_object is supported.\n";
            A = '裤';
            K = '袒';
         }

         d = d + "OpenGL 1.5 is supported.\n";
         A = '裤';
         K = '袒';
      }

      t = var2.contains("ati");
      if(t) {
         if(p) {
            O = true;
         }

         net.nr.d.RENDER_DISTANCE.u(16.0F);
      }

      Processor[] var3 = (new SystemInfo()).getHardware().getProcessors();
      h = String.format("%dx %s", new Object[]{Integer.valueOf(var3.length), var3[0]}).replaceAll("\\s+", " ");
   }

   public static boolean Q() {
      return H;
   }

   public static String g() {
      return d;
   }

   public static int i(int var0, int var1) {
      return y?ARBShaderObjects.glGetObjectParameteriARB(var0, var1):GL20.glGetProgrami(var0, var1);
   }

   public static void K(int var0, int var1) {
      if(y) {
         ARBShaderObjects.glAttachObjectARB(var0, var1);
      } else {
         GL20.glAttachShader(var0, var1);
      }

   }

   public static void I(int var0) {
      if(y) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteShader(var0);
      }

   }

   public static int T(int var0) {
      return y?ARBShaderObjects.glCreateShaderObjectARB(var0):GL20.glCreateShader(var0);
   }

   public static void a(int var0, ByteBuffer var1) {
      if(y) {
         ARBShaderObjects.glShaderSourceARB(var0, var1);
      } else {
         GL20.glShaderSource(var0, var1);
      }

   }

   public static void k(int var0) {
      if(y) {
         ARBShaderObjects.glCompileShaderARB(var0);
      } else {
         GL20.glCompileShader(var0);
      }

   }

   public static int u(int var0, int var1) {
      return y?ARBShaderObjects.glGetObjectParameteriARB(var0, var1):GL20.glGetShaderi(var0, var1);
   }

   public static String h(int var0, int var1) {
      return y?ARBShaderObjects.glGetInfoLogARB(var0, var1):GL20.glGetShaderInfoLog(var0, var1);
   }

   public static String M(int var0, int var1) {
      return y?ARBShaderObjects.glGetInfoLogARB(var0, var1):GL20.glGetProgramInfoLog(var0, var1);
   }

   public static void T(int var0) {
      if(y) {
         ARBShaderObjects.glUseProgramObjectARB(var0);
      } else {
         GL20.glUseProgram(var0);
      }

   }

   public static int B() {
      return y?ARBShaderObjects.glCreateProgramObjectARB():GL20.glCreateProgram();
   }

   public static void N(int var0) {
      if(y) {
         ARBShaderObjects.glDeleteObjectARB(var0);
      } else {
         GL20.glDeleteProgram(var0);
      }

   }

   public static void i(int var0) {
      if(y) {
         ARBShaderObjects.glLinkProgramARB(var0);
      } else {
         GL20.glLinkProgram(var0);
      }

   }

   public static int w(int var0, CharSequence var1) {
      return y?ARBShaderObjects.glGetUniformLocationARB(var0, var1):GL20.glGetUniformLocation(var0, var1);
   }

   public static void I(int var0, IntBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }

   }

   public static void m(int var0, int var1) {
      if(y) {
         ARBShaderObjects.glUniform1iARB(var0, var1);
      } else {
         GL20.glUniform1i(var0, var1);
      }

   }

   public static void Z(int var0, FloatBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform1ARB(var0, var1);
      } else {
         GL20.glUniform1(var0, var1);
      }

   }

   public static void K(int var0, IntBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }

   }

   public static void v(int var0, FloatBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform2ARB(var0, var1);
      } else {
         GL20.glUniform2(var0, var1);
      }

   }

   public static void m(int var0, IntBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }

   }

   public static void U(int var0, FloatBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform3ARB(var0, var1);
      } else {
         GL20.glUniform3(var0, var1);
      }

   }

   public static void W(int var0, IntBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }

   }

   public static void E(int var0, FloatBuffer var1) {
      if(y) {
         ARBShaderObjects.glUniform4ARB(var0, var1);
      } else {
         GL20.glUniform4(var0, var1);
      }

   }

   public static void y(int var0, boolean var1, FloatBuffer var2) {
      if(y) {
         ARBShaderObjects.glUniformMatrix2ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix2(var0, var1, var2);
      }

   }

   public static void C(int var0, boolean var1, FloatBuffer var2) {
      if(y) {
         ARBShaderObjects.glUniformMatrix3ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix3(var0, var1, var2);
      }

   }

   public static void B(int var0, boolean var1, FloatBuffer var2) {
      if(y) {
         ARBShaderObjects.glUniformMatrix4ARB(var0, var1, var2);
      } else {
         GL20.glUniformMatrix4(var0, var1, var2);
      }

   }

   public static int f(int var0, CharSequence var1) {
      return y?ARBVertexShader.glGetAttribLocationARB(var0, var1):GL20.glGetAttribLocation(var0, var1);
   }

   public static int Z() {
      return q?ARBVertexBufferObject.glGenBuffersARB():GL15.glGenBuffers();
   }

   public static void d(int var0, int var1) {
      if(q) {
         ARBVertexBufferObject.glBindBufferARB(var0, var1);
      } else {
         GL15.glBindBuffer(var0, var1);
      }

   }

   public static void K(int var0, ByteBuffer var1, int var2) {
      if(q) {
         ARBVertexBufferObject.glBufferDataARB(var0, var1, var2);
      } else {
         GL15.glBufferData(var0, var1, var2);
      }

   }

   public static void R(int var0) {
      if(q) {
         ARBVertexBufferObject.glDeleteBuffersARB(var0);
      } else {
         GL15.glDeleteBuffers(var0);
      }

   }

   public static boolean H() {
      return z9.Sk()?false:p && net.nn.j.b().T.ip;
   }

   public static void Q(int var0, int var1) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glBindFramebuffer(var0, var1);
            break;
         case 2:
            ARBFramebufferObject.glBindFramebuffer(var0, var1);
            break;
         case 3:
            EXTFramebufferObject.glBindFramebufferEXT(var0, var1);
         }
      }

   }

   public static void L(int var0, int var1) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glBindRenderbuffer(var0, var1);
            break;
         case 2:
            ARBFramebufferObject.glBindRenderbuffer(var0, var1);
            break;
         case 3:
            EXTFramebufferObject.glBindRenderbufferEXT(var0, var1);
         }
      }

   }

   public static void M(int var0) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glDeleteRenderbuffers(var0);
            break;
         case 2:
            ARBFramebufferObject.glDeleteRenderbuffers(var0);
            break;
         case 3:
            EXTFramebufferObject.glDeleteRenderbuffersEXT(var0);
         }
      }

   }

   public static void u(int var0) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glDeleteFramebuffers(var0);
            break;
         case 2:
            ARBFramebufferObject.glDeleteFramebuffers(var0);
            break;
         case 3:
            EXTFramebufferObject.glDeleteFramebuffersEXT(var0);
         }
      }

   }

   public static int N() {
      if(!s) {
         return -1;
      } else {
         switch(null.Y[P.ordinal()]) {
         case 1:
            return GL30.glGenFramebuffers();
         case 2:
            return ARBFramebufferObject.glGenFramebuffers();
         case 3:
            return EXTFramebufferObject.glGenFramebuffersEXT();
         default:
            return -1;
         }
      }
   }

   public static int l() {
      if(!s) {
         return -1;
      } else {
         switch(null.Y[P.ordinal()]) {
         case 1:
            return GL30.glGenRenderbuffers();
         case 2:
            return ARBFramebufferObject.glGenRenderbuffers();
         case 3:
            return EXTFramebufferObject.glGenRenderbuffersEXT();
         default:
            return -1;
         }
      }
   }

   public static void B(int var0, int var1, int var2, int var3) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glRenderbufferStorage(var0, var1, var2, var3);
            break;
         case 2:
            ARBFramebufferObject.glRenderbufferStorage(var0, var1, var2, var3);
            break;
         case 3:
            EXTFramebufferObject.glRenderbufferStorageEXT(var0, var1, var2, var3);
         }
      }

   }

   public static void M(int var0, int var1, int var2, int var3) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glFramebufferRenderbuffer(var0, var1, var2, var3);
            break;
         case 2:
            ARBFramebufferObject.glFramebufferRenderbuffer(var0, var1, var2, var3);
            break;
         case 3:
            EXTFramebufferObject.glFramebufferRenderbufferEXT(var0, var1, var2, var3);
         }
      }

   }

   public static int C(int var0) {
      if(!s) {
         return -1;
      } else {
         switch(null.Y[P.ordinal()]) {
         case 1:
            return GL30.glCheckFramebufferStatus(var0);
         case 2:
            return ARBFramebufferObject.glCheckFramebufferStatus(var0);
         case 3:
            return EXTFramebufferObject.glCheckFramebufferStatusEXT(var0);
         default:
            return -1;
         }
      }
   }

   public static void p(int var0, int var1, int var2, int var3, int var4) {
      if(s) {
         switch(null.Y[P.ordinal()]) {
         case 1:
            GL30.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 2:
            ARBFramebufferObject.glFramebufferTexture2D(var0, var1, var2, var3, var4);
            break;
         case 3:
            EXTFramebufferObject.glFramebufferTexture2DEXT(var0, var1, var2, var3, var4);
         }
      }

   }

   public static void j(int var0) {
      if(I) {
         ARBMultitexture.glActiveTextureARB(var0);
      } else {
         GL13.glActiveTexture(var0);
      }

   }

   public static void X(int var0) {
      if(I) {
         ARBMultitexture.glClientActiveTextureARB(var0);
      } else {
         GL13.glClientActiveTexture(var0);
      }

   }

   public static void c(int var0, float var1, float var2) {
      if(I) {
         ARBMultitexture.glMultiTexCoord2fARB(var0, var1, var2);
      } else {
         GL13.glMultiTexCoord2f(var0, var1, var2);
      }

      if(var0 == w) {
         M = var1;
         f = var2;
      }

   }

   public static void X(int var0, int var1, int var2, int var3) {
      if(j) {
         if(m) {
            EXTBlendFuncSeparate.glBlendFuncSeparateEXT(var0, var1, var2, var3);
         } else {
            GL14.glBlendFuncSeparate(var0, var1, var2, var3);
         }
      } else {
         GL11.glBlendFunc(var0, var1);
      }

   }

   public static boolean R() {
      return z9.Z()?false:(z9.SK()?false:s && net.nn.j.b().T.wl);
   }

   public static String A() {
      return h == null?"<unknown>":h;
   }

   public static void B(int var0) {
      d.w();
      d.Y(false);
      r var1 = r.f();
      p var2 = var1.k();
      GL11.glLineWidth(4.0F);
      var2.m(1, net.y8.x.F);
      var2.H(0.0D, 0.0D, 0.0D).V(0, 0, 0, 255).W();
      var2.H((double)var0, 0.0D, 0.0D).V(0, 0, 0, 255).W();
      var2.H(0.0D, 0.0D, 0.0D).V(0, 0, 0, 255).W();
      var2.H(0.0D, (double)var0, 0.0D).V(0, 0, 0, 255).W();
      var2.H(0.0D, 0.0D, 0.0D).V(0, 0, 0, 255).W();
      var2.H(0.0D, 0.0D, (double)var0).V(0, 0, 0, 255).W();
      var1.p();
      GL11.glLineWidth(2.0F);
      var2.m(1, net.y8.x.F);
      var2.H(0.0D, 0.0D, 0.0D).V(255, 0, 0, 255).W();
      var2.H((double)var0, 0.0D, 0.0D).V(255, 0, 0, 255).W();
      var2.H(0.0D, 0.0D, 0.0D).V(0, 255, 0, 255).W();
      var2.H(0.0D, (double)var0, 0.0D).V(0, 255, 0, 255).W();
      var2.H(0.0D, 0.0D, 0.0D).V(127, 127, 255, 255).W();
      var2.H(0.0D, 0.0D, (double)var0).V(127, 127, 255, 255).W();
      var1.p();
      GL11.glLineWidth(1.0F);
      d.Y(true);
      d.S();
   }

   public static void z(File var0) {
      String var1 = var0.getAbsolutePath();
      if(net.yz.h.M() == net.yz.h.OSX) {
         L.info(var1);
         Runtime.getRuntime().exec(new String[]{"/usr/bin/open", var1});
      } else if(net.yz.h.M() == net.yz.h.WINDOWS) {
         String var5 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[]{var1});
         Runtime.getRuntime().exec(var5);
      } else {
         boolean var2 = false;
         Class var3 = Class.forName("java.awt.Desktop");
         Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
         var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{var0.toURI()});
         L.info("Opening via system class!");
         Sys.openURL("file://" + var1);
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static enum d {
      BASE,
      ARB,
      EXT;
   }
}
