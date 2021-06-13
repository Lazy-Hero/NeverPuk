package net;

import java.util.Iterator;
import java.util.List;
import net.mf;
import net.wl;
import net.xn;
import net.z9;
import net.n9.b;

public class ww {
   public static net.n9.v x(List var0, int var1, b var2) {
      net.n9.v var3;
      for(var3 = (net.n9.v)var0.get(var1); l(var0, var1, var3, var2); var3 = (net.n9.v)var0.get(var1)) {
         ;
      }

      var3.N = false;
      return var3;
   }

   private static boolean l(List var0, int var1, net.n9.v var2, b var3) {
      mf.O();
      int var5 = 0;
      Iterator var6 = var2.S().iterator();
      if(var6.hasNext()) {
         net.yz.m_ var7 = (net.yz.m_)var6.next();
         z9.v("Sprite dependency: " + var2.V() + " <- " + var7);
         net.n9.v var8 = var3.w(var7);
         if(var8 == null) {
            var8 = var3.f(var7);
         }

         int var9 = var0.indexOf(var8);
         if(var9 <= var1 + var5) {
            ;
         }

         if(var8.N) {
            String var10 = "circular dependency: " + var2.V() + " -> " + var8.V();
            net.yz.m_ var11 = var3.V(var2);
            wl.C(var11, var10);
         }

         var0.remove(var9);
         var2.N = true;
         var0.add(var1 + var5, var8);
         ++var5;
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
