package net;

import net.bx;
import net.i6;
import net.iy;
import net.qf;
import net.xn;
import net.z9;
import net.nn.j;
import net.y0.c;
import net.y0.d;
import net.y6.k;

public class qb extends qf {
   public qb() {
      super("end_crystal_no_base");
   }

   public net.y6.z J() {
      return new k(0.0F, false);
   }

   public bx A(net.y6.z var1, float var2) {
      d var4 = j.b().N();
      iy.A();
      c var5 = (c)var4.k().get(net.nm.j.class);
      if(!(var5 instanceof net.y0.k)) {
         z9.h("Not an instance of RenderEnderCrystal: " + var5);
         return null;
      } else {
         net.y0.k var6 = (net.y0.k)var5;
         if(!i6.CB.I()) {
            z9.h("Field not found: RenderEnderCrystal.modelEnderCrystalNoBase");
            return null;
         } else {
            i6.t(var6, i6.CB, var1);
            var6.W = var2;
            return var6;
         }
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
