package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.n1.j;
import net.y0.d;
import net.y0.q;
import net.y6.e7;
import net.y6.jb;

public class qm extends iy {
   public qm() {
      super(j.class, "evocation_fangs", 0.0F);
   }

   public net.y6.z J() {
      return new e7();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e7)) {
         return null;
      } else {
         e7 var4 = (e7)var1;
         return var2.equals("base")?(jb)i6.g(var4, i6.Bk, 0):(var2.equals("upper_jaw")?(jb)i6.g(var4, i6.Bk, 1):(var2.equals("lower_jaw")?(jb)i6.g(var4, i6.Bk, 2):null));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = net.nn.j.b().N();
      q var4 = new q(var3);
      if(!i6.B5.I()) {
         z9.h("Field not found: RenderEvokerFangs.model");
         return null;
      } else {
         i6.t(var4, i6.B5, var1);
         var4.W = var2;
         return var4;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
