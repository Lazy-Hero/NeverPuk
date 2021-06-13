package net.yn;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y_.o6;
import net.y_.oa;
import net.y_.ok;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yz.m_;

public class a extends w {
   private static final Set tC = Sets.newHashSet(new net.n0.y[]{net.nb.j.Q, net.nb.j.Y3, net.nb.j.Y, net.nb.j.WY});
   public float tq;
   public float ta;
   public float tz;
   public float tk;
   public float tt = 1.0F;
   public int ti;
   public boolean to;

   public a(net.yv.r var1) {
      super(var1);
      this.S(0.4F, 0.7F);
      this.ti = this.p.nextInt(6000) + 6000;
      this.v(net.b.m.WATER, 0.0F);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new oy(this, 1.4D));
      this.p_.X(2, new ot(this, 1.0D));
      this.p_.X(3, new o6(this, 1.0D, false, tC));
      this.p_.X(4, new net.y_.h(this, 1.1D));
      this.p_.X(5, new ow(this, 1.0D));
      this.p_.X(6, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(7, new oa(this));
   }

   public float A() {
      return this.m;
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(4.0D);
      this.t(net.ne.d.G).t(0.25D);
   }

   public void d() {
      net.yn.z.C();
      super.d();
      this.tk = this.tq;
      this.tz = this.ta;
      this.ta = (float)((double)this.ta + (double)(this.k?-1:4) * 0.3D);
      this.ta = net.u.t.T(this.ta, 0.0F, 1.0F);
      if(!this.k && Float.compare(this.tt, 1.0F) < 0) {
         this.tt = 1.0F;
      }

      this.tt = (float)((double)this.tt * 0.9D);
      if(!this.k && Double.compare(this.K, 0.0D) < 0) {
         this.K *= 0.6D;
      }

      this.tq += this.tt * 2.0F;
      if(!this.hl.x && !this.H9() && !this.D() && --this.ti <= 0) {
         this.I(net.nb.l.o0, 1.0F, (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         this.S(net.nb.j.YV, 1);
         this.ti = this.p.nextInt(6000) + 6000;
      }

   }

   public void v(float var1, float var2) {
   }

   protected net.yz.a T() {
      return net.nb.l.Mh;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.M9;
   }

   protected net.yz.a r() {
      return net.nb.l.c;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.Pc, 0.15F, 1.0F);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.R;
   }

   public a j(net.ne.j var1) {
      return new a(this.hl);
   }

   public boolean V(ks var1) {
      return tC.contains(var1.Z());
   }

   protected int Q(net.r.r var1) {
      return this.D()?10:super.Q(var1);
   }

   public static void Q(net.c0.d var0) {
      net.ne.y.J(var0, a.class);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.to = var1.i("IsChickenJockey");
      if(var1.G("EggLayTime")) {
         this.ti = var1.P("EggLayTime");
      }

   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("IsChickenJockey", this.to);
      var1.r("EggLayTime", this.ti);
   }

   protected boolean lB() {
      return this.D() && !this.t();
   }

   public void F(net.ne.l var1) {
      super.F(var1);
      float var2 = net.u.t.A(this.AK * 0.017453292F);
      float var3 = net.u.t.m(this.AK * 0.017453292F);
      float var10000 = 0.1F;
      var10000 = 0.0F;
      var1.t(this.b + (double)(0.1F * var2), this.hS + (double)(this.m * 0.5F) + var1.O() + 0.0D, this.hr - (double)(0.1F * var3));
      if(var1 instanceof net.ne.a) {
         ((net.ne.a)var1).AK = this.AK;
      }

   }

   public boolean D() {
      return this.to;
   }

   public void q(boolean var1) {
      this.to = var1;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
