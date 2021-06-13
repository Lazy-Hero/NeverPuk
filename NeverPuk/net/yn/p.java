package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yn.j;
import net.yz.m_;

public class p extends j {
   public p(net.yv.r var1) {
      super(var1);
   }

   public static void O(net.c0.d var0) {
      j.t(var0, p.class);
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(15.0D);
      this.t(net.ne.d.G).t(0.20000000298023224D);
      this.t(NA).t(this.o());
   }

   public net.ne.u g() {
      return net.ne.u.UNDEAD;
   }

   protected net.yz.a T() {
      super.T();
      return net.nb.l.Pr;
   }

   protected net.yz.a r() {
      super.r();
      return net.nb.l.oZ;
   }

   protected net.yz.a m(net.yz.z var1) {
      super.m(var1);
      return net.nb.l.v;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.d;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      boolean var5 = !var4.B();
      if(!this.Up()) {
         return false;
      } else if(this.H9()) {
         return super.R(var1, var2);
      } else if(var1.Q()) {
         this.t(var1);
         return true;
      } else if(this.t()) {
         return super.R(var1, var2);
      } else {
         this.n(var1);
         return true;
      }
   }

   private static xn d(xn var0) {
      return var0;
   }
}
