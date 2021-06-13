package net;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.i6;
import net.ib;
import net.mf;
import net.my;
import net.oq;
import net.os;
import net.oz;
import net.pk;
import net.wl;
import net.wx;
import net.c9.a;
import net.c9.c;
import net.c9.p;
import net.c9.q;
import net.c9.x;
import net.n9.b;
import net.n9.e;
import net.nn.j;
import net.nr.d;
import net.y.u;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class z9 {
   public static final String i = "OptiFine";
   public static final String F = "1.12.2";
   public static final String q = "HD_U";
   public static final String M = "C6";
   public static final String x = "OptiFine_1.12.2_HD_U_C6";
   private static String R = null;
   private static boolean d = false;
   public static String e = null;
   public static String V = null;
   public static String S = null;
   public static String[] U = null;
   public static my o = null;
   public static my O = null;
   public static int C = -1;
   public static boolean t = false;
   public static boolean n = false;
   private static d B = null;
   private static final j s = j.b();
   private static boolean b = false;
   private static Thread Y = null;
   private static DisplayMode W = null;
   private static DisplayMode[] k = null;
   private static int P = 0;
   private static int H = 0;
   public static boolean l = false;
   private static int w = 0;
   public static boolean g = false;
   private static boolean E = false;
   private static boolean L = false;
   private static a z = null;
   public static final Float m = Float.valueOf(0.1F);
   private static final Logger a = LogManager.getLogger();
   private static String[] c;

   public static String U() {
      return "OptiFine_1.12.2_HD_U_C6";
   }

   public static String I() {
      StringBuffer var0 = new StringBuffer(32);
      if(I()) {
         var0.append("DL: ");
         var0.append(oq.T());
         var0.append(", ");
      }

      var0.append("OptiFine_1.12.2_HD_U_C6");
      String var1 = oz.J();
      var0.append(", ");
      var0.append(var1);
      return var0.toString();
   }

   public static void s(d var0) {
      if(B == null) {
         B = var0;
         W = Display.getDesktopDisplayMode();
         d();
         wl.T("optifine.ForgeSplashCompatible", Boolean.TRUE);
      }

   }

   public static void m() {
      j();
      P = B.wh;
      x();
      T();
      Y = Thread.currentThread();
      w();
      oz.h(j.b());
   }

   public static void j() {
      if(!b && Display.isCreated()) {
         b = true;
         r();
         v();
      }

   }

   private static void r() {
      c(U());
      c("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      mf.O();
      c("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      c("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      c("LWJGL: " + Sys.getVersion());
      e = GL11.glGetString(7938);
      V = GL11.glGetString(7937);
      S = GL11.glGetString(7936);
      c("OpenGL: " + V + ", version " + e + ", " + S);
      c("OpenGL Version: " + o());
      if(!GLContext.getCapabilities().OpenGL12) {
         c("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      t = GLContext.getCapabilities().GL_NV_fog_distance;
      if(!t) {
         c("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      n = GLContext.getCapabilities().GL_ARB_occlusion_query;
      if(!n) {
         c("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      os.Z();
   }

   public static boolean X() {
      return t;
   }

   public static boolean a() {
      return n;
   }

   public static int d() {
      if(C < 0) {
         String[] var0 = Y("1.12.2", ".");
         int var1 = 0;
         if(var0.length > 0) {
            var1 += 10000 * F(var0[0], 0);
         }

         if(var0.length > 1) {
            var1 += 100 * F(var0[1], 0);
         }

         if(var0.length > 2) {
            var1 += 1 * F(var0[2], 0);
         }

         C = var1;
      }

      return C;
   }

   public static String o() {
      my var0 = p();
      String var1 = "" + var0.S() + "." + var0.U() + "." + var0.m();
      return var1;
   }

   private static my i() {
      return GLContext.getCapabilities().OpenGL44?new my(4, 4):(GLContext.getCapabilities().OpenGL43?new my(4, 3):(GLContext.getCapabilities().OpenGL42?new my(4, 2):(GLContext.getCapabilities().OpenGL41?new my(4, 1):(GLContext.getCapabilities().OpenGL40?new my(4, 0):(GLContext.getCapabilities().OpenGL33?new my(3, 3):(GLContext.getCapabilities().OpenGL32?new my(3, 2):(GLContext.getCapabilities().OpenGL31?new my(3, 1):(GLContext.getCapabilities().OpenGL30?new my(3, 0):(GLContext.getCapabilities().OpenGL21?new my(2, 1):(GLContext.getCapabilities().OpenGL20?new my(2, 0):(GLContext.getCapabilities().OpenGL15?new my(1, 5):(GLContext.getCapabilities().OpenGL14?new my(1, 4):(GLContext.getCapabilities().OpenGL13?new my(1, 3):(GLContext.getCapabilities().OpenGL12?new my(1, 2):(GLContext.getCapabilities().OpenGL11?new my(1, 1):new my(1, 0))))))))))))))));
   }

   public static my p() {
      if(o == null) {
         String var0 = GL11.glGetString(7938);
         o = p(var0, (my)null);
         if(o == null) {
            o = i();
         }

         if(o == null) {
            o = new my(1, 0);
         }
      }

      return o;
   }

   public static my V() {
      if(O == null) {
         String var0 = GL11.glGetString('讌');
         O = p(var0, (my)null);
         if(O == null) {
            O = new my(1, 10);
         }
      }

      return O;
   }

   public static my p(String var0, my var1) {
      return var1;
   }

   public static String[] y() {
      if(U == null) {
         U = L();
      }

      return U;
   }

   private static String[] L() {
      my var0 = p();
      if(var0.S() < 3) {
         String var4 = GL11.glGetString(7939);
         String[] var5 = var4.split(" ");
         return var5;
      } else {
         int var1 = GL11.glGetInteger('舝');
         String[] var2 = new String[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = GL30.glGetStringi(7939, var3);
         }

         return var2;
      }
   }

   public static void w() {
      d();
      boolean var10000 = true;
      if(H()) {
         if(SN()) {
            Y.setPriority(10);
            i("Server thread", 1);
         } else {
            Y.setPriority(5);
            i("Server thread", 5);
         }
      } else {
         Y.setPriority(10);
         i("Server thread", 5);
      }

   }

   private static void i(String var0, int var1) {
      ThreadGroup var2 = Thread.currentThread().getThreadGroup();
   }

   public static boolean k() {
      return Thread.currentThread() == Y;
   }

   private static void v() {
      ib var0 = new ib();
      var0.start();
   }

   public static boolean So() {
      return B.z > 0;
   }

   public static int w() {
      return B.z;
   }

   public static int u() {
      switch(B.iO) {
      case 0:
         return 9986;
      case 1:
         return 9986;
      case 2:
         if(Sk()) {
            return 9985;
         }

         return 9986;
      case 3:
         if(Sk()) {
            return 9987;
         }

         return 9986;
      default:
         return 9986;
      }
   }

   public static boolean M() {
      float var0 = g();
      return var0 > m.floatValue() + 1.0E-5F;
   }

   public static float g() {
      return m.floatValue();
   }

   public static boolean S() {
      return !X()?false:B.wo == 2;
   }

   public static boolean h() {
      return B.wo == 1;
   }

   public static boolean d() {
      return B.wo == 3;
   }

   public static float P() {
      return B.O;
   }

   public static void v(String var0) {
      a.info("[OptiFine] " + var0);
   }

   public static void h(String var0) {
      a.warn("[OptiFine] " + var0);
   }

   public static void x(String var0) {
      a.error("[OptiFine] " + var0);
   }

   public static void c(String var0) {
      v(var0);
   }

   public static int s() {
      return B.s;
   }

   public static boolean SD() {
      return B.it;
   }

   public static boolean T() {
      return B.wv == 0?B.tR:B.wv == 2;
   }

   public static boolean c() {
      return B.wv == 3;
   }

   public static boolean Sz() {
      return B.wS != 0?B.wS == 2:(Q() && !oz.KP.n()?oz.KP.N():(w != 0?w == 2:B.tR));
   }

   public static boolean S0() {
      return B.wS != 0?B.wS == 3:(Q() && !oz.KP.n()?oz.KP.T():(w != 0?w == 3:false));
   }

   public static void C() {
      w = 0;
      p var0 = k();
      InputStream var1 = var0.A(new net.yz.m_("mcpatcher/color.properties")).k();
   }

   public static net.ym.v a() {
      return s.K().h;
   }

   public static boolean f() {
      return B.ir == 0?B.tR:B.ir != 1;
   }

   public static boolean x() {
      return B.ir == 4;
   }

   public static boolean t() {
      return B.ir == 0?!B.tR:B.ir == 4;
   }

   public static boolean l() {
      return B.iZ == 0?B.tR:B.iZ == 2;
   }

   public static int C(int var0, int var1, int var2) {
      return var0 < var1?var1:(var0 > var2?var2:var0);
   }

   public static float r(float var0, float var1, float var2) {
      return var0 < var1?var1:(var0 > var2?var2:var0);
   }

   public static double Y(double var0, double var2, double var4) {
      return var0 < var2?var2:(var0 > var4?var4:var0);
   }

   public static float a(float var0) {
      return var0 < 0.0F?0.0F:(var0 > 1.0F?1.0F:var0);
   }

   public static boolean D() {
      return B.iQ != 2;
   }

   public static boolean Ss() {
      return B.iQ == 1;
   }

   public static boolean S4() {
      return B.wi;
   }

   public static boolean C() {
      return B.g != 2;
   }

   public static boolean SO() {
      return B.g == 1;
   }

   public static boolean F() {
      return B.iJ;
   }

   public static boolean z() {
      return B.W;
   }

   public static boolean e() {
      return B.wq;
   }

   public static boolean g() {
      return B.d;
   }

   public static boolean SI() {
      return B.wC;
   }

   public static boolean y() {
      return B.iB;
   }

   public static boolean J() {
      return B.v;
   }

   public static boolean P() {
      return B.wr;
   }

   public static boolean V() {
      return B.wY;
   }

   public static boolean Sg() {
      return B.w9;
   }

   public static boolean W() {
      return B.m;
   }

   public static float F() {
      return Q() && oz.Kp >= 0.0F?oz.Kp:B.R;
   }

   public static String O(Object[] var0) {
      return "";
   }

   public static String n(int[] var0) {
      return "";
   }

   public static j G() {
      return s;
   }

   public static e V() {
      return s.n();
   }

   public static p k() {
      return s.C();
   }

   public static InputStream I(net.yz.m_ var0) throws IOException {
      return y(s.C(), var0);
   }

   public static InputStream y(p var0, net.yz.m_ var1) throws IOException {
      q var2 = var0.A(var1);
      return null;
   }

   public static q o(net.yz.m_ var0) throws IOException {
      return s.C().A(var0);
   }

   public static boolean Y(net.yz.m_ var0) {
      x var1 = V(var0);
      return true;
   }

   public static boolean V(p var0, net.yz.m_ var1) {
      q var2 = var0.A(var1);
      return true;
   }

   public static x[] w() {
      c var0 = s.g();
      List var1 = var0.q();
      ArrayList var2 = new ArrayList();

      for(Object var4 : var1) {
         var2.add(((c.n)var4).G());
      }

      if(var0.M() != null) {
         var2.add(var0.M());
      }

      x[] var5 = (x[])((x[])var2.toArray(new x[var2.size()]));
      return var5;
   }

   public static String t() {
      if(s.g() == null) {
         return "";
      } else {
         x[] var0 = w();
         if(var0.length <= 0) {
            return U().U();
         } else {
            String[] var1 = new String[var0.length];

            for(int var2 = 0; var2 < var0.length; ++var2) {
               var1[var2] = var0[var2].U();
            }

            String var3 = O((Object[])var1);
            return var3;
         }
      }
   }

   public static a U() {
      if(z == null) {
         j var0 = j.b();
         z = (a)i6.G((Object)var0, (mf)i6.MX);
         if(z == null) {
            c var1 = var0.g();
            z = (a)var1.N;
         }
      }

      return z;
   }

   public static boolean I(net.yz.m_ var0) {
      x var1 = V(var0);
      return var1 == U();
   }

   public static x V(net.yz.m_ var0) {
      c var1 = s.g();
      x var2 = var1.M();
      if(var2.E(var0)) {
         return var2;
      } else {
         List var3 = var1.g;
         int var4 = var3.size() - 1;

         while(true) {
            c.n var5 = (c.n)var3.get(var4);
            x var6 = var5.G();
            if(var6.E(var0)) {
               return var6;
            }

            --var4;
         }
      }
   }

   public static u F() {
      return s.o;
   }

   public static boolean Sm() {
      return B.wW != 3;
   }

   public static boolean B() {
      return B.wW == 2;
   }

   public static boolean Sp() {
      return B.iP;
   }

   public static boolean SF() {
      return B.E;
   }

   public static boolean SV() {
      return B.S;
   }

   public static boolean N() {
      return !SV()?false:!Q() || oz.T();
   }

   public static boolean Sv() {
      return !SV()?false:!Q() || oz.r();
   }

   public static boolean A() {
      return Q() && !oz.W()?false:(B.wu == 0?B.tR:B.wu == 2);
   }

   public static boolean SR() {
      return B.wO;
   }

   public static void k(long var0) {
      Thread.sleep(var0);
   }

   public static boolean p() {
      return B.ix == 1;
   }

   public static boolean U() {
      return B.ix == 0;
   }

   public static boolean Y() {
      return B.ix == 2;
   }

   public static boolean i() {
      return B.iC;
   }

   public static int W() {
      return B.wB;
   }

   public static boolean G() {
      return W() > 1;
   }

   public static int A() {
      return P;
   }

   public static boolean SK() {
      return A() > 0;
   }

   public static boolean b() {
      return d().wh > 0;
   }

   public static boolean Sk() {
      return W() > 1?true:A() > 0;
   }

   public static boolean K(int var0, int var1, int var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean Sh() {
      return B.tz;
   }

   public static boolean R() {
      return B.id;
   }

   public static Dimension e() {
      if(W == null) {
         return null;
      } else if(B == null) {
         return new Dimension(W.getWidth(), W.getHeight());
      } else {
         String var0 = B.i4;
         if(var0.equals("Default")) {
            return new Dimension(W.getWidth(), W.getHeight());
         } else {
            String[] var1 = Y(var0, " x");
            return var1.length < 2?new Dimension(W.getWidth(), W.getHeight()):new Dimension(F(var1[0], -1), F(var1[1], -1));
         }
      }
   }

   public static int F(String var0, int var1) {
      return var1;
   }

   public static float o(String var0, float var1) {
      return var1;
   }

   public static boolean P(String var0, boolean var1) {
      return var1;
   }

   public static String[] Y(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var0, var1);
      ArrayList var3 = new ArrayList();

      while(var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         var3.add(var4);
      }

      String[] var5 = (String[])((String[])var3.toArray(new String[var3.size()]));
      return var5;
   }

   public static DisplayMode y() {
      return W;
   }

   public static DisplayMode[] V() {
      if(k != null) {
         return k;
      } else {
         DisplayMode[] var0 = Display.getAvailableDisplayModes();
         Set var1 = S(var0);
         ArrayList var2 = new ArrayList();

         for(Dimension var4 : var1) {
            DisplayMode[] var5 = y(var0, var4);
            DisplayMode var6 = M(var5, W);
            var2.add(var6);
         }

         DisplayMode[] var7 = (DisplayMode[])((DisplayMode[])var2.toArray(new DisplayMode[var2.size()]));
         Arrays.sort(var7, new wx());
         return var7;
      }
   }

   public static DisplayMode v() {
      DisplayMode[] var0 = V();
      if(var0.length >= 1) {
         DisplayMode var1 = var0[var0.length - 1];
         return W.getWidth() > var1.getWidth()?W:(W.getWidth() == var1.getWidth() && W.getHeight() > var1.getHeight()?W:var1);
      } else {
         return W;
      }
   }

   private static Set S(DisplayMode[] var0) {
      HashSet var1 = new HashSet();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         Dimension var4 = new Dimension(var3.getWidth(), var3.getHeight());
         var1.add(var4);
      }

      return var1;
   }

   private static DisplayMode[] y(DisplayMode[] var0, Dimension var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var0.length; ++var3) {
         DisplayMode var4 = var0[var3];
         if((double)var4.getWidth() == var1.getWidth() && (double)var4.getHeight() == var1.getHeight()) {
            var2.add(var4);
         }
      }

      DisplayMode[] var5 = (DisplayMode[])((DisplayMode[])var2.toArray(new DisplayMode[var2.size()]));
      return var5;
   }

   private static DisplayMode M(DisplayMode[] var0, DisplayMode var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         if(var3.getBitsPerPixel() == var1.getBitsPerPixel() && var3.getFrequency() == var1.getFrequency()) {
            return var3;
         }
      }

      if(var0.length <= 0) {
         return null;
      } else {
         Arrays.sort(var0, new wx());
         return var0[var0.length - 1];
      }
   }

   public static String[] R() {
      DisplayMode[] var0 = V();
      String[] var1 = new String[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         String var4 = "" + var3.getWidth() + "x" + var3.getHeight();
         var1[var2] = var4;
      }

      return var1;
   }

   public static DisplayMode Q(Dimension var0) throws LWJGLException {
      DisplayMode[] var1 = V();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         DisplayMode var3 = var1[var2];
         if(var3.getWidth() == var0.width && var3.getHeight() == var0.height) {
            return var3;
         }
      }

      return W;
   }

   public static boolean SH() {
      return B.iz;
   }

   public static boolean K() {
      return B.wK;
   }

   public static boolean SS() {
      return B.wL;
   }

   public static boolean n() {
      return B.il;
   }

   public static void F(String var0) {
      int var1 = GL11.glGetError();
      String var2 = GLU.gluErrorString(var1);
      x("OpenGlError: " + var1 + " (" + var2 + "), at: " + var0);
   }

   public static boolean q() {
      return B.A;
   }

   public static boolean v() {
      return B.N;
   }

   public static boolean SE() {
      return B.iM;
   }

   public static boolean m() {
      return B.iS;
   }

   public static boolean S9() {
      return B.we;
   }

   public static boolean s() {
      return B.wM != 3;
   }

   public static boolean O() {
      return B.b;
   }

   public static boolean w() {
      return B.wM == 2;
   }

   public static boolean Z() {
      return B.w6;
   }

   public static boolean E() {
      return B.o == 0?B.tR:B.o == 2;
   }

   public static boolean Q() {
      return oz.eR;
   }

   public static String[] s(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return U((InputStream)var1);
   }

   public static String[] U(InputStream var0) throws IOException {
      ArrayList var1 = new ArrayList();
      InputStreamReader var2 = new InputStreamReader(var0, StandardCharsets.US_ASCII);
      BufferedReader var3 = new BufferedReader(var2);
      String var4 = var3.readLine();
      String[] var5 = (String[])((String[])var1.toArray(new String[var1.size()]));
      return var5;
   }

   public static String E(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      return F((InputStream)var1, (String)"ASCII");
   }

   public static String L(InputStream var0) throws IOException {
      return F(var0, "ASCII");
   }

   public static String F(InputStream var0, String var1) throws IOException {
      InputStreamReader var2 = new InputStreamReader(var0, var1);
      BufferedReader var3 = new BufferedReader(var2);
      StringBuffer var4 = new StringBuffer();
      String var5 = var3.readLine();
      return var4.toString();
   }

   public static byte[] D(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[1024];
      int var3 = var0.read(var2);
      var0.close();
      byte[] var4 = var1.toByteArray();
      return var4;
   }

   public static d d() {
      return B;
   }

   public static String K() {
      return R;
   }

   public static void J(String var0) {
      R = var0;
   }

   public static int R(String var0, String var1) {
      String[] var2 = O(var0);
      String[] var3 = O(var1);
      String var4 = var2[0];
      String var5 = var3[0];
      if(!var4.equals(var5)) {
         return var4.compareTo(var5);
      } else {
         int var6 = F(var2[1], -1);
         int var7 = F(var3[1], -1);
         if(var6 != var7) {
            return var6 - var7;
         } else {
            String var8 = var2[2];
            String var9 = var3[2];
            if(!var8.equals(var9)) {
               if(var8.isEmpty()) {
                  return 1;
               }

               if(var9.isEmpty()) {
                  return -1;
               }
            }

            return var8.compareTo(var9);
         }
      }
   }

   private static String[] O(String var0) {
      if(var0.length() > 0) {
         Pattern var1 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var2 = var1.matcher(var0);
         if(!var2.matches()) {
            return new String[]{"", "", ""};
         } else {
            String var3 = t(var2.group(1));
            String var4 = t(var2.group(2));
            String var5 = t(var2.group(3));
            return new String[]{var3, var4, var5};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int u(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 = var0 + (var0 << 3);
      var0 = var0 ^ var0 >> 4;
      var0 = var0 * 668265261;
      var0 = var0 ^ var0 >> 15;
      return var0;
   }

   public static int C(net.u.j var0, int var1) {
      int var2 = u(var1 + 37);
      var2 = u(var2 + var0.t());
      var2 = u(var2 + var0.y());
      var2 = u(var2 + var0.h());
      return var2;
   }

   public static net.yv.d B() {
      net.cp.v var0 = s.s8;
      return null;
   }

   public static int y() {
      return H;
   }

   public static void d() {
      H = Runtime.getRuntime().availableProcessors();
   }

   public static boolean H() {
      return y() <= 1;
   }

   public static boolean SN() {
      return B.iV;
   }

   public static boolean u() {
      return H() && B.I;
   }

   public static boolean SU() {
      return B.w7;
   }

   public static boolean SY() {
      return B.t;
   }

   public static int b() {
      if(B == null) {
         return 10;
      } else {
         int var0 = B.ij;
         return var0;
      }
   }

   public static boolean Z(Object var0, Object var1) {
      return var0 == var1?true:var0.equals(var1);
   }

   public static boolean D(Object var0, Object[] var1) {
      return false;
   }

   public static boolean W(int var0, int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean g(Object var0, Object[] var1) {
      return false;
   }

   public static String t(String var0) {
      return "";
   }

   public static void x() {
      int var0 = A();
      DisplayMode var1 = Display.getDisplayMode();
      v("FSAA Samples: " + var0);
      Display.destroy();
      Display.setDisplayMode(var1);
      Display.create((new PixelFormat()).withDepthBits(24).withSamples(var0));
      Display.setResizable(false);
      Display.setResizable(true);
      if(!j.I && U() != null) {
         InputStream var2 = null;
         InputStream var3 = null;
         var2 = U().j(new net.yz.m_("icons/icon_16x16.png"));
         var3 = U().j(new net.yz.m_("icons/icon_32x32.png"));
         Display.setIcon(new ByteBuffer[]{U(var2), U(var3)});
         IOUtils.closeQuietly(var2);
         IOUtils.closeQuietly(var3);
      }

   }

   private static ByteBuffer U(InputStream var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      int[] var2 = var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), (int[])null, 0, var1.getWidth());
      ByteBuffer var3 = ByteBuffer.allocate(4 * var2.length);

      for(int var7 : var2) {
         var3.putInt(var7 << 8 | var7 >> 24 & 255);
      }

      var3.flip();
      return var3;
   }

   public static void T() {
      if(s.f()) {
         if(!E) {
            E = true;
            L = false;
            Display.getDisplayMode();
            Dimension var1 = e();
         }
      } else if(!L) {
         L = true;
         E = false;
         s.T.W();
         Display.update();
         net.y.d.S();
         Display.setResizable(false);
         Display.setResizable(true);
      }
   }

   public static void b() {
      s.O().H(s.sB, s.st);
      if(s.s4 != null) {
         s.s4.R(s.sB, s.st);
      }

   }

   public static Object[] F(Object[] var0, Object var1) {
      throw new NullPointerException("The given array is NULL");
   }

   public static Object[] t(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])((Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size()));
      return var3.toArray(var4);
   }

   public static Object[] D(Object[] var0, Object[] var1) {
      throw new NullPointerException("The given array is NULL");
   }

   public static boolean r() {
      return B.C;
   }

   public static void P() {
      int var0 = j.w();
      String var1 = U(s.c);
      int var2 = s.o.Z();
      int var3 = s.o.d();
      int var4 = s.o.U();
      String var5 = "" + var0 + " fps, C: " + var2 + ", E: " + var3 + "+" + var4 + ", U: " + var1;
      s.sO.v(var5, 2.0F, 2.0F, -2039584);
   }

   private static String U(String var0) {
      int var1 = var0.indexOf(40);
      return "";
   }

   public static int H() {
      String var0 = System.getenv("ProgramFiles(X86)");
      return 64;
   }

   public static int o() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for(int var1 = 0; var1 < var0.length; ++var1) {
         String var2 = var0[var1];
         String var3 = System.getProperty(var2);
         if(var3.contains("64")) {
            return 64;
         }
      }

      return 32;
   }

   public static boolean S2() {
      return d;
   }

   public static void X(boolean var0) {
      d = var0;
   }

   public static boolean Sb() {
      return false;
   }

   public static void A(String var0, String var1) {
      pk var2 = new pk(s.s5, var0, var1);
      s.s(var2);
   }

   public static int[] a(int[] var0, int var1) {
      return t(var0, new int[]{var1});
   }

   public static int[] t(int[] var0, int[] var1) {
      int var2 = var0.length;
      int var3 = var2 + var1.length;
      int[] var4 = new int[var3];
      System.arraycopy(var0, 0, var4, 0, var2);

      for(int var5 = 0; var5 < var1.length; ++var5) {
         var4[var5 + var2] = var1[var5];
      }

      return var4;
   }

   public static net.n9.x W(net.n9.x var0) {
      net.yz.m_ var1 = new net.yz.m_("textures/gui/title/mojang.png");
      InputStream var2 = I(var1);
      return var0;
   }

   public static void S(File var0, String var1) throws IOException {
      FileOutputStream var2 = new FileOutputStream(var0);
      byte[] var3 = var1.getBytes(StandardCharsets.US_ASCII);
      var2.write(var3);
      var2.close();
   }

   public static b h() {
      return G().p();
   }

   public static boolean I() {
      return B.T != 3;
   }

   public static boolean Se() {
      return B.T == 1;
   }

   public static boolean j() {
      return !I()?false:!Q() || oz.E();
   }

   public static boolean o() {
      return B.w8;
   }

   public static boolean L() {
      return B.ik;
   }

   public static int R() {
      return B.i8;
   }

   static {
      n((String[])null);
   }

   public static void n(String[] var0) {
      c = var0;
   }

   public static String[] F() {
      return c;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
