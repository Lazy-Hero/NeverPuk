package net.ne;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.i6;
import net.xn;
import net.z9;
import net.n0.k3;
import net.n0.ks;
import net.ne.a;
import net.ne.d;
import net.ne.g;
import net.ne.l;
import net.ne.n;
import net.ne.o;
import net.nk.fb;
import net.nk.fc;
import net.nl.z2;
import net.y_.sd;
import net.yz.aa;
import net.yz.ai;
import net.yz.m_;

public abstract class y extends a {
   private static final net.k.v pl = net.k.n.q(y.class, net.k.y.g);
   public int p4;
   protected int p0;
   private final net.y_.r pJ;
   protected net.y_.u pn;
   protected net.y_.c pK;
   private final net.ne.z pT;
   protected net.b.n p6;
   protected final net.y_.o p_;
   protected final net.y_.o pM;
   private a pA;
   private final sd pi;
   private final net.yz.w pb = net.yz.w.C(2, ks.a);
   protected float[] pB = new float[2];
   private final net.yz.w p7 = net.yz.w.C(4, ks.a);
   protected float[] pw = new float[4];
   private boolean pU;
   private boolean pm;
   private final Map ph = Maps.newEnumMap(net.b.m.class);
   private m_ pD;
   private long pW;
   private boolean pr;
   private l po;
   private net.nj.f p9;
   public int pY = 0;
   public net.ns.i pL = null;
   public net.u.j pX = null;
   private UUID pf = null;
   private String pC = null;
   private static boolean pt;

   public y(net.yv.r var1) {
      super(var1);
      this.p_ = new net.y_.o(var1.M != null?var1.M:null);
      this.pM = new net.y_.o(var1.M != null?var1.M:null);
      this.pJ = new net.y_.r(this);
      this.pn = new net.y_.u(this);
      this.pK = new net.y_.c(this);
      this.pT = this.a();
      this.p6 = this.I(var1);
      this.pi = new sd(this);
      Arrays.fill(this.pw, 0.085F);
      Arrays.fill(this.pB, 0.085F);
      if(!var1.x) {
         this.D();
      }

      UUID var2 = this.O();
      long var3 = var2.getLeastSignificantBits();
      this.pY = (int)(var3 & 2147483647L);
   }

   protected void D() {
   }

   protected void W() {
      super.W();
      this.T().i(d.L).t(16.0D);
   }

   protected net.b.n I(net.yv.r var1) {
      return new net.b.s(this, var1);
   }

   public float Q(net.b.m var1) {
      Float var2 = (Float)this.ph.get(var1);
      return var1.A();
   }

   public void v(net.b.m var1, float var2) {
      this.ph.put(var1, Float.valueOf(var2));
   }

   protected net.ne.z a() {
      return new net.ne.z(this);
   }

   public net.y_.r E() {
      return this.pJ;
   }

   public net.y_.u m() {
      return this.pn;
   }

   public net.y_.c D() {
      return this.pK;
   }

   public net.b.n H() {
      return this.p6;
   }

   public sd z() {
      return this.pi;
   }

   @Nullable
   public a M() {
      return this.pA;
   }

   public void C(@Nullable a var1) {
      this.pA = var1;
      i6.Q(i6.Mh, new Object[]{this, var1});
   }

   public boolean i(Class var1) {
      return var1 != fb.class;
   }

   public void l() {
   }

   protected void g() {
      super.g();
      this.G.r(pl, Byte.valueOf((byte)0));
   }

   public int g() {
      return 80;
   }

   public void m() {
      net.yz.a var1 = this.T();
      this.I(var1, this.G(), this.s());
   }

   public void i() {
      super.i();
      this.hl.M.K("mobBaseTick");
      if(this.P() && this.p.nextInt(1000) < this.p4++) {
         this.j();
         this.m();
      }

      this.hl.M.N();
   }

   protected void h(net.yz.z var1) {
      this.j();
      super.h(var1);
   }

   private void j() {
      this.p4 = -this.g();
   }

