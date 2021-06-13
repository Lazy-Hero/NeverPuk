package net.nm;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nm.d;
import net.nm.g;
import net.nm.m;
import net.nm.p;
import net.nm.q;
import net.nm.r;
import net.nm.t;
import net.y9.g3;
import net.y9.gs;
import net.yv.y;
import net.yz.aq;
import net.yz.m_;

public abstract class w extends net.ne.l implements y {
   private static final net.k.v r7 = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v rq = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v rW = net.k.n.q(w.class, net.k.y.r);
   private static final net.k.v rd = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v rt = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v rZ = net.k.n.q(w.class, net.k.y.f);
   private boolean r2;
   private static final int[][][] rH = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int rR;
   private double r9;
   private double rn;
   private double rF;
   private double re;
   private double rp;
   private double rG;
   private double rA;
   private double rc;

   public w(net.yv.r var1) {
      super(var1);
      this.a = true;
      this.S(0.98F, 0.7F);
   }

   public static w j(net.yv.r var0, double var1, double var3, double var5, w.h var7) {
      switch(null.G[var7.ordinal()]) {
      case 1:
         return new t(var0, var1, var3, var5);
      case 2:
         return new g(var0, var1, var3, var5);
      case 3:
         return new m(var0, var1, var3, var5);
      case 4:
         return new d(var0, var1, var3, var5);
      case 5:
         return new r(var0, var1, var3, var5);
      case 6:
         return new p(var0, var1, var3, var5);
      default:
         return new q(var0, var1, var3, var5);
      }
   }

   protected boolean k() {
      return false;
   }

   protected void g() {
      this.G.r(r7, Integer.valueOf(0));
      this.G.r(rq, Integer.valueOf(1));
      this.G.r(rW, Float.valueOf(0.0F));
      this.G.r(rd, Integer.valueOf(0));
      this.G.r(rt, Integer.valueOf(6));
      this.G.r(rZ, Boolean.valueOf(false));
   }

   @Nullable
   public net.u.e a(net.ne.l var1) {
      return var1.b()?var1.i():null;
   }

   @Nullable
   public net.u.e F() {
      return null;
   }

   public boolean b() {
      return true;
   }

   public w(net.yv.r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      this.h = var2;
      this.h6 = var4;
      this.l = var6;
   }

