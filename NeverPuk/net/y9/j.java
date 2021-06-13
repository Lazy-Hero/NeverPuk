package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.q;

public class j extends q {
   public static final net.yr.l i = net.yr.l.J("power", 0, 15);
   private final int n;

   protected j(net.y1.l var1, int var2) {
      this(var1, var2, var1.f());
   }

   protected j(net.y1.l var1, int var2, net.y1.h var3) {
      super(var1, var3);
      this.r(this.b.T().s(i, Integer.valueOf(0)));
      this.n = var2;
   }

   protected int v(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      int var4 = Math.min(var1.p(net.ne.l.class, a.c(var2)).size(), this.n);
      if(var4 > 0) {
         float var5 = (float)Math.min(this.n, var4) / (float)this.n;
         return net.u.t.Y(var5 * 15.0F);
      } else {
         return 0;
      }
   }

   protected void z(net.yv.r var1, net.u.j var2) {
      var1.M((net.r.r)null, var2, net.nb.l.Ct, net.yz.p.BLOCKS, 0.3F, 0.90000004F);
   }

   protected void p(net.yv.r var1, net.u.j var2) {
      var1.M((net.r.r)null, var2, net.nb.l.Dx, net.yz.p.BLOCKS, 0.3F, 0.75F);
   }

   protected int V(net.yw.n var1) {
      return ((Integer)var1.i(i)).intValue();
   }

   protected net.yw.n h(net.yw.n var1, int var2) {
      return var1.s(i, Integer.valueOf(var2));
   }

   public int u(net.yv.r var1) {
      return 10;
   }

   public net.yw.n D(int var1) {
      return this.p().s(i, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(i)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{i});
   }

   private static xn b(xn var0) {
      return var0;
   }
}
