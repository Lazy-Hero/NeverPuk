package net.np;

import net.xn;
import net.np.g;

public class x implements net.c0.x {
   public int X() {
      return 110;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("EntityHorse".equals(var1.J("id")) && !var1.K("SaddleItem", 10) && var1.i("Saddle")) {
         net.nj.f var3 = new net.nj.f();
         var3.b("id", "minecraft:saddle");
         var3.D("Count", (byte)1);
         var3.h("Damage", (short)0);
         var1.K("SaddleItem", var3);
         var1.A("Saddle");
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
