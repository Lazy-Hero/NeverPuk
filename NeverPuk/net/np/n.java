package net.np;

import net.xn;
import net.np.g;

public class n implements net.c0.x {
   public int X() {
      return 703;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("EntityHorse".equals(var1.J("id"))) {
         int var3 = var1.P("Type");
         switch(var3) {
         case 0:
         default:
            var1.b("id", "Horse");
         case 1:
            var1.b("id", "Donkey");
         case 2:
            var1.b("id", "Mule");
         case 3:
            var1.b("id", "ZombieHorse");
         case 4:
            var1.b("id", "SkeletonHorse");
            var1.A("Type");
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
