package net;

import net.iy;
import net.xn;
import net.y6.ey;
import net.y6.jb;

public abstract class qd extends iy {
   public qd(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ey)) {
         return null;
      } else {
         ey var4 = (ey)var1;
         return var2.equals("head")?var4.H:(var2.equals("body")?var4.h:(var2.equals("leg1")?var4.r:(var2.equals("leg2")?var4.p:(var2.equals("leg3")?var4.O:(var2.equals("leg4")?var4.a:null)))));
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
