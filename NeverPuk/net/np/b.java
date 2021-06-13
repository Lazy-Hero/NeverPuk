package net.np;

import net.xn;
import net.np.g;

public class b implements net.c0.x {
   public int X() {
      return 701;
   }

   public net.nj.f r(net.nj.f var1) {
      g.D();
      String var3 = var1.J("id");
      if("Skeleton".equals(var3)) {
         int var4 = var1.P("SkeletonType");
         if(var4 == 1) {
            var1.b("id", "WitherSkeleton");
         }

         if(var4 == 2) {
            var1.b("id", "Stray");
         }

         var1.A("SkeletonType");
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
