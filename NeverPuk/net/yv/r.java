package net.yv;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net._x;
import net.wg;
import net.xj;
import net.z8;
import net.ns.i9;
import net.y9.g5;
import net.y9.r0;
import net.yv.c;
import net.yv.g;
import net.yv.j;
import net.yv.l;
import net.yv.o8;
import net.yv.oj;
import net.yv.ov;
import net.yv.p;
import net.yv.t;
import net.yv.u;
import net.yv.w;
import net.yz.a4;
import net.yz.ai;
import net.yz.aq;

public abstract class r implements o8 {
   private int U = 63;
   protected boolean f;
   public final List J = Lists.newArrayList();
   protected final List q = Lists.newArrayList();
   public final List S = Lists.newArrayList();
   public final List o = Lists.newArrayList();
   private final List g = Lists.newArrayList();
   private final List L = Lists.newArrayList();
   public final List A = Lists.newArrayList();
   public final List T = Lists.newArrayList();
   protected final a4 Q = new a4();
   private final long W = 16777215L;
   private int h;
   protected int D = (new Random()).nextInt();
   protected final int c = 1013904223;
   protected float u;
   protected float n;
   protected float k;
   protected float l;
   private int z;
   public final Random G = new Random();
   public final c F;
   protected net.b.g s = new net.b.g();
   protected List V;
   protected net.l.h m;
   protected final net.cg.d v;
   protected net.cg.z y;
   protected boolean N;
   protected net.cg.y i;
   protected net.nq.w P;
   protected net.y7.t b;
   protected wg O;
   protected xj B;
   public final net.yk.t M;
   private final Calendar E;
   protected net.nc.b H;
   public final boolean x;
   protected boolean R;
   protected boolean K;
   private boolean d;
   private final net.nz.p a;
   int[] r;
   private static net.u.d[] C;

   protected r(net.cg.d var1, net.cg.z var2, c var3, net.yk.t var4, boolean var5) {
      this.V = Lists.newArrayList(new oj[]{this.s});
      this.E = Calendar.getInstance();
      this.H = new net.nc.b();
      this.R = true;
      this.K = true;
      this.r = new int['耀'];
      this.v = var1;
      this.M = var4;
      this.y = var2;
      this.F = var3;
      this.x = var5;
      this.a = var3.E();
   }

   public r H() {
      return this;
   }

   public net.ns.i P(net.u.j var1) {
      if(this.o(var1)) {
         net.l.q var2 = this.d(var1);
         return var2.b(var1, this.F.p());
      } else {
         return this.F.p().L(var1, net.nb.x.v);
      }
   }

   public i9 V() {
      return this.F.p();
   }

   protected abstract net.l.h X();

   public void h(t var1) {
      this.y.H(true);
   }

   @Nullable
   public net.nx.f v() {
      return null;
   }

   public void A() {
      this.B(new net.u.j(8, 64, 8));
   }

   public net.yw.n i(net.u.j var1) {
      net.u.j var2;
      for(var2 = new net.u.j(var1.t(), this.k(), var1.y()); !this.y(var2.h()); var2 = var2.h()) {
         ;
      }

      return this.Z(var2);
   }

   private boolean p(net.u.j var1) {
      return !this.h(var1) && var1.t() >= -30000000 && var1.y() >= -30000000 && var1.t() < 30000000 && var1.y() < 30000000;
   }

   private boolean h(net.u.j var1) {
      return var1.h() < 0 || var1.h() >= 256;
   }

   public boolean y(net.u.j var1) {
      return this.Z(var1).n() == net.y1.l.q;
   }

   public boolean o(net.u.j var1) {
      return this.g(var1, true);
   }

   public boolean g(net.u.j var1, boolean var2) {
      return this.T(var1.t() >> 4, var1.y() >> 4, var2);
   }

   public boolean a(net.u.j var1, int var2) {
      return this.k(var1, var2, true);
   }

   public boolean k(net.u.j var1, int var2, boolean var3) {
      return this.b(var1.t() - var2, var1.h() - var2, var1.y() - var2, var1.t() + var2, var1.h() + var2, var1.y() + var2, var3);
   }

   public boolean C(net.u.j var1, net.u.j var2) {
      return this.m(var1, var2, true);
   }

   public boolean m(net.u.j var1, net.u.j var2, boolean var3) {
      return this.b(var1.t(), var1.h(), var1.y(), var2.t(), var2.h(), var2.y(), var3);
   }

   public boolean z(net.y4.v var1) {
      return this.L(var1, true);
   }

   public boolean L(net.y4.v var1, boolean var2) {
      return this.b(var1.i, var1.D, var1.p, var1.e, var1.P, var1.J, var2);
   }

