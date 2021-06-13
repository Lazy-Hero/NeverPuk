package net.yh;

import javax.annotation.Nullable;
import net.xn;
import net.n0.y4;
import net.yh.c;
import net.yh.c7;
import net.yh.ca;
import net.yh.x;

public class cf {
   public static class b extends x {
      protected b(net.yv.r var1, double var2, double var4, double var6) {
         super(var1, var2, var4, var6);
         this.a = 4;
      }

      public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
         float var10000 = 0.25F;
         var10000 = 0.5F;
         var10000 = 0.125F;
         var10000 = 0.375F;
         float var13 = 7.1F * net.u.t.A(((float)this.x + var3 - 1.0F) * 0.25F * 3.1415927F);
         this.n(0.6F - ((float)this.x + var3 - 1.0F) * 0.25F * 0.5F);
         float var14 = (float)(this.i + (this.K - this.i) * (double)var3 - X);
         float var15 = (float)(this.m + (this.C - this.m) * (double)var3 - z);
         float var16 = (float)(this.O + (this.A - this.O) * (double)var3 - U);
         int var17 = this.g(var3);
         int var18 = var17 >> 16 & '\uffff';
         int var19 = var17 & '\uffff';
         var1.H((double)(var14 - var4 * var13 - var7 * var13), (double)(var15 - var5 * var13), (double)(var16 - var6 * var13 - var8 * var13)).Y(0.5D, 0.375D).m(this.N, this.F, this.V, this.Y).C(var18, var19).W();
         var1.H((double)(var14 - var4 * var13 + var7 * var13), (double)(var15 + var5 * var13), (double)(var16 - var6 * var13 + var8 * var13)).Y(0.5D, 0.125D).m(this.N, this.F, this.V, this.Y).C(var18, var19).W();
         var1.H((double)(var14 + var4 * var13 + var7 * var13), (double)(var15 + var5 * var13), (double)(var16 + var6 * var13 + var8 * var13)).Y(0.25D, 0.125D).m(this.N, this.F, this.V, this.Y).C(var18, var19).W();
         var1.H((double)(var14 + var4 * var13 - var7 * var13), (double)(var15 - var5 * var13), (double)(var16 + var6 * var13 - var8 * var13)).Y(0.25D, 0.375D).m(this.N, this.F, this.V, this.Y).C(var18, var19).W();
      }
   }

   public static class v implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         cf.z var16 = new cf.z(var2, var3, var5, var7, var9, var11, var13, net.nn.j.b().sv);
         var16.n(0.99F);
         return var16;
      }
   }

   public static class w extends x {
      private int I;
      private final c7 v;
      private net.nj.h D;
      boolean q;

      public w(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, c7 var14, @Nullable net.nj.f var15) {
         super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
         this.B = var8;
         this.R = var10;
         this.L = var12;
         this.v = var14;
         this.a = 8;
         this.D = var15.A("Explosions", 10);
         if(this.D.N()) {
            this.D = null;
         } else {
            this.a = this.D.z() * 2 - 1;

            for(int var16 = 0; var16 < this.D.z(); ++var16) {
               net.nj.f var17 = this.D.i(var16);
               if(var17.i("Flicker")) {
                  this.q = true;
                  this.a += 15;
                  break;
               }
            }
         }

      }

      public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      }

      public void f() {
         int[] var1 = x.f();
         if(this.I == 0 && this.D != null) {
            boolean var2 = this.A();
            boolean var3 = false;
            if(this.D.z() >= 3) {
               var3 = true;
            }

            int var4 = 0;
            if(var4 < this.D.z()) {
               net.nj.f var5 = this.D.i(var4);
               if(var5.R("Type") == 1) {
                  var3 = true;
               }

               ++var4;
            }

            net.yz.a var21 = var2?net.nb.l.Ka:net.nb.l.P5;
            this.e.m(this.K, this.C, this.A, var21, net.yz.p.AMBIENT, 20.0F, 0.95F + this.k.nextFloat() * 0.1F, true);
         }

         if(this.I % 2 == 0 && this.D != null && this.I / 2 < this.D.z()) {
            int var14 = this.I / 2;
            net.nj.f var18 = this.D.i(var14);
            byte var22 = var18.R("Type");
            boolean var23 = var18.i("Trail");
            boolean var6 = var18.i("Flicker");
            int[] var7 = var18.g("Colors");
            int[] var8 = var18.g("FadeColors");
            if(var7.length == 0) {
               var7 = new int[]{y4.m[0]};
            }

            if(var22 == 1) {
               this.W(0.5D, 4, var7, var8, var23, var6);
            }

            if(var22 == 2) {
               this.h(0.5D, new double[][]{{0.0D, 1.0D}, {0.3455D, 0.309D}, {0.9511D, 0.309D}, {0.3795918367346939D, -0.12653061224489795D}, {0.6122448979591837D, -0.8040816326530612D}, {0.0D, -0.35918367346938773D}}, var7, var8, var23, var6, false);
            }

            if(var22 == 3) {
               this.h(0.5D, new double[][]{{0.0D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.6D}, {0.6D, 0.6D}, {0.6D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.0D}, {0.4D, 0.0D}, {0.4D, -0.6D}, {0.2D, -0.6D}, {0.2D, -0.4D}, {0.0D, -0.4D}}, var7, var8, var23, var6, true);
            }

            if(var22 == 4) {
               this.u(var7, var8, var23, var6);
            }

            this.W(0.25D, 2, var7, var8, var23, var6);
            int var9 = var7[0];
            float var10 = (float)((var9 & 16711680) >> 16) / 255.0F;
            float var11 = (float)((var9 & '\uff00') >> 8) / 255.0F;
            float var12 = (float)((var9 & 255) >> 0) / 255.0F;
            cf.b var13 = new cf.b(this.e, this.K, this.C, this.A);
            var13.W(var10, var11, var12);
            this.v.N(var13);
         }

         ++this.I;
         if(this.I > this.a) {
            if(this.q) {
               boolean var15 = this.A();
               net.yz.a var19 = net.nb.l.DM;
               this.e.m(this.K, this.C, this.A, var19, net.yz.p.AMBIENT, 20.0F, 0.9F + this.k.nextFloat() * 0.15F, true);
            }

            this.Z();
         }

      }

      private boolean A() {
         net.nn.j var1 = net.nn.j.b();
         return var1.A() == null || var1.A().o(this.K, this.C, this.A) >= 256.0D;
      }

      private void z(double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16) {
         cf.z var17 = new cf.z(this.e, var1, var3, var5, var7, var9, var11, this.v);
         var17.n(0.99F);
         var17.u(var15);
         var17.D(var16);
         int var18 = this.k.nextInt(var13.length);
         var17.o(var13[var18]);
         if(var14.length > 0) {
            var17.M(var14[this.k.nextInt(var14.length)]);
         }

         this.v.N(var17);
      }

      private void W(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
         double var8 = this.K;
         double var10 = this.C;
         double var12 = this.A;

         for(int var14 = -var3; var14 <= var3; ++var14) {
            for(int var15 = -var3; var15 <= var3; ++var15) {
               for(int var16 = -var3; var16 <= var3; ++var16) {
                  double var17 = (double)var15 + (this.k.nextDouble() - this.k.nextDouble()) * 0.5D;
                  double var19 = (double)var14 + (this.k.nextDouble() - this.k.nextDouble()) * 0.5D;
                  double var21 = (double)var16 + (this.k.nextDouble() - this.k.nextDouble()) * 0.5D;
                  double var23 = (double)net.u.t.R(var17 * var17 + var19 * var19 + var21 * var21) / var1 + this.k.nextGaussian() * 0.05D;
                  this.z(var8, var10, var12, var17 / var23, var19 / var23, var21 / var23, var4, var5, var6, var7);
                  if(var14 != -var3 && var14 != var3 && var15 != -var3 && var15 != var3) {
                     var16 += var3 * 2 - 1;
                  }
               }
            }
         }

      }

      private void h(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
         double var9 = var3[0][0];
         double var11 = var3[0][1];
         this.z(this.K, this.C, this.A, var9 * var1, var11 * var1, 0.0D, var4, var5, var6, var7);
         float var13 = this.k.nextFloat() * 3.1415927F;
         double var14 = 0.034D;
         int var16 = 0;

         while(true) {
            double var17 = (double)var13 + (double)((float)var16 * 3.1415927F) * var14;
            byte var23 = 1;
            if(var23 < var3.length) {
               double var24 = var3[var23][0];
               double var26 = var3[var23][1];
               double var28 = 0.25D;
               double var40;
               int var10000 = (var40 = var28 - 1.0D) == 0.0D?0:(var40 < 0.0D?-1:1);
               double var30 = (var9 + (var24 - var9) * var28) * var1;
               double var32 = (var11 + (var26 - var11) * var28) * var1;
               double var34 = var30 * Math.sin(var17);
               var30 = var30 * Math.cos(var17);
               double var36 = -1.0D;

               while(true) {
                  double var41;
                  var10000 = (var41 = var36 - 1.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
                  this.z(this.K, this.C, this.A, var30 * var36, var32, var34 * var36, var4, var5, var6, var7);
                  var36 += 2.0D;
               }
            }

            ++var16;
         }
      }

      private void u(int[] var1, int[] var2, boolean var3, boolean var4) {
         double var5 = this.k.nextGaussian() * 0.05D;
         double var7 = this.k.nextGaussian() * 0.05D;
         int var9 = 0;

         while(true) {
            double var10 = this.B * 0.5D + this.k.nextGaussian() * 0.15D + var5;
            double var12 = this.L * 0.5D + this.k.nextGaussian() * 0.15D + var7;
            double var14 = this.R * 0.5D + this.k.nextDouble() * 0.5D;
            this.z(this.K, this.C, this.A, var10, var14, var12, var1, var2, var3, var4);
            ++var9;
         }
      }

      public int n() {
         return 0;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends ca {
      private boolean G;
      private boolean Z;
      private final c7 o;
      private float Bc;
      private float v;
      private float b;
      private boolean f;

      public z(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, c7 var14) {
         super(var1, var2, var4, var6, 160, 8, -0.004F);
         this.B = var8;
         this.R = var10;
         this.L = var12;
         this.o = var14;
         this.g *= 0.75F;
         this.a = 48 + this.k.nextInt(12);
      }

      public void u(boolean var1) {
         this.G = var1;
      }

      public void D(boolean var1) {
         this.Z = var1;
      }

      public boolean u() {
         return true;
      }

      public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
         if(!this.Z || this.x < this.a / 3 || (this.x + this.a) / 3 % 2 == 0) {
            super.A(var1, var2, var3, var4, var5, var6, var7, var8);
         }

      }

      public void f() {
         x.f();
         super.f();
         if(this.G && this.x < this.a / 2 && (this.x + this.a) % 2 == 0) {
            cf.z var2 = new cf.z(this.e, this.K, this.C, this.A, 0.0D, 0.0D, 0.0D, this.o);
            var2.n(0.99F);
            var2.W(this.N, this.F, this.V);
            var2.x = var2.a / 2;
            if(this.f) {
               var2.f = true;
               var2.Bc = this.Bc;
               var2.v = this.v;
               var2.b = this.b;
            }

            var2.Z = this.Z;
            this.o.N(var2);
         }

      }

      private static xn b(xn var0) {
         return var0;
      }
   }
}
