package net.r;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net._x;
import net.gn;
import net.s_;
import net.sv;
import net.xn;
import net.zh;
import net.zi;
import net.c0.w;
import net.k.v;
import net.k.y;
import net.n0.k1;
import net.n0.ks;
import net.n1.q;
import net.nb.l;
import net.ne.a;
import net.ni.sg;
import net.ni.sl;
import net.nj.f;
import net.nl.z1;
import net.nl.z2;
import net.nl.zp;
import net.no.sp;
import net.r.h;
import net.r.i;
import net.r.j;
import net.r.n;
import net.u.e;
import net.u.t;
import net.y9.rn;
import net.y9.rw;
import net.yn.k;
import net.yn.u;
import net.yv.o9;
import net.yz.aa;
import net.yz.ad;
import net.yz.ag;
import net.yz.ai;
import net.yz.aq;
import net.yz.d;
import net.yz.m_;
import net.yz.p;

public abstract class r extends a {
   private static final v aT = net.k.n.q(r.class, y.r);
   private static final v az = net.k.n.q(r.class, y.d);
   protected static final v ab = net.k.n.q(r.class, y.g);
   protected static final v aN = net.k.n.q(r.class, y.g);
   protected static final v aw = net.k.n.q(r.class, y.n);
   protected static final v a2 = net.k.n.q(r.class, y.n);
   public i a8 = new i(this);
   protected zp aE = new zp();
   public net.nl.v aW;
   public net.nl.v aG;
   protected d ae = new d();
   protected int aR;
   public float aj;
   public float af;
   public int aB;
   public double aJ;
   public double ay;
   public double a5;
   public double am;
   public double au;
   public double a4;
   protected boolean as;
   public net.u.j a0;
   private int aO;
   public float ad;
   public float ax;
   public float ai;
   private net.u.j aV;
   private boolean aH;
   public n a6 = new n();
   public int aX;
   public int ac;
   public float aP;
   protected int a_;
   public float av = 0.02F;
   private int aa;
   private final GameProfile at;
   private boolean ah;
   private ks ag = ks.a;
   private final ag aL = this.J();
   @Nullable
   public q aS;
   private static boolean aZ;

   protected ag J() {
      return new ag();
   }

   public r(net.yv.r var1, GameProfile var2) {
      super(var1);
      this.k(D(var2));
      this.at = var2;
      this.aW = new net.nl.j(this.a8, !var1.x, this);
      this.aG = this.aW;
      net.u.j var3 = var1.y();
      this.S((double)var3.t() + 0.5D, (double)(var3.h() + 1), (double)var3.y() + 0.5D, 0.0F, 0.0F);
      this.Ao = 180.0F;
   }

   protected void W() {
      super.W();
      this.T().i(net.ne.d.S).t(1.0D);
      this.t(net.ne.d.G).t(0.10000000149011612D);
      this.T().i(net.ne.d.E);
      this.T().i(net.ne.d.V);
   }

   protected void g() {
      super.g();
      this.G.r(aT, Float.valueOf(0.0F));
      this.G.r(az, Integer.valueOf(0));
      this.G.r(ab, Byte.valueOf((byte)0));
      this.G.r(aN, Byte.valueOf((byte)1));
      this.G.r(aw, new f());
      this.G.r(a2, new f());
   }

   public void A() {
      zh var1 = new zh();
      _x.m(var1);
      this.r = this.VX();
      if(this.VX()) {
         this.k = false;
      }

      if(this.aB > 0) {
         --this.aB;
      }

      if(this.L()) {
         ++this.aO;
         if(this.aO > 100) {
            this.aO = 100;
         }

         if(!this.hl.x) {
            if(!this.Vg()) {
               this.H(true, true, false);
            } else if(this.hl.u()) {
               this.H(false, true, true);
            }
         }
      } else if(this.aO > 0) {
         ++this.aO;
         if(this.aO >= 110) {
            this.aO = 0;
         }
      }

      super.A();
      if(!this.hl.x && this.aG != null && !this.aG.N(this)) {
         this.x();
         this.aG = this.aW;
      }

      if(this.a() && this.a6.T) {
         this.e();
      }

      this.T();
      if(!this.hl.x) {
         this.ae.s(this);
         this.S(net.v.q.gS);
         if(this.P()) {
            this.S(net.v.q.t);
         }

         if(this.Q()) {
            this.S(net.v.q.b);
         }
      }

      int var10000 = 29999999;
      double var3 = t.F(this.b, -2.9999999E7D, 2.9999999E7D);
      double var5 = t.F(this.hr, -2.9999999E7D, 2.9999999E7D);
      if(var3 != this.b || var5 != this.hr) {
         this.t(var3, this.hS, var5);
      }

      ++this.AU;
      ks var7 = this.S();
      if(!ks.D(this.ag, var7)) {
         if(!ks.n(this.ag, var7)) {
            this.H();
         }

         this.ag = var7.B()?ks.a:var7.s();
      }

      this.aL.b();
      this.l();
   }

   private void T() {
      this.aJ = this.am;
      this.ay = this.au;
      this.a5 = this.a4;
      double var1 = this.b - this.am;
      double var3 = this.hS - this.au;
      double var5 = this.hr - this.a4;
      double var10000 = 10.0D;
      if(var1 > 10.0D) {
         this.am = this.b;
         this.aJ = this.am;
      }

      if(var5 > 10.0D) {
         this.a4 = this.hr;
         this.a5 = this.a4;
      }

      if(var3 > 10.0D) {
         this.au = this.hS;
         this.ay = this.au;
      }

      if(var1 < -10.0D) {
         this.am = this.b;
         this.aJ = this.am;
      }

      if(var5 < -10.0D) {
         this.a4 = this.hr;
         this.a5 = this.a4;
      }

      if(var3 < -10.0D) {
         this.au = this.hS;
         this.ay = this.au;
      }

      this.am += var1 * 0.25D;
      this.a4 += var5 * 0.25D;
      this.au += var3 * 0.25D;
   }

