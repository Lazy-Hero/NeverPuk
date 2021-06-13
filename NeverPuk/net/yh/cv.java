package net.yh;

import net.xn;
import net.y9.g5;
import net.yh.c;
import net.yh.x;

public class cv extends x {
   protected cv(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.30000001192092896D;
      this.R = Math.random() * 0.20000000298023224D + 0.10000000149011612D;
      this.L *= 0.30000001192092896D;
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.Y(19 + this.k.nextInt(4));
      this.O(0.01F, 0.01F);
      this.u = 0.06F;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      this.R -= (double)this.u;
      this.f(this.B, this.R, this.L);
      this.B *= 0.9800000190734863D;
      this.R *= 0.9800000190734863D;
      this.L *= 0.9800000190734863D;
      if(this.a-- <= 0) {
         this.Z();
      }

      if(this.T) {
         if(Math.random() < 0.5D) {
            this.Z();
         }

         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

      net.u.j var2 = new net.u.j(this.K, this.C, this.A);
      net.yw.n var3 = this.e.Z(var2);
      net.y1.l var4 = var3.n();
      if(var4.y() || var4.B()) {
         if(var3.Q() instanceof g5) {
            double var5 = (double)(1.0F - g5.P(((Integer)var3.i(g5.J)).intValue()));
         }

         double var9 = var3.q(this.e, var2).c;
         double var7 = (double)net.u.t.L(this.C) + var9;
         if(this.C < var7) {
            this.Z();
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class z implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new cv(var2, var3, var5, var7);
      }
   }
}