   protected int Q(net.r.r var1) {
      if(this.p0 > 0) {
         int var2 = this.p0;

         for(int var3 = 0; var3 < this.p7.size(); ++var3) {
            if(!((ks)this.p7.get(var3)).B() && this.pw[var3] <= 1.0F) {
               var2 += 1 + this.p.nextInt(3);
            }
         }

         for(int var4 = 0; var4 < this.pb.size(); ++var4) {
            if(!((ks)this.pb.get(var4)).B() && this.pB[var4] <= 1.0F) {
               var2 += 1 + this.p.nextInt(3);
            }
         }

         return var2;
      } else {
         return this.p0;
      }
   }

   public void x() {
      if(this.hl.x) {
         int var1 = 0;

         while(true) {
            double var2 = this.p.nextGaussian() * 0.02D;
            double var4 = this.p.nextGaussian() * 0.02D;
            double var6 = this.p.nextGaussian() * 0.02D;
            double var10000 = 10.0D;
            this.hl.n(ai.EXPLOSION_NORMAL, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9 - var2 * 10.0D, this.hS + (double)(this.p.nextFloat() * this.m) - var4 * 10.0D, this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9 - var6 * 10.0D, var2, var4, var6, new int[0]);
            ++var1;
         }
      }

      this.hl.k(this, (byte)20);
   }

   public void R(byte var1) {
      if(var1 == 20) {
         this.x();
      } else {
         super.R(var1);
      }

   }

   public void A() {
      if(z9.SN() && this.lS()) {
         this.v();
      } else {
         super.A();
         if(!this.hl.x) {
            this.gr();
            if(this.x % 5 == 0) {
               boolean var1 = !(this.C() instanceof y);
               boolean var2 = !(this.D() instanceof net.nm.b);
               this.p_.u(1, var1);
               this.p_.u(4, true);
               this.p_.u(2, var1);
            }
         }
      }

   }

   protected float z(float var1, float var2) {
      this.pT.j();
      return var2;
   }

   @Nullable
   protected net.yz.a T() {
      return null;
   }

   @Nullable
   protected net.n0.y X() {
      return null;
   }

   protected void J(boolean var1, int var2) {
      net.n0.y var3 = this.X();
      int var4 = this.p.nextInt(3);
      var4 = var4 + this.p.nextInt(var2 + 1);

      for(int var5 = 0; var5 < var4; ++var5) {
         this.S(var3, 1);
      }

   }

