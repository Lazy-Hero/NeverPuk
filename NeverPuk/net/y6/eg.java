package net.y6;

import net.xn;
import net.y6.jb;

public class eg extends net.y6.z {
   public jb Q;
   public jb P;
   public jb k;
   public jb b;
   public jb B;
   public jb l;

   public eg() {
      this(0.0F);
   }

   public eg(float var1) {
      this(var1, -7.0F);
   }

   public eg(float var1, float var2) {
      boolean var10000 = true;
      var10000 = true;
      this.Q = (new jb(this)).R(128, 128);
      this.Q.n(0.0F, 0.0F + var2, -2.0F);
      this.Q.k(0, 0).d(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.Q.k(24, 0).d(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      this.P = (new jb(this)).R(128, 128);
      this.P.n(0.0F, 0.0F + var2, 0.0F);
      this.P.k(0, 40).d(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.P.k(0, 70).d(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      this.k = (new jb(this)).R(128, 128);
      this.k.n(0.0F, -7.0F, 0.0F);
      this.k.k(60, 21).d(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.b = (new jb(this)).R(128, 128);
      this.b.n(0.0F, -7.0F, 0.0F);
      this.b.k(60, 58).d(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      this.B = (new jb(this, 0, 22)).R(128, 128);
      this.B.n(-4.0F, 18.0F + var2, 0.0F);
      this.B.k(37, 0).d(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      this.l = (new jb(this, 0, 22)).R(128, 128);
      this.l.x = true;
      this.l.k(60, 0).n(5.0F, 18.0F + var2, 0.0F);
      this.l.d(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.Q.B(var7);
      this.P.B(var7);
      this.B.B(var7);
      this.l.B(var7);
      this.k.B(var7);
      this.b.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.Q.N = var4 * 0.017453292F;
      this.Q.b = var5 * 0.017453292F;
      this.B.b = -1.5F * this.k(var1, 13.0F) * var2;
      this.l.b = 1.5F * this.k(var1, 13.0F) * var2;
      this.B.N = 0.0F;
      this.l.N = 0.0F;
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      net.y6.z.C();
      net.nk.b var6 = (net.nk.b)var1;
      int var7 = var6.o();
      if(var7 > 0) {
         this.k.b = -2.0F + 1.5F * this.k((float)var7 - var4, 10.0F);
         this.b.b = -2.0F + 1.5F * this.k((float)var7 - var4, 10.0F);
      }

      int var8 = var6.t();
      this.k.b = -0.8F + 0.025F * this.k((float)var8, 70.0F);
      this.b.b = 0.0F;
      this.k.b = (-0.2F + 1.5F * this.k(var2, 13.0F)) * var3;
      this.b.b = (-0.2F - 1.5F * this.k(var2, 13.0F)) * var3;
   }

   private float k(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
