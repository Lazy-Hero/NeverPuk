package net.yn;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.UUID;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.nl.z1;
import net.nl.zv;
import net.y9.lk;
import net.y_.oa;
import net.y_.ok;
import net.y_.op;
import net.y_.or;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yz.ai;

public abstract class j extends w implements net.nl.w, net.ne.t {
   private static final Predicate NL = new Predicate() {
      public boolean a(@Nullable net.ne.l var1) {
         int var2 = net.yn.z.B();
         return var1 instanceof j && ((j)var1).US();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   protected static final net.s.b NA = (new net.s.r((net.s.b)null, "horse.jumpStrength", 0.7D, 0.0D, 2.0D)).k("Jump Strength").u(true);
   private static final net.k.v NY = net.k.n.q(j.class, net.k.y.g);
   private static final net.k.v Nu = net.k.n.q(j.class, net.k.y.e);
   private int NO;
   private int NQ;
   private int NW;
   public int Nf;
   public int Nl;
   protected boolean Nx;
   protected zv Nq;
   protected int Nw;
   protected float N4;
   private boolean NM;
   private float Ne;
   private float NZ;
   private float Nj;
   private float NB;
   private float N2;
   private float NV;
   protected boolean N9 = true;
   protected int Ns;

   public j(net.yv.r var1) {
      super(var1);
      this.S(1.3964844F, 1.6F);
      this.ha = 1.0F;
      this.I_();
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new oy(this, 1.2D));
      this.p_.X(1, new or(this, 1.2D));
      this.p_.X(2, new ot(this, 1.0D, j.class));
      this.p_.X(4, new net.y_.h(this, 1.0D));
      this.p_.X(6, new ow(this, 0.7D));
      this.p_.X(7, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(8, new oa(this));
   }

   protected void g() {
      super.g();
      this.G.r(NY, Byte.valueOf((byte)0));
      this.G.r(Nu, Optional.absent());
   }

   protected boolean d(int var1) {
      return (((Byte)this.G.a(NY)).byteValue() & var1) != 0;
   }

   protected void A(int var1, boolean var2) {
      byte var3 = ((Byte)this.G.a(NY)).byteValue();
      this.G.d(NY, Byte.valueOf((byte)(var3 | var1)));
   }

   public boolean Up() {
      return this.d(2);
   }

   @Nullable
   public UUID C() {
      return (UUID)((Optional)this.G.a(Nu)).orNull();
   }

   public void Q(@Nullable UUID var1) {
      this.G.d(Nu, Optional.fromNullable(var1));
   }

   public float j() {
      return 0.5F;
   }

   public void B(boolean var1) {
      this.L(this.j());
   }

   public boolean Ug() {
      return this.Nx;
   }

   public void V(boolean var1) {
      this.A(2, var1);
   }

   public void D(boolean var1) {
      this.Nx = var1;
   }

   public boolean p(net.r.r var1) {
      return super.p(var1) && this.g() != net.ne.u.UNDEAD;
   }

   protected void f(float var1) {
      if(var1 > 6.0F && this.Un()) {
         this.g(false);
      }

   }

   public boolean Un() {
      return this.d(16);
   }

   public boolean UH() {
      return this.d(32);
   }

   public boolean US() {
      return this.d(8);
   }

   public void E(boolean var1) {
      this.A(8, var1);
   }

   public void W(boolean var1) {
      this.A(4, var1);
   }

   public int c() {
      return this.Nw;
   }

   public void w(int var1) {
      this.Nw = var1;
   }

   public int n(int var1) {
      int var2 = net.u.t.g(this.c() + var1, 0, this.x());
      this.w(var2);
      return var2;
   }

   public boolean H(net.yz.z var1, float var2) {
      net.ne.l var3 = var1.v();
      return (!this.t() || !this.B(var3)) && super.H(var1, var2);
   }

   public boolean b() {
      return !this.t();
   }

   private void Ie() {
      this.Ix();
      if(!this.c()) {
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.CW, this.E(), 1.0F, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
      }

   }

   public void v(float var1, float var2) {
      if(var1 > 1.0F) {
         this.I(net.nb.l.Hx, 0.4F, 1.0F);
      }

      int var3 = net.u.t.Y((var1 * 0.5F - 3.0F) * var2);
      this.H(net.yz.z.H, (float)var3);
      if(this.t()) {
         for(net.ne.l var5 : this.m()) {
            var5.H(net.yz.z.H, (float)var3);
         }
      }

      net.yw.n var7 = this.hl.Z(new net.u.j(this.b, this.hS - 0.2D - (double)this.hq, this.hr));
      net.y9.l var8 = var7.Q();
      if(var7.n() != net.y1.l.q && !this.c()) {
         lk var6 = var8.X();
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, var6.H(), this.E(), var6.m() * 0.5F, var6.X() * 0.75F);
      }

   }

   protected int R() {
      return 2;
   }

   protected void I_() {
      zv var1 = this.Nq;
      this.Nq = new zv("HorseChest", this.R());
      this.Nq.M(this.Q());
      var1.j(this);
      int var2 = Math.min(var1.e(), this.Nq.e());

      for(int var3 = 0; var3 < var2; ++var3) {
         ks var4 = var1.A(var3);
         if(!var4.B()) {
            this.Nq.S(var3, var4.s());
         }
      }

      this.Nq.Z(this);
      this.IK();
   }

   protected void IK() {
      if(!this.hl.x) {
         this.W(!this.Nq.A(0).B() && this.Ui());
      }

   }

   public void b(z1 var1) {
      boolean var2 = this.Us();
      this.IK();
      if(this.x > 20 && this.Us()) {
         this.I(net.nb.l.o3, 0.5F, 1.0F);
      }

   }

   @Nullable
   protected j a(net.ne.l var1, double var2) {
      double var4 = Double.MAX_VALUE;
      net.ne.l var6 = null;

      for(net.ne.l var8 : this.hl.S(var1, var1.i().T(var2, var2, var2), NL)) {
         double var9 = var8.o(var1.b, var1.hS, var1.hr);
         if(var9 < var4) {
            var6 = var8;
            var4 = var9;
         }
      }

      return (j)var6;
   }

   public double W() {
      return this.t(NA).K();
   }

   @Nullable
   protected net.yz.a r() {
      this.Ix();
      return null;
   }

   @Nullable
   protected net.yz.a m(net.yz.z var1) {
      this.Ix();
      if(this.p.nextInt(3) == 0) {
         this.IR();
      }

      return null;
   }

   @Nullable
   protected net.yz.a T() {
      this.Ix();
      if(this.p.nextInt(10) == 0 && !this.HD()) {
         this.IR();
      }

      return null;
   }

   public boolean Ui() {
      return true;
   }

   public boolean Us() {
      return this.d(4);
   }

   @Nullable
   protected net.yz.a U() {
      this.Ix();
      this.IR();
      return null;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      if(!var2.p().n().y()) {
         lk var3 = var2.X();
         if(this.hl.Z(var1.h()).Q() == net.nb.f.Tl) {
            var3 = net.nb.f.Tl.X();
         }

         if(this.t() && this.N9) {
            ++this.Ns;
            if(this.Ns > 5 && this.Ns % 3 == 0) {
               this.w(var3);
            } else if(this.Ns <= 5) {
               this.I(net.nb.l.HP, var3.m() * 0.15F, var3.X());
            }
         } else if(var3 == lk.v) {
            this.I(net.nb.l.HP, var3.m() * 0.15F, var3.X());
         } else {
            this.I(net.nb.l.ow, var3.m() * 0.15F, var3.X());
         }
      }

   }

   protected void w(lk var1) {
      this.I(net.nb.l.Pm, var1.m() * 0.15F, var1.X());
   }

   protected void W() {
      super.W();
      this.T().i(NA);
      this.t(net.ne.d.C).t(53.0D);
      this.t(net.ne.d.G).t(0.22499999403953552D);
   }

   public int W() {
      return 6;
   }

   public int x() {
      return 100;
   }

   protected float G() {
      return 0.8F;
   }

   public int g() {
      return 400;
   }

   public void t(net.r.r var1) {
      if(!this.hl.x && (!this.t() || this.m(var1)) && this.Up()) {
         this.Nq.M(this.Q());
         var1.F(this, this.Nq);
      }

   }

   protected boolean N(net.r.r var1, ks var2) {
      boolean var3 = false;
      float var4 = 0.0F;
      short var5 = 0;
      byte var6 = 0;
      net.n0.y var7 = var2.Z();
      if(var7 == net.nb.j.Sd) {
         var4 = 2.0F;
         var5 = 20;
         var6 = 3;
      } else if(var7 == net.nb.j.WE) {
         var4 = 1.0F;
         var5 = 30;
         var6 = 3;
      } else if(var7 == net.n0.y.q(net.nb.f.ow)) {
         var4 = 20.0F;
         var5 = 180;
      } else if(var7 == net.nb.j.W8) {
         var4 = 3.0F;
         var5 = 60;
         var6 = 3;
      } else if(var7 == net.nb.j.b) {
         var4 = 4.0F;
         var5 = 60;
         var6 = 5;
         if(this.Up() && this.z() == 0 && !this.BZ()) {
            var3 = true;
            this.Q(var1);
         }
      } else if(var7 == net.nb.j.J) {
         var4 = 10.0F;
         var5 = 240;
         var6 = 10;
         if(this.Up() && this.z() == 0 && !this.BZ()) {
            var3 = true;
            this.Q(var1);
         }
      }

      if(this.h() < this.w()) {
         float var8;
         int var10000 = (var8 = var4 - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      }

      if(this.H9()) {
         this.hl.n(ai.VILLAGER_HAPPY, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, 0.0D, 0.0D, 0.0D, new int[0]);
         if(!this.hl.x) {
            this.Q(var5);
         }

         var3 = true;
      }

      if(!this.Up() && this.c() < this.x()) {
         var3 = true;
         if(!this.hl.x) {
            this.n(var6);
         }
      }

      this.Ie();
      return var3;
   }

   protected void n(net.r.r var1) {
      var1.hN = this.hN;
      var1.V = this.V;
      this.g(false);
      this.b(false);
      if(!this.hl.x) {
         var1.W(this);
      }

   }

   protected boolean HD() {
      return super.HD() && this.t() && this.Us() || this.Un() || this.UH();
   }

   public boolean V(ks var1) {
      return false;
   }

   private void IF() {
      this.Nf = 1;
   }

   public void O(net.yz.z var1) {
      super.O(var1);
      if(!this.hl.x && this.Nq != null) {
         for(int var2 = 0; var2 < this.Nq.e(); ++var2) {
            ks var3 = this.Nq.A(var2);
            if(!var3.B()) {
               this.O(var3, 0.0F);
            }
         }
      }

   }

   public void d() {
      if(this.p.nextInt(200) == 0) {
         this.IF();
      }

      super.d();
      if(!this.hl.x) {
         if(this.p.nextInt(900) == 0 && this.AA == 0) {
            this.d(1.0F);
         }

         if(this.Uc()) {
            if(!this.Un() && !this.t() && this.p.nextInt(300) == 0 && this.hl.Z(new net.u.j(net.u.t.L(this.b), net.u.t.L(this.hS) - 1, net.u.t.L(this.hr))).Q() == net.nb.f.p) {
               this.g(true);
            }

            if(this.Un() && ++this.NO > 50) {
               this.NO = 0;
               this.g(false);
            }
         }

         this.Iq();
      }

   }

   protected void Iq() {
      if(this.US() && this.H9() && !this.Un()) {
         j var1 = this.a(this, 16.0D);
         if(this.F(var1) > 4.0D) {
            this.p6.v(var1);
         }
      }

   }

   public boolean Uc() {
      return true;
   }

   public void A() {
      super.A();
      if(this.NQ > 0 && ++this.NQ > 30) {
         this.NQ = 0;
         this.A(64, false);
      }

      if(this.V() && this.NW > 0 && ++this.NW > 20) {
         this.NW = 0;
         this.b(false);
      }

      if(this.Nf > 0 && ++this.Nf > 8) {
         this.Nf = 0;
      }

      if(this.Nl > 0) {
         ++this.Nl;
         if(this.Nl > 300) {
            this.Nl = 0;
         }
      }

      this.NZ = this.Ne;
      if(this.Un()) {
         this.Ne += (1.0F - this.Ne) * 0.4F + 0.05F;
         if(this.Ne > 1.0F) {
            this.Ne = 1.0F;
         }
      } else {
         this.Ne += (0.0F - this.Ne) * 0.4F - 0.05F;
         if(this.Ne < 0.0F) {
            this.Ne = 0.0F;
         }
      }

      this.NB = this.Nj;
      if(this.UH()) {
         this.Ne = 0.0F;
         this.NZ = this.Ne;
         this.Nj += (1.0F - this.Nj) * 0.4F + 0.05F;
         if(this.Nj > 1.0F) {
            this.Nj = 1.0F;
         }
      } else {
         this.NM = false;
         this.Nj += (0.8F * this.Nj * this.Nj * this.Nj - this.Nj) * 0.6F - 0.05F;
         if(this.Nj < 0.0F) {
            this.Nj = 0.0F;
         }
      }

      this.NV = this.N2;
      if(this.d(64)) {
         this.N2 += (1.0F - this.N2) * 0.7F + 0.05F;
         if(this.N2 > 1.0F) {
            this.N2 = 1.0F;
         }
      } else {
         this.N2 += (0.0F - this.N2) * 0.7F - 0.05F;
         if(this.N2 < 0.0F) {
            this.N2 = 0.0F;
         }
      }

   }

   private void Ix() {
      if(!this.hl.x) {
         this.NQ = 1;
         this.A(64, true);
      }

   }

   public void g(boolean var1) {
      this.A(16, var1);
   }

   public void b(boolean var1) {
      this.g(false);
      this.A(32, var1);
   }

   private void IR() {
      if(this.V()) {
         this.NW = 1;
         this.b(true);
      }

   }

   public void Is() {
      this.IR();
      net.yz.a var1 = this.U();
      this.I(var1, this.G(), this.s());
   }

   public boolean w(net.r.r var1) {
      this.Q(var1.O());
      this.V(true);
      if(var1 instanceof net.r.h) {
         b2.t.I((net.r.h)((net.r.h)var1), (w)this);
      }

      this.hl.k(this, (byte)7);
      return true;
   }

   public void E(float var1, float var2, float var3) {
      int var4 = net.yn.z.B();
      if(this.t() && this.lC() && this.Us()) {
         net.ne.a var5 = (net.ne.a)this.C();
         this.hN = var5.hN;
         this.hq = this.hN;
         this.V = var5.V * 0.5F;
         this.r(this.hN, this.V);
         this.AK = this.hN;
         this.A3 = this.AK;
         var1 = var5.XG * 0.5F;
         var3 = var5.XK;
         if(Float.compare(var3, 0.0F) <= 0) {
            var3 *= 0.25F;
            this.Ns = 0;
         }

         if(this.k && Float.compare(this.N4, 0.0F) == 0 && this.UH() && !this.NM) {
            var1 = 0.0F;
            var3 = 0.0F;
         }

         if(Float.compare(this.N4, 0.0F) > 0 && !this.Ug() && this.k) {
            this.K = this.W() * (double)this.N4;
            if(this.J(net.nb.b.q)) {
               this.K += (double)((float)(this.b((net.n_.f)net.nb.b.q).d() + 1) * 0.1F);
            }

            this.D(true);
            this.w = true;
            if(var3 > 0.0F) {
               float var6 = net.u.t.A(this.hN * 0.017453292F);
               float var7 = net.u.t.m(this.hN * 0.017453292F);
               this.hf += (double)(-0.4F * var6 * this.N4);
               this.J += (double)(0.4F * var7 * this.N4);
               this.I(net.nb.l.M1, 0.4F, 1.0F);
            }

            this.N4 = 0.0F;
         }

         this.AN = this.q() * 0.1F;
         if(this.V()) {
            this.P((float)this.t(net.ne.d.G).K());
            super.E(var1, var2, var3);
         }

         if(var5 instanceof net.r.r) {
            this.hf = 0.0D;
            this.K = 0.0D;
            this.J = 0.0D;
         }

         if(this.k) {
            this.N4 = 0.0F;
            this.D(false);
         }

         this.AS = this.Aq;
         double var11 = this.b - this.h;
         double var8 = this.hr - this.l;
         float var10 = net.u.t.R(var11 * var11 + var8 * var8) * 4.0F;
         if(var10 > 1.0F) {
            var10 = 1.0F;
         }

         this.Aq += (var10 - this.Aq) * 0.4F;
         this.A5 += this.Aq;
      }

      this.AN = 0.02F;
      super.E(var1, var2, var3);
   }

   public static void t(net.c0.d var0, Class var1) {
      net.ne.y.J(var0, var1);
      var0.U(net.c0.q.ENTITY, new net.ng.c(var1, new String[]{"SaddleItem"}));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("EatingHaystack", this.Un());
      var1.c("Bred", this.US());
      var1.r("Temper", this.c());
      var1.c("Tame", this.Up());
      if(this.C() != null) {
         var1.b("OwnerUUID", this.C().toString());
      }

      if(!this.Nq.A(0).B()) {
         var1.K("SaddleItem", this.Nq.A(0).Z(new net.nj.f()));
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.g(var1.i("EatingHaystack"));
      this.E(var1.i("Bred"));
      this.w(var1.P("Temper"));
      this.V(var1.i("Tame"));
      String var2;
      if(var1.K("OwnerUUID", 8)) {
         var2 = var1.J("OwnerUUID");
      } else {
         String var3 = var1.J("Owner");
         var2 = net.n.k.T(this.E(), var3);
      }

      if(!var2.isEmpty()) {
         this.Q(UUID.fromString(var2));
      }

      net.s.i var5 = this.T().a("Speed");
      this.t(net.ne.d.G).t(var5.J() * 0.25D);
      if(var1.K("SaddleItem", 10)) {
         ks var4 = new ks(var1.o("SaddleItem"));
         if(var4.Z() == net.nb.j.h) {
            this.Nq.S(0, var4);
         }
      }

      this.IK();
   }

   public boolean b(w var1) {
      return false;
   }

   protected boolean Ue() {
      return !this.t() && !this.M() && this.Up() && !this.H9() && this.h() >= this.w() && this.BZ();
   }

   @Nullable
   public net.ne.j r(net.ne.j var1) {
      return null;
   }

   protected void t(net.ne.j var1, j var2) {
      double var3 = this.t(net.ne.d.C).J() + var1.t(net.ne.d.C).J() + (double)this.O();
      var2.t(net.ne.d.C).t(var3 / 3.0D);
      double var5 = this.t(NA).J() + var1.t(NA).J() + this.o();
      var2.t(NA).t(var5 / 3.0D);
      double var7 = this.t(net.ne.d.G).J() + var1.t(net.ne.d.G).J() + this.B();
      var2.t(net.ne.d.G).t(var7 / 3.0D);
   }

   public boolean lC() {
      return this.C() instanceof net.ne.a;
   }

   public float G(float var1) {
      return this.NZ + (this.Ne - this.NZ) * var1;
   }

   public float O(float var1) {
      return this.NB + (this.Nj - this.NB) * var1;
   }

   public float q(float var1) {
      return this.NV + (this.N2 - this.NV) * var1;
   }

   public void m(int var1) {
      if(this.Us()) {
         var1 = 0;
         this.N4 = 0.4F + 0.4F * (float)var1 / 90.0F;
      }

   }

   public boolean D() {
      return this.Us();
   }

   public void p(int var1) {
      this.NM = true;
      this.IR();
   }

   public void H() {
   }

   protected void P(boolean var1) {
      ai var2 = ai.HEART;
      int var3 = 0;

      while(true) {
         double var4 = this.p.nextGaussian() * 0.02D;
         double var6 = this.p.nextGaussian() * 0.02D;
         double var8 = this.p.nextGaussian() * 0.02D;
         this.hl.n(var2, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var4, var6, var8, new int[0]);
         ++var3;
      }
   }

   public void R(byte var1) {
      if(var1 == 7) {
         this.P(true);
      } else if(var1 == 6) {
         this.P(false);
      } else {
         super.R(var1);
      }

   }

   public void F(net.ne.l var1) {
      super.F(var1);
      if(var1 instanceof net.ne.y) {
         net.ne.y var2 = (net.ne.y)var1;
         this.AK = var2.AK;
      }

      if(this.NB > 0.0F) {
         float var6 = net.u.t.A(this.AK * 0.017453292F);
         float var3 = net.u.t.m(this.AK * 0.017453292F);
         float var4 = 0.7F * this.NB;
         float var5 = 0.15F * this.NB;
         var1.t(this.b + (double)(var4 * var6), this.hS + this.e() + var1.O() + (double)var5, this.hr - (double)(var4 * var3));
         if(var1 instanceof net.ne.a) {
            ((net.ne.a)var1).AK = this.AK;
         }
      }

   }

   protected float O() {
      return 15.0F + (float)this.p.nextInt(8) + (float)this.p.nextInt(9);
   }

   protected double o() {
      return 0.4000000059604645D + this.p.nextDouble() * 0.2D + this.p.nextDouble() * 0.2D + this.p.nextDouble() * 0.2D;
   }

   protected double B() {
      return (0.44999998807907104D + this.p.nextDouble() * 0.3D + this.p.nextDouble() * 0.3D + this.p.nextDouble() * 0.3D) * 0.25D;
   }

   public boolean K() {
      return false;
   }

   public float A() {
      return this.m;
   }

   public boolean UC() {
      return false;
   }

   public boolean o(ks var1) {
      return false;
   }

   public boolean K(int var1, ks var2) {
      int var3 = var1 - 400;
      if(var3 < 2 && var3 < this.Nq.e()) {
         if(var2.Z() != net.nb.j.h) {
            return false;
         } else if(var3 == 1 && (!this.UC() || !this.o(var2))) {
            return false;
         } else {
            this.Nq.S(var3, var2);
            this.IK();
            return true;
         }
      } else {
         int var4 = var1 - 500 + 2;
         if(var4 >= 2 && var4 < this.Nq.e()) {
            this.Nq.S(var4, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   public net.ne.l C() {
      return this.H().isEmpty()?null:(net.ne.l)this.H().get(0);
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      if(this.p.nextInt(5) == 0) {
         this.V(-24000);
      }

      return var2;
   }

   private static xn e(xn var0) {
      return var0;
   }
}
