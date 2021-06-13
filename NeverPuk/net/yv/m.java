package net.yv;

import net.xn;
import net.yv.d;
import net.yv.ov;
import net.yv.r;

public class m extends d {
   private final d P_;

   public m(net.nx.f var1, net.cg.d var2, int var3, d var4, net.yk.t var5) {
      super(var1, var2, new net.cg.k(var4.B()), var3, var5);
      this.P_ = var4;
      var4.T().H(new net.nz.v() {
         public void q(net.nz.p var1, double var2) {
            m.this.T().h(var2);
         }

         public void A(net.nz.p var1, double var2, double var4, long var6) {
            m.this.T().n(var2, var4, var6);
         }

         public void D(net.nz.p var1, double var2, double var4) {
            m.this.T().w(var2, var4);
         }

         public void E(net.nz.p var1, int var2) {
            m.this.T().D(var2);
         }

         public void f(net.nz.p var1, int var2) {
            m.this.T().H(var2);
         }

         public void L(net.nz.p var1, double var2) {
            m.this.T().t(var2);
         }

         public void t(net.nz.p var1, double var2) {
            m.this.T().B(var2);
         }
      });
   }

   protected void m() throws ov {
   }

   public r H() {
      this.i = this.P_.M();
      r.C();
      this.H = this.P_.J();
      this.b = this.P_.o();
      this.O = this.P_.C();
      String var2 = net.nq.w.j(this.F);
      net.nq.w var3 = (net.nq.w)this.i.a(net.nq.w.class, var2);
      if(var3 == null) {
         this.P = new net.nq.w(this);
         this.i.z(var2, this.P);
      }

      this.P = var3;
      this.P.e((r)this);
      return this;
   }

   public void S() {
      this.F.y();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
