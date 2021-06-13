package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.n1.a;
import net.nn.j;
import net.y0.ch;
import net.y0.d;
import net.y6.e9;
import net.y6.jb;

public class rg extends iy {
   public rg() {
      super(a.class, "shulker_bullet", 0.0F);
   }

   public net.y6.z J() {
      return new e9();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e9)) {
         return null;
      } else {
         e9 var4 = (e9)var1;
         return var2.equals("bullet")?var4.E:null;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      d var4 = j.b().N();
      ch var5 = new ch(var4);
      if(!i6.uT.I()) {
         z9.h("Field not found: RenderShulkerBullet.model");
         return null;
      } else {
         i6.t(var5, i6.uT, var1);
         var5.W = var2;
         return var5;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
