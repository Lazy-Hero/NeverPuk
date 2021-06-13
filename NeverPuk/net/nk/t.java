package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.i;
import net.nk.n;
import net.nl.z2;
import net.y_.o8;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ou;
import net.yz.m_;

public class t extends i {
   protected static final net.k.v ni = net.k.n.q(t.class, net.k.y.g);
   private net.ne.y nV;
   @Nullable
   private net.u.j nm;
   private boolean nq;
   private int np;

   public t(net.yv.r var1) {
      super(var1);
      this.hw = true;
      this.pn = new t.q(this);
      this.S(0.4F, 0.8F);
      this.p0 = 3;
   }

   public void N(net.ne.f var1, double var2, double var4, double var6) {
      super.N(var1, var2, var4, var6);
      this.P();
   }

   public void A() {
      this.r = true;
      super.A();
      n.o.y();
      this.r = false;
      this.I(true);
      if(this.nq && --this.np <= 0) {
         this.np = 20;
         this.H(net.yz.z.D, 1.0F);
      }

   }

   protected void D() {
      super.D();
      this.p_.X(0, new op(this));
      this.p_.X(4, new t.u());
      this.p_.X(8, new t.y());
      this.p_.X(9, new ok(this, net.r.r.class, 3.0F, 1.0F));
      this.p_.X(10, new ok(this, net.ne.y.class, 8.0F));
      this.pM.X(1, new oo(this, true, new Class[]{t.class}));
      this.pM.X(2, new t.s(this));
      this.pM.X(3, new o8(this, net.r.r.class, true));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(14.0D);
      this.t(net.ne.d.S).t(4.0D);
   }

   protected void g() {
      super.g();
      this.G.r(ni, Byte.valueOf((byte)0));
   }

   public static void g(net.c0.d var0) {
      net.ne.y.J(var0, t.class);
   }

   public void o(net.nj.f var1) {
      n.o.y();
      super.o(var1);
      if(var1.G("BoundX")) {
         this.nm = new net.u.j(var1.P("BoundX"), var1.P("BoundY"), var1.P("BoundZ"));
      }

      if(var1.G("LifeTicks")) {
         this.f(var1.P("LifeTicks"));
      }

   }

   public void I(net.nj.f var1) {
      n.o.y();
      super.I(var1);
      if(this.nm != null) {
         var1.r("BoundX", this.nm.t());
         var1.r("BoundY", this.nm.h());
         var1.r("BoundZ", this.nm.y());
      }

      if(this.nq) {
         var1.r("LifeTicks", this.np);
      }

   }

   public net.ne.y c() {
      return this.nV;
   }

   @Nullable
   public net.u.j C() {
      return this.nm;
   }

   public void f(@Nullable net.u.j var1) {
      this.nm = var1;
   }

   private boolean G(int var1) {
      byte var2 = ((Byte)this.G.a(ni)).byteValue();
      return (var2 & var1) != 0;
   }

   private void s(int var1, boolean var2) {
      int var3 = ((Byte)this.G.a(ni)).byteValue();
      var3 = var3 | var1;
      this.G.d(ni, Byte.valueOf((byte)(var3 & 255)));
   }

   public boolean as() {
      return this.G(1);
   }

   public void H(boolean var1) {
      this.s(1, var1);
   }

   public void T(net.ne.y var1) {
      this.nV = var1;
   }

   public void f(int var1) {
      this.nq = true;
      this.np = var1;
   }

   protected net.yz.a T() {
      return net.nb.l.Ch;
   }

   protected net.yz.a r() {
      return net.nb.l.wk;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Kh;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pG;
   }

   public int L() {
      return 15728880;
   }

   public float d() {
      return 1.0F;
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      this.T(var1);
      this.I(var1);
      return super.t(var1, var2);
   }

   protected void T(net.yv.g var1) {
      this.u(z2.MAINHAND, new ks(net.nb.j.O));
      this.a(z2.MAINHAND, 0.0F);
   }

   private static xn a(xn var0) {
      return var0;
   }

   class q extends net.y_.u {
      public q(t var2) {
         super(var2);
      }

      public void D() {
         net.u.d[] var1 = n.o.y();
         if(this.p == net.y_.u.MOVE_TO) {
            double var2 = this.c - t.this.b;
            double var4 = this.X - t.this.hS;
            double var6 = this.Y - t.this.hr;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            var8 = (double)net.u.t.R(var8);
            if(var8 < t.this.i().O()) {
               this.p = net.y_.u.WAIT;
               t.this.hf *= 0.5D;
               t.this.K *= 0.5D;
               t.this.J *= 0.5D;
            }

            t.this.hf += var2 / var8 * 0.05D * this.b;
            t.this.K += var4 / var8 * 0.05D * this.b;
            t.this.J += var6 / var8 * 0.05D * this.b;
            if(t.this.M() == null) {
               t.this.hN = -((float)net.u.t.V(t.this.hf, t.this.J)) * 57.295776F;
               t.this.AK = t.this.hN;
            }

            double var10 = t.this.M().b - t.this.b;
            double var12 = t.this.M().hr - t.this.hr;
            t.this.hN = -((float)net.u.t.V(var10, var12)) * 57.295776F;
            t.this.AK = t.this.hN;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class s extends ou {
      public s(net.ne.s var2) {
         super(var2, false);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return t.this.nV != null && t.this.nV.M() != null && this.h(t.this.nV.M(), false);
      }

      public void I() {
         t.this.C(t.this.nV.M());
         super.I();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class u extends net.y_.b {
      public u() {
         this.h(1);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return t.this.M() != null && !t.this.m().J() && t.this.p.nextInt(7) == 0?Double.compare(t.this.F(t.this.M()), 4.0D) > 0:false;
      }

      public boolean X() {
         return t.this.m().J() && t.this.as() && t.this.M() != null && t.this.M().P();
      }

      public void I() {
         net.ne.a var1 = t.this.M();
         net.u.r var2 = var1.E(1.0F);
         t.this.pn.Q(var2.p, var2.H, var2.a, 1.0D);
         t.this.H(true);
         t.this.I(net.nb.l.o7, 1.0F, 1.0F);
      }

      public void C() {
         t.this.H(false);
      }

      public void E() {
         n.o.y();
         net.ne.a var2 = t.this.M();
         if(t.this.i().O(var2.i())) {
            t.this.S(var2);
            t.this.H(false);
         }

         double var3 = t.this.F(var2);
         if(var3 < 9.0D) {
            net.u.r var5 = var2.E(1.0F);
            t.this.pn.Q(var5.p, var5.H, var5.a, 1.0D);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   class y extends net.y_.b {
      public y() {
         this.h(1);
      }

      public boolean f() {
         return !t.this.m().J() && t.this.p.nextInt(7) == 0;
      }

      public boolean X() {
         return false;
      }

      public void E() {
         n.o.y();
         net.u.j var2 = t.this.C();
         if(var2 == null) {
            var2 = new net.u.j(t.this);
         }

         int var3 = 0;
         net.u.j var4 = var2.F(t.this.p.nextInt(15) - 7, t.this.p.nextInt(11) - 5, t.this.p.nextInt(15) - 7);
         if(t.this.hl.y(var4)) {
            t.this.pn.Q((double)var4.t() + 0.5D, (double)var4.h() + 0.5D, (double)var4.y() + 0.5D, 0.25D);
            if(t.this.M() != null) {
               return;
            }

            t.this.E().u((double)var4.t() + 0.5D, (double)var4.h() + 0.5D, (double)var4.y() + 0.5D, 180.0F, 20.0F);
         }

         ++var3;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
