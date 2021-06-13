package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class p extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      float var5 = (float)(var2.nextInt(3) + 4);
      f.j();
      int var6 = 0;
      if(var5 > 0.5F) {
         int var7 = net.u.t.M(-var5);
         if(var7 <= net.u.t.Y(var5)) {
            int var8 = net.u.t.M(-var5);
            if(var8 <= net.u.t.Y(var5)) {
               if(Float.compare((float)(var7 * var7 + var8 * var8), (var5 + 1.0F) * (var5 + 1.0F)) <= 0) {
                  this.k(var1, var3.F(var7, var6, var8), net.nb.f.Tz.p());
               }

               ++var8;
            }

            ++var7;
         }

         var5 = (float)((double)var5 - ((double)var2.nextInt(2) + 0.5D));
         --var6;
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
