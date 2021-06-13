package net.y9;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g2;
import net.y9.g3;
import net.y9.r;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class gt extends g2 implements r {
   public static final net.yr.o a = net.yr.o.k("powered");
   public static final net.yr.w F = net.yr.w.l("mode", gt.g.class);

   public gt(boolean var1) {
      super(var1);
      this.r(this.b.T().s(N, aq.NORTH).s(a, Boolean.valueOf(false)).s(F, gt.g.COMPARE));
      this.U = true;
   }

   public String U() {
      return net.yq.e.E("item.comparator.name");
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.W7;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.W7);
   }

   protected int j(net.yw.n var1) {
      return 2;
   }

   protected net.yw.n w(net.yw.n var1) {
      Boolean var2 = (Boolean)var1.i(a);
      gt.g var3 = (gt.g)var1.i(F);
      aq var4 = (aq)var1.i(N);
      return net.nb.f.B.p().s(N, var4).s(a, var2).s(F, var3);
   }

   protected net.yw.n h(net.yw.n var1) {
      Boolean var2 = (Boolean)var1.i(a);
      gt.g var3 = (gt.g)var1.i(F);
      aq var4 = (aq)var1.i(N);
      return net.nb.f.dA.p().s(N, var4).s(a, var2).s(F, var3);
   }

   protected boolean I(net.yw.n var1) {
      return this.W || ((Boolean)var1.i(a)).booleanValue();
   }

   protected int e(o8 var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      return var4 instanceof net.ni.t?((net.ni.t)var4).j():0;
   }

   private int X(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return var3.i(F) == gt.g.SUBTRACT?Math.max(this.H(var1, var2, var3) - this.x(var1, var2, var3), 0):this.H(var1, var2, var3);
   }

   protected boolean b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = this.H(var1, var2, var3);
      return var4 >= 15;
   }

   protected int H(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      g3.v.w();
      int var5 = super.H(var1, var2, var3);
      aq var6 = (aq)var3.i(N);
      net.u.j var7 = var2.C(var6);
      net.yw.n var8 = var1.Z(var7);
      if(var8.x()) {
         var5 = var8.f(var1, var7);
      }

      if(var5 < 15 && var8.i()) {
         var7 = var7.C(var6);
         var8 = var1.Z(var7);
         if(var8.x()) {
            var5 = var8.f(var1, var7);
         }

         if(var8.n() == net.y1.l.q) {
            net.nm.e var9 = this.j(var1, var6, var7);
            if(var9 != null) {
               var5 = var9.x();
            }
         }
      }

      return var5;
   }

   @Nullable
   private net.nm.e j(net.yv.r var1, final aq var2, net.u.j var3) {
      List var4 = var1.L(net.nm.e.class, new net.u.e((double)var3.t(), (double)var3.h(), (double)var3.y(), (double)(var3.t() + 1), (double)(var3.h() + 1), (double)(var3.y() + 1)), new Predicate() {
         public boolean z(@Nullable net.ne.l var1) {
            int[] var2x = g3.v.w();
            return var1 != null && var1.V() == var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      return var4.size() == 1?(net.nm.e)var4.get(0):null;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(!var4.a6.s) {
         return false;
      } else {
         var3 = var3.C(F);
         float var10 = var3.i(F) == gt.g.SUBTRACT?0.55F:0.5F;
         var1.M(var4, var2, net.nb.l.MG, net.yz.p.BLOCKS, 0.3F, var10);
         var1.k(var2, var3, 2);
         this.p(var1, var2, var3);
         return true;
      }
   }

   protected void z(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.M(var2, this)) {
         int var4 = this.X(var1, var2, var3);
         net.ni.v var5 = var1.L(var2);
         int var6 = var5 instanceof net.ni.t?((net.ni.t)var5).j():0;
         if(var4 != var6 || this.I(var3) != this.b(var1, var2, var3)) {
            if(this.F(var1, var2, var3)) {
               var1.V(var2, this, 2, -1);
            } else {
               var1.V(var2, this, 2, 0);
            }
         }
      }

   }

   private void p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = this.X(var1, var2, var3);
      net.ni.v var5 = var1.L(var2);
      int var6 = 0;
      if(var5 instanceof net.ni.t) {
         net.ni.t var7 = (net.ni.t)var5;
         var6 = var7.j();
         var7.D(var4);
      }

      if(var6 != var4 || var3.i(F) == gt.g.COMPARE) {
         boolean var9 = this.b(var1, var2, var3);
         boolean var8 = this.I(var3);
         var1.k(var2, var3.s(a, Boolean.valueOf(false)), 2);
         this.q(var1, var2, var3);
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(this.W) {
         var1.k(var2, this.h(var3).s(a, Boolean.valueOf(true)), 4);
      }

      this.p(var1, var2, var3);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      var1.Z(var2, this.J(var1, 0));
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      var1.j(var2);
      this.q(var1, var2, var3);
   }

   public boolean T(net.yw.n var1, net.yv.r var2, net.u.j var3, int var4, int var5) {
      super.T(var1, var2, var3, var4, var5);
      net.ni.v var6 = var2.L(var3);
      return var6.q(var4, var5);
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.t();
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1)).s(a, Boolean.valueOf((var1 & 8) > 0)).s(F, (var1 & 4) > 0?gt.g.SUBTRACT:gt.g.COMPARE);
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      if(((Boolean)var1.i(a)).booleanValue()) {
         var2 |= 8;
      }

      if(var1.i(F) == gt.g.SUBTRACT) {
         var2 |= 4;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, F, a});
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(N, var8.V().f()).s(a, Boolean.valueOf(false)).s(F, gt.g.COMPARE);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum g implements au {
      COMPARE("compare"),
      SUBTRACT("subtract");

      private final String k;

      private g(String var3) {
         this.k = var3;
      }

      public String toString() {
         return this.k;
      }

      public String f() {
         return this.k;
      }
   }
}
