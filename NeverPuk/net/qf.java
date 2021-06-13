package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.nm.j;
import net.y0.c;
import net.y0.d;
import net.y6.jb;
import net.y6.k;

public class qf extends iy {
   public qf() {
      this("end_crystal");
   }

   protected qf(String var1) {
      super(j.class, var1, 0.5F);
   }

   public net.y6.z J() {
      return new k(0.0F, true);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof k)) {
         return null;
      } else {
         k var4 = (k)var1;
         return var2.equals("cube")?(jb)i6.g(var4, i6.CW, 0):(var2.equals("glass")?(jb)i6.g(var4, i6.CW, 1):(var2.equals("base")?(jb)i6.g(var4, i6.CW, 2):null));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var4 = net.nn.j.b().N();
      iy.A();
      c var5 = (c)var4.k().get(j.class);
      if(!(var5 instanceof net.y0.k)) {
         z9.h("Not an instance of RenderEnderCrystal: " + var5);
         return null;
      } else {
         net.y0.k var6 = (net.y0.k)var5;
         if(!i6.p.I()) {
            z9.h("Field not found: RenderEnderCrystal.modelEnderCrystal");
            return null;
         } else {
            i6.t(var6, i6.p, var1);
            var6.W = var2;
            return var6;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
