package net.z;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net._e;
import net._x;
import net.bs;
import net.db;
import net.ge;
import net.gn;
import net.i6;
import net.rd;
import net.v3;
import net.vy;
import net.wp;
import net.x7;
import net.xg;
import net.xh;
import net.xn;
import net.z9;
import net.n0.ks;
import net.nl.z1;
import net.y.u1;
import net.y.ui;
import net.yz.a7;
import net.yz.aa;
import net.yz.m_;
import net.z.g;
import net.z.o;
import net.z.r;
import net.z.t;
import net.z.ta;
import net.z.ty;
import net.z.tz;
import net.z.w1;
import net.z.wm;

public class tk extends g {
   private static final m_ Q = new m_("textures/misc/vignette.png");
   private static final m_ z = new m_("textures/gui/widgets.png");
   private static final m_ o = new m_("textures/misc/pumpkinblur.png");
   private final Random m = new Random();
   private final net.nn.j T;
   private final net.y.t k;
   private final tz J;
   private int b;
   private String N = "";
   private int E;
   private boolean U;
   public float L = 1.0F;
   private int f;
   private ks l = ks.a;
   private final ta C;
   private final w1 a;
   private final wm P;
   private final ty y;
   private final o D;
   private int B;
   private String K = "";
   private String q = "";
   private int w;
   private int n;
   private int F;
   private int H;
   private int R;
   private long u;
   private long A;
   private final Map h = Maps.newHashMap();
   float c = 0.0F;

   public tk(net.nn.j var1) {
      this.T = var1;
      this.k = var1.K();
      this.C = new ta(var1);
      this.P = new wm(var1);
      this.J = new tz(var1);
      this.y = new ty(var1, this);
      this.D = new o(var1);
      this.a = new w1(var1);

      for(net.cb.c var5 : net.cb.c.values()) {
         this.h.put(var5, Lists.newArrayList());
      }

      net.yc.d var6 = net.yc.d.o;
      ((List)this.h.get(net.cb.c.CHAT)).add(new net.yc.v(var1));
      ((List)this.h.get(net.cb.c.CHAT)).add(var6);
      ((List)this.h.get(net.cb.c.SYSTEM)).add(new net.yc.v(var1));
      ((List)this.h.get(net.cb.c.SYSTEM)).add(var6);
      ((List)this.h.get(net.cb.c.GAME_INFO)).add(new net.yc.p(var1));
      this.n();
   }

   public void n() {
      this.w = 10;
      this.n = 70;
      this.F = 20;
   }

