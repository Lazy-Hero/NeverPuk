package net;

import net.bx;
import net.iy;
import net.xn;
import net.nk.a;
import net.nn.j;
import net.y0.d;
import net.y6.ee;
import net.y6.jb;

public class rm extends iy {
   public rm() {
      super(a.class, "spider", 1.0F);
   }

   protected rm(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public net.y6.z J() {
      return new ee();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ee)) {
         return null;
      } else {
         ee var4 = (ee)var1;
         return var2.equals("head")?var4.W:(var2.equals("neck")?var4.I:(var2.equals("body")?var4.B:(var2.equals("leg1")?var4.y:(var2.equals("leg2")?var4.k:(var2.equals("leg3")?var4.U:(var2.equals("leg4")?var4.h:(var2.equals("leg5")?var4.d:(var2.equals("leg6")?var4.J:(var2.equals("leg7")?var4.O:(var2.equals("leg8")?var4.m:null))))))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.dc var4 = new net.y0.dc(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
