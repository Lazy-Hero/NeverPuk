package net.np;

import net.xn;
import net.np.g;

public class u implements net.c0.x {
   public int X() {
      return 113;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if(var1.K("HandDropChances", 9)) {
         net.nj.h var3 = var1.A("HandDropChances", 5);
         if(var3.z() == 2 && Float.compare(var3.h(0), 0.0F) == 0 && Float.compare(var3.h(1), 0.0F) == 0) {
            var1.A("HandDropChances");
         }
      }

      if(var1.K("ArmorDropChances", 9)) {
         net.nj.h var4 = var1.A("ArmorDropChances", 5);
         if(var4.z() == 4 && Float.compare(var4.h(0), 0.0F) == 0 && var4.h(1) == 0.0F && var4.h(2) == 0.0F && var4.h(3) == 0.0F) {
            var1.A("ArmorDropChances");
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
