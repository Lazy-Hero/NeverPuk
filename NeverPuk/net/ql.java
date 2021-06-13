package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.nm.w;
import net.nn.j;
import net.y0.cu;
import net.y0.d;
import net.y6.e1;
import net.y6.jb;

public class ql extends iy {
   public ql() {
      super(w.class, "minecart", 0.5F);
   }

   protected ql(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public net.y6.z J() {
      return new e1();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e1)) {
         return null;
      } else {
         e1 var4 = (e1)var1;
         return var2.equals("bottom")?var4.p[0]:(var2.equals("back")?var4.p[1]:(var2.equals("front")?var4.p[2]:(var2.equals("right")?var4.p[3]:(var2.equals("left")?var4.p[4]:(var2.equals("dirt")?var4.p[5]:null)))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      cu var4 = new cu(var3);
      if(!i6.C4.I()) {
         z9.h("Field not found: RenderMinecart.modelMinecart");
         return null;
      } else {
         i6.t(var4, i6.C4, var1);
         var4.W = var2;
         return var4;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
