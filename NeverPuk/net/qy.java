package net;

import net.iy;
import net.xn;
import net.y6.e3;
import net.y6.jb;

public abstract class qy extends iy {
   public qy(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e3)) {
         return null;
      } else {
         e3 var4 = (e3)var1;
         return var2.equals("head")?var4.B:(var2.equals("body")?var4.X:(var2.equals("arms")?var4.D:(var2.equals("left_leg")?var4.G:(var2.equals("right_leg")?var4.y:(var2.equals("nose")?var4.A:(var2.equals("left_arm")?var4.J:(var2.equals("right_arm")?var4.N:null)))))));
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