   public static void J(net.c0.d var0, Class var1) {
      var0.U(net.c0.q.ENTITY, new net.ng.u(var1, new String[]{"ArmorItems", "HandItems"}));
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("CanPickUpLoot", this.lw());
      var1.c("PersistenceRequired", this.pm);
      net.nj.h var2 = new net.nj.h();

      for(ks var4 : this.p7) {
         net.nj.f var5 = new net.nj.f();
         if(!var4.B()) {
            var4.Z(var5);
         }

         var2.m(var5);
      }

      var1.K("ArmorItems", var2);
      net.nj.h var10 = new net.nj.h();

      for(ks var13 : this.pb) {
         net.nj.f var6 = new net.nj.f();
         if(!var13.B()) {
            var13.Z(var6);
         }

         var10.m(var6);
      }

      var1.K("HandItems", var10);
      net.nj.h var12 = new net.nj.h();

      for(float var8 : this.pw) {
         var12.m(new net.nj.j(var8));
      }

      var1.K("ArmorDropChances", var12);
      net.nj.h var15 = new net.nj.h();

      for(float var9 : this.pB) {
         var15.m(new net.nj.j(var9));
      }

      var1.K("HandDropChances", var15);
      var1.c("Leashed", this.pr);
      if(this.po != null) {
         net.nj.f var18 = new net.nj.f();
         if(this.po instanceof a) {
            UUID var20 = this.po.O();
            var18.h("UUID", var20);
         } else if(this.po instanceof n) {
            net.u.j var21 = ((n)this.po).r();
            var18.r("X", var21.t());
            var18.r("Y", var21.h());
            var18.r("Z", var21.y());
         }

         var1.K("Leash", var18);
      }

      var1.c("LeftHanded", this.lG());
      if(this.pD != null) {
         var1.b("DeathLootTable", this.pD.toString());
         if(this.pW != 0L) {
            var1.V("DeathLootTableSeed", this.pW);
         }
      }

      if(this.lJ()) {
         var1.c("NoAI", this.lJ());
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("CanPickUpLoot", 1)) {
         this.t(var1.i("CanPickUpLoot"));
      }

      this.pm = var1.i("PersistenceRequired");
      if(var1.K("ArmorItems", 9)) {
         net.nj.h var2 = var1.A("ArmorItems", 10);

         for(int var3 = 0; var3 < this.p7.size(); ++var3) {
            this.p7.set(var3, new ks(var2.i(var3)));
         }
      }

      if(var1.K("HandItems", 9)) {
         net.nj.h var4 = var1.A("HandItems", 10);

         for(int var7 = 0; var7 < this.pb.size(); ++var7) {
            this.pb.set(var7, new ks(var4.i(var7)));
         }
      }

      if(var1.K("ArmorDropChances", 9)) {
         net.nj.h var5 = var1.A("ArmorDropChances", 5);

         for(int var8 = 0; var8 < var5.z(); ++var8) {
            this.pw[var8] = var5.h(var8);
         }
      }

      if(var1.K("HandDropChances", 9)) {
         net.nj.h var6 = var1.A("HandDropChances", 5);

         for(int var9 = 0; var9 < var6.z(); ++var9) {
            this.pB[var9] = var6.h(var9);
         }
      }

      this.pr = var1.i("Leashed");
      if(this.pr && var1.K("Leash", 10)) {
         this.p9 = var1.o("Leash");
      }

      this.h(var1.i("LeftHanded"));
      if(var1.K("DeathLootTable", 8)) {
         this.pD = new m_(var1.J("DeathLootTable"));
         this.pW = var1.P("DeathLootTableSeed");
      }

      this.e(var1.i("NoAI"));
   }

   @Nullable
   protected m_ N() {
      return null;
   }

   protected void U(boolean var1, int var2, net.yz.z var3) {
      m_ var4 = this.pD;
      var4 = this.N();
      net.y7.z var5 = this.hl.o().k(var4);
      this.pD = null;
      net.y7.r var6 = (new net.y7.r((net.yv.d)this.hl)).n(this).F(var3);
      if(this.AR != null) {
         var6 = var6.M(this.AR).v(this.AR.u());
      }

      for(ks var8 : var5.g(this.pW == 0L?this.p:new Random(this.pW), var6.w())) {
         this.O(var8, 0.0F);
      }

      this.n(var1, var2);
   }

   public void M(float var1) {
      this.XK = var1;
   }

   public void C(float var1) {
      this.AQ = var1;
   }

   public void E(float var1) {
      this.XG = var1;
   }

   public void P(float var1) {
      super.P(var1);
      this.M(var1);
   }

   public void d() {
      super.d();
      this.hl.M.K("looting");
      if(!this.hl.x && this.lw() && !this.Xp && this.hl.N().b("mobGriefing")) {
         for(net.nm.i var2 : this.hl.p(net.nm.i.class, this.i().f(1.0D, 0.0D, 1.0D))) {
            if(!var2.Z && !var2.S().B() && !var2.N()) {
               this.z(var2);
            }
         }
      }

      this.hl.M.N();
   }

