package net.yh;

import java.util.List;
import java.util.Random;

public class x {
   private static final net.u.e y = new net.u.e(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
   protected net.yv.r e;
   protected double i;
   protected double m;
   protected double O;
   protected double K;
   protected double C;
   protected double A;
   protected double B;
   protected double R;
   protected double L;
   private net.u.e H;
   protected boolean T;
   protected boolean Q;
   protected boolean W;
   protected float E;
   protected float S;
   protected Random k;
   protected int l;
   protected int M;
   protected float r;
   protected float s;
   protected int x;
   protected int a;
   protected float g;
   protected float u;
   protected float N;
   protected float F;
   protected float V;
   protected float Y;
   protected net.n9.v t;
   protected float h;
   protected float w;
   public static double X;
   public static double z;
   public static double U;
   public static net.u.r c;
   private static int[] p;

   protected x(net.yv.r var1, double var2, double var4, double var6) {
      this.H = y;
      this.E = 0.6F;
      this.S = 1.8F;
      this.k = new Random();
      this.Y = 1.0F;
      this.e = var1;
      this.O(0.2F, 0.2F);
      this.P(var2, var4, var6);
      this.i = var2;
      this.m = var4;
      this.O = var6;
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.r = this.k.nextFloat() * 3.0F;
      this.s = this.k.nextFloat() * 3.0F;
      this.g = (this.k.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.a = (int)(4.0F / (this.k.nextFloat() * 0.9F + 0.1F));
      this.x = 0;
      this.Q = true;
   }

   public x(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.B = var8 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
      this.R = var10 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
      this.L = var12 + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D;
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = net.u.t.R(this.B * this.B + this.R * this.R + this.L * this.L);
      this.B = this.B / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.R = this.R / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.L = this.L / (double)var15 * (double)var14 * 0.4000000059604645D;
   }

   public x N(float var1) {
      this.B *= (double)var1;
      this.R = (this.R - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.L *= (double)var1;
      return this;
   }

   public x A(float var1) {
      this.O(0.2F * var1, 0.2F * var1);
      this.g *= var1;
      return this;
   }

   public void W(float var1, float var2, float var3) {
      this.N = var1;
      this.F = var2;
      this.V = var3;
   }

   public void n(float var1) {
      this.Y = var1;
   }

   public boolean u() {
      return false;
   }

   public float n() {
      return this.N;
   }

   public float x() {
      return this.F;
   }

   public float T() {
      return this.V;
   }

   public void u(int var1) {
      this.a = var1;
   }

   public void f() {
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.R -= 0.04D * (double)this.u;
      this.f(this.B, this.R, this.L);
      this.B *= 0.9800000190734863D;
      this.R *= 0.9800000190734863D;
      this.L *= 0.9800000190734863D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = (float)this.l / 16.0F;
      f();
      float var11 = var10 + 0.0624375F;
      float var12 = (float)this.M / 16.0F;
      float var13 = var12 + 0.0624375F;
      float var14 = 0.1F * this.g;
      if(this.t != null) {
         var10 = this.t.q();
         var11 = this.t.o();
         var12 = this.t.n();
         var13 = this.t.r();
      }

      float var15 = (float)(this.i + (this.K - this.i) * (double)var3 - X);
      float var16 = (float)(this.m + (this.C - this.m) * (double)var3 - z);
      float var17 = (float)(this.O + (this.A - this.O) * (double)var3 - U);
      int var18 = this.g(var3);
      int var19 = var18 >> 16 & '\uffff';
      int var20 = var18 & '\uffff';
      net.u.r[] var21 = new net.u.r[]{new net.u.r((double)(-var4 * var14 - var7 * var14), (double)(-var5 * var14), (double)(-var6 * var14 - var8 * var14)), new net.u.r((double)(-var4 * var14 + var7 * var14), (double)(var5 * var14), (double)(-var6 * var14 + var8 * var14)), new net.u.r((double)(var4 * var14 + var7 * var14), (double)(var5 * var14), (double)(var6 * var14 + var8 * var14)), new net.u.r((double)(var4 * var14 - var7 * var14), (double)(-var5 * var14), (double)(var6 * var14 - var8 * var14))};
      if(this.h != 0.0F) {
         float var22 = this.h + (this.h - this.w) * var3;
         float var23 = net.u.t.m(var22 * 0.5F);
         float var24 = net.u.t.A(var22 * 0.5F) * (float)c.p;
         float var25 = net.u.t.A(var22 * 0.5F) * (float)c.H;
         float var26 = net.u.t.A(var22 * 0.5F) * (float)c.a;
         net.u.r var27 = new net.u.r((double)var24, (double)var25, (double)var26);
         int var28 = 0;
         var21[var28] = var27.T(2.0D * var21[var28].d(var27)).v(var21[var28].T((double)(var23 * var23) - var27.d(var27))).v(var27.M(var21[var28]).T((double)(2.0F * var23)));
         ++var28;
         net.u.d.h(new net.u.d[1]);
      }

      var1.H((double)var15 + var21[0].p, (double)var16 + var21[0].H, (double)var17 + var21[0].a).Y((double)var11, (double)var13).m(this.N, this.F, this.V, this.Y).C(var19, var20).W();
      var1.H((double)var15 + var21[1].p, (double)var16 + var21[1].H, (double)var17 + var21[1].a).Y((double)var11, (double)var12).m(this.N, this.F, this.V, this.Y).C(var19, var20).W();
      var1.H((double)var15 + var21[2].p, (double)var16 + var21[2].H, (double)var17 + var21[2].a).Y((double)var10, (double)var12).m(this.N, this.F, this.V, this.Y).C(var19, var20).W();
      var1.H((double)var15 + var21[3].p, (double)var16 + var21[3].H, (double)var17 + var21[3].a).Y((double)var10, (double)var13).m(this.N, this.F, this.V, this.Y).C(var19, var20).W();
   }

   public int n() {
      return 0;
   }

   public void p(net.n9.v var1) {
      int var2 = this.n();
      if(var2 == 1) {
         this.t = var1;
      } else {
         throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
      }
   }

   public void Y(int var1) {
      if(this.n() != 0) {
         throw new RuntimeException("Invalid call to Particle.setMiscTex");
      } else {
         this.l = var1 % 16;
         this.M = var1 / 16;
      }
   }

   public void R() {
      ++this.l;
   }

   public String toString() {
      return this.getClass().getSimpleName() + ", Pos (" + this.K + "," + this.C + "," + this.A + "), RGBA (" + this.N + "," + this.F + "," + this.V + "," + this.Y + "), Age " + this.x;
   }

   public void Z() {
      this.W = true;
   }

   protected void O(float var1, float var2) {
      if(var1 != this.E || var2 != this.S) {
         this.E = var1;
         this.S = var2;
         net.u.e var3 = this.I();
         this.K(new net.u.e(var3.n, var3.u, var3.N, var3.n + (double)this.E, var3.u + (double)this.S, var3.N + (double)this.E));
      }

   }

   public void P(double var1, double var3, double var5) {
      this.K = var1;
      this.C = var3;
      this.A = var5;
      float var7 = this.E / 2.0F;
      float var8 = this.S;
      this.K(new net.u.e(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   public void f(double var1, double var3, double var5) {
      double var7 = var3;
      if(this.Q) {
         List var9 = this.e.h((net.ne.l)null, this.I().T(var1, var3, var5));

         for(net.u.e var11 : var9) {
            var3 = var11.j(this.I(), var3);
         }

         this.K(this.I().w(0.0D, var3, 0.0D));

         for(net.u.e var14 : var9) {
            var1 = var14.s(this.I(), var1);
         }

         this.K(this.I().w(var1, 0.0D, 0.0D));

         for(net.u.e var15 : var9) {
            var5 = var15.N(this.I(), var5);
         }

         this.K(this.I().w(0.0D, 0.0D, var5));
      } else {
         this.K(this.I().w(var1, var3, var5));
      }

      this.n();
      this.T = var3 != var3 && var7 < 0.0D;
      if(var1 != var1) {
         this.B = 0.0D;
      }

      if(var5 != var5) {
         this.L = 0.0D;
      }

   }

   protected void n() {
      net.u.e var1 = this.I();
      this.K = (var1.n + var1.d) / 2.0D;
      this.C = var1.u;
      this.A = (var1.N + var1.r) / 2.0D;
   }

   public int g(float var1) {
      net.u.j var2 = new net.u.j(this.K, this.C, this.A);
      return this.e.o(var2)?this.e.z(var2, 0):0;
   }

   public boolean O() {
      return !this.W;
   }

   public net.u.e I() {
      return this.H;
   }

   public void K(net.u.e var1) {
      this.H = var1;
   }

   static {
      e(new int[3]);
   }

   public static void e(int[] var0) {
      p = var0;
   }

   public static int[] f() {
      return p;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
