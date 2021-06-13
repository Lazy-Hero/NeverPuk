package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.a.t;
import net.nn.j;
import net.y0.d;
import net.y6.jb;
import net.y6.x;

public class qg extends iy {
   public qg() {
      super(t.class, "dragon", 0.5F);
   }

   public net.y6.z J() {
      return new x(0.0F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof x)) {
         return null;
      } else {
         x var4 = (x)var1;
         return var2.equals("head")?(jb)i6.g(var4, i6.uy, 0):(var2.equals("spine")?(jb)i6.g(var4, i6.uy, 1):(var2.equals("jaw")?(jb)i6.g(var4, i6.uy, 2):(var2.equals("body")?(jb)i6.g(var4, i6.uy, 3):(var2.equals("rear_leg")?(jb)i6.g(var4, i6.uy, 4):(var2.equals("front_leg")?(jb)i6.g(var4, i6.uy, 5):(var2.equals("rear_leg_tip")?(jb)i6.g(var4, i6.uy, 6):(var2.equals("front_leg_tip")?(jb)i6.g(var4, i6.uy, 7):(var2.equals("rear_foot")?(jb)i6.g(var4, i6.uy, 8):(var2.equals("front_foot")?(jb)i6.g(var4, i6.uy, 9):(var2.equals("wing")?(jb)i6.g(var4, i6.uy, 10):(var2.equals("wing_tip")?(jb)i6.g(var4, i6.uy, 11):null)))))))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.d2 var4 = new net.y0.d2(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
