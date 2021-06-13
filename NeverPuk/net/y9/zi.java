package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.lk;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.aq;

public class zi extends z4 {
   public static final net.yr.l M = net.yr.l.J("power", 0, 15);
   protected static final net.u.e A = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D);
   private final boolean R;

   public zi(boolean var1) {
      super(net.y1.l.S);
      this.R = var1;
      this.r(this.b.T().s(M, Integer.valueOf(0)));
      this.f(net.ys.r.i);
      this.r(0.2F);
      this.i(lk.v);
      this.o("daylightDetector");
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return A;
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Integer)var1.i(M)).intValue();
   }

   public void g(net.yv.r var1, net.u.j var2) {
      int[] var3 = g3.v.w();
      if(var1.F.A()) {
         net.yw.n var4 = var1.Z(var2);
         int var5 = var1.d(net.yv.w.SKY, var2) - var1.y();
         float var6 = var1.C(1.0F);
         if(this.R) {
            var5 = 15 - var5;
         }

         if(var5 > 0 && !this.R) {
            float var7 = var6 < 3.1415927F?0.0F:6.2831855F;
            var6 = var6 + (var7 - var6) * 0.2F;
            var5 = Math.round((float)var5 * net.u.t.m(var6));
         }

         var5 = net.u.t.g(var5, 0, 15);
         if(((Integer)var4.i(M)).intValue() != var5) {
            var1.k(var2, var4.s(M, Integer.valueOf(var5)), 3);
         }
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var4.VK()) {
         if(var1.x) {
            return true;
         } else {
            if(this.R) {
               var1.k(var2, net.nb.f.u3.p().s(M, var3.i(M)), 4);
               net.nb.f.u3.g(var1, var2);
            } else {
               var1.k(var2, net.nb.f.k.p().s(M, var3.i(M)), 4);
               net.nb.f.k.g(var1, var2);
            }

            return true;
         }
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.u3);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.u3);
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.b();
   }

   public net.yw.n D(int var1) {
      return this.p().s(M, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(M)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{M});
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      if(!this.R) {
         super.C(var1, var2);
      }

   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
