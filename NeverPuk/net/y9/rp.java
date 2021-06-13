package net.y9;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.ni.s0;
import net.y9.g3;
import net.y9.ru;
import net.y9.z4;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class rp extends z4 {
   public static final net.yr.g N = ru.n;
   public static final net.yr.o a = net.yr.o.k("nodrop");
   private static final Predicate A = new Predicate() {
      public boolean g(@Nullable net.yw.w var1) {
         int[] var2 = g3.v.w();
         return var1.J() != null && var1.J().Q() == net.nb.f.dB && var1.K() instanceof s0 && ((s0)var1.K()).Z() == 1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   protected static final net.u.e R = new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);
   protected static final net.u.e l = new net.u.e(0.25D, 0.25D, 0.5D, 0.75D, 0.75D, 1.0D);
   protected static final net.u.e i = new net.u.e(0.25D, 0.25D, 0.0D, 0.75D, 0.75D, 0.5D);
   protected static final net.u.e F = new net.u.e(0.5D, 0.25D, 0.25D, 1.0D, 0.75D, 0.75D);
   protected static final net.u.e h = new net.u.e(0.0D, 0.25D, 0.25D, 0.5D, 0.75D, 0.75D);
   private net.cw.t u;
   private net.cw.t d;

   protected rp() {
      super(net.y1.l.c);
      this.r(this.b.T().s(N, aq.NORTH).s(a, Boolean.valueOf(false)));
   }

   public String U() {
      return net.yq.e.E("tile.skull.skeleton.name");
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean j(net.yw.n var1) {
      return true;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.g[((aq)var1.i(N)).ordinal()]) {
      case 1:
      default:
         return R;
      case 2:
         return l;
      case 3:
         return i;
      case 4:
         return F;
      case 5:
         return h;
      }
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(N, var8.V()).s(a, Boolean.valueOf(false));
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new s0();
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = 0;
      net.ni.v var5 = var1.L(var2);
      if(var5 instanceof s0) {
         var4 = ((s0)var5).Z();
      }

      return new ks(net.nb.j.Y9, 1, var4);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      if(var4.a6.V) {
         var3 = var3.s(a, Boolean.valueOf(true));
         var1.k(var2, var3, 4);
      }

      super.X(var1, var2, var3, var4);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x) {
         if(!((Boolean)var3.i(a)).booleanValue()) {
            net.ni.v var4 = var1.L(var2);
            if(var4 instanceof s0) {
               s0 var5 = (s0)var4;
               ks var6 = this.N(var1, var2, var3);
               if(var5.Z() == 3 && var5.U() != null) {
                  var6.t(new net.nj.f());
                  net.nj.f var7 = new net.nj.f();
                  net.nj.e.u(var7, var5.U());
                  var6.o().K("SkullOwner", var7);
               }

               e(var1, var2, var6);
            }
         }

         super.V(var1, var2, var3);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Y9;
   }

   public boolean i(net.yv.r var1, net.u.j var2, ks var3) {
      return var3.n() == 1 && var2.h() >= 2 && var1.k() != net.yv.l.PEACEFUL && !var1.x?this.T().X(var1, var2) != null:false;
   }

   public void w(net.yv.r var1, net.u.j var2, s0 var3) {
      int[] var4 = g3.v.w();
      if(var3.Z() == 1 && var2.h() >= 2 && var1.k() != net.yv.l.PEACEFUL && !var1.x) {
         net.cw.t var5 = this.x();
         net.cw.t var6 = var5.X(var1, var2);
         int var7 = 0;
         net.yw.w var8 = var6.v(var7, 0, 0);
         var1.k(var8.X(), var8.J().s(a, Boolean.valueOf(true)), 2);
         ++var7;
         var7 = 0;
         if(var7 < var5.u()) {
            int var17 = 0;
            if(var17 < var5.R()) {
               net.yw.w var9 = var6.v(var7, var17, 0);
               var1.k(var9.X(), net.nb.f.ou.p(), 2);
               ++var17;
            }

            ++var7;
         }

         net.u.j var16 = var6.v(1, 0, 0).X();
         net.a.z var19 = new net.a.z(var1);
         net.u.j var20 = var6.v(1, 2, 0).X();
         var19.S((double)var20.t() + 0.5D, (double)var20.h() + 0.55D, (double)var20.y() + 0.5D, var6.q().r() == aq.l.X?0.0F:90.0F, 0.0F);
         var19.AK = var6.q().r() == aq.l.X?0.0F:90.0F;
         var19.H();
         Iterator var10 = var1.p(net.r.h.class, var19.i().x(50.0D)).iterator();
         if(var10.hasNext()) {
            net.r.h var11 = (net.r.h)var10.next();
            b2.O.g(var11, var19);
         }

         var1.S(var19);
         int var21 = 0;
         var1.n(ai.SNOWBALL, (double)var16.t() + var1.G.nextDouble(), (double)(var16.h() - 2) + var1.G.nextDouble() * 3.9D, (double)var16.y() + var1.G.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
         ++var21;
         var21 = 0;
         if(var21 < var5.u()) {
            int var25 = 0;
            if(var25 < var5.R()) {
               net.yw.w var12 = var6.v(var21, var25, 0);
               var1.c(var12.X(), net.nb.f.ou, false);
               ++var25;
            }

            ++var21;
         }
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.l(var1 & 7)).s(a, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).w();
      if(((Boolean)var1.i(a)).booleanValue()) {
         var2 |= 8;
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
      return new net.yw.q(this, new net.yr.h[]{N, a});
   }

   protected net.cw.t T() {
      if(this.u == null) {
         this.u = net.cw.r.G().j(new String[]{"   ", "###", "~#~"}).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.u9))).d('~', net.yw.w.U(net.cw.x.z(net.y1.l.q))).e();
      }

      return this.u;
   }

   protected net.cw.t x() {
      if(this.d == null) {
         this.d = net.cw.r.G().j(new String[]{"^^^", "###", "~#~"}).d('#', net.yw.w.U(net.cw.j.T(net.nb.f.u9))).d('^', A).d('~', net.yw.w.U(net.cw.x.z(net.y1.l.q))).e();
      }

      return this.d;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
