package net.yy;

import java.util.List;
import javax.annotation.Nullable;
import net._x;
import net.gn;
import net.s_;
import net.ss;
import net.v4;
import net.vz;
import net.xn;
import net.z2;
import net.zc;
import net.zg;
import net.zl;
import net.zn;
import net.zr;
import net.zu;
import net.cr.s;
import net.h.d;
import net.m.a;
import net.m.e;
import net.m.qo;
import net.m.qp;
import net.m.t;
import net.m.x;
import net.n0.ks;
import net.n0.y;
import net.n0.yi;
import net.ne.l;
import net.ni.q;
import net.ni.sg;
import net.ni.sl;
import net.nl.z1;
import net.nm.b;
import net.nm.i;
import net.nm.w;
import net.nn.j;
import net.v.c;
import net.v.n;
import net.v.u;
import net.yp.v;
import net.yv.r;
import net.yy.f;
import net.yz.ai;
import net.yz.aq;
import net.yz.k;
import net.yz.m;
import net.z.tf;
import net.z.tn;
import net.z.tu;
import net.z.w7;
import net.z.wn;
import net.z.wu;

public class g extends f {
   public final v x3;
   private final u xk;
   private final c xq;
   private int xM = 0;
   private double xt;
   private double xH;
   private double xa;
   private float xo;
   private float xJ;
   private boolean xV;
   private boolean xd;
   private boolean xp;
   private int xY;
   private boolean xO;
   private String xl;
   public m xD;
   protected j xh;
   protected int xG;
   public int x1;
   public float x2;
   public float xs;
   public float x_;
   public float xR;
   private int x6;
   private float xX;
   public float xP;
   public float xZ;
   private boolean x4;
   private k xc;
   private boolean x7;
   private boolean x9 = true;
   private int xy;
   private boolean xu;
   private float xg;
   private float x5;

   public g(j var1, r var2, v var3, u var4, c var5) {
      super(var2, var3.R());
      this.x3 = var3;
      this.xk = var4;
      this.xq = var5;
      this.xh = var1;
      this.y = 0;
   }

   public boolean H(net.yz.z var1, float var2) {
      return false;
   }

   public void d(float var1) {
   }

   public boolean E(l var1, boolean var2) {
      if(!super.E(var1, var2)) {
         return false;
      } else {
         if(var1 instanceof w) {
            this.xh.n().g((d)(new net.h.r(this, (w)var1)));
         }

         if(var1 instanceof b) {
            this.hq = var1.hN;
            this.hN = var1.hN;
            this.A(var1.hN);
         }

         return true;
      }
   }

   public void O() {
      super.O();
      this.x7 = false;
   }

   public net.u.r r(float var1) {
      return z(this.V, this.hN);
   }

   public void A() {
      if(this.hl.o(new net.u.j(this.b, 0.0D, this.hr))) {
         zn var1 = new zn();
         _x.m(var1);
         super.A();
         if(this.M()) {
            this.x3.L((net.n2.k)(new qo.q(this.hN, this.V, this.k)));
            this.x3.L((net.n2.k)(new x(this.XG, this.XK, this.xD.d, this.xD.l)));
            l var2 = this.o();
            if(var2 != this && var2.V()) {
               this.x3.L((net.n2.k)(new t(var2)));
            }
         } else {
            this.Zg();
            if(!gn.Q.j.d(vz.class).v()) {
               this.hN = this.xg;
               this.V = this.x5;
            }
         }
      }

   }

