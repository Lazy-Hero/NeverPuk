package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yz.ai;

public class r1 extends l {
   public static boolean D;

   public r1() {
      super(net.y1.l.Z);
      this.f(net.ys.r.M);
   }

   public r1(net.y1.l var1) {
      super(var1);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var1.c(var2, this, this.u(var1));
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      var2.c(var3, this, this.u(var2));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         this.c(var1, var2);
      }

   }

   private void c(net.yv.r var1, net.u.j var2) {
      int[] var3 = g3.v.w();
      if(T(var1.Z(var2.b())) && var2.h() >= 0) {
         boolean var10000 = true;
         if(!D && var1.C(var2.F(-32, -32, -32), var2.F(32, 32, 32))) {
            if(var1.x) {
               return;
            }

            net.nm.v var5 = new net.nm.v(var1, (double)var2.t() + 0.5D, (double)var2.h(), (double)var2.y() + 0.5D, var1.Z(var2));
            this.l(var5);
            var1.S(var5);
         }

         var1.J(var2);
         net.u.j var6 = var2.b();
         if(T(var1.Z(var6)) && var6.h() > 0) {
            var6 = var6.b();
         }

         if(var6.h() > 0) {
            var1.U(var6.h(), this.p());
         }
      }

   }

   protected void l(net.nm.v var1) {
   }

   public int u(net.yv.r var1) {
      return 2;
   }

   public static boolean T(net.yw.n var0) {
      l var1 = var0.Q();
      net.y1.l var2 = var0.n();
      return var1 == net.nb.f.g || var2 == net.y1.l.q || var2 == net.y1.l.p || var2 == net.y1.l.U;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.yw.n var4) {
   }

   public void j(net.yv.r var1, net.u.j var2) {
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(var4.nextInt(16) == 0) {
         net.u.j var5 = var3.b();
         if(T(var2.Z(var5))) {
            double var6 = (double)((float)var3.t() + var4.nextFloat());
            double var8 = (double)var3.h() - 0.05D;
            double var10 = (double)((float)var3.y() + var4.nextFloat());
            var2.n(ai.FALLING_DUST, var6, var8, var10, 0.0D, 0.0D, 0.0D, new int[]{l.m(var1)});
         }
      }

   }

   public int l(net.yw.n var1) {
      return -16777216;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
