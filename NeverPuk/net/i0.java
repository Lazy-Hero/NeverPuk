package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y0.i;
import net.y6.g;
import net.y6.jb;
import net.yn.y;

public class i0 extends iy {
   public i0() {
      super(y.class, "bat", 0.25F);
   }

   public net.y6.z J() {
      return new g();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof g)) {
         return null;
      } else {
         g var4 = (g)var1;
         return var2.equals("head")?(jb)i6.g(var4, i6.UH, 0):(var2.equals("body")?(jb)i6.g(var4, i6.UH, 1):(var2.equals("right_wing")?(jb)i6.g(var4, i6.UH, 2):(var2.equals("left_wing")?(jb)i6.g(var4, i6.UH, 3):(var2.equals("outer_right_wing")?(jb)i6.g(var4, i6.UH, 4):(var2.equals("outer_left_wing")?(jb)i6.g(var4, i6.UH, 5):null)))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      i var4 = new i(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
