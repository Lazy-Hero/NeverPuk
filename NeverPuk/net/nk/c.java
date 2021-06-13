package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.d;
import net.nk.fc;
import net.nk.n;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.ow;
import net.yz.m_;

public class c extends d implements net.ne.x {
   private static final net.k.v ic = net.k.n.q(c.class, net.k.y.g);

   public c(net.yv.r var1) {
      super(var1);
      this.S(0.7F, 1.9F);
   }

   public static void y(net.c0.d var0) {
      net.ne.y.J(var0, c.class);
   }

   protected void D() {
      this.p_.X(1, new net.y_.g(this, 1.25D, 20, 10.0F));
      this.p_.X(2, new ow(this, 1.0D, 1.0000001E-5F));
      this.p_.X(3, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(4, new oa(this));
      this.pM.X(1, new o8(this, net.ne.y.class, 10, true, false, fc.L));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(4.0D);
      this.t(net.ne.d.G).t(0.20000000298023224D);
   }

   protected void g() {
      super.g();
      this.G.r(ic, Byte.valueOf((byte)16));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("Pumpkin", this.D());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.G("Pumpkin")) {
         this.Q(var1.i("Pumpkin"));
      }

   }

   public void d() {
      n.o.y();
      super.d();
      if(!this.hl.x) {
         int var2 = net.u.t.L(this.b);
         int var3 = net.u.t.L(this.hS);
         int var4 = net.u.t.L(this.hr);
         if(this.J()) {
            this.H(net.yz.z.N, 1.0F);
         }

         if(Float.compare(this.hl.P(new net.u.j(var2, 0, var4)).D(new net.u.j(var2, var3, var4)), 1.0F) > 0) {
            this.H(net.yz.z.y, 1.0F);
         }

         if(!this.hl.N().b("mobGriefing")) {
            return;
         }

         int var5 = 0;
         var2 = net.u.t.L(this.b + (double)((float)(var5 % 2 * 2 - 1) * 0.25F));
         var3 = net.u.t.L(this.hS);
         var4 = net.u.t.L(this.hr + (double)((float)(var5 / 2 % 2 * 2 - 1) * 0.25F));
         net.u.j var6 = new net.u.j(var2, var3, var4);
         if(this.hl.Z(var6).n() == net.y1.l.q && Float.compare(this.hl.P(var6).D(var6), 0.8F) < 0 && net.nb.f.Tl.J(this.hl, var6)) {
            this.hl.U(var6, net.nb.f.Tl.p());
         }

         ++var5;
      }

   }

   @Nullable
   protected m_ N() {
      return net.y7.p.po;
   }

   public void x(net.ne.a var1, float var2) {
      net.n1.x var3 = new net.n1.x(this.hl, this);
      double var4 = var1.hS + (double)var1.A() - 1.100000023841858D;
      double var6 = var1.b - this.b;
      double var8 = var4 - var3.hS;
      double var10 = var1.hr - this.hr;
      float var12 = net.u.t.R(var6 * var6 + var10 * var10) * 0.2F;
      var3.w(var6, var8 + (double)var12, var10, 1.6F, 12.0F);
      this.I(net.nb.l.My, 1.0F, 1.0F / (this.Q().nextFloat() * 0.4F + 0.8F));
      this.hl.S(var3);
   }

   public float A() {
      return 1.7F;
   }

   protected boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(var3.Z() == net.nb.j.W5 && this.D() && !this.hl.x) {
         this.Q(false);
         var3.S(1, var1);
      }

      return super.R(var1, var2);
   }

   public boolean D() {
      return (((Byte)this.G.a(ic)).byteValue() & 16) != 0;
   }

   public void Q(boolean var1) {
      byte var2 = ((Byte)this.G.a(ic)).byteValue();
      this.G.d(ic, Byte.valueOf((byte)(var2 | 16)));
   }

   @Nullable
   protected net.yz.a T() {
      return net.nb.l.wZ;
   }

   @Nullable
   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.KV;
   }

   @Nullable
   protected net.yz.a r() {
      return net.nb.l.M0;
   }

   public void c(boolean var1) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}