   private boolean b(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if(var2 >= 256) {
         return false;
      } else {
         var1 = var1 >> 4;
         var3 = var3 >> 4;
         var4 = var4 >> 4;
         var6 = var6 >> 4;

         for(int var8 = var1; var8 <= var4; ++var8) {
            for(int var9 = var3; var9 <= var6; ++var9) {
               if(!this.T(var8, var9, var7)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   protected abstract boolean T(int var1, int var2, boolean var3);

   public net.l.q d(net.u.j var1) {
      return this.q(var1.t() >> 4, var1.y() >> 4);
   }

   public net.l.q q(int var1, int var2) {
      return this.m.N(var1, var2);
   }

   public boolean P(int var1, int var2) {
      return this.T(var1, var2, false) || this.m.S(var1, var2);
   }

   public boolean k(net.u.j var1, net.yw.n var2, int var3) {
      if(this.h(var1)) {
         return false;
      } else if(!this.x && this.y.h() == j.J) {
         return false;
      } else {
         net.l.q var4 = this.d(var1);
         var2.Q();
         net.yw.n var6 = var4.V(var1, var2);
         return false;
      }
   }

   public boolean J(net.u.j var1) {
      return this.k(var1, net.nb.f.ou.p(), 3);
   }

   public boolean e(net.u.j var1, boolean var2) {
      net.yw.n var3 = this.Z(var1);
      net.y9.l var4 = var3.Q();
      if(var3.n() == net.y1.l.q) {
         return false;
      } else {
         this.s(2001, var1, net.y9.l.m(var3));
         var4.N(this, var1, var3, 0);
         return this.k(var1, net.nb.f.ou.p(), 3);
      }
   }

   public boolean U(net.u.j var1, net.yw.n var2) {
      return this.k(var1, var2, 3);
   }

   public void V(net.u.j var1, net.yw.n var2, net.yw.n var3, int var4) {
      for(int var5 = 0; var5 < this.V.size(); ++var5) {
         ((oj)this.V.get(var5)).b(this, var1, var2, var3, var4);
      }

   }

   public void c(net.u.j var1, net.y9.l var2, boolean var3) {
      if(this.y.h() != j.J) {
         this.b(var1, var2, var3);
      }

   }

   public void W(int var1, int var2, int var3, int var4) {
      if(var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if(this.F.A()) {
         for(int var6 = var3; var6 <= var4; ++var6) {
            this.b(w.SKY, new net.u.j(var1, var6, var2));
         }
      }

      this.Y(var1, var3, var2, var1, var4, var2);
   }

   public void k(net.u.j var1, net.u.j var2) {
      this.Y(var1.t(), var1.h(), var1.y(), var2.t(), var2.h(), var2.y());
   }

   public void Y(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.V.size(); ++var7) {
         ((oj)this.V.get(var7)).t(var1, var2, var3, var4, var5, var6);
      }

   }

   public void q(net.u.j var1, net.y9.l var2) {
      this.N(var1.H(), var2, var1);
      this.N(var1.g(), var2, var1);
      this.N(var1.b(), var2, var1);
      this.N(var1.h(), var2, var1);
      this.N(var1.D(), var2, var1);
      this.N(var1.d(), var2, var1);
   }

   public void b(net.u.j var1, net.y9.l var2, boolean var3) {
      this.H(var1.H(), var2, var1);
      this.H(var1.g(), var2, var1);
      this.H(var1.b(), var2, var1);
      this.H(var1.h(), var2, var1);
      this.H(var1.D(), var2, var1);
      this.H(var1.d(), var2, var1);
      this.q(var1, var2);
   }

   public void Q(net.u.j var1, net.y9.l var2, aq var3) {
      if(var3 != aq.WEST) {
         this.H(var1.H(), var2, var1);
      }

      if(var3 != aq.EAST) {
         this.H(var1.g(), var2, var1);
      }

      if(var3 != aq.DOWN) {
         this.H(var1.b(), var2, var1);
      }

      if(var3 != aq.UP) {
         this.H(var1.h(), var2, var1);
      }

      if(var3 != aq.NORTH) {
         this.H(var1.D(), var2, var1);
      }

      if(var3 != aq.SOUTH) {
         this.H(var1.d(), var2, var1);
      }

   }

   public void H(net.u.j var1, net.y9.l var2, net.u.j var3) {
      if(!this.x) {
         net.yw.n var4 = this.Z(var1);
         var4.q(this, var1, var2, var3);
      }

   }

   public void N(net.u.j var1, net.y9.l var2, net.u.j var3) {
      if(!this.x) {
         net.yw.n var4 = this.Z(var1);
         if(var4.Q() == net.nb.f.ui) {
            ((r0)var4.Q()).m(var4, this, var1, var2, var3);
         }
      }

   }

   public boolean M(net.u.j var1, net.y9.l var2) {
      return false;
   }

   public boolean V(net.u.j var1) {
      return this.d(var1).C(var1);
   }

   public boolean W(net.u.j var1) {
      if(var1.h() >= this.k()) {
         return this.V(var1);
      } else {
         net.u.j var2 = new net.u.j(var1.t(), this.k(), var1.y());
         if(!this.V(var2)) {
            return false;
         } else {
            for(net.u.j var3 = var2.b(); var3.h() > var1.h(); var3 = var3.b()) {
               net.yw.n var4 = this.Z(var3);
               if(var4.K() > 0 && !var4.n().y()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public int s(net.u.j var1) {
      if(var1.h() < 0) {
         return 0;
      } else {
         if(var1.h() >= 256) {
            var1 = new net.u.j(var1.t(), 255, var1.y());
         }

         return this.d(var1).j(var1, 0);
      }
   }

   public int y(net.u.j var1) {
      return this.m(var1, true);
   }

   public int m(net.u.j var1, boolean var2) {
      if(var1.t() >= -30000000 && var1.y() >= -30000000 && var1.t() < 30000000 && var1.y() < 30000000) {
         if(this.Z(var1).A()) {
            int var8 = this.m(var1.h(), false);
            int var4 = this.m(var1.g(), false);
            int var5 = this.m(var1.H(), false);
            int var6 = this.m(var1.d(), false);
            int var7 = this.m(var1.D(), false);
            if(var4 > var8) {
               var8 = var4;
            }

            if(var5 > var8) {
               var8 = var5;
            }

            if(var6 > var8) {
               var8 = var6;
            }

            if(var7 > var8) {
               var8 = var7;
            }

            return var8;
         } else if(var1.h() < 0) {
            return 0;
         } else {
            if(var1.h() >= 256) {
               var1 = new net.u.j(var1.t(), 255, var1.y());
            }

            net.l.q var3 = this.d(var1);
            return var3.j(var1, this.h);
         }
      } else {
         return 15;
      }
   }

   public net.u.j A(net.u.j var1) {
      return new net.u.j(var1.t(), this.J(var1.t(), var1.y()), var1.y());
   }

   public int J(int var1, int var2) {
      int var3;
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(this.T(var1 >> 4, var2 >> 4, true)) {
            var3 = this.q(var1 >> 4, var2 >> 4).s(var1 & 15, var2 & 15);
         } else {
            var3 = 0;
         }
      } else {
         var3 = this.k() + 1;
      }

      return var3;
   }

   /** @deprecated */
   @Deprecated
   public int Y(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.T(var1 >> 4, var2 >> 4, true)) {
            return 0;
         } else {
            net.l.q var3 = this.q(var1 >> 4, var2 >> 4);
            return var3.E();
         }
      } else {
         return this.k() + 1;
      }
   }

   public int n(w var1, net.u.j var2) {
      if(!this.F.A() && var1 == w.SKY) {
         return 0;
      } else {
         if(var2.h() < 0) {
            var2 = new net.u.j(var2.t(), 0, var2.y());
         }

         if(!this.p(var2)) {
            return var1.defaultLightValue;
         } else if(!this.o(var2)) {
            return var1.defaultLightValue;
         } else if(this.Z(var2).A()) {
            int var8 = this.d(var1, var2.h());
            int var4 = this.d(var1, var2.g());
            int var5 = this.d(var1, var2.H());
            int var6 = this.d(var1, var2.d());
            int var7 = this.d(var1, var2.D());
            if(var4 > var8) {
               var8 = var4;
            }

            if(var5 > var8) {
               var8 = var5;
            }

            if(var6 > var8) {
               var8 = var6;
            }

            if(var7 > var8) {
               var8 = var7;
            }

            return var8;
         } else {
            net.l.q var3 = this.d(var2);
            return var3.C(var1, var2);
         }
      }
   }

   public int d(w var1, net.u.j var2) {
      if(var2.h() < 0) {
         var2 = new net.u.j(var2.t(), 0, var2.y());
      }

      if(!this.p(var2)) {
         return var1.defaultLightValue;
      } else if(!this.o(var2)) {
         return var1.defaultLightValue;
      } else {
         net.l.q var3 = this.d(var2);
         return var3.C(var1, var2);
      }
   }

   public void V(w var1, net.u.j var2, int var3) {
      if(this.p(var2) && this.o(var2)) {
         net.l.q var4 = this.d(var2);
         var4.B(var1, var2, var3);
         this.m(var2);
      }

   }

   public void m(net.u.j var1) {
      for(int var2 = 0; var2 < this.V.size(); ++var2) {
         ((oj)this.V.get(var2)).s(var1);
      }

   }

   public int z(net.u.j var1, int var2) {
      int var3 = this.n(w.SKY, var1);
      int var4 = this.n(w.BLOCK, var1);
      if(var4 < var2) {
         var4 = var2;
      }

      return var3 << 20 | var4 << 4;
   }

   public float u(net.u.j var1) {
      return this.F.U()[this.y(var1)];
   }

   public net.yw.n Z(net.u.j var1) {
      if(this.h(var1)) {
         return net.nb.f.ou.p();
      } else {
         net.l.q var2 = this.d(var1);
         return var2.u(var1);
      }
   }

   public boolean u() {
      return this.h < 4;
   }

   @Nullable
   public net.u.m d(net.u.r var1, net.u.r var2) {
      return this.s(var1, var2, false, false, false);
   }

   @Nullable
   public net.u.m v(net.u.r var1, net.u.r var2, boolean var3) {
      return this.s(var1, var2, var3, false, false);
   }

   @Nullable
   public net.u.m s(net.u.r var1, net.u.r var2, boolean var3, boolean var4, boolean var5) {
      if(!Double.isNaN(var1.p) && !Double.isNaN(var1.H) && !Double.isNaN(var1.a)) {
         if(!Double.isNaN(var2.p) && !Double.isNaN(var2.H) && !Double.isNaN(var2.a)) {
            int var6 = net.u.t.L(var2.p);
            int var7 = net.u.t.L(var2.H);
            int var8 = net.u.t.L(var2.a);
            int var9 = net.u.t.L(var1.p);
            int var10 = net.u.t.L(var1.H);
            int var11 = net.u.t.L(var1.a);
            net.u.j var12 = new net.u.j(var9, var10, var11);
            net.yw.n var13 = this.Z(var12);
            net.y9.l var14 = var13.Q();
            if(var13.D(this, var12) != net.y9.l.q && var14.f(var13, var3)) {
               net.u.m var43 = var13.z(this, var12, var1, var2);
               return var43;
            } else {
               net.u.m var15 = null;
               int var16 = 200;

               while(true) {
                  --var16;
                  if(Double.isNaN(var1.p) || Double.isNaN(var1.H) || Double.isNaN(var1.a)) {
                     return null;
                  }

                  if(var9 == var6 && var10 == var7 && var11 == var8) {
                     return var15;
                  }

                  boolean var17 = true;
                  boolean var18 = true;
                  boolean var19 = true;
                  double var20 = 999.0D;
                  double var22 = 999.0D;
                  double var24 = 999.0D;
                  if(var6 > var9) {
                     var20 = (double)var9 + 1.0D;
                  } else if(var6 < var9) {
                     var20 = (double)var9 + 0.0D;
                  } else {
                     var17 = false;
                  }

                  if(var7 > var10) {
                     var22 = (double)var10 + 1.0D;
                  } else if(var7 < var10) {
                     var22 = (double)var10 + 0.0D;
                  } else {
                     var18 = false;
                  }

                  if(var8 > var11) {
                     var24 = (double)var11 + 1.0D;
                  } else if(var8 < var11) {
                     var24 = (double)var11 + 0.0D;
                  } else {
                     var19 = false;
                  }

                  double var26 = 999.0D;
                  double var28 = 999.0D;
                  double var30 = 999.0D;
                  double var32 = var2.p - var1.p;
                  double var34 = var2.H - var1.H;
                  double var36 = var2.a - var1.a;
                  var26 = (var20 - var1.p) / var32;
                  var28 = (var22 - var1.H) / var34;
                  var30 = (var24 - var1.a) / var36;
                  if(var26 == -0.0D) {
                     var26 = -1.0E-4D;
                  }

                  if(var28 == -0.0D) {
                     var28 = -1.0E-4D;
                  }

                  if(var30 == -0.0D) {
                     var30 = -1.0E-4D;
                  }

                  aq var38;
                  if(var26 < var28 && var26 < var30) {
                     var38 = var6 > var9?aq.WEST:aq.EAST;
                     var1 = new net.u.r(var20, var1.H + var34 * var26, var1.a + var36 * var26);
                  } else if(var28 < var30) {
                     var38 = var7 > var10?aq.DOWN:aq.UP;
                     var1 = new net.u.r(var1.p + var32 * var28, var22, var1.a + var36 * var28);
                  } else {
                     var38 = var8 > var11?aq.NORTH:aq.SOUTH;
                     var1 = new net.u.r(var1.p + var32 * var30, var1.H + var34 * var30, var24);
                  }

                  var9 = net.u.t.L(var1.p) - (var38 == aq.EAST?1:0);
                  var10 = net.u.t.L(var1.H) - (var38 == aq.UP?1:0);
                  var11 = net.u.t.L(var1.a) - (var38 == aq.SOUTH?1:0);
                  var12 = new net.u.j(var9, var10, var11);
                  net.yw.n var39 = this.Z(var12);
                  net.y9.l var40 = var39.Q();
                  if(var39.n() == net.y1.l.s || var39.D(this, var12) != net.y9.l.q) {
                     if(var40.f(var39, var3)) {
                        net.u.m var41 = var39.z(this, var12, var1, var2);
                        return var41;
                     }

                     var15 = new net.u.m(net.u.m.MISS, var1, var38, var12);
                  }
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void M(@Nullable net.r.r var1, net.u.j var2, net.yz.a var3, net.yz.p var4, float var5, float var6) {
      this.L(var1, (double)var2.t() + 0.5D, (double)var2.h() + 0.5D, (double)var2.y() + 0.5D, var3, var4, var5, var6);
   }

   public void L(@Nullable net.r.r var1, double var2, double var4, double var6, net.yz.a var8, net.yz.p var9, float var10, float var11) {
      for(int var12 = 0; var12 < this.V.size(); ++var12) {
         ((oj)this.V.get(var12)).f(var1, var8, var9, var2, var4, var6, var10, var11);
      }

   }

   public void m(double var1, double var3, double var5, net.yz.a var7, net.yz.p var8, float var9, float var10, boolean var11) {
   }

   public void O(net.u.j var1, @Nullable net.yz.a var2) {
      for(int var3 = 0; var3 < this.V.size(); ++var3) {
         ((oj)this.V.get(var3)).J(var2, var1);
      }

   }

   public void n(ai var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      this.j(var1.b(), var1.x(), var2, var4, var6, var8, var10, var12, var14);
   }

   public void w(int var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      for(int var15 = 0; var15 < this.V.size(); ++var15) {
         ((oj)this.V.get(var15)).R(var1, false, true, var2, var4, var6, var8, var10, var12, var14);
      }

   }

   public void T(ai var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      int var10001 = var1.b();
      if(!var1.x()) {
         ;
      }

      this.j(var10001, true, var3, var5, var7, var9, var11, var13, var15);
   }

   private void j(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      for(int var16 = 0; var16 < this.V.size(); ++var16) {
         ((oj)this.V.get(var16)).t(var1, var2, var3, var5, var7, var9, var11, var13, var15);
      }

   }

   public boolean i(net.ne.l var1) {
      this.T.add(var1);
      return true;
   }

   public boolean S(net.ne.l var1) {
      int var2 = net.u.t.L(var1.b / 16.0D);
      int var3 = net.u.t.L(var1.hr / 16.0D);
      boolean var4 = var1.hK;
      if(var1 instanceof net.r.r) {
         var4 = true;
      }

      if(!this.T(var2, var3, false)) {
         return false;
      } else {
         if(var1 instanceof net.r.r) {
            net.r.r var5 = (net.r.r)var1;
            this.A.add(var5);
            this.U();
         }

         this.q(var2, var3).s(var1);
         this.J.add(var1);
         this.z(var1);
         return true;
      }
   }

   protected void z(net.ne.l var1) {
      for(int var2 = 0; var2 < this.V.size(); ++var2) {
         ((oj)this.V.get(var2)).u(var1);
      }

   }

   protected void d(net.ne.l var1) {
      for(int var2 = 0; var2 < this.V.size(); ++var2) {
         ((oj)this.V.get(var2)).L(var1);
      }

   }

   public void W(net.ne.l var1) {
      if(var1.t()) {
         var1.Y();
      }

      if(var1.M()) {
         var1.O();
      }

      var1.B();
      if(var1 instanceof net.r.r) {
         this.A.remove(var1);
         this.U();
         this.d(var1);
      }

   }

   public void g(net.ne.l var1) {
      var1.C(false);
      var1.B();
      if(var1 instanceof net.r.r) {
         this.A.remove(var1);
         this.U();
      }

      int var2 = var1.Q;
      int var3 = var1.f;
      if(var1.U && this.T(var2, var3, true)) {
         this.q(var2, var3).f(var1);
      }

      this.J.remove(var1);
      this.d(var1);
   }

   public void n(oj var1) {
      this.V.add(var1);
   }

   public void y(oj var1) {
      this.V.remove(var1);
   }

   private boolean m(@Nullable net.ne.l var1, net.u.e var2, boolean var3, @Nullable List var4) {
      int var5 = net.u.t.L(var2.n) - 1;
      int var6 = net.u.t.o(var2.d) + 1;
      int var7 = net.u.t.L(var2.u) - 1;
      int var8 = net.u.t.o(var2.c) + 1;
      int var9 = net.u.t.L(var2.N) - 1;
      int var10 = net.u.t.o(var2.r) + 1;
      net.nz.p var11 = this.T();
      if(var1.Y()) {
         boolean var10000 = true;
      } else {
         boolean var26 = false;
      }

      boolean var13 = this.x(var1);
      net.yw.n var14 = net.nb.f.oy.p();
      net.u.j var15 = net.u.j.u();

      for(int var16 = var5; var16 < var6; ++var16) {
         for(int var17 = var9; var17 < var10; ++var17) {
            boolean var18 = var16 == var5 || var16 == var6 - 1;
            boolean var19 = var17 == var9 || var17 == var10 - 1;
            if(this.o((net.u.j)var15.c(var16, 64, var17))) {
               for(int var20 = var7; var20 < var8; ++var20) {
                  if(var20 != var8 - 1) {
                     if(var16 < -30000000 || var16 >= 30000000 || var17 < -30000000 || var17 >= 30000000) {
                        boolean var25 = true;
                        var15.T();
                        return var25;
                     }

                     var15.c(var16, var20, var17);
                     net.yw.n var21;
                     if(!var11.U(var15)) {
                        var21 = var14;
                     } else {
                        var21 = this.Z(var15);
                     }

                     var21.T(this, var15, var2, var4, var1, false);
                     if(!var4.isEmpty()) {
                        boolean var22 = true;
                        var15.T();
                        return var22;
                     }
                  }
               }
            }
         }
      }

      var15.T();
      return !var4.isEmpty();
   }

   public List h(@Nullable net.ne.l var1, net.u.e var2) {
      ArrayList var3 = Lists.newArrayList();
      this.m(var1, var2, false, var3);
      List var4 = this.u(var1, var2.x(0.25D));

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         net.ne.l var6 = (net.ne.l)var4.get(var5);
         if(!var1.i(var6)) {
            net.u.e var7 = var6.F();
            if(var7.O(var2)) {
               var3.add(var7);
            }

            var7 = var1.a(var6);
            if(var7.O(var2)) {
               var3.add(var7);
            }
         }
      }

      return var3;
   }

   public boolean x(net.ne.l var1) {
      double var2 = this.a.S();
      double var4 = this.a.U();
      double var6 = this.a.M();
      double var8 = this.a.Z();
      if(var1.Y()) {
         ++var2;
         ++var4;
         --var6;
         --var8;
      } else {
         --var2;
         --var4;
         ++var6;
         ++var8;
      }

      return var1.b > var2 && var1.b < var6 && var1.hr > var4 && var1.hr < var8;
   }

   public boolean v(net.u.e var1) {
      return this.m((net.ne.l)null, var1, true, Lists.newArrayList());
   }

   public int E(float var1) {
      float var2 = this.H(var1);
      float var3 = 1.0F - (net.u.t.m(var2 * 6.2831855F) * 2.0F + 0.5F);
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.u(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.w(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float F(float var1) {
      float var2 = this.H(var1);
      float var3 = 1.0F - (net.u.t.m(var2 * 6.2831855F) * 2.0F + 0.2F);
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.u(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.w(var1) * 5.0F) / 16.0D));
      return var3 * 0.8F + 0.2F;
   }

   public net.u.r h(net.ne.l var1, float var2) {
      float var3 = this.H(var2);
      float var4 = net.u.t.m(var3 * 6.2831855F) * 2.0F + 0.5F;
      var4 = net.u.t.T(var4, 0.0F, 1.0F);
      int var5 = net.u.t.L(var1.b);
      int var6 = net.u.t.L(var1.hS);
      int var7 = net.u.t.L(var1.hr);
      net.u.j var8 = new net.u.j(var5, var6, var7);
      net.ns.i var9 = this.P(var8);
      float var10 = var9.D(var8);
      int var11 = var9.R(var10);
      float var12 = (float)(var11 >> 16 & 255) / 255.0F;
      float var13 = (float)(var11 >> 8 & 255) / 255.0F;
      float var14 = (float)(var11 & 255) / 255.0F;
      var12 = var12 * var4;
      var13 = var13 * var4;
      var14 = var14 * var4;
      float var15 = this.u(var2);
      if(var15 > 0.0F) {
         float var16 = (var12 * 0.3F + var13 * 0.59F + var14 * 0.11F) * 0.6F;
         float var17 = 1.0F - var15 * 0.75F;
         var12 = var12 * var17 + var16 * (1.0F - var17);
         var13 = var13 * var17 + var16 * (1.0F - var17);
         var14 = var14 * var17 + var16 * (1.0F - var17);
      }

      float var23 = this.w(var2);
      if(var23 > 0.0F) {
         float var24 = (var12 * 0.3F + var13 * 0.59F + var14 * 0.11F) * 0.2F;
         float var18 = 1.0F - var23 * 0.75F;
         var12 = var12 * var18 + var24 * (1.0F - var18);
         var13 = var13 * var18 + var24 * (1.0F - var18);
         var14 = var14 * var18 + var24 * (1.0F - var18);
      }

      if(this.z > 0) {
         float var25 = (float)this.z - var2;
         if(var25 > 1.0F) {
            var25 = 1.0F;
         }

         var25 = var25 * 0.45F;
         var12 = var12 * (1.0F - var25) + 0.8F * var25;
         var13 = var13 * (1.0F - var25) + 0.8F * var25;
         var14 = var14 * (1.0F - var25) + 1.0F * var25;
      }

      return new net.u.r((double)var12, (double)var13, (double)var14);
   }

   public float H(float var1) {
      return this.F.G(this.y.A(), var1);
   }

   public int s() {
      return this.F.P(this.y.A());
   }

   public float b() {
      return c.s[this.F.P(this.y.A())];
   }

   public float C(float var1) {
      float var2 = this.H(var1);
      return var2 * 6.2831855F;
   }

   public net.u.r v(float var1) {
      float var2 = this.H(var1);
      float var3 = net.u.t.m(var2 * 6.2831855F) * 2.0F + 0.5F;
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      float var7 = this.u(var1);
      if(var7 > 0.0F) {
         float var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         float var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 = var4 * (var3 * 0.9F + 0.1F);
      var5 = var5 * (var3 * 0.9F + 0.1F);
      var6 = var6 * (var3 * 0.85F + 0.15F);
      float var15 = this.w(var1);
      if(var15 > 0.0F) {
         float var16 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var15 * 0.95F;
         var4 = var4 * var10 + var16 * (1.0F - var10);
         var5 = var5 * var10 + var16 * (1.0F - var10);
         var6 = var6 * var10 + var16 * (1.0F - var10);
      }

      return new net.u.r((double)var4, (double)var5, (double)var6);
   }

   public net.u.r o(float var1) {
      float var2 = this.H(var1);
      return this.F.o(var2, var1);
   }

   public net.u.j d(net.u.j var1) {
      return this.d(var1).q(var1);
   }

   public net.u.j D(net.u.j var1) {
      net.l.q var2 = this.d(var1);

      net.u.j var3;
      net.u.j var4;
      for(var3 = new net.u.j(var1.t(), var2.m() + 16, var1.y()); var3.h() >= 0; var3 = var4) {
         var4 = var3.b();
         net.y1.l var5 = var2.u(var4).n();
         if(var5.f() && var5 != net.y1.l.h) {
            break;
         }
      }

      return var3;
   }

   public float P(float var1) {
      float var2 = this.H(var1);
      float var3 = 1.0F - (net.u.t.m(var2 * 6.2831855F) * 2.0F + 0.25F);
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      return var3 * var3 * 0.5F;
   }

   public boolean o(net.u.j var1, net.y9.l var2) {
      return true;
   }

   public void c(net.u.j var1, net.y9.l var2, int var3) {
   }

   public void V(net.u.j var1, net.y9.l var2, int var3, int var4) {
   }

   public void c(net.u.j var1, net.y9.l var2, int var3, int var4) {
   }

   public void r() {
      this.M.K("entities");
      this.M.K("global");

      for(int var1 = 0; var1 < this.T.size(); ++var1) {
         net.ne.l var2 = (net.ne.l)this.T.get(var1);
         ++var2.x;
         var2.A();
         if(var2.Z) {
            this.T.remove(var1--);
         }
      }

      this.M.F("remove");
      this.J.removeAll(this.q);

      for(int var7 = 0; var7 < this.q.size(); ++var7) {
         net.ne.l var11 = (net.ne.l)this.q.get(var7);
         int var3 = var11.Q;
         int var4 = var11.f;
         if(var11.U && this.T(var3, var4, true)) {
            this.q(var3, var4).f(var11);
         }
      }

      for(int var8 = 0; var8 < this.q.size(); ++var8) {
         this.d((net.ne.l)this.q.get(var8));
      }

      this.q.clear();
      this.X();
      this.M.F("regular");

      for(int var9 = 0; var9 < this.J.size(); ++var9) {
         net.ne.l var12 = (net.ne.l)this.J.get(var9);
         net.ne.l var15 = var12.D();
         if(var15.Z || !var15.m(var12)) {
            var12.O();
            this.M.K("tick");
            if(!var12.Z && !(var12 instanceof net.r.h)) {
               this.E(var12);
            }

            this.M.N();
            this.M.K("remove");
            if(var12.Z) {
               int var18 = var12.Q;
               int var5 = var12.f;
               if(var12.U && this.T(var18, var5, true)) {
                  this.q(var18, var5).f(var12);
               }

               this.J.remove(var9--);
               this.d(var12);
            }

            this.M.N();
         }
      }

      this.M.F("blockEntities");
      if(!this.L.isEmpty()) {
         this.o.removeAll(this.L);
         this.S.removeAll(this.L);
         this.L.clear();
      }

      this.d = true;
      Iterator var10 = this.o.iterator();

      while(var10.hasNext()) {
         net.ni.v var13 = (net.ni.v)var10.next();
         if(!var13.n() && var13.j()) {
            net.u.j var16 = var13.C();
            if(this.o(var16) && this.a.U(var16)) {
               this.M.c(() -> {
                  return String.valueOf(net.ni.v.p(var13.getClass()));
               });
               ((net.yz.i)var13).m();
               this.M.N();
            }
         }

         if(var13.n()) {
            var10.remove();
            this.S.remove(var13);
            if(this.o(var13.C())) {
               this.d(var13.C()).u(var13.C());
            }
         }
      }

      this.d = false;
      this.M.F("pendingBlockEntities");
      if(!this.g.isEmpty()) {
         for(int var14 = 0; var14 < this.g.size(); ++var14) {
            net.ni.v var17 = (net.ni.v)this.g.get(var14);
            if(!var17.n()) {
               if(!this.S.contains(var17)) {
                  this.o(var17);
               }

               if(this.o(var17.C())) {
                  net.l.q var19 = this.d(var17.C());
                  net.yw.n var20 = var19.u(var17.C());
                  var19.x(var17.C(), var17);
                  this.V(var17.C(), var20, var20, 3);
               }
            }
         }

         this.g.clear();
      }

      this.M.N();
      this.M.N();
   }

   protected void X() {
   }

   public boolean o(net.ni.v var1) {
      boolean var2 = this.S.add(var1);
      if(var1 instanceof net.yz.i) {
         this.o.add(var1);
      }

      if(this.x) {
         net.u.j var3 = var1.C();
         net.yw.n var4 = this.Z(var3);
         this.V(var3, var4, var4, 2);
      }

      return var2;
   }

   public void o(Collection var1) {
      if(this.d) {
         this.g.addAll(var1);
      } else {
         for(net.ni.v var3 : var1) {
            this.o(var3);
         }
      }

   }

   public void E(net.ne.l var1) {
      this.s(var1, true);
   }

   public void s(net.ne.l var1, boolean var2) {
      if(!(var1 instanceof net.r.r)) {
         int var3 = net.u.t.L(var1.b);
         int var4 = net.u.t.L(var1.hr);
         boolean var5 = true;
         if(!this.b(var3 - 32, 0, var4 - 32, var3 + 32, 0, var4 + 32, true)) {
            return;
         }
      }

      var1.hL = var1.b;
      var1.F = var1.hS;
      var1.A = var1.hr;
      var1.hq = var1.hN;
      var1.d = var1.V;
      if(var1.U) {
         ++var1.x;
         if(var1.M()) {
            var1.C();
         } else {
            var1.A();
         }
      }

      this.M.K("chunkCheck");
      if(Double.isNaN(var1.b) || Double.isInfinite(var1.b)) {
         var1.b = var1.hL;
      }

      if(Double.isNaN(var1.hS) || Double.isInfinite(var1.hS)) {
         var1.hS = var1.F;
      }

      if(Double.isNaN(var1.hr) || Double.isInfinite(var1.hr)) {
         var1.hr = var1.A;
      }

      if(Double.isNaN((double)var1.V) || Double.isInfinite((double)var1.V)) {
         var1.V = var1.d;
      }

      if(Double.isNaN((double)var1.hN) || Double.isInfinite((double)var1.hN)) {
         var1.hN = var1.hq;
      }

      int var8 = net.u.t.L(var1.b / 16.0D);
      int var9 = net.u.t.L(var1.hS / 16.0D);
      int var10 = net.u.t.L(var1.hr / 16.0D);
      if(!var1.U || var1.Q != var8 || var1.D != var9 || var1.f != var10) {
         if(var1.U && this.T(var1.Q, var1.f, true)) {
            this.q(var1.Q, var1.f).a(var1, var1.D);
         }

         if(!var1.n() && !this.T(var8, var10, true)) {
            var1.U = false;
         } else {
            this.q(var8, var10).s(var1);
         }
      }

      this.M.N();
      if(var1.U) {
         for(net.ne.l var7 : var1.H()) {
            if(!var7.Z && var7.D() == var1) {
               this.E(var7);
            } else {
               var7.O();
            }
         }
      }

   }

   public boolean D(net.u.e var1) {
      return this.N((net.u.e)var1, (net.ne.l)null);
   }

   public boolean N(net.u.e var1, @Nullable net.ne.l var2) {
      List var3 = this.u((net.ne.l)null, var1);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         net.ne.l var5 = (net.ne.l)var3.get(var4);
         if(!var5.Z && var5.a && var5 != var2 && var5.i(var2)) {
            return false;
         }
      }

      return true;
   }

   public boolean T(net.u.e var1) {
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.o(var1.d);
      int var4 = net.u.t.L(var1.u);
      int var5 = net.u.t.o(var1.c);
      int var6 = net.u.t.L(var1.N);
      int var7 = net.u.t.o(var1.r);
      net.u.j var8 = net.u.j.u();

      for(int var9 = var2; var9 < var3; ++var9) {
         for(int var10 = var4; var10 < var5; ++var10) {
            for(int var11 = var6; var11 < var7; ++var11) {
               net.yw.n var12 = this.Z(var8.c(var9, var10, var11));
               if(var12.n() != net.y1.l.q) {
                  var8.T();
                  return true;
               }
            }
         }
      }

      var8.T();
      return false;
   }

   public boolean p(net.u.e var1) {
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.o(var1.d);
      int var4 = net.u.t.L(var1.u);
      int var5 = net.u.t.o(var1.c);
      int var6 = net.u.t.L(var1.N);
      int var7 = net.u.t.o(var1.r);
      net.u.j var8 = net.u.j.u();

      for(int var9 = var2; var9 < var3; ++var9) {
         for(int var10 = var4; var10 < var5; ++var10) {
            for(int var11 = var6; var11 < var7; ++var11) {
               net.yw.n var12 = this.Z(var8.c(var9, var10, var11));
               if(var12.n().y()) {
                  var8.T();
                  return true;
               }
            }
         }
      }

      var8.T();
      return false;
   }

   public boolean j(net.u.e var1) {
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.o(var1.d);
      int var4 = net.u.t.L(var1.u);
      int var5 = net.u.t.o(var1.c);
      int var6 = net.u.t.L(var1.N);
      int var7 = net.u.t.o(var1.r);
      if(this.b(var2, var4, var6, var3, var5, var7, true)) {
         net.u.j var8 = net.u.j.u();

         for(int var9 = var2; var9 < var3; ++var9) {
            for(int var10 = var4; var10 < var5; ++var10) {
               for(int var11 = var6; var11 < var7; ++var11) {
                  net.y9.l var12 = this.Z(var8.c(var9, var10, var11)).Q();
                  if(var12 == net.nb.f.g || var12 == net.nb.f.dj || var12 == net.nb.f.TL) {
                     var8.T();
                     return true;
                  }
               }
            }
         }

         var8.T();
      }

      return false;
   }

   public boolean q(net.u.e var1, net.y1.l var2, net.ne.l var3) {
      int var4 = net.u.t.L(var1.n);
      int var5 = net.u.t.o(var1.d);
      int var6 = net.u.t.L(var1.u);
      int var7 = net.u.t.o(var1.c);
      int var8 = net.u.t.L(var1.N);
      int var9 = net.u.t.o(var1.r);
      if(!this.b(var4, var6, var8, var5, var7, var9, true)) {
         return false;
      } else {
         boolean var10 = false;
         net.u.r var11 = net.u.r.r;
         net.u.j var12 = net.u.j.u();

         for(int var13 = var4; var13 < var5; ++var13) {
            for(int var14 = var6; var14 < var7; ++var14) {
               for(int var15 = var8; var15 < var9; ++var15) {
                  var12.c(var13, var14, var15);
                  net.yw.n var16 = this.Z(var12);
                  net.y9.l var17 = var16.Q();
                  if(var16.n() == var2) {
                     double var18 = (double)((float)(var14 + 1) - g5.P(((Integer)var16.i(g5.J)).intValue()));
                     if((double)var7 >= var18) {
                        var10 = true;
                        var11 = var17.V(this, var12, var3, var11);
                     }
                  }
               }
            }
         }

         var12.T();
         if(var11.c() > 0.0D && var3.i()) {
            var11 = var11.I();
            double var21 = 0.014D;
            var3.hf += var11.p * 0.014D;
            var3.K += var11.H * 0.014D;
            var3.J += var11.a * 0.014D;
         }

         return var10;
      }
   }

   public boolean I(net.u.e var1, net.y1.l var2) {
      int var3 = net.u.t.L(var1.n);
      int var4 = net.u.t.o(var1.d);
      int var5 = net.u.t.L(var1.u);
      int var6 = net.u.t.o(var1.c);
      int var7 = net.u.t.L(var1.N);
      int var8 = net.u.t.o(var1.r);
      net.u.j var9 = net.u.j.u();

      for(int var10 = var3; var10 < var4; ++var10) {
         for(int var11 = var5; var11 < var6; ++var11) {
            for(int var12 = var7; var12 < var8; ++var12) {
               if(this.Z(var9.c(var10, var11, var12)).n() == var2) {
                  var9.T();
                  return true;
               }
            }
         }
      }

      var9.T();
      return false;
   }

   public u B(@Nullable net.ne.l var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.c(var1, var2, var4, var6, var8, false, var9);
   }

   public u c(@Nullable net.ne.l var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      u var11 = new u(this, var1, var2, var4, var6, var8, var9, var10);
      var11.o();
      var11.p(true);
      return var11;
   }

   public float x(net.u.r param1, net.u.e param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean Q(@Nullable net.r.r var1, net.u.j var2, aq var3) {
      var2 = var2.C(var3);
      if(this.Z(var2).Q() == net.nb.f.g) {
         this.N(var1, 1009, var2, 0);
         this.J(var2);
         return true;
      } else {
         return false;
      }
   }

   public String k() {
      return "All: " + this.J.size();
   }

   public String l() {
      return this.m.V();
   }

   @Nullable
   public net.ni.v L(net.u.j var1) {
      if(this.h(var1)) {
         return null;
      } else {
         net.ni.v var2 = null;
         if(this.d) {
            var2 = this.U(var1);
         }

         var2 = this.d(var1).K(var1, net.l.q.IMMEDIATE);
         var2 = this.U(var1);
         return var2;
      }
   }

   @Nullable
   private net.ni.v U(net.u.j var1) {
      for(int var2 = 0; var2 < this.g.size(); ++var2) {
         net.ni.v var3 = (net.ni.v)this.g.get(var2);
         if(!var3.n() && var3.C().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void Z(net.u.j var1, @Nullable net.ni.v var2) {
      if(!this.h(var1) && !var2.n()) {
         if(this.d) {
            var2.h(var1);
            Iterator var3 = this.g.iterator();

            while(var3.hasNext()) {
               net.ni.v var4 = (net.ni.v)var3.next();
               if(var4.C().equals(var1)) {
                  var4.Z();
                  var3.remove();
               }
            }

            this.g.add(var2);
         } else {
            this.d(var1).x(var1, var2);
            this.o(var2);
         }
      }

   }

   public void j(net.u.j var1) {
      net.ni.v var2 = this.L(var1);
      if(this.d) {
         var2.Z();
         this.g.remove(var2);
      } else {
         this.g.remove(var2);
         this.S.remove(var2);
         this.o.remove(var2);
         this.d(var1).u(var1);
      }

   }

   public void x(net.ni.v var1) {
      this.L.add(var1);
   }

   public boolean E(net.u.j var1) {
      net.u.e var2 = this.Z(var1).D(this, var1);
      return var2 != net.y9.l.q && var2.O() >= 1.0D;
   }

   public boolean E(net.u.j var1, boolean var2) {
      if(this.h(var1)) {
         return false;
      } else {
         net.l.q var3 = this.m.e(var1.t() >> 4, var1.y() >> 4);
         if(var3.z()) {
            return var2;
         } else {
            net.yw.n var4 = this.Z(var1);
            return var4.n().V() && var4.O();
         }
      }
   }

   public void u() {
      int var1 = this.E(1.0F);
      if(var1 != this.h) {
         this.h = var1;
      }

   }

   public void L(boolean var1, boolean var2) {
      this.R = var1;
      this.K = var2;
   }

   public void k() {
      this.n();
   }

   protected void Q() {
      if(this.y.l()) {
         this.n = 1.0F;
         if(this.y.r()) {
            this.l = 1.0F;
         }
      }

   }

   protected void n() {
      if(this.F.A() && !this.x) {
         boolean var1 = this.N().b("doWeatherCycle");
         int var2 = this.y.Z();
         --var2;
         this.y.d(var2);
         this.y.H(this.y.r()?1:2);
         this.y.P(this.y.l()?1:2);
         int var3 = this.y.B();
         if(this.y.r()) {
            this.y.H(this.G.nextInt(12000) + 3600);
         } else {
            this.y.H(this.G.nextInt(168000) + 12000);
         }

         int var4 = this.y.L();
         if(this.y.l()) {
            this.y.P(this.G.nextInt(12000) + 12000);
         } else {
            this.y.P(this.G.nextInt(168000) + 12000);
         }

         this.k = this.l;
         if(this.y.r()) {
            this.l = (float)((double)this.l + 0.01D);
         } else {
            this.l = (float)((double)this.l - 0.01D);
         }

         this.l = net.u.t.T(this.l, 0.0F, 1.0F);
         this.u = this.n;
         if(this.y.l()) {
            this.n = (float)((double)this.n + 0.01D);
         } else {
            this.n = (float)((double)this.n - 0.01D);
         }

         this.n = net.u.t.T(this.n, 0.0F, 1.0F);
      }

   }

   protected void c(int var1, int var2, net.l.q var3) {
      var3.z();
   }

   protected void s() {
   }

   public void L(net.u.j var1, net.yw.n var2, Random var3) {
      this.f = true;
      var2.Q().P(this, var1, var2, var3);
      this.f = false;
   }

   public boolean l(net.u.j var1) {
      return this.c(var1, false);
   }

   public boolean a(net.u.j var1) {
      return this.c(var1, true);
   }

   public boolean c(net.u.j var1, boolean var2) {
      net.ns.i var3 = this.P(var1);
      float var4 = var3.D(var1);
      if(var4 >= 0.15F) {
         return false;
      } else {
         if(var1.h() >= 0 && var1.h() < 256 && this.d(w.BLOCK, var1) < 10) {
            net.yw.n var5 = this.Z(var1);
            net.y9.l var6 = var5.Q();
            if((var6 == net.nb.f.uM || var6 == net.nb.f.dy) && ((Integer)var5.i(g5.J)).intValue() == 0) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean U(net.u.j var1) {
      return this.Z(var1).n() == net.y1.l.p;
   }

   public boolean b(net.u.j var1, boolean var2) {
      net.ns.i var3 = this.P(var1);
      float var4 = var3.D(var1);
      return var4 < 0.15F;
   }

   public boolean m(net.u.j var1) {
      boolean var2 = false;
      if(this.F.A()) {
         var2 |= this.b(w.SKY, var1);
      }

      var2 = var2 | this.b(w.BLOCK, var1);
      return var2;
   }

   private int w(net.u.j var1, w var2) {
      if(var2 == w.SKY && this.V(var1)) {
         return 15;
      } else {
         net.yw.n var3 = this.Z(var1);
         int var4 = var2 == w.SKY?0:var3.f();
         int var5 = var3.K();
         if(var5 >= 15 && var3.f() > 0) {
            var5 = 1;
         }

         if(var5 < 1) {
            var5 = 1;
         }

         if(var5 >= 15) {
            return 0;
         } else if(var4 >= 14) {
            return var4;
         } else {
            net.u.j var6 = net.u.j.u();

            for(aq var10 : aq.values()) {
               var6.G(var1).O(var10);
               int var11 = this.d((w)var2, (net.u.j)var6) - var5;
               if(var11 > var4) {
                  var4 = var11;
               }

               if(var4 >= 14) {
                  var6.T();
                  return var4;
               }
            }

            var6.T();
            return var4;
         }
      }
   }

   public boolean b(w var1, net.u.j var2) {
      z8 var4 = new z8(var1, var2);
      C();
      _x.m(var4);
      if(var4.t()) {
         return false;
      } else if(!this.k(var2, 17, false)) {
         return false;
      } else {
         int var5 = 0;
         int var6 = 0;
         this.M.K("getBrightness");
         int var7 = this.d(var1, var2);
         int var8 = this.w(var2, var1);
         int var9 = var2.t();
         int var10 = var2.h();
         int var11 = var2.y();
         if(var8 > var7) {
            this.r[var6++] = 133152;
         }

         if(var8 < var7) {
            this.r[var6++] = 133152 | var7 << 18;
            if(var5 < var6) {
               int var12 = this.r[var5++];
               int var13 = (var12 & 63) - 32 + var9;
               int var14 = (var12 >> 6 & 63) - 32 + var10;
               int var15 = (var12 >> 12 & 63) - 32 + var11;
               int var16 = var12 >> 18 & 15;
               net.u.j var17 = new net.u.j(var13, var14, var15);
               int var18 = this.d(var1, var17);
               if(var18 == var16) {
                  this.V(var1, var17, 0);
                  if(var16 > 0) {
                     int var19 = net.u.t.l(var13 - var9);
                     int var20 = net.u.t.l(var14 - var10);
                     int var21 = net.u.t.l(var15 - var11);
                     if(var19 + var20 + var21 < 17) {
                        net.u.j var22 = net.u.j.u();
                        aq[] var23 = aq.values();
                        int var24 = var23.length;
                        int var25 = 0;
                        if(var25 < var24) {
                           aq var26 = var23[var25];
                           int var27 = var13 + var26.v();
                           int var28 = var14 + var26.z();
                           int var29 = var15 + var26.P();
                           var22.c(var27, var28, var29);
                           int var30 = Math.max(1, this.Z(var22).K());
                           var18 = this.d((w)var1, (net.u.j)var22);
                           if(var18 == var16 - var30 && var6 < this.r.length) {
                              this.r[var6++] = var27 - var9 + 32 | var28 - var10 + 32 << 6 | var29 - var11 + 32 << 12 | var16 - var30 << 18;
                           }

                           ++var25;
                        }

                        var22.T();
                     }
                  }
               }
            }

            var5 = 0;
         }

         this.M.N();
         this.M.K("checkedPosition < toCheckCount");
         this.M.N();
         return true;
      }
   }

   public boolean b(boolean var1) {
      return false;
   }

   @Nullable
   public List D(net.l.q var1, boolean var2) {
      return null;
   }

   @Nullable
   public List d(net.y4.v var1, boolean var2) {
      return null;
   }

   public List u(@Nullable net.ne.l var1, net.u.e var2) {
      return this.S(var1, var2, net.yz.q.n);
   }

   public List S(@Nullable net.ne.l var1, net.u.e var2, @Nullable Predicate var3) {
      ArrayList var4 = Lists.newArrayList();
      int var5 = net.u.t.L((var2.n - 2.0D) / 16.0D);
      int var6 = net.u.t.L((var2.d + 2.0D) / 16.0D);
      int var7 = net.u.t.L((var2.N - 2.0D) / 16.0D);
      int var8 = net.u.t.L((var2.r + 2.0D) / 16.0D);

      for(int var9 = var5; var9 <= var6; ++var9) {
         for(int var10 = var7; var10 <= var8; ++var10) {
            if(this.T(var9, var10, true)) {
               this.q(var9, var10).F(var1, var2, var4, var3);
            }
         }
      }

      return var4;
   }

   public List d(Class var1, Predicate var2) {
      ArrayList var3 = Lists.newArrayList();

      for(net.ne.l var5 : this.J) {
         if(var1.isAssignableFrom(var5.getClass()) && var2.apply(var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public List R(Class var1, Predicate var2) {
      ArrayList var3 = Lists.newArrayList();

      for(net.ne.l var5 : this.A) {
         if(var1.isAssignableFrom(var5.getClass()) && var2.apply(var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public List p(Class var1, net.u.e var2) {
      return this.L(var1, var2, net.yz.q.n);
   }

   public List L(Class var1, net.u.e var2, @Nullable Predicate var3) {
      int var4 = net.u.t.L((var2.n - 2.0D) / 16.0D);
      int var5 = net.u.t.o((var2.d + 2.0D) / 16.0D);
      int var6 = net.u.t.L((var2.N - 2.0D) / 16.0D);
      int var7 = net.u.t.o((var2.r + 2.0D) / 16.0D);
      ArrayList var8 = Lists.newArrayList();

      for(int var9 = var4; var9 < var5; ++var9) {
         for(int var10 = var6; var10 < var7; ++var10) {
            if(this.T(var9, var10, true)) {
               this.q(var9, var10).Z(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   @Nullable
   public net.ne.l O(Class var1, net.u.e var2, net.ne.l var3) {
      List var4 = this.p(var1, var2);
      net.ne.l var5 = null;
      double var6 = Double.MAX_VALUE;

      for(int var8 = 0; var8 < var4.size(); ++var8) {
         net.ne.l var9 = (net.ne.l)var4.get(var8);
         if(var9 != var3 && net.yz.q.n.apply(var9)) {
            double var10 = var3.F(var9);
            if(var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   @Nullable
   public net.ne.l S(int var1) {
      return (net.ne.l)this.Q.b(var1);
   }

   public List y() {
      return this.J;
   }

   public void S(net.u.j var1, net.ni.v var2) {
      if(this.o(var1)) {
         this.d(var1).k();
      }

   }

   public int h(Class var1) {
      int var2 = 0;

      for(net.ne.l var4 : this.J) {
         if((!(var4 instanceof net.ne.y) || !((net.ne.y)var4).lT()) && var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void r(Collection var1) {
      this.J.addAll(var1);

      for(net.ne.l var3 : var1) {
         this.z(var3);
      }

   }

   public void x(Collection var1) {
      this.q.addAll(var1);
   }

   public boolean j(net.y9.l var1, net.u.j var2, boolean var3, aq var4, @Nullable net.ne.l var5) {
      net.yw.n var6 = this.Z(var2);
      Object var7 = null;
      return var7 != net.y9.l.q && !this.N(((net.u.e)var7).c(var2), var5)?false:(var6.n() == net.y1.l.c && var1 == net.nb.f.uc?true:var6.n().p() && var1.C(this, var2, var4));
   }

   public int k() {
      return this.U;
   }

   public void l(int var1) {
      this.U = var1;
   }

   public int N(net.u.j var1, aq var2) {
      return this.Z(var1).y(this, var1, var2);
   }

   public j t() {
      return this.y.h();
   }

   public int z(net.u.j var1) {
      int var2 = 0;
      var2 = Math.max(var2, this.N(var1.b(), aq.DOWN));
      if(var2 >= 15) {
         return var2;
      } else {
         var2 = Math.max(var2, this.N(var1.h(), aq.UP));
         if(var2 >= 15) {
            return var2;
         } else {
            var2 = Math.max(var2, this.N(var1.D(), aq.NORTH));
            if(var2 >= 15) {
               return var2;
            } else {
               var2 = Math.max(var2, this.N(var1.d(), aq.SOUTH));
               if(var2 >= 15) {
                  return var2;
               } else {
                  var2 = Math.max(var2, this.N(var1.H(), aq.WEST));
                  if(var2 >= 15) {
                     return var2;
                  } else {
                     var2 = Math.max(var2, this.N(var1.g(), aq.EAST));
                     return var2 >= 15?var2:var2;
                  }
               }
            }
         }
      }
   }

   public boolean z(net.u.j var1, aq var2) {
      return this.f(var1, var2) > 0;
   }

   public int f(net.u.j var1, aq var2) {
      net.yw.n var3 = this.Z(var1);
      return var3.i()?this.z(var1):var3.M(this, var1, var2);
   }

   public boolean B(net.u.j var1) {
      return this.f(var1.b(), aq.DOWN) > 0?true:(this.f(var1.h(), aq.UP) > 0?true:(this.f(var1.D(), aq.NORTH) > 0?true:(this.f(var1.d(), aq.SOUTH) > 0?true:(this.f(var1.H(), aq.WEST) > 0?true:this.f(var1.g(), aq.EAST) > 0))));
   }

   public int g(net.u.j var1) {
      int var2 = 0;

      for(aq var6 : aq.values()) {
         int var7 = this.f(var1.C(var6), var6);
         if(var7 >= 15) {
            return 15;
         }

         if(var7 > var2) {
            var2 = var7;
         }
      }

      return var2;
   }

   @Nullable
   public net.r.r d(net.ne.l var1, double var2) {
      return this.d(var1.b, var1.hS, var1.hr, var2, false);
   }

   @Nullable
   public net.r.r x(net.ne.l var1, double var2) {
      return this.d(var1.b, var1.hS, var1.hr, var2, true);
   }

   @Nullable
   public net.r.r d(double var1, double var3, double var5, double var7, boolean var9) {
      Predicate var10 = net.yz.q.q;
      return this.e(var1, var3, var5, var7, var10);
   }

   @Nullable
   public net.r.r e(double var1, double var3, double var5, double var7, Predicate var9) {
      double var10 = -1.0D;
      net.r.r var12 = null;

      for(int var13 = 0; var13 < this.A.size(); ++var13) {
         net.r.r var14 = (net.r.r)this.A.get(var13);
         if(var9.apply(var14)) {
            double var15 = var14.o(var1, var3, var5);
            if(var7 < 0.0D || var15 < var7 * var7) {
               double var17;
               int var10000 = (var17 = var10 - -1.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
               var10 = var15;
               var12 = var14;
            }
         }
      }

      return var12;
   }

   public boolean g(double var1, double var3, double var5, double var7) {
      for(int var9 = 0; var9 < this.A.size(); ++var9) {
         net.r.r var10 = (net.r.r)this.A.get(var9);
         if(net.yz.q.n.apply(var10)) {
            double var11 = var10.o(var1, var3, var5);
            if(var7 < 0.0D || var11 < var7 * var7) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   public net.r.r t(net.ne.l var1, double var2, double var4) {
      return this.m(var1.b, var1.hS, var1.hr, var2, var4, (Function)null, (Predicate)null);
   }

   @Nullable
   public net.r.r o(net.u.j var1, double var2, double var4) {
      return this.m((double)((float)var1.t() + 0.5F), (double)((float)var1.h() + 0.5F), (double)((float)var1.y() + 0.5F), var2, var4, (Function)null, (Predicate)null);
   }

   @Nullable
   public net.r.r m(double var1, double var3, double var5, double var7, double var9, @Nullable Function var11, @Nullable Predicate var12) {
      double var13 = -1.0D;
      net.r.r var15 = null;

      for(int var16 = 0; var16 < this.A.size(); ++var16) {
         net.r.r var17 = (net.r.r)this.A.get(var16);
         if(!var17.a6.T && var17.P() && !var17.VX() && var12.apply(var17)) {
            double var18 = var17.o(var1, var17.hS, var5);
            double var20 = var7;
            if(var17.Q()) {
               var20 = var7 * 0.800000011920929D;
            }

            if(var17.e()) {
               float var22 = var17.I();
               if(var22 < 0.1F) {
                  var22 = 0.1F;
               }

               var20 *= (double)(0.7F * var22);
            }

            var20 = var20 * ((Double)MoreObjects.firstNonNull(var11.apply(var17), Double.valueOf(1.0D))).doubleValue();
            if((var9 < 0.0D || Math.abs(var17.hS - var3) < var9 * var9) && (var7 < 0.0D || var18 < var20 * var20)) {
               double var24;
               int var10000 = (var24 = var13 - -1.0D) == 0.0D?0:(var24 < 0.0D?-1:1);
               var13 = var18;
               var15 = var17;
            }
         }
      }

      return var15;
   }

   @Nullable
   public net.r.r k(String var1) {
      for(int var2 = 0; var2 < this.A.size(); ++var2) {
         net.r.r var3 = (net.r.r)this.A.get(var2);
         if(var1.equals(var3.Q())) {
            return var3;
         }
      }

      return null;
   }

   @Nullable
   public net.r.r W(UUID var1) {
      for(int var2 = 0; var2 < this.A.size(); ++var2) {
         net.r.r var3 = (net.r.r)this.A.get(var2);
         if(var1.equals(var3.O())) {
            return var3;
         }
      }

      return null;
   }

   public void Z() {
   }

   public void I() throws ov {
      this.v.I();
   }

   public void c(long var1) {
      this.y.q(var1);
   }

   public long a() {
      return this.y.D();
   }

   public long y() {
      return this.y.m();
   }

   public long j() {
      return this.y.A();
   }

   public void N(long var1) {
      this.y.l(var1);
   }

   public net.u.j y() {
      net.u.j var1 = new net.u.j(this.y.h(), this.y.o(), this.y.Q());
      if(!this.T().U(var1)) {
         var1 = this.A(new net.u.j(this.T().s(), 0.0D, this.T().A()));
      }

      return var1;
   }

   public void B(net.u.j var1) {
      this.y.n(var1);
   }

   public void R(net.ne.l var1) {
      int var2 = net.u.t.L(var1.b / 16.0D);
      int var3 = net.u.t.L(var1.hr / 16.0D);
      boolean var10000 = true;
      byte var5 = -2;
      int var6 = -2;

      while(true) {
         this.q(var2 + var5, var3 + var6);
         ++var6;
      }
   }

   public boolean J(net.r.r var1, net.u.j var2) {
      return true;
   }

   public void k(net.ne.l var1, byte var2) {
   }

   public net.l.h G() {
      return this.m;
   }

   public void x(net.u.j var1, net.y9.l var2, int var3, int var4) {
      this.Z(var1).G(this, var1, var3, var4);
   }

   public net.cg.d q() {
      return this.v;
   }

   public net.cg.z B() {
      return this.y;
   }

   public p N() {
      return this.y.Z();
   }

   public void U() {
   }

   public float w(float var1) {
      return (this.k + (this.l - this.k) * var1) * this.u(var1);
   }

   public void d(float var1) {
      this.k = var1;
      this.l = var1;
   }

   public float u(float var1) {
      return this.u + (this.n - this.u) * var1;
   }

   public void A(float var1) {
      this.u = var1;
      this.n = var1;
   }

   public boolean V() {
      return (double)this.w(1.0F) > 0.9D;
   }

   public boolean b() {
      return (double)this.u(1.0F) > 0.2D;
   }

   public boolean F(net.u.j var1) {
      if(!this.b()) {
         return false;
      } else if(!this.V(var1)) {
         return false;
      } else if(this.d(var1).h() > var1.h()) {
         return false;
      } else {
         net.ns.i var2 = this.P(var1);
         return var2.r()?false:!this.b(var1, false) && var2.D();
      }
   }

   public boolean Y(net.u.j var1) {
      net.ns.i var2 = this.P(var1);
      return var2.P();
   }

   @Nullable
   public net.cg.y M() {
      return this.i;
   }

   public void Z(String var1, net.cg.h var2) {
      this.i.z(var1, var2);
   }

   @Nullable
   public net.cg.h L(Class var1, String var2) {
      return this.i.a(var1, var2);
   }

   public int t(String var1) {
      return this.i.n(var1);
   }

   public void A(int var1, net.u.j var2, int var3) {
      for(int var4 = 0; var4 < this.V.size(); ++var4) {
         ((oj)this.V.get(var4)).Y(var1, var2, var3);
      }

   }

   public void s(int var1, net.u.j var2, int var3) {
      this.N((net.r.r)null, var1, var2, var3);
   }

   public void N(@Nullable net.r.r var1, int var2, net.u.j var3, int var4) {
      for(int var5 = 0; var5 < this.V.size(); ++var5) {
         ((oj)this.V.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int Z() {
      return 256;
   }

   public int d() {
      return this.F.k()?128:256;
   }

   public Random Y(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.B().D() + (long)var3;
      this.G.setSeed(var4);
      return this.G;
   }

   public double I() {
      return this.y.h() == j.T?0.0D:63.0D;
   }

   public net.d.l W(net.d.w var1) {
      net.d.l var2 = var1.s("Affected level", 1);
      var2.e("Level name", this.y == null?"????":this.y.M());
      var2.L("All players", new net.d.t() {
         public String e() {
            return r.this.A.size() + " total; " + r.this.A;
         }
      });
      var2.L("Chunk stats", new net.d.t() {
         public String d() {
            return r.this.m.V();
         }
      });
      this.y.O(var2);
      return var2;
   }

   public void i(int var1, net.u.j var2, int var3) {
      for(int var4 = 0; var4 < this.V.size(); ++var4) {
         oj var5 = (oj)this.V.get(var4);
         var5.c(var1, var2, var3);
      }

   }

   public Calendar l() {
      if(this.y() % 600L == 0L) {
         this.E.setTimeInMillis(net.nx.f.X());
      }

      return this.E;
   }

   public void u(double var1, double var3, double var5, double var7, double var9, double var11, @Nullable net.nj.f var13) {
   }

   public net.nc.b J() {
      return this.H;
   }

   public void Z(net.u.j var1, net.y9.l var2) {
      for(aq var4 : aq.u.HORIZONTAL) {
         net.u.j var5 = var1.C(var4);
         if(this.o(var5)) {
            net.yw.n var6 = this.Z(var5);
            if(net.nb.f.dA.g(var6)) {
               var6.q(this, var5, var2, var1);
            } else if(var6.i()) {
               var5 = var5.C(var4);
               var6 = this.Z(var5);
               if(net.nb.f.dA.g(var6)) {
                  var6.q(this, var5, var2, var1);
               }
            }
         }
      }

   }

   public g G(net.u.j var1) {
      long var2 = 0L;
      float var4 = 0.0F;
      if(this.o(var1)) {
         var4 = this.b();
         var2 = this.d(var1).K();
      }

      return new g(this.k(), this.j(), var2, var4);
   }

   public l k() {
      return this.B().k();
   }

   public int y() {
      return this.h;
   }

   public void U(int var1) {
      this.h = var1;
   }

   public int i() {
      return this.z;
   }

   public void y(int var1) {
      this.z = var1;
   }

   public net.nq.w v() {
      return this.P;
   }

   public net.nz.p T() {
      return this.a;
   }

   public boolean q(int var1, int var2) {
      net.u.j var3 = this.y();
      int var4 = var1 * 16 + 8 - var3.t();
      int var5 = var2 * 16 + 8 - var3.y();
      boolean var10000 = true;
      return var4 >= -128 && var4 <= 128 && var5 >= -128 && var5 <= 128;
   }

   public void Q(net.n2.k var1) {
      throw new UnsupportedOperationException("Can\'t send packets to server unless you\'re on the client.");
   }

   public net.y7.t o() {
      return this.b;
   }

   @Nullable
   public net.u.j p(String var1, net.u.j var2, boolean var3) {
      return null;
   }

   public static void F(net.u.d[] var0) {
      C = var0;
   }

   public static net.u.d[] C() {
      return C;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      F((net.u.d[])null);
   }
}
