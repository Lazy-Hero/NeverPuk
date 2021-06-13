package net.np;

import net.xn;
import net.np.g;

public class j implements net.c0.x {
   public int X() {
      return 107;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if(!"MobSpawner".equals(var1.J("id"))) {
         return var1;
      } else {
         if(var1.K("EntityId", 8)) {
            String var3 = var1.J("EntityId");
            net.nj.f var4 = var1.o("SpawnData");
            var4.b("id", var3.isEmpty()?"Pig":var3);
            var1.K("SpawnData", var4);
            var1.A("EntityId");
         }

         if(var1.K("SpawnPotentials", 9)) {
            net.nj.h var7 = var1.A("SpawnPotentials", 10);
            int var8 = 0;
            if(var8 < var7.z()) {
               net.nj.f var5 = var7.i(var8);
               if(var5.K("Type", 8)) {
                  net.nj.f var6 = var5.o("Properties");
                  var6.b("id", var5.J("Type"));
                  var5.K("Entity", var6);
                  var5.A("Type");
                  var5.A("Properties");
               }

               ++var8;
            }
         }

         return var1;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
