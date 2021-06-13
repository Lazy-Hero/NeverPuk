package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y_.o6;
import net.y_.o8;
import net.y_.og;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yn.x;
import net.yz.ai;
import net.yz.m_;

public class z extends w {
   private static final net.k.v VI = net.k.n.q(net.yn.z.class, net.k.y.d);
   private int V5;
   private int VF;
   private boolean Vj;
   private int Vr;
   private int VD;

   public z(net.yv.r var1) {
      super(var1);
      this.S(0.4F, 0.5F);
      this.pK = new net.yn.z(this);
      this.pn = new net.yn.z(this);
      this.k(0.0D);
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(1, new net.yn.z(this, 2.2D));
      this.p_.X(2, new ot(this, 0.8D));
      this.p_.X(3, new o6(this, 1.0D, net.nb.j.Wq, false));
      this.p_.X(3, new o6(this, 1.0D, net.nb.j.b, false));
      this.p_.X(3, new o6(this, 1.0D, net.n0.y.q(net.nb.f.dO), false));
      this.p_.X(4, new net.yn.z(this, net.r.r.class, 8.0F, 2.2D, 2.2D));
      this.p_.X(4, new net.yn.z(this, x.class, 10.0F, 2.2D, 2.2D));
      this.p_.X(4, new net.yn.z(this, net.nk.i.class, 4.0F, 2.2D, 2.2D));
      this.p_.X(5, new net.yn.z(this));
      this.p_.X(6, new ow(this, 0.6D));
      this.p_.X(11, new ok(this, net.r.r.class, 10.0F));
   }

   protected float S() {
      if(!this.t && (!this.pn.J() || this.pn.F() <= this.hS + 0.5D)) {
         net.b.t var1 = this.p6.N();
         if(var1.P() < var1.R()) {
            net.u.r var2 = var1.i(this);
            if(var2.H > this.hS + 0.5D) {
               return 0.5F;
            }
         }

         return this.pn.A() <= 0.6D?0.2F:0.3F;
      } else {
         return 0.5F;
      }
   }

   protected void Z() {
      super.Z();
      double var1 = this.pn.A();
      if(var1 > 0.0D) {
         double var3 = this.hf * this.hf + this.J * this.J;
         if(var3 < 0.010000000000000002D) {
            this.h(0.0F, 0.0F, 1.0F, 0.1F);
         }
      }

      if(!this.hl.x) {
         this.hl.k(this, (byte)1);
      }

   }

   public float U(float var1) {
      return this.VF == 0?0.0F:((float)this.V5 + var1) / (float)this.VF;
   }

   public void k(double var1) {
      this.H().f(var1);
      this.pn.Q(this.pn.H(), this.pn.F(), this.pn.s(), var1);
   }