   protected void z(net.nm.i var1) {
      ks var3 = var1.S();
      d.O();
      z2 var4 = M(var3);
      boolean var5 = true;
      ks var6 = this.U(var4);
      if(!var6.B()) {
         if(var4.x() == z2.w.HAND) {
            if(var3.Z() instanceof k3 && !(var6.Z() instanceof k3)) {
               var5 = true;
            }

            if(var3.Z() instanceof k3 && var6.Z() instanceof k3) {
               k3 var7 = (k3)var3.Z();
               k3 var8 = (k3)var6.Z();
               if(Float.compare(var7.l(), var8.l()) == 0) {
                  if(var3.n() <= var6.n() && (!var3.D() || var6.D())) {
                     boolean var17 = false;
                  } else {
                     boolean var10000 = true;
                  }
               }

               var5 = var7.l() > var8.l();
            }

            if(var3.Z() instanceof net.n0.e && var6.Z() instanceof net.n0.e) {
               if(var3.D() && !var6.D()) {
                  boolean var19 = true;
               } else {
                  boolean var18 = false;
               }
            }

            var5 = false;
         }

         if(var3.Z() instanceof net.n0.j && !(var6.Z() instanceof net.n0.j)) {
            var5 = true;
         }

         if(var3.Z() instanceof net.n0.j && var6.Z() instanceof net.n0.j && !net.c1.y.I(var6)) {
            net.n0.j var14 = (net.n0.j)var3.Z();
            net.n0.j var16 = (net.n0.j)var6.Z();
            if(var14.x == var16.x) {
               if(var3.n() <= var6.n() && (!var3.D() || var6.D())) {
                  boolean var21 = false;
               } else {
                  boolean var20 = true;
               }
            }

            boolean var22 = var14.x > var16.x;
         }

         var5 = false;
      }

      if(this.p(var3)) {
         switch(null.W[var4.x().ordinal()]) {
         case 1:
            double var23 = (double)this.pB[var4.l()];
         case 2:
            double var24 = (double)this.pw[var4.l()];
         default:
            double var15 = 0.0D;
            if(!var6.B() && Double.compare((double)(this.p.nextFloat() - 0.1F), var15) < 0) {
               this.O(var6, 0.0F);
            }

            this.u(var4, var3);
            switch(null.W[var4.x().ordinal()]) {
            case 1:
               this.pB[var4.l()] = 2.0F;
            case 2:
               this.pw[var4.l()] = 2.0F;
            default:
               this.pm = true;
               this.U(var1, var3.U());
               var1.B();
            }
         }
      }

   }

   protected boolean p(ks var1) {
      return true;
   }

   protected boolean lB() {
      return true;
   }

   protected void b() {
      Object var1 = null;
      Object var2 = i6.n(i6.UY);
      Object var3 = i6.n(i6.C8);
      if(this.pm) {
         this.AP = 0;
      } else if((this.AP & 31) == 31 && (var1 = i6.H(i6.U3, new Object[]{this})) != var2) {
         if(var1 == var3) {
            this.AP = 0;
         } else {
            this.B();
         }
      } else {
         net.r.r var4 = this.hl.d(this, -1.0D);
         double var5 = var4.b - this.b;
         double var7 = var4.hS - this.hS;
         double var9 = var4.hr - this.hr;
         double var11 = var5 * var5 + var7 * var7 + var9 * var9;
         if(this.lB() && var11 > 16384.0D) {
            this.B();
         }

         if(this.AP > 600 && this.p.nextInt(800) == 0 && var11 > 1024.0D && this.lB()) {
            this.B();
         } else if(var11 < 1024.0D) {
            this.AP = 0;
         }
      }

   }

   protected final void r() {
      ++this.AP;
      this.hl.M.K("checkDespawn");
      this.b();
      this.hl.M.N();
      this.hl.M.K("sensing");
      this.pi.h();
      this.hl.M.N();
      this.hl.M.K("targetSelector");
      this.pM.a();
      this.hl.M.N();
      this.hl.M.K("goalSelector");
      this.p_.a();
      this.hl.M.N();
      this.hl.M.K("navigation");
      this.p6.I();
      this.hl.M.N();
      this.hl.M.K("mob tick");
      this.T();
      this.hl.M.N();
      if(this.M() && this.D() instanceof y) {
         y var1 = (y)this.D();
         var1.H().Y(this.H().N(), 1.5D);
         var1.m().n(this.m());
      }

      this.hl.M.K("controls");
      this.hl.M.K("move");
      this.pn.D();
      this.hl.M.F("look");
      this.pJ.p();
      this.hl.M.F("jump");
      this.pK.M();
      this.hl.M.N();
      this.hl.M.N();
   }

   protected void T() {
   }

   public int w() {
      return 40;
   }

