package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.c5.p;
import net.y6.el;
import net.y6.jb;

public class q8 extends iy {
   public q8() {
      super(net.ni.s0.class, "head_skeleton", 0.0F);
   }

   public net.y6.z J() {
      return new el(0, 0, 64, 32);
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
      g var4 = g.E;
      Object var5 = var4.E(net.ni.s0.class);
      if(!(var5 instanceof p)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new p();
            ((e)var5).m(var4);
         }

         if(!i6.BX.I()) {
            z9.h("Field not found: TileEntitySkullRenderer.humanoidHead");
            return null;
         } else {
            i6.t(var5, i6.BX, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
