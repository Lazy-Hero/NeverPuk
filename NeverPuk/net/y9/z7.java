package net.y9;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.lm;
import net.y9.rv;
import net.y9.t;
import net.yv.o8;

public class z7 extends t implements lm {
   protected static final net.u.e H = new net.u.e(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.4000000059604645D, 0.699999988079071D);

   protected z7() {
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return H;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(var4.nextInt(25) == 0) {
         int var6 = 5;
         boolean var10000 = true;
         Iterator var8 = net.u.j.X(var2.F(-4, -1, -4), var2.F(4, 1, 4)).iterator();
         if(var8.hasNext()) {
            net.u.j var9 = (net.u.j)var8.next();
            if(var1.Z(var9).Q() == this) {
               --var6;
               return;
            }
         }

         net.u.j var11 = var2.F(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         int var13 = 0;
         if(var1.y(var11) && this.p(var1, var11, this.p())) {
            var2 = var11;
         }

         var11 = var2.F(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         ++var13;
         if(var1.y(var11) && this.p(var1, var11, this.p())) {
            var1.k(var11, this.p(), 2);
         }
      }

   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.p(var1, var2, this.p());
   }

   protected boolean H(net.yw.n var1) {
      return var1.E();
   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(var2.h() >= 0 && var2.h() < 256) {
         net.yw.n var4 = var1.Z(var2.b());
         return var4.Q() == net.nb.f.u2?true:(var4.Q() == net.nb.f.dl && var4.i(rv.l) == rv.m.PODZOL?true:var1.s(var2) < 13 && this.H(var4));
      } else {
         return false;
      }
   }

   public boolean u(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      var1.J(var2);
      net.w.a var5 = null;
      if(this == net.nb.f.df) {
         var5 = new net.w.a(net.nb.f.d);
      } else if(this == net.nb.f.T) {
         var5 = new net.w.a(net.nb.f.Q);
      }

      if(var5.K(var1, var4, var2)) {
         return true;
      } else {
         var1.k(var2, var3, 3);
         return false;
      }
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return true;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return (double)var2.nextFloat() < 0.4D;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      this.u(var1, var3, var4, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
