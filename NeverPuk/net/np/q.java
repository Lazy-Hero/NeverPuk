package net.np;

import net.xn;
import net.np.g;

public class q implements net.c0.x {
   public int X() {
      return 804;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("minecraft:banner".equals(var1.J("id")) && var1.K("tag", 10)) {
         net.nj.f var3 = var1.o("tag");
         if(var3.K("BlockEntityTag", 10)) {
            net.nj.f var4 = var3.o("BlockEntityTag");
            if(var4.K("Base", 99)) {
               var1.h("Damage", (short)(var4.E("Base") & 15));
               if(var3.K("display", 10)) {
                  net.nj.f var5 = var3.o("display");
                  if(var5.K("Lore", 9)) {
                     net.nj.h var6 = var5.A("Lore", 8);
                     if(var6.z() == 1 && "(+NBT)".equals(var6.w(0))) {
                        return var1;
                     }
                  }
               }

               var4.A("Base");
               if(var4.N()) {
                  var3.A("BlockEntityTag");
               }

               if(var3.N()) {
                  var1.A("tag");
               }
            }
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
