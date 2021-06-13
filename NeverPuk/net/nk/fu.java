package net.nk;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.b;
import net.nk.f2;
import net.nk.fy;
import net.nk.i;
import net.nk.m;
import net.nk.n;
import net.nl.z2;
import net.y_.o2;
import net.y_.o8;
import net.y_.oa;
import net.y_.oi;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ow;
import net.yz.m_;

public class fu extends i {
   protected static final net.s.b WJ = (new net.s.r((net.s.b)null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).k("Spawn Reinforcements Chance");
   private static final UUID WZ = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final net.s.k WC = new net.s.k(WZ, "Baby speed boost", 0.5D, 1);
   private static final net.k.v WR = net.k.n.q(fu.class, net.k.y.f);
   private static final net.k.v Wq = net.k.n.q(fu.class, net.k.y.d);
   private static final net.k.v WK = net.k.n.q(fu.class, net.k.y.f);
   private final net.y_.p Wm = new net.y_.p(this);
   private boolean W9;
   private float Wn = -1.0F;
   private float WE;

   public fu(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.95F);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(2, new net.y_.e(this, 1.0D, false));
      this.p_.X(5, new o2(this, 1.0D));
      this.p_.X(7, new ow(this, 1.0D));
      this.p_.X(8, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(8, new oa(this));
      this.H();
   }

   protected void H() {
      this.p_.X(6, new oi(this, 1.0D, false));
      this.pM.X(1, new oo(this, true, new Class[]{f2.class}));
      this.pM.X(2, new o8(this, net.r.r.class, true));
      this.pM.X(3, new o8(this, net.yn.s.class, false));
      this.pM.X(3, new o8(this, b.class, true));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.L).t(35.0D);
      this.t(net.ne.d.G).t(0.23000000417232513D);
      this.t(net.ne.d.S).t(3.0D);
      this.t(net.ne.d.g).t(2.0D);
      this.T().i(WJ).t(this.p.nextDouble() * 0.10000000149011612D);
   }

   protected void g() {
      super.g();
      this.A().r(WR, Boolean.valueOf(false));
      this.A().r(Wq, Integer.valueOf(0));
      this.A().r(WK, Boolean.valueOf(false));
   }

   public void k(boolean var1) {
      this.A().d(WK, Boolean.valueOf(var1));
   }

   public boolean Ir() {
      return ((Boolean)this.A().a(WK)).booleanValue();
   }

   public boolean Ip() {
      return this.W9;
   }

   public void U(boolean var1) {
      if(this.W9 != var1) {
         this.W9 = var1;
         ((net.b.s)this.H()).D(var1);
         this.p_.X(1, this.Wm);
      }

   }

   public boolean H9() {
      return ((Boolean)this.A().a(WR)).booleanValue();
   }

   protected int Q(net.r.r var1) {
      if(this.H9()) {
         this.p0 = (int)((float)this.p0 * 2.5F);
      }

      return super.Q(var1);
   }

   public void s(boolean var1) {
      this.A().d(WR, Boolean.valueOf(var1));
      if(this.hl != null && !this.hl.x) {
         net.s.i var2 = this.t(net.ne.d.G);
         var2.n(WC);
         var2.g(WC);
      }

      this.P(var1);
   }

   public void O(net.k.v var1) {
      if(WR.equals(var1)) {
         this.P(this.H9());
      }

      super.O(var1);
   }

   public void d() {
      if(this.hl.u() && !this.hl.x && !this.H9() && this.I_()) {
         float var1 = this.d();
         if(var1 > 0.5F && this.p.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.hl.V(new net.u.j(this.b, this.hS + (double)this.A(), this.hr))) {
            boolean var2 = true;
            ks var3 = this.U(z2.HEAD);
            if(!var3.B()) {
               if(var3.M()) {
                  var3.d(var3.z() + this.p.nextInt(2));
                  if(var3.z() >= var3.Z()) {
                     this.T(var3);
                     this.u(z2.HEAD, ks.a);
                  }
               }

               var2 = false;
            }

            this.n(8);
         }
      }

      super.d();
   }

