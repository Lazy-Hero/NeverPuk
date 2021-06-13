package net;

import net.bx;
import net.i6;
import net.iy;
import net.ql;
import net.xn;
import net.z9;
import net.nm.d;
import net.nn.j;
import net.y0.cx;

public class qp extends ql {
   public qp() {
      super(d.class, "spawner_minecart", 0.5F);
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      net.y0.d var4 = j.b().N();
      cx var5 = new cx(var4);
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
