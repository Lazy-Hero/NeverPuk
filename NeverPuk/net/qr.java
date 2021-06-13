package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.c5.u;
import net.ni.n;
import net.y6.jb;
import net.y6.m;

public class qr extends iy {
   public qr() {
      super(n.class, "ender_chest", 0.0F);
   }

   public net.y6.z J() {
      return new m();
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
      Object var5 = var4.E(n.class);
      if(!(var5 instanceof u)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new u();
            ((e)var5).m(var4);
         }

         if(!i6.BK.I()) {
            z9.h("Field not found: TileEntityEnderChestRenderer.modelChest");
            return null;
         } else {
            i6.t(var5, i6.BK, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
