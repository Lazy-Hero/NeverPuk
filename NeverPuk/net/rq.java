package net;

import net.bx;
import net.iy;
import net.xn;
import net.nk.j;
import net.y0.d;
import net.y6.e4;
import net.y6.jb;

public class rq extends iy {
   public rq() {
      super(j.class, "shulker", 0.0F);
   }

   public net.y6.z J() {
      return new e4();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e4)) {
         return null;
      } else {
         e4 var4 = (e4)var1;
         return var2.equals("head")?var4.N:(var2.equals("base")?var4.G:(var2.equals("lid")?var4.s:null));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = net.nn.j.b().N();
      net.y0.d8 var4 = new net.y0.d8(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
