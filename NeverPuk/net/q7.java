package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.c5.n;
import net.ni.k;
import net.y6.jb;
import net.y6.m;
import net.y6.y;

public class q7 extends iy {
   public q7() {
      super(k.class, "chest_large", 0.0F);
   }

   public net.y6.z J() {
      return new y();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof m)) {
         return null;
      } else {
         m var4 = (m)var1;
         return var2.equals("lid")?var4.p:(var2.equals("base")?var4.D:(var2.equals("knob")?var4.Y:null));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      g var4 = g.E;
      Object var5 = var4.E(k.class);
      if(!(var5 instanceof n)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new n();
            ((e)var5).m(var4);
         }

         if(!i6.Mw.I()) {
            z9.h("Field not found: TileEntityChestRenderer.largeChest");
            return null;
         } else {
            i6.t(var5, i6.Mw, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
