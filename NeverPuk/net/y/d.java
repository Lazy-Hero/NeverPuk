package net.y;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import net.u3;
import net.xn;
import net.z9;
import net.y.p;
import net.y.u1;
import net.y.ui;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.vector.Quaternion;

public class d {
   private static final FloatBuffer V;
   private static final FloatBuffer Z;
   private static final d.n R;
   private static final d.y B;
   private static final d.y[] F;
   private static final d.a h;
   private static final d.s S;
   private static final d.x r;
   private static final d.v t;
   private static final d.f z;
   private static final d.c p;
   private static final d.u x;
   private static final d.r s;
   private static final d.t G;
   private static final d.e o;
   private static final d.y v;
   private static int D;
   private static final d.w[] M;
   private static int d;
   private static final d.y y;
   private static final d.h f;
   private static final d.g q;
   public static boolean Y;
   private static net.u.d[] l;
   private static final String[] a;
   private static final String[] b;

   public static void r() {
      GL11.glPushAttrib(8256);
   }

   public static void t() {
      GL11.glPopAttrib();
   }

   public static void d() {
      R.b.U();
   }

   public static void m() {
      R.b.S();
   }

   public static void d(int var0, float var1) {
      if(var0 != R.W || var1 != R.r) {
         R.W = var0;
         R.r = var1;
         GL11.glAlphaFunc(var0, var1);
      }

   }

   public static void l(int var0) {
      GL11.glEnable(var0);
   }

   public static void U(int var0) {
      GL11.glDisable(var0);
   }

   public static void K() {
      B.S();
   }

   public static void i() {
      B.U();
   }

   public static void k(int var0) {
      F[var0].S();
   }

   public static void J(int var0) {
      F[var0].U();
   }

   public static void G() {
      h.k.S();
   }

   public static void e() {
      h.k.U();
   }

   public static void G(int var0, int var1) {
      if(var0 != h.y || var1 != h.l) {
         h.y = var0;
         h.l = var1;
         GL11.glColorMaterial(var0, var1);
      }

   }

   public static void j(int var0, int var1, FloatBuffer var2) {
      GL11.glLight(var0, var1, var2);
   }

   public static void Y(int var0, FloatBuffer var1) {
      GL11.glLightModel(var0, var1);
   }

   public static void b(float var0, float var1, float var2) {
      GL11.glNormal3f(var0, var1, var2);
   }

   public static void z() {
      r.U.U();
   }

   public static void B() {
      r.U.S();
   }

   public static void n(int var0) {
      if(var0 != r.A) {
         r.A = var0;
         GL11.glDepthFunc(var0);
      }

   }

   public static void Y(boolean var0) {
      if(var0 != r.m) {
         r.m = var0;
         GL11.glDepthMask(var0);
      }

   }

   public static void E() {
      S.E.U();
   }

   public static void C() {
      S.E.S();
   }

   public static void m(d.l var0, d.k var1) {
      D(var0.factor, var1.factor);
   }

   public static void D(int var0, int var1) {
      if(var0 != S.u || var1 != S.W) {
         S.u = var0;
         S.W = var1;
         GL11.glBlendFunc(var0, var1);
      }

   }

   public static void e(d.l var0, d.k var1, d.l var2, d.k var3) {
      G(var0.factor, var1.factor, var2.factor, var3.factor);
   }

   public static void G(int var0, int var1, int var2, int var3) {
      if(var0 != S.u || var1 != S.W || var2 != S.d || var3 != S.S) {
         S.u = var0;
         S.W = var1;
         S.d = var2;
         S.S = var3;
         ui.X(var0, var1, var2, var3);
      }

   }

   public static void s(int var0) {
      GL14.glBlendEquation(var0);
   }

   public static void o(int var0) {
      Z.put(0, (float)(var0 >> 16 & 255) / 255.0F);
      Z.put(1, (float)(var0 >> 8 & 255) / 255.0F);
      Z.put(2, (float)(var0 >> 0 & 255) / 255.0F);
      Z.put(3, (float)(var0 >> 24 & 255) / 255.0F);
      H(8960, 8705, Z);
      h(8960, 8704, '蕰');
      h(8960, '蕱', 7681);
      h(8960, '薀', '蕶');
      h(8960, '薐', 768);
      h(8960, '蕲', 7681);
      h(8960, '薈', 5890);
      h(8960, '薘', 770);
   }

   public static void o() {
      h(8960, 8704, 8448);
      h(8960, '蕱', 8448);
      h(8960, '蕲', 8448);
      h(8960, '薀', 5890);
      h(8960, '薈', 5890);
      h(8960, '薐', 768);
      h(8960, '薘', 770);
   }

   public static void p() {
      t.D.S();
   }

   public static void V() {
      t.D.U();
   }

   public static void G(d.j var0) {
      c(var0.capabilityId);
   }

   private static void c(int var0) {
      if(var0 != t.l) {
         t.l = var0;
         GL11.glFogi(2917, var0);
      }

   }

   public static void x(float var0) {
      if(var0 != t.V) {
         t.V = var0;
         GL11.glFogf(2914, var0);
      }

   }

   public static void m(float var0) {
      if(var0 != t.c) {
         t.c = var0;
         GL11.glFogf(2915, var0);
      }

   }

