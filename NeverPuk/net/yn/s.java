package net.yn;

import java.util.Locale;
import java.util.Random;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yn;
import net.n0.yp;
import net.nk.f_;
import net.nk.fc;
import net.nk.fu;
import net.nl.zq;
import net.y_.o2;
import net.y_.o3;
import net.y_.o5;
import net.y_.ob;
import net.y_.oe;
import net.y_.ok;
import net.y_.on;
import net.y_.op;
import net.y_.oq;
import net.y_.os;
import net.y_.ow;
import net.y_.s4;
import net.y_.sc;
import net.yz.ai;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class s extends net.ne.j implements net.ne.c, net.ne.m {
   private static final Logger Um = LogManager.getLogger();
   private static final net.k.v UQ = net.k.n.q(s.class, net.k.y.d);
   private int UK;
   private boolean UJ;
   private boolean UN;
   net.nq.d U7;
   @Nullable
   private net.r.r UG;
   @Nullable
   private net.nq.z UB;
   private int UR;
   private boolean U4;
   private boolean Us;
   private int Uj;
   private String Ub;
   private int Un;
   private int UI;
   private boolean UW;
   private boolean U_;
   private final zq Uk;
   private static final s.h[][][][] UY = new s.h[][][][]{{{{new s.l(net.nb.j.Sd, new s.c(18, 22)), new s.l(net.nb.j.We, new s.c(15, 19)), new s.l(net.nb.j.Wq, new s.c(15, 19)), new s.f(net.nb.j.Y4, new s.c(-4, -2))}, {new s.l(net.n0.y.q(net.nb.f.TS), new s.c(8, 13)), new s.f(net.nb.j.Yf, new s.c(-3, -2))}, {new s.l(net.n0.y.q(net.nb.f.dm), new s.c(7, 12)), new s.f(net.nb.j.W8, new s.c(-7, -5))}, {new s.f(net.nb.j.Ss, new s.c(-10, -6)), new s.f(net.nb.j.WS, new s.c(1, 1))}}, {{new s.l(net.nb.j.Yd, new s.c(15, 20)), new s.l(net.nb.j.u, new s.c(16, 24)), new s.i(net.nb.j.YB, new s.c(6, 6), net.nb.j.YY, new s.c(6, 6))}, {new s.d(net.nb.j.WQ, new s.c(7, 8))}}, {{new s.l(net.n0.y.q(net.nb.f.ur), new s.c(16, 22)), new s.f(net.nb.j.W5, new s.c(3, 4))}, {new s.f(new ks(net.n0.y.q(net.nb.f.ur)), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 1), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 2), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 3), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 4), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 5), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 6), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 7), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 8), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 9), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 10), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 11), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 12), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 13), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 14), new s.c(1, 2)), new s.f(new ks(net.n0.y.q(net.nb.f.ur), 1, 15), new s.c(1, 2))}}, {{new s.l(net.nb.j.Yd, new s.c(15, 20)), new s.f(net.nb.j.W_, new s.c(-12, -8))}, {new s.f(net.nb.j.w, new s.c(2, 3)), new s.i(net.n0.y.q(net.nb.f.D), new s.c(10, 10), net.nb.j.YT, new s.c(6, 10))}}}, {{{new s.l(net.nb.j.YZ, new s.c(24, 36)), new s.y()}, {new s.l(net.nb.j.Yv, new s.c(8, 10)), new s.f(net.nb.j.W9, new s.c(10, 12)), new s.f(net.n0.y.q(net.nb.f.W), new s.c(3, 4))}, {new s.l(net.nb.j.e, new s.c(2, 2)), new s.f(net.nb.j.Yj, new s.c(10, 12)), new s.f(net.n0.y.q(net.nb.f.Tm), new s.c(-5, -3))}, {new s.y()}, {new s.y()}, {new s.f(net.nb.j.YR, new s.c(20, 22))}}, {{new s.l(net.nb.j.YZ, new s.c(24, 36))}, {new s.l(net.nb.j.W9, new s.c(1, 1))}, {new s.f(net.nb.j.WW, new s.c(7, 11))}, {new s.p(new s.c(12, 20), "Monument", net.cg.n.MONUMENT), new s.p(new s.c(16, 28), "Mansion", net.cg.n.MANSION)}}}, {{{new s.l(net.nb.j.Wm, new s.c(36, 40)), new s.l(net.nb.j.F, new s.c(8, 10))}, {new s.f(net.nb.j.A, new s.c(-4, -1)), new s.f(new ks(net.nb.j.n, 1, kw.BLUE.G()), new s.c(-2, -1))}, {new s.f(net.nb.j.Ys, new s.c(4, 7)), new s.f(net.n0.y.q(net.nb.f.Tr), new s.c(-3, -1))}, {new s.f(net.nb.j.Yg, new s.c(3, 11))}}}, {{{new s.l(net.nb.j.u, new s.c(16, 24)), new s.f(net.nb.j.j, new s.c(4, 6))}, {new s.l(net.nb.j.S1, new s.c(7, 9)), new s.f(net.nb.j.YE, new s.c(10, 14))}, {new s.l(net.nb.j.B, new s.c(3, 4)), new s.d(net.nb.j.WJ, new s.c(16, 19))}, {new s.f(net.nb.j.Yc, new s.c(5, 7)), new s.f(net.nb.j.Wd, new s.c(9, 11)), new s.f(net.nb.j.YO, new s.c(5, 7)), new s.f(net.nb.j.Wa, new s.c(11, 15))}}, {{new s.l(net.nb.j.u, new s.c(16, 24)), new s.f(net.nb.j.Wv, new s.c(6, 8))}, {new s.l(net.nb.j.S1, new s.c(7, 9)), new s.d(net.nb.j.O, new s.c(9, 10))}, {new s.l(net.nb.j.B, new s.c(3, 4)), new s.d(net.nb.j.YA, new s.c(12, 15)), new s.d(net.nb.j.SY, new s.c(9, 12))}}, {{new s.l(net.nb.j.u, new s.c(16, 24)), new s.d(net.nb.j.YC, new s.c(5, 7))}, {new s.l(net.nb.j.S1, new s.c(7, 9)), new s.d(net.nb.j.X, new s.c(9, 11))}, {new s.l(net.nb.j.B, new s.c(3, 4)), new s.d(net.nb.j.Sx, new s.c(12, 15))}}}, {{{new s.l(net.nb.j.WC, new s.c(14, 18)), new s.l(net.nb.j.Y0, new s.c(14, 18))}, {new s.l(net.nb.j.u, new s.c(16, 24)), new s.f(net.nb.j.Wh, new s.c(-7, -5)), new s.f(net.nb.j.Y6, new s.c(-8, -6))}}, {{new s.l(net.nb.j.Yr, new s.c(9, 12)), new s.f(net.nb.j.Sf, new s.c(2, 4))}, {new s.d(net.nb.j.SE, new s.c(7, 12))}, {new s.f(net.nb.j.h, new s.c(8, 10))}}}, {new s.h[0][]}};

   public s(net.yv.r var1) {
      this(var1, 0);
   }

   public s(net.yv.r var1, int var2) {
      super(var1);
      this.Uk = new zq("Items", false, 8);
      this.f(var2);
      this.S(0.6F, 1.95F);
      ((net.b.s)this.H()).D(true);
      this.t(true);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new net.y_.n(this, fu.class, 8.0F, 0.6D, 0.6D));
      this.p_.X(1, new net.y_.n(this, net.nk.p.class, 12.0F, 0.8D, 0.8D));
      this.p_.X(1, new net.y_.n(this, net.nk.h.class, 8.0F, 0.8D, 0.8D));
      this.p_.X(1, new net.y_.n(this, net.nk.t.class, 8.0F, 0.6D, 0.6D));
      this.p_.X(1, new o3(this));
      this.p_.X(1, new on(this));
      this.p_.X(2, new oq(this));
      this.p_.X(3, new os(this));
      this.p_.X(4, new net.y_.i(this, true));
      this.p_.X(5, new o2(this, 0.6D));
      this.p_.X(6, new oe(this));
      this.p_.X(7, new net.y_.z(this));
      this.p_.X(9, new s4(this, net.r.r.class, 3.0F, 1.0F));
      this.p_.X(9, new sc(this));
      this.p_.X(9, new ow(this, 0.6D));
      this.p_.X(10, new ok(this, net.ne.y.class, 8.0F));
   }

   private void b4() {
      if(!this.U_) {
         this.U_ = true;
         if(this.H9()) {
            this.p_.X(8, new o5(this, 0.32D));
         } else if(this.u() == 0) {
            this.p_.X(6, new ob(this, 0.6D));
         }
      }

   }

   protected void i_() {
      if(this.u() == 0) {
         this.p_.X(8, new ob(this, 0.6D));
      }

      super.i_();
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.5D);
   }

   protected void T() {
      if(--this.UK <= 0) {
         net.u.j var1 = new net.u.j(this);
         this.hl.v().M(var1);
         this.UK = 70 + this.p.nextInt(50);
         this.U7 = this.hl.v().s(var1, 32);
         if(this.U7 == null) {
            this.DI();
         } else {
            net.u.j var2 = this.U7.w();
            this.y(var2, this.U7.T());
            if(this.UW) {
               this.UW = false;
               this.U7.b(5);
            }
         }
      }

      if(!this.VH() && this.UR > 0) {
         --this.UR;
         if(this.UR <= 0) {
            if(this.U4) {
               for(net.nq.x var4 : this.UB) {
                  if(var4.y()) {
                     var4.N(this.p.nextInt(6) + this.p.nextInt(6) + 2);
                  }
               }

               this.bK();
               this.U4 = false;
               if(this.U7 != null && this.Ub != null) {
                  this.hl.k(this, (byte)14);
                  this.U7.b(this.Ub, 1);
               }
            }

            this.o(new net.n_.i(net.nb.b.n, 200, 0));
         }
      }

      super.T();
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      boolean var4 = var3.Z() == net.nb.j.YR;
      var3.f(var1, this, var2);
      return true;
   }

   protected void g() {
      super.g();
      this.G.r(UQ, Integer.valueOf(0));
   }

   public static void w(net.c0.d var0) {
      net.ne.y.J(var0, s.class);
      var0.U(net.c0.q.ENTITY, new net.ng.u(s.class, new String[]{"Inventory"}));
      var0.U(net.c0.q.ENTITY, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            int var4 = net.yn.z.C();
            if(net.ne.v.P(s.class).equals(new m_(var2.J("id"))) && var2.K("Offers", 10)) {
               net.nj.f var5 = var2.o("Offers");
               if(var5.K("Recipes", 9)) {
                  net.nj.h var6 = var5.A("Recipes", 10);
                  int var7 = 0;
                  if(var7 < var6.z()) {
                     net.nj.f var8 = var6.i(var7);
                     net.c0.b.V(var1, var8, var3, "buy");
                     net.c0.b.V(var1, var8, var3, "buyB");
                     net.c0.b.V(var1, var8, var3, "sell");
                     var6.S(var7, var8);
                     ++var7;
                  }
               }
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("Profession", this.u());
      var1.r("Riches", this.Uj);
      var1.r("Career", this.Un);
      var1.r("CareerLevel", this.UI);
      var1.c("Willing", this.Us);
      if(this.UB != null) {
         var1.K("Offers", this.UB.s());
      }

      net.nj.h var2 = new net.nj.h();

      for(int var3 = 0; var3 < this.Uk.e(); ++var3) {
         ks var4 = this.Uk.A(var3);
         if(!var4.B()) {
            var2.m(var4.Z(new net.nj.f()));
         }
      }

      var1.K("Inventory", var2);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.f(var1.P("Profession"));
      this.Uj = var1.P("Riches");
      this.Un = var1.P("Career");
      this.UI = var1.P("CareerLevel");
      this.Us = var1.i("Willing");
      if(var1.K("Offers", 10)) {
         net.nj.f var2 = var1.o("Offers");
         this.UB = new net.nq.z(var2);
      }

      net.nj.h var5 = var1.A("Inventory", 10);

      for(int var3 = 0; var3 < var5.z(); ++var3) {
         ks var4 = new ks(var5.i(var3));
         if(!var4.B()) {
            this.Uk.M(var4);
         }
      }

      this.t(true);
      this.b4();
   }

   protected boolean lB() {
      return false;
   }

   protected net.yz.a T() {
      return this.VH()?net.nb.l.wU:net.nb.l.Cg;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.PX;
   }

   protected net.yz.a r() {
      return net.nb.l.w9;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.F;
   }

   public void f(int var1) {
      this.G.d(UQ, Integer.valueOf(var1));
   }

   public int u() {
      return Math.max(((Integer)this.G.a(UQ)).intValue() % 6, 0);
   }

   public boolean VL() {
      return this.UJ;
   }

   public void A(boolean var1) {
      this.UJ = var1;
   }

   public void l(boolean var1) {
      this.UN = var1;
   }

   public boolean V6() {
      return this.UN;
   }

   public void i(@Nullable net.ne.a var1) {
      super.i(var1);
      if(this.U7 != null) {
         this.U7.r(var1);
         if(var1 instanceof net.r.r) {
            byte var2 = -1;
            if(this.H9()) {
               var2 = -3;
            }

            this.U7.b(var1.Q(), var2);
            if(this.P()) {
               this.hl.k(this, (byte)13);
            }
         }
      }

   }

   public void O(net.yz.z var1) {
      if(this.U7 != null) {
         net.ne.l var2 = var1.v();
         if(var2 instanceof net.r.r) {
            this.U7.b(var2.Q(), -2);
         } else if(var2 instanceof fc) {
            this.U7.K();
         }
      }

      super.O(var1);
   }

   public void E(@Nullable net.r.r var1) {
      this.UG = var1;
   }

   @Nullable
   public net.r.r p() {
      return this.UG;
   }

   public boolean VH() {
      return this.UG != null;
   }

   public boolean b(boolean var1) {
      if(!this.Us && this.V8()) {
         boolean var2 = false;
         byte var3 = 0;
         if(var3 < this.Uk.e()) {
            ks var4 = this.Uk.A(var3);
            if(!var4.B()) {
               if(var4.Z() == net.nb.j.Y4 && var4.U() >= 3) {
                  var2 = true;
                  this.Uk.W(var3, 3);
               } else if((var4.Z() == net.nb.j.We || var4.Z() == net.nb.j.Wq) && var4.U() >= 12) {
                  var2 = true;
                  this.Uk.W(var3, 12);
               }
            }

            this.hl.k(this, (byte)18);
            this.Us = true;
         }
      }

      return this.Us;
   }

   public void P(boolean var1) {
      this.Us = var1;
   }

   public void P(net.nq.x var1) {
      var1.c();
      this.p4 = -this.g();
      this.I(net.nb.l.KR, this.G(), this.s());
      int var2 = 3 + this.p.nextInt(4);
      if(var1.V() == 1 || this.p.nextInt(5) == 0) {
         this.UR = 40;
         this.U4 = true;
         this.Us = true;
         if(this.UG != null) {
            this.Ub = this.UG.Q();
         } else {
            this.Ub = null;
         }

         var2 += 5;
      }

      if(var1.K().Z() == net.nb.j.WL) {
         this.Uj += var1.K().U();
      }

      if(var1.S()) {
         this.hl.S(new net.nm.s(this.hl, this.b, this.hS + 0.5D, this.hr, var2));
      }

      if(this.UG instanceof net.r.h) {
         b2.w.r((net.r.h)this.UG, this, var1.f());
      }

   }

   public void L(ks var1) {
      if(!this.hl.x && this.p4 > -this.g() + 20) {
         this.p4 = -this.g();
         this.I(var1.B()?net.nb.l.CF:net.nb.l.KR, this.G(), this.s());
      }

   }

   @Nullable
   public net.nq.z L(net.r.r var1) {
      if(this.UB == null) {
         this.bK();
      }

      return this.UB;
   }

   private void bK() {
      s.h[][][] var1 = UY[this.u()];
      if(this.Un != 0 && this.UI != 0) {
         ++this.UI;
      } else {
         this.Un = this.p.nextInt(var1.length) + 1;
         this.UI = 1;
      }

      if(this.UB == null) {
         this.UB = new net.nq.z();
      }

      int var2 = this.Un - 1;
      int var3 = this.UI - 1;
      if(var2 < var1.length) {
         s.h[][] var4 = var1[var2];
         if(var3 < var4.length) {
            s.h[] var5 = var4[var3];

            for(s.h var9 : var5) {
               var9.C(this, this.UB, this.p);
            }
         }
      }

   }

   public void A(@Nullable net.nq.z var1) {
   }

   public net.yv.r m() {
      return this.hl;
   }

   public net.u.j P() {
      return new net.u.j(this);
   }

   public net.cb.t b() {
      net.nc.m var2 = this.f();
      net.yn.z.B();
      String var3 = this.X();
      if(var3 != null && !var3.isEmpty()) {
         net.cb.l var6 = new net.cb.l(net.nc.y.s(var2, var3));
         var6.E().G(this.Y());
         var6.E().H(this.r());
         return var6;
      } else {
         if(this.UB == null) {
            this.bK();
         }

         String var4 = null;
         switch(this.u()) {
         case 0:
            if(this.Un == 1) {
               var4 = "farmer";
            } else if(this.Un == 2) {
               var4 = "fisherman";
            } else if(this.Un == 3) {
               var4 = "shepherd";
            } else if(this.Un == 4) {
               var4 = "fletcher";
            }
            break;
         case 1:
            if(this.Un == 1) {
               var4 = "librarian";
            } else if(this.Un == 2) {
               var4 = "cartographer";
            }
            break;
         case 2:
            var4 = "cleric";
            break;
         case 3:
            if(this.Un == 1) {
               var4 = "armor";
            } else if(this.Un == 2) {
               var4 = "weapon";
            } else if(this.Un == 3) {
               var4 = "tool";
            }
            break;
         case 4:
            if(this.Un == 1) {
               var4 = "butcher";
            } else if(this.Un == 2) {
               var4 = "leather";
            }
            break;
         case 5:
            var4 = "nitwit";
         }

         net.cb.h var5 = new net.cb.h("entity.Villager." + var4, new Object[0]);
         var5.E().G(this.Y());
         var5.E().H(this.r());
         var5.E().i(var2.b());
         return var5;
      }
   }

   public float A() {
      return this.H9()?0.81F:1.62F;
   }

   public void R(byte var1) {
      if(var1 == 12) {
         this.f(ai.HEART);
      } else if(var1 == 13) {
         this.f(ai.VILLAGER_ANGRY);
      } else if(var1 == 14) {
         this.f(ai.VILLAGER_HAPPY);
      } else {
         super.R(var1);
      }

   }

   private void f(ai var1) {
      int var2 = 0;

      while(true) {
         double var3 = this.p.nextGaussian() * 0.02D;
         double var5 = this.p.nextGaussian() * 0.02D;
         double var7 = this.p.nextGaussian() * 0.02D;
         this.hl.n(var1, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 1.0D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var3, var5, var7, new int[0]);
         ++var2;
      }
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      return this.C(var1, var2, true);
   }

   public net.ne.g C(net.yv.g var1, @Nullable net.ne.g var2, boolean var3) {
      var2 = super.t(var1, var2);
      this.f(this.hl.G.nextInt(6));
      this.b4();
      this.bK();
      return var2;
   }

   public void H() {
      this.UW = true;
   }

   public s D(net.ne.j var1) {
      s var2 = new s(this.hl);
      var2.t(this.hl.G(new net.u.j(var2)), (net.ne.g)null);
      return var2;
   }

   public boolean p(net.r.r var1) {
      return false;
   }

   public void j(net.yi.e var1) {
      if(!this.hl.x && !this.Z) {
         f_ var2 = new f_(this.hl);
         var2.S(this.b, this.hS, this.hr, this.hN, this.V);
         var2.t(this.hl.G(new net.u.j(var2)), (net.ne.g)null);
         var2.e(this.lJ());
         if(this.H()) {
            var2.K(this.X());
            var2.r(this.y());
         }

         this.hl.S(var2);
         this.B();
      }

   }

   public zq b() {
      return this.Uk;
   }

   protected void z(net.nm.i var1) {
      ks var2 = var1.S();
      net.n0.y var3 = var2.Z();
      if(this.T(var3)) {
         ks var4 = this.Uk.M(var2);
         if(var4.B()) {
            var1.B();
         } else {
            var2.u(var4.U());
         }
      }

   }

   private boolean T(net.n0.y var1) {
      return var1 == net.nb.j.Y4 || var1 == net.nb.j.We || var1 == net.nb.j.Wq || var1 == net.nb.j.Sd || var1 == net.nb.j.Q || var1 == net.nb.j.YN || var1 == net.nb.j.WY;
   }

   public boolean V8() {
      return this.s(1);
   }

   public boolean VY() {
      return this.s(2);
   }

   public boolean Vw() {
      boolean var1 = this.u() == 0;
      return !this.s(5);
   }

   private boolean s(int var1) {
      boolean var2 = this.u() == 0;

      for(int var3 = 0; var3 < this.Uk.e(); ++var3) {
         ks var4 = this.Uk.A(var3);
         if(!var4.B()) {
            if(var4.Z() == net.nb.j.Y4 && var4.U() >= 3 * var1 || var4.Z() == net.nb.j.We && var4.U() >= 12 * var1 || var4.Z() == net.nb.j.Wq && var4.U() >= 12 * var1 || var4.Z() == net.nb.j.YN && var4.U() >= 12 * var1) {
               return true;
            }

            if(var4.Z() == net.nb.j.Sd && var4.U() >= 9 * var1) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean D() {
      for(int var1 = 0; var1 < this.Uk.e(); ++var1) {
         ks var2 = this.Uk.A(var1);
         if(!var2.B() && (var2.Z() == net.nb.j.Q || var2.Z() == net.nb.j.We || var2.Z() == net.nb.j.Wq || var2.Z() == net.nb.j.WY)) {
            return true;
         }
      }

      return false;
   }

   public boolean K(int var1, ks var2) {
      if(super.K(var1, var2)) {
         return true;
      } else {
         int var3 = var1 - 300;
         if(var3 < this.Uk.e()) {
            this.Uk.S(var3, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   private static xn d(xn var0) {
      return var0;
   }

   static class c extends net.yz.y {
      public c(int var1, int var2) {
         super(Integer.valueOf(var1), Integer.valueOf(var2));
         if(var2 < var1) {
            s.Um.warn("PriceRange({}, {}) invalid, {} smaller than {}", Integer.valueOf(var1), Integer.valueOf(var2), Integer.valueOf(var2), Integer.valueOf(var1));
         }

      }

      public int y(Random var1) {
         int var2 = net.yn.z.B();
         return ((Integer)this.e()).intValue() >= ((Integer)this.I()).intValue()?((Integer)this.e()).intValue():((Integer)this.e()).intValue() + var1.nextInt(((Integer)this.I()).intValue() - ((Integer)this.e()).intValue() + 1);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class d implements s.h {
      public ks E;
      public s.c B;

      public d(net.n0.y var1, s.c var2) {
         this.E = new ks(var1);
         this.B = var2;
      }

      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         net.yn.z.C();
         int var5 = 1;
         if(this.B != null) {
            var5 = this.B.y(var3);
         }

         ks var6 = new ks(net.nb.j.WL, var5, 0);
         ks var7 = net.c1.y.Y(var3, new ks(this.E.Z(), 1, this.E.n()), 5 + var3.nextInt(15), false);
         var2.add(new net.nq.x(var6, var7));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class f implements s.h {
      public ks I;
      public s.c N;

      public f(net.n0.y var1, s.c var2) {
         this.I = new ks(var1);
         this.N = var2;
      }

      public f(ks var1, s.c var2) {
         this.I = var1;
         this.N = var2;
      }

      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         net.yn.z.B();
         int var5 = 1;
         if(this.N != null) {
            var5 = this.N.y(var3);
         }

         new ks(net.nb.j.WL);
         new ks(this.I.Z(), -var5, this.I.n());
         ks var6 = new ks(net.nb.j.WL, var5, 0);
         ks var7 = new ks(this.I.Z(), 1, this.I.n());
         var2.add(new net.nq.x(var6, var7));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   interface h {
      void C(net.ne.m var1, net.nq.z var2, Random var3);
   }

   static class i implements s.h {
      public ks v;
      public s.c c;
      public ks U;
      public s.c C;

      public i(net.n0.y var1, s.c var2, net.n0.y var3, s.c var4) {
         this.v = new ks(var1);
         this.c = var2;
         this.U = new ks(var3);
         this.C = var4;
      }

      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         int var4 = this.c.y(var3);
         int var5 = this.C.y(var3);
         var2.add(new net.nq.x(new ks(this.v.Z(), var4, this.v.n()), new ks(net.nb.j.WL), new ks(this.U.Z(), var5, this.U.n())));
      }
   }

   static class l implements s.h {
      public net.n0.y q;
      public s.c a;

      public l(net.n0.y var1, s.c var2) {
         this.q = var1;
         this.a = var2;
      }

      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         net.yn.z.C();
         int var5 = 1;
         if(this.a != null) {
            var5 = this.a.y(var3);
         }

         var2.add(new net.nq.x(new ks(this.q, var5, 0), net.nb.j.WL));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class p implements s.h {
      public s.c N;
      public String H;
      public net.cg.n p;

      public p(s.c var1, String var2, net.cg.n var3) {
         this.N = var1;
         this.H = var2;
         this.p = var3;
      }

      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         int var4 = this.N.y(var3);
         net.yv.r var5 = var1.m();
         net.u.j var6 = var5.p(this.H, var1.P(), true);
         ks var7 = yn.i(var5, (double)var6.t(), (double)var6.y(), (byte)2, true, true);
         yn.p(var5, var7);
         net.cg.s.o(var7, var6, "+", this.p);
         var7.Q("filled_map." + this.H.toLowerCase(Locale.ROOT));
         var2.add(new net.nq.x(new ks(net.nb.j.WL, var4), new ks(net.nb.j.W9), var7));
      }
   }

   static class y implements s.h {
      public void C(net.ne.m var1, net.nq.z var2, Random var3) {
         net.yn.z.C();
         net.c1.c var5 = (net.c1.c)net.c1.c.i.Y(var3);
         int var6 = net.u.t.A(var3, var5.m(), var5.h());
         ks var7 = yp.j(new net.c1.x(var5, var6));
         int var8 = 2 + var3.nextInt(5 + var6 * 10) + 3 * var6;
         if(var5.S()) {
            var8 *= 2;
         }

         if(var8 > 64) {
            var8 = 64;
         }

         var2.add(new net.nq.x(new ks(net.nb.j.Yv), new ks(net.nb.j.WL, var8), var7));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
