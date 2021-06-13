package net;

import net.iy;
import net.xn;
import net.y6.jb;
import net.y6.t;

public abstract class ik extends iy {
   public ik(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof t)) {
         return null;
      } else {
         t var4 = (t)var1;
         return var2.equals("head")?var4.G:(var2.equals("headwear")?var4.P:(var2.equals("body")?var4.N:(var2.equals("left_arm")?var4.B:(var2.equals("right_arm")?var4.A:(var2.equals("left_leg")?var4.a:(var2.equals("right_leg")?var4.H:null))))));
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
