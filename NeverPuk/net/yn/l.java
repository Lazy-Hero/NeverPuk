package net.yn;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.nl.z1;
import net.y9.lk;
import net.y_.o8;
import net.y_.oa;
import net.y_.od;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.or;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.q;
import net.yn.w;
import net.yn.x;
import net.yz.m_;

public class l extends q implements net.ne.x {
   private static final net.k.v Uh = net.k.n.q(l.class, net.k.y.d);
   private static final net.k.v UZ = net.k.n.q(l.class, net.k.y.d);
   private static final net.k.v Uw = net.k.n.q(l.class, net.k.y.d);
   private boolean UW;
   @Nullable
   private l U5;
   @Nullable
   private l UB;

   public l(net.yv.r var1) {
      super(var1);
      this.S(0.9F, 1.87F);
   }

   private void X(int var1) {
      this.G.d(Uh, Integer.valueOf(Math.max(1, Math.min(5, var1))));
   }

   private void pA() {
      int var1 = this.p.nextFloat() < 0.04F?5:3;
      this.X(1 + this.p.nextInt(var1));
   }

   public int N() {
      return ((Integer)this.G.a(Uh)).intValue();
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Variant", this.m());
      var1.r("Strength", this.N());
      if(!this.Nq.A(1).B()) {
         var1.K("DecorItem", this.Nq.A(1).Z(new net.nj.f()));
      }

   }

