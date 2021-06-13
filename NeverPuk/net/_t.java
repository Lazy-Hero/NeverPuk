package net;

import java.util.HashMap;
import java.util.Map;
import net.dc;
import net.mf;
import net.of;
import net.ua;
import net.ws;
import net.xn;
import net.nn.j;
import net.y6.t;
import net.yy.f;
import net.yy.g;

public class _t {
   private static Map M = null;
   private static final boolean U = Boolean.getBoolean("player.models.reload");
   private static long i = System.currentTimeMillis();

   public static void e(t var0, f var1, float var2, float var3) {
      dc var4 = y(var1);
      var4.y(var0, var1, var2, var3);
   }

   public static synchronized dc y(f var0) {
      String var1 = mf.O();
      if(U && System.currentTimeMillis() > i + 5000L) {
         g var2 = j.b().sf;
         if(var2 != null) {
            v(var2.F(), (dc)null);
            i = System.currentTimeMillis();
         }
      }

      String var7 = var0.F();
      if(var7 == null) {
         return null;
      } else {
         dc var3 = (dc)F().get(var7);
         if(var3 == null) {
            var3 = new dc();
            F().put(var7, var3);
            ua var4 = new ua(var7);
            String var5 = of.h() + "/users/" + var7 + ".cfg";
            ws var6 = new ws(var5, var4);
            var6.start();
         }

         return var3;
      }
   }

   public static synchronized void v(String var0, dc var1) {
      F().put(var0, var1);
   }

   private static Map F() {
      if(M == null) {
         M = new HashMap();
      }

      return M;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
