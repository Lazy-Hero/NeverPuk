package net;

import java.util.Iterator;
import java.util.List;
import net.bx;
import net.iy;
import net.qd;
import net.xn;
import net.z9;
import net.nn.j;
import net.y0.c;
import net.y0.d;
import net.y0.dd;
import net.y6.e5;
import net.y6.en;
import net.ye.f;
import net.yn.b;

public class r2 extends qd {
   public r2() {
      super(b.class, "sheep_wool", 0.7F);
   }

   public net.y6.z J() {
      return new e5();
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      d var4 = j.b().N();
      Object var5 = (c)var4.k().get(b.class);
      if(!(var5 instanceof dd)) {
         z9.h("Not a RenderSheep: " + var5);
         return null;
      } else {
         if(((c)var5).j() == null) {
            dd var6 = new dd(var4);
            var6.y = new en();
            var6.W = 0.7F;
            var5 = var6;
         }

         dd var10 = (dd)var5;
         List var7 = var10.i();
         Iterator var8 = var7.iterator();
         if(var8.hasNext()) {
            net.ye.wr var9 = (net.ye.wr)var8.next();
            if(var9 instanceof f) {
               var8.remove();
            }
         }

         f var11 = new f(var10);
         var11.O = (e5)var1;
         var10.k(var11);
         return var10;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
