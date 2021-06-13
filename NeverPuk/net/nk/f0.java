package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.b;
import net.nk.fc;
import net.nk.n;
import net.yz.ai;
import net.yz.m_;

public class f0 extends net.ne.y implements fc {
   private static final net.k.v uz = net.k.n.q(f0.class, net.k.y.d);
   public float uQ;
   public float uK;
   public float ur;
   private boolean uE;

   public f0(net.yv.r var1) {
      super(var1);
      this.pn = new f0.c(this);
   }

   protected void D() {
      this.p_.X(1, new f0.d(this));
      this.p_.X(2, new f0.h(this));
      this.p_.X(3, new f0.o(this));
      this.p_.X(5, new f0.e(this));
      this.pM.X(1, new net.y_.f(this));
      this.pM.X(3, new net.y_.y(this, b.class));
   }

   protected void g() {
      super.g();
      this.G.r(uz, Integer.valueOf(1));
   }

   protected void S(int var1, boolean var2) {
      this.G.d(uz, Integer.valueOf(var1));
      this.S(0.51000005F * (float)var1, 0.51000005F * (float)var1);
      this.t(this.b, this.hS, this.hr);
      this.t(net.ne.d.C).t((double)(var1 * var1));
      this.t(net.ne.d.G).t((double)(0.2F + 0.1F * (float)var1));
      this.u(this.w());
      this.p0 = var1;
   }

   public int A() {
      return ((Integer)this.G.a(uz)).intValue();
   }

