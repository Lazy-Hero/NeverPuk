package net.np;

import net.np.g;

public class p implements net.c0.x {
   public int X() {
      return 135;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if(var1.K("Riding", 10)) {
         net.nj.f var3 = this.G(var1);
         this.M(var1, var3);
         var1 = var3;
      }

      return var1;
   }

   protected void M(net.nj.f var1, net.nj.f var2) {
      net.nj.h var3 = new net.nj.h();
      var3.m(var1);
      var2.K("Passengers", var3);
   }

   protected net.nj.f G(net.nj.f var1) {
      net.nj.f var2 = var1.o("Riding");
      var1.A("Riding");
      return var2;
   }
}
