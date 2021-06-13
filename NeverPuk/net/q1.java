package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.nm.b;
import net.nn.j;
import net.y0.d;
import net.y0.g;
import net.y6.jb;
import net.y6.n;

public class q1 extends iy {
   public q1() {
      super(b.class, "boat", 0.5F);
   }

   public net.y6.z J() {
      return new n();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof n)) {
         return null;
      } else {
         n var4 = (n)var1;
         return var2.equals("bottom")?var4.L[0]:(var2.equals("back")?var4.L[1]:(var2.equals("front")?var4.L[2]:(var2.equals("right")?var4.L[3]:(var2.equals("left")?var4.L[4]:(var2.equals("paddle_left")?var4.q[0]:(var2.equals("paddle_right")?var4.q[1]:(var2.equals("bottom_no_water")?var4.g:null)))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      g var4 = new g(var3);
      if(!i6.CA.I()) {
         z9.h("Field not found: RenderBoat.modelBoat");
         return null;
      } else {
         i6.t(var4, i6.CA, var1);
         var4.W = var2;
         return var4;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
