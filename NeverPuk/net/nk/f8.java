package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.f0;
import net.nk.n;
import net.yz.ai;
import net.yz.m_;

public class f8 extends f0 {
   public f8(net.yv.r var1) {
      super(var1);
      this.hw = true;
   }

   public static void E(net.c0.d var0) {
      net.ne.y.J(var0, f8.class);
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.20000000298023224D);
   }

   public boolean l4() {
      return this.hl.k() != net.yv.l.PEACEFUL;
   }

   public boolean l1() {
      net.u.d[] var1 = n.o.y();
      return this.hl.N((net.u.e)this.i(), (net.ne.l)this) && this.hl.h(this, this.i()).isEmpty() && !this.hl.p(this.i());
   }

   protected void S(int var1, boolean var2) {
      super.S(var1, var2);
      this.t(net.ne.d.g).t((double)(var1 * 3));
   }

   public int L() {
      return 15728880;
   }

   public float d() {
      return 1.0F;
   }

   protected ai U() {
      return ai.FLAME;
   }

   protected f0 b() {
      return new f8(this.hl);
   }

   @Nullable
   protected m_ N() {
      return this.D()?net.y7.p.W:net.y7.p.pk;
   }

   public boolean a() {
      return false;
   }

   protected int j() {
      return super.j() * 4;
   }

   protected void H() {
      this.uQ *= 0.9F;
   }

   protected void Z() {
      this.K = (double)(0.42F + (float)this.A() * 0.1F);
      this.w = true;
   }

   protected void y() {
      this.K = (double)(0.22F + (float)this.A() * 0.05F);
      this.w = true;
   }

   public void v(float var1, float var2) {
   }

   protected boolean XS() {
      return true;
   }

   protected int Q() {
      return super.Q() + 2;
   }

   protected net.yz.a m(net.yz.z var1) {
      return this.D()?net.nb.l.H3:net.nb.l.Ma;
   }

   protected net.yz.a r() {
      return this.D()?net.nb.l.w0:net.nb.l.Dd;
   }

   protected net.yz.a S() {
      return this.D()?net.nb.l.K:net.nb.l.H;
   }

   protected net.yz.a V() {
      return net.nb.l.PB;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
