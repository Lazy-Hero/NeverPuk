package net.y9;

import com.google.common.base.Predicate;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.y9.g3;
import net.y9.rw;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class rm extends rw {
   private net.cw.t Q;
   private net.cw.t o;
   private net.cw.t H;
   private net.cw.t c;
   private static final Predicate F = new Predicate() {
      public boolean a(@Nullable net.yw.n var1) {
         int[] var2 = g3.v.w();
         return var1 != null && (var1.Q() == net.nb.f.TS || var1.Q() == net.nb.f.N);
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   protected rm() {
      super(net.y1.l.H, net.y1.h.p);
      this.r(this.b.T().s(N, aq.NORTH));
      this.R(true);
      this.f(net.ys.r.M);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      this.p(var1, var2);
   }

   public boolean V(net.yv.r var1, net.u.j var2) {
      return this.e().X(var1, var2) != null || this.R().X(var1, var2) != null;
   }

   private void p(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      net.cw.t var4 = this.V().X(var1, var2);
      if(var4 != null) {
         int var5 = 0;
         if(var5 < this.V().R()) {
            net.yw.w var6 = var4.v(0, var5, 0);
            var1.k(var6.X(), net.nb.f.ou.p(), 2);
            ++var5;
         }

         net.nk.c var12 = new net.nk.c(var1);
         net.u.j var16 = var4.v(0, 2, 0).X();
         var12.S((double)var16.t() + 0.5D, (double)var16.h() + 0.05D, (double)var16.y() + 0.5D, 0.0F, 0.0F);
         var1.S(var12);
         Iterator var7 = var1.p(net.r.h.class, var12.i().x(5.0D)).iterator();
         if(var7.hasNext()) {
            net.r.h var8 = (net.r.h)var7.next();
            b2.O.g(var8, var12);
         }

         int var20 = 0;
         var1.n(ai.SNOW_SHOVEL, (double)var16.t() + var1.G.nextDouble(), (double)var16.h() + var1.G.nextDouble() * 2.5D, (double)var16.y() + var1.G.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
         ++var20;
         var20 = 0;
         if(var20 < this.V().R()) {
            net.yw.w var29 = var4.v(0, var20, 0);
            var1.c(var29.X(), net.nb.f.ou, false);
            ++var20;
         }
      }

      var4 = this.l().X(var1, var2);
      if(var4 != null) {
         int var13 = 0;
         if(var13 < this.l().u()) {
            int var17 = 0;
            if(var17 < this.l().R()) {
               var1.k(var4.v(var13, var17, 0).X(), net.nb.f.ou.p(), 2);
               ++var17;
            }

            ++var13;
         }

         net.u.j var15 = var4.v(1, 2, 0).X();
         net.nk.b var19 = new net.nk.b(var1);
         var19.b(true);
         var19.S((double)var15.t() + 0.5D, (double)var15.h() + 0.05D, (double)var15.y() + 0.5D, 0.0F, 0.0F);
         var1.S(var19);
         Iterator var24 = var1.p(net.r.h.class, var19.i().x(5.0D)).iterator();
         if(var24.hasNext()) {
            net.r.h var30 = (net.r.h)var24.next();
            b2.O.g(var30, var19);
         }

         int var25 = 0;
         var1.n(ai.SNOWBALL, (double)var15.t() + var1.G.nextDouble(), (double)var15.h() + var1.G.nextDouble() * 3.9D, (double)var15.y() + var1.G.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
         ++var25;
         var25 = 0;
         if(var25 < this.l().u()) {
            int var31 = 0;
            if(var31 < this.l().R()) {
               net.yw.w var9 = var4.v(var25, var31, 0);
               var1.c(var9.X(), net.nb.f.ou, false);
               ++var31;
            }

            ++var25;
         }
      }

   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2).Q().C.p() && var1.Z(var2.b()).z();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(N, var8.V().f());
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1));
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(N)).u();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N});
   }

   protected net.cw.t e() {
      if(this.Q == null) {
         this.Q = net.cw.r.G().j(new String[]{" ", "#", "#"}).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.V))).e();
      }

      return this.Q;
   }

   protected net.cw.t V() {
      if(this.o == null) {
         this.o = net.cw.r.G().j(new String[]{"^", "#", "#"}).d('^', net.yw.w.U(F)).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.V))).e();
      }

      return this.o;
   }

   protected net.cw.t R() {
      if(this.H == null) {
         this.H = net.cw.r.G().j(new String[]{"~ ~", "###", "~#~"}).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.TE))).d('~', net.yw.w.U(net.cw.x.z(net.y1.l.q))).e();
      }

      return this.H;
   }

   protected net.cw.t l() {
      if(this.c == null) {
         this.c = net.cw.r.G().j(new String[]{"~^~", "###", "~#~"}).d('^', net.yw.w.U(F)).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.TE))).d('~', net.yw.w.U(net.cw.x.z(net.y1.l.q))).e();
      }

      return this.c;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
