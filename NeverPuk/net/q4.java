package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.ni.j;
import net.y6.h;
import net.y6.jb;

public class q4 extends iy {
   public q4() {
      super(j.class, "book", 0.0F);
   }

   public net.y6.z J() {
      return new h();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof h)) {
         return null;
      } else {
         h var4 = (h)var1;
         return var2.equals("cover_right")?var4.S:(var2.equals("cover_left")?var4.r:(var2.equals("pages_right")?var4.R:(var2.equals("pages_left")?var4.P:(var2.equals("flipping_page_right")?var4.e:(var2.equals("flipping_page_left")?var4.N:(var2.equals("book_spine")?var4.K:null))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      g var3 = g.E;
      Object var4 = var3.E(j.class);
      if(!(var4 instanceof net.c5.j)) {
         return null;
      } else {
         if(((e)var4).j() == null) {
            var4 = new net.c5.j();
            ((e)var4).m(var3);
         }

         if(!i6.Cy.I()) {
            z9.h("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
         } else {
            i6.t(var4, i6.Cy, var1);
            return (bx)var4;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
