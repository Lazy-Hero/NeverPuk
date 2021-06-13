package net;

import net.bx;
import net.i6;
import net.iy;
import net.ql;
import net.xn;
import net.z9;
import net.nm.m;
import net.nn.j;
import net.y0.c2;
import net.y0.d;

public class qz extends ql {
   public qz() {
      super(m.class, "tnt_minecart", 0.5F);
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      d var4 = j.b().N();
      c2 var5 = new c2(var4);
      if(!i6.C4.I()) {
         z9.h("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         i6.t(var5, i6.C4, var1);
         var5.W = var2;
         return var5;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
