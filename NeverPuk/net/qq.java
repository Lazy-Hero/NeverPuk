package net;

import net.bx;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y6.i;
import net.y6.jb;
import net.yn.a;

public class qq extends iy {
   public qq() {
      super(a.class, "chicken", 0.3F);
   }

   public net.y6.z J() {
      return new i();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof i)) {
         return null;
      } else {
         i var4 = (i)var1;
         return var2.equals("head")?var4.m:(var2.equals("body")?var4.a:(var2.equals("right_leg")?var4.I:(var2.equals("left_leg")?var4.p:(var2.equals("right_wing")?var4.h:(var2.equals("left_wing")?var4.Q:(var2.equals("bill")?var4.G:(var2.equals("chin")?var4.M:null)))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.d9 var4 = new net.y0.d9(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
