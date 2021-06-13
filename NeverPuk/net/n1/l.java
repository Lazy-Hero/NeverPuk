package net.n1;

import net.xn;
import net.c0.d;
import net.n0.ks;
import net.n1.o;
import net.n_.i;
import net.yv.r;
import net.yz.ai;

public class l extends o {
   private int Uh = 200;

   public l(r var1) {
      super(var1);
   }

   public l(r var1, net.ne.a var2) {
      super(var1, var2);
   }

   public l(r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public void A() {
      o.s.H();
      super.A();
      if(this.hl.x && !this.k_) {
         this.hl.n(ai.SPELL_INSTANT, this.b, this.hS, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   protected ks C() {
      return new ks(net.nb.j.WT);
   }

   protected void d(net.ne.a var1) {
      super.d(var1);
      i var2 = new i(net.nb.b.r, this.Uh, 0);
      var1.o(var2);
   }

   public static void Y(d var0) {
      o.w(var0, "SpectralArrow");
   }

   public void o(net.nj.f var1) {
      String var2 = o.s.H();
      super.o(var1);
      if(var1.G("Duration")) {
         this.Uh = var1.P("Duration");
      }

   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Duration", this.Uh);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
