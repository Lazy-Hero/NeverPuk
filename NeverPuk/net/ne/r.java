package net.ne;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ne.d;
import net.ne.m;
import net.nl.zw;

public class r implements m {
   private final zw N;
   private final net.r.r X;
   private net.nq.z Z;
   private final net.cb.t d;

   public r(net.r.r var1, net.cb.t var2) {
      this.X = var1;
      this.d = var2;
      this.N = new zw(var1, this);
   }

   @Nullable
   public net.r.r p() {
      return this.X;
   }

   public void E(@Nullable net.r.r var1) {
   }

   @Nullable
   public net.nq.z L(net.r.r var1) {
      return this.Z;
   }

   public void A(@Nullable net.nq.z var1) {
      this.Z = var1;
   }

   public void P(net.nq.x var1) {
      var1.c();
   }

   public void L(ks var1) {
   }

   public net.cb.t b() {
      boolean var1 = d.p();
      return (net.cb.t)(this.d != null?this.d:new net.cb.h("entity.Villager.name", new Object[0]));
   }

   public net.yv.r m() {
      return this.X.hl;
   }

   public net.u.j P() {
      return new net.u.j(this.X);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
