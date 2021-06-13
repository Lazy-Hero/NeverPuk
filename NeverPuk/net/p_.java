package net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.m8;
import net.oz;
import net.pa;
import net.py;
import net.pz;
import net.u4;
import net.ui;
import net.uv;
import net.wh;
import net.xn;
import net.z9;
import net.c9.b;
import net.nr.d;
import net.u.t;
import net.z.m;
import net.z.r;
import net.z.tu;

public class p_ extends pz {
   private final tu D;
   protected String u;
   private final d Q;
   private int R;
   private int y;
   private long K;
   private String W;
   private String z;
   private boolean T;
   public static final String b = "<profile>";
   public static final String f = "<empty>";
   public static final String n = "*";

   public p_(tu var1, d var2) {
      this.R = 0;
      this.y = 0;
      this.K = 0L;
      this.W = null;
      this.z = null;
      this.T = false;
      this.u = "Shader Options";
      this.D = var1;
      this.Q = var2;
   }

   public p_(tu var1, d var2, String var3) {
      this(var1, var2);
      this.W = var3;
      this.z = oz.N("screen." + var3, var3);
   }

   public void L() {
      this.u = b.x("of.options.shaderOptionsTitle", new Object[0]);
      uv.l();
      byte var2 = 100;
      int var3 = 0;
      byte var4 = 30;
      byte var5 = 20;
      int var10001 = q - 130;
      byte var7 = 120;
      byte var8 = 20;
      int var9 = oz.V(this.W, 2);
      uv[] var10 = oz.q(this.W);
      int var11 = t.o((double)var10.length / 9.0D);
      if(var9 < var11) {
         var9 = var11;
      }

      int var12 = 0;
      if(var12 < var10.length) {
         uv var13 = var10[var12];
         if(var13.A()) {
            int var14 = var12 % var9;
            int var15 = var12 / var9;
            int var16 = Math.min(q / var9, 200);
            var3 = (q - var16 * var9) / 2;
            int var17 = var14 * var16 + 5 + var3;
            int var18 = var4 + var15 * var5;
            int var19 = var16 - 10;
            String var20 = q(var13, var19);
            if(oz.o(var13.T())) {
               new pa(var2 + var12, var17, var18, var19, var8, var13, var20);
            }

            py var21 = new py(var2 + var12, var17, var18, var19, var8, var13, var20);
            var21.O = var13.q();
            this.m.add(var21);
         }

         ++var12;
      }

      this.m.add(new m(201, q / 2 - var7 - 20, V / 6 + 168 + 11, var7, var8, b.x("controls.reset", new Object[0])));
      this.m.add(new m(200, q / 2 + 20, V / 6 + 168 + 11, var7, var8, b.x("gui.done", new Object[0])));
   }

   public static String q(uv var0, int var1) {
      String var2 = var0.V();
      if(var0 instanceof u4) {
         u4 var6 = (u4)var0;
         return var2 + "...";
      } else {
         r var3 = z9.G().sO;

         for(int var4 = var3.r(": " + m8.o()) + 5; var3.r(var2) + var4 >= var1 && var2.length() > 0; var2 = var2.substring(0, var2.length() - 1)) {
            ;
         }

         String var7 = var0.M()?var0.v(var0.N()):"";
         String var5 = var0.n(var0.N());
         return var2 + ": " + var7 + var5;
      }
   }

   protected void t(m var1) {
      if(var1.O) {
         if(var1.g < 200 && var1 instanceof py) {
            py var2 = (py)var1;
            uv var3 = var2.t();
            if(var3 instanceof u4) {
               String var8 = var3.T();
               p_ var5 = new p_(this, this.Q, var8);
               this.A.s(var5);
               return;
            }

            if(s()) {
               var3.J();
            } else {
               var3.d();
            }

            this.S();
            this.T = true;
         }

         if(var1.g == 201) {
            uv[] var6 = oz.B(oz.N());

            for(int var7 = 0; var7 < var6.length; ++var7) {
               uv var4 = var6[var7];
               var4.J();
               this.T = true;
            }

            this.S();
         }

         if(var1.g == 200) {
            if(this.T) {
               oz.m();
               this.T = false;
               oz.t();
            }

            this.A.s(this.D);
         }
      }

   }

