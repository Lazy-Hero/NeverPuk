package net.nm;

import net.xn;
import net.n0.y;
import net.nm.u;
import net.nm.w;
import net.y9.z_;
import net.yz.aq;

public class t extends u {
   public t(net.yv.r var1) {
      super(var1);
   }

   public t(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void C(net.c0.d var0) {
      u.V(var0, t.class);
   }

   public void n(net.yz.z var1) {
      w.h.s();
      super.n(var1);
      if(this.hl.N().b("doEntityDrops")) {
         this.v(y.q(net.nb.f.uG), 1, 0.0F);
      }

   }

   public int e() {
      return 27;
   }

   public w.h R() {
      return w.h.CHEST;
   }

   public net.yw.n M() {
      return net.nb.f.uG.p().s(z_.R, aq.NORTH);
   }

   public int D() {
      return 8;
   }

   public String H() {
      return "minecraft:chest";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      this.n(var2);
      return new net.nl.a(var1, this, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
