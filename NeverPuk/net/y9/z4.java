package net.y9;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.r;
import net.yz.a5;
import net.yz.aq;

public abstract class z4 extends l implements r {
   protected z4(net.y1.l var1) {
      this(var1, var1.f());
   }

   protected z4(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
      this.U = true;
   }

   protected boolean O(net.yv.r var1, net.u.j var2, aq var3) {
      return var1.Z(var2.C(var3)).n() == net.y1.l.B;
   }

   protected boolean H(net.yv.r var1, net.u.j var2) {
      return this.O(var1, var2, aq.NORTH) || this.O(var1, var2, aq.SOUTH) || this.O(var1, var2, aq.WEST) || this.O(var1, var2, aq.EAST);
   }

   public a5 o(net.yw.n var1) {
      return a5.INVISIBLE;
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      var1.j(var2);
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      int[] var7 = g3.v.w();
      if(var5 instanceof net.yv.y && ((net.yv.y)var5).H()) {
         var2.S(net.v.q.i(this));
         var2.Z(0.005F);
         if(var1.x) {
            return;
         }

         int var8 = net.c1.y.g(net.nb.u.C, var6);
         net.n0.y var9 = this.X(var4, var1.G, var8);
         if(var9 == net.nb.j.SL) {
            return;
         }

         ks var10 = new ks(var9, this.T(var1.G));
         var10.m(((net.yv.y)var5).Q());
         e(var1, var3, var10);
      }

      super.U(var1, var2, var3, var4, (net.ni.v)null, var6);
   }

   public boolean T(net.yw.n var1, net.yv.r var2, net.u.j var3, int var4, int var5) {
      super.T(var1, var2, var3, var4, var5);
      net.ni.v var6 = var2.L(var3);
      return var6.q(var4, var5);
   }

   private static xn c(xn var0) {
      return var0;
   }
}
