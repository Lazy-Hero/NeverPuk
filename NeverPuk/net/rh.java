package net;

import net.bx;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.cv;
import net.y0.d;
import net.y6.e2;
import net.y6.jb;
import net.yn.s;

public class rh extends iy {
   public rh() {
      super(s.class, "villager", 0.5F);
   }

   public net.y6.z J() {
      return new e2(0.0F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e2)) {
         return null;
      } else {
         e2 var4 = (e2)var1;
         return var2.equals("head")?var4.S:(var2.equals("body")?var4.H:(var2.equals("arms")?var4.q:(var2.equals("left_leg")?var4.L:(var2.equals("right_leg")?var4.I:(var2.equals("nose")?var4.U:null)))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      cv var4 = new cv(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
