package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.g;
import net.c5.s;
import net.ni.e;
import net.y6.e4;
import net.y6.jb;

public class ru extends iy {
   public ru() {
      super(e.class, "shulker_box", 0.0F);
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
      iy.A();
      g var4 = g.E;
      Object var5 = var4.E(e.class);
      if(!(var5 instanceof s)) {
         return null;
      } else {
         if(((net.c5.e)var5).j() == null) {
            var5 = new s((e4)var1);
            ((net.c5.e)var5).m(var4);
         }

         if(!i6.MH.I()) {
            z9.h("Field not found: TileEntityShulkerBoxRenderer.model");
            return null;
         } else {
            i6.t(var5, i6.MH, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
