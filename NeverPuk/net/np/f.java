package net.np;

import net.xn;
import net.np.g;

public class f implements net.c0.x {
   public int X() {
      return 702;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("Zombie".equals(var1.J("id"))) {
         int var3 = var1.P("ZombieType");
         switch(var3) {
         case 0:
         default:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            var1.b("id", "ZombieVillager");
            var1.r("Profession", var3 - 1);
         case 6:
            var1.b("id", "Husk");
            var1.A("ZombieType");
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