   protected boolean I_() {
      return true;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(super.H(var1, var2)) {
         net.ne.a var3 = this.M();
         if(var1.v() instanceof net.ne.a) {
            var3 = (net.ne.a)var1.v();
         }

         if(this.hl.k() == net.yv.l.HARD && (double)this.p.nextFloat() < this.t(WJ).K() && this.hl.N().b("doMobSpawning")) {
            int var4 = net.u.t.L(this.b);
            int var5 = net.u.t.L(this.hS);
            int var6 = net.u.t.L(this.hr);
            fu var7 = new fu(this.hl);
            int var8 = 0;

            while(true) {
               int var9 = var4 + net.u.t.A(this.p, 7, 40) * net.u.t.A(this.p, -1, 1);
               int var10 = var5 + net.u.t.A(this.p, 7, 40) * net.u.t.A(this.p, -1, 1);
               int var11 = var6 + net.u.t.A(this.p, 7, 40) * net.u.t.A(this.p, -1, 1);
               if(this.hl.Z(new net.u.j(var9, var10 - 1, var11)).z() && this.hl.y(new net.u.j(var9, var10, var11)) < 10) {
                  var7.t((double)var9, (double)var10, (double)var11);
                  if(!this.hl.g((double)var9, (double)var10, (double)var11, 7.0D) && this.hl.N((net.u.e)var7.i(), (net.ne.l)var7) && this.hl.h(var7, var7.i()).isEmpty() && !this.hl.p(var7.i())) {
                     this.hl.S(var7);
                     var7.C(var3);
                     var7.t(this.hl.G(new net.u.j(var7)), (net.ne.g)null);
                     this.t(WJ).g(new net.s.k("Zombie reinforcement caller charge", -0.05000000074505806D, 0));
                     var7.t(WJ).g(new net.s.k("Zombie reinforcement callee charge", -0.05000000074505806D, 0));
                     break;
                  }
               }

               ++var8;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean S(net.ne.l var1) {
      boolean var2 = super.S(var1);
      float var3 = this.hl.G(new net.u.j(this)).V();
      if(this.S().B() && this.a() && this.p.nextFloat() < var3 * 0.3F) {
         var1.n(2 * (int)var3);
      }

      return var2;
   }

   protected net.yz.a T() {
      return net.nb.l.w6;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.DZ;
   }

   protected net.yz.a r() {
      return net.nb.l.F;
   }

   protected net.yz.a M() {
      return net.nb.l.R;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(this.M(), 0.15F, 1.0F);
   }

   public net.ne.u g() {
      return net.ne.u.UNDEAD;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pP;
   }

   protected void T(net.yv.g var1) {
      super.T(var1);
      if(this.p.nextFloat() < (this.hl.k() == net.yv.l.HARD?0.05F:0.01F)) {
         int var2 = this.p.nextInt(3);
         this.u(z2.MAINHAND, new ks(net.nb.j.O));
      }

   }

   public static void H(net.c0.d var0) {
      net.ne.y.J(var0, fu.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      if(this.H9()) {
         var1.c("IsBaby", true);
      }

      var1.c("CanBreakDoors", this.Ip());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.i("IsBaby")) {
         this.s(true);
      }

      this.U(var1.i("CanBreakDoors"));
   }

   public void M(net.ne.a var1) {
      super.M(var1);
      if((this.hl.k() == net.yv.l.NORMAL || this.hl.k() == net.yv.l.HARD) && var1 instanceof net.yn.s) {
         if(this.hl.k() != net.yv.l.HARD && this.p.nextBoolean()) {
            return;
         }

         net.yn.s var2 = (net.yn.s)var1;
         fy var3 = new fy(this.hl);
         var3.e(var2);
         this.hl.W((net.ne.l)var2);
         var3.t(this.hl.G(new net.u.j(var3)), new fu.x(false));
         var3.h(var2.u());
         var3.s(var2.H9());
         var3.e(var2.lJ());
         if(var2.H()) {
            var3.K(var2.X());
            var3.r(var2.y());
         }

         this.hl.S(var3);
         this.hl.N((net.r.r)null, 1026, new net.u.j(this), 0);
      }

   }

   public float A() {
      float var1 = 1.74F;
      if(this.H9()) {
         var1 = (float)((double)var1 - 0.81D);
      }

      return var1;
   }

   protected boolean p(ks var1) {
      return (var1.Z() != net.nb.j.YV || !this.H9() || !this.M()) && super.p(var1);
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      n.o.y();
      var2 = super.t(var1, var2);
      float var4 = var1.l();
      this.t(Float.compare(this.p.nextFloat(), 0.55F * var4) < 0);
      if(var2 == null) {
         var2 = new fu.x(this.hl.G.nextFloat() < 0.05F);
      }

      if(var2 instanceof fu.x) {
         fu.x var5 = (fu.x)var2;
         if(var5.N) {
            this.s(true);
            if((double)this.hl.G.nextFloat() < 0.05D) {
               List var6 = this.hl.L(net.yn.a.class, this.i().f(5.0D, 3.0D, 5.0D), net.yz.q.P);
               if(!var6.isEmpty()) {
                  net.yn.a var7 = (net.yn.a)var6.get(0);
                  var7.q(true);
                  this.W(var7);
               }
            }

            if((double)this.hl.G.nextFloat() < 0.05D) {
               net.yn.a var11 = new net.yn.a(this.hl);
               var11.S(this.b, this.hS, this.hr, this.hN, 0.0F);
               var11.t(var1, (net.ne.g)null);
               var11.q(true);
               this.hl.S(var11);
               this.W(var11);
            }
         }
      }

      this.U(Float.compare(this.p.nextFloat(), var4 * 0.1F) < 0);
      this.T(var1);
      this.I(var1);
      if(this.U(z2.HEAD).B()) {
         Calendar var9 = this.hl.l();
         if(var9.get(2) + 1 == 10 && var9.get(5) == 31 && this.p.nextFloat() < 0.25F) {
            this.u(z2.HEAD, new ks(this.p.nextFloat() < 0.1F?net.nb.f.N:net.nb.f.TS));
            this.pw[z2.HEAD.l()] = 0.0F;
         }
      }

      this.t(net.ne.d.l).g(new net.s.k("Random spawn bonus", this.p.nextDouble() * 0.05000000074505806D, 0));
      double var10 = this.p.nextDouble() * 1.5D * (double)var4;
      if(Double.compare(var10, 1.0D) > 0) {
         this.t(net.ne.d.L).g(new net.s.k("Random zombie-spawn bonus", var10, 2));
      }

      if(this.p.nextFloat() < var4 * 0.05F) {
         this.t(WJ).g(new net.s.k("Leader zombie bonus", this.p.nextDouble() * 0.25D + 0.5D, 0));
         this.t(net.ne.d.C).g(new net.s.k("Leader zombie bonus", this.p.nextDouble() * 3.0D + 1.0D, 2));
         this.U(true);
      }

      return var2;
   }

   public void P(boolean var1) {
      this.w(0.5F);
   }

   protected final void S(float var1, float var2) {
      boolean var3 = this.Wn > 0.0F && this.WE > 0.0F;
      this.Wn = var1;
      this.WE = var2;
      this.w(1.0F);
   }

   protected final void w(float var1) {
      super.S(this.Wn * var1, this.WE * var1);
   }

   public double O() {
      return this.H9()?0.0D:-0.45D;
   }

   public void O(net.yz.z var1) {
      super.O(var1);
      if(var1.v() instanceof m) {
         m var2 = (m)var1.v();
         if(var2.nl() && var2.nn()) {
            var2.H();
            ks var3 = this.Q();
            if(!var3.B()) {
               this.O(var3, 0.0F);
            }
         }
      }

   }

   protected ks Q() {
      return new ks(net.nb.j.Y9, 1, 2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   class x implements net.ne.g {
      public boolean N;

      private x(boolean var2) {
         this.N = var2;
      }
   }
}
