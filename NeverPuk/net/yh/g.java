package net.yh;

import net.xn;
import net.y9.g5;
import net.yh.c;
import net.yh.x;
import net.yz.ai;

public class g extends x {
   private final net.y1.l j;
   private int D;

   protected g(net.yv.r var1, double var2, double var4, double var6, net.y1.l var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
      if(var8 == net.y1.l.p) {
         this.N = 0.0F;
         this.F = 0.0F;
         this.V = 1.0F;
      } else {
         this.N = 1.0F;
         this.F = 0.0F;
         this.V = 0.0F;
      }

      this.Y(113);
      this.O(0.01F, 0.01F);
      this.u = 0.06F;
      this.j = var8;
      this.D = 40;
      this.a = (int)(64.0D / (Math.random() * 0.8D + 0.2D));
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
   }

   public int g(float var1) {
      return this.j == net.y1.l.p?super.g(var1):257;
   }

   public void f() {
      this.i = this.K;
      x.f();
      this.m = this.C;
      this.O = this.A;
      if(this.j == net.y1.l.p) {
         this.N = 0.2F;
         this.F = 0.3F;
         this.V = 1.0F;
      }

      this.N = 1.0F;
      this.F = 16.0F / (float)(40 - this.D + 16);
      this.V = 4.0F / (float)(40 - this.D + 8);
      this.R -= (double)this.u;
      if(this.D-- > 0) {
         this.B *= 0.02D;
         this.R *= 0.02D;
         this.L *= 0.02D;
         this.Y(113);
      }

      this.Y(112);
      this.f(this.B, this.R, this.L);
      this.B *= 0.9800000190734863D;
      this.R *= 0.9800000190734863D;
      this.L *= 0.9800000190734863D;
      if(this.a-- <= 0) {
         this.Z();
      }

      if(this.T) {
         if(this.j == net.y1.l.p) {
            this.Z();
            this.e.n(ai.WATER_SPLASH, this.K, this.C, this.A, 0.0D, 0.0D, 0.0D, new int[0]);
         }

         this.Y(114);
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

      net.u.j var2 = new net.u.j(this.K, this.C, this.A);
      net.yw.n var3 = this.e.Z(var2);
      net.y1.l var4 = var3.n();
      if(var4.y() || var4.B()) {
         double var5 = 0.0D;
         if(var3.Q() instanceof g5) {
            var5 = (double)g5.P(((Integer)var3.i(g5.J)).intValue());
         }

         double var7 = (double)(net.u.t.L(this.C) + 1) - var5;
         if(this.C < var7) {
            this.Z();
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class h implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new g(var2, var3, var5, var7, net.y1.l.p);
      }
   }

   public static class m implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new g(var2, var3, var5, var7, net.y1.l.U);
      }
   }
}
