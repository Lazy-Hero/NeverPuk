package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.m;
import net.nk.n;
import net.nk.q;
import net.nl.z2;
import net.yz.m_;

public class k extends q {
   public k(net.yv.r var1) {
      super(var1);
      this.S(0.7F, 2.4F);
      this.hw = true;
   }

   public static void I(net.c0.d var0) {
      net.ne.y.J(var0, k.class);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.g;
   }

   protected net.yz.a T() {
      return net.nb.l.Hh;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.DI;
   }

   protected net.yz.a r() {
      return net.nb.l.C6;
   }

   net.yz.a R() {
      return net.nb.l.Hf;
   }

   public void O(net.yz.z var1) {
      n.o.y();
      super.O(var1);
      if(var1.v() instanceof m) {
         m var3 = (m)var1.v();
         if(var3.nl() && var3.nn()) {
            var3.H();
            this.O(new ks(net.nb.j.Y9, 1, 1), 0.0F);
         }
      }

   }

   protected void T(net.yv.g var1) {
      this.u(z2.MAINHAND, new ks(net.nb.j.S0));
   }

   protected void I(net.yv.g var1) {
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      net.ne.g var3 = super.t(var1, var2);
      this.t(net.ne.d.S).t(4.0D);
      this.H();
      return var3;
   }

   public float A() {
      return 2.1F;
   }

   public boolean S(net.ne.l var1) {
      if(!super.S(var1)) {
         return false;
      } else {
         if(var1 instanceof net.ne.a) {
            ((net.ne.a)var1).o(new net.n_.i(net.nb.b.e, 200));
         }

         return true;
      }
   }

   protected net.n1.o c(float var1) {
      net.n1.o var2 = super.c(var1);
      var2.n(100);
      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
