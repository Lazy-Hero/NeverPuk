package net.n2;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import net.b2;
import net.xc;
import net.m.e;
import net.m.qo;
import net.m.qp;
import net.m.qs;
import net.m.qz;
import net.n0.k5;
import net.n0.kd;
import net.n0.ks;
import net.n0.yi;
import net.n2.a;
import net.n2.h;
import net.n2.k;
import net.n2.n;
import net.nb.b;
import net.ni.sg;
import net.ni.sl;
import net.nl.z1;
import net.nl.z2;
import net.no.i0;
import net.no.i2;
import net.no.j;
import net.no.p;
import net.no.s1;
import net.no.sh;
import net.no.sq;
import net.no.sr;
import net.no.sz;
import net.nx.f;
import net.y9.zc;
import net.yv.o9;
import net.yz.a3;
import net.yz.a4;
import net.yz.a7;
import net.yz.aq;
import net.yz.ax;
import net.yz.m1;
import net.yz.m_;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r implements net.x.x, net.yz.i {
   private static final Logger r = LogManager.getLogger();
   public final a c;
   private final f n;
   public net.r.h D;
   private int M;
   private long j;
   private boolean U;
   private long S;
   private int F;
   private int H;
   private final a4 I = new a4();
   private double L;
   private double g;
   private double m;
   private double O;
   private double B;
   private double G;
   private net.ne.l A;
   private double h;
   private double l;
   private double R;
   private double v;
   private double s;
   private double w;
   private net.u.r p;
   private int o;
   private int Q;
   private boolean T;
   private int K;
   private boolean b;
   private int t;
   private int i;
   private int W;
   private final m1 e = new m1();

   public r(f var1, a var2, net.r.h var3) {
      this.n = var1;
      this.c = var2;
      var2.Y(this);
      this.D = var3;
      var3.t1 = this;
   }

   public void m() {
      this.X();
      this.D.j();
      this.D.D(this.L, this.g, this.m, this.D.hN, this.D.V);
      ++this.M;
      this.W = this.i;
      if(this.T) {
         if(++this.K > 80) {
            r.warn("{} was kicked for floating too long!", this.D.Q());
            this.r(new net.cb.h("multiplayer.disconnect.flying", new Object[0]));
            return;
         }
      } else {
         this.T = false;
         this.K = 0;
      }

      this.A = this.D.o();
      if(this.A != this.D && this.A.C() == this.D) {
         this.h = this.A.b;
         this.l = this.A.hS;
         this.R = this.A.hr;
         this.v = this.A.b;
         this.s = this.A.hS;
         this.w = this.A.hr;
         if(this.b && this.D.o().C() == this.D) {
            if(++this.t > 80) {
               r.warn("{} was kicked for floating a vehicle too long!", this.D.Q());
               this.r(new net.cb.h("multiplayer.disconnect.flying", new Object[0]));
               return;
            }
         } else {
            this.b = false;
            this.t = 0;
         }
      } else {
         this.A = null;
         this.b = false;
         this.t = 0;
      }

      this.n.a.K("keepAlive");
      long var1 = this.i();
      if(var1 - this.j >= 15000L) {
         if(this.U) {
            this.r(new net.cb.h("disconnect.timeout", new Object[0]));
         } else {
            this.U = true;
            this.j = var1;
            this.S = var1;
            this.h((k)(new j(this.S)));
         }
      }

      this.n.a.N();
      if(this.F > 0) {
         --this.F;
      }

      if(this.H > 0) {
         --this.H;
      }

      if(this.D.k() > 0L && this.n.o() > 0 && f.X() - this.D.k() > (long)(this.n.o() * 1000 * 60)) {
         this.r(new net.cb.h("multiplayer.disconnect.idling", new Object[0]));
      }

   }

   private void X() {
      this.L = this.D.b;
      this.g = this.D.hS;
      this.m = this.D.hr;
      this.O = this.D.b;
      this.B = this.D.hS;
      this.G = this.D.hr;
   }

   public a V() {
      return this.c;
   }

   public void r(final net.cb.t var1) {
      this.c.Z(new i2(var1), new GenericFutureListener() {
         public void operationComplete(Future var1x) throws Exception {
            r.this.c.R(var1);
         }
      }, new GenericFutureListener[0]);
      this.c.e();
      Futures.getUnchecked(this.n.d(new Runnable() {
         public void run() {
            r.this.c.E();
         }
      }));
   }

   public void y(net.m.x var1) {
      n.d(var1, this, this.D.j());
      this.D.B(var1.Z(), var1.k(), var1.Q(), var1.P());
   }

   private static boolean U(qo var0) {
      return Doubles.isFinite(var0.F(0.0D)) && Doubles.isFinite(var0.S(0.0D)) && Doubles.isFinite(var0.v(0.0D)) && Floats.isFinite(var0.U(0.0F)) && Floats.isFinite(var0.n(0.0F))?Math.abs(var0.F(0.0D)) > 3.0E7D || Math.abs(var0.S(0.0D)) > 3.0E7D || Math.abs(var0.v(0.0D)) > 3.0E7D:true;
   }

   private static boolean z(net.m.t var0) {
      return !Doubles.isFinite(var0.U()) || !Doubles.isFinite(var0.T()) || !Doubles.isFinite(var0.q()) || !Floats.isFinite(var0.g()) || !Floats.isFinite(var0.Z());
   }

   public void f(net.m.t var1) {
      n.d(var1, this, this.D.j());
      if(z(var1)) {
         this.r(new net.cb.h("multiplayer.disconnect.invalid_vehicle_movement", new Object[0]));
      } else {
         net.ne.l var2 = this.D.o();
         if(var2 != this.D && var2.C() == this.D && var2 == this.A) {
            net.yv.d var3 = this.D.j();
            double var4 = var2.b;
            double var6 = var2.hS;
            double var8 = var2.hr;
            double var10 = var1.U();
            double var12 = var1.T();
            double var14 = var1.q();
            float var16 = var1.Z();
            float var17 = var1.g();
            double var18 = var10 - this.h;
            double var20 = var12 - this.l;
            double var22 = var14 - this.R;
            double var24 = var2.hf * var2.hf + var2.K * var2.K + var2.J * var2.J;
            double var26 = var18 * var18 + var20 * var20 + var22 * var22;
            if(var26 - var24 <= 100.0D || this.n.n() && this.n.Z().equals(var2.Q())) {
               boolean var28 = var3.h(var2, var2.i().d(0.0625D)).isEmpty();
               var18 = var10 - this.v;
               var20 = var12 - this.s - 1.0E-6D;
               var22 = var14 - this.w;
               var2.N(net.ne.f.PLAYER, var18, var20, var22);
               var18 = var10 - var2.b;
               var20 = var12 - var2.hS;
               if(var20 > -0.5D || var20 < 0.5D) {
                  var20 = 0.0D;
               }

               var22 = var14 - var2.hr;
               var26 = var18 * var18 + var20 * var20 + var22 * var22;
               boolean var31 = false;
               if(var26 > 0.0625D) {
                  var31 = true;
                  r.warn("{} moved wrongly!", var2.Q());
               }

               var2.D(var10, var12, var14, var16, var17);
               boolean var32 = var3.h(var2, var2.i().d(0.0625D)).isEmpty();
               var2.D(var4, var6, var8, var16, var17);
               this.c.F(new sh(var2));
               return;
            }

            r.warn("{} (vehicle of {}) moved too quickly! {},{},{}", var2.Q(), this.D.Q(), Double.valueOf(var18), Double.valueOf(var20), Double.valueOf(var22));
            this.c.F(new sh(var2));
            return;
         }
      }

   }

   public void b(net.m.w var1) {
      n.d(var1, this, this.D.j());
      if(var1.c() == this.o) {
         this.D.D(this.p.p, this.p.H, this.p.a, this.D.hN, this.D.V);
         if(this.D.__()) {
            this.O = this.p.p;
            this.B = this.p.H;
            this.G = this.p.a;
            this.D.vo();
         }

         this.p = null;
      }

   }

   public void L(qp var1) {
      n.d(var1, this, this.D.j());
      if(var1.f() == qp.v.SHOWN) {
         this.D.y().b(var1.g());
      } else if(var1.f() == qp.v.SETTINGS) {
         this.D.y().v(var1.v());
         this.D.y().U(var1.f());
      }

   }

   public void G(net.m.y var1) {
      n.d(var1, this, this.D.j());
      if(var1.D() == net.m.y.OPENED_TAB) {
         m_ var2 = var1.y();
         xc var3 = this.n.M().s(var2);
         this.D.S().K(var3);
      }

   }

   public void B(qo var1) {
      n.d(var1, this, this.D.j());
      if(U(var1)) {
         this.r(new net.cb.h("multiplayer.disconnect.invalid_player_movement", new Object[0]));
      } else {
         net.yv.d var2 = this.n.n(this.D.y);
         if(!this.D.tB) {
            if(this.M == 0) {
               this.X();
            }

            if(this.p != null) {
               if(this.M - this.Q > 20) {
                  this.Q = this.M;
                  this.k(this.p.p, this.p.H, this.p.a, this.D.hN, this.D.V);
               }
            } else {
               this.Q = this.M;
               if(this.D.M()) {
                  this.D.D(this.D.b, this.D.hS, this.D.hr, var1.n(this.D.hN), var1.U(this.D.V));
                  this.n.c().H(this.D);
               } else {
                  double var3 = this.D.b;
                  double var5 = this.D.hS;
                  double var7 = this.D.hr;
                  double var9 = this.D.hS;
                  double var11 = var1.F(this.D.b);
                  double var13 = var1.S(this.D.hS);
                  double var15 = var1.v(this.D.hr);
                  float var17 = var1.n(this.D.hN);
                  float var18 = var1.U(this.D.V);
                  double var19 = var11 - this.L;
                  double var21 = var13 - this.g;
                  double var23 = var15 - this.m;
                  double var25 = this.D.hf * this.D.hf + this.D.K * this.D.K + this.D.J * this.D.J;
                  double var27 = var19 * var19 + var21 * var21 + var23 * var23;
                  if(this.D.L()) {
                     if(var27 > 1.0D) {
                        this.k(this.D.b, this.D.hS, this.D.hr, var1.n(this.D.hN), var1.U(this.D.V));
                     }
                  } else {
                     ++this.i;
                     int var29 = this.i - this.W;
                     if(var29 > 5) {
                        r.debug("{} is sending move packets too frequently ({} packets since last tick)", this.D.Q(), Integer.valueOf(var29));
                        var29 = 1;
                     }

                     if(!this.D.__() && (!this.D.j().N().b("disableElytraMovementCheck") || !this.D.I())) {
                        float var30 = this.D.I()?300.0F:100.0F;
                        if(var27 - var25 > (double)(var30 * (float)var29) && (!this.n.n() || !this.n.Z().equals(this.D.Q()))) {
                           r.warn("{} moved too quickly! {},{},{}", this.D.Q(), Double.valueOf(var19), Double.valueOf(var21), Double.valueOf(var23));
                           this.k(this.D.b, this.D.hS, this.D.hr, this.D.hN, this.D.V);
                           return;
                        }
                     }

                     boolean var42 = var2.h(this.D, this.D.i().d(0.0625D)).isEmpty();
                     var19 = var11 - this.O;
                     var21 = var13 - this.B;
                     var23 = var15 - this.G;
                     if(this.D.k && !var1.i() && var21 > 0.0D) {
                        this.D.Z();
                     }

                     this.D.N(net.ne.f.PLAYER, var19, var21, var23);
                     this.D.k = var1.i();
                     double var31 = var21;
                     var19 = var11 - this.D.b;
                     var21 = var13 - this.D.hS;
                     if(var21 > -0.5D || var21 < 0.5D) {
                        var21 = 0.0D;
                     }

                     var23 = var15 - this.D.hr;
                     var27 = var19 * var19 + var21 * var21 + var23 * var23;
                     boolean var33 = false;
                     if(!this.D.__() && var27 > 0.0625D && !this.D.L() && !this.D.tA.x() && this.D.tA.V() != o9.SPECTATOR) {
                        var33 = true;
                        r.warn("{} moved wrongly!", this.D.Q());
                     }

                     this.D.D(var11, var13, var15, var17, var18);
                     this.D.f(this.D.b - var3, this.D.hS - var5, this.D.hr - var7);
                     if(!this.D.r && !this.D.L()) {
                        boolean var34 = var2.h(this.D, this.D.i().d(0.0625D)).isEmpty();
                        this.k(var3, var5, var7, var17, var18);
                        return;
                     }

                     this.T = var31 >= -0.03125D;
                     this.T &= !this.n.J() && !this.D.a6.P;
                     this.T &= !this.D.J(b.A) && !this.D.I() && !var2.T(this.D.i().x(0.0625D).T(0.0D, -0.55D, 0.0D));
                     this.D.k = var1.i();
                     this.n.c().H(this.D);
                     this.D.D(this.D.hS - var9, var1.i());
                     this.O = this.D.b;
                     this.B = this.D.hS;
                     this.G = this.D.hr;
                  }
               }
            }
         }
      }

   }

   public void k(double var1, double var3, double var5, float var7, float var8) {
      this.G(var1, var3, var5, var7, var8, Collections.emptySet());
   }

   public void G(double var1, double var3, double var5, float var7, float var8, Set var9) {
      double var10 = var9.contains(s1.c.X)?this.D.b:0.0D;
      double var12 = var9.contains(s1.c.Y)?this.D.hS:0.0D;
      double var14 = var9.contains(s1.c.Z)?this.D.hr:0.0D;
      this.p = new net.u.r(var1 + var10, var3 + var12, var5 + var14);
      float var16 = var7;
      float var17 = var8;
      if(var9.contains(s1.c.Y_ROT)) {
         var16 = var7 + this.D.hN;
      }

      if(var9.contains(s1.c.X_ROT)) {
         var17 = var8 + this.D.V;
      }

      if(++this.o == Integer.MAX_VALUE) {
         this.o = 0;
      }

      this.Q = this.M;
      this.D.D(this.p.p, this.p.H, this.p.a, var16, var17);
      this.D.t1.h((k)(new s1(var1, var3, var5, var7, var8, var9, this.o)));
   }

   public void U(net.m.m var1) {
      n.d(var1, this, this.D.j());
      net.yv.d var2 = this.n.n(this.D.y);
      net.u.j var3 = var1.h();
      this.D.vi();
      switch(null.Q[var1.Q().ordinal()]) {
      case 1:
         if(!this.D.VX()) {
            ks var12 = this.D.o(net.yz.k.OFF_HAND);
            this.D.e(net.yz.k.OFF_HAND, this.D.o(net.yz.k.MAIN_HAND));
            this.D.e(net.yz.k.MAIN_HAND, var12);
         }

         return;
      case 2:
         if(!this.D.VX()) {
            this.D.O(false);
         }

         return;
      case 3:
         if(!this.D.VX()) {
            this.D.O(true);
         }

         return;
      case 4:
         this.D.h();
         return;
      case 5:
      case 6:
      case 7:
         double var4 = this.D.b - ((double)var3.t() + 0.5D);
         double var6 = this.D.hS - ((double)var3.h() + 0.5D) + 1.5D;
         double var8 = this.D.hr - ((double)var3.y() + 0.5D);
         double var10 = var4 * var4 + var6 * var6 + var8 * var8;
         if(var10 > 36.0D) {
            return;
         } else if(var3.h() >= this.n.C()) {
            return;
         } else {
            if(var1.Q() == net.m.m.START_DESTROY_BLOCK) {
               if(!this.n.M(var2, var3, this.D) && var2.T().U(var3)) {
                  this.D.tA.M(var3, var1.k());
               } else {
                  this.D.t1.h((k)(new sq(var2, var3)));
               }
            } else {
               if(var1.Q() == net.m.m.STOP_DESTROY_BLOCK) {
                  this.D.tA.g(var3);
               } else if(var1.Q() == net.m.m.ABORT_DESTROY_BLOCK) {
                  this.D.tA.U();
               }

               if(var2.Z(var3).n() != net.y1.l.q) {
                  this.D.t1.h((k)(new sq(var2, var3)));
               }
            }

            return;
         }
      default:
         throw new IllegalArgumentException("Invalid player action");
      }
   }

   public void v(net.m.r var1) {
      n.d(var1, this, this.D.j());
      net.yv.d var2 = this.n.n(this.D.y);
      net.yz.k var3 = var1.o();
      ks var4 = this.D.o(var3);
      net.u.j var5 = var1.g();
      aq var6 = var1.x();
      this.D.vi();
      if(var5.h() < this.n.C() - 1 || var6 != aq.UP && var5.h() < this.n.C()) {
         if(this.p == null && this.D.o((double)var5.t() + 0.5D, (double)var5.h() + 0.5D, (double)var5.y() + 0.5D) < 64.0D && !this.n.M(var2, var5, this.D) && var2.T().U(var5)) {
            this.D.tA.f(this.D, var2, var4, var3, var5, var6, var1.k(), var1.u(), var1.V());
         }
      } else {
         net.cb.h var7 = new net.cb.h("build.tooHigh", new Object[]{Integer.valueOf(this.n.C())});
         var7.E().i(net.cb.z.RED);
         this.D.t1.h((k)(new i0(var7, net.cb.c.GAME_INFO)));
      }

      this.D.t1.h((k)(new sq(var2, var5)));
      this.D.t1.h((k)(new sq(var2, var5.C(var6))));
   }

   public void Y(net.m.j var1) {
      n.d(var1, this, this.D.j());
      net.yv.d var2 = this.n.n(this.D.y);
      net.yz.k var3 = var1.k();
      ks var4 = this.D.o(var3);
      this.D.vi();
      if(!var4.B()) {
         this.D.tA.Y(this.D, var2, var4, var3);
      }

   }

   public void x(net.m.n var1) {
      n.d(var1, this, this.D.j());
      if(this.D.VX()) {
         net.ne.l var2 = null;
         net.yv.d[] var3 = this.n.w1;
         int var4 = var3.length;
         byte var5 = 0;
         if(var5 < var4) {
            net.yv.d var6 = var3[var5];
            var2 = var1.C(var6);
         }

         this.D.Y((net.ne.l)this.D);
         this.D.O();
         if(var2.hl == this.D.hl) {
            this.D.a(var2.b, var2.hS, var2.hr);
         } else {
            net.yv.d var7 = this.D.j();
            net.yv.d var8 = (net.yv.d)var2.hl;
            this.D.y = var2.y;
            this.h((k)(new p(this.D.y, var7.k(), var7.B().h(), this.D.tA.V())));
            this.n.c().g(this.D);
            var7.g(this.D);
            this.D.Z = false;
            this.D.S(var2.b, var2.hS, var2.hr, var2.hN, var2.V);
            if(this.D.P()) {
               var7.s(this.D, false);
               var8.S(this.D);
               var8.s(this.D, false);
            }

            this.D.B((net.yv.r)var8);
            this.n.c().U(this.D, var7);
            this.D.a(var2.b, var2.hS, var2.hr);
            this.D.tA.A(var8);
            this.n.c().A(this.D, var8);
            this.n.c().L(this.D);
         }
      }

   }

   public void W(net.m.k var1) {
   }

   public void f(net.m.u var1) {
      n.d(var1, this, this.D.j());
      net.ne.l var2 = this.D.D();
      if(var2 instanceof net.nm.b) {
         ((net.nm.b)var2).D(var1.s(), var1.q());
      }

   }

   public void d(net.cb.t var1) {
      r.info("{} lost connection: {}", this.D.Q(), var1.l());
      this.n.V();
      net.cb.h var2 = new net.cb.h("multiplayer.player.left", new Object[]{this.D.b()});
      var2.E().i(net.cb.z.YELLOW);
      this.n.c().b((net.cb.t)var2);
      this.D.vR();
      this.n.c().o(this.D);
      if(this.n.n() && this.D.Q().equals(this.n.Z())) {
         r.info("Stopping singleplayer server as player logged out");
         this.n.G();
      }

   }

   public void h(k var1) {
      if(var1 instanceof i0) {
         i0 var2 = (i0)var1;
         net.r.r var3 = this.D.y();
         if(var3 == net.r.r.HIDDEN && var2.Z() != net.cb.c.GAME_INFO) {
            return;
         }

         if(var3 == net.r.r.SYSTEM && !var2.l()) {
            return;
         }
      }

      this.c.F(var1);
   }

   public void i(net.m.s var1) {
      n.d(var1, this, this.D.j());
      if(var1.C() >= 0 && var1.C() < net.r.i.d()) {
         this.D.a8.r = var1.C();
         this.D.vi();
      } else {
         r.warn("{} tried to set an invalid carried item", this.D.Q());
      }

   }

   public void p(net.m.v var1) {
      n.d(var1, this, this.D.j());
      if(this.D.y() == net.r.r.HIDDEN) {
         net.cb.h var2 = new net.cb.h("chat.cannotSend", new Object[0]);
         var2.E().i(net.cb.z.RED);
         this.h((k)(new i0(var2)));
      } else {
         this.D.vi();
         String var4 = var1.d();
         var4 = StringUtils.normalizeSpace(var4);

         for(int var3 = 0; var3 < var4.length(); ++var3) {
            if(!a3.s(var4.charAt(var3))) {
               this.r(new net.cb.h("multiplayer.disconnect.illegal_characters", new Object[0]));
               return;
            }
         }

         if(var4.startsWith("/")) {
            this.W(var4);
         } else {
            net.cb.h var6 = new net.cb.h("chat.type.text", new Object[]{this.D.b(), var4});
            this.n.c().i(var6, false);
         }

         this.F += 20;
         if(this.F > 200 && !this.n.c().Q(this.D.e())) {
            this.r(new net.cb.h("disconnect.spam", new Object[0]));
         }
      }

   }

   private void W(String var1) {
      this.n.f().L(this.D, var1);
   }

   public void A(net.m.i var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      this.D.N(var1.J());
   }

   public void s(e var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      switch(null.y[var1.m().ordinal()]) {
      case 1:
         this.D.K(true);
         break;
      case 2:
         this.D.K(false);
         break;
      case 3:
         this.D.j(true);
         break;
      case 4:
         this.D.j(false);
         break;
      case 5:
         if(this.D.L()) {
            this.D.H(false, true, true);
            this.p = new net.u.r(this.D.b, this.D.hS, this.D.hr);
         }
         break;
      case 6:
         if(this.D.D() instanceof net.ne.t) {
            net.ne.t var5 = (net.ne.t)this.D.D();
            int var3 = var1.P();
            if(var5.D()) {
               var5.p(var3);
            }
         }
         break;
      case 7:
         if(this.D.D() instanceof net.ne.t) {
            net.ne.t var4 = (net.ne.t)this.D.D();
            var4.H();
         }
         break;
      case 8:
         if(this.D.D() instanceof net.yn.j) {
            ((net.yn.j)this.D.D()).t(this.D);
         }
         break;
      case 9:
         if(!this.D.k && this.D.K < 0.0D && !this.D.I() && !this.D.p()) {
            ks var2 = this.D.U(z2.CHEST);
            if(var2.Z() == net.nb.j.SB && yi.C(var2)) {
               this.D.v_();
            }
         } else {
            this.D.vv();
         }
         break;
      default:
         throw new IllegalArgumentException("Invalid client command!");
      }

   }

   public void u(net.m.p var1) {
      n.d(var1, this, this.D.j());
      net.yv.d var2 = this.n.n(this.D.y);
      net.ne.l var3 = var1.g(var2);
      this.D.vi();
      boolean var4 = this.D.b((net.ne.l)var3);
      double var5 = 36.0D;
      var5 = 9.0D;
      if(this.D.F(var3) < var5) {
         if(var1.L() == net.m.p.INTERACT) {
            net.yz.k var7 = var1.b();
            this.D.e(var3, var7);
         } else if(var1.L() == net.m.p.INTERACT_AT) {
            net.yz.k var9 = var1.b();
            var3.v(this.D, var1.g(), var9);
         } else if(var1.L() == net.m.p.ATTACK) {
            if(var3 instanceof net.nm.i || var3 instanceof net.nm.s || var3 instanceof net.n1.o || var3 == this.D) {
               this.r(new net.cb.h("multiplayer.disconnect.invalid_entity_attacked", new Object[0]));
               this.n.F("Player " + this.D.Q() + " tried to attack an invalid entity");
               return;
            }

            this.D.r(var3);
         }
      }

   }

   public void R(net.m.a var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      net.m.a var2 = var1.d();
      switch(null.x[var2.ordinal()]) {
      case 1:
         if(this.D.tB) {
            this.D.tB = false;
            this.D = this.n.c().M(this.D, 0, true);
            b2.v.l(this.D, net.yv.h.THE_END, net.yv.h.OVERWORLD);
         } else {
            if(this.D.h() > 0.0F) {
               return;
            }

            this.D = this.n.c().M(this.D, 0, false);
            if(this.n.h()) {
               this.D.s(o9.SPECTATOR);
               this.D.j().N().T("spectatorsGenerateChunks", "false");
            }
         }
         break;
      case 2:
         this.D.b().E(this.D);
      }

   }

   public void A(net.m.f var1) {
      n.d(var1, this, this.D.j());
      this.D.vQ();
   }

   public void q(qz var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      if(this.D.aG.S == var1.E() && this.D.aG.D((net.r.r)this.D)) {
         if(this.D.VX()) {
            net.yz.w var2 = net.yz.w.T();

            for(int var3 = 0; var3 < this.D.aG.e.size(); ++var3) {
               var2.add(((net.nl.o)this.D.aG.e.get(var3)).y());
            }

            this.D.R(this.D.aG, var2);
         } else {
            ks var7 = this.D.aG.p(var1.j(), var1.B(), var1.l(), this.D);
            if(ks.D(var1.e(), var7)) {
               this.D.t1.h((k)(new sz(var1.E(), var1.y(), true)));
               this.D.tK = true;
               this.D.aG.u();
               this.D.vg();
               this.D.tK = false;
            } else {
               this.I.t(this.D.aG.S, Short.valueOf(var1.y()));
               this.D.t1.h((k)(new sz(var1.E(), var1.y(), false)));
               this.D.aG.r(this.D, false);
               net.yz.w var8 = net.yz.w.T();

               for(int var4 = 0; var4 < this.D.aG.e.size(); ++var4) {
                  ks var5 = ((net.nl.o)this.D.aG.e.get(var4)).y();
                  ks var6 = var5.B()?ks.a:var5;
                  var8.add(var6);
               }

               this.D.R(this.D.aG, var8);
            }
         }
      }

   }

   public void H(net.m.q var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      if(!this.D.VX() && this.D.aG.S == var1.G() && this.D.aG.D((net.r.r)this.D)) {
         this.e.G(this.D, var1.k(), var1.y());
      }

   }

   public void z(net.m.g var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      if(this.D.aG.S == var1.O() && this.D.aG.D((net.r.r)this.D) && !this.D.VX()) {
         this.D.aG.A(this.D, var1.V());
         this.D.aG.u();
      }

   }

   public void R(net.m.o var1) {
      n.d(var1, this, this.D.j());
      if(this.D.tA.x()) {
         if(var1.M() < 0) {
            boolean var10000 = true;
         } else {
            boolean var8 = false;
         }

         ks var3 = var1.K();
         if(!var3.B() && var3.D() && var3.o().K("BlockEntityTag", 10)) {
            net.nj.f var4 = var3.o().o("BlockEntityTag");
            if(var4.G("x") && var4.G("y") && var4.G("z")) {
               net.u.j var5 = new net.u.j(var4.P("x"), var4.P("y"), var4.P("z"));
               net.ni.v var6 = this.D.hl.L(var5);
               net.nj.f var7 = var6.b(new net.nj.f());
               var7.A("x");
               var7.A("y");
               var7.A("z");
               var3.Q("BlockEntityTag", var7);
            }
         }

         if(var1.M() >= 1 && var1.M() <= 45) {
            boolean var10 = true;
         } else {
            boolean var9 = false;
         }

         if(!var3.B() && (var3.n() < 0 || var3.U() > 64 || var3.B())) {
            boolean var12 = false;
         } else {
            boolean var11 = true;
         }

         if(var3.B()) {
            this.D.aW.e(var1.M(), ks.a);
         } else {
            this.D.aW.e(var1.M(), var3);
         }

         this.D.aW.r(this.D, true);
      }

   }

   public void K(net.m.b var1) {
      n.d(var1, this, this.D.j());
      Short var2 = (Short)this.I.b(this.D.aG.S);
      if(var1.F() == var2.shortValue() && this.D.aG.S == var1.g() && !this.D.aG.D((net.r.r)this.D) && !this.D.VX()) {
         this.D.aG.r(this.D, true);
      }

   }

   public void D(net.m.z var1) {
      n.d(var1, this, this.D.j());
      this.D.vi();
      net.yv.d var2 = this.n.n(this.D.y);
      net.u.j var3 = var1.a();
      if(var2.o(var3)) {
         net.yw.n var4 = var2.Z(var3);
         net.ni.v var5 = var2.L(var3);
         if(!(var5 instanceof sg)) {
            return;
         }

         sg var6 = (sg)var5;
         if(!var6.c() || var6.Z() != this.D) {
            this.n.F("Player " + this.D.Q() + " just tried to change non-editable sign");
            return;
         }

         String[] var7 = var1.U();

         for(int var8 = 0; var8 < var7.length; ++var8) {
            var6.k[var8] = new net.cb.l(net.cb.z.q(var7[var8]));
         }

         var6.W();
         var2.V(var3, var4, var4, 3);
      }

   }

   public void u(qs var1) {
      if(this.U && var1.S() == this.S) {
         int var2 = (int)(this.i() - this.j);
         this.D.t7 = (this.D.t7 * 3 + var2) / 4;
         this.U = false;
      } else if(!this.D.Q().equals(this.n.Z())) {
         this.r(new net.cb.h("disconnect.timeout", new Object[0]));
      }

   }

   private long i() {
      return System.nanoTime() / 1000000L;
   }

   public void M(net.m.c var1) {
      n.d(var1, this, this.D.j());
      this.D.a6.n = var1.J() && this.D.a6.P;
   }

   public void G(net.m.d var1) {
      n.d(var1, this, this.D.j());
      ArrayList var2 = Lists.newArrayList();

      for(String var4 : this.n.V(this.D, var1.S(), var1.v(), var1.Y())) {
         var2.add(var4);
      }

      this.D.t1.h((k)(new net.no.g((String[])var2.toArray(new String[var2.size()]))));
   }

   public void Y(net.m.h var1) {
      n.d(var1, this, this.D.j());
      this.D.k(var1);
   }

   public void h(net.m.l var1) {
      h.X();
      n.d(var1, this, this.D.j());
      String var3 = var1.x();
      if("MC|BEdit".equals(var3)) {
         h var4 = var1.S();
         ks var5 = var4.C();
         if(var5.B()) {
            return;
         }

         if(!kd.e(var5.o())) {
            throw new IOException("Invalid book tag!");
         }

         ks var6 = this.D.S();
         if(var6.B()) {
            return;
         }

         if(var5.Z() == net.nb.j.WZ && var5.Z() == var6.Z()) {
            var6.Q("pages", var5.o().A("pages", 8));
         }
      }

      if("MC|BSign".equals(var3)) {
         h var20 = var1.S();
         ks var28 = var20.C();
         if(var28.B()) {
            return;
         }

         if(!k5.e(var28.o())) {
            throw new IOException("Invalid book tag!");
         }

         ks var36 = this.D.S();
         if(var36.B()) {
            return;
         }

         if(var28.Z() == net.nb.j.WZ && var36.Z() == net.nb.j.WZ) {
            ks var7 = new ks(net.nb.j.e);
            var7.Q("author", new net.nj.y(this.D.Q()));
            var7.Q("title", new net.nj.y(var28.o().J("title")));
            net.nj.h var8 = var28.o().A("pages", 8);
            int var9 = 0;
            if(var9 < var8.z()) {
               String var10 = var8.w(var9);
               net.cb.l var11 = new net.cb.l(var10);
               var10 = net.cb.t.m((net.cb.t)var11);
               var8.S(var9, new net.nj.y(var10));
               ++var9;
            }

            var7.Q("pages", var8);
            this.D.u(z2.MAINHAND, var7);
         }
      }

      if("MC|TrSel".equals(var3)) {
         int var21 = var1.S().readInt();
         net.nl.v var29 = this.D.aG;
         if(var29 instanceof net.nl.q) {
            ((net.nl.q)var29).C(var21);
         }
      } else {
         if("MC|AdvCmd".equals(var3)) {
            if(!this.n.X()) {
               this.D.r((net.cb.t)(new net.cb.h("advMode.notEnabled", new Object[0])));
               return;
            }

            if(!this.D.Vm()) {
               this.D.r((net.cb.t)(new net.cb.h("advMode.notAllowed", new Object[0])));
               return;
            }

            h var22 = var1.S();
            byte var30 = var22.readByte();
            net.ni.w var37 = null;
            if(var30 == 0) {
               net.ni.v var41 = this.D.hl.L(new net.u.j(var22.readInt(), var22.readInt(), var22.readInt()));
               if(var41 instanceof net.ni.q) {
                  var37 = ((net.ni.q)var41).d();
               }
            } else if(var30 == 1) {
               net.ne.l var42 = this.D.hl.S(var22.readInt());
               if(var42 instanceof net.nm.p) {
                  var37 = ((net.nm.p)var42).o();
               }
            }

            String var43 = var22.Z(var22.readableBytes());
            boolean var47 = var22.readBoolean();
            if(var37 != null) {
               var37.a(var43);
               var37.f(var47);
               var37.u((net.cb.t)null);
               var37.V();
               this.D.r((net.cb.t)(new net.cb.h("advMode.setCommand.success", new Object[]{var43})));
            }
         }

         if("MC|AutoCmd".equals(var3)) {
            if(!this.n.X()) {
               this.D.r((net.cb.t)(new net.cb.h("advMode.notEnabled", new Object[0])));
               return;
            }

            if(!this.D.Vm()) {
               this.D.r((net.cb.t)(new net.cb.h("advMode.notAllowed", new Object[0])));
               return;
            }

            h var23 = var1.S();
            net.ni.w var31 = null;
            net.ni.q var38 = null;
            net.u.j var44 = new net.u.j(var23.readInt(), var23.readInt(), var23.readInt());
            net.ni.v var48 = this.D.hl.L(var44);
            if(var48 instanceof net.ni.q) {
               var38 = (net.ni.q)var48;
               var31 = var38.d();
            }

            String var52 = var23.Z(var23.readableBytes());
            boolean var56 = var23.readBoolean();
            net.ni.q var58 = net.ni.q.valueOf(var23.Z(16));
            boolean var12 = var23.readBoolean();
            boolean var13 = var23.readBoolean();
            aq var14 = (aq)this.D.hl.Z(var44).i(zc.c);
            switch(null.Z[var58.ordinal()]) {
            case 1:
               net.yw.n var15 = net.nb.f.Tc.p();
               this.D.hl.k(var44, var15.s(zc.c, var14).s(zc.r, Boolean.valueOf(var12)), 2);
            case 2:
               net.yw.n var16 = net.nb.f.M.p();
               this.D.hl.k(var44, var16.s(zc.c, var14).s(zc.r, Boolean.valueOf(var12)), 2);
            case 3:
               net.yw.n var17 = net.nb.f.i.p();
               this.D.hl.k(var44, var17.s(zc.c, var14).s(zc.r, Boolean.valueOf(var12)), 2);
            default:
               var48.Q();
               this.D.hl.Z(var44, var48);
               var31.a(var52);
               var31.f(var56);
               if(!var56) {
                  var31.u((net.cb.t)null);
               }

               var38.v(var13);
               var31.V();
               if(!a7.Y(var52)) {
                  this.D.r((net.cb.t)(new net.cb.h("advMode.setCommand.success", new Object[]{var52})));
               }
            }
         }

         if("MC|Beacon".equals(var3)) {
            if(this.D.aG instanceof net.nl.y) {
               h var24 = var1.S();
               int var32 = var24.readInt();
               int var39 = var24.readInt();
               net.nl.y var45 = (net.nl.y)this.D.aG;
               net.nl.o var49 = var45.f(0);
               if(var49.T()) {
                  var49.h(1);
                  z1 var53 = var45.L();
                  var53.Z(1, var32);
                  var53.Z(2, var39);
                  var53.W();
               }
            }
         } else {
            if("MC|ItemName".equals(var3)) {
               if(!(this.D.aG instanceof net.nl.r)) {
                  return;
               }

               net.nl.r var25 = (net.nl.r)this.D.aG;
               if(var1.S() != null && var1.S().readableBytes() >= 1) {
                  String var33 = a3.u(var1.S().Z(32767));
                  if(var33.length() <= 35) {
                     var25.Z(var33);
                  }
               }

               var25.Z("");
            }

            if("MC|Struct".equals(var3)) {
               if(!this.D.Vm()) {
                  return;
               }

               h var26 = var1.S();
               net.u.j var34 = new net.u.j(var26.readInt(), var26.readInt(), var26.readInt());
               net.yw.n var40 = this.D.hl.Z(var34);
               net.ni.v var46 = this.D.hl.L(var34);
               if(var46 instanceof sl) {
                  sl var50 = (sl)var46;
                  byte var54 = var26.readByte();
                  String var57 = var26.Z(32);
                  var50.m(sl.s.valueOf(var57));
                  var50.B(var26.Z(64));
                  int var59 = net.u.t.g(var26.readInt(), -32, 32);
                  int var60 = net.u.t.g(var26.readInt(), -32, 32);
                  int var61 = net.u.t.g(var26.readInt(), -32, 32);
                  var50.n(new net.u.j(var59, var60, var61));
                  int var62 = net.u.t.g(var26.readInt(), 0, 32);
                  int var63 = net.u.t.g(var26.readInt(), 0, 32);
                  int var64 = net.u.t.g(var26.readInt(), 0, 32);
                  var50.C(new net.u.j(var62, var63, var64));
                  String var65 = var26.Z(32);
                  var50.C(ax.valueOf(var65));
                  String var18 = var26.Z(32);
                  var50.t(net.yz.l.valueOf(var18));
                  var50.f(var26.Z(128));
                  var50.i(var26.readBoolean());
                  var50.D(var26.readBoolean());
                  var50.V(var26.readBoolean());
                  var50.P(net.u.t.T(var26.readFloat(), 0.0F, 1.0F));
                  var50.j(var26.M());
                  String var19 = var50.O();
                  if(var54 == 2) {
                     if(var50.T()) {
                        this.D.g(new net.cb.h("structure_block.save_success", new Object[]{var19}), false);
                     }

                     this.D.g(new net.cb.h("structure_block.save_failure", new Object[]{var19}), false);
                  }

                  if(var54 == 3) {
                     if(!var50.K()) {
                        this.D.g(new net.cb.h("structure_block.load_not_found", new Object[]{var19}), false);
                     }

                     if(var50.W()) {
                        this.D.g(new net.cb.h("structure_block.load_success", new Object[]{var19}), false);
                     }

                     this.D.g(new net.cb.h("structure_block.load_prepare", new Object[]{var19}), false);
                  }

                  if(var54 == 4) {
                     if(var50.P()) {
                        this.D.g(new net.cb.h("structure_block.size_success", new Object[]{var19}), false);
                     }

                     this.D.g(new net.cb.h("structure_block.size_failure", new Object[0]), false);
                  }

                  var50.W();
                  this.D.hl.V(var34, var40, var40, 3);
               }
            }

            if("MC|PickItem".equals(var3)) {
               h var27 = var1.S();
               int var35 = var27.q();
               this.D.a8.Z(var35);
               this.D.t1.h((k)(new net.no.r(-2, this.D.a8.r, this.D.a8.A(this.D.a8.r))));
               this.D.t1.h((k)(new net.no.r(-2, var35, this.D.a8.A(var35))));
               this.D.t1.h((k)(new sr(this.D.a8.r)));
            }
         }
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