   public static void G(float var0) {
      if(var0 != t.S) {
         t.S = var0;
         GL11.glFogf(2916, var0);
      }

   }

   public static void M(int var0, FloatBuffer var1) {
      GL11.glFog(var0, var1);
   }

   public static void i(int var0, int var1) {
      GL11.glFogi(var0, var1);
   }

   public static void a() {
      z.s.S();
   }

   public static void j() {
      z.s.U();
   }

   public static void s(d.o var0) {
      f(var0.mode);
   }

   private static void f(int var0) {
      if(var0 != z.x) {
         z.x = var0;
         GL11.glCullFace(var0);
      }

   }

   public static void C(int var0, int var1) {
      GL11.glPolygonMode(var0, var1);
   }

   public static void y() {
      p.T.S();
   }

   public static void x() {
      p.T.U();
   }

   public static void x(float var0, float var1) {
      if(var0 != p.p || var1 != p.j) {
         p.p = var0;
         p.j = var1;
         GL11.glPolygonOffset(var0, var1);
      }

   }

   public static void M() {
      x.M.S();
   }

   public static void v() {
      x.M.U();
   }

   public static void S(d.i var0) {
      B(var0.opcode);
   }

   public static void B(int var0) {
      if(var0 != x.t) {
         x.t = var0;
         GL11.glLogicOp(var0);
      }

   }

   public static void h(d.m var0) {
      v(var0).c.S();
   }

   public static void u(d.m var0) {
      v(var0).c.U();
   }

   public static void c(d.m var0, int var1) {
      d.p var2 = v(var0);
      if(var1 != var2.d) {
         var2.d = var1;
         GL11.glTexGeni(var2.T, 9472, var1);
      }

   }

   public static void x(d.m var0, int var1, FloatBuffer var2) {
      GL11.glTexGen(v(var0).T, var1, var2);
   }

   private static d.p v(d.m var0) {
      switch(null.U[var0.ordinal()]) {
      case 1:
         return s.T;
      case 2:
         return s.q;
      case 3:
         return s.X;
      case 4:
         return s.S;
      default:
         return s.T;
      }
   }

   public static void t(int var0) {
      if(D != var0 - ui.V) {
         D = var0 - ui.V;
         ui.j(var0);
      }

   }

   public static void S() {
      M[D].J.S();
   }

   public static void w() {
      M[D].J.U();
   }

   public static void H(int var0, int var1, FloatBuffer var2) {
      GL11.glTexEnv(var0, var1, var2);
   }

   public static void h(int var0, int var1, int var2) {
      GL11.glTexEnvi(var0, var1, var2);
   }

   public static void v(int var0, int var1, float var2) {
      GL11.glTexEnvf(var0, var1, var2);
   }

   public static void w(int var0, int var1, float var2) {
      GL11.glTexParameterf(var0, var1, var2);
   }

   public static void t(int var0, int var1, int var2) {
      GL11.glTexParameteri(var0, var1, var2);
   }

