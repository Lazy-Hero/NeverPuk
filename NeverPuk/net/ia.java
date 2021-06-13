package net;

import net.bx;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.h;
import net.y6.d;
import net.y6.jb;

public class ia extends iy {
   public ia() {
      super(net.nm.z.class, "armor_stand", 0.7F);
   }

   public net.y6.z J() {
      return new d();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof d)) {
         return null;
      } else {
         d var4 = (d)var1;
         return var2.equals("right")?var4.D:(var2.equals("left")?var4.F:(var2.equals("waist")?var4.d:(var2.equals("base")?var4.m:null)));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      net.y0.d var3 = j.b().N();
      h var4 = new h(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
