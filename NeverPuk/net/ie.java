package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.t;
import net.ni.g;
import net.y6.jb;
import net.y6.r;

public class ie extends iy {
   public ie() {
      super(g.class, "banner", 0.0F);
   }

   public net.y6.z J() {
      return new r();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof r)) {
         return null;
      } else {
         r var4 = (r)var1;
         return var2.equals("slate")?var4.l:(var2.equals("stand")?var4.a:(var2.equals("top")?var4.U:null));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      net.c5.g var4 = net.c5.g.E;
      Object var5 = var4.E(g.class);
      if(!(var5 instanceof t)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new t();
            ((e)var5).m(var4);
         }

         if(!i6.uA.I()) {
            z9.h("Field not found: TileEntityBannerRenderer.bannerModel");
            return null;
         } else {
            i6.t(var5, i6.uA, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
