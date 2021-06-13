package net;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import net._f;
import net.m1;
import net.mf;
import net.ob;
import net.os;
import net.r5;
import net.x7;
import net.z9;
import net.n9.y;
import net.nb.x;
import net.ns.i;
import net.u.j;
import net.u.t;
import net.y9.l;
import net.yw.n;

public class w3 implements x7.d {
   public String Y = null;
   public String v = null;
   private int F = -1;
   private r5[] n = null;
   private String M = null;
   private int f = -1;
   private int s = 0;
   private int e = 0;
   private int m = 0;
   private int T = 0;
   private int[] i = null;
   private float[][] A = (float[][])null;
   private static final int h = -1;
   private static final int E = 0;
   private static final int w = 1;
   private static final int q = 2;
   public static final String z = "vanilla";
   public static final String K = "grid";
   public static final String N = "fixed";
   public static final String[] r = new String[]{"vanilla", "grid", "fixed"};
   public static final String I = "format";
   public static final String X = "blocks";
   public static final String c = "source";
   public static final String d = "color";
   public static final String S = "yVariance";
   public static final String l = "yOffset";

   public w3(Properties var1, String var2, int var3, int var4, String var5) {
      m1 var6 = new m1("Colormap");
      this.Y = var6.x(var2);
      this.v = var6.c(var2);
      this.F = this.c(var1.getProperty("format", var5));
      this.n = var6.t(var1.getProperty("blocks"));
      this.M = k(var1.getProperty("source"), var2, this.v);
      this.f = m1.x(var1.getProperty("color"), -1);
      this.s = var6.y(var1.getProperty("yVariance"), 0);
      this.e = var6.y(var1.getProperty("yOffset"), 0);
      this.m = var3;
      this.T = var4;
   }

   private int c(String var1) {
      return 0;
   }

   public boolean r(String var1) {
      if(this.F != 0 && this.F != 1) {
         if(this.F != 2) {
            return false;
         }

         if(this.f < 0) {
            this.f = 16777215;
         }
      } else {
         if(this.M == null) {
            T("Source not defined: " + var1);
            return false;
         }

         this.V();
         if(this.i == null) {
            return false;
         }

         if(this.f < 0) {
            if(this.F == 0) {
               this.f = this.b(127, 127);
            }

            if(this.F == 1) {
               this.f = this.s(x.v, new j(0, 64, 0));
            }
         }
      }

      return true;
   }

   public boolean M(String var1) {
      if(this.n == null) {
         this.n = this.u();
         if(this.n == null) {
            T("Match blocks not defined: " + var1);
            return false;
         }
      }

      return true;
   }

   private r5[] u() {
      l var1 = l.d(this.Y);
      return new r5[]{new r5(l.h(var1))};
   }

   private void V() {
      String var1 = mf.O();
      this.i = null;
      if(this.M != null) {
         String var2 = this.M + ".png";
         net.yz.m_ var3 = new net.yz.m_(var2);
         InputStream var4 = z9.I(var3);
         if(var4 != null) {
            BufferedImage var5 = y.T(var4);
            if(var5 != null) {
               int var6 = var5.getWidth();
               int var7 = var5.getHeight();
               boolean var8 = this.m < 0 || this.m == var6;
               boolean var9 = this.T < 0 || this.T == var7;
               this.m = var6;
               this.T = var7;
               if(this.m > 0 && this.T > 0) {
                  this.i = new int[var6 * var7];
                  var5.getRGB(0, 0, var6, var7, this.i, 0, var6);
               } else {
                  T("Invalid palette size: " + var6 + "x" + var7 + ", path: " + var2);
               }
            }
         }
      }
   }

   private static void x(String var0) {
   }

   private static void T(String var0) {
   }

   private static String k(String var0, String var1, String var2) {
      var0 = var0.trim();
      String var3 = ".png";
      if(var0.endsWith(var3)) {
         var0 = var0.substring(0, var0.length() - var3.length());
      }

      var0 = o(var0, var2);
      return var0;
   }