   public static void P(net.c0.d var0) {
      net.ne.y.J(var0, f0.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Size", this.A() - 1);
      var1.c("wasOnGround", this.uE);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      int var2 = var1.P("Size");
      var2 = 0;
      this.S(var2 + 1, false);
      this.uE = var1.i("wasOnGround");
   }

   public boolean D() {
      return this.A() <= 1;
   }

   protected ai U() {
      return ai.SLIME;
   }

   public void A() {
      net.u.d[] var1 = n.o.y();
      if(!this.hl.x && this.hl.k() == net.yv.l.PEACEFUL && this.A() > 0) {
         this.Z = true;
      }

      this.uK += (this.uQ - this.uK) * 0.5F;
      this.ur = this.uK;
      super.A();
      if(this.k && !this.uE) {
         int var2 = this.A();
         int var3 = 0;
         if(var3 < var2 * 8) {
            float var4 = this.p.nextFloat() * 6.2831855F;
            float var5 = this.p.nextFloat() * 0.5F + 0.5F;
            float var6 = net.u.t.A(var4) * (float)var2 * 0.5F * var5;
            float var7 = net.u.t.m(var4) * (float)var2 * 0.5F * var5;
            net.yv.r var8 = this.hl;
            ai var9 = this.U();
            double var10 = this.b + (double)var6;
            double var12 = this.hr + (double)var7;
            var8.n(var9, var10, this.i().u, var12, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var3;
         }

         this.I(this.S(), this.G(), ((this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.uQ = -0.5F;
      }

      if(!this.k && this.uE) {
         this.uQ = 1.0F;
      }

      this.uE = this.k;
      this.H();
   }

   protected void H() {
      this.uQ *= 0.6F;
   }

   protected int j() {
      return this.p.nextInt(20) + 10;
   }

   protected f0 b() {
      return new f0(this.hl);
   }

   public void O(net.k.v var1) {
      if(uz.equals(var1)) {
         int var2 = this.A();
         this.S(0.51000005F * (float)var2, 0.51000005F * (float)var2);
         this.hN = this.A3;
         this.AK = this.A3;
         if(this.p() && this.p.nextInt(20) == 0) {
            this.c();
         }
      }

      super.O(var1);
   }

   public void B() {
      int var1 = this.A();
      if(!this.hl.x && var1 > 1 && this.h() <= 0.0F) {
         int var2 = 2 + this.p.nextInt(3);

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = ((float)(var3 % 2) - 0.5F) * (float)var1 / 4.0F;
            float var5 = ((float)(var3 / 2) - 0.5F) * (float)var1 / 4.0F;
            f0 var6 = this.b();
            if(this.H()) {
               var6.K(this.X());
            }

            if(this.lT()) {
               var6.gz();
            }

            var6.S(var1 / 2, true);
            var6.S(this.b + (double)var4, this.hS + 0.5D, this.hr + (double)var5, this.p.nextFloat() * 360.0F, 0.0F);
            this.hl.S(var6);
         }
      }

      super.B();
   }

   public void W(net.ne.l var1) {
      super.W(var1);
      if(var1 instanceof b && this.XS()) {
         this.p((net.ne.a)var1);
      }

   }

   public void H(net.r.r var1) {
      if(this.XS()) {
         this.p(var1);
      }

   }

   protected void p(net.ne.a var1) {
      int var2 = this.A();
      if(this.b(var1) && this.F(var1) < 0.6D * (double)var2 * 0.6D * (double)var2 && var1.H(net.yz.z.O(this), (float)this.Q())) {
         this.I(net.nb.l.CD, 1.0F, (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         this.q(this, var1);
      }

   }

   public float A() {
      return 0.625F * this.m;
   }

   protected boolean XS() {
      return !this.D();
   }

   protected int Q() {
      return this.A();
   }

   protected net.yz.a m(net.yz.z var1) {
      return this.D()?net.nb.l.oW:net.nb.l.MU;
   }

   protected net.yz.a r() {
      return this.D()?net.nb.l.o2:net.nb.l.MS;
   }

   protected net.yz.a S() {
      return this.D()?net.nb.l.DU:net.nb.l.oO;
   }

   protected net.n0.y X() {
      return this.A() == 1?net.nb.j.P:null;
   }

   @Nullable
   protected m_ N() {
      return this.A() == 1?net.y7.p.Z:net.y7.p.W;
   }

   public boolean l4() {
      net.u.j var1 = new net.u.j(net.u.t.L(this.b), 0, net.u.t.L(this.hr));
      net.l.q var2 = this.hl.d(var1);
      if(this.hl.B().h() == net.yv.j.T && this.p.nextInt(4) != 1) {
         return false;
      } else {
         if(this.hl.k() != net.yv.l.PEACEFUL) {
            net.ns.i var3 = this.hl.P(var1);
            if(var3 == net.nb.x.dQ && this.hS > 50.0D && this.hS < 70.0D && this.p.nextFloat() < 0.5F && this.p.nextFloat() < this.hl.b() && this.hl.y(new net.u.j(this)) <= this.p.nextInt(8)) {
               return super.l4();
            }

            if(this.p.nextInt(10) == 0 && var2.y(987234911L).nextInt(10) == 0 && this.hS < 40.0D) {
               return super.l4();
            }
         }

         return false;
      }
   }

   protected float G() {
      return 0.4F * (float)this.A();
   }

   public int w() {
      return 0;
   }

   protected boolean Xp() {
      return this.A() > 0;
   }

   protected void Z() {
      this.K = 0.41999998688697815D;
      this.w = true;
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      int var3 = this.p.nextInt(3);
      if(var3 < 2 && this.p.nextFloat() < 0.5F * var1.l()) {
         ++var3;
      }

      int var4 = 1 << var3;
      this.S(var4, true);
      return super.t(var1, var2);
   }

   protected net.yz.a V() {
      return this.D()?net.nb.l.f:net.nb.l.Pu;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class c extends net.y_.u {
      private float h;
      private int o;
      private final f0 y;
      private boolean x;

      public c(f0 var1) {
         super(var1);
         this.y = var1;
         this.h = 180.0F * var1.hN / 3.1415927F;
      }

      public void V(float var1, boolean var2) {
         this.h = var1;
         this.x = var2;
      }

      public void f(double var1) {
         this.b = var1;
         this.p = net.y_.u.MOVE_TO;
      }

      public void D() {
         n.o.y();
         this.D.hN = this.p(this.D.hN, this.h, 90.0F);
         this.D.A3 = this.D.hN;
         this.D.AK = this.D.hN;
         if(this.p != net.y_.u.MOVE_TO) {
            this.D.M(0.0F);
         }

         this.p = net.y_.u.WAIT;
         if(this.D.k) {
            this.D.P((float)(this.b * this.D.t(net.ne.d.G).K()));
            if(this.o-- <= 0) {
               this.o = this.y.j();
               if(this.x) {
                  this.o /= 3;
               }

               this.y.D().F();
               if(!this.y.Xp()) {
                  return;
               }

               this.y.I(this.y.V(), this.y.G(), ((this.y.Q().nextFloat() - this.y.Q().nextFloat()) * 0.2F + 1.0F) * 0.8F);
            }

            this.y.XG = 0.0F;
            this.y.XK = 0.0F;
            this.D.P(0.0F);
         }

         this.D.P((float)(this.b * this.D.t(net.ne.d.G).K()));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class d extends net.y_.b {
      private final f0 b;

      public d(f0 var1) {
         this.b = var1;
         this.h(5);
         ((net.b.s)var1.H()).f(true);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return this.b.p() || this.b.h();
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(this.b.Q().nextFloat() < 0.8F) {
            this.b.D().F();
         }

         ((f0.c)this.b.m()).f(1.2D);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class e extends net.y_.b {
      private final f0 R;

      public e(f0 var1) {
         this.R = var1;
         this.h(5);
      }

      public boolean f() {
         return true;
      }

      public void E() {
         ((f0.c)this.R.m()).f(1.0D);
      }
   }

   static class h extends net.y_.b {
      private final f0 k;
      private int C;

      public h(f0 var1) {
         this.k = var1;
         this.h(2);
      }

      public boolean f() {
         net.ne.a var1 = this.k.M();
         return false;
      }

      public void I() {
         this.C = 300;
         super.I();
      }

      public boolean X() {
         n.o.y();
         net.ne.a var2 = this.k.M();
         return var2 == null?false:(!var2.P()?false:(var2 instanceof net.r.r && ((net.r.r)var2).a6.T?false:--this.C > 0));
      }

      public void E() {
         this.k.S(this.k.M(), 10.0F, 10.0F);
         ((f0.c)this.k.m()).V(this.k.hN, this.k.XS());
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class o extends net.y_.b {
      private final f0 W;
      private float D;
      private int I;

      public o(f0 var1) {
         this.W = var1;
         this.h(2);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return this.W.M() == null && (this.W.k || this.W.p() || this.W.h() || this.W.J(net.nb.b.A));
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(--this.I <= 0) {
            this.I = 40 + this.W.Q().nextInt(60);
            this.D = (float)this.W.Q().nextInt(360);
         }

         ((f0.c)this.W.m()).V(this.D, false);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