   private void Zg() {
      if(!gn.Q.j.d(vz.class).v()) {
         z2 var1 = new z2(this.xh.sf.b, this.i().u, this.xh.sf.hr, this.xh.sf.hN, this.xh.sf.V, this.Q(), this.xh.sf.k);
         _x.m(var1);
         zg var2 = new zg(this.hN, this.V, this.k, this.b, this.hS, this.hr);
         _x.m(var2);
         zu var3 = new zu(this.hN, this.V);
         if(!var2.t()) {
            this.xg = this.hN;
            this.x5 = this.V;
            this.hN = var2.x();
            this.V = var2.p();
            boolean var4 = this.B();
            if(var4 != this.xp) {
               this.x3.L((net.n2.k)(new e(this, e.p.START_SPRINTING)));
               this.xp = var4;
            }

            boolean var5 = this.Q();
            if(var5 != this.xd) {
               this.x3.L((net.n2.k)(new e(this, e.p.START_SNEAKING)));
               this.xd = var5;
            }

            if(this.Fo()) {
               float var6 = gn.d;
               float var7 = gn.i;
               net.u.e var8 = this.i();
               double var9 = this.b - this.xt;
               double var11 = var8.u - this.xH;
               double var13 = this.hr - this.xa;
               double var15 = (double)(this.hN - var6);
               double var17 = (double)(this.V - var7);
               boolean var19 = var2.I();
               ++this.xY;
               boolean var20 = var9 * var9 + var11 * var11 + var13 * var13 > 9.0E-4D || this.xY >= 20;
               boolean var21 = var15 != 0.0D || var17 != 0.0D;
               if(!gn.Q.j.d(vz.class).v()) {
                  if(this.M()) {
                     this.x3.L((net.n2.k)(new qo.l(this.hf, -999.0D, this.J, this.hN, this.V, this.k)));
                     var20 = false;
                  } else {
                     this.x3.L((net.n2.k)(new qo.l(this.b, var8.u, this.hr, this.hN, this.V, var19)));
                  }
               }

               this.xt = this.b;
               this.xH = var8.u;
               this.xa = this.hr;
               this.xY = 0;
               this.xo = gn.d;
               this.xJ = gn.i;
               this.xV = this.k;
               this.x9 = this.xh.T.i6;
            }

            z2 var22 = new z2();
            _x.m(var22);
            _x.m(var3);
         }
      }
   }

   @Nullable
   public i O(boolean var1) {
      net.m.m var2 = net.m.m.DROP_ALL_ITEMS;
      this.x3.L((net.n2.k)(new net.m.m(var2, net.u.j.V, aq.DOWN)));
      return null;
   }

   protected ks b(i var1) {
      return ks.a;
   }

   public void f(String var1) {
      zc var2 = new zc(var1);
      _x.m(var2);
      if(!var2.t()) {
         this.x3.L((net.n2.k)(new net.m.v(var2.p())));
      }

   }

   public void N(k var1) {
      super.N(var1);
      this.x3.L((net.n2.k)(new net.m.i(var1)));
   }

   public void D() {
      this.x3.L((net.n2.k)(new a(a.g.PERFORM_RESPAWN)));
   }

   protected void I(net.yz.z var1, float var2) {
      if(!this.w(var1)) {
         this.u(this.h() - var2);
      }

   }

   public void x() {
      this.x3.L((net.n2.k)(new net.m.f(this.aG.S)));
      this.ZW();
   }

   public void ZW() {
      this.a8.F(ks.a);
      super.x();
      this.xh.s((tu)null);
   }

   public void K(float var1) {
      if(this.xO) {
         float var2 = this.h() - var1;
         if(var2 <= 0.0F) {
            this.u(var1);
            if(var2 < 0.0F) {
               this.I = this.AD / 2;
            }
         } else {
            this.A_ = var2;
            this.u(this.h());
            this.I = this.AD;
            this.I(net.yz.z.P, var2);
            this.Ax = 10;
            this.Xl = this.Ax;
         }
      } else {
         this.u(var1);
         this.xO = true;
      }

   }

   public void m(n var1, int var2) {
      if(var1.w) {
         super.m(var1, var2);
      }

   }

   public void m() {
      this.x3.L((net.n2.k)(new net.m.c(this.a6)));
   }

   public boolean VV() {
      return true;
   }

   protected void ZJ() {
      this.x3.L((net.n2.k)(new e(this, e.p.START_RIDING_JUMP, net.u.t.M(this.i() * 100.0F))));
   }

   public void j() {
      this.x3.L((net.n2.k)(new e(this, e.p.OPEN_INVENTORY)));
   }

   public void m(String var1) {
      this.xl = var1;
   }

   public String e() {
      return this.xl;
   }

   public u q() {
      return this.xk;
   }

   public c m() {
      return this.xq;
   }

   public void l(s var1) {
      if(this.xq.s(var1)) {
         this.xq.b(var1);
         this.x3.L((net.n2.k)(new qp(var1)));
      }

   }