   public void o(net.nj.f var1) {
      this.X(var1.P("Strength"));
      super.o(var1);
      this.a(var1.P("Variant"));
      if(var1.K("DecorItem", 10)) {
         this.Nq.S(1, new ks(var1.o("DecorItem")));
      }

      this.IK();
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new or(this, 1.2D));
      this.p_.X(2, new od(this, 2.0999999046325684D));
      this.p_.X(3, new net.y_.g(this, 1.25D, 40, 20.0F));
      this.p_.X(3, new oy(this, 1.2D));
      this.p_.X(4, new ot(this, 1.0D));
      this.p_.X(5, new net.y_.h(this, 1.0D));
      this.p_.X(6, new ow(this, 0.7D));
      this.p_.X(7, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(8, new oa(this));
      this.pM.X(1, new l.y(this));
      this.pM.X(2, new l.w(this));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.L).t(40.0D);
   }

   protected void g() {
      super.g();
      this.G.r(Uh, Integer.valueOf(0));
      this.G.r(UZ, Integer.valueOf(-1));
      this.G.r(Uw, Integer.valueOf(0));
   }

   public int m() {
      return net.u.t.g(((Integer)this.G.a(Uw)).intValue(), 0, 3);
   }

   public void a(int var1) {
      this.G.d(Uw, Integer.valueOf(var1));
   }

   protected int R() {
      return this.TJ()?2 + 3 * this.k():super.R();
   }

   public void F(net.ne.l var1) {
      if(this.m(var1)) {
         float var2 = net.u.t.m(this.AK * 0.017453292F);
         float var3 = net.u.t.A(this.AK * 0.017453292F);
         float var10000 = 0.3F;
         var1.t(this.b + (double)(0.3F * var3), this.hS + this.e() + var1.O(), this.hr - (double)(0.3F * var2));
      }

   }

   public double e() {
      return (double)this.m * 0.67D;
   }

   public boolean lC() {
      return false;
   }

   protected boolean N(net.r.r var1, ks var2) {
      boolean var4 = false;
      net.yn.z.B();
      boolean var5 = false;
      float var6 = 0.0F;
      boolean var7 = false;
      net.n0.y var8 = var2.Z();
      if(var8 == net.nb.j.Sd) {
         var4 = true;
         var5 = true;
         var6 = 2.0F;
      }

      if(var8 == net.n0.y.q(net.nb.f.ow)) {
         var4 = true;
         var5 = true;
         var6 = 10.0F;
         if(this.Up() && this.z() == 0) {
            var7 = true;
            this.Q(var1);
         }
      }

      if(Float.compare(this.h(), this.w()) < 0) {
         Float.compare(var6, 0.0F);
      }

      if(this.H9()) {
         ;
      }

      return var7;
   }

   protected boolean HD() {
      return this.h() <= 0.0F || this.Un();
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      this.pA();
      int var3;
      if(var2 instanceof l.u) {
         var3 = ((l.u)var2).M;
      } else {
         var3 = this.p.nextInt(4);
         var2 = new l.u(var3);
      }

      this.a(var3);
      return var2;
   }

   public boolean O0() {
      return this.T() != null;
   }

   protected net.yz.a U() {
      return net.nb.l.HG;
   }

   protected net.yz.a T() {
      return net.nb.l.Mp;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.oU;
   }

   protected net.yz.a r() {
      return net.nb.l.Po;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.MP, 0.15F, 1.0F);
   }

   protected void RQ() {
      this.I(net.nb.l.ou, 1.0F, (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
   }

   public void Is() {
      net.yz.a var1 = this.U();
      this.I(var1, this.G(), this.s());
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pL;
   }

   public int k() {
      return this.N();
   }

   public boolean UC() {
      return true;
   }

   public boolean o(ks var1) {
      return var1.Z() == net.n0.y.q(net.nb.f.uK);
   }

   public boolean Ui() {
      return false;
   }

   public void b(z1 var1) {
      kw var2 = this.T();
      super.b(var1);
      kw var3 = this.T();
      if(this.x > 20 && var3 != var2) {
         this.I(net.nb.l.Kq, 0.5F, 1.0F);
      }

   }

   protected void IK() {
      if(!this.hl.x) {
         super.IK();
         this.x(this.Nq.A(1));
      }

   }

   private void r(@Nullable kw var1) {
      this.G.d(UZ, Integer.valueOf(-1));
   }

   private void x(ks var1) {
      if(this.o(var1)) {
         this.r(kw.h(var1.n()));
      } else {
         this.r((kw)null);
      }

   }

   @Nullable
   public kw T() {
      int var1 = ((Integer)this.G.a(UZ)).intValue();
      return var1 == -1?null:kw.h(var1);
   }

   public int x() {
      return 30;
   }

   public boolean b(w var1) {
      return var1 != this && var1 instanceof l && this.Ue() && ((l)var1).Ue();
   }

   public l u(net.ne.j var1) {
      l var2 = new l(this.hl);
      this.t(var1, var2);
      l var3 = (l)var1;
      int var4 = this.p.nextInt(Math.max(this.N(), var3.N())) + 1;
      if(this.p.nextFloat() < 0.03F) {
         ++var4;
      }

      var2.X(var4);
      var2.a(this.p.nextBoolean()?this.m():var3.m());
      return var2;
   }

   private void g(net.ne.a var1) {
      net.n1.c var2 = new net.n1.c(this.hl, this);
      double var3 = var1.b - this.b;
      double var5 = var1.i().u + (double)(var1.m / 3.0F) - var2.hS;
      double var7 = var1.hr - this.hr;
      float var9 = net.u.t.R(var3 * var3 + var7 * var7) * 0.2F;
      var2.w(var3, var5 + (double)var9, var7, 1.5F, 10.0F);
      this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.Mf, this.E(), 1.0F, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
      this.hl.S(var2);
      this.UW = true;
   }

   private void v(boolean var1) {
      this.UW = var1;
   }

   public void v(float var1, float var2) {
      int var3 = net.u.t.Y((var1 * 0.5F - 3.0F) * var2);
      if(var1 >= 6.0F) {
         this.H(net.yz.z.H, (float)var3);
         if(this.t()) {
            for(net.ne.l var5 : this.m()) {
               var5.H(net.yz.z.H, (float)var3);
            }
         }
      }

      net.yw.n var7 = this.hl.Z(new net.u.j(this.b, this.hS - 0.2D - (double)this.hq, this.hr));
      net.y9.l var8 = var7.Q();
      if(var7.n() != net.y1.l.q && !this.c()) {
         lk var6 = var8.X();
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, var6.H(), this.E(), var6.m() * 0.5F, var6.X() * 0.75F);
      }

   }

   public void pW() {
      if(this.U5 != null) {
         this.U5.UB = null;
      }

      this.U5 = null;
   }

   public void o(l var1) {
      this.U5 = var1;
      this.U5.UB = this;
   }

   public boolean O3() {
      return this.UB != null;
   }

   public boolean Ot() {
      return this.U5 != null;
   }

   @Nullable
   public l F() {
      return this.U5;
   }

   protected double F() {
      return 2.0D;
   }

   protected void Iq() {
      if(!this.Ot() && this.H9()) {
         super.Iq();
      }

   }

   public boolean Uc() {
      return false;
   }

   public void x(net.ne.a var1, float var2) {
      this.g(var1);
   }

   public void c(boolean var1) {
   }

   private static xn g(xn var0) {
      return var0;
   }

   static class u implements net.ne.g {
      public int M;

      private u(int var1) {
         this.M = var1;
      }
   }

   static class w extends o8 {
      public w(l var1) {
         super(var1, x.class, 16, false, true, (Predicate)null);
      }

      public boolean f() {
         int var1 = net.yn.z.B();
         if(super.f() && this.T != null && !((x)this.T).D()) {
            return true;
         } else {
            this.k.C((net.ne.a)null);
            return false;
         }
      }

      protected double h() {
         return super.h() * 0.25D;
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   static class y extends oo {
      public y(l var1) {
         super(var1, false, new Class[0]);
      }

      public boolean X() {
         int var1 = net.yn.z.B();
         if(this.k instanceof l) {
            l var2 = (l)this.k;
            if(var2.UW) {
               var2.v(false);
               return false;
            }
         }

         return super.X();
      }

      private static xn d(xn var0) {
         return var0;
      }
   }
}
