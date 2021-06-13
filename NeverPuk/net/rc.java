package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.n1.w;
import net.nn.j;
import net.y0.co;
import net.y0.d;
import net.y6.el;
import net.y6.jb;

public class rc extends iy {
   public rc() {
      super(w.class, "wither_skull", 0.0F);
   }

   public net.y6.z J() {
      return new el();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof el)) {
         return null;
      } else {
         el var4 = (el)var1;
         return var2.equals("head")?var4.Y:null;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      d var4 = j.b().N();
      co var5 = new co(var4);
      if(!i6.U.I()) {
         z9.h("Field not found: RenderWitherSkull_model");
         return null;
      } else {
         i6.t(var5, i6.U, var1);
         var5.W = var2;
         return var5;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
