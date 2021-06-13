package net;

import net.bx;
import net.i6;
import net.ik;
import net.iy;
import net.mf;
import net.xn;
import net.nk.t;
import net.nn.j;
import net.y0.d;
import net.y6.b;
import net.y6.jb;

public class id extends ik {
   public id() {
      super(t.class, "vex", 0.3F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof b)) {
         return null;
      } else {
         jb var4 = super.k(var1, var2);
         if(var4 != null) {
            return var4;
         } else {
            b var5 = (b)var1;
            return var2.equals("left_wing")?(jb)i6.G((Object)var5, (mf)i6.M9):(var2.equals("right_wing")?(jb)i6.G((Object)var5, (mf)i6.BR):null);
         }
      }
   }

   public net.y6.z J() {
      return new b();
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.dq var4 = new net.y0.dq(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
