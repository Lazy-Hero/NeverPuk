package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class f_ extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      net.yw.n var5 = var1.Z(var3);
      if((var5.n() == net.y1.l.q || var5.n() == net.y1.l.h) && var3.h() > 1) {
         var3 = var3.b();
         var1.Z(var3);
      }

      if(var3.h() < 1) {
         return false;
      } else {
         var3 = var3.h();
         int var13 = 0;
         net.u.j var6 = var3.F(var2.nextInt(4) - var2.nextInt(4), var2.nextInt(3) - var2.nextInt(3), var2.nextInt(4) - var2.nextInt(4));
         if(var1.y(var6) && var1.Z(var6.b()).z()) {
            var1.k(var6, net.nb.f.uG.p(), 2);
            net.ni.v var7 = var1.L(var6);
            if(var7 instanceof net.ni.k) {
               ((net.ni.k)var7).G(net.y7.p.o, var2.nextLong());
            }

            net.u.j var8 = var6.g();
            net.u.j var9 = var6.H();
            net.u.j var10 = var6.D();
            net.u.j var11 = var6.d();
            if(var1.y(var9) && var1.Z(var9.b()).z()) {
               var1.k(var9, net.nb.f.uZ.p(), 2);
            }

            if(var1.y(var8) && var1.Z(var8.b()).z()) {
               var1.k(var8, net.nb.f.uZ.p(), 2);
            }

            if(var1.y(var10) && var1.Z(var10.b()).z()) {
               var1.k(var10, net.nb.f.uZ.p(), 2);
            }

            if(var1.y(var11) && var1.Z(var11.b()).z()) {
               var1.k(var11, net.nb.f.uZ.p(), 2);
            }

            return true;
         } else {
            ++var13;
            return false;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
