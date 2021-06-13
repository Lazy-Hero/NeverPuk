package net.w;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.lg;
import net.yz.aq;

public class e extends f {
   public static final net.u.j z = net.u.j.V;
   public static final net.u.j i = new net.u.j(z.t() - 4 & -16, 0, z.y() - 4 & -16);
   private final boolean w;

   public e(boolean var1) {
      this.w = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      Iterator var5 = net.u.j.X(new net.u.j(var3.t() - 4, var3.h() - 1, var3.y() - 4), new net.u.j(var3.t() + 4, var3.h() + 32, var3.y() + 4)).iterator();
      if(var5.hasNext()) {
         net.u.j var6 = (net.u.j)var5.next();
         double var7 = var6.L(var3.t(), var6.h(), var3.y());
         if(Double.compare(var7, 3.5D) <= 0) {
            label131: {
               if(var6.h() < var3.h()) {
                  if(Double.compare(var7, 2.5D) <= 0) {
                     this.k(var1, var6, net.nb.f.T8.p());
                  }

                  if(var6.h() >= var3.h()) {
                     break label131;
                  }

                  this.k(var1, var6, net.nb.f.Tz.p());
               }

               if(var6.h() > var3.h()) {
                  this.k(var1, var6, net.nb.f.ou.p());
               }

               if(var7 > 2.5D) {
                  this.k(var1, var6, net.nb.f.T8.p());
               }

               if(this.w) {
                  this.k(var1, new net.u.j(var6), net.nb.f.TG.p());
               }

               this.k(var1, new net.u.j(var6), net.nb.f.ou.p());
            }
         }
      }

      int var9 = 0;
      this.k(var1, var3.J(var9), net.nb.f.T8.p());
      ++var9;
      net.u.j var11 = var3.J(2);
      Iterator var12 = aq.u.HORIZONTAL.iterator();
      if(var12.hasNext()) {
         aq var13 = (aq)var12.next();
         this.k(var1, var11.C(var13), net.nb.f.uZ.p().s(lg.n, var13));
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