   public int f() {
      return this.xM;
   }

   public void B(int var1) {
      this.xM = var1;
   }

   public void g(net.cb.t var1, boolean var2) {
      this.xh.y.J(var1, false);
   }

   protected boolean c(double var1, double var3, double var5) {
      zr var7 = new zr();
      _x.m(var7);
      if(var7.t()) {
         return false;
      } else if(!gn.Q.j.d(v4.class).v() && (!gn.Q.j.d(s_.class).v() || !s_.d.Q()) && !gn.Q.j.d(vz.class).v()) {
         if(this.r) {
            return false;
         } else {
            net.u.j var8 = new net.u.j(var1, var3, var5);
            double var9 = var1 - (double)var8.t();
            double var11 = var5 - (double)var8.y();
            if(!this.Z(var8)) {
               boolean var13 = true;
               double var14 = 9999.0D;
               if(this.Z(var8.H()) && var9 < var14) {
                  var14 = var9;
                  var13 = false;
               }

               if(this.Z(var8.g()) && 1.0D - var9 < var14) {
                  var14 = 1.0D - var9;
                  var13 = true;
               }

               if(this.Z(var8.D()) && var11 < var14) {
                  var14 = var11;
                  var13 = true;
               }

               if(this.Z(var8.d()) && 1.0D - var11 < var14) {
                  var14 = 1.0D - var11;
                  var13 = true;
               }

               float var10000 = 0.1F;
               this.hf = -0.10000000149011612D;
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean Z(net.u.j var1) {
      return !this.hl.Z(var1).i() && !this.hl.Z(var1.h()).i();
   }

   public void j(boolean var1) {
      super.j(var1);
      this.x1 = 0;
   }

   public void U(float var1, int var2, int var3) {
      this.aP = var1;
      this.ac = var2;
      this.aX = var3;
   }

   public void r(net.cb.t var1) {
      this.xh.y.I().G(var1);
   }

   public boolean n(int var1, String var2) {
      return var1 <= this.f();
   }

   public void R(byte var1) {
      if(var1 >= 24 && var1 <= 28) {
         this.B(var1 - 24);
      } else {
         super.R(var1);
      }

   }

   public net.u.j z() {
      return new net.u.j(this.b + 0.5D, this.hS + 0.5D, this.hr + 0.5D);
   }

   public void I(net.yz.a var1, float var2, float var3) {
      this.hl.m(this.b, this.hS, this.hr, var1, this.E(), var2, var3, false);
   }

   public boolean H7() {
      return true;
   }

   public void T(k var1) {
      ks var2 = this.o(var1);
      if(!var2.B() && !this.F()) {
         super.T(var1);
         this.x4 = true;
         this.xc = var1;
      }

   }

   public boolean F() {
      return this.x4;
   }

   public void F() {
      super.F();
      this.x4 = false;
   }

   public k H() {
      return this.xc;
   }

   public void O(net.k.v var1) {
      super.O(var1);
      if(AT.equals(var1)) {
         boolean var2 = (((Byte)this.G.a(AT)).byteValue() & 1) > 0;
         k var3 = (((Byte)this.G.a(AT)).byteValue() & 2) > 0?k.OFF_HAND:k.MAIN_HAND;
         if(!this.x4) {
            this.T(var3);
         } else if(this.x4) {
            this.F();
         }
      }

      if(hy.equals(var1) && this.I() && !this.xu) {
         this.xh.n().g((d)(new net.h.b(this)));
      }

   }

   public boolean FT() {
      l var1 = this.D();
      return this.M() && var1 instanceof net.ne.t && ((net.ne.t)var1).D();
   }

   public float i() {
      return this.xX;
   }

   public void u(sg var1) {
      this.xh.s(new net.c2.g(var1));
   }

   public void X(net.ni.w var1) {
      this.xh.s(new net.c2.b(var1));
   }

   public void v(q var1) {
      this.xh.s(new tn(var1));
   }

   public void J(sl var1) {
      this.xh.s(new net.c2.d(var1));
   }

   public void Q(ks var1, k var2) {
      y var3 = var1.Z();
      if(var3 == net.nb.j.WZ) {
         this.xh.s(new tf(this, var1, true));
      }

   }

   public void n(z1 var1) {
      String var2 = var1 instanceof net.yv.z?((net.yv.z)var1).H():"minecraft:container";
      "minecraft:chest".equals(var2);
      "minecraft:hopper".equals(var2);
      "minecraft:furnace".equals(var2);
      "minecraft:brewing_stand".equals(var2);
      "minecraft:beacon".equals(var2);
      "minecraft:dispenser".equals(var2);
      "minecraft:dropper".equals(var2);
      "minecraft:shulker_box".equals(var2);
      this.xh.s(new net.c2.m(this.a8, var1));
   }

   public void F(net.yn.j var1, z1 var2) {
      this.xh.s(new net.c2.i(this.a8, var2, var1));
   }

   public void x(net.yv.z var1) {
      String var2 = var1.H();
      if("minecraft:crafting_table".equals(var2)) {
         this.xh.s(new net.c2.u(this.a8, this.hl));
      } else if("minecraft:enchanting_table".equals(var2)) {
         this.xh.s(new wu(this.a8, this.hl, var1));
      } else if("minecraft:anvil".equals(var2)) {
         this.xh.s(new wn(this.a8, this.hl));
      }

   }

   public void g(net.ne.m var1) {
      this.xh.s(new w7(this.a8, var1, this.hl));
   }

   public void p(l var1) {
      this.xh.sv.Z(var1, ai.CRIT);
   }

   public void y(l var1) {
      this.xh.sv.Z(var1, ai.CRIT_MAGIC);
   }

   public boolean Q() {
      boolean var1 = this.xD != null && this.xD.l;
      return !this.as;
   }

   public void r() {
      super.r();
      if(this.Fo()) {
         this.XG = m.P;
         this.XK = m.n;
         this.XL = this.xD.d;
         this.x_ = this.x2;
         this.xR = this.xs;
         this.xs = (float)((double)this.xs + (double)(this.V - this.xs) * 0.5D);
         this.x2 = (float)((double)this.x2 + (double)(this.hN - this.x2) * 0.5D);
      }

   }

   protected boolean Fo() {
      return this.xh.A() == this;
   }

   public void d() {
      net.y9.l.S();
      ++this.x1;
      if(this.xG > 0) {
         --this.xG;
      }

      this.xZ = this.xP;
      if(this.n) {
         if(this.xh.s5 != null && !this.xh.s5.b()) {
            if(this.xh.s5 instanceof net.c2.n) {
               this.x();
            }

            this.xh.s((tu)null);
         }

         if(Float.compare(this.xP, 0.0F) == 0) {
            this.xh.n().g((d)net.h.a.v(net.nb.l.B, this.p.nextFloat() * 0.4F + 0.8F));
         }

         this.xP += 0.0125F;
         if(this.xP >= 1.0F) {
            this.xP = 1.0F;
         }

         this.n = false;
         net.u.d.h(new net.u.d[5]);
      }

      label235: {
         if(this.J(net.nb.b.f) && this.b((net.n_.f)net.nb.b.f).S() > 60) {
            this.xP += 0.006666667F;
            if(Float.compare(this.xP, 1.0F) <= 0) {
               break label235;
            }

            this.xP = 1.0F;
         }

         if(this.xP > 0.0F) {
            this.xP -= 0.05F;
         }

         if(Float.compare(this.xP, 0.0F) < 0) {
            this.xP = 0.0F;
         }
      }

      if(this.hH > 0) {
         --this.hH;
      }

      boolean var2 = this.xD.d;
      boolean var3 = this.xD.l;
      boolean var4 = Float.compare(m.n, 0.8F) >= 0;
      this.xD.B();
      this.xh.K().l(this.xD);
      if(this.F() && !this.M()) {
         m.P *= gn.Q.j.d(ss.class).v()?ss.q.e() / 100.0F:0.2F;
         m.n *= gn.Q.j.d(ss.class).v()?ss.q.e() / 100.0F:0.2F;
         this.xG = 0;
      }

      boolean var5 = false;
      if(this.xy > 0) {
         --this.xy;
         var5 = true;
         this.xD.d = true;
      }

      net.u.e var6 = this.i();
      this.c(this.b - (double)this.h9 * 0.35D, var6.u + 0.5D, this.hr + (double)this.h9 * 0.35D);
      this.c(this.b - (double)this.h9 * 0.35D, var6.u + 0.5D, this.hr - (double)this.h9 * 0.35D);
      this.c(this.b + (double)this.h9 * 0.35D, var6.u + 0.5D, this.hr - (double)this.h9 * 0.35D);
      this.c(this.b + (double)this.h9 * 0.35D, var6.u + 0.5D, this.hr + (double)this.h9 * 0.35D);
      boolean var7 = Float.compare((float)this.e().Z(), 6.0F) > 0 || this.a6.P;
      if(this.k && !var3 && Float.compare(m.n, 0.8F) >= 0 && !this.B() && !this.F() && !this.J(net.nb.b.T)) {
         if(this.xG <= 0 && !this.xh.T.iE.o()) {
            this.xG = 7;
         }

         this.j(true);
      }

      if(!this.B() && Float.compare(m.n, 0.8F) >= 0 && !this.F() && !this.J(net.nb.b.T) && this.xh.T.iE.o()) {
         this.j(true);
      }

      if(this.B()) {
         if(Float.compare(m.n, 0.8F) < 0 || this.t) {
            this.j(false);
         }
      }

      if(this.a6.P) {
         label1188: {
            if(this.xh.sE.t()) {
               if(this.a6.n) {
                  break label1188;
               }

               this.a6.n = true;
               this.m();
            }

            if(!var2 && this.xD.d) {
               if(this.aR == 0) {
                  this.aR = 7;
               }

               this.a6.n = !this.a6.n;
               this.m();
               this.aR = 0;
            }
         }
      }

      if(this.xD.d && !var2 && !this.k && Double.compare(this.K, 0.0D) < 0 && !this.I() && !this.a6.n) {
         ks var8 = this.U(net.nl.z2.CHEST);
         if(var8.Z() == net.nb.j.SB && yi.C(var8)) {
            this.x3.L((net.n2.k)(new e(this, e.p.START_FALL_FLYING)));
         }
      }

      this.xu = this.I();
      if(this.a6.n && this.Fo()) {
         if(this.xD.l) {
            m.P = (float)((double)m.P / 0.3D);
            m.n = (float)((double)m.n / 0.3D);
            this.K -= (double)(this.a6.m() * 3.0F);
         }

         if(this.xD.d) {
            this.K += (double)(this.a6.m() * 3.0F);
         }
      }

      if(this.FT()) {
         net.ne.t var10 = (net.ne.t)this.D();
         if(this.x6 < 0) {
            ++this.x6;
            if(this.x6 == 0) {
               this.xX = 0.0F;
            }
         }

         if(var2 && !this.xD.d) {
            this.x6 = -10;
            var10.m(net.u.t.M(this.i() * 100.0F));
            this.ZJ();
         }

         if(!var2 && this.xD.d) {
            this.x6 = 0;
            this.xX = 0.0F;
         }

         if(var2) {
            ++this.x6;
            if(this.x6 < 10) {
               this.xX = (float)this.x6 * 0.1F;
            }

            this.xX = 0.8F + 2.0F / (float)(this.x6 - 9) * 0.1F;
         }
      }

      this.xX = 0.0F;
      super.d();
      if(this.k && this.a6.n && !this.xh.sE.t()) {
         this.a6.n = false;
         this.m();
      }

   }

   public void C() {
      super.C();
      this.x7 = false;
      if(this.D() instanceof b) {
         b var1 = (b)this.D();
         var1.U(this.xD.c, this.xD.O, this.xD.g, this.xD.s);
         this.x7 |= this.xD.c || this.xD.O || this.xD.g || this.xD.s;
      }

   }

   public boolean FY() {
      return this.x7;
   }

   @Nullable
   public net.n_.i t(@Nullable net.n_.f var1) {
      if(var1 == net.nb.b.f) {
         this.xZ = 0.0F;
         this.xP = 0.0F;
      }

      return super.t(var1);
   }

   public void N(net.ne.f var1, double var2, double var4, double var6) {
      zl var8 = new zl(var2, var4, var6);
      _x.m(var8);
      double var9 = this.b;
      double var11 = this.hr;
      var2 = var8.V();
      var4 = var8.c();
      var6 = var8.b();
      super.N(var1, var2, var4, var6);
      this.h((float)(this.b - var9), (float)(this.hr - var11));
   }

   public boolean FG() {
      return this.x9;
   }

   protected void h(float var1, float var2) {
      if(this.FG() && this.xy <= 0 && this.k && !this.Q() && !this.M()) {
         net.u.x var3 = this.xD.j();
         if(var3.E != 0.0F || var3.I != 0.0F) {
            net.u.r var4 = new net.u.r(this.b, this.i().u, this.hr);
            double var5 = this.b + (double)var1;
            double var7 = this.hr + (double)var2;
            net.u.r var9 = new net.u.r(var5, this.i().u, var7);
            net.u.r var10 = new net.u.r((double)var1, 0.0D, (double)var2);
            float var11 = this.q();
            float var12 = (float)var10.G();
            if(var12 <= 0.001F) {
               float var13 = var11 * var3.E;
               float var14 = var11 * var3.I;
               float var15 = net.u.t.A(this.hN * 0.017453292F);
               float var16 = net.u.t.m(this.hN * 0.017453292F);
               var10 = new net.u.r((double)(var13 * var16 - var14 * var15), var10.H, (double)(var14 * var16 + var13 * var15));
               var12 = (float)var10.G();
               if(var12 <= 0.001F) {
                  return;
               }
            }

            float var45 = (float)net.u.t.Y((double)var12);
            net.u.r var46 = var10.T((double)var45);
            net.u.r var47 = this.y();
            float var48 = (float)(var47.p * var46.p + var47.a * var46.a);
            if(var48 >= -0.15F) {
               net.u.j var17 = new net.u.j(this.b, this.i().c, this.hr);
               net.yw.n var18 = this.hl.Z(var17);
               if(var18.D(this.hl, var17) == null) {
                  var17 = var17.h();
                  net.yw.n var19 = this.hl.Z(var17);
                  if(var19.D(this.hl, var17) == null) {
                     float var10000 = 7.0F;
                     float var21 = 1.2F;
                     if(this.J(net.nb.b.q)) {
                        var21 += (float)(this.b((net.n_.f)net.nb.b.q).d() + 1) * 0.75F;
                     }

                     float var22 = Math.max(var11 * 7.0F, 1.0F / var45);
                     net.u.r var23 = var9.v(var46.T((double)var22));
                     float var24 = this.h9;
                     float var25 = this.m;
                     net.u.e var26 = (new net.u.e(var4, var23.s(0.0D, (double)var25, 0.0D))).f((double)var24, 0.0D, (double)var24);
                     net.u.r var27 = var4.s(0.0D, 0.5099999904632568D, 0.0D);
                     var23 = var23.s(0.0D, 0.5099999904632568D, 0.0D);
                     net.u.r var28 = var46.M(new net.u.r(0.0D, 1.0D, 0.0D));
                     net.u.r var29 = var28.T((double)(var24 * 0.5F));
                     net.u.r var30 = var27.q(var29);
                     net.u.r var31 = var23.q(var29);
                     net.u.r var32 = var27.v(var29);
                     net.u.r var33 = var23.v(var29);
                     List var34 = this.hl.h(this, var26);
                     if(!var34.isEmpty()) {
                        ;
                     }

                     float var35 = Float.MIN_VALUE;

                     for(net.u.e var37 : var34) {
                        if(var37.O(var30, var31) || var37.O(var32, var33)) {
                           var35 = (float)var37.c;
                           net.u.r var38 = var37.z();
                           new net.u.j(var38);
                           byte var40 = 1;
                           float var53;
                           int var51 = (var53 = (float)var40 - var21) == 0.0F?0:(var53 < 0.0F?-1:1);
                           break;
                        }
                     }

                     float var54;
                     int var52 = (var54 = var35 - Float.MIN_VALUE) == 0.0F?0:(var54 < 0.0F?-1:1);
                  }
               }
            }
         }
      }

   }

   public boolean Fy() {
      return this.xh.sf.h() || this.xh.sf.p();
   }

   public boolean FD() {
      return this.Q()?false:m.n != 0.0F || m.P != 0.0F;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
