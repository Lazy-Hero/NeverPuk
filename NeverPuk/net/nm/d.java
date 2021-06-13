package net.nm;

import net.xn;
import net.nm.w;
import net.yz.m_;

public class d extends w {
   private final net.ni.r NK = new net.ni.r() {
      public void Y(int var1) {
         d.this.hl.k(d.this, (byte)var1);
      }

      public net.yv.r k() {
         return d.this.hl;
      }

      public net.u.j P() {
         return new net.u.j(d.this);
      }
   };

   public d(net.yv.r var1) {
      super(var1);
   }

   public d(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void i(net.c0.d var0) {
      L(var0, d.class);
      var0.U(net.c0.q.ENTITY, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            w.h.u();
            String var5 = var2.J("id");
            if(net.ne.v.P(d.class).equals(new m_(var5))) {
               var2.b("id", net.ni.v.p(net.ni.u.class).toString());
               var1.w(net.c0.q.BLOCK_ENTITY, var2, var3);
               var2.b("id", var5);
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public w.h R() {
      return w.h.SPAWNER;
   }

   public net.yw.n M() {
      return net.nb.f.uw.p();
   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      this.NK.u(var1);
   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      this.NK.y(var1);
   }

   public void R(byte var1) {
      this.NK.l(var1);
   }

   public void A() {
      super.A();
      this.NK.i();
   }
}