   protected void l() {
      float var1;
      float var2;
      if(this.I()) {
         var1 = 0.6F;
         var2 = 0.6F;
      } else if(this.L()) {
         var1 = 0.2F;
         var2 = 0.2F;
      } else if(this.Q()) {
         var1 = 0.6F;
         var2 = 1.65F;
      } else {
         var1 = 0.6F;
         var2 = 1.8F;
      }

      if(var1 != this.h9 || var2 != this.m) {
         e var3 = this.i();
         var3 = new e(var3.n, var3.u, var3.N, var3.n + (double)var1, var3.u + (double)var2, var3.N + (double)var1);
         if(!this.hl.v(var3)) {
            this.S(var1, var2);
         }
      }

   }

   public int B() {
      return this.a6.T?1:80;
   }

   protected net.yz.a X() {
      return l.w_;
   }

   protected net.yz.a q() {
      return l.Hg;
   }

   public int S() {
      return 10;
   }

   public void I(net.yz.a var1, float var2, float var3) {
      this.hl.L(this, this.b, this.hS, this.hr, var1, this.E(), var2, var3);
   }

   public p E() {
      return p.PLAYERS;
   }

   protected int I() {
      return 20;
   }

   public void R(byte var1) {
      if(var1 == 9) {
         this.n();
      } else if(var1 == 23) {
         this.ah = false;
      } else if(var1 == 22) {
         this.ah = true;
      } else {
         super.R(var1);
      }

   }

   protected boolean HD() {
      return this.h() <= 0.0F || this.L();
   }

   protected void x() {
      this.aG = this.aW;
   }

   public void C() {
      if(!this.hl.x && this.Q() && this.M()) {
         this.O();
         this.K(false);
      } else {
         double var1 = this.b;
         double var3 = this.hS;
         double var5 = this.hr;
         float var7 = this.hN;
         float var8 = this.V;
         super.C();
         this.aj = this.af;
         this.af = 0.0F;
         this.l(this.b - var1, this.hS - var3, this.hr - var5);
         if(this.D() instanceof u) {
            this.V = var8;
            this.hN = var7;
            this.AK = ((u)this.D()).AK;
         }
      }

   }

   public void G() {
      this.S(0.6F, 1.8F);
      super.G();
      this.u(this.w());
      this.AA = 0;
   }

   protected void r() {
      super.r();
      this.V();
      this.A3 = this.hN;
      this.AX = this.V;
   }

   public void d() {
      if(this.aR > 0) {
         --this.aR;
      }

      if(this.hl.k() == net.yv.l.PEACEFUL && this.hl.N().b("naturalRegeneration")) {
         if(this.h() < this.w() && this.x % 20 == 0) {
            this.d(1.0F);
         }

         if(this.ae.B() && this.x % 10 == 0) {
            this.ae.x(this.ae.Z() + 1);
         }
      }

      this.a8.Y();
      this.aj = this.af;
      super.d();
      net.s.i var1 = this.t(net.ne.d.G);
      if(!this.hl.x) {
         var1.t((double)this.a6.V());
      }

      this.AN = this.av;
      if(this.B()) {
         this.AN = (float)((double)this.AN + (double)this.av * 0.3D);
      }

      this.P((float)var1.K());
      float var2 = t.R(this.hf * this.hf + this.J * this.J);
      float var3 = (float)(Math.atan(-this.K * 0.20000000298023224D) * 15.0D);
      if(var2 > 0.1F) {
         var2 = 0.1F;
      }

      if(!this.k || this.h() <= 0.0F) {
         var2 = 0.0F;
      }

      if(this.k || this.h() <= 0.0F) {
         var3 = 0.0F;
      }

      this.af += (var2 - this.af) * 0.4F;
      this.Ab += (var3 - this.Ab) * 0.8F;
      if(this.h() > 0.0F && !this.VX()) {
         e var4;
         if(this.M() && !this.D().Z) {
            var4 = this.i().Z(this.D().i()).f(1.0D, 0.0D, 1.0D);
         } else {
            var4 = this.i().f(1.0D, 0.5D, 1.0D);
         }

         List var5 = this.hl.u(this, var4);

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            net.ne.l var7 = (net.ne.l)var5.get(var6);
            if(!var7.Z) {
               this.h(var7);
            }
         }
      }

