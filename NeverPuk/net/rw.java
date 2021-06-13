package net;

import net.bx;
import net.iy;
import net.xn;
import net.nk.c;
import net.nn.j;
import net.y0.d;
import net.y6.e0;
import net.y6.jb;

public class rw extends iy {
   public rw() {
      super(c.class, "snow_golem", 0.5F);
   }

   public net.y6.z J() {
      return new e0();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e0)) {
         return null;
      } else {
         e0 var4 = (e0)var1;
         return var2.equals("body")?var4.d:(var2.equals("body_bottom")?var4.J:(var2.equals("head")?var4.a:(var2.equals("left_hand")?var4.H:(var2.equals("right_hand")?var4.N:null))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.d4 var4 = new net.y0.d4(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
