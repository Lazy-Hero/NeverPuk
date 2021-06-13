package net.np;

import net.xn;
import net.np.g;

public class w implements net.c0.x {
   public int X() {
      return 806;
   }

   public net.nj.f r(net.nj.f var1) {
      g.D();
      String var3 = var1.J("id");
      if("minecraft:potion".equals(var3) || "minecraft:splash_potion".equals(var3) || "minecraft:lingering_potion".equals(var3) || "minecraft:tipped_arrow".equals(var3)) {
         net.nj.f var4 = var1.o("tag");
         if(!var4.K("Potion", 8)) {
            var4.b("Potion", "minecraft:water");
         }

         if(!var1.K("tag", 10)) {
            var1.K("tag", var4);
         }
      }

      if(net.u.d.y() == null) {
         g.y("Wnzasc");
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