   public double e() {
      return 0.0D;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(!this.hl.x && !this.Z) {
         if(this.w(var1)) {
            return false;
         } else {
            this.L(-this.T());
            this.Q(10);
            this.E();
            this.W(this.O() + var2 * 10.0F);
            boolean var3 = var1.v() instanceof net.r.r && ((net.r.r)var1.v()).a6.V;
            if(this.O() > 40.0F) {
               this.Y();
               if(!this.H()) {
                  this.B();
               } else {
                  this.n(var1);
               }
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public void n(net.yz.z var1) {
      this.B();
      if(this.hl.N().b("doEntityDrops")) {
         ks var2 = new ks(net.nb.j.Y2, 1);
         if(this.H()) {
            var2.m(this.X());
         }

         this.O(var2, 0.0F);
      }

   }

   public void I() {
      this.L(-this.T());
      this.Q(10);
      this.W(this.O() + this.O() * 10.0F);
   }

   public boolean w() {
      return !this.Z;
   }

   public aq C() {
      return this.r2?this.V().f().R():this.V().R();
   }

   public void A() {
      if(this.P() > 0) {
         this.Q(this.P() - 1);
      }

      if(this.O() > 0.0F) {
         this.W(this.O() - 1.0F);
      }

      if(this.hS < -64.0D) {
         this.R();
      }

      if(!this.hl.x && this.hl instanceof net.yv.d) {
         this.hl.M.K("portal");
         net.nx.f var1 = this.hl.v();
         int var2 = this.B();
         if(this.n) {
            if(var1.d()) {
               if(!this.M() && this.h_++ >= var2) {
                  this.h_ = var2;
                  this.hH = this.S();
                  byte var3;
                  if(this.hl.F.L().M() == -1) {
                     var3 = 0;
                  } else {
                     var3 = -1;
                  }

                  this.V(var3);
               }

               this.n = false;
            }
         } else {
            if(this.h_ > 0) {
               this.h_ -= 4;
            }

            if(this.h_ < 0) {
               this.h_ = 0;
            }
         }

         if(this.hH > 0) {
            --this.hH;
         }

         this.hl.M.N();
      }

      if(this.hl.x) {
         if(this.rR > 0) {
            double var15 = this.b + (this.r9 - this.b) / (double)this.rR;
            double var18 = this.hS + (this.rn - this.hS) / (double)this.rR;
            double var5 = this.hr + (this.rF - this.hr) / (double)this.rR;
            double var7 = net.u.t.p(this.re - (double)this.hN);
            this.hN = (float)((double)this.hN + var7 / (double)this.rR);
            this.V = (float)((double)this.V + (this.rp - (double)this.V) / (double)this.rR);
            --this.rR;
            this.t(var15, var18, var5);
            this.r(this.hN, this.V);
         } else {
            this.t(this.b, this.hS, this.hr);
            this.r(this.hN, this.V);
         }
      } else {
         this.h = this.b;
         this.h6 = this.hS;
         this.l = this.hr;
         if(!this.j()) {
            this.K -= 0.03999999910593033D;
         }

         int var16 = net.u.t.L(this.b);
         int var17 = net.u.t.L(this.hS);
         int var19 = net.u.t.L(this.hr);
         if(g3.g(this.hl, new net.u.j(var16, var17 - 1, var19))) {
            --var17;
         }

         net.u.j var4 = new net.u.j(var16, var17, var19);
         net.yw.n var20 = this.hl.Z(var4);
         if(g3.B(var20)) {
            this.v(var4, var20);
            if(var20.Q() == net.nb.f.j) {
               this.K(var16, var17, var19, ((Boolean)var20.i(gs.u)).booleanValue());
            }
         } else {
            this.o();
         }

         this.P();
         this.V = 0.0F;
         double var6 = this.h - this.b;
         double var8 = this.l - this.hr;
         if(var6 * var6 + var8 * var8 > 0.001D) {
            this.hN = (float)(net.u.t.V(var8, var6) * 180.0D / 3.141592653589793D);
            if(this.r2) {
               this.hN += 180.0F;
            }
         }

         double var10 = (double)net.u.t.k(this.hN - this.hq);
         if(var10 < -170.0D || var10 >= 170.0D) {
            this.hN += 180.0F;
            this.r2 = !this.r2;
         }

         this.r(this.hN, this.V);
         if(this.R() == w.h.RIDEABLE && this.hf * this.hf + this.J * this.J > 0.01D) {
            List var21 = this.hl.S(this, this.i().f(0.20000000298023224D, 0.0D, 0.20000000298023224D), net.yz.q.K(this));
            if(!var21.isEmpty()) {
               for(int var22 = 0; var22 < var21.size(); ++var22) {
                  net.ne.l var14 = (net.ne.l)var21.get(var22);
                  if(!(var14 instanceof net.r.r) && !(var14 instanceof net.nk.b) && !(var14 instanceof w) && !this.t() && !var14.M()) {
                     var14.W(this);
                  } else {
                     var14.W(this);
                  }
               }
            }
         } else {
            for(net.ne.l var13 : this.hl.u(this, this.i().f(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
               if(!this.m(var13) && var13.b() && var13 instanceof w) {
                  var13.W(this);
               }
            }
         }

         this.r();
      }

   }

   protected double y() {
      return 0.4D;
   }

   public void K(int var1, int var2, int var3, boolean var4) {
   }

   protected void o() {
      double var1 = this.y();
      this.hf = net.u.t.F(this.hf, -var1, var1);
      this.J = net.u.t.F(this.J, -var1, var1);
      if(this.k) {
         this.hf *= 0.5D;
         this.K *= 0.5D;
         this.J *= 0.5D;
      }

      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      if(!this.k) {
         this.hf *= 0.949999988079071D;
         this.K *= 0.949999988079071D;
         this.J *= 0.949999988079071D;
      }

   }

   protected void v(net.u.j var1, net.yw.n var2) {
      this.hI = 0.0F;
      net.u.r var4 = this.G(this.b, this.hS, this.hr);
      w.h.I;
      this.hS = (double)var1.h();
      boolean var5 = false;
      boolean var6 = false;
      g3 var7 = (g3)var2.Q();
      if(var7 == net.nb.f.uR) {
         var5 = ((Boolean)var2.i(gs.u)).booleanValue();
         var6 = !var5;
      }

      double var10000 = 0.0078125D;
      g3.v var10 = (g3.v)var2.i(var7.J());
      switch(null.D[var10.ordinal()]) {
      case 1:
         this.hf -= 0.0078125D;
         ++this.hS;
         net.u.d.h(new net.u.d[5]);
      case 2:
         this.hf += 0.0078125D;
         ++this.hS;
      case 3:
         this.J += 0.0078125D;
         ++this.hS;
      case 4:
         this.J -= 0.0078125D;
         ++this.hS;
      default:
         int[][] var11 = rH[var10.a()];
         double var12 = (double)(var11[1][0] - var11[0][0]);
         double var14 = (double)(var11[1][2] - var11[0][2]);
         double var16 = Math.sqrt(var12 * var12 + var14 * var14);
         double var18 = this.hf * var12 + this.J * var14;
         if(var18 < 0.0D) {
            var12 = -var12;
            var14 = -var14;
         }

         double var20 = Math.sqrt(this.hf * this.hf + this.J * this.J);
         if(Double.compare(var20, 2.0D) > 0) {
            var20 = 2.0D;
         }

         this.hf = var20 * var12 / var16;
         this.J = var20 * var14 / var16;
         net.ne.l var22 = this.H().isEmpty()?null:(net.ne.l)this.H().get(0);
         if(var22 instanceof net.ne.a) {
            double var23 = (double)((net.ne.a)var22).XK;
            if(Double.compare(var23, 0.0D) > 0) {
               double var25 = -Math.sin((double)(var22.hN * 0.017453292F));
               double var27 = Math.cos((double)(var22.hN * 0.017453292F));
               double var29 = this.hf * this.hf + this.J * this.J;
               if(Double.compare(var29, 0.01D) < 0) {
                  this.hf += var25 * 0.1D;
                  this.J += var27 * 0.1D;
                  var6 = false;
               }
            }
         }

         double var53 = (double)var1.t() + 0.5D + (double)var11[0][0] * 0.5D;
         double var54 = (double)var1.y() + 0.5D + (double)var11[0][2] * 0.5D;
         double var55 = (double)var1.t() + 0.5D + (double)var11[1][0] * 0.5D;
         double var56 = (double)var1.y() + 0.5D + (double)var11[1][2] * 0.5D;
         var12 = var55 - var53;
         var14 = var56 - var54;
         if(Double.compare(var12, 0.0D) == 0) {
            this.b = (double)var1.t() + 0.5D;
            double var31 = this.hr - (double)var1.y();
         }

         if(var14 == 0.0D) {
            this.hr = (double)var1.y() + 0.5D;
            double var57 = this.b - (double)var1.t();
         }

         double var33 = this.b - var53;
         double var35 = this.hr - var54;
         double var58 = (var33 * var12 + var35 * var14) * 2.0D;
         this.b = var53 + var12 * var58;
         this.hr = var54 + var14 * var58;
         this.t(this.b, this.hS, this.hr);
         var33 = this.hf;
         var35 = this.J;
         if(this.t()) {
            var33 *= 0.75D;
            var35 *= 0.75D;
         }

         double var37 = this.y();
         var33 = net.u.t.F(var33, -var37, var37);
         var35 = net.u.t.F(var35, -var37, var37);
         this.N(net.ne.f.SELF, var33, 0.0D, var35);
         if(var11[0][1] != 0 && net.u.t.L(this.b) - var1.t() == var11[0][0] && net.u.t.L(this.hr) - var1.y() == var11[0][2]) {
            this.t(this.b, this.hS + (double)var11[0][1], this.hr);
         }

         if(var11[1][1] != 0 && net.u.t.L(this.b) - var1.t() == var11[1][0] && net.u.t.L(this.hr) - var1.y() == var11[1][2]) {
            this.t(this.b, this.hS + (double)var11[1][1], this.hr);
         }

         this.D();
         net.u.r var39 = this.G(this.b, this.hS, this.hr);
         if(var39 != null && var4 != null) {
            double var40 = (var4.H - var39.H) * 0.05D;
            var20 = Math.sqrt(this.hf * this.hf + this.J * this.J);
            if(var20 > 0.0D) {
               this.hf = this.hf / var20 * (var20 + var40);
               this.J = this.J / var20 * (var20 + var40);
            }

            this.t(this.b, var39.H, this.hr);
         }

         int var63 = net.u.t.L(this.b);
         int var41 = net.u.t.L(this.hr);
         if(var63 != var1.t() || var41 != var1.y()) {
            var20 = Math.sqrt(this.hf * this.hf + this.J * this.J);
            this.hf = var20 * (double)(var63 - var1.t());
            this.J = var20 * (double)(var41 - var1.y());
         }

      }
   }

   protected void D() {
      if(this.t()) {
         this.hf *= 0.996999979019165D;
         this.K *= 0.0D;
         this.J *= 0.996999979019165D;
      } else {
         this.hf *= 0.9599999785423279D;
         this.K *= 0.0D;
         this.J *= 0.9599999785423279D;
      }

   }

   public void t(double var1, double var3, double var5) {
      this.b = var1;
      this.hS = var3;
      this.hr = var5;
      float var7 = this.h9 / 2.0F;
      float var8 = this.m;
      this.g(new net.u.e(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   @Nullable
   public net.u.r a(double var1, double var3, double var5, double var7) {
      int var9 = net.u.t.L(var1);
      int var10 = net.u.t.L(var3);
      int var11 = net.u.t.L(var5);
      if(g3.g(this.hl, new net.u.j(var9, var10 - 1, var11))) {
         --var10;
      }

      net.yw.n var12 = this.hl.Z(new net.u.j(var9, var10, var11));
      if(g3.B(var12)) {
         g3.v var13 = (g3.v)var12.i(((g3)var12.Q()).J());
         var3 = (double)var10;
         if(var13.i()) {
            var3 = (double)(var10 + 1);
         }

         int[][] var14 = rH[var13.a()];
         double var15 = (double)(var14[1][0] - var14[0][0]);
         double var17 = (double)(var14[1][2] - var14[0][2]);
         double var19 = Math.sqrt(var15 * var15 + var17 * var17);
         var15 = var15 / var19;
         var17 = var17 / var19;
         var1 = var1 + var15 * var7;
         var5 = var5 + var17 * var7;
         if(var14[0][1] != 0 && net.u.t.L(var1) - var9 == var14[0][0] && net.u.t.L(var5) - var11 == var14[0][2]) {
            var3 += (double)var14[0][1];
         } else if(var14[1][1] != 0 && net.u.t.L(var1) - var9 == var14[1][0] && net.u.t.L(var5) - var11 == var14[1][2]) {
            var3 += (double)var14[1][1];
         }

         return this.G(var1, var3, var5);
      } else {
         return null;
      }
   }

   @Nullable
   public net.u.r G(double var1, double var3, double var5) {
      int var7 = net.u.t.L(var1);
      int var8 = net.u.t.L(var3);
      int var9 = net.u.t.L(var5);
      if(g3.g(this.hl, new net.u.j(var7, var8 - 1, var9))) {
         --var8;
      }

      net.yw.n var10 = this.hl.Z(new net.u.j(var7, var8, var9));
      if(g3.B(var10)) {
         g3.v var11 = (g3.v)var10.i(((g3)var10.Q()).J());
         int[][] var12 = rH[var11.a()];
         double var13 = (double)var7 + 0.5D + (double)var12[0][0] * 0.5D;
         double var15 = (double)var8 + 0.0625D + (double)var12[0][1] * 0.5D;
         double var17 = (double)var9 + 0.5D + (double)var12[0][2] * 0.5D;
         double var19 = (double)var7 + 0.5D + (double)var12[1][0] * 0.5D;
         double var21 = (double)var8 + 0.0625D + (double)var12[1][1] * 0.5D;
         double var23 = (double)var9 + 0.5D + (double)var12[1][2] * 0.5D;
         double var25 = var19 - var13;
         double var27 = (var21 - var15) * 2.0D;
         double var29 = var23 - var17;
         double var31;
         if(var25 == 0.0D) {
            var31 = var5 - (double)var9;
         } else if(var29 == 0.0D) {
            var31 = var1 - (double)var7;
         } else {
            double var33 = var1 - var13;
            double var35 = var5 - var17;
            var31 = (var33 * var25 + var35 * var29) * 2.0D;
         }

         var1 = var13 + var25 * var31;
         var3 = var15 + var27 * var31;
         var5 = var17 + var29 * var31;
         if(var27 < 0.0D) {
            ++var3;
         }

         if(var27 > 0.0D) {
            var3 += 0.5D;
         }

         return new net.u.r(var1, var3, var5);
      } else {
         return null;
      }
   }

   public net.u.e S() {
      net.u.e var1 = this.i();
      return this.L()?var1.x((double)Math.abs(this.d()) / 16.0D):var1;
   }

   public static void L(net.c0.d var0, Class var1) {
   }

   protected void o(net.nj.f var1) {
      if(var1.i("CustomDisplayTile")) {
         if(var1.K("DisplayTile", 8)) {
            net.y9.l var2 = net.y9.l.d(var1.J("DisplayTile"));
         } else {
            net.y9.l var4 = net.y9.l.I(var1.P("DisplayTile"));
         }

         var1.P("DisplayData");
         this.L(net.nb.f.ou.p());
         this.R(var1.P("DisplayOffset"));
      }

   }

   protected void I(net.nj.f var1) {
      if(this.L()) {
         var1.c("CustomDisplayTile", true);
         net.yw.n var2 = this.N();
         m_ var3 = (m_)net.y9.l.m.t(var2.Q());
         var1.b("DisplayTile", "");
         var1.r("DisplayData", var2.Q().d(var2));
         var1.r("DisplayOffset", this.d());
      }

   }

   public void W(net.ne.l var1) {
      if(!this.hl.x && !var1.r && !this.r && !this.m(var1)) {
         double var2 = var1.b - this.b;
         double var4 = var1.hr - this.hr;
         double var6 = var2 * var2 + var4 * var4;
         if(var6 >= 9.999999747378752E-5D) {
            var6 = (double)net.u.t.R(var6);
            var2 = var2 / var6;
            var4 = var4 / var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 = var2 * var8;
            var4 = var4 * var8;
            var2 = var2 * 0.10000000149011612D;
            var4 = var4 * 0.10000000149011612D;
            var2 = var2 * (double)(1.0F - this.M);
            var4 = var4 * (double)(1.0F - this.M);
            var2 = var2 * 0.5D;
            var4 = var4 * 0.5D;
            if(var1 instanceof w) {
               double var10 = var1.b - this.b;
               double var12 = var1.hr - this.hr;
               net.u.r var14 = (new net.u.r(var10, 0.0D, var12)).I();
               net.u.r var15 = (new net.u.r((double)net.u.t.m(this.hN * 0.017453292F), 0.0D, (double)net.u.t.A(this.hN * 0.017453292F))).I();
               double var16 = Math.abs(var14.d(var15));
               if(var16 < 0.800000011920929D) {
                  return;
               }

               double var18 = var1.hf + this.hf;
               double var20 = var1.J + this.J;
               if(((w)var1).R() == w.h.FURNACE && this.R() != w.h.FURNACE) {
                  this.hf *= 0.20000000298023224D;
                  this.J *= 0.20000000298023224D;
                  this.u(var1.hf - var2, 0.0D, var1.J - var4);
                  var1.hf *= 0.949999988079071D;
                  var1.J *= 0.949999988079071D;
               } else if(((w)var1).R() != w.h.FURNACE && this.R() == w.h.FURNACE) {
                  var1.hf *= 0.20000000298023224D;
                  var1.J *= 0.20000000298023224D;
                  var1.u(this.hf + var2, 0.0D, this.J + var4);
                  this.hf *= 0.949999988079071D;
                  this.J *= 0.949999988079071D;
               } else {
                  var18 = var18 / 2.0D;
                  var20 = var20 / 2.0D;
                  this.hf *= 0.20000000298023224D;
                  this.J *= 0.20000000298023224D;
                  this.u(var18 - var2, 0.0D, var20 - var4);
                  var1.hf *= 0.20000000298023224D;
                  var1.J *= 0.20000000298023224D;
                  var1.u(var18 + var2, 0.0D, var20 + var4);
               }
            } else {
               this.u(-var2, 0.0D, -var4);
               var1.u(var2 / 4.0D, 0.0D, var4 / 4.0D);
            }
         }
      }

   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.r9 = var1;
      this.rn = var3;
      this.rF = var5;
      this.re = (double)var7;
      this.rp = (double)var8;
      this.rR = var9 + 2;
      this.hf = this.rG;
      this.K = this.rA;
      this.J = this.rc;
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      this.rG = this.hf;
      this.rA = this.K;
      this.rc = this.J;
   }

   public void W(float var1) {
      this.G.d(rW, Float.valueOf(var1));
   }

   public float O() {
      return ((Float)this.G.a(rW)).floatValue();
   }

   public void Q(int var1) {
      this.G.d(r7, Integer.valueOf(var1));
   }

   public int P() {
      return ((Integer)this.G.a(r7)).intValue();
   }

   public void L(int var1) {
      this.G.d(rq, Integer.valueOf(var1));
   }

   public int T() {
      return ((Integer)this.G.a(rq)).intValue();
   }

   public abstract w.h R();

   public net.yw.n N() {
      return !this.L()?this.M():net.y9.l.P(((Integer)this.A().a(rd)).intValue());
   }

   public net.yw.n M() {
      return net.nb.f.ou.p();
   }

   public int d() {
      return !this.L()?this.D():((Integer)this.A().a(rt)).intValue();
   }

   public int D() {
      return 6;
   }

   public void L(net.yw.n var1) {
      this.A().d(rd, Integer.valueOf(net.y9.l.m(var1)));
      this.k(true);
   }

   public void R(int var1) {
      this.A().d(rt, Integer.valueOf(var1));
      this.k(true);
   }

   public boolean L() {
      return ((Boolean)this.A().a(rZ)).booleanValue();
   }

   public void k(boolean var1) {
      this.A().d(rZ, Boolean.valueOf(var1));
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum h {
      RIDEABLE,
      CHEST,
      FURNACE,
      TNT,
      SPAWNER,
      HOPPER,
      COMMAND_BLOCK;

      private static final Map S;
      private final int a;
      private final String g;
      private static boolean I;

      private h(int var3, String var4) {
         this.a = var3;
         this.g = var4;
      }

      public int j() {
         return this.a;
      }

      public String A() {
         return this.g;
      }

      public static w.h O(int var0) {
         s();
         w.h var2 = (w.h)S.get(Integer.valueOf(var0));
         return var2 == null?RIDEABLE:var2;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      public static void C(boolean var0) {
         I = var0;
      }

      public static boolean s() {
         return I;
      }

      public static boolean u() {
         boolean var0 = s();
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