   public static int M(int var0, int var1, int var2) {
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   public static int g() {
      return GL11.glGenTextures();
   }

   public static void a(int var0) {
      GL11.glDeleteTextures(var0);

      for(d.w var4 : M) {
         if(var4.D == var0) {
            var4.D = 0;
         }
      }

   }

   public static void z(int var0) {
      if(var0 != M[D].D) {
         M[D].D = var0;
         GL11.glBindTexture(3553, var0);
      }

   }

   public static void U(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, @Nullable IntBuffer var8) {
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void I(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void S(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      GL11.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m(int var0, int var1, int var2, int var3, IntBuffer var4) {
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   public static void Q() {
      v.S();
   }

   public static void h() {
      v.U();
   }

   public static void Q(int var0) {
      if(var0 != d) {
         d = var0;
         GL11.glShadeModel(var0);
      }

   }

   public static void F() {
      y.S();
   }

   public static void g() {
      y.U();
   }

   public static void j(int var0, int var1, int var2, int var3) {
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void q(boolean var0, boolean var1, boolean var2, boolean var3) {
      if(var0 != f.D || var1 != f.s || var2 != f.E || var3 != f.W) {
         f.D = var0;
         f.s = var1;
         f.E = var2;
         f.W = var3;
         GL11.glColorMask(var0, var1, var2, var3);
      }

   }

   public static void j(double var0) {
      if(var0 != G.g) {
         G.g = var0;
         GL11.glClearDepth(var0);
      }

   }

   public static void O(float var0, float var1, float var2, float var3) {
      String var4 = p.S();
      if(var0 != G.O.V || var1 != G.O.W || var2 != G.O.X || var3 != G.O.Y) {
         G.O.V = var0;
         G.O.W = var1;
         G.O.X = var2;
         G.O.Y = var3;
         GL11.glClearColor(var0, var1, var2, var3);
      }

   }

   public static void y(int var0) {
      if(Y) {
         GL11.glClear(var0);
      }

   }

   public static void G(int var0) {
      GL11.glMatrixMode(var0);
   }

   public static void s() {
      GL11.glLoadIdentity();
   }

   public static void c() {
      GL11.glPushMatrix();
   }

   public static void Y() {
      GL11.glPopMatrix();
   }

   public static void t(int var0, FloatBuffer var1) {
      GL11.glGetFloat(var0, var1);
   }

   public static void g(double var0, double var2, double var4, double var6, double var8, double var10) {
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   public static void P(float var0, float var1, float var2, float var3) {
      GL11.glRotatef(var0, var1, var2, var3);
   }

   public static void W(float var0, float var1, float var2) {
      GL11.glScalef(var0, var1, var2);
   }

   public static void q(double var0, double var2, double var4) {
      GL11.glScaled(var0, var2, var4);
   }

   public static void O(float var0, float var1, float var2) {
      GL11.glTranslatef(var0, var1, var2);
   }

   public static void J(double var0, double var2, double var4) {
      GL11.glTranslated(var0, var2, var4);
   }

   public static void I(FloatBuffer var0) {
      GL11.glMultMatrix(var0);
   }

   public static void r(Quaternion var0) {
      I(w(V, var0));
   }

   public static FloatBuffer w(FloatBuffer var0, Quaternion var1) {
      var0.clear();
      float var2 = var1.x * var1.x;
      float var3 = var1.x * var1.y;
      float var4 = var1.x * var1.z;
      float var5 = var1.x * var1.w;
      float var6 = var1.y * var1.y;
      float var7 = var1.y * var1.z;
      float var8 = var1.y * var1.w;
      float var9 = var1.z * var1.z;
      float var10 = var1.z * var1.w;
      var0.put(1.0F - 2.0F * (var6 + var9));
      var0.put(2.0F * (var3 + var10));
      var0.put(2.0F * (var4 - var8));
      var0.put(0.0F);
      var0.put(2.0F * (var3 - var10));
      var0.put(1.0F - 2.0F * (var2 + var9));
      var0.put(2.0F * (var7 + var5));
      var0.put(0.0F);
      var0.put(2.0F * (var4 + var8));
      var0.put(2.0F * (var7 - var5));
      var0.put(1.0F - 2.0F * (var2 + var6));
      var0.put(0.0F);
      var0.put(0.0F);
      var0.put(0.0F);
      var0.put(0.0F);
      var0.put(1.0F);
      var0.rewind();
      return var0;
   }

   public static void T(float var0, float var1, float var2, float var3) {
      if(var0 != q.V || var1 != q.W || var2 != q.X || var3 != q.Y) {
         q.V = var0;
         q.W = var1;
         q.X = var2;
         q.Y = var3;
         GL11.glColor4f(var0, var1, var2, var3);
      }

   }

   public static void Z(float var0, float var1, float var2) {
      T(var0, var1, var2, 1.0F);
   }

   public static void j(float var0, float var1) {
      GL11.glTexCoord2f(var0, var1);
   }

   public static void K(float var0, float var1, float var2) {
      GL11.glVertex3f(var0, var1, var2);
   }

   public static void b() {
      q.V = -1.0F;
      q.W = -1.0F;
      q.X = -1.0F;
      q.Y = -1.0F;
   }

   public static void y(int var0, int var1, ByteBuffer var2) {
      GL11.glNormalPointer(var0, var1, var2);
   }

   public static void S(int var0, int var1, int var2, int var3) {
      GL11.glTexCoordPointer(var0, var1, var2, (long)var3);
   }

   public static void N(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   public static void X(int var0, int var1, int var2, int var3) {
      GL11.glVertexPointer(var0, var1, var2, (long)var3);
   }

   public static void H(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   public static void n(int var0, int var1, int var2, int var3) {
      GL11.glColorPointer(var0, var1, var2, (long)var3);
   }

   public static void l(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void x(int var0) {
      GL11.glDisableClientState(var0);
   }

   public static void d(int var0) {
      GL11.glEnableClientState(var0);
   }

   public static void K(int var0) {
      GL11.glBegin(var0);
   }

   public static void u() {
      GL11.glEnd();
   }

   public static void H(int var0, int var1, int var2) {
      GL11.glDrawArrays(var0, var1, var2);
   }

   public static void y(float var0) {
      GL11.glLineWidth(var0);
   }

   public static void I(int var0) {
      GL11.glCallList(var0);
   }

   public static void N(int var0, int var1) {
      GL11.glDeleteLists(var0, var1);
   }

   public static void b(int var0, int var1) {
      GL11.glNewList(var0, var1);
   }

   public static void q() {
      GL11.glEndList();
   }

   public static int z(int var0) {
      return GL11.glGenLists(var0);
   }

   public static void u(int var0, int var1) {
      GL11.glPixelStorei(var0, var1);
   }

   public static void I(int var0, int var1, int var2, int var3, int var4, int var5, IntBuffer var6) {
      GL11.glReadPixels(var0, var1, var2, var3, var4, var5, var6);
   }

   public static int z() {
      return GL11.glGetError();
   }

   public static String F(int var0) {
      return GL11.glGetString(var0);
   }

   public static void v(int var0, IntBuffer var1) {
      GL11.glGetInteger(var0, var1);
   }

   public static int S(int var0) {
      return GL11.glGetInteger(var0);
   }

   public static void f(d.q var0) {
      var0.i();
   }

   public static void C(d.q var0) {
      var0.U();
   }

   public static int k() {
      return ui.V + D;
   }

   public static void J() {
      GL11.glBindTexture(3553, M[D].D);
   }

   public static int D() {
      return M[D].D;
   }

   public static void X() {
      if(z9.k()) {
         int var0 = GL11.glGetInteger('蓠');
         int var1 = GL11.glGetInteger('聩');
         int var2 = k();
         int var3 = D();
         if(var0 != var2 || var1 != var3) {
            z9.v(a(-22879, -12868) + var2 + a(-22880, 12684) + var0 + a(-22878, 21329) + var3 + a(-22877, 28812) + var1);
         }
      }

   }

   public static void H(IntBuffer var0) {
      var0.rewind();

      while(var0.position() < var0.limit()) {
         int var1 = var0.get();
         a(var1);
      }

      var0.rewind();
   }

   public static boolean y() {
      return t.D.z;
   }

   public static void D(boolean var0) {
      t.D.f(var0);
   }

   public static void j(u3 var0) {
      var0.l = S.E.z;
      var0.e = S.u;
      var0.n = S.W;
   }

   public static void A(u3 var0) {
      S.E.f(var0.l);
      D(var0.e, var0.n);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static void l(net.u.d[] var0) {
      l = var0;
   }

   public static net.u.d[] t() {
      return l;
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -22879) & '\uffff';
      if(b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 101;
            break;
         case 1:
            var10000 = 173;
            break;
         case 2:
            var10000 = 189;
            break;
         case 3:
            var10000 = 53;
            break;
         case 4:
            var10000 = 240;
            break;
         case 5:
            var10000 = 255;
            break;
         case 6:
            var10000 = 15;
            break;
         case 7:
            var10000 = 5;
            break;
         case 8:
            var10000 = 21;
            break;
         case 9:
            var10000 = 63;
            break;
         case 10:
            var10000 = 115;
            break;
         case 11:
            var10000 = 144;
            break;
         case 12:
            var10000 = 216;
            break;
         case 13:
            var10000 = 238;
            break;
         case 14:
            var10000 = 65;
            break;
         case 15:
            var10000 = 202;
            break;
         case 16:
            var10000 = 82;
            break;
         case 17:
            var10000 = 52;
            break;
         case 18:
            var10000 = 228;
            break;
         case 19:
            var10000 = 181;
            break;
         case 20:
            var10000 = 178;
            break;
         case 21:
            var10000 = 131;
            break;
         case 22:
            var10000 = 125;
            break;
         case 23:
            var10000 = 191;
            break;
         case 24:
            var10000 = 248;
            break;
         case 25:
            var10000 = 76;
            break;
         case 26:
            var10000 = 95;
            break;
         case 27:
            var10000 = 231;
            break;
         case 28:
            var10000 = 237;
            break;
         case 29:
            var10000 = 28;
            break;
         case 30:
            var10000 = 142;
            break;
         case 31:
            var10000 = 211;
            break;
         case 32:
            var10000 = 185;
            break;
         case 33:
            var10000 = 167;
            break;
         case 34:
            var10000 = 194;
            break;
         case 35:
            var10000 = 93;
            break;
         case 36:
            var10000 = 7;
            break;
         case 37:
            var10000 = 250;
            break;
         case 38:
            var10000 = 62;
            break;
         case 39:
            var10000 = 1;
            break;
         case 40:
            var10000 = 23;
            break;
         case 41:
            var10000 = 245;
            break;
         case 42:
            var10000 = 22;
            break;
         case 43:
            var10000 = 67;
            break;
         case 44:
            var10000 = 112;
            break;
         case 45:
            var10000 = 168;
            break;
         case 46:
            var10000 = 199;
            break;
         case 47:
            var10000 = 139;
            break;
         case 48:
            var10000 = 38;
            break;
         case 49:
            var10000 = 120;
            break;
         case 50:
            var10000 = 183;
            break;
         case 51:
            var10000 = 208;
            break;
         case 52:
            var10000 = 96;
            break;
         case 53:
            var10000 = 198;
            break;
         case 54:
            var10000 = 113;
            break;
         case 55:
            var10000 = 3;
            break;
         case 56:
            var10000 = 51;
            break;
         case 57:
            var10000 = 162;
            break;
         case 58:
            var10000 = 119;
            break;
         case 59:
            var10000 = 78;
            break;
         case 60:
            var10000 = 247;
            break;
         case 61:
            var10000 = 105;
            break;
         case 62:
            var10000 = 4;
            break;
         case 63:
            var10000 = 107;
            break;
         case 64:
            var10000 = 212;
            break;
         case 65:
            var10000 = 57;
            break;
         case 66:
            var10000 = 163;
            break;
         case 67:
            var10000 = 104;
            break;
         case 68:
            var10000 = 213;
            break;
         case 69:
            var10000 = 157;
            break;
         case 70:
            var10000 = 50;
            break;
         case 71:
            var10000 = 6;
            break;
         case 72:
            var10000 = 30;
            break;
         case 73:
            var10000 = 227;
            break;
         case 74:
            var10000 = 45;
            break;
         case 75:
            var10000 = 252;
            break;
         case 76:
            var10000 = 123;
            break;
         case 77:
            var10000 = 88;
            break;
         case 78:
            var10000 = 207;
            break;
         case 79:
            var10000 = 179;
            break;
         case 80:
            var10000 = 35;
            break;
         case 81:
            var10000 = 89;
            break;
         case 82:
            var10000 = 108;
            break;
         case 83:
            var10000 = 60;
            break;
         case 84:
            var10000 = 14;
            break;
         case 85:
            var10000 = 26;
            break;
         case 86:
            var10000 = 210;
            break;
         case 87:
            var10000 = 201;
            break;
         case 88:
            var10000 = 2;
            break;
         case 89:
            var10000 = 160;
            break;
         case 90:
            var10000 = 44;
            break;
         case 91:
            var10000 = 31;
            break;
         case 92:
            var10000 = 151;
            break;
         case 93:
            var10000 = 152;
            break;
         case 94:
            var10000 = 75;
            break;
         case 95:
            var10000 = 91;
            break;
         case 96:
            var10000 = 10;
            break;
         case 97:
            var10000 = 0;
            break;
         case 98:
            var10000 = 225;
            break;
         case 99:
            var10000 = 100;
            break;
         case 100:
            var10000 = 81;
            break;
         case 101:
            var10000 = 42;
            break;
         case 102:
            var10000 = 214;
            break;
         case 103:
            var10000 = 175;
            break;
         case 104:
            var10000 = 187;
            break;
         case 105:
            var10000 = 47;
            break;
         case 106:
            var10000 = 116;
            break;
         case 107:
            var10000 = 32;
            break;
         case 108:
            var10000 = 205;
            break;
         case 109:
            var10000 = 138;
            break;
         case 110:
            var10000 = 121;
            break;
         case 111:
            var10000 = 39;
            break;
         case 112:
            var10000 = 206;
            break;
         case 113:
            var10000 = 147;
            break;
         case 114:
            var10000 = 98;
            break;
         case 115:
            var10000 = 72;
            break;
         case 116:
            var10000 = 126;
            break;
         case 117:
            var10000 = 46;
            break;
         case 118:
            var10000 = 83;
            break;
         case 119:
            var10000 = 246;
            break;
         case 120:
            var10000 = 80;
            break;
         case 121:
            var10000 = 19;
            break;
         case 122:
            var10000 = 197;
            break;
         case 123:
            var10000 = 148;
            break;
         case 124:
            var10000 = 146;
            break;
         case 125:
            var10000 = 203;
            break;
         case 126:
            var10000 = 135;
            break;
         case 127:
            var10000 = 87;
            break;
         case 128:
            var10000 = 134;
            break;
         case 129:
            var10000 = 58;
            break;
         case 130:
            var10000 = 145;
            break;
         case 131:
            var10000 = 193;
            break;
         case 132:
            var10000 = 79;
            break;
         case 133:
            var10000 = 143;
            break;
         case 134:
            var10000 = 150;
            break;
         case 135:
            var10000 = 161;
            break;
         case 136:
            var10000 = 24;
            break;
         case 137:
            var10000 = 217;
            break;
         case 138:
            var10000 = 86;
            break;
         case 139:
            var10000 = 128;
            break;
         case 140:
            var10000 = 195;
            break;
         case 141:
            var10000 = 171;
            break;
         case 142:
            var10000 = 176;
            break;
         case 143:
            var10000 = 130;
            break;
         case 144:
            var10000 = 229;
            break;
         case 145:
            var10000 = 140;
            break;
         case 146:
            var10000 = 166;
            break;
         case 147:
            var10000 = 92;
            break;
         case 148:
            var10000 = 29;
            break;
         case 149:
            var10000 = 243;
            break;
         case 150:
            var10000 = 141;
            break;
         case 151:
            var10000 = 234;
            break;
         case 152:
            var10000 = 190;
            break;
         case 153:
            var10000 = 110;
            break;
         case 154:
            var10000 = 253;
            break;
         case 155:
            var10000 = 196;
            break;
         case 156:
            var10000 = 77;
            break;
         case 157:
            var10000 = 68;
            break;
         case 158:
            var10000 = 11;
            break;
         case 159:
            var10000 = 18;
            break;
         case 160:
            var10000 = 164;
            break;
         case 161:
            var10000 = 61;
            break;
         case 162:
            var10000 = 8;
            break;
         case 163:
            var10000 = 153;
            break;
         case 164:
            var10000 = 40;
            break;
         case 165:
            var10000 = 156;
            break;
         case 166:
            var10000 = 149;
            break;
         case 167:
            var10000 = 241;
            break;
         case 168:
            var10000 = 37;
            break;
         case 169:
            var10000 = 43;
            break;
         case 170:
            var10000 = 102;
            break;
         case 171:
            var10000 = 127;
            break;
         case 172:
            var10000 = 215;
            break;
         case 173:
            var10000 = 13;
            break;
         case 174:
            var10000 = 36;
            break;
         case 175:
            var10000 = 118;
            break;
         case 176:
            var10000 = 90;
            break;
         case 177:
            var10000 = 129;
            break;
         case 178:
            var10000 = 56;
            break;
         case 179:
            var10000 = 54;
            break;
         case 180:
            var10000 = 172;
            break;
         case 181:
            var10000 = 177;
            break;
         case 182:
            var10000 = 165;
            break;
         case 183:
            var10000 = 124;
            break;
         case 184:
            var10000 = 111;
            break;
         case 185:
            var10000 = 244;
            break;
         case 186:
            var10000 = 25;
            break;
         case 187:
            var10000 = 99;
            break;
         case 188:
            var10000 = 184;
            break;
         case 189:
            var10000 = 20;
            break;
         case 190:
            var10000 = 94;
            break;
         case 191:
            var10000 = 34;
            break;
         case 192:
            var10000 = 73;
            break;
         case 193:
            var10000 = 182;
            break;
         case 194:
            var10000 = 221;
            break;
         case 195:
            var10000 = 122;
            break;
         case 196:
            var10000 = 236;
            break;
         case 197:
            var10000 = 249;
            break;
         case 198:
            var10000 = 133;
            break;
         case 199:
            var10000 = 132;
            break;
         case 200:
            var10000 = 158;
            break;
         case 201:
            var10000 = 186;
            break;
         case 202:
            var10000 = 69;
            break;
         case 203:
            var10000 = 224;
            break;
         case 204:
            var10000 = 230;
            break;
         case 205:
            var10000 = 180;
            break;
         case 206:
            var10000 = 220;
            break;
         case 207:
            var10000 = 169;
            break;
         case 208:
            var10000 = 48;
            break;
         case 209:
            var10000 = 239;
            break;
         case 210:
            var10000 = 233;
            break;
         case 211:
            var10000 = 254;
            break;
         case 212:
            var10000 = 154;
            break;
         case 213:
            var10000 = 71;
            break;
         case 214:
            var10000 = 192;
            break;
         case 215:
            var10000 = 251;
            break;
         case 216:
            var10000 = 200;
            break;
         case 217:
            var10000 = 17;
            break;
         case 218:
            var10000 = 9;
            break;
         case 219:
            var10000 = 222;
            break;
         case 220:
            var10000 = 232;
            break;
         case 221:
            var10000 = 226;
            break;
         case 222:
            var10000 = 74;
            break;
         case 223:
            var10000 = 59;
            break;
         case 224:
            var10000 = 174;
            break;
         case 225:
            var10000 = 136;
            break;
         case 226:
            var10000 = 188;
            break;
         case 227:
            var10000 = 70;
            break;
         case 228:
            var10000 = 223;
            break;
         case 229:
            var10000 = 41;
            break;
         case 230:
            var10000 = 159;
            break;
         case 231:
            var10000 = 84;
            break;
         case 232:
            var10000 = 64;
            break;
         case 233:
            var10000 = 137;
            break;
         case 234:
            var10000 = 109;
            break;
         case 235:
            var10000 = 170;
            break;
         case 236:
            var10000 = 204;
            break;
         case 237:
            var10000 = 33;
            break;
         case 238:
            var10000 = 103;
            break;
         case 239:
            var10000 = 155;
            break;
         case 240:
            var10000 = 97;
            break;
         case 241:
            var10000 = 242;
            break;
         case 242:
            var10000 = 27;
            break;
         case 243:
            var10000 = 219;
            break;
         case 244:
            var10000 = 85;
            break;
         case 245:
            var10000 = 218;
            break;
         case 246:
            var10000 = 114;
            break;
         case 247:
            var10000 = 12;
            break;
         case 248:
            var10000 = 49;
            break;
         case 249:
            var10000 = 117;
            break;
         case 250:
            var10000 = 235;
            break;
         case 251:
            var10000 = 16;
            break;
         case 252:
            var10000 = 55;
            break;
         case 253:
            var10000 = 209;
            break;
         case 254:
            var10000 = 66;
            break;
         default:
            var10000 = 106;
         }

         short var4 = var10000;
         int var5 = (var1 & 255) - var4;
         var5 = var5 + 256;
         int var6 = ((var1 & '\uffff') >>> 8) - var4;
         var6 = var6 + 256;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
         }

         b[var2] = (new String(var3)).intern();
      }

      return b[var2];
   }

   static class a {
      public d.y k;
      public int y;
      public int l;

      private a() {
         this.k = new d.y(2903);
         this.y = 1032;
         this.l = 5634;
      }
   }

   static class c {
      public d.y T;
      public d.y h;
      public float p;
      public float j;

      private c() {
         this.T = new d.y('耷');
         this.h = new d.y(10754);
      }
   }

   static class e {
      public d.z G;
      public int O;
      public int D;
      public int Q;
      public int x;

      private e() {
         this.G = new d.z();
         this.O = -1;
         this.D = 7680;
         this.Q = 7680;
         this.x = 7680;
      }
   }

   static class f {
      public d.y s;
      public int x;

      private f() {
         this.s = new d.y(2884);
         this.x = 1029;
      }
   }

   static class g {
      public float V;
      public float W;
      public float X;
      public float Y;

      public g() {
         this(1.0F, 1.0F, 1.0F, 1.0F);
      }

      public g(float var1, float var2, float var3, float var4) {
         this.V = 1.0F;
         this.W = 1.0F;
         this.X = 1.0F;
         this.Y = 1.0F;
         this.V = var1;
         this.W = var2;
         this.X = var3;
         this.Y = var4;
      }
   }

   static class h {
      public boolean D;
      public boolean s;
      public boolean E;
      public boolean W;

      private h() {
         this.D = true;
         this.s = true;
         this.E = true;
         this.W = true;
      }
   }

   public static enum i {
      AND(5377),
      AND_INVERTED(5380),
      AND_REVERSE(5378),
      CLEAR(5376),
      COPY(5379),
      COPY_INVERTED(5388),
      EQUIV(5385),
      INVERT(5386),
      NAND(5390),
      NOOP(5381),
      NOR(5384),
      OR(5383),
      OR_INVERTED(5389),
      OR_REVERSE(5387),
      SET(5391),
      XOR(5382);

      public final int opcode;

      private i(int var3) {
         this.opcode = var3;
      }
   }

   public static enum j {
      LINEAR(9729),
      EXP(2048),
      EXP2(2049);

      public final int capabilityId;

      private j(int var3) {
         this.capabilityId = var3;
      }
   }

   public static enum k {
      CONSTANT_ALPHA('考'),
      CONSTANT_COLOR('老'),
      DST_ALPHA(772),
      DST_COLOR(774),
      ONE(1),
      ONE_MINUS_CONSTANT_ALPHA('耄'),
      ONE_MINUS_CONSTANT_COLOR('耂'),
      ONE_MINUS_DST_ALPHA(773),
      ONE_MINUS_DST_COLOR(775),
      ONE_MINUS_SRC_ALPHA(771),
      ONE_MINUS_SRC_COLOR(769),
      SRC_ALPHA(770),
      SRC_COLOR(768),
      ZERO(0);

      public final int factor;

      private k(int var3) {
         this.factor = var3;
      }
   }

   public static enum l {
      CONSTANT_ALPHA('考'),
      CONSTANT_COLOR('老'),
      DST_ALPHA(772),
      DST_COLOR(774),
      ONE(1),
      ONE_MINUS_CONSTANT_ALPHA('耄'),
      ONE_MINUS_CONSTANT_COLOR('耂'),
      ONE_MINUS_DST_ALPHA(773),
      ONE_MINUS_DST_COLOR(775),
      ONE_MINUS_SRC_ALPHA(771),
      ONE_MINUS_SRC_COLOR(769),
      SRC_ALPHA(770),
      SRC_ALPHA_SATURATE(776),
      SRC_COLOR(768),
      ZERO(0);

      public final int factor;

      private l(int var3) {
         this.factor = var3;
      }
   }

   public static enum m {
      S,
      T,
      R,
      Q;
   }

   static class n {
      public d.y b;
      public int W;
      public float r;

      private n() {
         this.b = new d.y(3008);
         this.W = 519;
         this.r = -1.0F;
      }
   }

   public static enum o {
      FRONT(1028),
      BACK(1029),
      FRONT_AND_BACK(1032);

      public final int mode;

      private o(int var3) {
         this.mode = var3;
      }
   }

   static class p {
      public d.y c;
      public int T;
      public int d = -1;

      public p(int var1, int var2) {
         this.T = var1;
         this.c = new d.y(var2);
      }
   }

   public static enum q {
      DEFAULT {
         public void i() {
            p.S();
            d.d();
            d.d(519, 0.0F);
            d.i();
            GL11.glLightModel(2899, u1.T(0.2F, 0.2F, 0.2F, 1.0F));
            int var2 = 0;
            d.J(var2);
            GL11.glLight(16384 + var2, 4608, u1.T(0.0F, 0.0F, 0.0F, 1.0F));
            GL11.glLight(16384 + var2, 4611, u1.T(0.0F, 0.0F, 1.0F, 0.0F));
            GL11.glLight(16384 + var2, 4609, u1.T(1.0F, 1.0F, 1.0F, 1.0F));
            GL11.glLight(16384 + var2, 4610, u1.T(1.0F, 1.0F, 1.0F, 1.0F));
            GL11.glLight(16384 + var2, 4609, u1.T(0.0F, 0.0F, 0.0F, 1.0F));
            GL11.glLight(16384 + var2, 4610, u1.T(0.0F, 0.0F, 0.0F, 1.0F));
            ++var2;
            d.e();
            d.G(1032, 5634);
            d.z();
            d.n(513);
            d.Y(true);
            d.E();
            d.m(d.l.ONE, d.k.ZERO);
            d.e(d.l.ONE, d.k.ZERO, d.l.ONE, d.k.ZERO);
            GL14.glBlendEquation('耆');
            d.V();
            GL11.glFogi(2917, 2048);
            d.x(1.0F);
            d.m(0.0F);
            d.G(1.0F);
            GL11.glFog(2918, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            if(GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi(2917, '蕜');
            }

            d.x(0.0F, 0.0F);
            d.v();
            d.B(5379);
            d.u(d.m.S);
            d.c(d.m.S, 9216);
            d.x(d.m.S, 9474, u1.T(1.0F, 0.0F, 0.0F, 0.0F));
            d.x(d.m.S, 9217, u1.T(1.0F, 0.0F, 0.0F, 0.0F));
            d.u(d.m.T);
            d.c(d.m.T, 9216);
            d.x(d.m.T, 9474, u1.T(0.0F, 1.0F, 0.0F, 0.0F));
            d.x(d.m.T, 9217, u1.T(0.0F, 1.0F, 0.0F, 0.0F));
            d.u(d.m.R);
            d.c(d.m.R, 9216);
            d.x(d.m.R, 9474, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            d.x(d.m.R, 9217, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            d.u(d.m.Q);
            d.c(d.m.Q, 9216);
            d.x(d.m.Q, 9474, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            d.x(d.m.Q, 9217, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            d.t(0);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9986);
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
            GL11.glTexParameteri(3553, '脽', 1000);
            GL11.glTexParameteri(3553, '脻', 1000);
            GL11.glTexParameteri(3553, '脺', -1000);
            GL11.glTexParameterf(3553, '蔁', 0.0F);
            GL11.glTexEnvi(8960, 8704, 8448);
            GL11.glTexEnv(8960, 8705, u1.T(0.0F, 0.0F, 0.0F, 0.0F));
            GL11.glTexEnvi(8960, '蕱', 8448);
            GL11.glTexEnvi(8960, '蕲', 8448);
            GL11.glTexEnvi(8960, '薀', 5890);
            GL11.glTexEnvi(8960, '薁', '蕸');
            GL11.glTexEnvi(8960, '薂', '蕶');
            GL11.glTexEnvi(8960, '薈', 5890);
            GL11.glTexEnvi(8960, '薉', '蕸');
            GL11.glTexEnvi(8960, '薊', '蕶');
            GL11.glTexEnvi(8960, '薐', 768);
            GL11.glTexEnvi(8960, '薑', 768);
            GL11.glTexEnvi(8960, '薒', 770);
            GL11.glTexEnvi(8960, '薘', 770);
            GL11.glTexEnvi(8960, '薙', 770);
            GL11.glTexEnvi(8960, '薚', 770);
            GL11.glTexEnvf(8960, '蕳', 1.0F);
            GL11.glTexEnvf(8960, 3356, 1.0F);
            d.h();
            d.Q(7425);
            d.g();
            d.q(true, true, true, true);
            d.j(1.0D);
            GL11.glLineWidth(1.0F);
            GL11.glNormal3f(0.0F, 0.0F, 1.0F);
            GL11.glPolygonMode(1028, 6914);
            GL11.glPolygonMode(1029, 6914);
            if(net.u.d.y() == null) {
               p.v("pr4Fnb");
            }

         }

         public void U() {
         }

         private static xn a(xn var0) {
            return var0;
         }
      },
      PLAYER_SKIN {
         public void i() {
            d.C();
            d.G(770, 771, 1, 0);
         }

         public void U() {
            d.E();
         }
      },
      TRANSPARENT_MODEL {
         public void i() {
            d.T(1.0F, 1.0F, 1.0F, 0.15F);
            d.Y(false);
            d.C();
            d.m(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA);
            d.d(516, 0.003921569F);
         }

         public void U() {
            d.E();
            d.d(516, 0.1F);
            d.Y(true);
         }
      };

      private q() {
      }

      public abstract void i();

      public abstract void U();
   }

   static class r {
      public d.p T;
      public d.p q;
      public d.p X;
      public d.p S;

      private r() {
         this.T = new d.p(8192, 3168);
         this.q = new d.p(8193, 3169);
         this.X = new d.p(8194, 3170);
         this.S = new d.p(8195, 3171);
      }
   }

   static class s {
      public d.y E;
      public int u;
      public int W;
      public int d;
      public int S;

      private s() {
         this.E = new d.y(3042);
         this.u = 1;
         this.W = 0;
         this.d = 1;
         this.S = 0;
      }
   }

   static class t {
      public double g;
      public d.g O;

      private t() {
         this.g = 1.0D;
         this.O = new d.g(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   static class u {
      public d.y M;
      public int t;

      private u() {
         this.M = new d.y(3058);
         this.t = 5379;
      }
   }

   static class v {
      public d.y D;
      public int l;
      public float V;
      public float c;
      public float S;

      private v() {
         this.D = new d.y(2912);
         this.l = 2048;
         this.V = 1.0F;
         this.S = 1.0F;
      }
   }

   static class w {
      public d.y J;
      public int D;

      private w() {
         this.J = new d.y(3553);
      }
   }

   static class x {
      public d.y U;
      public boolean m;
      public int A;

      private x() {
         this.U = new d.y(2929);
         this.m = true;
         this.A = 513;
      }
   }

   static class y {
      private final int g;
      private boolean z;

      public y(int var1) {
         this.g = var1;
      }

      public void U() {
         this.f(false);
      }

      public void S() {
         this.f(true);
      }

      public void f(boolean var1) {
         String var2 = p.S();
         if(var1 != this.z) {
            this.z = var1;
            if(var1) {
               GL11.glEnable(this.g);
            }

            GL11.glDisable(this.g);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class z {
      public int Y;
      public int R;

      private z() {
         this.Y = 519;
         this.R = -1;
      }
   }
}
