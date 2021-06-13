package net.ne;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net._x;
import net.b2;
import net.gn;
import net.sh;
import net.v3;
import net.vf;
import net.vz;
import net.z1;
import net.n0.k7;
import net.n0.ks;
import net.n0.yi;
import net.ne.bk;
import net.ne.d;
import net.ne.f;
import net.ne.l;
import net.ne.u;
import net.nl.z2;
import net.no.id;
import net.no.sb;
import net.y9.gp;
import net.y9.lk;
import net.y9.ls;
import net.yn.wv;
import net.yz.a6;
import net.yz.aa;
import net.yz.ai;
import net.yz.aq;
import net.yz.as;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class a extends l {
   private static final Logger A8 = LogManager.getLogger();
   private static final UUID Aj = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final net.s.k Xm = (new net.s.k(Aj, "Sprinting speed boost", 0.30000001192092896D, 2)).A(false);
   protected static final net.k.v AT = net.k.n.q(a.class, net.k.y.g);
   private static final net.k.v AG = net.k.n.q(a.class, net.k.y.r);
   private static final net.k.v AY = net.k.n.q(a.class, net.k.y.d);
   private static final net.k.v An = net.k.n.q(a.class, net.k.y.f);
   private static final net.k.v Au = net.k.n.q(a.class, net.k.y.d);
   public float AX;
   public float AZ;
   private net.s.m Ay;
   private final as Av = new as(this);
   private final Map AF = Maps.newHashMap();
   private final net.yz.w Am = net.yz.w.C(2, ks.a);
   private final net.yz.w Xu = net.yz.w.C(4, ks.a);
   public boolean XR;
   public net.yz.k XE;
   public int Ap;
   public int A7;
   public int Xl;
   public int Ax;
   public float A1;
   public int AA;
   public float AL;
   public float Ar;
   protected int AU;
   public float AS;
   public float Aq;
   public float A5;
   public int AD = 20;
   public float Aw;
   public float Ab;
   public float Ai;
   public float Al;
   public float AK;
   public float Az;
   public float A3;
   public float AH;
   public float AN = 0.02F;
   protected net.r.r AR;
   protected int Ae;
   protected boolean Xp;
   protected int AP;
   protected float Xq;
   protected float AV;
   protected float AM;
   protected float AB;
   protected float Ao;
   protected int Xx;
   protected float A_;
   protected boolean XL;
   public float XG;
   public float AQ;
   public float XK;
   public float Ad;
   protected int A9;
   protected double Ag;
   protected double AW;
   protected double Ah;
   protected double Ak;
   protected double As;
   private boolean A0 = true;
   private a Af;
   private int A6;
   private a Ac;
   private int Aa;
   private float A2;
   public int A4;
   private float AE;
   protected ks AI = ks.a;
   protected int At;
   protected int AO;
   private net.u.j Xh;
   private net.yz.z AC;
   private long AJ;
   private static net.u.d[] Xj;

   public void L() {
      this.H(net.yz.z.s, Float.MAX_VALUE);
   }

   public a(net.yv.r var1) {
      super(var1);
      this.W();
      this.u(this.w());
      this.a = true;
      this.Al = (float)((Math.random() + 1.0D) * 0.009999999776482582D);
      this.t(this.b, this.hS, this.hr);
      this.Ai = (float)Math.random() * 12398.0F;
      this.hN = (float)(Math.random() * 6.283185307179586D);
      this.A3 = this.hN;
      this.ha = 0.6F;
   }

   protected void g() {
      this.G.r(AT, Byte.valueOf((byte)0));
      this.G.r(AY, Integer.valueOf(0));
      this.G.r(An, Boolean.valueOf(false));
      this.G.r(Au, Integer.valueOf(0));
      this.G.r(AG, Float.valueOf(1.0F));
   }

   protected void W() {
      this.T().i(d.C);
      this.T().i(d.l);
      this.T().i(d.G);
      this.T().i(d.g);
      this.T().i(d.f);
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
      if(!this.p()) {
         this.r();
      }

      if(!this.hl.x && this.hI > 3.0F) {
         float var6 = (float)net.u.t.Y(this.hI - 3.0F);
         if(var4.n() != net.y1.l.q) {
            double var7 = Math.min((double)(0.2F + var6 / 15.0F), 2.5D);
            int var9 = (int)(150.0D * var7);
            ((net.yv.d)this.hl).q(ai.BLOCK_DUST, this.b, this.hS, this.hr, var9, 0.0D, 0.0D, 0.0D, 0.15000000596046448D, new int[]{net.y9.l.m(var4)});
         }
      }

      super.s(var1, var3, var4, var5);
   }

   public boolean R() {
      return false;
   }

   public void i() {
      this.AL = this.Ar;
      super.i();
      this.hl.M.K("livingEntityBaseTick");
      boolean var1 = this instanceof net.r.r;
      if(this.P()) {
         if(this.A()) {
            this.H(net.yz.z.q, 1.0F);
         } else if(!this.hl.T().V(this.i())) {
            double var2 = this.hl.T().H((l)this) + this.hl.T().C();
            if(var2 < 0.0D) {
               double var4 = this.hl.T().t();
               if(var4 > 0.0D) {
                  this.H(net.yz.z.q, (float)Math.max(1, net.u.t.L(-var2 * var4)));
               }
            }
         }
      }

      if(this.X() || this.hl.x) {
         this.e();
      }

      boolean var7 = ((net.r.r)this).a6.T;
      if(this.P()) {
         if(!this.A(net.y1.l.p)) {
            this.J(300);
         } else {
            if(!this.R() && !this.J(net.nb.b.x)) {
               this.J(this.M(this.b()));
               if(this.b() == -20) {
                  this.J(0);
                  int var8 = 0;

                  while(true) {
                     float var9 = this.p.nextFloat() - this.p.nextFloat();
                     float var5 = this.p.nextFloat() - this.p.nextFloat();
                     float var6 = this.p.nextFloat() - this.p.nextFloat();
                     this.hl.n(ai.WATER_BUBBLE, this.b + (double)var9, this.hS + (double)var5, this.hr + (double)var6, this.hf, this.K, this.J, new int[0]);
                     ++var8;
                  }
               }
            }

            if(!this.hl.x && this.M() && this.D() instanceof a) {
               this.O();
            }
         }

         if(!this.hl.x) {
            net.u.j var3 = new net.u.j(this);
            if(!Objects.equal(this.Xh, var3)) {
               this.Xh = var3;
               this.a(var3);
            }
         }
      }

      if(this.P() && this.J()) {
         this.e();
      }

      this.Aw = this.Ab;
      if(this.Xl > 0) {
         --this.Xl;
      }

      if(this.I > 0 && !(this instanceof net.r.h)) {
         --this.I;
      }

      if(this.h() <= 0.0F) {
         this.u();
      }

      if(this.Ae > 0) {
         --this.Ae;
      } else {
         this.AR = null;
      }

      if(this.Ac != null && !this.Ac.P()) {
         this.Ac = null;
      }

      if(this.Af != null) {
         if(!this.Af.P()) {
            this.i((a)null);
         } else if(this.x - this.A6 > 100) {
            this.i((a)null);
         }
      }

      this.p();
      this.AB = this.AM;
      this.Az = this.AK;
      this.AH = this.A3;
      this.hq = this.hN;
      this.d = this.V;
      this.AZ = this.AX;
      this.hl.M.N();
   }

   protected void a(net.u.j var1) {
      int var2 = net.c1.y.g(net.nb.u.x, this);
      net.c1.w.H(this, this.hl, var1, var2);
   }

   public boolean H9() {
      return false;
   }

   protected void u() {
      ++this.AA;
      if(this.AA == 20) {
         if(this.hl.x || !this.Z() && (this.Ae <= 0 || !this.W() || !this.hl.N().b("doMobLoot"))) {
            this.B();
            int var8 = 0;

            while(true) {
               double var9 = this.p.nextGaussian() * 0.02D;
               double var4 = this.p.nextGaussian() * 0.02D;
               double var6 = this.p.nextGaussian() * 0.02D;
               this.hl.n(ai.EXPLOSION_NORMAL, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var9, var4, var6, new int[0]);
               ++var8;
            }
         }

         int var1 = this.Q(this.AR);

         while(true) {
            int var2 = net.nm.s.Z(var1);
            var1 -= var2;
            this.hl.S(new net.nm.s(this.hl, this.b, this.hS, this.hr, var2));
         }
      }

   }

   protected boolean W() {
      return !this.H9();
   }

   protected int M(int var1) {
      int var2 = net.c1.y.V(this);
      return this.p.nextInt(var2 + 1) > 0?var1:var1 - 1;
   }

   protected int Q(net.r.r var1) {
      return 0;
   }

   protected boolean Z() {
      return false;
   }

   public Random Q() {
      return this.p;
   }

   @Nullable
   public a X() {
      return this.Af;
   }

   public int h() {
      return this.A6;
   }

   public void i(@Nullable a var1) {
      this.Af = var1;
      this.A6 = this.x;
   }

   public a A() {
      return this.Ac;
   }

   public int H() {
      return this.Aa;
   }

   public void X(l var1) {
      if(var1 instanceof a) {
         this.Ac = (a)var1;
      } else {
         this.Ac = null;
      }

      this.Aa = this.x;
   }

   public int y() {
      return this.AP;
   }

   protected void R(ks var1) {
      if(!var1.B()) {
         net.yz.a var2 = net.nb.l.K6;
         net.n0.y var3 = var1.Z();
         if(var3 instanceof net.n0.j) {
            var2 = ((net.n0.j)var3).R().K();
         } else if(var3 == net.nb.j.SB) {
            var2 = net.nb.l.wn;
         }

         this.I(var2, 1.0F, 1.0F);
      }

   }

   public void I(net.nj.f var1) {
      var1.d("Health", this.h());
      var1.h("HurtTime", (short)this.Xl);
      var1.r("HurtByTimestamp", this.A6);
      var1.h("DeathTime", (short)this.AA);
      var1.d("AbsorptionAmount", this.y());

      for(z2 var5 : z2.values()) {
         ks var6 = this.U(var5);
         if(!var6.B()) {
            this.T().e(var6.Z(var5));
         }
      }

      var1.K("Attributes", d.Y(this.T()));

      for(z2 var13 : z2.values()) {
         ks var14 = this.U(var13);
         if(!var14.B()) {
            this.T().q(var14.Z(var13));
         }
      }

      if(!this.AF.isEmpty()) {
         net.nj.h var8 = new net.nj.h();

         for(net.n_.i var12 : this.AF.values()) {
            var8.m(var12.t(new net.nj.f()));
         }

         var1.K("ActiveEffects", var8);
      }

      var1.c("FallFlying", this.I());
   }

   public void o(net.nj.f var1) {
      this.x(var1.S("AbsorptionAmount"));
      if(var1.K("Attributes", 9) && this.hl != null && !this.hl.x) {
         d.V(this.T(), var1.A("Attributes", 10));
      }

      if(var1.K("ActiveEffects", 9)) {
         net.nj.h var2 = var1.A("ActiveEffects", 10);

         for(int var3 = 0; var3 < var2.z(); ++var3) {
            net.nj.f var4 = var2.i(var3);
            net.n_.i var5 = net.n_.i.s(var4);
            this.AF.put(var5.i(), var5);
         }
      }

      if(var1.K("Health", 99)) {
         this.u(var1.S("Health"));
      }

      this.Xl = var1.E("HurtTime");
      this.AA = var1.E("DeathTime");
      this.A6 = var1.P("HurtByTimestamp");
      if(var1.K("Team", 8)) {
         String var6 = var1.J("Team");
         boolean var7 = this.hl.J().A(this.r(), var6);
         A8.warn("Unable to add mob to team \"" + var6 + "\" (that team probably doesn\'t exist)");
      }

      if(var1.i("FallFlying")) {
         this.I(7, true);
      }

   }

   protected void p() {
      Iterator var1 = this.AF.keySet().iterator();

      while(var1.hasNext()) {
         net.n_.f var2 = (net.n_.f)var1.next();
         net.n_.i var3 = (net.n_.i)this.AF.get(var2);
         if(!var3.N(this)) {
            if(!this.hl.x) {
               var1.remove();
               this.D(var3);
            }
         } else if(var3.S() % 600 == 0) {
            this.b(var3, false);
         }
      }

      if(this.A0) {
         if(!this.hl.x) {
            this.t();
         }

         this.A0 = false;
      }

      int var11 = ((Integer)this.G.a(AY)).intValue();
      boolean var12 = ((Boolean)this.G.a(An)).booleanValue();
      boolean var4;
      if(this.e()) {
         var4 = this.p.nextInt(15) == 0;
      } else {
         var4 = this.p.nextBoolean();
      }

      var4 = var4 & this.p.nextInt(5) == 0;
      double var5 = (double)(var11 >> 16 & 255) / 255.0D;
      double var7 = (double)(var11 >> 8 & 255) / 255.0D;
      double var9 = (double)(var11 >> 0 & 255) / 255.0D;
      this.hl.n(ai.SPELL_MOB_AMBIENT, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, var5, var7, var9, new int[0]);
   }

   protected void t() {
      if(this.AF.isEmpty()) {
         this.o();
         this.i(false);
      } else {
         Collection var1 = this.AF.values();
         this.G.d(An, Boolean.valueOf(z(var1)));
         this.G.d(AY, Integer.valueOf(net.n_.y.S(var1)));
         this.i(this.J(net.nb.b.y));
      }

   }

   public static boolean z(Collection var0) {
      for(net.n_.i var2 : var0) {
         if(!var2.b()) {
            return false;
         }
      }

      return true;
   }

   protected void o() {
      this.G.d(An, Boolean.valueOf(false));
      this.G.d(AY, Integer.valueOf(0));
   }

   public void f() {
      if(!this.hl.x) {
         Iterator var1 = this.AF.values().iterator();

         while(var1.hasNext()) {
            this.D((net.n_.i)var1.next());
            var1.remove();
         }
      }

   }

   public Collection o() {
      return this.AF.values();
   }

   public Map x() {
      return this.AF;
   }

   public boolean J(net.n_.f var1) {
      return this.AF.containsKey(var1);
   }

   @Nullable
   public net.n_.i b(net.n_.f var1) {
      return (net.n_.i)this.AF.get(var1);
   }

   public void o(net.n_.i var1) {
      if(this.Y(var1)) {
         net.n_.i var2 = (net.n_.i)this.AF.get(var1.i());
         this.AF.put(var1.i(), var1);
         this.B(var1);
      }

   }

   public boolean Y(net.n_.i var1) {
      if(this.g() != u.UNDEAD) {
         return true;
      } else {
         net.n_.f var2 = var1.i();
         return var2 != net.nb.b.n && var2 != net.nb.b.j;
      }
   }

   public boolean f() {
      return this.g() == u.UNDEAD;
   }

   @Nullable
   public net.n_.i t(@Nullable net.n_.f var1) {
      return (net.n_.i)this.AF.remove(var1);
   }

   public void V(net.n_.f var1) {
      net.n_.i var2 = this.t(var1);
      this.D(var2);
   }

   protected void B(net.n_.i var1) {
      this.A0 = true;
      if(!this.hl.x) {
         var1.i().a(this, this.T(), var1.d());
      }

   }

   protected void b(net.n_.i var1, boolean var2) {
      this.A0 = true;
      if(!this.hl.x) {
         net.n_.f var3 = var1.i();
         var3.c(this, this.T(), var1.d());
         var3.a(this, this.T(), var1.d());
      }

   }

   protected void D(net.n_.i var1) {
      this.A0 = true;
      if(!this.hl.x) {
         var1.i().c(this, this.T(), var1.d());
      }

   }

   public void d(float var1) {
      float var2 = this.h();
      if(var2 > 0.0F) {
         this.u(var2 + var1);
      }

   }

   public final float h() {
      return ((Float)this.G.a(AG)).floatValue();
   }

   public void u(float var1) {
      this.G.d(AG, Float.valueOf(net.u.t.T(var1, 0.0F, this.w())));
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else if(this.hl.x) {
         return false;
      } else {
         this.AP = 0;
         if(this.h() <= 0.0F) {
            return false;
         } else if(var1.q() && this.J(net.nb.b.t)) {
            return false;
         } else {
            float var3 = var2;
            if((var1 == net.yz.z.J || var1 == net.yz.z.r) && !this.U(z2.HEAD).B()) {
               this.U(z2.HEAD).S((int)(var2 * 4.0F + this.p.nextFloat() * var2 * 2.0F), this);
               var2 *= 0.75F;
            }

            boolean var4 = false;
            if(var2 > 0.0F && this.T(var1)) {
               this.h(var2);
               var2 = 0.0F;
               if(!var1.R()) {
                  l var5 = var1.g();
                  if(var5 instanceof a) {
                     this.V((a)var5);
                  }
               }

               var4 = true;
            }

            this.Aq = 1.5F;
            boolean var11 = true;
            if((float)this.I > (float)this.AD / 2.0F) {
               if(var2 <= this.A_) {
                  return false;
               }

               this.I(var1, var2 - this.A_);
               this.A_ = var2;
               var11 = false;
            } else {
               this.A_ = var2;
               this.I = this.AD;
               this.I(var1, var2);
               this.Ax = 10;
               this.Xl = this.Ax;
            }

            this.A1 = 0.0F;
            l var6 = var1.v();
            if(var6 instanceof a) {
               this.i((a)var6);
            }

            if(var6 instanceof net.r.r) {
               this.Ae = 100;
               this.AR = (net.r.r)var6;
            } else if(var6 instanceof net.yn.x) {
               net.yn.x var7 = (net.yn.x)var6;
               if(var7.D()) {
                  this.Ae = 100;
                  this.AR = null;
               }
            }

            this.hl.k(this, (byte)29);
            if(var1 != net.yz.z.N && var2 > 0.0F) {
               this.E();
            }

            double var13 = var6.b - this.b;

            double var9;
            for(var9 = var6.hr - this.hr; var13 * var13 + var9 * var9 < 1.0E-4D; var9 = (Math.random() - Math.random()) * 0.01D) {
               var13 = (Math.random() - Math.random()) * 0.01D;
            }

            this.A1 = (float)(net.u.t.V(var9, var13) * 57.29577951308232D - (double)this.hN);
            this.C(var6, 0.4F, var13, var9);
            if(this.h() <= 0.0F) {
               if(!this.a(var1)) {
                  net.yz.a var14 = this.r();
                  this.I(var14, this.G(), this.s());
                  this.O(var1);
               }
            } else {
               this.h(var1);
            }

            boolean var15 = var2 > 0.0F;
            this.AC = var1;
            this.AJ = this.hl.y();
            if(this instanceof net.r.h) {
               b2.K.B((net.r.h)this, var1, var3, var2, var4);
            }

            if(var6 instanceof net.r.h) {
               b2.i.E((net.r.h)var6, this, var1, var3, var2, var4);
            }

            return var15;
         }
      }
   }

   protected void V(a var1) {
      var1.C(this, 0.5F, this.b - var1.b, this.hr - var1.hr);
   }

   private boolean a(net.yz.z var1) {
      if(var1.a()) {
         return false;
      } else {
         ks var2 = null;

         for(net.yz.k var6 : net.yz.k.values()) {
            ks var7 = this.o(var6);
            if(var7.Z() == net.nb.j.YJ) {
               var2 = var7.s();
               var7.H(1);
               break;
            }
         }

         if(this instanceof net.r.h) {
            net.r.h var8 = (net.r.h)this;
            var8.S(net.v.q.H(net.nb.j.YJ));
            b2.W.h(var8, var2);
         }

         this.u(1.0F);
         this.f();
         this.o(new net.n_.i(net.nb.b.n, 900, 1));
         this.o(new net.n_.i(net.nb.b.H, 100, 1));
         this.hl.k(this, (byte)35);
         return true;
      }
   }

   @Nullable
   public net.yz.z N() {
      if(this.hl.y() - this.AJ > 40L) {
         this.AC = null;
      }

      return this.AC;
   }

   protected void h(net.yz.z var1) {
      net.yz.a var2 = this.m(var1);
      this.I(var2, this.G(), this.s());
   }

   private boolean T(net.yz.z var1) {
      if(!var1.i() && this.E()) {
         net.u.r var2 = var1.X();
         net.u.r var3 = this.r(1.0F);
         net.u.r var4 = var2.I(new net.u.r(this.b, this.hS, this.hr)).I();
         var4 = new net.u.r(var4.p, 0.0D, var4.a);
         return var4.d(var3) < 0.0D;
      } else {
         return false;
      }
   }

   public void T(ks var1) {
      this.I(net.nb.l.Pp, 0.8F, 0.8F + this.hl.G.nextFloat() * 0.4F);
      int var2 = 0;

      while(true) {
         net.u.r var3 = new net.u.r(((double)this.p.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3 = var3.f(-this.V * 0.017453292F);
         var3 = var3.T(-this.hN * 0.017453292F);
         double var4 = (double)(-this.p.nextFloat()) * 0.6D - 0.3D;
         net.u.r var6 = new net.u.r(((double)this.p.nextFloat() - 0.5D) * 0.3D, var4, 0.6D);
         var6 = var6.f(-this.V * 0.017453292F);
         var6 = var6.T(-this.hN * 0.017453292F);
         var6 = var6.s(this.b, this.hS + (double)this.A(), this.hr);
         this.hl.n(ai.ITEM_CRACK, var6.p, var6.H, var6.a, var3.p, var3.H + 0.05D, var3.a, new int[]{net.n0.y.h(var1.Z())});
         ++var2;
      }
   }

   public void O(net.yz.z var1) {
      if(!this.Xp) {
         l var2 = var1.v();
         a var3 = this.O();
         if(this.Xx >= 0) {
            var3.D(this, this.Xx, var1);
         }

         var2.M(this);
         this.Xp = true;
         this.a().Q();
         if(!this.hl.x) {
            int var4 = 0;
            if(var2 instanceof net.r.r) {
               var4 = net.c1.y.m((a)var2);
            }

            if(this.W() && this.hl.N().b("doMobLoot")) {
               boolean var5 = this.Ae > 0;
               this.U(var5, var4, var1);
            }
         }

         this.hl.k(this, (byte)3);
      }

   }

   protected void U(boolean var1, int var2, net.yz.z var3) {
      this.J(var1, var2);
      this.n(var1, var2);
   }

   protected void n(boolean var1, int var2) {
   }

   public void C(l var1, float var2, double var3, double var5) {
      if(this.p.nextDouble() >= this.t(d.l).K()) {
         this.w = true;
         float var7 = net.u.t.R(var3 * var3 + var5 * var5);
         this.hf /= 2.0D;
         this.J /= 2.0D;
         this.hf -= var3 / (double)var7 * (double)var2;
         this.J -= var5 / (double)var7 * (double)var2;
         if(this.k) {
            this.K /= 2.0D;
            this.K += (double)var2;
            if(this.K > 0.4000000059604645D) {
               this.K = 0.4000000059604645D;
            }
         }
      }

   }

   @Nullable
   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Mw;
   }

   @Nullable
   protected net.yz.a r() {
      return net.nb.l.Ce;
   }

   protected net.yz.a s(int var1) {
      return var1 > 4?net.nb.l.Cr:net.nb.l.oh;
   }

   protected void J(boolean var1, int var2) {
   }

   public boolean K() {
      int var1 = net.u.t.L(this.b);
      int var2 = net.u.t.L(this.i().u);
      int var3 = net.u.t.L(this.hr);
      if(this instanceof net.r.r && ((net.r.r)this).VX()) {
         return false;
      } else {
         net.u.j var4 = new net.u.j(var1, var2, var3);
         net.yw.n var5 = this.hl.Z(var4);
         net.y9.l var6 = var5.Q();
         return var6 != net.nb.f.K && var6 != net.nb.f.To?var6 instanceof ls && this.I(var4, var5):true;
      }
   }

   private boolean I(net.u.j var1, net.yw.n var2) {
      if(!((Boolean)var2.i(ls.H)).booleanValue()) {
         return false;
      } else {
         net.yw.n var3 = this.hl.Z(var1.b());
         return var3.Q() == net.nb.f.K && var3.i(gp.i) == var2.i(ls.c);
      }
   }

   public boolean P() {
      return !this.Z && this.h() > 0.0F;
   }

   public void v(float var1, float var2) {
      super.v(var1, var2);
      net.n_.i var3 = this.b(net.nb.b.q);
      float var4 = 0.0F;
      int var5 = net.u.t.Y((var1 - 3.0F - var4) * var2);
      this.I(this.s(var5), 1.0F, 1.0F);
      this.H(net.yz.z.H, (float)var5);
      int var6 = net.u.t.L(this.b);
      int var7 = net.u.t.L(this.hS - 0.20000000298023224D);
      int var8 = net.u.t.L(this.hr);
      net.yw.n var9 = this.hl.Z(new net.u.j(var6, var7, var8));
      if(var9.n() != net.y1.l.q) {
         lk var10 = var9.Q().X();
         this.I(var10.c(), var10.m() * 0.5F, var10.X() * 0.75F);
      }

   }

   public void I() {
      this.Ax = 10;
      this.Xl = this.Ax;
      this.A1 = 0.0F;
   }

   public int U() {
      net.s.i var1 = this.t(d.g);
      return net.u.t.L(var1.K());
   }

   protected void G(float var1) {
   }

   protected void h(float var1) {
   }

   protected float o(net.yz.z var1, float var2) {
      if(!var1.i()) {
         this.G(var2);
         var2 = a6.A(var2, (float)this.U(), (float)this.t(d.f).K());
      }

      return var2;
   }

   protected float m(net.yz.z var1, float var2) {
      if(var1.v()) {
         return var2;
      } else {
         if(this.J(net.nb.b.D) && var1 != net.yz.z.s) {
            int var3 = (this.b(net.nb.b.D).d() + 1) * 5;
            int var4 = 25 - var3;
            float var5 = var2 * (float)var4;
            var2 = var5 / 25.0F;
         }

         if(var2 <= 0.0F) {
            return 0.0F;
         } else {
            int var7 = net.c1.y.o(this.J(), var1);
            var2 = a6.S(var2, (float)var7);
            return var2;
         }
      }
   }

   protected void I(net.yz.z var1, float var2) {
      if(!this.w(var1)) {
         var2 = this.o(var1, var2);
         var2 = this.m(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.y(), 0.0F);
         this.x(this.y() - (var3 - var2));
         if(var2 != 0.0F) {
            float var4 = this.h();
            this.u(var4 - var2);
            this.a().R(var1, var4, var2);
            this.x(this.y() - var2);
         }
      }

   }

   public as a() {
      return this.Av;
   }

   @Nullable
   public a O() {
      return (a)(this.Av.Y() != null?this.Av.Y():(this.AR != null?this.AR:(this.Af != null?this.Af:null)));
   }

   public final float w() {
      return (float)this.t(d.C).K();
   }

   public final int T() {
      return ((Integer)this.G.a(Au)).intValue();
   }

   public final void s(int var1) {
      if(!gn.Q.j.d(v3.class).v() || !v3.I.Q()) {
         this.G.d(Au, Integer.valueOf(var1));
      }

   }

   private int D() {
      if(gn.Q.j.d(vf.class).v()) {
         int var1 = gn.Q.J.S("Swing Speed").W();
         return this.J(net.nb.b.o)?6 + (1 + this.b(net.nb.b.o).d()) * 2:var1;
      } else {
         return this.J(net.nb.b.o)?6 + (1 + this.b(net.nb.b.o).d()) * 2:6;
      }
   }

   public void N(net.yz.k var1) {
      if(!this.XR || this.Ap >= this.D() / 2 || this.Ap < 0) {
         this.Ap = -1;
         this.XR = true;
         this.XE = var1;
         if(this.hl instanceof net.yv.d) {
            ((net.yv.d)this.hl).K().z(this, new sb(this, var1 == net.yz.k.MAIN_HAND?0:3));
         }
      }

   }

   public void R(byte var1) {
      boolean var2 = var1 == 33;
      boolean var3 = var1 == 36;
      boolean var4 = var1 == 37;
      if(var1 != 2) {
         if(var1 == 3) {
            net.yz.a var5 = this.r();
            this.I(var5, this.G(), (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
            this.u(0.0F);
            this.O(net.yz.z.P);
         } else if(var1 == 30) {
            this.I(net.nb.l.Hc, 0.8F, 0.8F + this.hl.G.nextFloat() * 0.4F);
         } else if(var1 == 29) {
            this.I(net.nb.l.z, 1.0F, 0.8F + this.hl.G.nextFloat() * 0.4F);
         } else {
            super.R(var1);
         }
      } else {
         this.Aq = 1.5F;
         this.I = this.AD;
         this.Ax = 10;
         this.Xl = this.Ax;
         this.A1 = 0.0F;
         this.I(net.nb.l.Kv, this.G(), (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         net.yz.z var7 = net.yz.z.y;
         net.yz.a var6 = this.m(var7);
         this.I(var6, this.G(), (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         this.H(net.yz.z.P, 0.0F);
      }

   }

   protected void R() {
      this.H(net.yz.z.s, 4.0F);
   }

   protected void V() {
      int var1 = this.D();
      if(this.XR) {
         ++this.Ap;
         if(this.Ap >= var1) {
            this.Ap = 0;
            this.XR = false;
         }
      } else {
         this.Ap = 0;
      }

      this.Ar = (float)this.Ap / (float)var1;
   }

   public net.s.i t(net.s.b var1) {
      return this.T().Q(var1);
   }

   public net.s.m T() {
      if(this.Ay == null) {
         this.Ay = new net.s.w();
      }

      return this.Ay;
   }

   public u g() {
      return u.UNDEFINED;
   }

   public ks S() {
      return this.U(z2.MAINHAND);
   }

   public ks L() {
      return this.U(z2.OFFHAND);
   }

   public ks o(net.yz.k var1) {
      if(var1 == net.yz.k.MAIN_HAND) {
         return this.U(z2.MAINHAND);
      } else if(var1 == net.yz.k.OFF_HAND) {
         return this.U(z2.OFFHAND);
      } else {
         throw new IllegalArgumentException("Invalid hand " + var1);
      }
   }

   public void e(net.yz.k var1, ks var2) {
      if(var1 == net.yz.k.MAIN_HAND) {
         this.u(z2.MAINHAND, var2);
      } else {
         if(var1 != net.yz.k.OFF_HAND) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.u(z2.OFFHAND, var2);
      }

   }

   public boolean A(z2 var1) {
      return !this.U(var1).B();
   }

   public abstract Iterable J();

   public abstract ks U(z2 var1);

   public abstract void u(z2 var1, ks var2);

   public void j(boolean var1) {
      super.j(var1);
      net.s.i var2 = this.t(d.G);
      if(var2.S(Aj) != null) {
         var2.n(Xm);
      }

      var2.g(Xm);
   }

   protected float G() {
      return 1.0F;
   }

   protected float s() {
      return this.H9()?(this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.5F:(this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F;
   }

   protected boolean HD() {
      return this.h() <= 0.0F;
   }

   public void t(l var1) {
      if(!(var1 instanceof net.nm.b) && !(var1 instanceof net.yn.j)) {
         double var34 = var1.b;
         double var35 = var1.i().u + (double)var1.m;
         double var36 = var1.hr;
         aq var8 = var1.C();
         aq var37 = var8.R();
         int[][] var10 = new int[][]{{0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 0}, {1, 0}, {0, 1}};
         double var38 = Math.floor(this.b) + 0.5D;
         double var13 = Math.floor(this.hr) + 0.5D;
         double var15 = this.i().d - this.i().n;
         double var17 = this.i().r - this.i().N;
         net.u.e var19 = new net.u.e(var38 - var15 / 2.0D, var1.i().u, var13 - var17 / 2.0D, var38 + var15 / 2.0D, Math.floor(var1.i().u) + (double)this.m, var13 + var17 / 2.0D);

         for(int[] var23 : var10) {
            double var24 = (double)(var8.v() * var23[0] + var37.v() * var23[1]);
            double var26 = (double)(var8.P() * var23[0] + var37.P() * var23[1]);
            double var28 = var38 + var24;
            double var30 = var13 + var26;
            net.u.e var32 = var19.w(var24, 0.0D, var26);
            if(!this.hl.v(var32)) {
               if(this.hl.Z(new net.u.j(var28, this.hS, var30)).z()) {
                  this.a(var28, this.hS + 1.0D, var30);
                  return;
               }

               net.u.j var33 = new net.u.j(var28, this.hS - 1.0D, var30);
               if(this.hl.Z(var33).z() || this.hl.Z(var33).n() == net.y1.l.p) {
                  var34 = var28;
                  var35 = this.hS + 1.0D;
                  var36 = var30;
               }
            } else if(!this.hl.v(var32.w(0.0D, 1.0D, 0.0D)) && this.hl.Z(new net.u.j(var28, this.hS + 1.0D, var30)).z()) {
               var34 = var28;
               var35 = this.hS + 2.0D;
               var36 = var30;
            }
         }

         this.a(var34, var35, var36);
      } else {
         double var2 = (double)(this.h9 / 2.0F + var1.h9 / 2.0F) + 0.4D;
         float var4;
         if(var1 instanceof net.nm.b) {
            var4 = 0.0F;
         } else {
            var4 = 1.5707964F * (float)(this.a() == aa.RIGHT?-1:1);
         }

         float var5 = -net.u.t.A(-this.hN * 0.017453292F - 3.1415927F + var4);
         float var6 = -net.u.t.m(-this.hN * 0.017453292F - 3.1415927F + var4);
         double var7 = Math.abs(var5) > Math.abs(var6)?var2 / (double)Math.abs(var5):var2 / (double)Math.abs(var6);
         double var9 = this.b + (double)var5 * var7;
         double var11 = this.hr + (double)var6 * var7;
         this.t(var9, var1.hS + (double)var1.m + 0.001D, var11);
         if(this.hl.v(this.i())) {
            this.t(var9, var1.hS + (double)var1.m + 1.001D, var11);
            if(this.hl.v(this.i())) {
               this.t(var1.b, var1.hS + (double)this.m + 0.001D, var1.hr);
            }
         }
      }

   }

   public boolean z() {
      return this.y();
   }

   protected float S() {
      return 0.42F;
   }

   protected void Z() {
      z1 var1 = new z1(this.hN);
      _x.m(var1);
      if(!var1.t()) {
         this.K = (double)this.S();
         if(this.J(net.nb.b.q)) {
            this.K += (double)((float)(this.b(net.nb.b.q).d() + 1) * 0.1F);
         }

         if(this.B()) {
            float var2 = var1.f() * 0.017453292F;
            this.hf -= (double)(net.u.t.A(var2) * 0.2F);
            this.J += (double)(net.u.t.m(var2) * 0.2F);
         }

         this.w = true;
      }
   }

   protected void s() {
      this.K += 0.03999999910593033D;
   }

   protected void y() {
      this.K += 0.03999999910593033D;
   }

   protected float r() {
      return 0.8F;
   }

   public void E(float var1, float var2, float var3) {
      boolean var4 = d.O();
      if(this.H7() || this.V()) {
         if(!this.p() || gn.Q.j.d(vz.class).v() || this instanceof net.r.r && ((net.r.r)this).a6.n) {
            if(!this.h() || this instanceof net.r.r && ((net.r.r)this).a6.n) {
               if(this.I()) {
                  if(this.K > -0.5D) {
                     this.hI = 1.0F;
                  }

                  net.u.r var5 = this.g();
                  float var6 = this.V * 0.017453292F;
                  double var7 = Math.sqrt(var5.p * var5.p + var5.a * var5.a);
                  double var9 = Math.sqrt(this.hf * this.hf + this.J * this.J);
                  double var11 = var5.c();
                  float var13 = net.u.t.m(var6);
                  var13 = (float)((double)var13 * (double)var13 * Math.min(1.0D, var11 / 0.4D));
                  this.K += -0.08D + (double)var13 * 0.06D;
                  if(Double.compare(this.K, 0.0D) < 0 && Double.compare(var7, 0.0D) > 0) {
                     double var14 = this.K * -0.1D * (double)var13;
                     this.K += var14;
                     this.hf += var5.p * var14 / var7;
                     this.J += var5.a * var14 / var7;
                  }

                  if(Float.compare(var6, 0.0F) < 0) {
                     double var35 = var9 * (double)(-net.u.t.A(var6)) * 0.04D;
                     this.K += var35 * 3.2D;
                     this.hf -= var5.p * var35 / var7;
                     this.J -= var5.a * var35 / var7;
                  }

                  if(Double.compare(var7, 0.0D) > 0) {
                     this.hf += (var5.p / var7 * var9 - this.hf) * 0.1D;
                     this.J += (var5.a / var7 * var9 - this.J) * 0.1D;
                  }

                  this.hf *= 0.9900000095367432D;
                  this.K *= 0.9800000190734863D;
                  this.J *= 0.9900000095367432D;
                  this.N(f.SELF, this.hf, this.K, this.J);
                  if(this.t && !this.hl.x) {
                     double var36 = Math.sqrt(this.hf * this.hf + this.J * this.J);
                     double var16 = var9 - var36;
                     float var18 = (float)(var16 * 10.0D - 3.0D);
                     if(Float.compare(var18, 0.0F) > 0) {
                        this.I(this.s((int)var18), 1.0F, 1.0F);
                        this.H(net.yz.z.g, var18);
                     }
                  }

                  if(this.k && !this.hl.x) {
                     this.I(7, false);
                  }
               }

               float var19 = 0.91F;
               net.u.j var24 = net.u.j.x(this.b, this.i().u - 1.0D, this.hr);
               if(this.k) {
                  var19 = this.hl.Z(var24).Q().P * 0.91F;
               }

               float var25 = 0.16277136F / (var19 * var19 * var19);
               if(this.k) {
                  float var8 = this.q() * var25;
               }

               float var28 = this.AN;
               this.h(var1, var2, var3, var28);
               var19 = 0.91F;
               if(this.k) {
                  var19 = this.hl.Z(var24.E(this.b, this.i().u - 1.0D, this.hr)).Q().P * 0.91F;
               }

               if(this.K()) {
                  float var30 = 0.15F;
                  this.hf = net.u.t.F(this.hf, -0.15000000596046448D, 0.15000000596046448D);
                  this.J = net.u.t.F(this.J, -0.15000000596046448D, 0.15000000596046448D);
                  this.hI = 0.0F;
                  if(Double.compare(this.K, -0.15D) < 0) {
                     this.K = -0.15D;
                  }

                  if(this.Q() && this instanceof net.r.r) {
                     boolean var37 = true;
                  } else {
                     boolean var10000 = false;
                  }
               }

               this.N(f.SELF, this.hf, this.K, this.J);
               if(this.t && this.K()) {
                  this.K = 0.2D;
               }

               if(this.J(net.nb.b.A)) {
                  this.K += (0.05D * (double)(this.b(net.nb.b.A).d() + 1) - this.K) * 0.2D;
               }

               label1242: {
                  var24.E(this.b, 0.0D, this.hr);
                  if(!this.hl.x || this.hl.o((net.u.j)var24) && this.hl.d((net.u.j)var24).Q()) {
                     if(this.j()) {
                        break label1242;
                     }

                     this.K -= 0.08D;
                  }

                  if(this.hS > 0.0D) {
                     this.K = -0.1D;
                  }

                  this.K = 0.0D;
               }

               this.K *= 0.9800000190734863D;
               this.hf *= (double)var19;
               this.J *= (double)var19;
               var24.T();
            }

            double var21 = this.hS;
            this.h(var1, var2, var3, 0.02F);
            this.N(f.SELF, this.hf, this.K, this.J);
            this.hf *= 0.5D;
            this.K *= 0.5D;
            this.J *= 0.5D;
            if(!this.j()) {
               this.K -= 0.02D;
            }

            if(this.t && this.h(this.hf, this.K + 0.6000000238418579D - this.hS + var21, this.J)) {
               this.K = 0.30000001192092896D;
            }
         }

         double var22 = this.hS;
         float var26 = this.r();
         float var29 = 0.02F;
         float var31 = (float)net.c1.y.J(this);
         if(Float.compare(var31, 3.0F) > 0) {
            var31 = 3.0F;
         }

         if(!this.k) {
            var31 *= 0.5F;
         }

         if(Float.compare(var31, 0.0F) > 0) {
            var26 += (0.54600006F - var26) * var31 / 3.0F;
            var29 += (this.q() - var29) * var31 / 3.0F;
         }

         this.h(var1, var2, var3, var29);
         this.N(f.SELF, this.hf, this.K, this.J);
         this.hf *= (double)var26;
         this.K *= 0.800000011920929D;
         this.J *= (double)var26;
         if(!this.j()) {
            this.K -= 0.02D;
         }

         if(this.t && this.h(this.hf, this.K + 0.6000000238418579D - this.hS + var22, this.J)) {
            this.K = 0.30000001192092896D;
         }
      }

      this.AS = this.Aq;
      double var23 = this.b - this.h;
      double var27 = this.hr - this.l;
      double var32 = this instanceof wv?this.hS - this.h6:0.0D;
      float var33 = net.u.t.R(var23 * var23 + var32 * var32 + var27 * var27) * 4.0F;
      if(var33 > 1.0F) {
         var33 = 1.0F;
      }

      this.Aq += (var33 - this.Aq) * 0.4F;
      this.A5 += this.Aq;
   }

   public float q() {
      return this.A2;
   }

   public void P(float var1) {
      this.A2 = var1;
   }

   public boolean S(l var1) {
      this.X(var1);
      return false;
   }

   public boolean L() {
      return false;
   }

   public void A() {
      super.A();
      this.q();
      if(!this.hl.x) {
         int var1 = this.T();
         if(this.A7 <= 0) {
            this.A7 = 20 * (30 - var1);
         }

         --this.A7;
         if(this.A7 <= 0) {
            this.s(var1 - 1);
         }

         for(z2 var5 : z2.values()) {
            ks var6;
            switch(null.k[var5.x().ordinal()]) {
            case 1:
               var6 = (ks)this.Am.get(var5.l());
               break;
            case 2:
               var6 = (ks)this.Xu.get(var5.l());
               break;
            default:
               continue;
            }

            ks var7 = this.U(var5);
            if(!ks.D(var7, var6)) {
               ((net.yv.d)this.hl).K().z(this, new id(this.G(), var5, var7));
               if(!var6.B()) {
                  this.T().e(var6.Z(var5));
               }

               if(!var7.B()) {
                  this.T().q(var7.Z(var5));
               }

               switch(null.k[var5.x().ordinal()]) {
               case 1:
                  this.Am.set(var5.l(), var7.B()?ks.a:var7.s());
                  break;
               case 2:
                  this.Xu.set(var5.l(), var7.B()?ks.a:var7.s());
               }
            }
         }

         if(this.x % 20 == 0) {
            this.a().Q();
         }

         if(!this.hP) {
            boolean var12 = this.J(net.nb.b.r);
            if(this.J(6) != var12) {
               this.I(6, var12);
            }
         }
      }

      this.d();
      double var11 = this.b - this.h;
      double var13 = this.hr - this.l;
      float var14 = (float)(var11 * var11 + var13 * var13);
      float var15 = this.AK;
      float var16 = 0.0F;
      this.Xq = this.AV;
      float var8 = 0.0F;
      if(var14 > 0.0025000002F) {
         var8 = 1.0F;
         var16 = (float)Math.sqrt((double)var14) * 3.0F;
         float var9 = (float)net.u.t.V(var13, var11) * 57.295776F - 90.0F;
         float var10 = net.u.t.J(net.u.t.k(this.hN) - var9);
         if(95.0F < var10 && var10 < 265.0F) {
            var15 = var9 - 180.0F;
         } else {
            var15 = var9;
         }
      }

      if(this.Ar > 0.0F) {
         var15 = this.hN;
      }

      if(!this.k) {
         var8 = 0.0F;
      }

      this.AV += (var8 - this.AV) * 0.3F;
      this.hl.M.K("headTurn");
      var16 = this.z(var15, var16);
      this.hl.M.N();
      this.hl.M.K("rangeChecks");

      while(this.hN - this.hq < -180.0F) {
         this.hq -= 360.0F;
      }

      while(this.hN - this.hq >= 180.0F) {
         this.hq += 360.0F;
      }

      while(this.AK - this.Az < -180.0F) {
         this.Az -= 360.0F;
      }

      while(this.AK - this.Az >= 180.0F) {
         this.Az += 360.0F;
      }

      while(this.V - this.d < -180.0F) {
         this.d -= 360.0F;
      }

      while(this.V - this.d >= 180.0F) {
         this.d += 360.0F;
      }

      while(this.A3 - this.AH < -180.0F) {
         this.AH -= 360.0F;
      }

      while(this.A3 - this.AH >= 180.0F) {
         this.AH += 360.0F;
      }

      this.hl.M.N();
      this.AM += var16;
      if(this.I()) {
         ++this.AO;
      } else {
         this.AO = 0;
      }

   }

   protected float z(float var1, float var2) {
      float var3 = net.u.t.k(var1 - this.AK);
      this.AK += var3 * 0.3F;
      float var4 = net.u.t.k(this.hN - this.AK);
      boolean var5 = var4 < -90.0F || var4 >= 90.0F;
      if(var4 < -75.0F) {
         var4 = -75.0F;
      }

      if(var4 >= 75.0F) {
         var4 = 75.0F;
      }

      this.AK = this.hN - var4;
      if(var4 * var4 > 2500.0F) {
         this.AK += var4 * 0.2F;
      }

      var2 = var2 * -1.0F;
      return var2;
   }

   public void d() {
      if(this.A4 > 0) {
         --this.A4;
      }

      if(this.A9 > 0 && !this.V()) {
         double var1 = this.b + (this.Ag - this.b) / (double)this.A9;
         double var3 = this.hS + (this.AW - this.hS) / (double)this.A9;
         double var5 = this.hr + (this.Ah - this.hr) / (double)this.A9;
         double var7 = net.u.t.p(this.Ak - (double)this.hN);
         this.hN = (float)((double)this.hN + var7 / (double)this.A9);
         this.V = (float)((double)this.V + (this.As - (double)this.V) / (double)this.A9);
         --this.A9;
         this.t(var1, var3, var5);
         this.r(this.hN, this.V);
      } else if(!this.H7()) {
         this.hf *= 0.98D;
         this.K *= 0.98D;
         this.J *= 0.98D;
      }

      if(Math.abs(this.hf) < 0.003D) {
         this.hf = 0.0D;
      }

      if(Math.abs(this.K) < 0.003D) {
         this.K = 0.0D;
      }

      if(Math.abs(this.J) < 0.003D) {
         this.J = 0.0D;
      }

      this.hl.M.K("ai");
      if(this.HD()) {
         this.XL = false;
         this.XG = 0.0F;
         this.XK = 0.0F;
         this.Ad = 0.0F;
      } else if(this.H7()) {
         this.hl.M.K("newAi");
         this.r();
         this.hl.M.N();
      }

      this.hl.M.N();
      this.hl.M.K("jump");
      if(this.XL) {
         if(this.p()) {
            this.s();
         } else if(this.h()) {
            this.y();
         } else if(this.k && this.A4 == 0) {
            this.Z();
            this.A4 = gn.Q.j.d(sh.class).v()?0:10;
         }
      } else {
         this.A4 = 0;
      }

      this.hl.M.N();
      this.hl.M.K("travel");
      this.XG *= 0.98F;
      this.XK *= 0.98F;
      this.Ad *= 0.9F;
      this.a();
      this.E(this.XG, this.AQ, this.XK);
      this.hl.M.N();
      this.hl.M.K("push");
      this.z();
      this.hl.M.N();
   }

   private void a() {
      boolean var1 = this.J(7);
      if(!this.k && !this.M()) {
         ks var2 = this.U(z2.CHEST);
         if(var2.Z() == net.nb.j.SB && yi.C(var2)) {
            var1 = true;
            if(!this.hl.x && (this.AO + 1) % 20 == 0) {
               var2.S(1, this);
            }
         } else {
            var1 = false;
         }
      } else {
         var1 = false;
      }

      if(!this.hl.x) {
         this.I(7, var1);
      }

   }

   protected void r() {
   }

   protected void z() {
      List var1 = this.hl.S(this, this.i(), net.yz.q.K(this));
      if(!var1.isEmpty()) {
         int var2 = this.hl.N().C("maxEntityCramming");
         if(var1.size() > var2 - 1 && this.p.nextInt(4) == 0) {
            int var3 = 0;

            for(int var4 = 0; var4 < var1.size(); ++var4) {
               if(!((l)var1.get(var4)).M()) {
                  ++var3;
               }
            }

            if(var3 > var2 - 1) {
               this.H(net.yz.z.h, 6.0F);
            }
         }

         for(int var5 = 0; var5 < var1.size(); ++var5) {
            l var6 = (l)var1.get(var5);
            this.I(var6);
         }
      }

   }

   protected void I(l var1) {
      var1.W(this);
   }

   public void O() {
      l var1 = this.D();
      super.O();
      if(var1 != this.D() && !this.hl.x) {
         this.t(var1);
      }

   }

   public void C() {
      super.C();
      this.Xq = this.AV;
      this.AV = 0.0F;
      this.hI = 0.0F;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.Ag = var1;
      this.AW = var3;
      this.Ah = var5;
      this.Ak = (double)var7;
      this.As = (double)var8;
      this.A9 = var9;
   }

   public void N(boolean var1) {
      this.XL = var1;
   }

   public void U(l var1, int var2) {
      if(!var1.Z && !this.hl.x) {
         bk var3 = ((net.yv.d)this.hl).K();
         if(var1 instanceof net.nm.i || var1 instanceof net.n1.o || var1 instanceof net.nm.s) {
            var3.z(var1, new net.no.t(var1.G(), this.G(), var2));
         }
      }

   }

   public boolean b(l var1) {
      return this.hl.s(new net.u.r(this.b, this.hS + (double)this.A(), this.hr), new net.u.r(var1.b, var1.hS + (double)var1.A(), var1.hr), false, true, false) == null;
   }

   public net.u.r r(float var1) {
      if(var1 == 1.0F) {
         return z(this.V, this.A3);
      } else {
         float var2 = this.d + (this.V - this.d) * var1;
         float var3 = this.AH + (this.A3 - this.AH) * var1;
         return z(var2, var3);
      }
   }

   public float p(float var1) {
      float var2 = this.Ar - this.AL;
      if(var2 < 0.0F) {
         ++var2;
      }

      return this.AL + var2 * var1;
   }

   public boolean H7() {
      return !this.hl.x;
   }

   public boolean w() {
      return !this.Z;
   }

   public boolean b() {
      return this.P() && !this.K();
   }

   protected void E() {
      this.hV = this.p.nextDouble() >= this.t(d.l).K();
   }

   public float X() {
      return this.A3;
   }

   public void A(float var1) {
      this.A3 = var1;
   }

   public void X(float var1) {
      this.AK = var1;
   }

   public float y() {
      return this.AE;
   }

   public void x(float var1) {
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.AE = var1;
   }

   public void w() {
   }

   public void S() {
   }

   protected void J() {
      this.A0 = true;
   }

   public abstract aa a();

   public boolean F() {
      return (((Byte)this.G.a(AT)).byteValue() & 1) > 0;
   }

   public net.yz.k H() {
      return (((Byte)this.G.a(AT)).byteValue() & 2) > 0?net.yz.k.OFF_HAND:net.yz.k.MAIN_HAND;
   }

   protected void q() {
      if(this.F()) {
         ks var1 = this.o(this.H());
         if(var1 == this.AI) {
            if(this.M() <= 25 && this.M() % 4 == 0) {
               this.D(this.AI, 5);
            }

            if(--this.At == 0 && !this.hl.x) {
               this.n();
            }
         } else {
            this.F();
         }
      }

   }

   public void T(net.yz.k var1) {
      ks var2 = this.o(var1);
      if(!var2.B() && !this.F()) {
         this.AI = var2;
         this.At = var2.o();
         if(!this.hl.x) {
            int var3 = 1;
            if(var1 == net.yz.k.OFF_HAND) {
               var3 |= 2;
            }

            this.G.d(AT, Byte.valueOf((byte)var3));
         }
      }

   }

   public void O(net.k.v var1) {
      super.O(var1);
      if(AT.equals(var1) && this.hl.x) {
         if(this.F() && this.AI.B()) {
            this.AI = this.o(this.H());
            if(!this.AI.B()) {
               this.At = this.AI.o();
            }
         } else if(!this.F() && !this.AI.B()) {
            this.AI = ks.a;
            this.At = 0;
         }
      }

   }

   public void D(ks var1, int var2) {
      if(!var1.B() && this.F()) {
         if(var1.D() == k7.DRINK) {
            this.I(net.nb.l.Dj, 0.5F, this.hl.G.nextFloat() * 0.1F + 0.9F);
         }

         if(var1.D() == k7.EAT) {
            for(int var3 = 0; var3 < var2; ++var3) {
               net.u.r var4 = new net.u.r(((double)this.p.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
               var4 = var4.f(-this.V * 0.017453292F);
               var4 = var4.T(-this.hN * 0.017453292F);
               double var5 = (double)(-this.p.nextFloat()) * 0.6D - 0.3D;
               net.u.r var7 = new net.u.r(((double)this.p.nextFloat() - 0.5D) * 0.3D, var5, 0.6D);
               var7 = var7.f(-this.V * 0.017453292F);
               var7 = var7.T(-this.hN * 0.017453292F);
               var7 = var7.s(this.b, this.hS + (double)this.A(), this.hr);
               if(var1.z()) {
                  this.hl.n(ai.ITEM_CRACK, var7.p, var7.H, var7.a, var4.p, var4.H + 0.05D, var4.a, new int[]{net.n0.y.h(var1.Z()), var1.n()});
               } else {
                  this.hl.n(ai.ITEM_CRACK, var7.p, var7.H, var7.a, var4.p, var4.H + 0.05D, var4.a, new int[]{net.n0.y.h(var1.Z())});
               }
            }

            this.I(net.nb.l.Ca, 0.5F + 0.5F * (float)this.p.nextInt(2), (this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   public void n() {
      if(!this.AI.B() && this.F()) {
         this.D(this.AI, 16);
         this.e(this.H(), this.AI.y(this.hl, this));
         this.F();
      }

   }

   public ks t() {
      return this.AI;
   }

   public int M() {
      return this.At;
   }

   public int P() {
      return this.HY()?this.AI.o() - this.M():0;
   }

   public int d() {
      return this.F()?this.AI.o() - this.M():0;
   }

   public void h() {
      if(!this.AI.B()) {
         this.AI.w(this.hl, this, this.M());
      }

      this.F();
   }

   public void F() {
      if(!this.hl.x) {
         this.G.d(AT, Byte.valueOf((byte)0));
      }

      this.AI = ks.a;
      this.At = 0;
   }

   public boolean E() {
      if(this.F() && !this.AI.B()) {
         net.n0.y var1 = this.AI.Z();
         return var1.g(this.AI) != k7.BLOCK?false:var1.K(this.AI) - this.At >= 5;
      } else {
         return false;
      }
   }

   public boolean I() {
      return this.J(7);
   }

   public int F() {
      return this.AO;
   }

   public boolean W(double var1, double var3, double var5) {
      double var7 = this.b;
      double var9 = this.hS;
      double var11 = this.hr;
      this.b = var1;
      this.hS = var3;
      this.hr = var5;
      boolean var13 = false;
      net.u.j var14 = new net.u.j(this);
      net.yv.r var15 = this.hl;
      this.Q();
      if(var15.o(var14)) {
         boolean var17 = false;

         while(var14.h() > 0) {
            net.u.j var18 = var14.b();
            net.yw.n var19 = var15.Z(var18);
            if(var19.n().f()) {
               var17 = true;
            } else {
               --this.hS;
               var14 = var18;
            }
         }

         this.a(this.b, this.hS, this.hr);
         if(var15.h(this, this.i()).isEmpty() && !var15.p(this.i())) {
            var13 = true;
         }
      }

      this.a(var7, var9, var11);
      return false;
   }

   public boolean U() {
      return true;
   }

   public boolean N() {
      return true;
   }

   public void U(net.u.j var1, boolean var2) {
   }

   public boolean Hj() {
      return this.F() && this.AI.Z().g(this.AI) == k7.BLOCK;
   }

   public boolean l() {
      return this.F() && this.AI.Z().g(this.AI) == k7.EAT;
   }

   public boolean HY() {
      return this.F() && (this.AI.Z().g(this.AI) == k7.EAT || this.AI.Z().g(this.AI) == k7.BLOCK || this.AI.Z().g(this.AI) == k7.BOW || this.AI.Z().g(this.AI) == k7.DRINK);
   }

   public boolean H3() {
      return net.nn.j.b().T.iD.V;
   }

   public boolean HP() {
      return this.F() && this.AI.Z().g(this.AI) == k7.DRINK;
   }

   public boolean HO() {
      return this.F() && this.AI.Z().g(this.AI) == k7.BOW;
   }

   static {
      P(new net.u.d[3]);
   }

   public static void P(net.u.d[] var0) {
      Xj = var0;
   }

   public static net.u.d[] y() {
      return Xj;
   }

   private static ConcurrentModificationException a(ConcurrentModificationException var0) {
      return var0;
   }
}
