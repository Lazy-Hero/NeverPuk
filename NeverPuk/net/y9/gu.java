package net.y9;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.gh;

public class gu extends gh {
   public static final net.yr.w E = net.yr.w.L("variant", gc.i.class, new Predicate() {
      public boolean O(@Nullable gc.i var1) {
         int[] var2 = g3.v.w();
         return var1.B() >= 4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });

   public gu() {
      this.r(this.b.T().s(E, gc.i.ACACIA).s(u, Boolean.valueOf(true)).s(N, Boolean.valueOf(true)));
   }

   protected void J(net.yv.r var1, net.u.j var2, net.yw.n var3, int var4) {
      if(var3.i(E) == gc.i.DARK_OAK && var1.G.nextInt(var4) == 0) {
         e(var1, var2, new ks(net.nb.j.W8));
      }

   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(E)).B();
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this, 1, var3.Q().d(var3) & 3);
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, 0));
      var2.add(new ks(this, 1, 1));
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.n0.y.q(this), 1, ((gc.i)var1.i(E)).B() - 4);
   }

   public net.yw.n D(int var1) {
      return this.p().s(E, this.x(var1)).s(N, Boolean.valueOf((var1 & 4) == 0)).s(u, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      g3.v.w();
      int var3 = 0;
      var3 = var3 | ((gc.i)var1.i(E)).B() - 4;
      if(!((Boolean)var1.i(N)).booleanValue()) {
         var3 |= 4;
      }

      if(((Boolean)var1.i(u)).booleanValue()) {
         var3 |= 8;
      }

      return var3;
   }

   public gc.i x(int var1) {
      return gc.i.r((var1 & 3) + 4);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{E, u, N});
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      int[] var7 = g3.v.w();
      if(!var1.x && var6.Z() == net.nb.j.W5) {
         var2.S(net.v.q.i(this));
         e(var1, var3, new ks(net.n0.y.q(this), 1, ((gc.i)var4.i(E)).B() - 4));
      }

      super.U(var1, var2, var3, var4, var5, var6);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
