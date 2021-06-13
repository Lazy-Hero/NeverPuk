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
import net.y6.ec;
import net.y6.jb;

public class qs extends iy {
   public qs() {
      super(net.ni.s0.class, "head_humanoid", 0.0F);
   }

   public net.y6.z J() {
      return new ec();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ec)) {
         return null;
      } else {
         ec var4 = (ec)var1;
         return var2.equals("head")?var4.Y:(var2.equals("head2")?(!i6.Cs.I()?null:(jb)i6.G((Object)var4, (mf)i6.Cs)):null);
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
