package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.q;

public class u extends q {
   public static final net.yr.o r = net.yr.o.k("powered");
   private final u.g d;

   protected u(net.y1.l var1, u.g var2) {
      super(var1);
      this.r(this.b.T().s(r, Boolean.valueOf(false)));
      this.d = var2;
   }

   protected int V(net.yw.n var1) {
      return ((Boolean)var1.i(r)).booleanValue()?15:0;
   }

   protected net.yw.n h(net.yw.n var1, int var2) {
      return var1.s(r, Boolean.valueOf(true));
   }

   protected void z(net.yv.r var1, net.u.j var2) {
      if(this.C == net.y1.l.S) {
         var1.M((net.r.r)null, var2, net.nb.l.CB, net.yz.p.BLOCKS, 0.3F, 0.8F);
      } else {
         var1.M((net.r.r)null, var2, net.nb.l.Mj, net.yz.p.BLOCKS, 0.3F, 0.6F);
      }

   }

   protected void p(net.yv.r var1, net.u.j var2) {
      if(this.C == net.y1.l.S) {
         var1.M((net.r.r)null, var2, net.nb.l.Ps, net.yz.p.BLOCKS, 0.3F, 0.7F);
      } else {
         var1.M((net.r.r)null, var2, net.nb.l.Mg, net.yz.p.BLOCKS, 0.3F, 0.5F);
      }

   }

   protected int v(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      net.u.e var4 = a.c(var2);
      switch(null.x[this.d.ordinal()]) {
      case 1:
         var1.u((net.ne.l)null, var4);
      case 2:
         var1.p(net.ne.a.class, var4);
      default:
         return 0;
      }
   }

   public net.yw.n D(int var1) {
      return this.p().s(r, Boolean.valueOf(var1 == 1));
   }

   public int d(net.yw.n var1) {
      return ((Boolean)var1.i(r)).booleanValue()?1:0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{r});
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum g {
      EVERYTHING,
      MOBS;
   }
}
