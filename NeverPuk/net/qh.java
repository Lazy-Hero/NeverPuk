package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.c5.p;
import net.y6.jb;
import net.y6.o;

public class qh extends iy {
   public qh() {
      super(net.ni.s0.class, "head_dragon", 0.0F);
   }

   public net.y6.z J() {
      return new o(0.0F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof o)) {
         return null;
      } else {
         o var4 = (o)var1;
         return var2.equals("head")?(jb)i6.G((Object)var4, (mf)i6.ub):(var2.equals("jaw")?(jb)i6.G((Object)var4, (mf)i6.um):null);
      }
   }

   public bx A(net.y6.z var1, float var2) {
      g var4 = g.E;
      iy.A();
      Object var5 = var4.E(net.ni.s0.class);
      if(!(var5 instanceof p)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new p();
            ((e)var5).m(var4);
         }

         if(!i6.u7.I()) {
            z9.h("Field not found: TileEntitySkullRenderer.dragonHead");
            return null;
         } else {
            i6.t(var5, i6.u7, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