   private static String o(String var0, String var1) {
      var0 = os.b(var0, var1);
      if(!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("mcpatcher/")) {
         var0 = var1 + "/" + var0;
      }

      if(var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      String var2 = "textures/blocks/";
      if(var0.startsWith(var2)) {
         var0 = var0.substring(var2.length());
      }

      if(var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   public boolean W(net.yw.l var1) {
      return ob.E(var1, this.n);
   }

   public int k() {
      if(this.F == 2) {
         return this.f;
      } else {
         int var1 = x7.L.nextInt(this.i.length);
         return this.i[var1];
      }
   }

   public int a(int var1) {
      var1 = z9.C(var1, 0, this.i.length - 1);
      return this.i[var1] & 16777215;
   }

   public int b(int var1, int var2) {
      var1 = z9.C(var1, 0, this.m - 1);
      var2 = z9.C(var2, 0, this.T - 1);
      return this.i[var2 * this.m + var1] & 16777215;
   }

   public float[][] L() {
      if(this.A == null) {
         this.A = D(this.i);
      }

      return this.A;
   }

   public int U(n var1, net.yv.o8 var2, j var3) {
      return this.F(var2, var3);
   }

   public int F(net.yv.o8 var1, j var2) {
      i var3 = x7.M(var1, var2);
      return this.W(var3, var2);
   }

   public boolean k() {
      return this.F == 2;
   }

   public int W(i var1, j var2) {
      return this.F == 0?this.a(var1, var2):(this.F == 1?this.s(var1, var2):this.f);
   }

   public int B(net.yv.o8 var1, double var2, double var4, double var6, int var8) {
      if(this.F == 2) {
         return this.f;
      } else {
         int var9 = t.L(var2);
         int var10 = t.L(var4);
         int var11 = t.L(var6);
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         _f var16 = new _f(0, 0, 0);

         for(int var17 = var9 - var8; var17 <= var9 + var8; ++var17) {
            for(int var18 = var11 - var8; var18 <= var11 + var8; ++var18) {
               var16.S(var17, var10, var18);
               int var19 = this.F(var1, var16);
               var12 += var19 >> 16 & 255;
               var13 += var19 >> 8 & 255;
               var14 += var19 & 255;
               ++var15;
            }
         }

         int var20 = var12 / var15;
         int var21 = var13 / var15;
         int var22 = var14 / var15;
         return var20 << 16 | var21 << 8 | var22;
      }
   }

   private int a(i var1, j var2) {
      double var3 = (double)t.T(var1.D(var2), 0.0F, 1.0F);
      double var5 = (double)t.T(var1.M(), 0.0F, 1.0F);
      var5 = var5 * var3;
      int var7 = (int)((1.0D - var3) * (double)(this.m - 1));
      int var8 = (int)((1.0D - var5) * (double)(this.T - 1));
      return this.b(var7, var8);
   }

   private int s(i var1, j var2) {
      int var3 = i.y(var1);
      int var4 = var2.h() - this.e;
      if(this.s > 0) {
         int var5 = var2.t() << 16 + var2.y();
         int var6 = z9.u(var5);
         int var7 = this.s * 2 + 1;
         int var8 = (var6 & 255) % var7 - this.s;
         var4 += var8;
      }

      return this.b(var3, var4);
   }

   public int U() {
      return this.F == 2?1:this.i.length;
   }

   public int h() {
      return this.m;
   }

   public int N() {
      return this.T;
   }

   private static float[][] D(int[] var0) {
      float[][] var1 = new float[var0.length][3];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var0[var2];
         float var4 = (float)(var3 >> 16 & 255) / 255.0F;
         float var5 = (float)(var3 >> 8 & 255) / 255.0F;
         float var6 = (float)(var3 & 255) / 255.0F;
         float[] var7 = var1[var2];
         var7[0] = var4;
         var7[1] = var5;
         var7[2] = var6;
      }

      return var1;
   }

   public void W(r5 var1) {
      if(this.n == null) {
         this.n = new r5[0];
      }

      this.n = (r5[])((r5[])z9.F((Object[])this.n, (Object)var1));
   }

   public void X(int var1, int var2) {
      r5 var3 = this.a(var1);
      var3.D(var2);
   }

   private r5 a(int var1) {
      if(this.n != null) {
         for(r5 var5 : this.n) {
            if(var5.K() == var1) {
               return var5;
            }
         }
      }

      return null;
   }

   public int[] v() {
      if(this.n == null) {
         return null;
      } else {
         HashSet var1 = new HashSet();

         for(r5 var5 : this.n) {
            if(var5.K() >= 0) {
               var1.add(Integer.valueOf(var5.K()));
            }
         }

         Integer[] var6 = (Integer[])((Integer[])var1.toArray(new Integer[0]));
         int[] var7 = new int[var6.length];

         for(int var8 = 0; var8 < var6.length; ++var8) {
            var7[var8] = var6[var8].intValue();
         }

         return var7;
      }
   }

   public String toString() {
      return "" + this.v + "/" + this.Y + ", blocks: " + z9.O((Object[])this.n) + ", source: " + this.M;
   }

   static {
      String[] var10000 = new String[]{"vanilla", "grid", "fixed"};
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
