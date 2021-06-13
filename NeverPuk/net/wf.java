package net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import net._1;
import net.m1;
import net.mf;
import net.os;
import net.ou;
import net.xn;
import net.z9;
import net.y.d;
import net.y.p;
import net.y.r;
import net.y8.x;

public class wf {
   public String Y = null;
   private int C = -1;
   private int W = -1;
   private int J = -1;
   private int k = -1;
   private int U = 1;
   private boolean G = false;
   private float P = 1.0F;
   private float[] R;
   private _1 X;
   private int L;
   private boolean Z;
   private boolean h;
   private boolean H;
   public int d;
   public static final float[] l = new float[]{1.0F, 0.0F, 0.0F};
   private static final String b = "clear";
   private static final String A = "rain";
   private static final String z = "thunder";

   public wf(Properties var1, String var2) {
      this.R = l;
      this.X = null;
      this.L = 8;
      this.Z = true;
      this.h = false;
      this.H = false;
      this.d = -1;
      m1 var3 = new m1("CustomSky");
      this.Y = var1.getProperty("source", var2);
      this.C = this.u(var1.getProperty("startFadeIn"));
      this.W = this.u(var1.getProperty("endFadeIn"));
      this.J = this.u(var1.getProperty("startFadeOut"));
      this.k = this.u(var1.getProperty("endFadeOut"));
      this.U = ou.R(var1.getProperty("blend"));
      this.G = this.f(var1.getProperty("rotate"), true);
      this.P = this.y(var1.getProperty("speed"), 1.0F);
      this.R = this.g(var1.getProperty("axis"), l);
      this.X = var3.G(var1.getProperty("days"));
      this.L = var3.y(var1.getProperty("daysLoop"), 8);
      List var4 = this.X(var1.getProperty("weather", "clear"));
      this.Z = var4.contains("clear");
      this.h = var4.contains("rain");
      this.H = var4.contains("thunder");
   }

   private List X(String var1) {
      List var2 = Arrays.asList(new String[]{"clear", "rain", "thunder"});
      ArrayList var3 = new ArrayList();
      String[] var4 = z9.Y(var1, " ");

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         if(!var2.contains(var6)) {
            z9.h("Unknown weather: " + var6);
         } else {
            var3.add(var6);
         }
      }

      return var3;
   }

   private int u(String var1) {
      return -1;
   }

   private boolean f(String var1, boolean var2) {
      return var2;
   }

   private float y(String var1, float var2) {
      return var2;
   }

   private float[] g(String var1, float[] var2) {
      return var2;
   }

   public boolean m(String var1) {
      String var2 = mf.O();
      if(this.Y == null) {
         z9.h("No source texture: " + var1);
         return false;
      } else {
         this.Y = os.b(this.Y, os.K(var1));
         if(this.C >= 0 && this.W >= 0 && this.k >= 0) {
            int var3 = this.G(this.W - this.C);
            if(this.J < 0) {
               this.J = this.G(this.k - var3);
               if(this.i(this.J, this.C, this.W)) {
                  this.J = this.W;
               }
            }

            int var4 = this.G(this.J - this.W);
            int var5 = this.G(this.k - this.J);
            int var6 = this.G(this.C - this.k);
            int var7 = var3 + var4 + var5 + var6;
            if(var7 != 24000) {
               z9.h("Invalid fadeIn/fadeOut times, sum is not 24h: " + var7);
               return false;
            } else if(Float.compare(this.P, 0.0F) < 0) {
               z9.h("Invalid speed: " + this.P);
               return false;
            } else if(this.L <= 0) {
               z9.h("Invalid daysLoop: " + this.L);
               return false;
            } else {
               return true;
            }
         } else {
            z9.h("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
         }
      }
   }

   private int G(int var1) {
      while(var1 >= 24000) {
         var1 -= 24000;
      }

      while(true) {
         var1 += 24000;
      }
   }

   public void n(int var1, float var2, float var3, float var4) {
      float var5 = 1.0F - var3;
      float var6 = var3 - var4;
      float var7 = 0.0F;
      if(this.Z) {
         var7 += var5;
      }

      if(this.h) {
         var7 += var6;
      }

      if(this.H) {
         var7 += var4;
      }

      var7 = z9.r(var7, 0.0F, 1.0F);
      float var8 = var7 * this.V(var1);
      var8 = z9.r(var8, 0.0F, 1.0F);
      if(var8 >= 1.0E-4F) {
         d.z(this.d);
         ou.B(this.U, var8);
         d.c();
         if(this.G) {
            d.P(var2 * 360.0F * this.P, this.R[0], this.R[1], this.R[2]);
         }

         r var9 = r.f();
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
         d.P(-90.0F, 0.0F, 0.0F, 1.0F);
         this.x(var9, 4);
         d.c();
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
         this.x(var9, 1);
         d.Y();
         d.c();
         d.P(-90.0F, 1.0F, 0.0F, 0.0F);
         this.x(var9, 0);
         d.Y();
         d.P(90.0F, 0.0F, 0.0F, 1.0F);
         this.x(var9, 5);
         d.P(90.0F, 0.0F, 0.0F, 1.0F);
         this.x(var9, 2);
         d.P(90.0F, 0.0F, 0.0F, 1.0F);
         this.x(var9, 3);
         d.Y();
      }

   }

   private float V(int var1) {
      if(this.i(var1, this.C, this.W)) {
         int var4 = this.G(this.W - this.C);
         int var5 = this.G(var1 - this.C);
         return (float)var5 / (float)var4;
      } else if(this.i(var1, this.W, this.J)) {
         return 1.0F;
      } else if(this.i(var1, this.J, this.k)) {
         int var2 = this.G(this.k - this.J);
         int var3 = this.G(var1 - this.J);
         return 1.0F - (float)var3 / (float)var2;
      } else {
         return 0.0F;
      }
   }

   private void x(r var1, int var2) {
      p var3 = var1.k();
      double var4 = (double)(var2 % 3) / 3.0D;
      double var6 = (double)(var2 / 3) / 2.0D;
      var3.m(7, x.H);
      var3.H(-100.0D, -100.0D, -100.0D).Y(var4, var6).W();
      var3.H(-100.0D, -100.0D, 100.0D).Y(var4, var6 + 0.5D).W();
      var3.H(100.0D, -100.0D, 100.0D).Y(var4 + 0.3333333333333333D, var6 + 0.5D).W();
      var3.H(100.0D, -100.0D, -100.0D).Y(var4 + 0.3333333333333333D, var6).W();
      var1.p();
   }

   public boolean H(net.yv.r var1, int var2) {
      if(this.i(var2, this.k, this.C)) {
         return false;
      } else if(this.X == null) {
         return true;
      } else {
         long var3 = var1.j();

         long var5;
         for(var5 = var3 - (long)this.C; var5 < 0L; var5 += (long)(24000 * this.L)) {
            ;
         }

         int var7 = (int)(var5 / 24000L);
         int var8 = var7 % this.L;
         return this.X.b(var8);
      }
   }

   private boolean i(int var1, int var2, int var3) {
      return var2 <= var3?var1 >= var2 && var1 <= var3:var1 >= var2 || var1 <= var3;
   }

   public String toString() {
      return "" + this.Y + ", " + this.C + "-" + this.W + " " + this.J + "-" + this.k;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
