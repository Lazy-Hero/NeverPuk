package net.n5;

import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import net._c;
import net._f;
import net.i6;
import net.w5;
import net.wk;
import net.wl;
import net.xn;
import net.z9;
import net.l.q;
import net.n5.a;
import net.n5.g;
import net.n5.i;
import net.u.e;
import net.y.b;
import net.y.d;
import net.y.k;
import net.y.p;
import net.y.u;
import net.y.ui;
import net.y.uu;
import net.y8.x;
import net.y9.gn;
import net.y9.z6;
import net.yv.r;
import net.yw.n;
import net.yz.a5;
import net.yz.ac;
import net.yz.aq;

public class m {
   private r f;
   private final u t;
   public static int A;
   public g a = g.u;
   private final ReentrantLock z = new ReentrantLock();
   private final ReentrantLock D = new ReentrantLock();
   private i v;
   private final Set I = Sets.newHashSet();
   private final int j;
   private final FloatBuffer n = net.y.m.R(16);
   private final net.y8.g[] u = new net.y8.g[ac.values().length];
   public e J;
   private int B = -1;
   private boolean d = true;
   private final net.u.j Y = new net.u.j(-1, -1, -1);
   private final net.u.j[] i = new net.u.j[6];
   private boolean C;
   private static final ac[] o = ac.values();
   private final ac[] O = new ac[1];
   private final boolean E = z9.So();
   private final boolean M = !i6.u0.l();
   private boolean w = false;
   private final m[] k = new m[6];
   private q e;
   private static int[] g;

   public m(r var1, u var2, int var3) {
      for(int var4 = 0; var4 < this.i.length; ++var4) {
         this.i[var4] = new net.u.j();
      }

      this.f = var1;
      this.t = var2;
      this.j = var3;
      if(ui.H()) {
         for(int var5 = 0; var5 < ac.values().length; ++var5) {
            this.u[var5] = new net.y8.g(x.M);
         }
      }

   }

   public boolean I(int var1) {
      if(this.B == var1) {
         return false;
      } else {
         this.B = var1;
         return true;
      }
   }

   public net.y8.g X(int var1) {
      return this.u[var1];
   }

   public void f(int var1, int var2, int var3) {
      if(var1 != this.Y.t() || var2 != this.Y.h() || var3 != this.Y.y()) {
         this.D();
         this.Y.V(var1, var2, var3);
         this.J = new e((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));

         for(aq var7 : aq.VALUES) {
            this.i[var7.ordinal()].V(this.Y).j(var7, 16);
            this.k[var7.ordinal()] = null;
         }

         this.e = null;
         this.o();
      }

   }

   public void A(float var1, float var2, float var3, i var4) {
      g var5 = var4.X();
      if(var5.z() != null && !var5.I(ac.TRANSLUCENT)) {
         p var6 = var4.m().M(ac.TRANSLUCENT);
         this.y(var6, this.Y);
         var6.L(var5.z());
         this.k(ac.TRANSLUCENT, var1, var2, var3, var6, var5);
      }

   }

