package net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net._a;
import net._j;
import net.b5;
import net.b8;
import net.b9;
import net.be;
import net.bq;
import net.bt;
import net.bu;
import net.df;
import net.dw;
import net.g7;
import net.gh;
import net.gt;
import net.i6;
import net.ig;
import net.m8;
import net.mj;
import net.o_;
import net.on;
import net.rx;
import net.rz;
import net.u5;
import net.ui;
import net.uv;
import net.wh;
import net.wr;
import net.x7;
import net.xb;
import net.xf;
import net.xo;
import net.xv;
import net.z9;
import net.cb.l;
import net.n0.ks;
import net.n0.y;
import net.n9.t;
import net.n_.f;
import net.nb.b;
import net.ne.a;
import net.nn.j;
import net.y.d;
import net.y.n;
import net.y.p;
import net.y0.c;
import net.y6.jb;
import net.y8.x;
import net.yv.r;
import net.yz.ac;
import net.yz.k;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class oz {
   static j F;
   static n Ec;
   public static boolean Hm = false;
   public static boolean Ef = false;
   public static ContextCapabilities Ek;
   public static String eU;
   public static String B;
   public static String ef;
   public static boolean Kk = false;
   public static boolean HC = false;
   public static int EB = 0;
   static boolean Ed = false;
   private static int KU = 0;
   private static int HG = 0;
   public static int Kw = 0;
   public static int e3 = 0;
   public static boolean ey = false;
   public static boolean H4 = false;
   public static boolean EM = false;
   public static boolean q = false;
   public static boolean Hr = false;
   public static boolean EK;
   private static boolean H5;
   private static boolean KI;
   private static boolean em;
   private static boolean E4;
   private static boolean eg;
   public static boolean Ee = false;
   public static boolean Kr = false;
   public static boolean eW = false;
   static float[] M = new float[4];
   static float[] KH = new float[4];
   static float[] KB = new float[4];
   static float[] H6 = new float[4];
   static float[] KL = new float[4];
   static float[] m = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] Eo = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   static float[] Kl = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   private static final float[] e7 = new float[16];
   static float O;
   static float _0;
   static float j;
   static float eq;
   static float HE;
   static float ei;
   static long _O = 0L;
   static long K1 = 0L;
   static long Ei = 0L;
   static float P = 0.0F;
   static float Er = 0.0F;
   static float EJ = 0.0F;
   static int Hz = 0;
   static long Kb = 0L;
   static long Hn = 0L;
   static long et = 0L;
   static int eY = 0;
   static float eH = 0.0F;
   static float HU = 0.0F;
   static int Kj = 0;
   static float Hj = 0.0F;
   static float I = 0.0F;
   public static float en = 600.0F;
   public static float KD = 200.0F;
   public static float n = 10.0F;
   static boolean Hu = false;
   static int HX = 0;
   static int ej = 0;
   static float e5 = 0.0F;
   static float EF = 0.0F;
   static float p = 0.0F;
   static float o = 0.0F;
   static float Ht = 0.0F;
   static float eO = 1.0F;
   static boolean Hf = false;
   static int Kc = 1;
   static float _b = 0.0F;
   static float Hg = 0.0F;
   static boolean eF = false;
   static boolean Km = false;
   static boolean HH = true;
   public static int K6 = 10;
   public static int A = 11;
   public static int e4 = 12;
   public static boolean Ha = false;
   public static boolean EY = false;
   public static boolean f = false;
   public static boolean KR = false;
   public static boolean eZ = false;
   public static boolean HR = false;
   public static boolean _r = false;
   public static int EX = 0;
   public static int es = 0;
   public static xf EV = new xf("entityColor");
   public static xb Kh = new xb("entityId");
   public static xb HW = new xb("blockEntityId");
   static double HS;
   static double L;
   static double El;
   static double EH;
   static double E2;
   static double Ew;
   static int Es = 0;
   public static boolean K_ = false;
   static int ez = 1024;
   static int KM = 1024;
   static int eu = 1024;
   static int S = 1024;
   static float eT = 90.0F;
   static float Hw = 160.0F;
   static boolean EO = true;
   static float E = -1.0F;
   static int HB = 0;
   static int HQ;
   public static boolean E_ = false;
   static boolean Hq = false;
   static final int H = 8;
   static final int eE = 8;
   static final int Ez = 3;
   static final int G = 8;
   static final int C = 2;
   static int H0 = 0;
   static int E5 = 0;
   static int K3 = 0;
   static int HM = 0;
   static int el = 0;
   static int EN = 0;
   static int HF = 0;
   static int HI = 0;
   private static final int[] e8 = new int[8];
   private static final boolean[] H7 = new boolean[8];
   public static int s = 0;
   public static final int eQ = 0;
   public static final int _N = 1;
   public static final int En = 2;
   public static final int eM = 3;
   public static final int Hx = 4;
   public static final int w = 5;
   public static final int E1 = 6;
   public static final int e9 = 7;
   public static final int E6 = 8;
   public static final int eB = 9;
   public static final int Eq = 10;
   public static final int Et = 11;
   public static final int H2 = 12;
   public static final int EU = 13;
   public static final int KQ = 14;
   public static final int KX = 15;
   public static final int K0 = 16;
   public static final int Ko = 17;
   public static final int EP = 18;
   public static final int _Q = 19;
   public static final int EZ = 20;
   public static final int Ks = 21;
   public static final int d = 22;
   public static final int v = 23;
   public static final int EE = 24;
   public static final int ew = 25;
   public static final int HJ = 26;
   public static final int KS = 27;
   public static final int HZ = 28;
   public static final int Hs = 29;
   public static final int K4 = 30;
   public static final int K7 = 31;
   public static final int e_ = 32;
   public static final int Hp = 33;
   public static final int KY = 8;
   private static final String[] E8 = new String[]{"", "gbuffers_basic", "gbuffers_textured", "gbuffers_textured_lit", "gbuffers_skybasic", "gbuffers_skytextured", "gbuffers_clouds", "gbuffers_terrain", "gbuffers_terrain_solid", "gbuffers_terrain_cutout_mip", "gbuffers_terrain_cutout", "gbuffers_damagedblock", "gbuffers_water", "gbuffers_block", "gbuffers_beaconbeam", "gbuffers_item", "gbuffers_entities", "gbuffers_armor_glint", "gbuffers_spidereyes", "gbuffers_hand", "gbuffers_weather", "composite", "composite1", "composite2", "composite3", "composite4", "composite5", "composite6", "composite7", "final", "shadow", "shadow_solid", "shadow_cutout"};
   private static final int[] Ke = new int[]{0, 0, 1, 2, 1, 2, 2, 3, 7, 7, 7, 7, 7, 7, 2, 3, 3, 2, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30};
   static int[] y = new int[33];
   private static final int[] eV = new int[33];
   private static final int eh = 0;
   private static final String[] e6 = new String[33];
   private static String eX = null;
   static IntBuffer[] EQ = new IntBuffer[33];
   static IntBuffer Ki = null;
   private static final String[] KG = new String[33];
   private static String T = null;
   private static final String Ey = null;
   private static final int[] eJ = new int[33];
   private static int eI = 0;
   private static int Ex = 0;
   public static Properties _M = null;
   public static Properties Ka = null;
   public static t l = null;
   public static boolean Z = false;
   public static boolean[] Hk = new boolean[2];
   public static boolean[] EL = new boolean[2];
   public static boolean[] E7 = new boolean[2];
   public static boolean[] HK = new boolean[8];
   public static boolean[] e2 = new boolean[8];
   public static boolean _y = false;
   public static boolean ER = false;
   public static float H_ = 0.125F;
   public static float c = 1.0F;
   public static float _f = 1.0F;
   public static int EG = 0;
   public static int _j = 0;
   public static int Ev = 0;
   public static int Kt = 0;
   public static int HN = 0;
   public static int ev = 0;
   public static boolean eA = true;
   public static boolean ek = true;
   public static boolean H3 = true;
   public static bu H9 = new bu("oldLighting", "Classic Lighting", 0);
   public static bu ep = new bu("oldHandLight", "Old Hand Light", 0);
   public static int K = 0;
   public static final int Em = 3;
   public static final int Hl = 2;
   public static final String[] Eg = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
   public static final String[] Q = new String[]{"Nearest", "Linear"};
   public static final int[] KN = new int[]{9728, 9984, 9986};
   public static final int[] eS = new int[]{9728, 9729};
   static rx HT = null;
   public static boolean eR = false;
   static File eG;
   static String h;
   public static String e0 = "OFF";
   static String E0 = "(internal)";
   static String b = "shaderpacks";
   static String KT = "optionsshaders.txt";
   static File Hh;
   static File eP;
   static File Hv;
   static uv[] a = null;
   static Set K2 = null;
   static b8[] x = null;
   static Map Ep = null;
   public static bq KP = new bq("clouds", "Clouds", 0);
   public static bu KE = new bu("oldLighting", "Classic Lighting", 0);
   public static bu V = new bu("oldHandLight", "Old Hand Light", 0);
   public static bu Y = new bu("dynamicHandLight", "Dynamic Hand Light", 0);
   public static bu eb = new bu("shadowTranslucent", "Shadow Translucent", 0);
   public static bu He = new bu("underwaterOverlay", "Underwater Overlay", 0);
   public static bu ex = new bu("sun", "Sun", 0);
   public static bu K9 = new bu("moon", "Moon", 0);
   public static bu HO = new bu("vignette", "Vignette", 0);
   public static bu Kq = new bu("backFace.solid", "Back-face Solid", 0);
   public static bu K5 = new bu("backFace.cutout", "Back-face Cutout", 0);
   public static bu KF = new bu("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
   public static bu ee = new bu("backFace.translucent", "Back-face Translucent", 0);
   private static Map HP = new HashMap();
   private static r KJ = null;
   private static final List HV = new ArrayList();
   private static xv[] t = null;
   private static xv[] Kg = null;
   private static String eD = null;
   private static final int i = 0;
   private static final int J = 1;
   private static final String[] R = new String[]{"gbuffers", "composite"};
   public static final boolean Eh = true;
   private static final boolean H1 = true;
   private static final boolean Kx = System.getProperty("shaders.debug.save", "false").equals("true");
   public static float KO = 0.5F;
   public static float er = 0.6F;
   public static float W = 0.8F;
   public static float Kp = -1.0F;
   public static float EA = 0.0F;
   public static float HD = 0.0F;
   public static int r = 0;
   public static float eN;
   public static float Eb;
   public static float ec;
   public static float eK = 2.0F;
   public static int H8 = 16;
   public static int[] u = new int[2];
   private static bt Kn;
   private static boolean KW = false;
   private static int Eu = 256;
   static final int[] e = new int[16];
   static final int[] KK = new int[8];
   static final int[] Ky = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
   static final boolean[][] Kv = new boolean[33][8];
   private static final int Ej = 2196;
   private static final ByteBuffer U = (ByteBuffer)BufferUtils.createByteBuffer(2196).limit(0);
   static final float[] ES = new float[16];
   static final float[] HL = new float[16];
   static final float[] k = new float[16];
   static final float[] Kz = new float[16];
   static final float[] EI = new float[16];
   static final float[] Hd = new float[16];
   static final float[] KV = new float[16];
   static final float[] Hy = new float[16];
   static final FloatBuffer eC = I(16);
   static final FloatBuffer EC = I(16);
   static final FloatBuffer X = I(16);
   static final FloatBuffer Hc = I(16);
   static final FloatBuffer ED = I(16);
   static final FloatBuffer ed = I(16);
   static final FloatBuffer e1 = I(16);
   static final FloatBuffer ET = I(16);
   static final FloatBuffer E9 = I(16);
   static final FloatBuffer E3 = I(16);
   static final FloatBuffer eL = I(16);
   static final FloatBuffer g = I(16);
   static final IntBuffer Kf = W(16);
   static final IntBuffer Hb = W(3);
   static final IntBuffer KC = W(8);
   static final IntBuffer K8 = W(2);
   static final IntBuffer KZ = W(8);
   static final IntBuffer N = W(8);
   static final IntBuffer ea = W(8);
   static final IntBuffer eo = W(8);
   static final IntBuffer Kd = W(8);
   static final IntBuffer z = W(8);
   static final IntBuffer HY = W(8);
   static final IntBuffer EW = W(8);
   static final IntBuffer[] Ho = L(33, 8);
   static Map Hi;
   private static final String[] HA = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
   private static final int[] Ea = new int[]{'舩', '舫', '聑', '聘', '辔', '辕', '辖', '辗', '航', '般', '联', '聛', '辘', '辙', '辚', '辛', '舭', '舯', '蠛', '蠚', '舮', '舰', '蠕', '蠔', '舵', '舻', '趃', '趂', '舶', '舼', '赱', '走', 10768, '聗', '聙', '谺', '谽'};
   private static final Pattern Ku = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
   public static int[] KA = new int[32];
   public static int D = 0;

   private static ByteBuffer C(int var0) {
      ByteBuffer var1 = U;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0);
      return var1.slice();
   }

   private static IntBuffer W(int var0) {
      ByteBuffer var1 = U;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   private static FloatBuffer I(int var0) {
      ByteBuffer var1 = U;
      int var2 = var1.limit();
      var1.position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   private static IntBuffer[] L(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var2[var3] = W(var1);
      }

      return var2;
   }

   public static void n4() {
      wr.H("Load ShadersMod configuration.");
      if(!eP.exists()) {
         eP.mkdir();
      }

      Ka = new g7();
      Ka.setProperty(gt.SHADER_PACK.D(), "");
      if(Hv.exists()) {
         FileReader var0 = new FileReader(Hv);
         Ka.load(var0);
         var0.close();
      }

      if(!Hv.exists()) {
         j();
      }

      gt[] var6 = gt.values();

      for(int var1 = 0; var1 < var6.length; ++var1) {
         gt var2 = var6[var1];
         String var3 = var2.D();
         String var4 = var2.q();
         String var5 = Ka.getProperty(var3, var4);
         k(var2, var5);
      }

      nk();
   }

   private static void k(gt var0, String var1) {
      var1 = var0.q();
      switch(null.G[var0.ordinal()]) {
      case 1:
         K = z9.F(var1, 0);
         break;
      case 2:
         ek = z9.P(var1, true);
         break;
      case 3:
         H3 = z9.P(var1, true);
         break;
      case 4:
         c = z9.o(var1, 1.0F);
         break;
      case 5:
         _f = z9.o(var1, 1.0F);
         break;
      case 6:
         H_ = z9.o(var1, 0.125F);
         break;
      case 7:
         ER = z9.P(var1, true);
         break;
      case 8:
         ep.d(var1);
         break;
      case 9:
         H9.d(var1);
         break;
      case 10:
         h = var1;
         break;
      case 11:
         _y = z9.P(var1, true);
         break;
      case 12:
         eA = z9.P(var1, true);
         break;
      case 13:
         EG = z9.F(var1, 0);
         break;
      case 14:
         _j = z9.F(var1, 0);
         break;
      case 15:
         Ev = z9.F(var1, 0);
         break;
      case 16:
         Kt = z9.F(var1, 0);
         break;
      case 17:
         Kt = z9.F(var1, 0);
         break;
      case 18:
         Kt = z9.F(var1, 0);
         break;
      default:
         throw new IllegalArgumentException("Unknown option: " + var0);
      }

   }

   public static void j() {
      wr.H("Save ShadersMod configuration.");
      if(Ka == null) {
         Ka = new g7();
      }

      gt[] var0 = gt.values();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         gt var2 = var0[var1];
         String var3 = var2.D();
         String var4 = g(var2);
         Ka.setProperty(var3, var4);
      }

      FileWriter var5 = new FileWriter(Hv);
      Ka.store(var5, (String)null);
      var5.close();
   }

   public static String g(gt var0) {
      switch(null.G[var0.ordinal()]) {
      case 1:
         return Integer.toString(K);
      case 2:
         return Boolean.toString(ek);
      case 3:
         return Boolean.toString(H3);
      case 4:
         return Float.toString(c);
      case 5:
         return Float.toString(_f);
      case 6:
         return Float.toString(H_);
      case 7:
         return Boolean.toString(ER);
      case 8:
         return ep.Y();
      case 9:
         return H9.Y();
      case 10:
         return h;
      case 11:
         return Boolean.toString(_y);
      case 12:
         return Boolean.toString(eA);
      case 13:
         return Integer.toString(EG);
      case 14:
         return Integer.toString(_j);
      case 15:
         return Integer.toString(Ev);
      case 16:
         return Integer.toString(Kt);
      case 17:
         return Integer.toString(Kt);
      case 18:
         return Integer.toString(Kt);
      default:
         throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   public static void p(String var0) {
      h = var0;
      Ka.setProperty(gt.SHADER_PACK.D(), var0);
      nk();
   }

   public static void nk() {
      boolean var0 = eR;
      boolean var1 = l();
      eR = false;
      if(HT != null) {
         HT.B();
         HT = null;
         HP.clear();
         HV.clear();
         a = null;
         K2 = null;
         x = null;
         Ep = null;
         KP.J();
         V.J();
         Y.J();
         KE.J();
         g();
         eD = null;
      }

      boolean var2 = false;
      if(z9.SK()) {
         wr.H("Shaders can not be loaded, Antialiasing is enabled: " + z9.A() + "x");
         var2 = true;
      }

      if(z9.G()) {
         wr.H("Shaders can not be loaded, Anisotropic Filtering is enabled: " + z9.W() + "x");
         var2 = true;
      }

      if(z9.Z()) {
         wr.H("Shaders can not be loaded, Fast Render is enabled.");
         var2 = true;
      }

      String var3 = Ka.getProperty(gt.SHADER_PACK.D(), E0);
      if(!var3.isEmpty() && !var3.equals(e0)) {
         if(var3.equals(E0)) {
            HT = new _j();
            eR = true;
         } else {
            File var4 = new File(eP, var3);
            if(var4.isDirectory()) {
               HT = new b5(var3, var4);
               eR = true;
            } else if(var4.isFile() && var3.toLowerCase().endsWith(".zip")) {
               HT = new u5(var3, var4);
               eR = true;
            }
         }
      }

      if(HT != null) {
         wr.H("Loaded shaderpack: " + J());
      } else {
         wr.H("No shaderpack loaded.");
         HT = new dw();
      }

      y();
      w();
      a = V();
      b();
      boolean var9 = eR != var0;
      boolean var5 = l() != var1;
      x.h();
      if(i6.CD.l()) {
         i6.k.a((Object)null);
         i6.UJ.a((Object)null);
      }

      Z();
      F.m();
   }

   private static void w() {
      HV.clear();
      int var0 = -128;

      while(true) {
         String var1 = "/shaders/world" + var0;
         if(HT.P(var1)) {
            HV.add(Integer.valueOf(var0));
         }

         ++var0;
      }
   }

   private static void b() {
      KP.J();
      V.J();
      Y.J();
      KE.J();
      eb.J();
      He.J();
      ex.J();
      K9.J();
      HO.J();
      Kq.J();
      K5.J();
      KF.J();
      ee.J();
      ig.l();
      if(HT != null) {
         ig.g(HT);
         String var0 = "/shaders/shaders.properties";
         InputStream var1 = HT.b(var0);
      }
   }

   private static xv[] t(Properties var0, int var1) {
      String var2 = "texture." + R[var1] + ".";
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();

      for(Object var6 : var3) {
         String var7 = (String)var6;
         if(var7.startsWith(var2)) {
            String var8 = var7.substring(var2.length());
            var0.getProperty(var7).trim();
            int var10 = I(var1, var8);
            wr.t("Invalid texture name: " + var7);
         }
      }

      if(var4.size() <= 0) {
         return null;
      } else {
         xv[] var12 = (xv[])var4.toArray(new xv[var4.size()]);
         return var12;
      }
   }

   private static xv f(int var0, String var1) {
      return null;
   }

   private static int I(int var0, String var1) {
      if(var1.equals("texture")) {
         return 0;
      } else if(var1.equals("lightmap")) {
         return 1;
      } else if(var1.equals("normals")) {
         return 2;
      } else if(var1.equals("specular")) {
         return 3;
      } else if(!var1.equals("shadowtex0") && !var1.equals("watershadow")) {
         if(var1.equals("shadow")) {
            return Hq?5:4;
         } else if(var1.equals("shadowtex1")) {
            return 5;
         } else if(var1.equals("depthtex0")) {
            return 6;
         } else if(var1.equals("gaux1")) {
            return 7;
         } else if(var1.equals("gaux2")) {
            return 8;
         } else if(var1.equals("gaux3")) {
            return 9;
         } else if(var1.equals("gaux4")) {
            return 10;
         } else if(var1.equals("depthtex1")) {
            return 12;
         } else if(!var1.equals("shadowcolor0") && !var1.equals("shadowcolor")) {
            if(var1.equals("shadowcolor1")) {
               return 14;
            } else if(var1.equals("noisetex")) {
               return 15;
            } else {
               if(var0 == 1) {
                  if(var1.equals("colortex0") || var1.equals("colortex0")) {
                     return 0;
                  }

                  if(var1.equals("colortex1") || var1.equals("gdepth")) {
                     return 1;
                  }

                  if(var1.equals("colortex2") || var1.equals("gnormal")) {
                     return 2;
                  }

                  if(var1.equals("colortex3") || var1.equals("composite")) {
                     return 3;
                  }

                  if(var1.equals("shadowtex0") || var1.equals("watershadow")) {
                     return 4;
                  }

                  if(var1.equals("shadow")) {
                     return Hq?5:4;
                  }

                  if(var1.equals("shadowtex1")) {
                     return 5;
                  }

                  if(var1.equals("depthtex0") || var1.equals("gdepthtex")) {
                     return 6;
                  }

                  if(var1.equals("colortex4") || var1.equals("gaux1")) {
                     return 7;
                  }

                  if(var1.equals("colortex5") || var1.equals("gaux2")) {
                     return 8;
                  }

                  if(var1.equals("colortex6") || var1.equals("gaux3")) {
                     return 9;
                  }

                  if(var1.equals("colortex7") || var1.equals("gaux4")) {
                     return 10;
                  }

                  if(var1.equals("depthtex1")) {
                     return 11;
                  }

                  if(var1.equals("depthtex2")) {
                     return 12;
                  }

                  if(var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
                     return 13;
                  }

                  if(var1.equals("shadowcolor1")) {
                     return 14;
                  }

                  if(var1.equals("noisetex")) {
                     return 15;
                  }
               }

               return -1;
            }
         } else {
            return 13;
         }
      } else {
         return 4;
      }
   }

   private static void q(xv[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         xv var2 = var0[var1];
         d.t('蓀' + var2.A());
         t var3 = var2.Q();
         d.z(var3.L());
      }

   }

   private static void g() {
      h(t);
      h(Kg);
      t = null;
      Kg = null;
   }

   private static void h(xv[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         xv var2 = var0[var1];
         var2.e();
      }

   }

   public static uv[] q(String var0) {
      uv[] var1 = (uv[])a.clone();
      if(Ep == null) {
         if(x != null) {
            ui var10 = new ui(x, var1);
            var1 = (uv[])((uv[])z9.t(var1, var10, 0));
         }

         var1 = Q(var1);
         return var1;
      } else {
         String var2 = "screen." + var0;
         mj var3 = (mj)Ep.get(var2);
         return new uv[0];
      }
   }

   public static int V(String var0, int var1) {
      String var2 = "screen." + var0;
      if(Ep == null) {
         return var1;
      } else {
         mj var3 = (mj)Ep.get(var2);
         return var1;
      }
   }

   private static uv[] j(Map var0, uv[] var1) {
      HashSet var2 = new HashSet();

      for(String var4 : var0.keySet()) {
         mj var5 = (mj)var0.get(var4);
         uv[] var6 = var5.b();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            uv var8 = var6[var7];
            var2.add(var8.T());
         }
      }

      ArrayList var9 = new ArrayList();

      for(int var10 = 0; var10 < var1.length; ++var10) {
         uv var12 = var1[var10];
         if(var12.A()) {
            String var13 = var12.T();
            if(!var2.contains(var13)) {
               var9.add(var12);
            }
         }
      }

      uv[] var11 = (uv[])var9.toArray(new uv[var9.size()]);
      return var11;
   }

   public static uv s(String var0) {
      return xo.D(var0, a);
   }

   public static uv[] N() {
      return a;
   }

   public static boolean o(String var0) {
      return K2 != null && K2.contains(var0);
   }

   private static uv[] Q(uv[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         uv var3 = var0[var2];
         if(var3.A()) {
            var1.add(var3);
         }
      }

      uv[] var4 = (uv[])var1.toArray(new uv[var1.size()]);
      return var4;
   }

   public static void m() {
      O(a, HT);
   }

   private static void O(uv[] var0, rx var1) {
      Properties var2 = new Properties();
      if(a != null) {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            uv var4 = var0[var3];
            if(var4.M() && var4.q()) {
               var2.setProperty(var4.T(), var4.N());
            }
         }
      }

      v(var1, var2);
   }

   private static void v(rx var0, Properties var1) throws IOException {
      String var2 = b + "/" + var0.H() + ".txt";
      File var3 = new File(j.b().sn, var2);
      if(var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }

   }

   private static uv[] V() {
      uv[] var0 = rz.n(HT, E8, HV);
      Properties var1 = H(HT);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         uv var3 = var0[var2];
         String var4 = var1.getProperty(var3.T());
         var3.J();
         if(!var3.D(var4)) {
            z9.h("[Shaders] Invalid value, option: " + var3.T() + ", value: " + var4);
         }
      }

      return var0;
   }

   private static Properties H(rx var0) throws IOException {
      Properties var1 = new Properties();
      String var2 = b + "/" + var0.H() + ".txt";
      File var3 = new File(j.b().sn, var2);
      if(var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   public static uv[] B(uv[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         uv var3 = var0[var2];
         if(var3.q() && var3.M()) {
            var1.add(var3);
         }
      }

      uv[] var4 = (uv[])var1.toArray(new uv[var1.size()]);
      return var4;
   }

   private static String W(String var0, uv[] var1) {
      if(var1.length <= 0) {
         return var0;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            uv var3 = var1[var2];
            var3.T();
            if(var3.o(var0)) {
               var0 = var3.v();
               break;
            }
         }

         return var0;
      }
   }

   static ArrayList S() {
      ArrayList var0 = new ArrayList();
      var0.add(e0);
      var0.add(E0);
      if(!eP.exists()) {
         eP.mkdir();
      }

      File[] var1 = eP.listFiles();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         File var3 = var1[var2];
         String var4 = var3.getName();
         if(var3.isDirectory()) {
            File var5 = new File(var3, "shaders");
            if(var5.exists() && var5.isDirectory()) {
               var0.add(var4);
            }
         } else if(var3.isFile() && var4.toLowerCase().endsWith(".zip")) {
            var0.add(var4);
         }
      }

      return var0;
   }

   static String m(int var0) {
      String var1 = Integer.toString(var0);
      return Integer.parseInt(var1.substring(1, 3)) + "." + Integer.parseInt(var1.substring(3, 5)) + "." + Integer.parseInt(var1.substring(5));
   }

   static void P() {
   }

   public static int I(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT('赀');
      if(var1 != '賕') {
         System.err.format("FramebufferStatus 0x%04X at %s\n", new Object[]{Integer.valueOf(var1), var0});
      }

      return var1;
   }

   public static int r(String var0) {
      int var1 = GL11.glGetError();
      boolean var2 = false;
      if(var1 == 1286) {
         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT('赀');
         System.err.format("GL error 0x%04X: %s (Fb status 0x%04X) at %s\n", new Object[]{Integer.valueOf(var1), GLU.gluErrorString(var1), Integer.valueOf(var3), var0});
      } else {
         System.err.format("GL error 0x%04X: %s at %s\n", new Object[]{Integer.valueOf(var1), GLU.gluErrorString(var1), var0});
      }

      return var1;
   }

   public static int X(String var0, String var1) {
      int var2 = GL11.glGetError();
      System.err.format("GL error 0x%04x: %s at %s %s\n", new Object[]{Integer.valueOf(var2), GLU.gluErrorString(var2), var0, var1});
      return var2;
   }

   public static int Y(String var0, String var1, String var2) {
      int var3 = GL11.glGetError();
      System.err.format("GL error 0x%04x: %s at %s %s %s\n", new Object[]{Integer.valueOf(var3), GLU.gluErrorString(var3), var0, var1, var2});
      return var3;
   }

   private static void j(String var0) {
      F.y.I().G(new l(var0));
   }

   private static void x(String var0) {
      wr.S(var0);
      F.y.I().G(new l(var0));
   }

   public static void P(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
      int var3 = var1.limit();

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.append(" ").append(var1.get(var4));
      }

      var2.append("]");
      wr.H(var2.toString());
   }

   public static void h(j var0) {
      nT();
      F = var0;
      var0 = j.b();
      Ek = GLContext.getCapabilities();
      eU = GL11.glGetString(7938);
      B = GL11.glGetString(7936);
      ef = GL11.glGetString(7937);
      wr.H("ShadersMod version: 2.4.12");
      wr.H("OpenGL Version: " + eU);
      wr.H("Vendor: " + B);
      wr.H("Renderer: " + ef);
      wr.H("Capabilities: " + (Ek.OpenGL20?" 2.0 ":" - ") + (Ek.OpenGL21?" 2.1 ":" - ") + (Ek.OpenGL30?" 3.0 ":" - ") + (Ek.OpenGL32?" 3.2 ":" - ") + (Ek.OpenGL40?" 4.0 ":" - "));
      wr.H("GL_MAX_DRAW_BUFFERS: " + GL11.glGetInteger('蠤'));
      wr.H("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL11.glGetInteger('賟'));
      wr.H("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL11.glGetInteger('衲'));
      Kk = Ek.OpenGL30;
      n4();
   }

   private static String M(boolean var0) {
      return "Y";
   }

   public static void Z() {
      if(l()) {
         KO = 0.5F;
         er = 0.6F;
         W = 0.8F;
      } else {
         KO = 1.0F;
         er = 1.0F;
         W = 1.0F;
      }

   }

   public static boolean X() {
      return !ep.f()?ep.y():V.f() || V.y();
   }

   public static boolean E() {
      return Y.f() || Y.y();
   }

   public static boolean l() {
      return !H9.f()?H9.y():KE.f() || KE.y();
   }

   public static boolean s() {
      return !eb.r();
   }

   public static boolean M() {
      return !He.r();
   }

   public static boolean T() {
      return !ex.r();
   }

   public static boolean r() {
      return !K9.r();
   }

   public static boolean W() {
      return !HO.r();
   }

   public static boolean e(ac var0) {
      switch(null.Y[var0.ordinal()]) {
      case 1:
         return Kq.y();
      case 2:
         return K5.y();
      case 3:
         return KF.y();
      case 4:
         return ee.y();
      default:
         return false;
      }
   }

   public static void nu() {
      if(!Hm) {
         Hm = true;
         boolean var10000 = true;
      } else {
         boolean var13 = false;
      }

      if(!Ef) {
         r("Shaders.init pre");
         if(J() != null) {
            ;
         }

         if(!Ek.OpenGL20) {
            x("No OpenGL 2.0");
         }

         if(!Ek.GL_EXT_framebuffer_object) {
            x("No EXT_framebuffer_object");
         }

         KZ.position(0).limit(8);
         Kf.position(0).limit(16);
         Hb.position(0).limit(3);
         N.position(0).limit(8);
         K8.position(0).limit(2);
         KC.position(0).limit(8);
         H0 = 4;
         E5 = 1;
         K3 = 0;
         HM = 0;
         el = 1;
         EN = 1;
         Arrays.fill(e8, 6408);
         Arrays.fill(H7, true);
         Arrays.fill(Hk, false);
         Arrays.fill(EL, false);
         Arrays.fill(E7, false);
         Arrays.fill(HK, false);
         Arrays.fill(e2, false);
         Hf = false;
         KW = false;
         EA = 0.0F;
         eK = 2.0F;
         E = -1.0F;
         Kp = -1.0F;
         Ha = false;
         EY = false;
         f = false;
         KR = false;
         Hq = false;
         eF = false;
         Z();
         b8 var1 = xo.m(x, a, false);
         String var2 = "";
         if(KJ != null) {
            int var3 = KJ.F.L().M();
            if(HV.contains(Integer.valueOf(var3))) {
               var2 = "world" + var3 + "/";
            }
         }

         if(Kx) {
            L(new File(eP, "debug"));
         }

         int var11 = 0;

         while(true) {
            String var4 = E8[var11];
            if(var4.equals("")) {
               y[var11] = eV[var11] = 0;
               e6[var11] = null;
               KG[var11] = null;
               eJ[var11] = 0;
            } else {
               eX = null;
               T = null;
               eI = 0;
               String var5 = var2 + var4;
               if(var1.g(var5)) {
                  wr.H("Program disabled: " + var5);
                  var4 = "<disabled>";
                  var5 = var2 + var4;
               }

               String var6 = "/shaders/" + var5;
               int var7 = H(var11, var6 + ".vsh", var6 + ".fsh");
               wr.H("Program loaded: " + var5);
               y[var11] = eV[var11] = var7;
               e6[var11] = eX;
               KG[var11] = T;
               eJ[var11] = eI;
            }

            ++var11;
         }
      }

   }

   public static void Q() {
      ++EB;
      Ed = true;
      wr.H("Reset world renderers");
      F.o.n();
   }

   public static void M() {
      if(Ed) {
         Ed = false;
         wr.H("Reset model renderers");

         for(c var1 : F.N().k().values()) {
            if(var1 instanceof net.y0.l) {
               net.y0.l var2 = (net.y0.l)var1;
               f(var2.v());
            }
         }
      }

   }

   public static void f(net.y6.z var0) {
      for(Object var2 : var0.t) {
         if(var2 instanceof jb) {
            Q((jb)var2);
         }
      }

   }

   public static void Q(jb var0) {
      var0.g();
      if(var0.U != null) {
         int var1 = 0;

         for(int var2 = var0.U.size(); var1 < var2; ++var1) {
            Q((jb)var0.U.get(var1));
         }
      }

   }

   private static int H(int var0, String var1, String var2) {
      r("pre setupProgram");
      int var3 = ARBShaderObjects.glCreateProgramObjectARB();
      r("create");
      eZ = false;
      HR = false;
      _r = false;
      int var4 = O(var1);
      int var5 = P(var2);
      r("create");
      ARBShaderObjects.glDeleteObjectARB(var3);
      var3 = 0;
      return var3;
   }

   private static int O(String var0) {
      int var1 = ARBShaderObjects.glCreateShaderObjectARB('謱');
      return 0;
   }

   private static int P(String var0) {
      uv.l();
      int var2 = ARBShaderObjects.glCreateShaderObjectARB('謰');
      if(var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;
         var4 = new BufferedReader(new InputStreamReader(HT.b(var0)));
         uv[] var5 = B(a);
         ArrayList var6 = new ArrayList();
         if(var4 != null) {
            var4 = rz.M(var4, var0, HT, 0, var6, 0);
            String var7 = var4.readLine();
            var4.close();
            var7 = W(var7, var5);
            var3.append(var7).append('\n');
            b9 var8 = o_.D(var7);
            if(var8 != null) {
               label166: {
                  if(var8.l()) {
                     String var9 = var8.B();
                     int var10;
                     if((var10 = o_.N(var9)) >= 0) {
                        HM = Math.max(HM, var10 + 1);
                     }

                     if((var10 = o_.k(var9)) >= 0) {
                        K3 = Math.max(K3, var10 + 1);
                     }

                     if((var10 = o_.M(var9)) >= 0) {
                        E5 = Math.max(E5, var10 + 1);
                     }

                     if(var9.equals("gdepth") && e8[1] == 6408) {
                        e8[1] = '蠔';
                     }

                     if((var10 = o_.V(var9)) >= 0) {
                        H0 = Math.max(H0, var10 + 1);
                     }

                     if(var9.equals("centerDepthSmooth")) {
                        Hf = true;
                     }
                  }

                  if(!var8.S("shadowMapResolution") && !var8.m("SHADOWRES")) {
                     if(!var8.M("shadowMapFov") && !var8.m("SHADOWFOV")) {
                        if(!var8.M("shadowDistance") && !var8.m("SHADOWHPL")) {
                           if(var8.M("shadowDistanceRenderMul")) {
                              E = var8.Q();
                              wr.H("Shadow distance render mul: " + E);
                           }

                           if(var8.M("shadowIntervalSize")) {
                              eK = var8.Q();
                              wr.H("Shadow map interval size: " + eK);
                           }

                           if(var8.T("generateShadowMipmap", true)) {
                              Arrays.fill(EL, true);
                              wr.H("Generate shadow mipmap");
                           }

                           if(var8.T("generateShadowColorMipmap", true)) {
                              Arrays.fill(HK, true);
                              wr.H("Generate shadow color mipmap");
                           }

                           if(var8.T("shadowHardwareFiltering", true)) {
                              Arrays.fill(Hk, true);
                              wr.H("Hardware shadow filtering enabled.");
                           }

                           if(var8.T("shadowHardwareFiltering0", true)) {
                              Hk[0] = true;
                              wr.H("shadowHardwareFiltering0");
                           }

                           if(var8.T("shadowHardwareFiltering1", true)) {
                              Hk[1] = true;
                              wr.H("shadowHardwareFiltering1");
                           }

                           if(var8.a("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                              EL[0] = true;
                              wr.H("shadowtex0Mipmap");
                           }

                           if(var8.T("shadowtex1Mipmap", true)) {
                              EL[1] = true;
                              wr.H("shadowtex1Mipmap");
                           }

                           if(var8.a("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                              HK[0] = true;
                              wr.H("shadowcolor0Mipmap");
                           }

                           if(var8.a("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                              HK[1] = true;
                              wr.H("shadowcolor1Mipmap");
                           }

                           if(var8.M("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                              E7[0] = true;
                              wr.H("shadowtex0Nearest");
                           }

                           if(var8.a("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                              E7[1] = true;
                              wr.H("shadowtex1Nearest");
                           }

                           if(var8.M("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                              e2[0] = true;
                              wr.H("shadowcolor0Nearest");
                           }

                           if(var8.M("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                              e2[1] = true;
                              wr.H("shadowcolor1Nearest");
                           }

                           if(!var8.M("wetnessHalflife") && !var8.m("WETNESSHL")) {
                              if(!var8.M("drynessHalflife") && !var8.m("DRYNESSHL")) {
                                 if(var8.M("eyeBrightnessHalflife")) {
                                    n = var8.Q();
                                    wr.H("Eye brightness halflife: " + n);
                                 }

                                 if(var8.M("centerDepthHalflife")) {
                                    eO = var8.Q();
                                    wr.H("Center depth halflife: " + eO);
                                 }

                                 if(var8.M("sunPathRotation")) {
                                    EA = var8.Q();
                                    wr.H("Sun path rotation: " + EA);
                                 }

                                 if(var8.M("ambientOcclusionLevel")) {
                                    Kp = z9.r(var8.Q(), 0.0F, 1.0F);
                                    wr.H("AO Level: " + Kp);
                                 }

                                 if(var8.S("superSamplingLevel")) {
                                    int var16 = var8.E();
                                    if(var16 > 1) {
                                       wr.H("Super sampling level: " + var16 + "x");
                                       Kc = var16;
                                    }

                                    Kc = 1;
                                 }

                                 if(var8.S("noiseTextureResolution")) {
                                    Eu = var8.E();
                                    KW = true;
                                    wr.H("Noise texture enabled");
                                    wr.H("Noise texture resolution: " + Eu);
                                 }

                                 if(var8.v("Format")) {
                                    String var17 = wh.u(var8.B(), "Format");
                                    String var24 = var8.M();
                                    int var11 = Y(var17);
                                    int var12 = d(var24);
                                    if(var11 >= 0 && var12 != 0) {
                                       e8[var11] = var12;
                                       wr.w("%s format: %s", new Object[]{var17, var24});
                                    }
                                 }

                                 if(var8.W("Clear", false)) {
                                    if(!o_.W(var0)) {
                                       break label166;
                                    }

                                    String var18 = wh.u(var8.B(), "Clear");
                                    int var25 = Y(var18);
                                    H7[var25] = false;
                                    wr.w("%s clear disabled", new Object[]{var18});
                                 }

                                 if(var8.q("GAUX4FORMAT", "RGBA32F")) {
                                    e8[7] = '蠔';
                                    wr.H("gaux4 format : RGB32AF");
                                 }

                                 if(var8.q("GAUX4FORMAT", "RGB32F")) {
                                    e8[7] = '蠕';
                                    wr.H("gaux4 format : RGB32F");
                                 }

                                 if(var8.q("GAUX4FORMAT", "RGB16")) {
                                    e8[7] = '联';
                                    wr.H("gaux4 format : RGB16");
                                 }

                                 if(var8.W("MipmapEnabled", true)) {
                                    if(!o_.W(var0) && !o_.j(var0)) {
                                       break label166;
                                    }

                                    String var19 = wh.u(var8.B(), "MipmapEnabled");
                                    int var26 = Y(var19);
                                    if(var26 >= 0) {
                                       eI |= 1 << var26;
                                       wr.w("%s mipmap enabled", new Object[]{var19});
                                    }
                                 }

                                 if(!var8.m("DRAWBUFFERS")) {
                                    break label166;
                                 }

                                 String var20 = var8.M();
                                 if(o_.f(var20)) {
                                    eX = var20;
                                 }

                                 wr.t("Invalid draw buffers: " + var20);
                              }

                              KD = var8.Q();
                              wr.H("Dryness halflife: " + KD);
                           }

                           en = var8.Q();
                           wr.H("Wetness halflife: " + en);
                        }

                        Hw = var8.Q();
                        EO = true;
                        wr.H("Shadow map distance: " + Hw);
                     }

                     eT = var8.Q();
                     EO = false;
                     wr.H("Shadow map field of view: " + eT);
                  }

                  eu = S = var8.E();
                  ez = KM = Math.round((float)eu * _f);
                  wr.H("Shadow map resolution: " + eu);
               }
            }
         }

         if(Kx) {
            n(var0, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if(GL20.glGetShaderi(var2, '讁') != 1) {
            wr.S("Error compiling fragment shader: " + var0);
         }

         f(var2, var0, var6);
         return var2;
      }
   }

   private static void n(String var0, String var1) {
      File var2 = new File(eP, "debug/" + var0);
      var2.getParentFile().mkdirs();
      z9.S(var2, var1);
   }

   private static void L(File var0) {
      if(var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            File var3 = var1[var2];
            if(var3.isDirectory()) {
               L(var3);
            }

            var3.delete();
         }
      }

   }

   private static boolean d(int var0, String var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterARB(var0, '讄', var2);
      int var3 = var2.get();
      if(var3 > 1) {
         ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
         var2.flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
         byte[] var5 = new byte[var3];
         var4.get(var5);
         if(var5[var3 - 1] == 0) {
            var5[var3 - 1] = 10;
         }

         String var6 = new String(var5);
         wr.H("Info log: " + var1 + "\n" + var6);
         return false;
      } else {
         return true;
      }
   }

   private static boolean f(int var0, String var1, List var2) {
      BufferUtils.createIntBuffer(1);
      int var4 = GL20.glGetShaderi(var0, '讄');
      if(var4 <= 1) {
         return true;
      } else {
         for(int var5 = 0; var5 < var2.size(); ++var5) {
            String var6 = (String)var2.get(var5);
            wr.H("File: " + (var5 + 1) + " = " + var6);
         }

         String var7 = GL20.glGetShaderInfoLog(var0, var4);
         wr.H("Shader info log: " + var1 + "\n" + var7);
         return false;
      }
   }

   public static void W(IntBuffer var0) {
      var0 = ea;
      if(Ki != var0) {
         Ki = var0;
         GL20.glDrawBuffers(var0);
      }

   }

   public static void Y(int var0) {
      r("pre-useProgram");
      if(Hr) {
         var0 = 30;
         if(y[30] == 0) {
            Z = false;
            return;
         }
      }

      if(s != var0) {
         s = var0;
         ARBShaderObjects.glUseProgramObjectARB(y[var0]);
         if(y[var0] == 0) {
            Z = false;
         } else {
            if(X("useProgram ", E8[var0]) != 0) {
               y[var0] = 0;
            }

            IntBuffer var1 = EQ[var0];
            if(q) {
               W(var1);
               Y(E8[var0], " draw buffers = ", e6[var0]);
            }

            Ex = eJ[var0];
            EV.v(y[s]);
            Kh.v(y[s]);
            HW.v(y[s]);
            switch(var0) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 18:
            case 19:
            case 20:
               Z = true;
               A("texture", 0);
               A("lightmap", 1);
               A("normals", 2);
               A("specular", 3);
               A("shadow", Hq?5:4);
               A("watershadow", 4);
               A("shadowtex0", 4);
               A("shadowtex1", 5);
               A("depthtex0", 6);
               if(t != null) {
                  A("gaux1", 7);
                  A("gaux2", 8);
                  A("gaux3", 9);
                  A("gaux4", 10);
               }

               A("depthtex1", 12);
               A("shadowcolor", 13);
               A("shadowcolor0", 13);
               A("shadowcolor1", 14);
               A("noisetex", 15);
               break;
            case 14:
            case 15:
            case 17:
            default:
               Z = false;
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
               Z = false;
               A("gcolor", 0);
               A("gdepth", 1);
               A("gnormal", 2);
               A("composite", 3);
               A("gaux1", 7);
               A("gaux2", 8);
               A("gaux3", 9);
               A("gaux4", 10);
               A("colortex0", 0);
               A("colortex1", 1);
               A("colortex2", 2);
               A("colortex3", 3);
               A("colortex4", 7);
               A("colortex5", 8);
               A("colortex6", 9);
               A("colortex7", 10);
               A("shadow", Hq?5:4);
               A("watershadow", 4);
               A("shadowtex0", 4);
               A("shadowtex1", 5);
               A("gdepthtex", 6);
               A("depthtex0", 6);
               A("depthtex1", 11);
               A("depthtex2", 12);
               A("shadowcolor", 13);
               A("shadowcolor0", 13);
               A("shadowcolor1", 14);
               A("noisetex", 15);
               break;
            case 30:
            case 31:
            case 32:
               A("tex", 0);
               A("texture", 0);
               A("lightmap", 1);
               A("normals", 2);
               A("specular", 3);
               A("shadow", Hq?5:4);
               A("watershadow", 4);
               A("shadowtex0", 4);
               A("shadowtex1", 5);
               if(t != null) {
                  A("gaux1", 7);
                  A("gaux2", 8);
                  A("gaux3", 9);
                  A("gaux4", 10);
               }

               A("shadowcolor", 13);
               A("shadowcolor0", 13);
               A("shadowcolor1", 14);
               A("noisetex", 15);
            }

            ks var2 = F.sf != null?F.sf.S():null;
            y var3 = var2.Z();
            int var4 = -1;
            net.y9.l var5 = null;
            var4 = y.V.D(var3);
            var5 = (net.y9.l)net.y9.l.m.T(var4);
            int var6 = var5.S(var5.p());
            ks var7 = F.sf != null?F.sf.L():null;
            y var8 = var7.Z();
            int var9 = -1;
            net.y9.l var10 = null;
            var9 = y.V.D(var8);
            var10 = (net.y9.l)net.y9.l.m.T(var9);
            int var11 = var10.S(var10.p());
            if(X() && var11 > var6) {
               var4 = var9;
               var6 = var11;
            }

            A("heldItemId", var4);
            A("heldBlockLightValue", var6);
            A("heldItemId2", var9);
            A("heldBlockLightValue2", var11);
            A("fogMode", HH?r:0);
            A("fogColor", eN, Eb, ec);
            A("skyColor", eq, HE, ei);
            A("worldTime", (int)(_O % 24000L));
            A("worldDay", (int)(_O / 24000L));
            A("moonPhase", Hz);
            A("frameCounter", eY);
            i("frameTime", eH);
            i("frameTimeCounter", HU);
            i("sunAngle", Er);
            i("shadowAngle", EJ);
            i("rainStrength", Hj);
            i("aspectRatio", (float)Kw / (float)e3);
            i("viewWidth", (float)Kw);
            i("viewHeight", (float)e3);
            i("near", 0.05F);
            i("far", (float)(F.T.ij * 16));
            A("sunPosition", M[0], M[1], M[2]);
            A("moonPosition", KH[0], KH[1], KH[2]);
            A("shadowLightPosition", KB[0], KB[1], KB[2]);
            A("upPosition", H6[0], H6[1], H6[2]);
            A("previousCameraPosition", (float)HS, (float)L, (float)El);
            A("cameraPosition", (float)EH, (float)E2, (float)Ew);
            G("gbufferModelView", false, X);
            G("gbufferModelViewInverse", false, Hc);
            G("gbufferPreviousProjection", false, E9);
            G("gbufferProjection", false, eC);
            G("gbufferProjectionInverse", false, EC);
            G("gbufferPreviousModelView", false, E3);
            if(HM > 0) {
               G("shadowProjection", false, ED);
               G("shadowProjectionInverse", false, ed);
               G("shadowModelView", false, e1);
               G("shadowModelViewInverse", false, ET);
            }

            i("wetness", I);
            i("eyeAltitude", p);
            T("eyeBrightness", ej & '\uffff', ej >> 16);
            T("eyeBrightnessSmooth", Math.round(e5), Math.round(EF));
            T("terrainTextureSize", u[0], u[1]);
            A("terrainIconSize", H8);
            A("isEyeInWater", HX);
            i("nightVision", _b);
            i("blindness", Hg);
            i("screenBrightness", F.T.i2);
            A("hideGUI", F.T.h?1:0);
            i("centerDepthSmooth", Ht);
            T("atlasSize", EX, es);
            X("useProgram ", E8[var0]);
         }
      }

   }

   public static void A(String var0, int var1) {
      int var2 = y[s];
      int var3 = ARBShaderObjects.glGetUniformLocationARB(var2, var0);
      ARBShaderObjects.glUniform1iARB(var3, var1);
      X(E8[s], var0);
   }

   public static void T(String var0, int var1, int var2) {
      int var3 = y[s];
      int var4 = ARBShaderObjects.glGetUniformLocationARB(var3, var0);
      ARBShaderObjects.glUniform2iARB(var4, var1, var2);
      X(E8[s], var0);
   }

   public static void i(String var0, float var1) {
      int var2 = y[s];
      int var3 = ARBShaderObjects.glGetUniformLocationARB(var2, var0);
      ARBShaderObjects.glUniform1fARB(var3, var1);
      X(E8[s], var0);
   }

   public static void A(String var0, float var1, float var2, float var3) {
      int var4 = y[s];
      int var5 = ARBShaderObjects.glGetUniformLocationARB(var4, var0);
      ARBShaderObjects.glUniform3fARB(var5, var1, var2, var3);
      X(E8[s], var0);
   }

   public static void G(String var0, boolean var1, FloatBuffer var2) {
      int var3 = y[s];
      int var4 = ARBShaderObjects.glGetUniformLocationARB(var3, var0);
      ARBShaderObjects.glUniformMatrix4ARB(var4, var1, var2);
      X(E8[s], var0);
   }

   private static int Y(String var0) {
      return !var0.equals("colortex0") && !var0.equals("gcolor")?(!var0.equals("colortex1") && !var0.equals("gdepth")?(!var0.equals("colortex2") && !var0.equals("gnormal")?(!var0.equals("colortex3") && !var0.equals("composite")?(!var0.equals("colortex4") && !var0.equals("gaux1")?(!var0.equals("colortex5") && !var0.equals("gaux2")?(!var0.equals("colortex6") && !var0.equals("gaux3")?(!var0.equals("colortex7") && !var0.equals("gaux4")?-1:7):6):5):4):3):2):1):0;
   }

   private static int d(String var0) {
      var0 = var0.trim();

      for(int var1 = 0; var1 < HA.length; ++var1) {
         String var2 = HA[var1];
         if(var0.equals(var2)) {
            return Ea[var1];
         }
      }

      return 0;
   }

   private static void nF() {
      if(Kn == null && eD != null) {
         Kn = f(15, eD);
      }

      if(Kn == null) {
         Kn = new on(Eu, Eu);
      }

   }

   private static void nM() {
      Hi = new IdentityHashMap(300);
      if(Hi.isEmpty()) {
         for(net.yz.m_ var1 : net.y9.l.m.i()) {
            net.y9.l var2 = (net.y9.l)net.y9.l.m.B(var1);
            int var3 = net.y9.l.m.D(var2);
            Hi.put(var2, Integer.valueOf(var3));
         }
      }

      BufferedReader var7 = null;
      var7 = new BufferedReader(new InputStreamReader(HT.b("/mc_Entity_x.txt")));

      String var9;
      while((var9 = var7.readLine()) != null) {
         Matcher var10 = Ku.matcher(var9);
         if(var10.matches()) {
            String var11 = var10.group(1);
            String var4 = var10.group(2);
            int var5 = Integer.parseInt(var4);
            net.y9.l var6 = net.y9.l.d(var11);
            Hi.put(var6, Integer.valueOf(var5));
         } else {
            wr.f("unmatched %s\n", new Object[]{var9});
         }
      }

      var7.close();
   }

   private static IntBuffer w(IntBuffer var0) {
      int var1 = var0.limit();

      for(int var2 = var0.position(); var2 < var1; ++var2) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void t() {
      if(Ef) {
         r("Shaders.uninit pre");
         int var0 = 0;

         while(true) {
            if(eV[var0] != 0) {
               ARBShaderObjects.glDeleteObjectARB(eV[var0]);
               r("del programRef");
            }

            eV[var0] = 0;
            y[var0] = 0;
            e6[var0] = null;
            EQ[var0] = null;
            eJ[var0] = 0;
            ++var0;
         }
      }

   }

   public static void N() {
      HG = 0;
   }

   public static void nv() {
      K_ = true;
   }

   private static void H() {
      KU = F.sB;
      HG = F.st;
      Kw = Math.round((float)KU * c);
      e3 = Math.round((float)HG * c);
      l();
   }

   private static void J() {
      K_ = false;
      ez = Math.round((float)eu * _f);
      KM = Math.round((float)S * _f);
      nL();
   }

   private static void l() {
      if(HF != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(HF);
         d.H(Hb);
         d.H(Kf);
      }

      HF = EXTFramebufferObject.glGenFramebuffersEXT();
      GL11.glGenTextures((IntBuffer)Hb.clear().limit(E5));
      GL11.glGenTextures((IntBuffer)Kf.clear().limit(16));
      Hb.position(0);
      Kf.position(0);
      Kf.get(e).position(0);
      EXTFramebufferObject.glBindFramebufferEXT('赀', HF);
      GL20.glDrawBuffers(0);
      GL11.glReadBuffer(0);

      for(int var0 = 0; var0 < E5; ++var0) {
         d.z(Hb.get(var0));
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
         GL11.glTexParameteri(3553, '衋', 6409);
         GL11.glTexImage2D(3553, 0, 6402, Kw, e3, 0, 6402, 5126, (FloatBuffer)null);
      }

      EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '贀', 3553, Hb.get(0), 0);
      GL20.glDrawBuffers(KZ);
      GL11.glReadBuffer(0);
      r("FT d");

      for(int var2 = 0; var2 < H0; ++var2) {
         d.z(e[var2]);
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, e8[var2], Kw, e3, 0, '胡', '荧', (ByteBuffer)null);
         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var2, 3553, e[var2], 0);
         r("FT c");
      }

      for(int var3 = 0; var3 < H0; ++var3) {
         d.z(e[8 + var3]);
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexImage2D(3553, 0, e8[var3], Kw, e3, 0, '胡', '荧', (ByteBuffer)null);
         r("FT ca");
      }

      int var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT('赀');
      if(var4 == '賚') {
         x("[Shaders] Error: Failed framebuffer incomplete formats");

         for(int var1 = 0; var1 < H0; ++var1) {
            d.z(Kf.get(var1));
            GL11.glTexImage2D(3553, 0, 6408, Kw, e3, 0, '胡', '荧', (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var1, 3553, Kf.get(var1), 0);
            r("FT c");
         }

         var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT('赀');
         if(var4 == '賕') {
            wr.H("complete");
         }
      }

      d.z(0);
      if(var4 != '賕') {
         x("[Shaders] Error: Failed creating framebuffer! (Status " + var4 + ")");
      } else {
         wr.H("Framebuffer created.");
      }

   }

   private static void nL() {
      if(HM != 0) {
         if(HI != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(HI);
            d.H(K8);
            d.H(KC);
         }

         HI = EXTFramebufferObject.glGenFramebuffersEXT();
         EXTFramebufferObject.glBindFramebufferEXT('赀', HI);
         GL11.glDrawBuffer(0);
         GL11.glReadBuffer(0);
         GL11.glGenTextures((IntBuffer)K8.clear().limit(HM));
         GL11.glGenTextures((IntBuffer)KC.clear().limit(K3));
         K8.position(0);
         KC.position(0);

         for(int var0 = 0; var0 < HM; ++var0) {
            d.z(K8.get(var0));
            GL11.glTexParameterf(3553, 10242, 10496.0F);
            GL11.glTexParameterf(3553, 10243, 10496.0F);
            int var1 = E7[var0]?9728:9729;
            GL11.glTexParameteri(3553, 10241, var1);
            GL11.glTexParameteri(3553, 10240, var1);
            if(Hk[var0]) {
               GL11.glTexParameteri(3553, '行', '衎');
            }

            GL11.glTexImage2D(3553, 0, 6402, ez, KM, 0, 6402, 5126, (FloatBuffer)null);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '贀', 3553, K8.get(0), 0);
         r("FT sd");

         for(int var2 = 0; var2 < K3; ++var2) {
            d.z(KC.get(var2));
            GL11.glTexParameterf(3553, 10242, 10496.0F);
            GL11.glTexParameterf(3553, 10243, 10496.0F);
            int var4 = e2[var2]?9728:9729;
            GL11.glTexParameteri(3553, 10241, var4);
            GL11.glTexParameteri(3553, 10240, var4);
            GL11.glTexImage2D(3553, 0, 6408, ez, KM, 0, '胡', '荧', (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var2, 3553, KC.get(var2), 0);
            r("FT sc");
         }

         d.z(0);
         if(K3 > 0) {
            GL20.glDrawBuffers(N);
         }

         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT('赀');
         if(var3 != '賕') {
            x("[Shaders] Error: Failed creating shadow framebuffer! (Status " + var3 + ")");
         } else {
            wr.H("Shadow framebuffer created.");
         }
      }

   }

   public static void p(j var0, float var1, long var2) {
      r("pre beginRender");
      T(F.s8);
      F = var0;
      F.sl.K("init");
      Ec = F.s4;
      if(!Ef) {
         nu();
      }

      if(F.sB != KU || F.st != HG) {
         H();
      }

      if(K_) {
         J();
      }

      _O = F.s8.j();
      Ei = (_O - K1) % 24000L;
      if(Ei < 0L) {
         Ei += 24000L;
      }

      K1 = _O;
      Hz = F.s8.s();
      ++eY;
      if(eY >= 720720) {
         eY = 0;
      }

      Kb = System.currentTimeMillis();
      if(Hn == 0L) {
         Hn = Kb;
      }

      et = Kb - Hn;
      Hn = Kb;
      eH = (float)et / 1000.0F;
      HU += eH;
      HU %= 3600.0F;
      Hj = var0.s8.u(var1);
      float var4 = (float)et * 0.01F;
      float var5 = (float)Math.exp(Math.log(0.5D) * (double)var4 / (double)(I < Hj?KD:en));
      I = I * var5 + Hj * (1.0F - var5);
      net.ne.l var6 = F.A();
      EK = var6 instanceof a && ((a)var6).L();
      p = (float)var6.hS * var1 + (float)var6.F * (1.0F - var1);
      ej = var6.L();
      var5 = (float)et * 0.01F;
      float var7 = (float)Math.exp(Math.log(0.5D) * (double)var5 / (double)n);
      e5 = e5 * var7 + (float)(ej & '\uffff') * (1.0F - var7);
      EF = EF * var7 + (float)(ej >> 16) * (1.0F - var7);
      HX = 0;
      if(F.T.wR == 0 && !EK) {
         if(var6.A(net.y1.l.p)) {
            HX = 1;
         } else if(var6.A(net.y1.l.U)) {
            HX = 2;
         }
      }

      if(F.sf != null) {
         _b = 0.0F;
         if(F.sf.J(b.G)) {
            _b = z9.G().s4.r(F.sf, var1);
         }

         Hg = 0.0F;
         if(F.sf.J(b.T)) {
            int var8 = F.sf.b((f)b.T).S();
            Hg = z9.r((float)var8 / 20.0F, 0.0F, 1.0F);
         }
      }

      net.u.r var14 = F.s8.h(var6, var1);
      var14 = x7.X(var14, KJ, var6, var1);
      eq = (float)var14.p;
      HE = (float)var14.H;
      ei = (float)var14.a;
      ey = true;
      EM = false;
      KI = false;
      em = false;
      E4 = false;
      eg = false;
      if(HM >= 1) {
         d.t('蓄');
         d.z(K8.get(0));
         if(HM >= 2) {
            d.t('蓅');
            d.z(K8.get(1));
         }
      }

      d.t('蓀');

      for(int var10 = 0; var10 < H0; ++var10) {
         d.z(e[var10]);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
         d.z(e[8 + var10]);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      d.z(0);

      for(int var11 = 0; 4 + var11 < H0; ++var11) {
         d.t('蓇' + var11);
         d.z(Kf.get(4 + var11));
      }

      d.t('蓆');
      d.z(Hb.get(0));
      if(E5 >= 2) {
         d.t('蓋');
         d.z(Hb.get(1));
         if(E5 >= 3) {
            d.t('蓌');
            d.z(Hb.get(2));
         }
      }

      for(int var12 = 0; var12 < K3; ++var12) {
         d.t('蓍' + var12);
         d.z(KC.get(var12));
      }

      if(KW) {
         d.t('蓀' + Kn.A());
         d.z(Kn.q());
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      q(t);
      d.t('蓀');
      HS = EH;
      L = E2;
      El = Ew;
      E9.position(0);
      eC.position(0);
      E9.put(eC);
      E9.position(0);
      eC.position(0);
      E3.position(0);
      X.position(0);
      E3.put(X);
      E3.position(0);
      X.position(0);
      r("beginRender");
      be.u(Ec, 0, var1, var2);
      F.sl.N();
      EXTFramebufferObject.glBindFramebufferEXT('赀', HF);

      for(int var13 = 0; var13 < H0; ++var13) {
         KK[var13] = 0;
         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var13, 3553, e[var13], 0);
      }

      r("end beginRender");
   }

   private static void T(r var0) {
      if(KJ != var0) {
         r var1 = KJ;
         KJ = var0;
         int var2 = var1.F.L().M();
         int var3 = var0.F.L().M();
         boolean var4 = HV.contains(Integer.valueOf(var2));
         boolean var5 = HV.contains(Integer.valueOf(var3));
         t();
      }

   }

   public static void Y(int var0, float var1, long var2) {
      if(!Hr) {
         EXTFramebufferObject.glBindFramebufferEXT('赀', HF);
         GL11.glViewport(0, 0, Kw, e3);
         Ki = null;
         gh.J(l.t());
         Y(2);
         r("end beginRenderPass");
      }

   }

   public static void g(int var0, int var1, int var2, int var3) {
      d.q(true, true, true, true);
      if(Hr) {
         GL11.glViewport(0, 0, ez, KM);
      } else {
         GL11.glViewport(0, 0, Kw, e3);
         EXTFramebufferObject.glBindFramebufferEXT('赀', HF);
         q = true;
         d.a();
         d.B();
         W(ea);
         Y(2);
         r("beginRenderPass");
      }

   }

   public static int r(int var0) {
      r = var0;
      return var0;
   }

   public static void P(float var0, float var1, float var2) {
      eN = var0;
      Eb = var1;
      ec = var2;
   }

   public static void k(float var0, float var1, float var2, float var3) {
      d.O(var0, var1, var2, var3);
      O = var0;
      _0 = var1;
      j = var2;
   }

   public static void f() {
      if(Hr) {
         r("shadow clear pre");
         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '贀', 3553, K8.get(0), 0);
         GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL20.glDrawBuffers(EQ[30]);
         I("shadow clear");
         GL11.glClear(16640);
         r("shadow clear");
      } else {
         r("clear pre");
         if(H7[0]) {
            GL20.glDrawBuffers('賠');
            GL11.glClear(16384);
         }

         if(H7[1]) {
            GL20.glDrawBuffers('賡');
            GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glClear(16384);
         }

         for(int var0 = 2; var0 < H0; ++var0) {
            if(H7[var0]) {
               GL20.glDrawBuffers('賠' + var0);
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               GL11.glClear(16384);
            }
         }

         W(KZ);
         I("clear");
         r("clear");
      }

   }

   public static void k(float var0) {
      net.ne.l var1 = F.A();
      double var2 = var1.hL + (var1.b - var1.hL) * (double)var0;
      double var4 = var1.F + (var1.hS - var1.F) * (double)var0;
      double var6 = var1.A + (var1.hr - var1.A) * (double)var0;
      EH = var2;
      E2 = var4;
      Ew = var6;
      GL11.glGetFloat(2983, (FloatBuffer)eC.position(0));
      df.K((FloatBuffer)EC.position(0), (FloatBuffer)eC.position(0), HL, ES);
      eC.position(0);
      EC.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)X.position(0));
      df.K((FloatBuffer)Hc.position(0), (FloatBuffer)X.position(0), Kz, k);
      X.position(0);
      Hc.position(0);
      r("setCamera");
   }

   public static void Q(float var0) {
      net.ne.l var1 = F.A();
      double var2 = var1.hL + (var1.b - var1.hL) * (double)var0;
      double var4 = var1.F + (var1.hS - var1.F) * (double)var0;
      double var6 = var1.A + (var1.hr - var1.A) * (double)var0;
      EH = var2;
      E2 = var4;
      Ew = var6;
      GL11.glGetFloat(2983, (FloatBuffer)eC.position(0));
      df.K((FloatBuffer)EC.position(0), (FloatBuffer)eC.position(0), HL, ES);
      eC.position(0);
      EC.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)X.position(0));
      df.K((FloatBuffer)Hc.position(0), (FloatBuffer)X.position(0), Kz, k);
      X.position(0);
      Hc.position(0);
      GL11.glViewport(0, 0, ez, KM);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      if(EO) {
         GL11.glOrtho((double)(-Hw), (double)Hw, (double)(-Hw), (double)Hw, 0.05000000074505806D, 256.0D);
      } else {
         GLU.gluPerspective(eT, (float)ez / (float)KM, 0.05F, 256.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -100.0F);
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      P = F.s8.H(var0);
      Er = P < 0.75F?P + 0.25F:P - 0.75F;
      float var8 = P * -360.0F;
      float var9 = HD > 0.0F?var8 % HD - HD * 0.5F:0.0F;
      if((double)Er <= 0.5D) {
         GL11.glRotatef(var8 - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(EA, 1.0F, 0.0F, 0.0F);
         EJ = Er;
      } else {
         GL11.glRotatef(var8 + 180.0F - var9, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(EA, 1.0F, 0.0F, 0.0F);
         EJ = Er - 0.5F;
      }

      if(EO) {
         float var10 = eK;
         float var11 = var10 / 2.0F;
         GL11.glTranslatef((float)var2 % var10 - var11, (float)var4 % var10 - var11, (float)var6 % var10 - var11);
      }

      float var17 = Er * 6.2831855F;
      float var18 = (float)Math.cos((double)var17);
      float var12 = (float)Math.sin((double)var17);
      float var13 = EA * 6.2831855F;
      float var14 = var18;
      float var15 = var12 * (float)Math.cos((double)var13);
      float var16 = var12 * (float)Math.sin((double)var13);
      if((double)Er > 0.5D) {
         var14 = -var18;
         var15 = -var15;
         var16 = -var16;
      }

      KL[0] = var14;
      KL[1] = var15;
      KL[2] = var16;
      KL[3] = 0.0F;
      GL11.glGetFloat(2983, (FloatBuffer)ED.position(0));
      df.K((FloatBuffer)ed.position(0), (FloatBuffer)ED.position(0), Hd, EI);
      ED.position(0);
      ed.position(0);
      GL11.glGetFloat(2982, (FloatBuffer)e1.position(0));
      df.K((FloatBuffer)ET.position(0), (FloatBuffer)e1.position(0), Hy, KV);
      e1.position(0);
      ET.position(0);
      G("gbufferProjection", false, eC);
      G("gbufferProjectionInverse", false, EC);
      G("gbufferPreviousProjection", false, E9);
      G("gbufferModelView", false, X);
      G("gbufferModelViewInverse", false, Hc);
      G("gbufferPreviousModelView", false, E3);
      G("shadowProjection", false, ED);
      G("shadowProjectionInverse", false, ed);
      G("shadowModelView", false, e1);
      G("shadowModelViewInverse", false, ET);
      F.T.wR = 1;
      r("setCamera");
   }

   public static void B() {
      GL11.glRotatef(EA * 1.0F, 0.0F, 0.0F, 1.0F);
      r("preCelestialRotate");
   }

   public static void nb() {
      FloatBuffer var0 = eL;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(e7, 0, 16);
      df.p(M, e7, Eo);
      df.p(KH, e7, Kl);
      System.arraycopy(EJ == Er?M:KH, 0, KB, 0, 3);
      A("sunPosition", M[0], M[1], M[2]);
      A("moonPosition", KH[0], KH[1], KH[2]);
      A("shadowLightPosition", KB[0], KB[1], KB[2]);
      r("postCelestialRotate");
   }

   public static void nz() {
      FloatBuffer var0 = eL;
      var0.clear();
      GL11.glGetFloat(2982, var0);
      var0.get(e7, 0, 16);
      df.p(H6, e7, m);
      A("upPosition", H6[0], H6[1], H6[2]);
   }

   public static void k() {
      if(Kk) {
         for(int var0 = 0; var0 < H0; ++var0) {
            if((Ex & 1 << var0) != 0) {
               d.t('蓀' + Ky[var0]);
               GL11.glTexParameteri(3553, 10241, 9987);
               GL30.glGenerateMipmap(3553);
            }
         }

         d.t('蓀');
      }

   }

   public static void u() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex3f(0.0F, 0.0F, 0.0F);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex3f(1.0F, 0.0F, 0.0F);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex3f(1.0F, 1.0F, 0.0F);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex3f(0.0F, 1.0F, 0.0F);
      GL11.glEnd();
   }

   public static void q() {
      if(!Hr) {
         r("pre-renderCompositeFinal");
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, 0.0D, 1.0D);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         d.S();
         d.d();
         d.E();
         d.B();
         d.n(519);
         d.Y(false);
         d.i();
         if(HM >= 1) {
            d.t('蓄');
            d.z(K8.get(0));
            if(HM >= 2) {
               d.t('蓅');
               d.z(K8.get(1));
            }
         }

         for(int var0 = 0; var0 < H0; ++var0) {
            d.t('蓀' + Ky[var0]);
            d.z(e[var0]);
         }

         d.t('蓆');
         d.z(Hb.get(0));
         if(E5 >= 2) {
            d.t('蓋');
            d.z(Hb.get(1));
            if(E5 >= 3) {
               d.t('蓌');
               d.z(Hb.get(2));
            }
         }

         for(int var5 = 0; var5 < K3; ++var5) {
            d.t('蓍' + var5);
            d.z(KC.get(var5));
         }

         if(KW) {
            d.t('蓀' + Kn.A());
            d.z(Kn.q());
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
         }

         q(Kg);
         d.t('蓀');
         boolean var6 = true;

         for(int var1 = 0; var1 < H0; ++var1) {
            EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var1, 3553, e[8 + var1], 0);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '贀', 3553, Hb.get(0), 0);
         GL20.glDrawBuffers(KZ);
         r("pre-composite");
         int var7 = 0;

         while(true) {
            if(y[21 + var7] != 0) {
               Y(21 + var7);
               r(E8[21 + var7]);
               if(Ex != 0) {
                  k();
               }

               u();

               for(int var2 = 0; var2 < H0; ++var2) {
                  if(Kv[21 + var7][var2]) {
                     int var3 = KK[var2];
                     int var4 = KK[var2] = 8 - var3;
                     d.t('蓀' + Ky[var2]);
                     d.z(e[var4 + var2]);
                     EXTFramebufferObject.glFramebufferTexture2DEXT('赀', '賠' + var2, 3553, e[var3 + var2], 0);
                  }
               }

               d.t('蓀');
            }

            ++var7;
         }
      }

   }

   public static void C() {
      if(Hr) {
         r("shadow endRender");
      } else {
         if(!EM) {
            q();
         }

         ey = false;
         d.q(true, true, true, true);
         Y(0);
         net.y.u1.m();
         r("endRender end");
      }

   }

   public static void c() {
      H4 = true;
      HH = true;
      W(KZ);
      Y(5);
      y(-2, 0);
   }

   public static void K(net.u.r var0) {
      eq = (float)var0.p;
      HE = (float)var0.H;
      ei = (float)var0.a;
      A("skyColor", eq, HE, ei);
   }

   public static void O() {
      p var0 = net.y.r.f().k();
      float var1 = (float)(F.T.ij * 16);
      double var2 = (double)var1 * 0.9238D;
      double var4 = (double)var1 * 0.3826D;
      double var6 = -var4;
      double var8 = -var2;
      double var10 = 16.0D;
      double var12 = -E2;
      var0.m(7, x.y);
      var0.H(var6, var12, var8).W();
      var0.H(var6, var10, var8).W();
      var0.H(var8, var10, var6).W();
      var0.H(var8, var12, var6).W();
      var0.H(var8, var12, var6).W();
      var0.H(var8, var10, var6).W();
      var0.H(var8, var10, var4).W();
      var0.H(var8, var12, var4).W();
      var0.H(var8, var12, var4).W();
      var0.H(var8, var10, var4).W();
      var0.H(var6, var10, var4).W();
      var0.H(var6, var12, var4).W();
      var0.H(var6, var12, var4).W();
      var0.H(var6, var10, var4).W();
      var0.H(var4, var10, var2).W();
      var0.H(var4, var12, var2).W();
      var0.H(var4, var12, var2).W();
      var0.H(var4, var10, var2).W();
      var0.H(var2, var10, var4).W();
      var0.H(var2, var12, var4).W();
      var0.H(var2, var12, var4).W();
      var0.H(var2, var10, var4).W();
      var0.H(var2, var10, var6).W();
      var0.H(var2, var12, var6).W();
      var0.H(var2, var12, var6).W();
      var0.H(var2, var10, var6).W();
      var0.H(var4, var10, var8).W();
      var0.H(var4, var12, var8).W();
      var0.H(var4, var12, var8).W();
      var0.H(var4, var10, var8).W();
      var0.H(var6, var10, var8).W();
      var0.H(var6, var12, var8).W();
      net.y.r.f().p();
   }

   public static void nJ() {
      nz();
      GL11.glColor3f(eN, Eb, ec);
      O();
      GL11.glColor3f(eq, HE, ei);
   }

   public static void T() {
      H4 = false;
      W(KZ);
      Y(Km?3:2);
      K();
   }

   public static void r() {
      r("beginUpdateChunks1");
      I("beginUpdateChunks1");
      if(!Hr) {
         Y(7);
      }

      r("beginUpdateChunks2");
      I("beginUpdateChunks2");
   }

   public static void S() {
      r("endUpdateChunks1");
      I("endUpdateChunks1");
      if(!Hr) {
         Y(7);
      }

      r("endUpdateChunks2");
      I("endUpdateChunks2");
   }

   public static boolean H(net.nr.d var0) {
      if(!eR) {
         return true;
      } else {
         r("shouldRenderClouds");
         return Hr?ER:var0.im > 0;
      }
   }

   public static void n2() {
      HH = true;
      y(-3, 0);
      Y(6);
   }

   public static void L() {
      nt();
      K();
      Y(Km?3:2);
   }

   public static void z() {
      if(ey) {
         Y(16);
         M();
      }

   }

   public static void n(net.ne.l var0) {
      if(ey) {
         Y(16);
         p(var0);
      }

   }

   public static void p(net.ne.l var0) {
      if(ey && !Hr && Kh.y()) {
         int var1 = _a.X(var0);
         Kh.D(var1);
      }

   }

   public static void n7() {
      if(ey && y[18] != y[0]) {
         Y(18);
         d.m();
         d.d(516, 0.0F);
         d.D(770, 771);
      }

   }

   public static void v() {
      if(ey && y[18] != y[0]) {
         Y(16);
         d.d();
      }

   }

   public static void h() {
      if(ey) {
         Y(Km?3:2);
      }

   }

   public static void K(float var0, float var1, float var2, float var3) {
      if(ey && !Hr) {
         EV.h(var0, var1, var2, var3);
      }

   }

   public static void a() {
      if(ey) {
         gh.A(l);
         if(!Hr) {
            W(EW);
         }
      }

   }

   public static void p() {
      if(ey && !Hr) {
         W(EQ[16]);
      }

   }

   public static void U() {
      if(ey) {
         r("beginBlockEntities");
         Y(13);
      }

   }

   public static void b(net.ni.v var0) {
      if(ey) {
         r("nextBlockEntity");
         Y(13);
         Z(var0);
      }

   }

   public static void Z(net.ni.v var0) {
      if(ey && !Hr && HW.y()) {
         net.y9.l var1 = var0.a();
         int var2 = net.y9.l.h(var1);
         HW.D(var2);
      }

   }

   public static void nO() {
      if(ey) {
         r("endBlockEntities");
         Y(Km?3:2);
         gh.J(l.t());
      }

   }

   public static void D() {
      Y(3);
   }

   public static void X() {
      Y(2);
   }

   public static void A() {
      Y(3);
   }

   public static void E() {
      if(!Hr && Hf) {
         g.clear();
         GL11.glReadPixels(Kw / 2, e3 / 2, 1, 1, 6402, 5126, g);
         o = g.get(0);
         float var0 = (float)et * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5D) * (double)var0 / (double)eO);
         Ht = Ht * var1 + o * (1.0F - var1);
      }

   }

   public static void i() {
      if(!Hr) {
         if(E5 >= 3) {
            d.t('蓌');
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Kw, e3);
            d.t('蓀');
         }

         d.B();
         d.C();
         d.D(770, 771);
         d.m();
         Y(20);
      }

   }

   public static void d() {
      d.E();
      Y(3);
   }

   public static void nr() {
      if(E5 >= 2) {
         d.t('蓋');
         r("pre copy depth");
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Kw, e3);
         r("copy depth");
         d.t('蓀');
      }

      gh.J(l.t());
   }

   public static void G() {
      if(ey) {
         if(!Hr) {
            Y(12);
            d.C();
            d.Y(true);
         } else {
            d.Y(true);
         }
      }

   }

   public static void R() {
      if(ey) {
         if(Hr) {
            ;
         }

         Y(Km?3:2);
      }

   }

   public static void nN() {
      if(ey) {
         Y(1);
      }

   }

   public static void s() {
      if(ey) {
         Y(3);
      }

   }

   public static void nl() {
      if((double)H_ != 1.0D) {
         GL11.glScaled(1.0D, 1.0D, (double)H_);
      }

   }

   public static void x() {
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      Y(19);
      r("beginHand");
      I("beginHand");
   }

   public static void e() {
      r("pre endHand");
      I("pre endHand");
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      d.D(770, 771);
      r("endHand");
   }

   public static void no() {
      d.i();
      d.E();
   }

   public static void nB() {
   }

   public static void F(int var0) {
      GL11.glEnable(var0);
      if(var0 == 3553) {
         ny();
      } else if(var0 == 2912) {
         F();
      }

   }

   public static void d(int var0) {
      GL11.glDisable(var0);
      if(var0 == 3553) {
         n5();
      } else if(var0 == 2912) {
         nt();
      }

   }

   public static void u(int var0) {
      GL11.glEnable(var0);
      ny();
   }

   public static void r(int var0) {
      GL11.glDisable(var0);
      n5();
   }

   public static void w(int var0) {
      GL11.glEnable(var0);
      F();
   }

   public static void S(int var0) {
      GL11.glDisable(var0);
      nt();
   }

   public static void ny() {
      if(H4) {
         Y(5);
      } else if(s == 1) {
         Y(Km?3:2);
      }

   }

   public static void n5() {
      if(H4) {
         Y(4);
      } else if(s == 2 || s == 3) {
         Y(1);
      }

   }

   public static void o() {
      Y(1);
   }

   public static void nA() {
      Y(16);
   }

   public static void F() {
      HH = true;
      A("fogMode", r);
   }

   public static void nt() {
      HH = false;
      A("fogMode", 0);
   }

   public static void o(d.j var0) {
      d.G(var0);
      if(HH) {
         A("fogMode", var0.capabilityId);
      }

   }

   public static void t(int var0, int var1) {
      GL11.glFogi(var0, var1);
      if(var0 == 2917) {
         r = var1;
         if(HH) {
            A("fogMode", r);
         }
      }

   }

   public static void V() {
      Km = true;
      if(s == 2) {
         Y(3);
      }

   }

   public static void n() {
      Km = false;
      if(s == 3) {
         Y(2);
      }

   }

   public static int H() {
      return KA[D * 2];
   }

   public static int a() {
      return KA[D * 2 + 1];
   }

   public static int K(int var0) {
      KA[D * 2] = KA[D * 2] & '\uffff' | var0 << 16;
      return var0;
   }

   public static int I(int var0) {
      KA[D * 2 + 1] = KA[D * 2 + 1] & -65536 | var0 & '\uffff';
      return var0;
   }

   public static void y(int var0, int var1) {
      ++D;
      KA[D * 2] = var0 & '\uffff' | var1 << 16;
      KA[D * 2 + 1] = 0;
   }

   public static void D(int var0) {
      ++D;
      KA[D * 2] = var0 & '\uffff';
      KA[D * 2 + 1] = 0;
   }

   public static void v(net.y9.l var0) {
      ++D;
      int var1 = var0.o(var0.p()).ordinal();
      KA[D * 2] = net.y9.l.m.D(var0) & '\uffff' | var1 << 16;
      KA[D * 2 + 1] = 0;
   }

   public static void K() {
      KA[D * 2] = 0;
      KA[D * 2 + 1] = 0;
      --D;
   }

   public static void W() {
      F.sl.N();
   }

   public static String J() {
      return HT == null?null:(HT instanceof dw?null:HT.H());
   }

   public static InputStream K(String var0) {
      return HT == null?null:HT.b(var0);
   }

   public static void Y() {
      K += 2;
      K = K / 2 * 2;
      if(K > 4) {
         K = 0;
      }

      K = z9.C(K, 0, 4);
   }

   public static void nT() {
      Class.forName("shadersmod.transform.SMCClassTransformer");
      throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
   }

   public static void nm() {
      y();
   }

   private static void y() {
      HP = new HashMap();
      if(eR) {
         ArrayList var0 = new ArrayList();
         String var1 = "/shaders/lang/";
         String var2 = "en_US";
         String var3 = ".lang";
         var0.add(var1 + var2 + var3);
         if(!z9.d().wP.equals(var2)) {
            var0.add(var1 + z9.d().wP + var3);
         }

         for(String var5 : var0) {
            InputStream var6 = HT.b(var5);
            Properties var7 = new Properties();
            m8.o(var6, var7);
            var6.close();

            for(Object var9 : var7.keySet()) {
               String var10 = var7.getProperty((String)var9);
               HP.put((String)var9, var10);
            }
         }
      }

   }

   public static String N(String var0, String var1) {
      String var2 = (String)HP.get(var0);
      return var1;
   }

   public static boolean J(String var0) {
      return false;
   }

   public static void B(ks var0) {
      Kr = a(var0);
   }

   public static void k(ks var0) {
      eW = a(var0);
   }

   public static boolean L() {
      return Kr;
   }

   public static boolean b() {
      return eW;
   }

   public static boolean K() {
      return KI && em;
   }

   private static boolean a(ks var0) {
      return false;
   }

   public static boolean R(k var0) {
      return var0 == k.MAIN_HAND && E4?true:var0 == k.OFF_HAND && eg;
   }

   public static boolean o() {
      return !E4 && !eg;
   }

   public static void C(boolean var0, boolean var1) {
      E4 = var0;
      eg = var1;
   }

   public static void n(boolean var0, boolean var1) {
      KI = var0;
      em = var1;
   }

   public static boolean V() {
      return KI;
   }

   public static boolean H() {
      return em;
   }

   public static float G() {
      return E < 0.0F?-1.0F:Hw * E;
   }

   public static void m(boolean var0) {
      H5 = var0;
   }

   public static boolean R() {
      return H5;
   }

   public static void I() {
      if(ey) {
         Y(14);
      }

   }

   public static void n8() {
      if(ey) {
         Y(13);
      }

   }

   static {
      String[] var10000 = new String[]{"", "gbuffers_basic", "gbuffers_textured", "gbuffers_textured_lit", "gbuffers_skybasic", "gbuffers_skytextured", "gbuffers_clouds", "gbuffers_terrain", "gbuffers_terrain_solid", "gbuffers_terrain_cutout_mip", "gbuffers_terrain_cutout", "gbuffers_damagedblock", "gbuffers_water", "gbuffers_block", "gbuffers_beaconbeam", "gbuffers_item", "gbuffers_entities", "gbuffers_armor_glint", "gbuffers_spidereyes", "gbuffers_hand", "gbuffers_weather", "composite", "composite1", "composite2", "composite3", "composite4", "composite5", "composite6", "composite7", "final", "shadow", "shadow_solid", "shadow_cutout"};
      Hh = new File(j.b().sn, "shaders");
      eP = new File(j.b().sn, b);
      Hv = new File(j.b().sn, KT);
      ea.limit(0);
      EW.put('賠').position(0).limit(1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
