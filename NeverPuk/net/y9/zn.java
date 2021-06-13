package net.y9;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class zn extends z4 {
   public static final net.yr.g Q = net.yr.g.B("facing", new Predicate() {
      public boolean L(@Nullable aq var1) {
         return var1 != aq.UP;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });
   public static final net.yr.o R = net.yr.o.k("enabled");
   protected static final net.u.e f = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D);
   protected static final net.u.e a = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.125D);
   protected static final net.u.e M = new net.u.e(0.0D, 0.0D, 0.875D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e F = new net.u.e(0.875D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e h = new net.u.e(0.0D, 0.0D, 0.0D, 0.125D, 1.0D, 1.0D);

   public zn() {
      super(net.y1.l.i, net.y1.h.q);
      this.r(this.b.T().s(Q, aq.DOWN).s(R, Boolean.valueOf(true)));
      this.f(net.ys.r.i);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return I;
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      F(var3, var4, var5, f);
      F(var3, var4, var5, h);
      F(var3, var4, var5, F);
      F(var3, var4, var5, a);
      F(var3, var4, var5, M);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      aq var9 = var3.f();
      if(var9 == aq.UP) {
         var9 = aq.DOWN;
      }

      return this.p().s(Q, var9).s(R, Boolean.valueOf(true));
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.i();
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      g3.v.w();
      super.o(var1, var2, var3, var4, var5);
      if(var5.v()) {
         net.ni.v var7 = var1.L(var2);
         if(var7 instanceof net.ni.i) {
            ((net.ni.i)var7).b(var5.j());
         }
      }

   }

   public boolean L(net.yw.n var1) {
      return true;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.S(var1, var2, var3);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.i) {
            var4.n((net.ni.i)var10);
            var4.S(net.v.q.v);
         }

         return true;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.S(var2, var3, var1);
   }

   private void S(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      boolean var5 = !var1.B(var2);
      if(var5 != ((Boolean)var3.i(R)).booleanValue()) {
         var1.k(var2, var3.s(R, Boolean.valueOf(var5)), 4);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof net.ni.i) {
         net.nl.z3.Z(var1, var2, (net.ni.i)var4);
         var1.Z((net.u.j)var2, (l)this);
      }

      super.V(var1, var2, var3);
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   public static aq W(int var0) {
      return aq.l(var0 & 7);
   }

   public static boolean g(int var0) {
      return (var0 & 8) != 8;
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.D(var2.L(var3));
   }

   public ac k() {
      return ac.CUTOUT_MIPPED;
   }

   public net.yw.n D(int var1) {
      return this.p().s(Q, W(var1)).s(R, Boolean.valueOf(g(var1)));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(Q)).w();
      if(!((Boolean)var1.i(R)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(Q, var2.d((aq)var1.i(Q)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(Q)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{Q, R});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.UP?net.yw.g.BOWL:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