   public void Q(float var1, float var2, float var3, i var4) {
      g var6 = new g();
      boolean var10000 = true;
      net.u.j var8 = this.Y;
      t();
      net.u.j var9 = var8.F(15, 15, 15);
      var4.B().lock();
      if(var4.C() != i.a.COMPILING) {
         var4.B().unlock();
      } else {
         var4.E(var6);
         var4.B().unlock();
         a var10 = new a();
         HashSet var11 = Sets.newHashSet();
         if(this.f != null) {
            w5 var12 = this.x();
            if(!var12.h()) {
               ++A;
               var12.Z();
               boolean[] var13 = new boolean[o.length];
               k var14 = net.nn.j.b().x();
               boolean var15 = i6.j.r();
               boolean var16 = i6.Mo.r();
               Iterator var17 = _f.H(var8, var9).iterator();
               if(var17.hasNext()) {
                  Object var18 = var17.next();
                  _f var19 = (_f)var18;
                  n var20 = var12.Z(var19);
                  net.y9.l var21 = var20.Q();
                  if(var20.j()) {
                     var10.M(var19);
                  }

                  if(wl.A(var20)) {
                     net.ni.v var22 = var12.f(var19, q.r.CHECK);
                     net.c5.e var23 = net.c5.g.E.m(var22);
                     if(var23 != null) {
                        if(var23.A(var22)) {
                           var11.add(var22);
                        }

                        var6.B(var22);
                     }
                  }

                  if(var15) {
                     ac[] var36 = o;
                  }

                  ac[] var37 = this.O;
                  var37[0] = var21.k();
                  int var38 = 0;
                  if(var38 < var37.length) {
                     ac var24 = var37[var38];
                     if(var15) {
                        boolean var25 = i6.I(var21, i6.j, new Object[]{var20, var24});
                        if(!var25) {
                           ;
                        }
                     }

                     if(var16) {
                        i6.Q(i6.Mo, new Object[]{var24});
                     }

                     if(this.M) {
                        var24 = this.g(var21, var24);
                     }

                     int var40 = var24.ordinal();
                     if(var21.p().C() != a5.INVISIBLE) {
                        p var26 = var4.m().d(var40);
                        var26.U(var24);
                        _c var27 = var26.X(var12, var20, var19);
                        var27.P(var4.m());
                        if(!var6.Z(var24)) {
                           var6.R(var24);
                           this.y(var26, var8);
                        }

                        var13[var40] |= var14.K(var20, var19, var12, var26);
                        if(var27.L()) {
                           this.b(var4.m(), var6, var13);
                           var27.n(false);
                        }
                     }

                     ++var38;
                  }

                  if(var16) {
                     i6.Q(i6.Mo, (Object[])null);
                  }
               }

               ac[] var31 = o;
               int var32 = var31.length;
               int var33 = 0;
               if(var33 < var32) {
                  ac var35 = var31[var33];
                  if(var13[var35.ordinal()]) {
                     var6.W(var35);
                  }

                  if(var6.Z(var35)) {
                     if(z9.Q()) {
                        wk.Q(var4.m().M(var35));
                     }

                     this.k(var35, var1, var2, var3, var4.m().M(var35), var6);
                  }

                  ++var33;
               }

               var12.h();
            }

            var6.N(var10.z());
            this.z.lock();
            HashSet var29 = Sets.newHashSet(var11);
            HashSet var30 = Sets.newHashSet(this.I);
            var29.removeAll(this.I);
            var30.removeAll(var11);
            this.I.clear();
            this.I.addAll(var11);
            this.t.N(var30, var29);
            this.z.unlock();
         }

      }
   }

   protected void c() {
      this.z.lock();
      if(this.v != null && this.v.C() != i.a.DONE) {
         this.v.v();
         this.v = null;
      }

      this.z.unlock();
   }

   public ReentrantLock y() {
      return this.z;
   }

   public i H() {
      this.z.lock();
      this.c();
      this.v = new i(this, i.f.REBUILD_CHUNK, this.s());
      this.n();
      i var1 = this.v;
      this.z.unlock();
      return var1;
   }

   private void n() {
      boolean var10000 = true;
   }

   @Nullable
   public i J() {
      this.z.lock();
      if(this.v != null && this.v.C() == i.a.PENDING) {
         Object var5 = null;
         this.z.unlock();
         return (i)var5;
      } else {
         if(this.v != null && this.v.C() != i.a.DONE) {
            this.v.v();
            this.v = null;
         }

         this.v = new i(this, i.f.RESORT_TRANSPARENCY, this.s());
         this.v.E(this.a);
         i var2 = this.v;
         this.z.unlock();
         return var2;
      }
   }

