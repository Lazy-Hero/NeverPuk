package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.ne.o;
import net.nn.j;
import net.y0.b;
import net.y0.d;
import net.y6.ev;
import net.y6.jb;

public class qk extends iy {
   public qk() {
      super(o.class, "lead_knot", 0.0F);
   }

   public net.y6.z J() {
      return new ev();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ev)) {
         return null;
      } else {
         ev var4 = (ev)var1;
         return var2.equals("knot")?var4.y:null;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var4 = j.b().N();
      iy.A();
      b var5 = new b(var4);
      if(!i6.M5.I()) {
         z9.h("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      } else {
         i6.t(var5, i6.M5, var1);
         var5.W = var2;
         return var5;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