   public void j(float var1) {
      g.B();
      t var3 = new t(this.T);
      int var4 = var3.u();
      int var5 = var3.v();
      r var6 = this.x();
      bs var7 = new bs(var3, var1);
      _x.m(var7);
      net.y.d.C();
      if(z9.A()) {
         this.d(this.T.sf.d(), var3);
      }

      net.y.d.B();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      ks var8 = this.T.sf.a8.Q(3);
      if(this.T.T.wR == 0 && var8.Z() == net.n0.y.q(net.nb.f.TS)) {
         this.e(var3);
      }

      if(!this.T.sf.J(net.nb.b.f)) {
         float var9 = this.T.sf.xZ + (this.T.sf.xP - this.T.sf.xZ) * var1;
         if(Float.compare(var9, 0.0F) > 0) {
            this.s(var9, var3);
         }
      }

      if(this.T.sE.l()) {
         this.P.y(var3, var1);
      }

      this.z(var3, var1);
      db var17 = new db(var3);
      _x.m(var17);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.T.n().E(e);
      net.y.d.C();
      this.c(var1, var3);
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      this.T.sl.K("bossHealth");
      this.D.A();
      this.T.sl.N();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.T.n().E(e);
      if(this.T.sE.k()) {
         this.C(var3);
      }

      this.w(var3);
      net.y.d.E();
      if(this.T.sf.O() > 0) {
         this.T.sl.K("sleep");
         net.y.d.z();
         net.y.d.d();
         int var10 = this.T.sf.O();
         float var11 = (float)var10 / 100.0F;
         if(Float.compare(var11, 1.0F) > 0) {
            var11 = 1.0F - (float)(var10 - 100) / 10.0F;
         }

         int var12 = (int)(220.0F * var11) << 24 | 1052704;
         u(0, 0, var4, var5, var12);
         net.y.d.m();
         net.y.d.B();
         this.T.sl.N();
      }

      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      int var18 = var4 / 2 - 91;
      if(this.T.sf.FT()) {
         this.c(var3, var18);
      }

      if(this.T.sE.P()) {
         this.z(var3, var18);
      }

      if(this.T.T.J && !this.T.sE.l()) {
         this.c(var3);
      }

      if(this.T.sf.VX()) {
         this.P.c(var3);
      }

      this.g(var3);
      if(this.T.T.wt) {
         this.C.O(var3);
      }

      if(this.E > 0) {
         this.T.sl.K("overlayMessage");
         float var19 = (float)this.E - var1;
         int var22 = (int)(var19 * 255.0F / 20.0F);
         if(var22 > 255) {
            var22 = 255;
         }

         if(var22 > 8) {
            net.y.d.c();
            net.y.d.O((float)(var4 / 2), (float)(var5 - 68), 0.0F);
            net.y.d.C();
            net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
            int var13 = 16777215;
            if(this.U) {
               var13 = net.u.t.C(var19 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            var6.v(this.N, (float)(-var6.r(this.N) / 2), -4.0F, var13 + (var22 << 24 & -16777216));
            net.y.d.E();
            net.y.d.Y();
         }

         this.T.sl.N();
      }

      this.a.W(var3);
      if(this.B > 0) {
         this.T.sl.K("titleAndSubtitle");
         float var20 = (float)this.B - var1;
         int var23 = 255;
         if(this.B > this.F + this.n) {
            float var26 = (float)(this.w + this.n + this.F) - var20;
            var23 = (int)(var26 * 255.0F / (float)this.w);
         }

         if(this.B <= this.F) {
            var23 = (int)(var20 * 255.0F / (float)this.F);
         }

         var23 = net.u.t.g(var23, 0, 255);
         if(var23 > 8) {
            net.y.d.c();
            net.y.d.O((float)(var4 / 2), (float)(var5 / 2), 0.0F);
            net.y.d.C();
            net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
            net.y.d.c();
            net.y.d.W(4.0F, 4.0F, 4.0F);
            int var27 = var23 << 24 & -16777216;
            var6.W(this.K, (float)(-var6.r(this.K) / 2), -10.0F, 16777215 | var27, true);
            net.y.d.Y();
            net.y.d.c();
            net.y.d.W(2.0F, 2.0F, 2.0F);
            var6.W(this.q, (float)(-var6.r(this.q) / 2), 5.0F, 16777215 | var27, true);
            net.y.d.Y();
            net.y.d.E();
            net.y.d.Y();
         }

         this.T.sl.N();
      }

      net.nc.b var21 = this.T.s8.J();
      net.nc.l var25 = null;
      net.nc.y var28 = var21.A(this.T.sf.Q());
      if(var28 != null) {
         int var14 = var28.b().c();
         var25 = var21.S(3 + var14);
      }

      net.nc.l var29 = var25 != null?var25:var21.S(1);
      if(var29 != null) {
         _e var15 = new _e(ge.PRE);
         _x.m(var15);
         if(!gn.Q.j.d(vy.class).v() || !gn.Q.J.S("NoScoreBoard").Q()) {
            this.E(var29, var3);
         }

         _e var16 = new _e(ge.POST);
         _x.m(var16);
      }

      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.d();
      net.y.d.c();
      net.y.d.O(0.0F, (float)(var5 - 48), 0.0F);
      this.T.sl.K("chat");
      this.J.o(this.b);
      this.T.sl.N();
      net.y.d.Y();
      var29 = var21.S(0);
      if(this.T.T.G.o()) {
         if(this.T.w() && this.T.sf.x3.B().size() <= 1) {
            ;
         }

         this.y.B(true);
         this.y.U(var4, var21, var29);
      }

      this.y.B(false);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.i();
      net.y.d.m();
      if(net.u.d.y() == null) {
         g.E(false);
      }

   }

   private void c(float var1, t var2) {
      net.nr.d var3 = this.T.T;
      if(var3.wR == 0) {
         if(this.T.sE.l() && this.T.B == null) {
            net.u.m var4 = this.T.H;
            if(var4.v != net.u.m.BLOCK) {
               return;
            }

            net.u.j var5 = var4.j();
            net.yw.n var6 = this.T.s8.Z(var5);
            if(!net.wl.A(var6) || !(this.T.s8.L(var5) instanceof z1)) {
               return;
            }
         }

         int var11 = var2.u();
         int var12 = var2.v();
         if(var3.wt && !var3.h && !this.T.sf.VI() && !var3.a) {
            net.y.d.c();
            net.y.d.O((float)(var11 / 2), (float)(var12 / 2), d);
            net.ne.l var14 = this.T.A();
            net.y.d.P(var14.d + (var14.V - var14.d) * var1, -1.0F, 0.0F, 0.0F);
            net.y.d.P(var14.hq + (var14.hN - var14.hq) * var1, 0.0F, 1.0F, 0.0F);
            net.y.d.W(-1.0F, -1.0F, -1.0F);
            ui.B(10);
            net.y.d.Y();
         } else {
            net.y.d.e(net.y.d.ONE_MINUS_DST_COLOR, net.y.d.ONE_MINUS_SRC_COLOR, net.y.d.ONE, net.y.d.ZERO);
            net.y.d.m();
            this.g(var11 / 2 - 7, var12 / 2 - 7, 0, 0, 16, 16);
            if(this.T.T.ie == 1) {
               float var13 = this.T.sf.B(0.0F);
               boolean var7 = false;
               if(this.T.B != null && this.T.B instanceof net.ne.a && var13 >= 1.0F) {
                  var7 = this.T.sf.m() > 5.0F;
                  var7 = var7 & this.T.B.P();
               }

               int var8 = var12 / 2 - 7 + 16;
               int var9 = var11 / 2 - 8;
               this.g(var9, var8, 68, 94, 16, 16);
            }
         }
      }

   }

   protected void g(t var1) {
      Collection var2 = this.T.sf.o();
      if(!var2.isEmpty()) {
         this.T.n().E(net.c2.n.K);
         net.y.d.C();
         int var3 = 0;
         int var4 = 0;
         Iterator var5 = Ordering.natural().reverse().sortedCopy(var2).iterator();

         while(true) {
            net.n_.i var6;
            net.n_.f var7;
            while(true) {
               if(!var5.hasNext()) {
                  return;
               }

               var6 = (net.n_.i)var5.next();
               var7 = var6.i();
               boolean var8 = var7.x();
               if(!i6.CQ.r()) {
                  break;
               }

               if(i6.I(var7, i6.CQ, new Object[]{var6})) {
                  this.T.n().E(net.c2.n.K);
                  var8 = true;
                  break;
               }
            }

            if(var6.q()) {
               int var9 = var1.u();
               int var10 = 1;
               if(this.T.e()) {
                  var10 += 15;
               }

               int var11 = var7.b();
               if(var7.T()) {
                  ++var3;
                  var9 = var9 - 25 * var3;
               } else {
                  ++var4;
                  var9 = var9 - 25 * var4;
                  var10 += 26;
               }

               net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
               float var12 = 1.0F;
               if(var6.b()) {
                  this.g(var9, var10, 165, 166, 24, 24);
               } else {
                  this.g(var9, var10, 141, 166, 24, 24);
                  if(var6.S() <= 200) {
                     int var13 = 10 - var6.S() / 20;
                     var12 = net.u.t.T((float)var6.S() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F) + net.u.t.m((float)var6.S() * 3.1415927F / 5.0F) * net.u.t.T((float)var13 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               net.y.d.T(1.0F, 1.0F, 1.0F, var12);
               if(i6.Ba.r()) {
                  if(var7.x()) {
                     this.g(var9 + 3, var10 + 3, var11 % 8 * 18, 198 + var11 / 8 * 18, 18, 18);
                  }

                  i6.b(var7, i6.Ba, new Object[]{Integer.valueOf(var9), Integer.valueOf(var10), var6, this.T, Float.valueOf(var12)});
               } else {
                  this.g(var9 + 3, var10 + 3, var11 % 8 * 18, 198 + var11 / 8 * 18, 18, 18);
               }
            }
         }
      }
   }

   protected void z(t var1, float var2) {
      if(this.T.A() instanceof net.r.r) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.T.n().E(z);
         net.r.r var3 = (net.r.r)this.T.A();
         ks var4 = var3.L();
         aa var5 = var3.a().O();
         int var6 = var1.u() / 2;
         float var7 = d;
         boolean var10000 = true;
         var10000 = true;
         d = -90.0F;
         this.g(var6 - 91, var1.v() - 22, 0, 0, 182, 22);
         this.g(var6 - 91 - 1 + var3.a8.r * 20, var1.v() - 22 - 1, 0, 22, 24, 22);
         if(!var4.B()) {
            if(var5 == aa.LEFT) {
               this.g(var6 - 91 - 29, var1.v() - 23, 24, 22, 29, 24);
            } else {
               this.g(var6 + 91, var1.v() - 23, 53, 22, 29, 24);
            }
         }

         d = var7;
         net.y.d.F();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         u1.A();
         rd.e(false);
         int var10 = 0;

         while(true) {
            int var11 = var6 - 90 + var10 * 20 + 2;
            int var12 = var1.v() - 16 - 3;
            this.P(var11, var12, var2, var3, (ks)var3.a8.X.get(var10));
            ++var10;
         }
      }

   }

   public void c(t var1, int var2) {
      this.T.sl.K("jumpBar");
      this.T.n().E(g.e);
      float var3 = this.T.sf.i();
      boolean var10000 = true;
      int var5 = (int)(var3 * 183.0F);
      int var6 = var1.v() - 32 + 3;
      this.g(var2, var6, 0, 84, 182, 5);
      this.g(var2, var6, 0, 89, var5, 5);
      this.T.sl.N();
   }

   public void z(t var1, int var2) {
      this.T.sl.K("expBar");
      this.T.n().E(g.e);
      int var3 = this.T.sf.Y();
      int var4 = 182;
      int var5 = (int)(this.T.sf.aP * 183.0F);
      int var6 = var1.v() - 32 + 3;
      this.g(var2, var6, 0, 64, 182, 5);
      this.g(var2, var6, 0, 69, var5, 5);
      this.T.sl.N();
      if(this.T.sf.aX > 0) {
         this.T.sl.K("expLevel");
         var4 = 8453920;
         if(z9.v()) {
            var4 = x7.Q(var4);
         }

         String var9 = "" + this.T.sf.aX;
         var6 = (var1.u() - this.x().r(var9)) / 2;
         int var7 = var1.v() - 31 - 4;
         this.x().v(var9, (float)(var6 + 1), (float)var7, 0);
         this.x().v(var9, (float)(var6 - 1), (float)var7, 0);
         this.x().v(var9, (float)var6, (float)(var7 + 1), 0);
         this.x().v(var9, (float)var6, (float)(var7 - 1), 0);
         this.x().v(var9, (float)var6, (float)var7, var4);
         this.T.sl.N();
      }

   }

   public void c(t var1) {
      this.T.sl.K("selectedItemName");
      if(this.f > 0 && !this.l.B()) {
         String var2 = this.l.j();
         if(this.l.v()) {
            var2 = net.cb.z.ITALIC + var2;
         }

         int var3 = (var1.u() - this.x().r(var2)) / 2;
         int var4 = var1.v() - 59;
         if(!this.T.sE.k()) {
            var4 += 14;
         }

         int var5 = (int)((float)this.f * 256.0F / 10.0F);
         if(var5 > 255) {
            var5 = 255;
         }

         net.y.d.c();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         this.x().U(var2, (float)var3, (float)var4, 16777215 + (var5 << 24));
         net.y.d.E();
         net.y.d.Y();
      }

      this.T.sl.N();
   }

   public void u(t var1) {
      this.T.sl.K("demo");
      String var2;
      if(this.T.s8.y() >= 120500L) {
         var2 = net.c9.b.x("demo.demoExpired", new Object[0]);
      } else {
         var2 = net.c9.b.x("demo.remainingTime", new Object[]{a7.N((int)(120500L - this.T.s8.y()))});
      }

      int var3 = this.x().r(var2);
      this.x().U(var2, (float)(var1.u() - var3 - 10), 5.0F, 16777215);
      this.T.sl.N();
   }

   private void E(net.nc.l var1, t var2) {
      net.nc.b var3 = var1.J();
      Collection var4 = var3.d(var1);
      ArrayList var5 = Lists.newArrayList(Iterables.filter(var4, new Predicate() {
         public boolean V(@Nullable net.nc.o var1) {
            boolean var2 = g.B();
            return var1.W() != null && !var1.W().startsWith("#");
         }

         private static xn a(xn var0) {
            return var0;
         }
      }));
      ArrayList var20;
      if(var5.size() > 15) {
         var20 = Lists.newArrayList(Iterables.skip(var5, var4.size() - 15));
      } else {
         var20 = var5;
      }

      int var6 = this.x().r(var1.a());

      for(net.nc.o var8 : var20) {
         net.nc.y var9 = var3.A(var8.W());
         String var10 = net.nc.y.s(var9, var8.W());
         var6 = Math.max(var6, this.x().r(var10));
      }

      int var21 = var20.size() * this.x().R;
      int var22 = var2.v() / 2 + var21 / 3;
      boolean var23 = true;
      int var24 = var2.u() - var6 - 3;
      int var11 = 0;

      for(net.nc.o var13 : var20) {
         ++var11;
         net.nc.y var14 = var3.A(var13.W());
         String var15 = net.nc.y.s(var14, var13.W());
         String var16 = "vk.com/neverhook";
         int var17 = var22 - var11 * this.x().R;
         int var18 = var2.u() - 3 + 2;
         xh.J((double)(var24 - 2), (double)var17, (double)var18, (double)(var17 + this.x().R), 1610612736);
         this.T.sO.U(var15, (float)var24, (float)var17, 553648127);
         if(var11 == var20.size()) {
            var1.a();
            xh.J((double)(var24 - 2), (double)(var17 - this.x().R - 1), (double)var18, (double)(var17 - 1), 1610612736);
            xh.J((double)(var24 - 2), (double)(var17 - 1), (double)var18, (double)var17, 1610612736);
            xh.z((double)(var24 - 2), (double)(var17 - 12), (double)var18, (double)(var17 + -10), gn.M().getRGB(), xg.w(300, 1.0F, 1.0F));
            this.T.x.i(var16, (float)(var24 + var6 / 2 - this.T.x.s(var16) / 2), (float)(var17 - this.T.x.f()), xg.w(Color.RED, gn.M(), 3.0D).getRGB());
         }
      }

   }

   private void C(t var1) {
      if(this.T.A() instanceof net.r.r) {
         net.r.r var2 = (net.r.r)this.T.A();
         int var3 = net.u.t.Y(var2.h());
         if(this.A > (long)this.b && (this.A - (long)this.b) / 3L % 2L == 1L) {
            boolean var28 = true;
         } else {
            boolean var10000 = false;
         }

         if(var3 < this.H && var2.I > 0) {
            this.u = net.nn.j.E();
            this.A = (long)(this.b + 20);
         } else if(var3 > this.H && var2.I > 0) {
            this.u = net.nn.j.E();
            this.A = (long)(this.b + 10);
         }

         if(net.nn.j.E() - this.u > 1000L) {
            this.H = var3;
            this.R = var3;
            this.u = net.nn.j.E();
         }

         this.H = var3;
         int var29 = this.R;
         this.m.setSeed((long)this.b * 312871L);
         net.yz.d var6 = var2.e();
         var6.Z();
         net.s.i var8 = var2.t(net.ne.d.C);
         int var9 = var1.u() / 2 - 91;
         var29 = var1.u() / 2 + 91;
         int var11 = var1.v() - 39;
         float var12 = (float)var8.K();
         int var13 = net.u.t.Y(var2.y());
         int var14 = net.u.t.Y((var12 + (float)var13) / 2.0F / 10.0F);
         int var15 = Math.max(10 - (var14 - 2), 3);
         int var16 = var11 - (var14 - 1) * var15 - 10;
         var29 = var11 - 10;
         int var19 = var2.U();
         var29 = -1;
         if(var2.J(net.nb.b.n)) {
            var29 = this.b % net.u.t.Y(var12 + 5.0F);
         }

         this.T.sl.K("armor");
         int var21 = 0;

         while(true) {
            int var22 = var9 + var21 * 8;
            if(var21 * 2 + 1 < var19) {
               this.g(var22, var16, 34, 9, 9, 9);
            }

            if(var21 * 2 + 1 == var19) {
               this.g(var22, var16, 25, 9, 9, 9);
            }

            if(var21 * 2 + 1 > var19) {
               this.g(var22, var16, 16, 9, 9, 9);
            }

            ++var21;
         }
      }

   }

   private void w(t var1) {
      if(this.T.A() instanceof net.r.r) {
         net.r.r var2 = (net.r.r)this.T.A();
         net.ne.l var3 = var2.D();
         if(var3 instanceof net.ne.a) {
            this.T.sl.F("mountHealth");
            net.ne.a var4 = (net.ne.a)var3;
            int var5 = (int)Math.ceil((double)var4.h());
            float var6 = var4.w();
            int var7 = (int)(var6 + 0.5F) / 2;
            if(var7 > 30) {
               var7 = 30;
            }

            int var8 = var1.v() - 39;
            int var9 = var1.u() / 2 + 91;
            int var10 = var8;
            int var11 = 0;
            boolean var10000 = false;

            while(true) {
               int var13 = Math.min(var7, 10);
               var7 -= var13;

               for(int var14 = 0; var14 < var13; ++var14) {
                  var10000 = true;
                  byte var16 = 0;
                  int var17 = var9 - var14 * 8 - 9;
                  this.g(var17, var10, 52 + var16 * 9, 9, 9, 9);
                  if(var14 * 2 + 1 + var11 < var5) {
                     this.g(var17, var10, 88, 9, 9, 9);
                  }

                  if(var14 * 2 + 1 + var11 == var5) {
                     this.g(var17, var10, 97, 9, 9, 9);
                  }
               }

               var10 -= 10;
               var11 += 20;
            }
         }
      }

   }

   private void e(t var1) {
      if(!gn.Q.j.d(v3.class).v() || !v3.O.Q()) {
         net.y.d.z();
         net.y.d.Y(false);
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.d();
         this.T.n().E(o);
         net.y.r var2 = net.y.r.f();
         net.y.p var3 = var2.k();
         var3.m(7, net.y8.x.H);
         var3.H(0.0D, (double)var1.v(), -90.0D).Y(0.0D, 1.0D).W();
         var3.H((double)var1.u(), (double)var1.v(), -90.0D).Y(1.0D, 1.0D).W();
         var3.H((double)var1.u(), 0.0D, -90.0D).Y(1.0D, 0.0D).W();
         var3.H(0.0D, 0.0D, -90.0D).Y(0.0D, 0.0D).W();
         var2.p();
         net.y.d.Y(true);
         net.y.d.B();
         net.y.d.m();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void d(float var1, t var2) {
      if(!z9.A()) {
         net.y.d.B();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      } else {
         var1 = 1.0F - var1;
         var1 = net.u.t.T(var1, 0.0F, 1.0F);
         net.nz.p var3 = this.T.s8.T();
         float var4 = (float)var3.H((net.ne.l)this.T.sf);
         double var5 = Math.min(var3.m() * (double)var3.N() * 1000.0D, Math.abs(var3.E() - var3.b()));
         double var7 = Math.max((double)var3.l(), var5);
         if((double)var4 < var7) {
            var4 = 1.0F - (float)((double)var4 / var7);
         } else {
            var4 = 0.0F;
         }

         this.L = (float)((double)this.L + (double)(var1 - this.L) * 0.01D);
         net.y.d.z();
         net.y.d.Y(false);
         net.y.d.e(net.y.d.ZERO, net.y.d.ONE_MINUS_SRC_COLOR, net.y.d.ONE, net.y.d.ZERO);
         float var14;
         int var10000 = (var14 = var4 - 0.0F) == 0.0F?0:(var14 < 0.0F?-1:1);
         net.y.d.T(this.L, this.L, this.L, 1.0F);
         this.T.n().E(Q);
         net.y.r var9 = net.y.r.f();
         net.y.p var10 = var9.k();
         var10.m(7, net.y8.x.H);
         var10.H(0.0D, (double)var2.v(), -90.0D).Y(0.0D, 1.0D).W();
         var10.H((double)var2.u(), (double)var2.v(), -90.0D).Y(1.0D, 1.0D).W();
         var10.H((double)var2.u(), 0.0D, -90.0D).Y(1.0D, 0.0D).W();
         var10.H(0.0D, 0.0D, -90.0D).Y(0.0D, 0.0D).W();
         var9.p();
         net.y.d.Y(true);
         net.y.d.B();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      }

   }

   private void s(float var1, t var2) {
      if(var1 < 1.0F) {
         var1 = var1 * var1;
         var1 = var1 * var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      net.y.d.d();
      net.y.d.z();
      net.y.d.Y(false);
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.T(1.0F, 1.0F, 1.0F, var1);
      this.T.n().E(net.n9.b.N);
      net.n9.v var3 = this.T.x().a().I(net.nb.f.uJ.p());
      float var4 = var3.q();
      float var5 = var3.n();
      float var6 = var3.o();
      float var7 = var3.r();
      net.y.r var8 = net.y.r.f();
      net.y.p var9 = var8.k();
      var9.m(7, net.y8.x.H);
      var9.H(0.0D, (double)var2.v(), -90.0D).Y((double)var4, (double)var7).W();
      var9.H((double)var2.u(), (double)var2.v(), -90.0D).Y((double)var6, (double)var7).W();
      var9.H((double)var2.u(), 0.0D, -90.0D).Y((double)var6, (double)var5).W();
      var9.H(0.0D, 0.0D, -90.0D).Y((double)var4, (double)var5).W();
      var8.p();
      net.y.d.Y(true);
      net.y.d.B();
      net.y.d.m();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void P(int var1, int var2, float var3, net.r.r var4, ks var5) {
      if(!var5.B()) {
         float var6 = (float)var5.G() - var3;
         if(var6 > 0.0F) {
            net.y.d.c();
            float var7 = 1.0F + var6 / 5.0F;
            net.y.d.O((float)(var1 + 8), (float)(var2 + 12), 0.0F);
            net.y.d.W(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            net.y.d.O((float)(-(var1 + 8)), (float)(-(var2 + 12)), 0.0F);
         }

         this.k.g(var4, var5, var1, var2);
         if(var6 > 0.0F) {
            net.y.d.Y();
         }

         this.k.q(this.T.sO, var5, var1, var2);
      }

   }

   public void u() {
      if(this.T.s8 == null) {
         wp.i();
      }

      if(this.E > 0) {
         --this.E;
      }

      if(this.B > 0) {
         --this.B;
         if(this.B <= 0) {
            this.K = "";
            this.q = "";
         }
      }

      ++this.b;
      if(this.T.sf != null) {
         ks var1 = this.T.sf.a8.r();
         if(var1.B()) {
            this.f = 0;
         } else if(!this.l.B() && var1.Z() == this.l.Z() && ks.a(var1, this.l) && (var1.M() || var1.n() == this.l.n())) {
            if(this.f > 0) {
               --this.f;
            }
         } else {
            this.f = 40;
         }

         this.l = var1;
      }

   }

   public void v(String var1) {
      this.u(net.c9.b.x("record.nowPlaying", new Object[]{var1}), true);
   }

   public void u(String var1, boolean var2) {
      this.N = var1;
      this.E = 60;
      this.U = var2;
   }

   public void R(String var1, String var2, int var3, int var4, int var5) {
      this.K = "";
      this.q = "";
      this.B = 0;
   }

   public void J(net.cb.t var1, boolean var2) {
      this.u(var1.l(), var2);
   }

   public void l(net.cb.c var1, net.cb.t var2) {
      for(net.yc.e var4 : (List)this.h.get(var1)) {
         var4.B(var1, var2);
      }

   }

   public tz I() {
      return this.J;
   }

   public int n() {
      return this.b;
   }

   public r x() {
      return this.T.sO;
   }

   public wm p() {
      return this.P;
   }

   public ty A() {
      return this.y;
   }

   public void L() {
      this.y.V();
      this.D.D();
      this.T.J().T();
   }

   public o T() {
      return this.D;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
