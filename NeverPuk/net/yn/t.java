package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yn.i;
import net.yz.ai;
import net.yz.m_;

public class t extends i {
   public t(net.yv.r var1) {
      super(var1);
      this.S(0.9F, 1.4F);
      this.Mt = net.nb.f.u2;
   }

   public static void I(net.c0.d var0) {
      net.ne.y.J(var0, t.class);
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      if(var4.Z() == net.nb.j.o && this.z() >= 0 && !var1.a6.V) {
         var4.H(1);
         if(var4.B()) {
            var1.e(var2, new ks(net.nb.j.Z));
         }

         if(!var1.a8.D(new ks(net.nb.j.Z))) {
            var1.Y(new ks(net.nb.j.Z), false);
         }

         return true;
      } else if(var4.Z() == net.nb.j.W5 && this.z() >= 0) {
         this.B();
         this.hl.n(ai.EXPLOSION_LARGE, this.b, this.hS + (double)(this.m / 2.0F), this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
         if(!this.hl.x) {
            i var5 = new i(this.hl);
            var5.S(this.b, this.hS, this.hr, this.hN, this.V);
            var5.u(this.h());
            var5.AK = this.AK;
            if(this.H()) {
               var5.K(this.X());
            }

            this.hl.S(var5);
            int var6 = 0;
            this.hl.S(new net.nm.i(this.hl, this.b, this.hS + (double)this.m, this.hr, new ks(net.nb.f.T)));
            ++var6;
            var4.S(1, var1);
            this.I(net.nb.l.wH, 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.R(var1, var2);
      }
   }

   public t O(net.ne.j var1) {
      return new t(this.hl);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.q;
   }

   private static xn e(xn var0) {
      return var0;
   }
}