   protected double s() {
      net.yy.g var1 = net.nn.j.b().sf;
      double var2 = this.J.n + 8.0D - var1.b;
      double var4 = this.J.u + 8.0D - var1.hS;
      double var6 = this.J.N + 8.0D - var1.hr;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   private void y(p var1, net.u.j var2) {
      var1.m(7, x.M);
      var1.S((double)(-var2.t()), (double)(-var2.h()), (double)(-var2.y()));
   }

   private void k(ac var1, float var2, float var3, float var4, p var5, g var6) {
      if(var1 == ac.TRANSLUCENT && !var6.I(var1)) {
         var5.w(var2, var3, var4);
         var6.u(var5.k());
      }

      var5.Z();
   }

   private void o() {
      d.c();
      d.s();
      float var10000 = 1.000001F;
      d.O(-8.0F, -8.0F, -8.0F);
      d.W(1.000001F, 1.000001F, 1.000001F);
      d.O(8.0F, 8.0F, 8.0F);
      d.t(2982, this.n);
      d.Y();
   }

   public void p() {
      d.I(this.n);
   }

   public g N() {
      return this.a;
   }

   public void u(g var1) {
      this.D.lock();
      this.a = var1;
      this.D.unlock();
   }

   public void D() {
      this.c();
      this.a = g.u;
   }

   public void E() {
      this.D();
      this.f = null;

      for(int var1 = 0; var1 < ac.values().length; ++var1) {
         if(this.u[var1] != null) {
            this.u[var1].B();
         }
      }

   }

   public net.u.j u() {
      return this.Y;
   }

   public void Z(boolean var1) {
      if(this.d) {
         var1 |= this.C;
      }

      this.d = true;
      this.C = var1;
      if(this.e()) {
         this.w = true;
      }

   }

   public void Z() {
      this.d = false;
      this.C = false;
      this.w = false;
   }

   public boolean J() {
      return this.d;
   }

   public boolean z() {
      return this.d && this.C;
   }

   public net.u.j v(aq var1) {
      return this.i[var1.ordinal()];
   }

   public r d() {
      return this.f;
   }

   private boolean e() {
      if(this.f instanceof net.cp.v) {
         net.cp.v var1 = (net.cp.v)this.f;
         return var1.B();
      } else {
         return false;
      }
   }

   public boolean R() {
      return this.w;
   }

   private ac g(net.y9.l var1, ac var2) {
      if(this.E) {
         if(var2 == ac.CUTOUT) {
            if(var1 instanceof gn) {
               return var2;
            }

            if(var1 instanceof z6) {
               return var2;
            }

            return ac.CUTOUT_MIPPED;
         }
      } else if(var2 == ac.CUTOUT_MIPPED) {
         return ac.CUTOUT;
      }

      return var2;
   }

   private void b(b var1, g var2, boolean[] var3) {
      this.c(ac.CUTOUT, var1, var2, var3);
      this.c(ac.CUTOUT_MIPPED, var1, var2, var3);
      this.c(ac.TRANSLUCENT, var1, var2, var3);
   }

   private void c(ac var1, b var2, g var3, boolean[] var4) {
      p var5 = var2.M(var1);
      if(var5.l()) {
         var3.R(var1);
         var4[var1.ordinal()] = true;
      }

   }

   private w5 x() {
      net.u.j var1 = this.Y.F(-1, -1, -1);
      net.yv.q var2 = this.v(this.f, var1, this.Y.F(16, 16, 16), 1);
      if(i6.BW.r()) {
         i6.H(i6.BW, new Object[]{this.f, this.Y, var2});
      }

      w5 var3 = new w5(var2, var1, 1);
      return var3;
   }

   public m T(uu var1, aq var2) {
      m var3 = this.k[var2.ordinal()];
      net.u.j var4 = this.v(var2);
      var3 = var1.J(var4);
      this.k[var2.ordinal()] = var3;
      return var3;
   }

   public q Q(r var1) {
      if(this.e != null && this.e.Q()) {
         return this.e;
      } else {
         this.e = var1.d(this.u());
         return this.e;
      }
   }

   protected net.yv.q v(r var1, net.u.j var2, net.u.j var3, int var4) {
      return new net.yv.q(var1, var2, var3, var4);
   }

   static {
      int[] var10000 = new int[5];
      w(var10000);
   }

   public static void w(int[] var0) {
      g = var0;
   }

   public static int[] t() {
      return g;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
