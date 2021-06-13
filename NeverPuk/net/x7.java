package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import net._a;
import net._c;
import net._f;
import net.g3;
import net.i6;
import net.mf;
import net.o8;
import net.os;
import net.w3;
import net.wh;
import net.xn;
import net.z9;
import net.n0.ks;
import net.n0.kw;
import net.n0.yv;
import net.nb.f;
import net.nb.x;
import net.ns.i;
import net.u.j;
import net.u.r;
import net.y9.l;
import net.ym.t;
import net.yv.h;
import net.yw.n;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class x7 {
   private static String r = "vanilla";
   private static w3 A = null;
   private static w3 R = null;
   private static w3 v = null;
   private static w3 h = null;
   private static w3 y = null;
   private static w3[] F = null;
   private static w3[][] uD = (w3[][])null;
   private static w3 d = null;
   private static final o8 g = new o8();
   private static w3 H = null;
   private static final o8 t = new o8();
   private static w3 a = null;
   private static final o8 p = new o8();
   private static w3 m = null;
   private static final o8 T = new o8();
   private static w3[] S = null;
   private static int w = 0;
   private static final float[][] c = new float[16][3];
   private static final float[][] j = new float[16][3];
   private static w3 k = null;
   private static w3 i = null;
   private static int J = -1;
   private static w3 P = null;
   private static w3 X = null;
   private static w3 W = null;
   private static w3 f = null;
   private static w3 N = null;
   private static boolean B = true;
   private static int n = -1;
   private static int s = -1;
   private static int E = -1;
   private static int x = -1;
   private static int b = -1;
   private static int C = -1;
   private static r I = null;
   private static r u = null;
   private static r z = null;
   private static int[] Q = null;
   private static int[] o = null;
   private static float[][] K = (float[][])null;
   private static float[][] Z = (float[][])null;
   private static int[] e = null;
   private static int[] D = null;
   private static int[] q = null;
   private static final n M = f.dl.p();
   private static final n G = f.uM.p();
   public static Random L = new Random();
   private static final x7.d O = new x7.d() {
      public int U(n var1, net.yv.o8 var2, j var3) {
         mf.O();
         i var5 = x7.M(var2, var3);
         return x7.y != null && var5 == x.dQ?x7.y.W(var5, var3):var5.r(var3);
      }

      public boolean k() {
         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final x7.d Y = new x7.d() {
      public int U(n var1, net.yv.o8 var2, j var3) {
         mf.O();
         i var5 = x7.M(var2, var3);
         return x7.h != null && var5 == x.dQ?x7.h.W(var5, var3):var5.d(var3);
      }

      public boolean k() {
         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final x7.d l = new x7.d() {
      public int U(n var1, net.yv.o8 var2, j var3) {
         String var4 = mf.O();
         return x7.R != null?x7.R.F(var2, var3):net.yv.v.D();
      }

      public boolean k() {
         return x7.R == null;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final x7.d U = new x7.d() {
      public int U(n var1, net.yv.o8 var2, j var3) {
         String var4 = mf.O();
         return x7.v != null?x7.v.F(var2, var3):net.yv.v.H();
      }

      public boolean k() {
         return x7.v == null;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final x7.d V = new x7.d() {
      public int U(n var1, net.yv.o8 var2, j var3) {
         mf.O();
         i var5 = x7.M(var2, var3);
         return x7.A != null?x7.A.W(var5, var3):(i6.MA.r()?i6.B(var5, i6.MA, new Object[0]):var5.A());
      }

      public boolean k() {
         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public static void w() {
      mf.O();
      r = "vanilla";
      A = null;
      v = null;
      R = null;
      y = null;
      h = null;
      d = null;
      H = null;
      a = null;
      m = null;
      k = null;
      i = null;
      J = -1;
      P = null;
      X = null;
      N = null;
      S = null;
      n = -1;
      s = -1;
      E = -1;
      x = -1;
      b = -1;
      C = -1;
      I = null;
      u = null;
      z = null;
      F = null;
      uD = (w3[][])null;
      B = true;
      Q = null;
      o = null;
      K = (float[][])null;
      Z = (float[][])null;
      e = null;
      p(D);
      q = null;
      r = K("mcpatcher/color.properties", "palette.format", w3.r, "vanilla");
      String var1 = "mcpatcher/colormap/";
      String[] var2 = new String[]{"water.png", "watercolorX.png"};
      A = j(var1, var2, 256, 256);
      Z();
      if(z9.v()) {
         String[] var3 = new String[]{"pine.png", "pinecolor.png"};
         R = j(var1, var3, 256, 256);
         String[] var4 = new String[]{"birch.png", "birchcolor.png"};
         v = j(var1, var4, 256, 256);
         String[] var5 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         y = j(var1, var5, 256, 256);
         String[] var6 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         h = j(var1, var6, 256, 256);
         String[] var7 = new String[]{"sky0.png", "skycolor0.png"};
         d = j(var1, var7, 256, 256);
         String[] var8 = new String[]{"fog0.png", "fogcolor0.png"};
         H = j(var1, var8, 256, 256);
         String[] var9 = new String[]{"underwater.png", "underwatercolor.png"};
         a = j(var1, var9, 256, 256);
         String[] var10 = new String[]{"underlava.png", "underlavacolor.png"};
         m = j(var1, var10, 256, 256);
         String[] var11 = new String[]{"redstone.png", "redstonecolor.png"};
         k = j(var1, var11, 16, 1);
         i = b(var1 + "xporb.png", -1, -1);
         P = b(var1 + "durability.png", -1, -1);
         String[] var12 = new String[]{"stem.png", "stemcolor.png"};
         X = j(var1, var12, 8, 1);
         f = b(var1 + "pumpkinstem.png", 8, 1);
         W = b(var1 + "melonstem.png", 8, 1);
         String[] var13 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         N = j(var1, var13, -1, -1);
         Pair var14 = m();
         S = (w3[])var14.getLeft();
         w = ((Integer)var14.getRight()).intValue();
         P("mcpatcher/color.properties");
         uD = k(new String[]{var1 + "custom/", var1 + "blocks/"}, F, 256, 256);
         Z();
      }

   }

   private static String K(String var0, String var1, String[] var2, String var3) {
      net.yz.m_ var4 = new net.yz.m_(var0);
      InputStream var5 = z9.I(var4);
      return var3;
   }

   private static Pair m() {
      String var0 = "mcpatcher/lightmap/world";
      String var1 = ".png";
      String[] var2 = g3.S(var0, var1);
      HashMap var3 = new HashMap();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         String var6 = wh.F(var5, var0, var1);
         int var7 = z9.F(var6, Integer.MIN_VALUE);
         if(var7 == Integer.MIN_VALUE) {
            w("Invalid dimension ID: " + var6 + ", path: " + var5);
         } else {
            var3.put(Integer.valueOf(var7), var5);
         }
      }

      Set var15 = var3.keySet();
      Integer[] var16 = (Integer[])var15.toArray(new Integer[var15.size()]);
      Arrays.sort(var16);
      if(var16.length <= 0) {
         return new ImmutablePair((Object)null, Integer.valueOf(0));
      } else {
         int var17 = var16[0].intValue();
         int var18 = var16[var16.length - 1].intValue();
         int var8 = var18 - var17 + 1;
         w3[] var9 = new w3[var8];

         for(int var10 = 0; var10 < var16.length; ++var10) {
            Integer var11 = var16[var10];
            String var12 = (String)var3.get(var11);
            w3 var13 = b(var12, -1, -1);
            if(var13.h() < 16) {
               w("Invalid lightmap width: " + var13.h() + ", path: " + var12);
            } else {
               int var14 = var11.intValue() - var17;
               var9[var14] = var13;
            }
         }

         return new ImmutablePair(var9, Integer.valueOf(var17));
      }
   }

   private static int r(String var0, int var1) {
      InputStream var2 = z9.I(new net.yz.m_(var0));
      return var1;
   }

   private static void P(String var0) {
      net.yz.m_ var1 = new net.yz.m_(var0);
      InputStream var2 = z9.I(var1);
   }

   private static w3[] T(Properties var0, String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = "palette.block.";
      HashMap var4 = new HashMap();

      for(Object var6 : var0.keySet()) {
         String var7 = var0.getProperty((String)var6);
         if(((String)var6).startsWith(var3)) {
            var4.put(var6, var7);
         }
      }

      String[] var16 = (String[])((String[])var4.keySet().toArray(new String[var4.size()]));

      for(int var17 = 0; var17 < var16.length; ++var17) {
         String var19 = var16[var17];
         String var8 = var0.getProperty(var19);
         D("Block palette: " + var19 + " = " + var8);
         String var9 = var19.substring(var3.length());
         String var10 = os.K(var1);
         var9 = os.b(var9, var10);
         w3 var11 = b(var9, 256, 256);
         w("Colormap not found: " + var9);
      }

      if(var2.size() <= 0) {
         return null;
      } else {
         w3[] var18 = (w3[])((w3[])var2.toArray(new w3[var2.size()]));
         return var18;
      }
   }

   private static w3[][] k(String[] var0, w3[] var1, int var2, int var3) {
      String[] var4 = g3.r(var0, new String[]{".properties"});
      Arrays.sort(var4);
      ArrayList var5 = new ArrayList();

      for(int var6 = 0; var6 < var4.length; ++var6) {
         String var7 = var4[var6];
         D("Block colormap: " + var7);
         net.yz.m_ var8 = new net.yz.m_("minecraft", var7);
         InputStream var9 = z9.I(var8);
         w("File not found: " + var7);
      }

      for(int var12 = 0; var12 < var1.length; ++var12) {
         w3 var14 = var1[var12];
         I(var14, var5);
      }

      if(var5.size() <= 0) {
         return (w3[][])null;
      } else {
         w3[][] var13 = U(var5);
         return var13;
      }
   }

   private static void I(w3 var0, List var1) {
      int[] var2 = var0.v();
      if(var2.length > 0) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            w("Invalid block ID: " + var4);
         }
      } else {
         w("No match blocks: " + z9.n(var2));
      }

   }

   private static void g(w3 var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      List var3 = (List)var1.get(var2);
      ArrayList var4 = new ArrayList();
      var1.set(var2, var4);
      var4.add(var0);
   }

   private static w3[][] U(List var0) {
      w3[][] var1 = new w3[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         w3[] var4 = (w3[])((w3[])var3.toArray(new w3[var3.size()]));
         var1[var2] = var4;
      }

      return var1;
   }

   private static int h(Properties var0, String[] var1) {
      byte var2 = 0;
      if(var2 < var1.length) {
         String var3 = var1[var2];
         int var4 = X(var0, var3);
         return var4;
      } else {
         return -1;
      }
   }

   private static int X(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      return -1;
   }

   private static int p(String var0) {
      return -1;
   }

   private static r O(Properties var0, String var1) {
      int var2 = X(var0, var1);
      return null;
   }

   private static w3 j(String var0, String[] var1, int var2, int var3) {
      byte var4 = 0;
      if(var4 < var1.length) {
         String var5 = var1[var4];
         var5 = var0 + var5;
         w3 var6 = b(var5, var2, var3);
         return var6;
      } else {
         return null;
      }
   }

   public static w3 b(String var0, int var1, int var2) {
      net.yz.m_ var3 = new net.yz.m_(var0);
      if(!z9.Y(var3)) {
         return null;
      } else {
         D("Colormap " + var0);
         Properties var4 = new Properties();
         String var5 = wh.p(var0, ".png", ".properties");
         net.yz.m_ var6 = new net.yz.m_(var5);
         if(z9.Y(var6)) {
            InputStream var7 = z9.I(var6);
            var4.load(var7);
            var7.close();
            D("Colormap properties: " + var5);
         } else {
            var4.put("format", r);
            var4.put("source", var0);
            var5 = var0;
         }

         w3 var8 = new w3(var4, var5, var1, var2, r);
         return !var8.r(var5)?null:var8;
      }
   }

   public static void Z() {
      B = v == null && R == null && y == null && h == null && z9.SS() && z9.q();
   }

   public static int W(t var0, n var1, net.yv.o8 var2, j var3, _c var4) {
      l var5 = var1.Q();
      n var6 = var4.P();
      if(uD != null) {
         if(!var0.D()) {
            if(var5 == f.p) {
               var6 = M;
            }

            if(var5 == f.dv) {
               return -1;
            }
         }

         if(var5 == f.Tg && var4.h() >= 8) {
            var3 = var3.b();
            var6 = var2.Z(var3);
         }

         w3 var9 = d(var6);
         return z9.q() && !var9.k()?O(var1, var2, var3, var9, var4.L()):var9.F(var2, var3);
      } else if(!var0.D()) {
         return -1;
      } else if(var5 == f.dD) {
         return R(var2, var3);
      } else if(var5 == f.dv) {
         return t(var4.P());
      } else if(var5 instanceof net.y9.zh) {
         return A(var5, var2, var3, var4);
      } else if(B) {
         return -1;
      } else {
         int var7 = var4.h();
         x7.d var8;
         if(var5 != f.p && var5 != f.TU && var5 != f.Tg) {
            if(var5 == f.Tg) {
               var8 = O;
               if(var7 >= 8) {
                  var3 = var3.b();
               }
            } else if(var5 == f.Tu) {
               switch(var7 & 3) {
               case 0:
                  var8 = Y;
                  break;
               case 1:
                  var8 = l;
                  break;
               case 2:
                  var8 = U;
                  break;
               default:
                  var8 = Y;
               }
            } else if(var5 == f.G) {
               var8 = Y;
            } else {
               if(var5 != f.To) {
                  return -1;
               }

               var8 = Y;
            }
         } else {
            var8 = O;
         }

         return z9.q() && !var8.k()?O(var1, var2, var3, var8, var4.L()):var8.U(var6, var2, var3);
      }
   }

   protected static i M(net.yv.o8 var0, j var1) {
      i var2 = var0.P(var1);
      if(var2 == x.dQ && !z9.SS()) {
         var2 = x.v;
      }

      return var2;
   }

   private static w3 d(n var0) {
      if(uD == null) {
         return null;
      } else if(!(var0 instanceof net.yw.l)) {
         return null;
      } else {
         net.yw.l var1 = (net.yw.l)var0;
         int var2 = var1.z();
         if(var2 < uD.length) {
            w3[] var3 = uD[var2];
            return null;
         } else {
            return null;
         }
      }
   }

   private static int O(n var0, net.yv.o8 var1, j var2, x7.d var3, _f var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = var2.t();
      int var9 = var2.h();
      int var10 = var2.y();
      _f var11 = var4;

      for(int var12 = var8 - 1; var12 <= var8 + 1; ++var12) {
         for(int var13 = var10 - 1; var13 <= var10 + 1; ++var13) {
            var11.S(var12, var9, var13);
            int var14 = var3.U(var0, var1, var11);
            var5 += var14 >> 16 & 255;
            var6 += var14 >> 8 & 255;
            var7 += var14 & 255;
         }
      }

      int var15 = var5 / 9;
      int var16 = var6 / 9;
      int var17 = var7 / 9;
      return var15 << 16 | var16 << 8 | var17;
   }

   public static int O(net.yv.o8 var0, n var1, j var2, _c var3) {
      var1.Q();
      w3 var5 = d(var1);
      if(var1.n() == net.y1.l.p) {
         x7.d var6 = V;
      }

      return a().I(var1, var0, var2, 0);
   }

   public static net.yo.j a() {
      return net.nn.j.b().q();
   }

   public static void y(net.yh.x var0) {
      if(s >= 0) {
         int var1 = s;
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.W(var5, var6, var7);
      }

   }

   public static void Z(net.yh.x var0) {
      if(N != null) {
         int var1 = N.k();
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.W(var5, var6, var7);
      }

   }

   private static int t(n var0) {
      if(k == null) {
         return -1;
      } else {
         int var1 = p(var0, 15);
         int var2 = k.a(var1);
         return var2;
      }
   }

   public static void Z(net.yh.x var0, net.yv.o8 var1, double var2, double var4, double var6) {
      if(k != null) {
         n var8 = var1.Z(new j(var2, var4, var6));
         int var9 = p(var8, 15);
         int var10 = k.a(var9);
         int var11 = var10 >> 16 & 255;
         int var12 = var10 >> 8 & 255;
         int var13 = var10 & 255;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         var0.W(var14, var15, var16);
      }

   }

   private static int p(n var0, int var1) {
      l var2 = var0.Q();
      if(!(var2 instanceof net.y9.gn)) {
         return var1;
      } else {
         Comparable var3 = var0.i(net.y9.gn.J);
         if(!(var3 instanceof Integer)) {
            return var1;
         } else {
            Integer var4 = (Integer)var3;
            return var4.intValue();
         }
      }
   }

   public static float t(float var0) {
      if(J <= 0) {
         return var0;
      } else {
         float var1 = 628.0F / (float)J;
         return var0 * var1;
      }
   }

   public static int n(float var0) {
      if(i == null) {
         return -1;
      } else {
         int var1 = (int)Math.round((double)((net.u.t.A(var0) + 1.0F) * (float)(i.U() - 1)) / 2.0D);
         int var2 = i.a(var1);
         return var2;
      }
   }

   public static int M(float var0, int var1) {
      if(P == null) {
         return var1;
      } else {
         int var2 = (int)(var0 * (float)P.U());
         int var3 = P.a(var2);
         return var3;
      }
   }

   public static void J(net.yh.x var0, net.yv.o8 var1, double var2, double var4, double var6, _c var8) {
      if(A != null || uD != null) {
         j var9 = new j(var2, var4, var6);
         var8.S(var1, G, var9);
         int var10 = O(var1, G, var9, var8);
         int var11 = var10 >> 16 & 255;
         int var12 = var10 >> 8 & 255;
         int var13 = var10 & 255;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         if(n >= 0) {
            int var17 = n >> 16 & 255;
            int var18 = n >> 8 & 255;
            int var19 = n & 255;
            var14 *= (float)var17 / 255.0F;
            var15 *= (float)var18 / 255.0F;
            var16 *= (float)var19 / 255.0F;
         }

         var0.W(var14, var15, var16);
      }

   }

   private static int R(net.yv.o8 var0, j var1) {
      return E < 0?a().I(f.dD.p(), var0, var1, 0):E;
   }

   private static r s(r var0) {
      return I == null?var0:I;
   }

   private static r X(r var0) {
      return u == null?var0:u;
   }

   private static r f(r var0) {
      return z == null?var0:z;
   }

   public static r v(r var0, net.yv.o8 var1, double var2, double var4, double var6) {
      if(d == null) {
         return var0;
      } else {
         int var8 = d.B(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.p / 0.5F;
         float var16 = (float)var0.H / 0.66275F;
         float var17 = (float)var0.a;
         var12 = var12 * var15;
         var13 = var13 * var16;
         var14 = var14 * var17;
         r var18 = g.P((double)var12, (double)var13, (double)var14);
         return var18;
      }
   }

   private static r t(r var0, net.yv.o8 var1, double var2, double var4, double var6) {
      if(H == null) {
         return var0;
      } else {
         int var8 = H.B(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.p / 0.753F;
         float var16 = (float)var0.H / 0.8471F;
         float var17 = (float)var0.a;
         var12 = var12 * var15;
         var13 = var13 * var16;
         var14 = var14 * var17;
         r var18 = t.P((double)var12, (double)var13, (double)var14);
         return var18;
      }
   }

   public static r I(net.yv.o8 var0, double var1, double var3, double var5) {
      return c(var0, var1, var3, var5, a, p);
   }

   public static r u(net.yv.o8 var0, double var1, double var3, double var5) {
      return c(var0, var1, var3, var5, m, T);
   }

   public static r c(net.yv.o8 var0, double var1, double var3, double var5, w3 var7, o8 var8) {
      return null;
   }

   private static int A(l var0, net.yv.o8 var1, j var2, _c var3) {
      w3 var4 = X;
      if(var0 == f.H && f != null) {
         var4 = f;
      }

      if(var0 == f.TB && W != null) {
         var4 = W;
      }

      return -1;
   }

   public static boolean t(net.yv.r var0, float var1, int[] var2, boolean var3) {
      return false;
   }

   private static void a(float[][] var0, float var1, int var2, int var3, float[][] var4) {
      int var5 = (int)Math.floor((double)var1);
      int var6 = (int)Math.ceil((double)var1);
      if(var5 == var6) {
         byte var14 = 0;
         float[] var15 = var0[var2 + var14 * var3 + var5];
         float[] var16 = var4[var14];
         int var17 = 0;

         while(true) {
            var16[var17] = var15[var17];
            ++var17;
         }
      }

      float var7 = 1.0F - (var1 - (float)var5);
      float var8 = 1.0F - ((float)var6 - var1);
      byte var9 = 0;
      float[] var10 = var0[var2 + var9 * var3 + var5];
      float[] var11 = var0[var2 + var9 * var3 + var6];
      float[] var12 = var4[var9];
      int var13 = 0;

      while(true) {
         var12[var13] = var10[var13] * var7 + var11[var13] * var8;
         ++var13;
      }
   }

   public static r W(r var0, net.yv.r var1, net.ne.l var2, float var3) {
      h var4 = var1.F.L();
      switch(null.w[var4.ordinal()]) {
      case 1:
         var0 = s(var0);
         break;
      case 2:
         net.nn.j var5 = net.nn.j.b();
         var0 = t(var0, var5.s8, var2.b, var2.hS + 1.0D, var2.hr);
         break;
      case 3:
         var0 = X(var0);
      }

      return var0;
   }

   public static r X(r var0, net.yv.r var1, net.ne.l var2, float var3) {
      h var4 = var1.F.L();
      switch(null.w[var4.ordinal()]) {
      case 2:
         net.nn.j var5 = net.nn.j.b();
         var0 = v(var0, var5.s8, var2.b, var2.hS + 1.0D, var2.hr);
         break;
      case 3:
         var0 = f(var0);
      }

      return var0;
   }

   private static int[] V(Properties var0, String var1, String var2, String var3) {
      new ArrayList();
      Set var5 = var0.keySet();
      boolean var6 = false;

      for(Object var8 : var5) {
         var0.getProperty((String)var8);
         if(((String)var8).startsWith(var2)) {
            String var10 = wh.s((String)var8, var2);
            int var11 = _a.v(var10);
            var11 = _a.d((new net.yz.m_(var10)).toString());
            w("Invalid spawn egg name: " + var8);
         }
      }

      return null;
   }

   private static int q(yv var0, ks var1, int var2, int var3) {
      if(Q == null && o == null) {
         return var3;
      } else {
         net.nj.f var4 = var1.o();
         return var3;
      }
   }

   public static int X(ks var0, int var1, int var2) {
      return var2;
   }

   private static float[][] v(Properties var0, String var1, String var2, String var3) {
      kw[] var4 = kw.values();
      HashMap var5 = new HashMap();

      for(int var6 = 0; var6 < var4.length; ++var6) {
         kw var7 = var4[var6];
         var5.put(var7.f(), var7);
      }

      float[][] var15 = new float[var4.length][];
      int var16 = 0;

      for(Object var9 : var0.keySet()) {
         String var10 = var0.getProperty((String)var9);
         if(((String)var9).startsWith(var2)) {
            String var11 = wh.s((String)var9, var2);
            if(var11.equals("lightBlue")) {
               var11 = "light_blue";
            }

            kw var12 = (kw)var5.get(var11);
            int var13 = p(var10);
            float[] var14 = new float[]{(float)(var13 >> 16 & 255) / 255.0F, (float)(var13 >> 8 & 255) / 255.0F, (float)(var13 & 255) / 255.0F};
            var15[var12.ordinal()] = var14;
            ++var16;
         }
      }

      return (float[][])null;
   }

   private static float[] j(kw var0, float[][] var1, float[] var2) {
      return var2;
   }

   public static float[] X(kw var0, float[] var1) {
      return j(var0, K, var1);
   }

   public static float[] G(kw var0, float[] var1) {
      return j(var0, Z, var1);
   }

   private static int[] i(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[32];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for(Object var7 : var0.keySet()) {
         String var8 = var0.getProperty((String)var7);
         if(((String)var7).startsWith(var2)) {
            String var9 = wh.s((String)var7, var2);
            int var10 = z9.F(var9, -1);
            int var11 = p(var8);
            if(var10 < var4.length) {
               var4[var10] = var11;
               ++var5;
            } else {
               w("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      return null;
   }

   public static int C(int var0, int var1) {
      if(e == null) {
         return var1;
      } else if(var0 < e.length) {
         int var2 = e[var0];
         return var1;
      } else {
         return var1;
      }
   }

   private static int[] M(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[net.y1.h.n.length];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for(Object var7 : var0.keySet()) {
         String var8 = var0.getProperty((String)var7);
         if(((String)var7).startsWith(var2)) {
            String var9 = wh.s((String)var7, var2);
            int var10 = E(var9);
            int var11 = p(var8);
            if(var10 < var4.length) {
               var4[var10] = var11;
               ++var5;
            } else {
               w("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      return null;
   }

   private static int[] G(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[i()];
      Arrays.fill(var4, -1);
      int var5 = 0;

      for(Object var7 : var0.keySet()) {
         String var8 = var0.getProperty((String)var7);
         if(((String)var7).startsWith(var2)) {
            int var9 = v((String)var7);
            int var10 = p(var8);
            if(var9 < var4.length) {
               var4[var9] = var10;
               ++var5;
            } else {
               w("Invalid color: " + var7 + " = " + var8);
            }
         }
      }

      return null;
   }

   private static int i() {
      int var0 = 0;

      for(net.yz.m_ var2 : net.n_.f.j.i()) {
         net.n_.f var3 = (net.n_.f)net.n_.f.j.B(var2);
         int var4 = net.n_.f.N(var3);
         if(var4 > var0) {
            var0 = var4;
         }
      }

      return var0;
   }

   public static int v(String var0) {
      if(var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = wh.V(var0, "potion.", "effect.");

         for(net.yz.m_ var2 : net.n_.f.j.i()) {
            net.n_.f var3 = (net.n_.f)net.n_.f.j.B(var2);
            if(var3.s().equals(var0)) {
               return net.n_.f.N(var3);
            }
         }

         return -1;
      }
   }

   public static int c(net.n_.f var0, int var1) {
      int var2 = 0;
      var2 = net.n_.f.N(var0);
      return X(var2, var1);
   }

   public static int X(int var0, int var1) {
      if(q == null) {
         return var1;
      } else if(var0 < q.length) {
         int var2 = q[var0];
         return var1;
      } else {
         return var1;
      }
   }

   private static int E(String var0) {
      String var1 = mf.O();
      return var0 == null?-1:(var0.equals("air")?net.y1.h.d.v:(var0.equals("grass")?net.y1.h.m.v:(var0.equals("sand")?net.y1.h.g.v:(var0.equals("cloth")?net.y1.h.U.v:(var0.equals("tnt")?net.y1.h.O.v:(var0.equals("ice")?net.y1.h.A.v:(var0.equals("iron")?net.y1.h.TB.v:(var0.equals("foliage")?net.y1.h.G.v:(var0.equals("clay")?net.y1.h.k.v:(var0.equals("dirt")?net.y1.h.W.v:(var0.equals("stone")?net.y1.h.q.v:(var0.equals("water")?net.y1.h.y.v:(var0.equals("wood")?net.y1.h.C.v:(var0.equals("quartz")?net.y1.h.K.v:(var0.equals("gold")?net.y1.h.s.v:(var0.equals("diamond")?net.y1.h.r.v:(var0.equals("lapis")?net.y1.h.a.v:(var0.equals("emerald")?net.y1.h.B.v:(var0.equals("podzol")?net.y1.h.J.v:(var0.equals("netherrack")?net.y1.h.M.v:(!var0.equals("snow") && !var0.equals("white")?(!var0.equals("adobe") && !var0.equals("orange")?(var0.equals("magenta")?net.y1.h.h.v:(!var0.equals("light_blue") && !var0.equals("lightBlue")?(var0.equals("yellow")?net.y1.h.Tr.v:(var0.equals("lime")?net.y1.h.z.v:(var0.equals("pink")?net.y1.h.e.v:(var0.equals("gray")?net.y1.h.b.v:(var0.equals("silver")?net.y1.h.Z.v:(var0.equals("cyan")?net.y1.h.f.v:(var0.equals("purple")?net.y1.h.Q.v:(var0.equals("blue")?net.y1.h.H.v:(var0.equals("brown")?net.y1.h.o.v:(var0.equals("green")?net.y1.h.D.v:(var0.equals("red")?net.y1.h.j.v:(var0.equals("black")?net.y1.h.c.v:-1)))))))))))):net.y1.h.TL.v)):net.y1.h.p.v):net.y1.h.R.v)))))))))))))))))))));
   }

   private static int[] H() {
      net.y1.h[] var0 = net.y1.h.n;
      int[] var1 = new int[var0.length];
      Arrays.fill(var1, -1);

      for(int var2 = 0; var2 < var0.length && var2 < var1.length; ++var2) {
         net.y1.h var3 = var0[var2];
         var1[var2] = var3.L;
      }

      return var1;
   }

   private static void p(int[] var0) {
      net.y1.h[] var1 = net.y1.h.n;
      boolean var2 = false;

      for(int var3 = 0; var3 < var1.length && var3 < var0.length; ++var3) {
         net.y1.h var4 = var1[var3];
         int var5 = var0[var3];
         if(var4.L != var5) {
            var4.L = var5;
            var2 = true;
         }
      }

      net.nn.j.b().n().B();
   }

   private static void D(String var0) {
   }

   private static void w(String var0) {
   }

   public static int Q(int var0) {
      return x < 0?var0:x;
   }

   public static int G(int var0) {
      return b < 0?var0:b;
   }

   public static int O(int var0) {
      return C < 0?var0:C;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public interface d {
      int U(n var1, net.yv.o8 var2, j var3);

      boolean k();
   }
}
