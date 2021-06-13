package net;

import net.bx;
import net.iy;
import net.xn;
import net.nk.b;
import net.nn.j;
import net.y0.d;
import net.y6.eg;
import net.y6.jb;

public class q0 extends iy {
   public q0() {
      super(b.class, "iron_golem", 0.5F);
   }

   public net.y6.z J() {
      return new eg();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eg)) {
         return null;
      } else {
         eg var4 = (eg)var1;
         return var2.equals("head")?var4.Q:(var2.equals("body")?var4.P:(var2.equals("left_arm")?var4.b:(var2.equals("right_arm")?var4.k:(var2.equals("left_leg")?var4.B:(var2.equals("right_leg")?var4.l:null)))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.df var4 = new net.y0.df(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
