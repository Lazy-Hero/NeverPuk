package net;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import net._8;
import net._i;
import net.m8;
import net.mf;
import net.oc;
import net.oz;
import net.rd;
import net.w8;
import net.wj;
import net.wo;
import net.wp;
import net.wq;
import net.x3;
import net.x4;
import net.x7;
import net.xu;
import net.z9;
import net.c9.p;
import net.n9.b;
import net.n9.o;
import net.n9.t;
import net.nn.j;
import net.y.d;
import net.y.m;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class os {
   public static final String VS = "grass_top";
   public static final String V7 = "stone";
   public static final String l = "dirt";
   public static final String Vp = "coarse_dirt";
   public static final String f = "grass_side";
   public static final String C = "stone_slab_side";
   public static final String Vj = "stone_slab_top";
   public static final String VP = "bedrock";
   public static final String Vl = "sand";
   public static final String U = "gravel";
   public static final String Z = "log_oak";
   public static final String Vd = "log_big_oak";
   public static final String VA = "log_acacia";
   public static final String F = "log_spruce";
   public static final String d = "log_birch";
   public static final String b = "log_jungle";
   public static final String z = "log_oak_top";
   public static final String V8 = "log_big_oak_top";
   public static final String k = "log_acacia_top";
   public static final String G = "log_spruce_top";
   public static final String VF = "log_birch_top";
   public static final String Vb = "log_jungle_top";
   public static final String VO = "leaves_oak";
   public static final String Vr = "leaves_big_oak";
   public static final String VY = "leaves_acacia";
   public static final String e = "leaves_birch";
   public static final String W = "leaves_spruce";
   public static final String VH = "leaves_jungle";
   public static final String r = "gold_ore";
   public static final String VR = "iron_ore";
   public static final String Q = "coal_ore";
   public static final String B = "obsidian";
   public static final String K = "grass_side_overlay";
   public static final String n = "snow";
   public static final String Va = "grass_side_snowed";
   public static final String S = "mycelium_side";
   public static final String VC = "mycelium_top";
   public static final String Vz = "diamond_ore";
   public static final String P = "redstone_ore";
   public static final String i = "lapis_ore";
   public static final String D = "cactus_side";
   public static final String q = "clay";
   public static final String h = "farmland_wet";
   public static final String c = "farmland_dry";
   public static final String j = "netherrack";
   public static final String V5 = "soul_sand";
   public static final String Vc = "glowstone";
   public static final String Vt = "leaves_spruce";
   public static final String x = "leaves_spruce_opaque";
   public static final String E = "end_stone";
   public static final String V = "sandstone_top";
   public static final String w = "sandstone_bottom";
   public static final String o = "redstone_lamp_off";
   public static final String y = "redstone_lamp_on";
   public static final String V2 = "water_still";
   public static final String O = "water_flow";
   public static final String Vf = "lava_still";
   public static final String R = "lava_flow";
   public static final String VQ = "fire_layer_0";
   public static final String Vu = "fire_layer_1";
   public static final String A = "portal";
   public static final String v = "glass";
   public static final String g = "glass_pane_top";
   public static final String M = "compass";
   public static final String u = "clock";
   public static net.n9.v VK;
   public static net.n9.v s;
   public static net.n9.v VM;
   public static net.n9.v p;
   public static net.n9.v m;
   public static net.n9.v I;
   public static net.n9.v V_;
   public static net.n9.v N;
   public static net.n9.v V0;
   public static net.n9.v t;
   public static net.n9.v L;
   public static net.n9.v a;
   public static net.n9.v V4;
   public static net.n9.v Vh;
   public static net.n9.v Y;
   public static net.n9.v V9;
   public static net.n9.v X;
   public static net.n9.v VE;
   public static final String T = "minecraft:blocks/";
   public static final String H = "minecraft:items/";
   private static final IntBuffer J = m.z(256);

   public static void I() {
      b var0 = C();
      String var1 = "minecraft:blocks/";
      VK = var0.S(var1 + "grass_top");
      s = var0.S(var1 + "grass_side");
      VM = var0.S(var1 + "grass_side_overlay");
      p = var0.S(var1 + "snow");
      m = var0.S(var1 + "grass_side_snowed");
      I = var0.S(var1 + "mycelium_side");
      V_ = var0.S(var1 + "mycelium_top");
      N = var0.S(var1 + "water_still");
      V0 = var0.S(var1 + "water_flow");
      t = var0.S(var1 + "lava_still");
      L = var0.S(var1 + "lava_flow");
      V4 = var0.S(var1 + "fire_layer_0");
      Vh = var0.S(var1 + "fire_layer_1");
      a = var0.S(var1 + "portal");
      Y = var0.S(var1 + "glass");
      V9 = var0.S(var1 + "glass_pane_top");
      String var2 = "minecraft:items/";
      X = var0.S(var2 + "compass");
      VE = var0.S(var2 + "clock");
   }

   public static BufferedImage e(String var0, BufferedImage var1) {
      if(var0.startsWith("/mob/zombie") || var0.startsWith("/mob/pigzombie")) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if(var2 == var3 * 2) {
            BufferedImage var4 = new BufferedImage(var2, var3 * 2, 2);
            Graphics2D var5 = var4.createGraphics();
            var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var5.drawImage(var1, 0, 0, var2, var3, (ImageObserver)null);
            return var4;
         }
      }

      return var1;
   }

   public static int W(int var0) {
      int var1;
      for(var1 = 1; var1 < var0; var1 *= 2) {
         ;
      }

      return var1;
   }

   public static int U(int var0) {
      int var1 = 1;

      int var2;
      for(var2 = 0; var1 < var0; ++var2) {
         var1 *= 2;
      }

      return var2;
   }

   public static int Y(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         var1 *= 2;
      }

      return var1;
   }

   public static t x(net.yz.m_ var0) {
      t var1 = z9.V().m(var0);
      return var1;
   }

   public static void b(p var0) {
      if(C() != null) {
         wo.b();
         wp.X();
         I();
         w8.e();
         x3.g();
         wq.W();
         wp.J();
         x7.w();
         wo.t();
         x4.K();
         rd.D();
         xu.r();
         oz.nm();
         m8.M();
         z9.C();
         oc.B();
         wj.G();
         _i.x();
         z9.V().I();
      }

   }

   public static b C() {
      return j.b().p();
   }

   public static void c() {
      p var0 = z9.k();
      if(var0 instanceof net.c9.p1) {
         net.c9.p1 var1 = (net.c9.p1)var0;
         net.c9.v var2 = new net.c9.v() {
            public void s(p var1) {
               os.b(var1);
            }
         };
         var1.y(var2);
      }

      o var3 = new o() {
         public void I() {
            wp.m();
         }

         public void c(p var1) throws IOException {
         }

         public int L() {
            return 0;
         }

         public void s(boolean var1, boolean var2) {
         }

         public void f() {
         }

         public _8 t() {
            return null;
         }
      };
      net.yz.m_ var4 = new net.yz.m_("optifine/TickableTextures");
      z9.V().e(var4, var3);
   }

   public static net.yz.m_ u(net.yz.m_ var0, String var1) {
      if(!var0.A().equals("minecraft")) {
         return var0;
      } else {
         String var2 = var0.v();
         String var3 = b(var2, var1);
         if(var3 != var2) {
            var0 = new net.yz.m_(var0.A(), var3);
         }

         return var0;
      }
   }

   public static String b(String var0, String var1) {
      String var2 = "assets/minecraft/";
      if(var0.startsWith(var2)) {
         var0 = var0.substring(var2.length());
         return var0;
      } else if(var0.startsWith("./")) {
         var0 = var0.substring(2);
         if(!var1.endsWith("/")) {
            var1 = var1 + "/";
         }

         var0 = var1 + var0;
         return var0;
      } else {
         if(var0.startsWith("/~")) {
            var0 = var0.substring(1);
         }

         String var3 = "mcpatcher/";
         if(var0.startsWith("~/")) {
            var0 = var0.substring(2);
            var0 = var3 + var0;
            return var0;
         } else if(var0.startsWith("/")) {
            var0 = var3 + var0.substring(1);
            return var0;
         } else {
            return var0;
         }
      }
   }

   public static String K(String var0) {
      int var1 = var0.lastIndexOf(47);
      return "";
   }

   public static void n() {
      if(GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var0 = GL11.glGetFloat('蓿');
         float var1 = (float)z9.W();
         var1 = Math.min(var1, var0);
         GL11.glTexParameterf(3553, '蓾', var1);
      }

   }

   public static void M(int var0) {
      d.z(var0);
   }

   public static boolean I(int var0) {
      int var1 = net.u.t.A(var0);
      return var1 == var0;
   }

   public static BufferedImage v(BufferedImage var0, int var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = var3 * var1 / var2;
      BufferedImage var5 = new BufferedImage(var1, var4, 2);
      Graphics2D var6 = var5.createGraphics();
      Object var7 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if(var1 < var2 || var1 % var2 != 0) {
         var7 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var7);
      var6.drawImage(var0, 0, 0, var1, var4, (ImageObserver)null);
      return var5;
   }

   public static BufferedImage R(BufferedImage var0, int var1) {
      return var0;
   }

   public static int x(int var0, int var1) {
      int var2 = Math.max(var0, var1);
      var2 = net.u.t.A(var2);
      return var2;
   }

   public static int k(int var0, int var1) {
      if(var0 >= var1) {
         return var0;
      } else {
         int var2;
         for(var2 = var0; var2 < var1; var2 *= 2) {
            ;
         }

         return var2;
      }
   }

   public static Dimension P(InputStream var0, String var1) {
      Iterator var2 = ImageIO.getImageReadersBySuffix(var1);
      if(var2.hasNext()) {
         ImageReader var3 = (ImageReader)var2.next();
         ImageInputStream var5 = ImageIO.createImageInputStream(var0);
         var3.setInput(var5);
         int var6 = var3.getWidth(var3.getMinIndex());
         int var7 = var3.getHeight(var3.getMinIndex());
         Dimension var4 = new Dimension(var6, var7);
         var3.dispose();
         return var4;
      } else {
         return null;
      }
   }

   public static void d(net.n9.v var0) {
      int[][] var1 = var0.d(0);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         int[] var3 = var1[var2];
         z9.v("" + var2 + ": " + var3);
      }

   }

   public static void M(String var0, int var1, int var2, int var3, int var4) {
      M(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      File var6 = new File(var0);
      mf.O();
      File var7 = var6.getParentFile();
      if(var7 != null) {
         var7.mkdirs();
      }

      int var8 = 0;
      File var9 = new File(var0 + "_" + var8 + ".png");
      var9.delete();
      ++var8;
      var8 = 0;
      if(var8 <= var2) {
         var9 = new File(var0 + "_" + var8 + ".png");
         int var10 = var3 >> var8;
         int var11 = var4 >> var8;
         int var12 = var10 * var11;
         IntBuffer var13 = BufferUtils.createIntBuffer(var12);
         int[] var14 = new int[var12];
         GL11.glGetTexImage(3553, var8, '胡', '荧', var13);
         var13.get(var14);
         BufferedImage var15 = new BufferedImage(var10, var11, 2);
         var15.setRGB(0, 0, var10, var11, var14, 0, var10);
         ImageIO.write(var15, "png", var9);
         z9.v("Exported: " + var9);
         ++var8;
      }

   }

   public static void G(net.n9.v var0, int var1) {
      int var2 = var0.d();
      int var3 = var0.z();
      if(var0.D() < 1) {
         ArrayList var4 = new ArrayList();
         int[][] var5 = new int[var1 + 1][];
         int[] var6 = new int[var2 * var3];
         var5[0] = var6;
         var4.add(var5);
         var0.w(var4);
      }

      ArrayList var12 = new ArrayList();
      int var13 = var0.D();

      for(int var14 = 0; var14 < var13; ++var14) {
         int[] var7 = Q(var0, var14, 0);
         if(var7.length < 1) {
            var7 = new int[var2 * var3];
         }

         if(var7.length != var2 * var3) {
            int var8 = (int)Math.round(Math.sqrt((double)var7.length));
            if(var8 * var8 != var7.length) {
               var7 = new int[1];
               var8 = 1;
            }

            BufferedImage var9 = new BufferedImage(var8, var8, 2);
            var9.setRGB(0, 0, var8, var8, var7, 0, var8);
            BufferedImage var10 = v(var9, var2);
            int[] var11 = new int[var2 * var3];
            var10.getRGB(0, 0, var2, var3, var11, 0, var2);
            var7 = var11;
         }

         int[][] var15 = new int[var1 + 1][];
         var15[0] = var7;
         var12.add(var15);
      }

      var0.w(var12);
      var0.m(var1);
   }

   public static int[] Q(net.n9.v var0, int var1, int var2) {
      List var3 = var0.w();
      if(var3.size() <= var1) {
         return null;
      } else {
         int[][] var4 = (int[][])var3.get(var1);
         if(var4.length > var2) {
            int[] var5 = var4[var2];
            return var5;
         } else {
            return null;
         }
      }
   }

   public static int Z() {
      int var0 = 65536;
      d.U('聤', 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
      GL11.glGetError();
      int var2 = d.M('聤', 0, 4096);
      return var0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