   public int v() {
      return 10;
   }

   public void S(l var1, float var2, float var3) {
      double var4 = var1.b - this.b;
      double var6 = var1.hr - this.hr;
      double var8;
      if(var1 instanceof a) {
         a var10 = (a)var1;
         var8 = var10.hS + (double)var10.A() - (this.hS + (double)this.A());
      } else {
         var8 = (var1.i().u + var1.i().c) / 2.0D - (this.hS + (double)this.A());
      }

      double var14 = (double)net.u.t.R(var4 * var4 + var6 * var6);
      float var12 = (float)(net.u.t.V(var6, var4) * 57.29577951308232D) - 90.0F;
      float var13 = (float)(-(net.u.t.V(var8, var14) * 57.29577951308232D));
      this.V = this.d(this.V, var13, var3);
      this.hN = this.d(this.hN, var12, var2);
   }

   private float d(float var1, float var2, float var3) {
      float var4 = net.u.t.k(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean l4() {
      net.yw.n var1 = this.hl.Z((new net.u.j(this)).b());
      return var1.p(this);
   }

   public boolean l1() {
      return !this.hl.p(this.i()) && this.hl.h(this, this.i()).isEmpty() && this.hl.N((net.u.e)this.i(), (l)this);
   }

   public float z() {
      return 1.0F;
   }

   public int W() {
      return 4;
   }

   public int q() {
      if(this.M() == null) {
         return 3;
      } else {
         int var1 = (int)(this.h() - this.w() * 0.33F);
         var1 = var1 - (3 - this.hl.k().L()) * 4;
         var1 = 0;
         return var1 + 3;
      }
   }

   public Iterable g() {
      return this.pb;
   }

   public Iterable J() {
      return this.p7;
   }

   public ks U(z2 var1) {
      switch(null.W[var1.x().ordinal()]) {
      case 1:
         return (ks)this.pb.get(var1.l());
      case 2:
         return (ks)this.p7.get(var1.l());
      default:
         return ks.a;
      }
   }

   public void u(z2 var1, ks var2) {
      switch(null.W[var1.x().ordinal()]) {
      case 1:
         this.pb.set(var1.l(), var2);
         break;
      case 2:
         this.p7.set(var1.l(), var2);
      }

   }

   protected void n(boolean var1, int var2) {
      for(z2 var6 : z2.values()) {
         ks var7 = this.U(var6);
         double var8;
         switch(null.W[var6.x().ordinal()]) {
         case 1:
            var8 = (double)this.pB[var6.l()];
            break;
         case 2:
            var8 = (double)this.pw[var6.l()];
            break;
         default:
            var8 = 0.0D;
         }

         boolean var10 = var8 > 1.0D;
         if(!var7.B() && !net.c1.y.b(var7) && (double)(this.p.nextFloat() - (float)var2 * 0.01F) < var8) {
            if(var7.M()) {
               var7.d(var7.Z() - this.p.nextInt(1 + this.p.nextInt(Math.max(var7.Z() - 3, 1))));
            }

            this.O(var7, 0.0F);
         }
      }

   }

   protected void T(net.yv.g var1) {
      if(this.p.nextFloat() < 0.15F * var1.l()) {
         int var2 = this.p.nextInt(2);
         float var3 = this.hl.k() == net.yv.l.HARD?0.1F:0.25F;
         if(this.p.nextFloat() < 0.095F) {
            ++var2;
         }

         if(this.p.nextFloat() < 0.095F) {
            ++var2;
         }

         if(this.p.nextFloat() < 0.095F) {
            ++var2;
         }

         boolean var4 = true;

         for(z2 var8 : z2.values()) {
            if(var8.x() == z2.w.ARMOR) {
               ks var9 = this.U(var8);
               if(this.p.nextFloat() < var3) {
                  break;
               }

               var4 = false;
               if(var9.B()) {
                  net.n0.y var10 = O(var8, var2);
                  this.u(var8, new ks(var10));
               }
            }
         }
      }

   }

   public static z2 M(ks var0) {
      if(var0.Z() != net.n0.y.q(net.nb.f.TS) && var0.Z() != net.nb.j.Y9) {
         if(var0.Z() instanceof net.n0.j) {
            return ((net.n0.j)var0.Z()).Q;
         } else if(var0.Z() == net.nb.j.SB) {
            return z2.CHEST;
         } else {
            boolean var1 = var0.Z() == net.nb.j.Yl;
            if(i6.UA.r()) {
               var1 = i6.I(var0.Z(), i6.UA, new Object[]{var0, null});
            }

            return z2.OFFHAND;
         }
      } else {
         return z2.HEAD;
      }
   }

   @Nullable
   public static net.n0.y O(z2 var0, int var1) {
      switch(null.J[var0.ordinal()]) {
      case 1:
         return net.nb.j.Sb;
      case 2:
         return net.nb.j.SE;
      case 3:
         return net.nb.j.Sf;
      case 4:
         return net.nb.j.E;
      default:
         return null;
      }
   }

   protected void I(net.yv.g var1) {
      float var2 = var1.l();
      if(!this.S().B() && this.p.nextFloat() < 0.25F * var2) {
         this.u(z2.MAINHAND, net.c1.y.Y(this.p, this.S(), (int)(5.0F + var2 * (float)this.p.nextInt(18)), false));
      }

      for(z2 var6 : z2.values()) {
         if(var6.x() == z2.w.ARMOR) {
            ks var7 = this.U(var6);
            if(!var7.B() && this.p.nextFloat() < 0.5F * var2) {
               this.u(var6, net.c1.y.Y(this.p, var7, (int)(5.0F + var2 * (float)this.p.nextInt(18)), false));
            }
         }
      }

   }

   @Nullable
   public g t(net.yv.g var1, @Nullable g var2) {
      this.t(d.L).g(new net.s.k("Random spawn bonus", this.p.nextGaussian() * 0.05D, 1));
      this.h(this.p.nextFloat() < 0.05F);
      return var2;
   }

   public boolean lC() {
      return false;
   }

   public void gz() {
      this.pm = true;
   }

   public void a(z2 var1, float var2) {
      switch(null.W[var1.x().ordinal()]) {
      case 1:
         this.pB[var1.l()] = var2;
         break;
      case 2:
         this.pw[var1.l()] = var2;
      }

   }

   public boolean lw() {
      return this.pU;
   }

   public void t(boolean var1) {
      this.pU = var1;
   }

   public boolean lT() {
      return this.pm;
   }

   public final boolean a(net.r.r var1, net.yz.k var2) {
      if(this.ln() && this.M() == var1) {
         this.b(true, !var1.a6.V);
         return true;
      } else {
         ks var3 = var1.o((net.yz.k)var2);
         if(var3.Z() == net.nb.j.S6 && this.p(var1)) {
            this.Y(var1, true);
            var3.H(1);
            return true;
         } else {
            return this.R(var1, var2) || super.a(var1, var2);
         }
      }
   }

   protected boolean R(net.r.r var1, net.yz.k var2) {
      return false;
   }

   protected void gr() {
      if(this.p9 != null) {
         this.Q();
      }

      if(this.pr) {
         if(!this.P()) {
            this.b(true, true);
         }

         if(this.po == null || this.po.Z) {
            this.b(true, true);
         }
      }

   }

   public void b(boolean var1, boolean var2) {
      if(this.pr) {
         this.pr = false;
         this.po = null;
         if(!this.hl.x) {
            this.S(net.nb.j.S6, 1);
         }

         if(!this.hl.x && this.hl instanceof net.yv.d) {
            ((net.yv.d)this.hl).K().z(this, new net.no.z(this, (l)null));
         }
      }

   }

   public boolean p(net.r.r var1) {
      return !this.ln() && !(this instanceof fc);
   }

   public boolean ln() {
      return this.pr;
   }

   public l M() {
      return this.po;
   }

   public void Y(l var1, boolean var2) {
      this.pr = true;
      this.po = var1;
      if(!this.hl.x && this.hl instanceof net.yv.d) {
         ((net.yv.d)this.hl).K().z(this, new net.no.z(this, this.po));
      }

      if(this.M()) {
         this.O();
      }

   }

   public boolean E(l var1, boolean var2) {
      boolean var3 = super.E(var1, var2);
      if(this.ln()) {
         this.b(true, true);
      }

      return var3;
   }

   private void Q() {
      if(this.pr && this.p9 != null) {
         if(this.p9.H("UUID")) {
            UUID var1 = this.p9.R("UUID");

            for(a var3 : this.hl.p(a.class, this.i().x(10.0D))) {
               if(var3.O().equals(var1)) {
                  this.Y(var3, true);
                  break;
               }
            }
         } else if(this.p9.K("X", 99) && this.p9.K("Y", 99) && this.p9.K("Z", 99)) {
            net.u.j var4 = new net.u.j(this.p9.P("X"), this.p9.P("Y"), this.p9.P("Z"));
            o var5 = o.V(this.hl, var4);
            var5 = o.Y(this.hl, var4);
            this.Y(var5, true);
         } else {
            this.b(false, true);
         }
      }

      this.p9 = null;
   }

   public boolean K(int var1, ks var2) {
      z2 var3;
      if(var1 == 98) {
         var3 = z2.MAINHAND;
      } else if(var1 == 99) {
         var3 = z2.OFFHAND;
      } else if(var1 == 100 + z2.HEAD.l()) {
         var3 = z2.HEAD;
      } else if(var1 == 100 + z2.CHEST.l()) {
         var3 = z2.CHEST;
      } else if(var1 == 100 + z2.LEGS.l()) {
         var3 = z2.LEGS;
      } else {
         if(var1 != 100 + z2.FEET.l()) {
            return false;
         }

         var3 = z2.FEET;
      }

      if(!var2.B() && !z(var3, var2) && var3 != z2.HEAD) {
         return false;
      } else {
         this.u(var3, var2);
         return true;
      }
   }

   public boolean V() {
      return this.lC() && super.V();
   }

   public static boolean z(z2 var0, ks var1) {
      z2 var2 = M(var1);
      return var2 == var0 || var2 == z2.MAINHAND && var0 == z2.OFFHAND || var2 == z2.OFFHAND && var0 == z2.MAINHAND;
   }

   public boolean H7() {
      return super.H7() && !this.lJ();
   }

   public void e(boolean var1) {
      byte var2 = ((Byte)this.G.a(pl)).byteValue();
      this.G.d(pl, Byte.valueOf((byte)(var2 | 1)));
   }

   public void h(boolean var1) {
      byte var2 = ((Byte)this.G.a(pl)).byteValue();
      this.G.d(pl, Byte.valueOf((byte)(var2 | 2)));
   }

   public boolean lJ() {
      return (((Byte)this.G.a(pl)).byteValue() & 1) != 0;
   }

   public boolean lG() {
      return (((Byte)this.G.a(pl)).byteValue() & 2) != 0;
   }

   public aa a() {
      return this.lG()?aa.LEFT:aa.RIGHT;
   }

   private boolean lS() {
      if(this.H9()) {
         return false;
      } else if(this.Xl > 0) {
         return false;
      } else if(this.x < 20) {
         return false;
      } else {
         net.yv.r var1 = this.T();
         return false;
      }
   }

   private void v() {
      ++this.AP;
      if(this instanceof net.nk.i) {
         float var1 = this.d();
         if(var1 > 0.5F) {
            this.AP += 2;
         }
      }

      this.b();
   }

   public net.nc.m f() {
      UUID var1 = this.O();
      if(this.pf != var1) {
         this.pf = var1;
         this.pC = var1.toString();
      }

      return this.hl.J().A(this.pC);
   }

   static {
      a(false);
   }

   public static void a(boolean var0) {
      pt = var0;
   }

   public static boolean l0() {
      return pt;
   }

   public static boolean lY() {
      boolean var0 = l0();
      return true;
   }

   private static xn c(xn var0) {
      return var0;
   }

   public static enum b {
      ON_GROUND,
      IN_AIR,
      IN_WATER;
   }
}
