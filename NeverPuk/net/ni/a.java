package net.ni;

import net.xn;
import net.ni.v;
import net.ni.w;

public abstract class a extends v implements net.yv.x {
   private net.yv.f s = net.yv.f.Q;

   public void G(net.nj.f var1) {
      super.G(var1);
      this.s = net.yv.f.S(var1);
   }

   public net.nj.f b(net.nj.f var1) {
      int[] var2 = w.C();
      super.b(var1);
      if(this.s != null) {
         this.s.e(var1);
      }

      return var1;
   }

   public boolean U() {
      int[] var1 = w.C();
      return this.s != null && !this.s.T();
   }

   public net.yv.f z() {
      return this.s;
   }

   public void P(net.yv.f var1) {
      this.s = var1;
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   private static xn c(xn var0) {
      return var0;
   }
}