      this.k(this.O());
      this.k(this.m());
      if(!this.hl.x && (this.hI > 0.5F || this.p() || this.M()) || this.a6.n) {
         this.b();
      }

   }

   private void k(@Nullable f var1) {
      if(!var1.G("Silent") || !var1.i("Silent")) {
         String var2 = var1.J("id");
         if(var2.equals(net.ne.v.P(k.class).toString())) {
            k.z(this.hl, this);
         }
      }

   }

   private void h(net.ne.l var1) {
      var1.H(this);
   }

   public int N() {
      return ((Integer)this.G.a(az)).intValue();
   }

   public void Q(int var1) {
      this.G.d(az, Integer.valueOf(var1));
   }

   public void p(int var1) {
      int var2 = this.N();
      this.G.d(az, Integer.valueOf(var2 + var1));
   }

   public void O(net.yz.z var1) {
      super.O(var1);
      this.S(0.2F, 0.2F);
      this.t(this.b, this.hS, this.hr);
      this.K = 0.10000000149011612D;
      if("Notch".equals(this.Q())) {
         this.s(new ks(net.nb.j.W8, 1), true, false);
      }

      if(!this.hl.N().b("keepInventory") && !this.VX()) {
         this.v();
         this.a8.v();
      }

      this.hf = (double)(-t.m((this.A1 + this.hN) * 0.017453292F) * 0.1F);
      this.J = (double)(-t.A((this.A1 + this.hN) * 0.017453292F) * 0.1F);
      this.S(net.v.q.n);
      this.X(net.v.q.t);
      this.e();
      this.I(0, false);
   }

   protected void v() {
      for(int var1 = 0; var1 < this.a8.e(); ++var1) {
         ks var2 = this.a8.A(var1);
         if(!var2.B() && net.c1.y.b(var2)) {
            this.a8.S(var1);
         }
      }

   }

   protected net.yz.a m(net.yz.z var1) {
      return var1 == net.yz.z.y?l.G:(var1 == net.yz.z.N?l.Cc:l.Mn);
   }

   protected net.yz.a r() {
      return l.KJ;
   }

   @Nullable
   public net.nm.i O(boolean var1) {
      return this.s(this.a8.W(this.a8.r, !this.a8.r().B()?this.a8.r().U():1), false, true);
   }

   @Nullable
   public net.nm.i Y(ks var1, boolean var2) {
      return this.s(var1, false, var2);
   }

   @Nullable
   public net.nm.i s(ks var1, boolean var2, boolean var3) {
      if(var1.B()) {
         return null;
      } else {
         double var4 = this.hS - 0.30000001192092896D + (double)this.A();
         net.nm.i var6 = new net.nm.i(this.hl, this.b, var4, this.hr, var1);
         var6.F(40);
         var6.z(this.Q());
         float var7 = this.p.nextFloat() * 0.5F;
         float var8 = this.p.nextFloat() * 6.2831855F;
         var6.hf = (double)(-t.A(var8) * var7);
         var6.J = (double)(t.m(var8) * var7);
         var6.K = 0.20000000298023224D;
         ks var9 = this.b(var6);
         if(!var9.B()) {
            this.m(net.v.q.R(var9.Z()), var1.U());
         }

         this.S(net.v.q.m);
         return var6;
      }
   }

   protected ks b(net.nm.i var1) {
      this.hl.S(var1);
      return var1.S();
   }

   public float c(net.yw.n var1) {
      float var2 = this.a8.B(var1);
      if(var2 > 1.0F) {
         int var3 = net.c1.y.d(this);
         ks var4 = this.S();
         if(!var4.B()) {
            var2 += (float)(var3 * var3 + 1);
         }
      }

      if(this.J(net.nb.b.d)) {
         var2 *= 1.0F + (float)(this.b(net.nb.b.d).d() + 1) * 0.2F;
      }

      if(this.J(net.nb.b.o)) {
         float var5;
         switch(this.b(net.nb.b.o).d()) {
         case 0:
            var5 = 0.3F;
            break;
         case 1:
            var5 = 0.09F;
            break;
         case 2:
            var5 = 0.0027F;
            break;
         case 3:
         default:
            var5 = 8.1E-4F;
         }

         var2 *= var5;
      }

      if(this.A(net.y1.l.p) && !net.c1.y.w(this)) {
         var2 /= 5.0F;
      }

      if(!this.k) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean R(net.yw.n var1) {
      return this.a8.P(var1);
   }

   public static void t(net.c0.d var0) {
      var0.U(net.c0.q.PLAYER, new w() {
         public f X(net.c0.l var1, f var2, int var3) {
            net.c0.b.c(var1, var2, var3, "Inventory");
            n.o();
            net.c0.b.c(var1, var2, var3, "EnderItems");
            if(var2.K("ShoulderEntityLeft", 10)) {
               var2.K("ShoulderEntityLeft", var1.w(net.c0.q.ENTITY, var2.o("ShoulderEntityLeft"), var3));
            }

            if(var2.K("ShoulderEntityRight", 10)) {
               var2.K("ShoulderEntityRight", var1.w(net.c0.q.ENTITY, var2.o("ShoulderEntityRight"), var3));
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public void o(f var1) {
      super.o(var1);
      this.k(D(this.at));
      net.nj.h var2 = var1.A("Inventory", 10);
      this.a8.g(var2);
      this.a8.r = var1.P("SelectedItemSlot");
      this.as = var1.i("Sleeping");
      this.aO = var1.E("SleepTimer");
      this.aP = var1.S("XpP");
      this.aX = var1.P("XpLevel");
      this.ac = var1.P("XpTotal");
      this.a_ = var1.P("XpSeed");
      if(this.a_ == 0) {
         this.a_ = this.p.nextInt();
      }

      this.Q(var1.P("Score"));
      if(this.as) {
         this.a0 = new net.u.j(this);
         this.H(true, true, false);
      }

      if(var1.K("SpawnX", 99) && var1.K("SpawnY", 99) && var1.K("SpawnZ", 99)) {
         this.aV = new net.u.j(var1.P("SpawnX"), var1.P("SpawnY"), var1.P("SpawnZ"));
         this.aH = var1.i("SpawnForced");
      }

      this.ae.L(var1);
      this.a6.q(var1);
      if(var1.K("EnderItems", 9)) {
         net.nj.h var3 = var1.A("EnderItems", 10);
         this.aE.E(var3);
      }

      if(var1.K("ShoulderEntityLeft", 10)) {
         this.y(var1.o("ShoulderEntityLeft"));
      }

      if(var1.K("ShoulderEntityRight", 10)) {
         this.d(var1.o("ShoulderEntityRight"));
      }

   }

   public void I(f var1) {
      super.I(var1);
      var1.r("DataVersion", 1343);
      var1.K("Inventory", this.a8.G(new net.nj.h()));
      var1.r("SelectedItemSlot", this.a8.r);
      var1.c("Sleeping", this.as);
      var1.h("SleepTimer", (short)this.aO);
      var1.d("XpP", this.aP);
      var1.r("XpLevel", this.aX);
      var1.r("XpTotal", this.ac);
      var1.r("XpSeed", this.a_);
      var1.r("Score", this.N());
      if(this.aV != null) {
         var1.r("SpawnX", this.aV.t());
         var1.r("SpawnY", this.aV.h());
         var1.r("SpawnZ", this.aV.y());
         var1.c("SpawnForced", this.aH);
      }

      this.ae.z(var1);
      this.a6.k(var1);
      var1.K("EnderItems", this.aE.f());
      if(!this.O().N()) {
         var1.K("ShoulderEntityLeft", this.O());
      }

      if(!this.m().N()) {
         var1.K("ShoulderEntityRight", this.m());
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(this.a6.T && !var1.a()) {
         return false;
      } else {
         this.AP = 0;
         if(this.h() <= 0.0F) {
            return false;
         } else {
            if(this.L() && !this.hl.x) {
               this.H(true, true, false);
            }

            this.b();
            if(var1.V()) {
               if(this.hl.k() == net.yv.l.PEACEFUL) {
                  var2 = 0.0F;
               }

               if(this.hl.k() == net.yv.l.EASY) {
                  var2 = Math.min(var2 / 2.0F + 1.0F, var2);
               }

               if(this.hl.k() == net.yv.l.HARD) {
                  var2 = var2 * 3.0F / 2.0F;
               }
            }

            return var2 != 0.0F && super.H(var1, var2);
         }
      }
   }

   protected void V(a var1) {
      super.V(var1);
      if(var1.S().Z() instanceof k1) {
         this.n(true);
      }

   }

   public boolean A(r var1) {
      net.nc.m var2 = this.f();
      var1.f();
      return true;
   }

   protected void G(float var1) {
      this.a8.t(var1);
   }

   protected void h(float var1) {
      if(var1 >= 3.0F && this.AI.Z() == net.nb.j.Yl) {
         int var2 = 1 + t.M(var1);
         this.AI.S(var2, this);
         if(this.AI.B()) {
            net.yz.k var3 = this.H();
            if(var3 == net.yz.k.MAIN_HAND) {
               this.u(z2.MAINHAND, ks.a);
            } else {
               this.u(z2.OFFHAND, ks.a);
            }

            this.AI = ks.a;
            this.I(l.Hc, 0.8F, 0.8F + this.hl.G.nextFloat() * 0.4F);
         }
      }

   }

   public float I() {
      int var1 = 0;

      for(ks var3 : this.a8.P) {
         if(!var3.B()) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.a8.P.size();
   }

   protected void I(net.yz.z var1, float var2) {
      if(!this.w(var1)) {
         var2 = this.o(var1, var2);
         var2 = this.m(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.y(), 0.0F);
         this.x(this.y() - (var3 - var2));
         if(var2 != 0.0F) {
            this.Z(var1.o());
            float var4 = this.h();
            this.u(this.h() - var2);
            this.a().R(var1, var4, var2);
            if(var2 < 3.4028235E37F) {
               this.m(net.v.q.r, Math.round(var2 * 10.0F));
            }
         }
      }

   }

   public void u(sg var1) {
   }

   public void X(net.ni.w var1) {
   }

   public void v(net.ni.q var1) {
   }

   public void J(sl var1) {
   }

   public void g(net.ne.m var1) {
   }

   public void n(z1 var1) {
   }

   public void F(net.yn.j var1, z1 var2) {
   }

   public void x(net.yv.z var1) {
   }

   public void Q(ks var1, net.yz.k var2) {
   }

   public ad e(net.ne.l var1, net.yz.k var2) {
      if(this.VX()) {
         if(var1 instanceof z1) {
            this.n((z1)var1);
         }

         return ad.PASS;
      } else {
         ks var3 = this.o((net.yz.k)var2);
         ks var4 = var3.B()?ks.a:var3.s();
         if(var1.a(this, var2)) {
            if(this.a6.V && var3 == this.o((net.yz.k)var2) && var3.U() < var4.U()) {
               var3.u(var4.U());
            }

            return ad.SUCCESS;
         } else {
            if(!var3.B() && var1 instanceof a) {
               if(this.a6.V) {
                  var3 = var4;
               }

               if(var3.f(this, (a)var1, var2)) {
                  if(var3.B() && !this.a6.V) {
                     this.e(var2, ks.a);
                  }

                  return ad.SUCCESS;
               }
            }

            return ad.PASS;
         }
      }
   }

   public double O() {
      return -0.35D;
   }

   public void O() {
      super.O();
      this.hT = 0;
   }

   public void r(net.ne.l var1) {
      String var2 = n.o();
      if(var1.C() && !var1.U(this)) {
         float var3 = (float)this.t(net.ne.d.S).K();
         if(var1 instanceof a) {
            float var4 = net.c1.y.M(this.S(), ((a)var1).g());
         }

         float var29 = net.c1.y.M(this.S(), net.ne.u.UNDEFINED);
         float var5 = this.B(0.5F);
         var3 = var3 * (0.2F + var5 * var5 * 0.8F);
         var29 = var29 * var5;
         this.H();
         if(Float.compare(var3, 0.0F) > 0 || Float.compare(var29, 0.0F) > 0) {
            boolean var6 = var5 > 0.9F;
            int var8 = 0;
            var8 = var8 + net.c1.y.f(this);
            if(this.B()) {
               ;
            }

            boolean var9 = false;
            var9 = false;
            var3 = var3 + var29;
            boolean var10 = false;
            double var10000 = (double)(this.i - this.hu);
            float var13 = 0.0F;
            boolean var14 = false;
            int var15 = net.c1.y.P(this);
            if(var1 instanceof a) {
               var13 = ((a)var1).h();
               if(!var1.a()) {
                  var14 = true;
                  var1.n(1);
               }
            }

            double var16 = var1.hf;
            double var18 = var1.K;
            double var20 = var1.J;
            boolean var22 = var1.H(net.yz.z.Q(this), var3);
            if(var22) {
               if(var8 > 0) {
                  if(var1 instanceof a) {
                     ((a)var1).C(this, (float)var8 * 0.5F, (double)t.A(this.hN * 0.017453292F), (double)(-t.m(this.hN * 0.017453292F)));
                  }

                  var1.u((double)(-t.A(this.hN * 0.017453292F) * (float)var8 * 0.5F), 0.1D, (double)(t.m(this.hN * 0.017453292F) * (float)var8 * 0.5F));
                  if(gn.Q.j.d(sv.class).v()) {
                     this.hf *= 1.0D;
                     this.J *= 1.0D;
                     this.j(true);
                  }

                  this.hf *= 0.6D;
                  this.J *= 0.6D;
                  this.j(true);
               }

               if(var1 instanceof h && var1.hV) {
                  ((h)var1).t1.h((net.n2.k)(new sp(var1)));
                  var1.hV = false;
                  var1.hf = var16;
                  var1.K = var18;
                  var1.J = var20;
               }

               this.hl.L((r)null, this.b, this.hS, this.hr, l.wv, this.E(), 1.0F, 1.0F);
               this.hl.L((r)null, this.b, this.hS, this.hr, l.D6, this.E(), 1.0F, 1.0F);
               if(Float.compare(var29, 0.0F) > 0) {
                  this.y(var1);
               }

               this.X((net.ne.l)var1);
               if(var1 instanceof a) {
                  net.c1.y.f((a)((a)var1), (net.ne.l)this);
               }

               net.c1.y.Z(this, var1);
               ks var23 = this.S();
               Object var24 = var1;
               if(var1 instanceof net.ne.i) {
                  net.ne.e var25 = ((net.ne.i)var1).G2;
                  if(var25 instanceof a) {
                     var24 = (a)var25;
                  }
               }

               if(!var23.B() && var24 instanceof a) {
                  var23.H((a)var24, this);
                  if(var23.B()) {
                     this.e(net.yz.k.MAIN_HAND, ks.a);
                  }
               }

               if(var1 instanceof a) {
                  float var34 = var13 - ((a)var1).h();
                  this.m(net.v.q.H, Math.round(var34 * 10.0F));
                  if(var15 > 0) {
                     var1.n(var15 * 4);
                  }

                  if(this.hl instanceof net.yv.d && Float.compare(var34, 2.0F) > 0) {
                     int var26 = (int)((double)var34 * 0.5D);
                     ((net.yv.d)this.hl).q(ai.DAMAGE_INDICATOR, var1.b, var1.hS + (double)(var1.m * 0.5F), var1.hr, var26, 0.1D, 0.0D, 0.1D, 0.2D, new int[0]);
                  }
               }

               this.Z(0.1F);
            }

            this.hl.L((r)null, this.b, this.hS, this.hr, l.HA, this.E(), 1.0F, 1.0F);
         }
      }

   }

   public void n(boolean var1) {
      float var2 = 0.25F + (float)net.c1.y.d(this) * 0.05F;
      var2 = var2 + 0.75F;
      if(this.p.nextFloat() < var2) {
         this.H().V(net.nb.j.Yl, 100);
         this.F();
         this.hl.k(this, (byte)30);
      }

   }

   public void p(net.ne.l var1) {
   }

   public void y(net.ne.l var1) {
   }

   public void Q() {
      double var1 = (double)(-t.A(this.hN * 0.017453292F));
      double var3 = (double)t.m(this.hN * 0.017453292F);
      if(this.hl instanceof net.yv.d) {
         ((net.yv.d)this.hl).q(ai.SWEEP_ATTACK, this.b + var1, this.hS + (double)this.m * 0.5D, this.hr + var3, 0, var1, 0.0D, var3, 0.0D, new int[0]);
      }

   }

   public void D() {
   }

   public void B() {
      super.B();
      this.aW.K(this);
      if(this.aG != null) {
         this.aG.K(this);
      }

   }

   public boolean A() {
      zi var1 = new zi();
      _x.m(var1);
      return !this.as && super.A() && !var1.t();
   }

   public boolean VV() {
      return false;
   }

   public GameProfile e() {
      return this.at;
   }

   public r.n M(net.u.j var1) {
      aq var2 = (aq)this.hl.Z(var1).i(rw.N);
      if(!this.hl.x) {
         if(this.L() || !this.P()) {
            return r.n.OTHER_PROBLEM;
         }

         if(!this.hl.F.Z()) {
            return r.n.NOT_POSSIBLE_HERE;
         }

         if(this.hl.u()) {
            return r.n.NOT_POSSIBLE_NOW;
         }

         if(!this.H(var1, var2)) {
            return r.n.TOO_FAR_AWAY;
         }

         double var3 = 8.0D;
         double var10000 = 5.0D;
         List var7 = this.hl.L((Class)net.nk.i.class, (e)(new e((double)var1.t() - 8.0D, (double)var1.h() - 5.0D, (double)var1.y() - 8.0D, (double)var1.t() + 8.0D, (double)var1.h() + 5.0D, (double)var1.y() + 8.0D)), (Predicate)(new r.m(this)));
         if(!var7.isEmpty()) {
            return r.n.NOT_SAFE;
         }
      }

      if(this.M()) {
         this.O();
      }

      this.b();
      this.S(0.2F, 0.2F);
      if(this.hl.o(var1)) {
         float var8 = 0.5F + (float)var2.v() * 0.4F;
         float var4 = 0.5F + (float)var2.P() * 0.4F;
         this.Z(var2);
         this.t((double)((float)var1.t() + var8), (double)((float)var1.h() + 0.6875F), (double)((float)var1.y() + var4));
      } else {
         this.t((double)((float)var1.t() + 0.5F), (double)((float)var1.h() + 0.6875F), (double)((float)var1.y() + 0.5F));
      }

      this.as = true;
      this.aO = 0;
      this.a0 = var1;
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      if(!this.hl.x) {
         this.hl.U();
      }

      return r.n.OK;
   }

   private boolean H(net.u.j var1, aq var2) {
      if(Math.abs(this.b - (double)var1.t()) <= 3.0D && Math.abs(this.hS - (double)var1.h()) <= 2.0D && Math.abs(this.hr - (double)var1.y()) <= 3.0D) {
         return true;
      } else {
         net.u.j var3 = var1.C(var2.f());
         return Math.abs(this.b - (double)var3.t()) <= 3.0D && Math.abs(this.hS - (double)var3.h()) <= 2.0D && Math.abs(this.hr - (double)var3.y()) <= 3.0D;
      }
   }

   private void Z(aq var1) {
      this.ad = -1.8F * (float)var1.v();
      this.ai = -1.8F * (float)var1.P();
   }

   public void H(boolean var1, boolean var2, boolean var3) {
      this.S(0.6F, 1.8F);
      net.yw.n var4 = this.hl.Z(this.a0);
      if(this.a0 != null && var4.Q() == net.nb.f.uP) {
         this.hl.k(this.a0, var4.s(rn.F, Boolean.valueOf(false)), 4);
         net.u.j var5 = rn.V(this.hl, this.a0, 0);
         var5 = this.a0.h();
         this.t((double)((float)var5.t() + 0.5F), (double)((float)var5.h() + 0.1F), (double)((float)var5.y() + 0.5F));
      }

      this.as = false;
      if(!this.hl.x) {
         this.hl.U();
      }

      this.aO = 0;
      this.a(this.a0, false);
   }

   private boolean Vg() {
      return this.hl.Z(this.a0).Q() == net.nb.f.uP;
   }

   @Nullable
   public static net.u.j P(net.yv.r var0, net.u.j var1, boolean var2) {
      net.y9.l var3 = var0.Z(var1).Q();
      return var3 != net.nb.f.uP?null:rn.V(var0, var1, 0);
   }

   public float z() {
      if(this.a0 != null) {
         aq var1 = (aq)this.hl.Z(this.a0).i(rw.N);
         switch(null.F[var1.ordinal()]) {
         case 1:
            return 90.0F;
         case 2:
            return 0.0F;
         case 3:
            return 270.0F;
         case 4:
            return 180.0F;
         }
      }

      return 0.0F;
   }

   public boolean L() {
      return this.as;
   }

   public boolean Vh() {
      return this.as && this.aO >= 100;
   }

   public int O() {
      return this.aO;
   }

   public void g(net.cb.t var1, boolean var2) {
   }

   public net.u.j g() {
      return this.aV;
   }

   public boolean VJ() {
      return this.aH;
   }

   public void a(net.u.j var1, boolean var2) {
      this.aV = var1;
      this.aH = var2;
   }

   public void S(net.v.n var1) {
      this.m(var1, 1);
   }

   public void m(net.v.n var1, int var2) {
   }

   public void X(net.v.n var1) {
   }

   public void y(List var1) {
   }

   public void x(m_[] var1) {
   }

   public void Y(List var1) {
   }

   public void Z() {
      super.Z();
      this.S(net.v.q.U);
      if(this.B()) {
         this.Z(0.2F);
      } else {
         this.Z(0.05F);
      }

   }

   public void E(float var1, float var2, float var3) {
      double var4 = this.b;
      double var6 = this.hS;
      double var8 = this.hr;
      if(this.a6.n && !this.M()) {
         double var10 = this.K;
         float var12 = this.AN;
         this.AN = this.a6.m() * (float)(this.B()?2:1);
         super.E(var1, var2, var3);
         this.K = var10 * 0.6D;
         this.AN = var12;
         this.hI = 0.0F;
         this.I(7, false);
      } else {
         super.E(var1, var2, var3);
      }

      this.f(this.b - var4, this.hS - var6, this.hr - var8);
   }

   public float q() {
      return (float)this.t(net.ne.d.G).K();
   }

   public void f(double var1, double var3, double var5) {
      if(!this.M()) {
         if(this.A(net.y1.l.p)) {
            int var7 = Math.round(t.R(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            this.m(net.v.q.a, var7);
            this.Z(0.01F * (float)var7 * 0.01F);
         } else if(this.p()) {
            int var8 = Math.round(t.R(var1 * var1 + var5 * var5) * 100.0F);
            this.m(net.v.q.E, var8);
            this.Z(0.01F * (float)var8 * 0.01F);
         } else if(this.K()) {
            if(var3 > 0.0D) {
               this.m(net.v.q.N, (int)Math.round(var3 * 100.0D));
            }
         } else if(this.k) {
            int var9 = Math.round(t.R(var1 * var1 + var5 * var5) * 100.0F);
            if(this.B()) {
               this.m(net.v.q.K, var9);
               this.Z(0.1F * (float)var9 * 0.01F);
            } else if(this.Q()) {
               this.m(net.v.q.q, var9);
               this.Z(0.0F * (float)var9 * 0.01F);
            } else {
               this.m(net.v.q.l, var9);
               this.Z(0.0F * (float)var9 * 0.01F);
            }
         } else if(this.I()) {
            int var10 = Math.round(t.R(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            this.m(net.v.q.B, var10);
         } else {
            int var11 = Math.round(t.R(var1 * var1 + var5 * var5) * 100.0F);
            if(var11 > 25) {
               this.m(net.v.q.k, var11);
            }
         }
      }

   }

   private void l(double var1, double var3, double var5) {
      if(this.M()) {
         int var7 = Math.round(t.R(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if(this.D() instanceof net.nm.w) {
            this.m(net.v.q.Q, var7);
         } else if(this.D() instanceof net.nm.b) {
            this.m(net.v.q.s, var7);
         } else if(this.D() instanceof u) {
            this.m(net.v.q.F, var7);
         } else if(this.D() instanceof net.yn.j) {
            this.m(net.v.q.g0, var7);
         }
      }

   }

   public void v(float var1, float var2) {
      if(!this.a6.P) {
         if(var1 >= 2.0F) {
            this.m(net.v.q.z, (int)Math.round((double)var1 * 100.0D));
         }

         super.v(var1, var2);
      }

   }

   protected void c() {
      if(!this.VX()) {
         super.c();
      }

   }

   protected net.yz.a s(int var1) {
      return var1 > 4?l.wd:l.HN;
   }

   public void M(a var1) {
      net.ne.v var2 = (net.ne.v)net.ne.v.V.get(net.ne.v.K(var1));
      this.S(var2.q);
   }

   public void K() {
      if(!this.a6.n) {
         super.K();
      }

   }

   public void E(int var1) {
      this.p(var1);
      int var2 = Integer.MAX_VALUE - this.ac;
      if(var1 > var2) {
         var1 = var2;
      }

      this.aP += (float)var1 / (float)this.Y();

      for(this.ac += var1; this.aP >= 1.0F; this.aP /= (float)this.Y()) {
         this.aP = (this.aP - 1.0F) * (float)this.Y();
         this.N(1);
      }

   }

   public int X() {
      return this.a_;
   }

   public void E(ks var1, int var2) {
      this.aX -= var2;
      if(this.aX < 0) {
         this.aX = 0;
         this.aP = 0.0F;
         this.ac = 0;
      }

      this.a_ = this.p.nextInt();
   }

   public void N(int var1) {
      this.aX += var1;
      if(this.aX < 0) {
         this.aX = 0;
         this.aP = 0.0F;
         this.ac = 0;
      }

      if(this.aX % 5 == 0 && (float)this.aa < (float)this.x - 100.0F) {
         float var2 = this.aX > 30?1.0F:(float)this.aX / 30.0F;
         this.hl.L((r)null, this.b, this.hS, this.hr, l.J, this.E(), var2 * 0.75F, 1.0F);
         this.aa = this.x;
      }

   }

   public int Y() {
      return this.aX >= 30?112 + (this.aX - 30) * 9:(this.aX >= 15?37 + (this.aX - 15) * 5:7 + this.aX * 2);
   }

   public void Z(float var1) {
      if(!this.a6.T && !this.hl.x) {
         this.ae.Y(var1);
      }

   }

   public d e() {
      return this.ae;
   }

   public boolean h(boolean var1) {
      return this.ae.B() && !this.a6.T;
   }

   public boolean Vr() {
      return this.h() > 0.0F && this.h() < this.w();
   }

   public boolean VK() {
      return this.a6.s;
   }

   public boolean n(net.u.j var1, aq var2, ks var3) {
      if(this.a6.s) {
         return true;
      } else if(var3.B()) {
         return false;
      } else {
         net.u.j var4 = var1.C(var2.f());
         net.y9.l var5 = this.hl.Z(var4).Q();
         return var3.Z(var5) || var3.U();
      }
   }

   protected int Q(r var1) {
      if(!this.hl.N().b("keepInventory") && !this.VX()) {
         int var2 = this.aX * 7;
         return var2 > 100?100:var2;
      } else {
         return 0;
      }
   }

   protected boolean Z() {
      return true;
   }

   public boolean z() {
      return true;
   }

   protected boolean k() {
      return !this.a6.n;
   }

   public void m() {
   }

   public void s(o9 var1) {
   }

   public String Q() {
      return this.at.getName();
   }

   public zp D() {
      return this.aE;
   }

   public ks U(z2 var1) {
      return var1 == z2.MAINHAND?this.a8.r():(var1 == z2.OFFHAND?(ks)this.a8.j.get(0):(var1.x() == z2.w.ARMOR?(ks)this.a8.P.get(var1.l()):ks.a));
   }

   public void u(z2 var1, ks var2) {
      if(var1 == z2.MAINHAND) {
         this.R(var2);
         this.a8.X.set(this.a8.r, var2);
      } else if(var1 == z2.OFFHAND) {
         this.R(var2);
         this.a8.j.set(0, var2);
      } else if(var1.x() == z2.w.ARMOR) {
         this.R(var2);
         this.a8.P.set(var1.l(), var2);
      }

   }

   public boolean p(ks var1) {
      this.R(var1);
      return this.a8.D(var1);
   }

   public Iterable g() {
      return Lists.newArrayList(new ks[]{this.S(), this.L()});
   }

   public Iterable J() {
      return this.a8.P;
   }

   public boolean z(f var1) {
      if(!this.M() && this.k && !this.p()) {
         if(this.O().N()) {
            this.y(var1);
            return true;
         } else if(this.m().N()) {
            this.d(var1);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected void b() {
      this.s(this.O());
      this.y(new f());
      this.s(this.m());
      this.d(new f());
   }

   private void s(@Nullable f var1) {
      if(!this.hl.x && !var1.N()) {
         net.ne.l var2 = net.ne.v.K(var1, this.hl);
         if(var2 instanceof net.yn.d) {
            ((net.yn.d)var2).w(this.z);
         }

         var2.t(this.b, this.hS + 0.699999988079071D, this.hr);
         this.hl.S(var2);
      }

   }

   public boolean d(r var1) {
      if(!this.e()) {
         return false;
      } else if(var1.VX()) {
         return false;
      } else {
         net.nc.m var2 = this.f();
         return var1.f() != var2 || !var2.e();
      }
   }

   public abstract boolean VX();

   public abstract boolean V8();

   public boolean i() {
      return !this.a6.n && (!gn.Q.j.d(s_.class).v() || !s_.q.Q());
   }

   public net.nc.b Y() {
      return this.hl.J();
   }

   public net.nc.m f() {
      return this.Y().A(this.Q());
   }

   public net.cb.t b() {
      net.cb.l var1 = new net.cb.l(net.nc.y.s(this.f(), this.Q()));
      var1.E().V(new net.n6.k(net.n6.k.SUGGEST_COMMAND, "/msg " + this.Q() + " "));
      var1.E().G(this.Y());
      var1.E().H(this.Q());
      return var1;
   }

   public float A() {
      float var1 = 1.62F;
      if(this.L()) {
         var1 = 0.2F;
      } else if(!this.Q() && this.m != 1.65F) {
         if(this.I() || this.m == 0.6F) {
            var1 = 0.4F;
         }
      } else {
         var1 -= 0.08F;
      }

      return var1;
   }

   public void x(float var1) {
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.A().d(aT, Float.valueOf(var1));
   }

   public float y() {
      return ((Float)this.A().a(aT)).floatValue();
   }

   public static UUID D(GameProfile var0) {
      UUID var1 = var0.getId();
      var1 = c(var0.getName());
      return var1;
   }

   public static UUID c(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public boolean D(net.yv.f var1) {
      if(var1.T()) {
         return true;
      } else {
         ks var2 = this.S();
         return !var2.B() && var2.v() && var2.j().equals(var1.J());
      }
   }

   public boolean o(j var1) {
      return (((Byte)this.A().a(ab)).byteValue() & var1.b()) == var1.b();
   }

   public boolean x() {
      return this.E().w1[0].N().b("sendCommandFeedback");
   }

   public boolean K(int var1, ks var2) {
      if(var1 < this.a8.X.size()) {
         this.a8.S(var1, var2);
         return true;
      } else {
         if(var1 == 100 + z2.HEAD.l()) {
            z2 var3 = z2.HEAD;
         } else if(var1 == 100 + z2.CHEST.l()) {
            z2 var5 = z2.CHEST;
         } else if(var1 == 100 + z2.LEGS.l()) {
            z2 var6 = z2.LEGS;
         } else if(var1 == 100 + z2.FEET.l()) {
            z2 var7 = z2.FEET;
         } else {
            Object var8 = null;
         }

         if(var1 == 98) {
            this.u(z2.MAINHAND, var2);
            return true;
         } else if(var1 == 99) {
            this.u(z2.OFFHAND, var2);
            return true;
         } else {
            int var4 = var1 - 200;
            if(var4 < this.aE.e()) {
               this.aE.S(var4, var2);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public boolean VI() {
      return this.ah;
   }

   public void Q(boolean var1) {
      this.ah = var1;
   }

   public aa a() {
      return ((Byte)this.G.a(aN)).byteValue() == 0?aa.LEFT:aa.RIGHT;
   }

   public void u(aa var1) {
      this.G.d(aN, Byte.valueOf((byte)(var1 == aa.LEFT?0:1)));
   }

   public f O() {
      return (f)this.G.a(aw);
   }

   protected void y(f var1) {
      this.G.d(aw, var1);
   }

   public f m() {
      return (f)this.G.a(a2);
   }

   protected void d(f var1) {
      this.G.d(a2, var1);
   }

   public float m() {
      return (float)(1.0D / this.t(net.ne.d.E).K() * 20.0D);
   }

   public float B(float var1) {
      return t.T(((float)this.AU + var1) / this.m(), 0.0F, 1.0F);
   }

   public void H() {
      this.AU = 0;
   }

   public ag H() {
      return this.aL;
   }

   public void W(net.ne.l var1) {
      if(!this.L()) {
         super.W(var1);
      }

   }

   public float u() {
      return (float)this.t(net.ne.d.V).K();
   }

   public boolean Vm() {
      return this.a6.V && this.n(2, "");
   }

   public ks i() {
      return this.a8.r();
   }

   public ks k(int var1) {
      return this.a8.r();
   }

   static {
      Y(false);
   }

   public static void Y(boolean var0) {
      aZ = var0;
   }

   public static boolean D() {
      return aZ;
   }

   public static boolean Vb() {
      boolean var0 = D();
      return true;
   }

   private static xn c(xn var0) {
      return var0;
   }

   public static enum b {
      FULL,
      SYSTEM,
      HIDDEN;

      private static final r.b[] H;
      private final int E;
      private final String k;

      private b(int var3, String var4) {
         this.E = var3;
         this.k = var4;
      }

      public int d() {
         return this.E;
      }

      public static r.b t(int var0) {
         return H[var0 % H.length];
      }

      public String X() {
         return this.k;
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }

   static class m implements Predicate {
      private final r x;

      private m(r var1) {
         this.x = var1;
      }

      public boolean w(@Nullable net.nk.i var1) {
         return var1.K(this.x);
      }
   }

   public static enum n {
      OK,
      NOT_POSSIBLE_HERE,
      NOT_POSSIBLE_NOW,
      TOO_FAR_AWAY,
      OTHER_PROBLEM,
      NOT_SAFE;
   }
}
