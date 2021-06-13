package net;

import net.bx;
import net.iy;
import net.xn;
import net.nk.m;
import net.nn.j;
import net.y0.d;
import net.y0.dx;
import net.y6.jb;
import net.y6.l;

public class qu extends iy {
   public qu() {
      super(m.class, "creeper", 0.5F);
   }

   public net.y6.z J() {
      return new l();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof l)) {
         return null;
      } else {
         l var4 = (l)var1;
         return var2.equals("head")?var4.L:(var2.equals("armor")?var4.S:(var2.equals("body")?var4.J:(var2.equals("leg1")?var4.R:(var2.equals("leg2")?var4.M:(var2.equals("leg3")?var4.m:(var2.equals("leg4")?var4.E:null))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      dx var4 = new dx(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
