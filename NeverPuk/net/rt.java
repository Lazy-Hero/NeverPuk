package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nn.j;
import net.y0.ca;
import net.y0.d;
import net.y6.er;
import net.y6.jb;
import net.yn.x;

public class rt extends iy {
   public rt() {
      super(x.class, "wolf", 0.5F);
   }

   public net.y6.z J() {
      return new er();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof er)) {
         return null;
      } else {
         er var4 = (er)var1;
         return var2.equals("head")?var4.I:(var2.equals("body")?var4.E:(var2.equals("leg1")?var4.u:(var2.equals("leg2")?var4.D:(var2.equals("leg3")?var4.a:(var2.equals("leg4")?var4.b:(var2.equals("tail")?(jb)i6.G((Object)var4, (mf)i6.Mc):(var2.equals("mane")?(jb)i6.G((Object)var4, (mf)i6.BY):null)))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      ca var4 = new ca(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
