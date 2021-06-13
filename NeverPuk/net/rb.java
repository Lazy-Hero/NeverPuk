package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.nk.f0;
import net.nn.j;
import net.y0.d;
import net.y0.dz;
import net.y6.eh;
import net.y6.jb;

public class rb extends iy {
   public rb() {
      super(f0.class, "slime", 0.25F);
   }

   public net.y6.z J() {
      return new eh(16);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eh)) {
         return null;
      } else {
         eh var4 = (eh)var1;
         return var2.equals("body")?(jb)i6.g(var4, i6.BB, 0):(var2.equals("left_eye")?(jb)i6.g(var4, i6.BB, 1):(var2.equals("right_eye")?(jb)i6.g(var4, i6.BB, 2):(var2.equals("mouth")?(jb)i6.g(var4, i6.BB, 3):null)));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      dz var4 = new dz(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
