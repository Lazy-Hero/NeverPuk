package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.i;
import net.nk.n;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.ai;
import net.yz.m_;

public class y extends i {
   private int mz;
   private boolean mU;

   public y(net.yv.r var1) {
      super(var1);
      this.p0 = 3;
      this.S(0.4F, 0.3F);
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(2, new net.y_.k(this, 1.0D, false));
      this.p_.X(3, new ow(this, 1.0D));
      this.p_.X(7, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(8, new oa(this));
      this.pM.X(1, new oo(this, true, new Class[0]));
      this.pM.X(2, new o8(this, net.r.r.class, true));
   }

   public float A() {
      return 0.1F;
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(8.0D);
      this.t(net.ne.d.G).t(0.25D);
      this.t(net.ne.d.S).t(2.0D);
   }

   protected boolean k() {
      return false;
   }

   protected net.yz.a T() {
      return net.nb.l.HW;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Pi;
   }

   protected net.yz.a r() {
      return net.nb.l.Hl;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.Hn, 0.15F, 1.0F);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.X;
   }

   public static void i(net.c0.d var0) {
      net.ne.y.J(var0, y.class);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.mz = var1.P("Lifetime");
      this.mU = var1.i("PlayerSpawned");
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Lifetime", this.mz);
      var1.c("PlayerSpawned", this.mU);
   }

   public void A() {
      this.AK = this.hN;
      super.A();
   }

   public void X(float var1) {
      this.hN = var1;
      super.X(var1);
   }

   public double O() {
      return 0.1D;
   }

   public boolean wf() {
      return this.mU;
   }

   public void n(boolean var1) {
      this.mU = var1;
   }

   public void d() {
      n.o.y();
      super.d();
      if(this.hl.x) {
         int var2 = 0;
         this.hl.n(ai.PORTAL, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, (this.p.nextDouble() - 0.5D) * 2.0D, -this.p.nextDouble(), (this.p.nextDouble() - 0.5D) * 2.0D, new int[0]);
         ++var2;
      }

      if(!this.lT()) {
         ++this.mz;
      }

      if(this.mz >= 2400) {
         this.B();
      }

   }

   protected boolean D() {
      return true;
   }

   public boolean l4() {
      if(super.l4()) {
         net.r.r var1 = this.hl.d(this, 5.0D);
         return true;
      } else {
         return false;
      }
   }

   public net.ne.u g() {
      return net.ne.u.ARTHROPOD;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