   protected void S(m var1) {
      if(var1 instanceof py) {
         py var2 = (py)var1;
         uv var3 = var2.t();
         if(s()) {
            var3.J();
         } else {
            var3.w();
         }

         this.S();
         this.T = true;
      }

   }

   public void x() {
      super.x();
      if(this.T) {
         oz.m();
         this.T = false;
         oz.t();
      }

   }

   private void S() {
      for(m var2 : this.m) {
         if(var2 instanceof py) {
            py var3 = (py)var2;
            uv var4 = var3.t();
            if(var4 instanceof ui) {
               ui var5 = (ui)var4;
               var5.R();
            }

            var3.J = q(var4, var3.h());
            var3.H();
         }
      }

   }

   public void v(int var1, int var2, float var3) {
      this.C();
      if(this.z != null) {
         this.d(this.O, this.z, q / 2, 15, 16777215);
      } else {
         this.d(this.O, this.u, q / 2, 15, 16777215);
      }

      super.v(var1, var2, var3);
      if(Math.abs(var1 - this.R) <= 5 && Math.abs(var2 - this.y) <= 5) {
         this.n(var1, var2, this.m);
      } else {
         this.R = var1;
         this.y = var2;
         this.K = System.currentTimeMillis();
      }

   }

   private void n(int var1, int var2, List var3) {
      short var4 = 700;
      if(System.currentTimeMillis() >= this.K + (long)var4) {
         int var5 = q / 2 - 150;
         int var6 = V / 6 - 7;
         if(var2 <= var6 + 98) {
            var6 += 105;
         }

         int var7 = var5 + 150 + 150;
         int var10000 = var6 + 84 + 10;
         m var9 = B(var3, var1, var2);
         if(var9 instanceof py) {
            py var10 = (py)var9;
            uv var11 = var10.t();
            String[] var12 = this.S(var11, var7 - var5);
            return;
         }
      }

   }

   private String[] S(uv var1, int var2) {
      if(var1 instanceof ui) {
         return null;
      } else {
         String var3 = var1.V();
         String var4 = z9.t(var1.y()).trim();
         String[] var5 = this.D(var4);
         String var6 = null;
         if(!var3.equals(var1.T()) && this.Q.p) {
            var6 = "§8" + m8.i("of.general.id") + ": " + var1.T();
         }

         String var7 = null;
         if(var1.p() != null && this.Q.p) {
            var7 = "§8" + m8.i("of.general.from") + ": " + z9.O((Object[])var1.p());
         }

         String var8 = null;
         if(var1.C() != null && this.Q.p) {
            String var9 = var1.q()?var1.n(var1.C()):m8.i("of.general.ambiguous");
            var8 = "§8" + m8.N() + ": " + var9;
         }

         ArrayList var11 = new ArrayList();
         var11.add(var3);
         var11.addAll(Arrays.asList(var5));
         var11.add(var6);
         var11.add(var7);
         var11.add(var8);
         String[] var10 = this.y(var2, var11);
         return var10;
      }
   }

   private String[] D(String var1) {
      if(var1.length() <= 0) {
         return new String[0];
      } else {
         var1 = wh.s(var1, "//");
         String[] var2 = var1.split("\\. ");

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = "- " + var2[var3].trim();
            var2[var3] = wh.u(var2[var3], ".");
         }

         return var2;
      }
   }

   private String[] y(int var1, List var2) {
      r var3 = z9.G().sO;
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < var2.size(); ++var5) {
         String var6 = (String)var2.get(var5);
         if(var6.length() > 0) {
            for(String var8 : var3.m(var6, var1)) {
               var4.add(var8);
            }
         }
      }

      String[] var9 = (String[])var4.toArray(new String[var4.size()]);
      return var9;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