   public void N(boolean var1) {
      super.N(var1);
      this.I(this.V(), this.G(), ((this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F) * 0.8F);
   }

   public void H() {
      this.N(true);
      this.VF = 10;
      this.V5 = 0;
   }

   protected void g() {
      super.g();
      this.G.r(VI, Integer.valueOf(0));
   }

   public void T() {
      int var1 = net.yn.z.U;
      if(this.Vr > 0) {
         --this.Vr;
      }

      if(this.VD > 0) {
         this.VD -= this.p.nextInt(3);
         if(this.VD < 0) {
            this.VD = 0;
         }
      }

      if(this.k) {
         label93: {
            if(!this.Vj) {
               this.N(false);
               this.LI();
            }

            if(this.n() == 99 && this.Vr == 0) {
               net.ne.a var2 = this.M();
               if(this.F(var2) < 16.0D) {
                  this.Y(var2.b, var2.hr);
                  this.pn.Q(var2.b, var2.hS, var2.hr, this.pn.A());
                  this.H();
                  this.Vj = true;
               }
            }

            net.yn.z var5 = (net.yn.z)this.pK;
            if(!var5.J()) {
               if(!this.pn.J() || this.Vr != 0) {
                  break label93;
               }

               net.b.t var3 = this.p6.N();
               net.u.r var4 = new net.u.r(this.pn.H(), this.pn.F(), this.pn.s());
               if(var3.P() < var3.R()) {
                  var4 = var3.i(this);
               }

               this.Y(var4.p, var4.a);
               this.H();
            }

            if(!var5.e()) {
               this.L9();
            }
         }
      }

      this.Vj = this.k;
   }

   public void M() {
   }

   private void Y(double var1, double var3) {
      this.hN = (float)(net.u.t.V(var3 - this.hr, var1 - this.b) * 57.29577951308232D) - 90.0F;
   }

   private void L9() {
      ((net.yn.z)this.pK).u(true);
   }

   private void LK() {
      ((net.yn.z)this.pK).u(false);
   }

   private void L0() {
      if(this.pn.A() < 2.2D) {
         this.Vr = 10;
      } else {
         this.Vr = 1;
      }

   }

   private void LI() {
      this.L0();
      this.LK();
   }

   public void d() {
      super.d();
      if(this.V5 != this.VF) {
         ++this.V5;
      } else if(this.VF != 0) {
         this.V5 = 0;
         this.VF = 0;
         this.N(false);
      }

   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(3.0D);
      this.t(net.ne.d.G).t(0.30000001192092896D);
   }

   public static void a(net.c0.d var0) {
      net.ne.y.J(var0, net.yn.z.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("RabbitType", this.n());
      var1.r("MoreCarrotTicks", this.VD);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.M(var1.P("RabbitType"));
      this.VD = var1.P("MoreCarrotTicks");
   }

   protected net.yz.a V() {
      return net.nb.l.oH;
   }

   protected net.yz.a T() {
      return net.nb.l.PV;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.PO;
   }

   protected net.yz.a r() {
      return net.nb.l.Kj;
   }

   public boolean S(net.ne.l var1) {
      if(this.n() == 99) {
         this.I(net.nb.l.KK, 1.0F, (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         return var1.H(net.yz.z.O(this), 8.0F);
      } else {
         return var1.H(net.yz.z.O(this), 3.0F);
      }
   }

   public net.yz.p E() {
      return this.n() == 99?net.yz.p.HOSTILE:net.yz.p.NEUTRAL;
   }

   public boolean H(net.yz.z var1, float var2) {
      return !this.w(var1) && super.H(var1, var2);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.K;
   }

   private boolean j(net.n0.y var1) {
      return var1 == net.nb.j.Wq || var1 == net.nb.j.b || var1 == net.n0.y.q(net.nb.f.dO);
   }

   public net.yn.z D(net.ne.j var1) {
      net.yn.z var2 = new net.yn.z(this.hl);
      int var3 = this.Q();
      if(this.p.nextInt(20) != 0) {
         if(var1 instanceof net.yn.z && this.p.nextBoolean()) {
            var3 = ((net.yn.z)var1).n();
         } else {
            var3 = this.n();
         }
      }

      var2.M(var3);
      return var2;
   }

   public boolean V(ks var1) {
      return this.j(var1.Z());
   }

   public int n() {
      return ((Integer)this.G.a(VI)).intValue();
   }

   public void M(int var1) {
      if(var1 == 99) {
         this.t(net.ne.d.g).t(8.0D);
         this.p_.X(4, new net.yn.z(this));
         this.pM.X(1, new oo(this, false, new Class[0]));
         this.pM.X(2, new o8(this, net.r.r.class, true));
         this.pM.X(2, new o8(this, x.class, true));
         if(!this.H()) {
            this.K(net.yq.e.E("entity.KillerBunny.name"));
         }
      }

      this.G.d(VI, Integer.valueOf(var1));
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      int var3 = this.Q();
      boolean var4 = false;
      if(var2 instanceof net.yn.z) {
         var3 = ((net.yn.z)var2).Q;
         var4 = true;
      } else {
         var2 = new net.yn.z(var3);
      }

      this.M(var3);
      this.V(-24000);
      return var2;
   }

   private int Q() {
      net.ns.i var1 = this.hl.P(new net.u.j(this));
      int var2 = this.p.nextInt(100);
      return var1.i()?(var2 < 80?1:3):(var1 instanceof net.ns.l?4:(var2 < 50?0:(var2 < 90?5:2)));
   }

   private boolean D() {
      return this.VD == 0;
   }

   protected void LD() {
      net.y9.w var1 = (net.y9.w)net.nb.f.a;
      net.yw.n var2 = var1.r(var1.E());
      this.hl.n(ai.BLOCK_DUST, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, 0.0D, 0.0D, 0.0D, new int[]{net.y9.l.m(var2)});
      this.VD = 40;
   }

   public void R(byte var1) {
      if(var1 == 1) {
         this.X();
         this.VF = 10;
         this.V5 = 0;
      } else {
         super.R(var1);
      }

   }

   private static xn d(xn var0) {
      return var0;
   }

   static class g extends og {
      private final net.yn.z E;
      private boolean s;
      private boolean H;

      public g(net.yn.z var1) {
         super(var1, 0.699999988079071D, 16);
         this.E = var1;
      }

      public boolean f() {
         if(this.L <= 0) {
            if(!this.E.hl.N().b("mobGriefing")) {
               return false;
            }

            this.H = false;
            this.s = this.E.D();
            this.s = true;
         }

         return super.f();
      }

      public boolean X() {
         return this.H && super.X();
      }

      public void E() {
         super.E();
         net.yn.z.B();
         this.E.E().u((double)this.t.t() + 0.5D, (double)(this.t.h() + 1), (double)this.t.y() + 0.5D, 10.0F, (float)this.E.w());
         if(this.J()) {
            net.yv.r var2 = this.E.hl;
            net.u.j var3 = this.t.h();
            net.yw.n var4 = var2.Z(var3);
            net.y9.l var5 = var4.Q();
            if(this.H && var5 instanceof net.y9.w) {
               Integer var6 = (Integer)var4.i(net.y9.w.N);
               if(var6.intValue() == 0) {
                  var2.k(var3, net.nb.f.ou.p(), 2);
                  var2.e(var3, true);
               }

               var2.k(var3, var4.s(net.y9.w.N, Integer.valueOf(var6.intValue() - 1)), 2);
               var2.s(2001, var3, net.y9.l.m(var4));
               this.E.LD();
            }

            this.H = false;
            this.L = 10;
         }

      }

      protected boolean b(net.yv.r var1, net.u.j var2) {
         net.y9.l var3 = var1.Z(var2).Q();
         if(var3 == net.nb.f.dJ && this.s && !this.H) {
            var2 = var2.h();
            net.yw.n var4 = var1.Z(var2);
            var3 = var4.Q();
            if(var3 instanceof net.y9.w && ((net.y9.w)var3).z(var4)) {
               this.H = true;
               return true;
            }
         }

         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class h extends net.y_.n {
      private final net.yn.z c;

      public h(net.yn.z var1, Class var2, float var3, double var4, double var6) {
         super(var1, var2, var3, var4, var6);
         this.c = var1;
      }

      public boolean f() {
         int var1 = net.yn.z.U;
         return this.c.n() != 99 && super.f();
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   static class i extends net.y_.k {
      public i(net.yn.z var1) {
         super(var1, 1.4D, true);
      }

      protected double n(net.ne.a var1) {
         return (double)(4.0F + var1.h9);
      }
   }

   public class q extends net.y_.c {
      private final net.yn.z x;
      private boolean G;
      private static int U;

      public q(net.yn.z var2) {
         super(var2);
         this.x = var2;
      }

      public boolean J() {
         return this.F;
      }

      public boolean e() {
         return this.G;
      }

      public void u(boolean var1) {
         this.G = var1;
      }

      public void M() {
         int var1 = B();
         if(this.F) {
            this.x.H();
            this.F = false;
         }

      }

      public static void c(int var0) {
         U = var0;
      }

      public static int B() {
         int var0 = C();
         return 46;
      }

      private static xn a(xn var0) {
         return var0;
      }

      static {
         if(C() != 0) {
            c(56);
         }

      }
   }

   static class r extends oy {
      private final net.yn.z i;

      public r(net.yn.z var1, double var2) {
         super(var1, var2);
         this.i = var1;
      }

      public void E() {
         super.E();
         this.i.k(this.L);
      }
   }

   public static class u implements net.ne.g {
      public int Q;

      public u(int var1) {
         this.Q = var1;
      }
   }

   static class v extends net.y_.u {
      private final net.yn.z O;
      private double H;

      public v(net.yn.z var1) {
         super(var1);
         this.O = var1;
      }

      public void D() {
         int var1 = net.yn.z.B();
         if(this.O.k && !this.O.XL && !((net.yn.z)this.O.pK).J()) {
            this.O.k(0.0D);
         }

         if(this.J()) {
            this.O.k(this.H);
         }

         super.D();
      }

      public void Q(double var1, double var3, double var5, double var7) {
         if(this.O.p()) {
            var7 = 1.5D;
         }

         super.Q(var1, var3, var5, var7);
         if(var7 > 0.0D) {
            this.H = var7;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
