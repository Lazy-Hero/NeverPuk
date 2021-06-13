package net.ns;

import java.util.Iterator;
import net.ns.i;
import net.ns.i9;
import net.yv.o8;

public class ih {
   private static final ih.s V = new ih.s() {
      public int w(i var1, net.u.j var2) {
         return var1.r(var2);
      }
   };
   private static final ih.s y = new ih.s() {
      public int w(i var1, net.u.j var2) {
         return var1.d(var2);
      }
   };
   private static final ih.s q = new ih.s() {
      public int w(i var1, net.u.j var2) {
         return var1.A();
      }
   };

   private static int O(o8 var0, net.u.j var1, ih.s var2) {
      i9.M();
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      Iterator var7 = net.u.j.X(var1.F(-1, 0, -1), var1.F(1, 0, 1)).iterator();
      if(var7.hasNext()) {
         net.u.j var8 = (net.u.j)var7.next();
         int var9 = var2.w(var0.P(var8), var8);
         var4 += (var9 & 16711680) >> 16;
         var5 += (var9 & '\uff00') >> 8;
         var6 += var9 & 255;
      }

      return (var4 / 9 & 255) << 16 | (var5 / 9 & 255) << 8 | var6 / 9 & 255;
   }

   public static int q(o8 var0, net.u.j var1) {
      return O(var0, var1, V);
   }

   public static int y(o8 var0, net.u.j var1) {
      return O(var0, var1, y);
   }

   public static int p(o8 var0, net.u.j var1) {
      return O(var0, var1, q);
   }

   interface s {
      int w(i var1, net.u.j var2);
   }
}
