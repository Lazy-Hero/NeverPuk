package net.np;

import net.xn;
import net.np.g;

public class ex implements net.c0.x {
   public int X() {
      return 100;
   }

   public net.nj.f r(net.nj.f var1) {
      g.D();
      net.nj.h var3 = var1.A("Equipment", 10);
      if(!var3.N() && !var1.K("HandItems", 10)) {
         net.nj.h var4 = new net.nj.h();
         var4.m(var3.h(0));
         var4.m(new net.nj.f());
         var1.K("HandItems", var4);
      }

      if(var3.z() > 1 && !var1.K("ArmorItem", 10)) {
         net.nj.h var6 = new net.nj.h();
         var6.m(var3.i(1));
         var6.m(var3.i(2));
         var6.m(var3.i(3));
         var6.m(var3.i(4));
         var1.K("ArmorItems", var6);
      }

      var1.A("Equipment");
      if(var1.K("DropChances", 9)) {
         net.nj.h var7 = var1.A("DropChances", 5);
         if(!var1.K("HandDropChances", 10)) {
            net.nj.h var5 = new net.nj.h();
            var5.m(new net.nj.j(var7.h(0)));
            var5.m(new net.nj.j(0.0F));
            var1.K("HandDropChances", var5);
         }

         if(!var1.K("ArmorDropChances", 10)) {
            net.nj.h var8 = new net.nj.h();
            var8.m(new net.nj.j(var7.h(1)));
            var8.m(new net.nj.j(var7.h(2)));
            var8.m(new net.nj.j(var7.h(3)));
            var8.m(new net.nj.j(var7.h(4)));
            var1.K("ArmorDropChances", var8);
         }

         var1.A("DropChances");
      }

      net.u.d.h(new net.u.d[4]);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
