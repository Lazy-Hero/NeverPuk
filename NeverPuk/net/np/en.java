package net.np;

import com.google.gson.JsonParseException;
import net.np.g;
import net.yz.a7;

public class en implements net.c0.x {
   public int X() {
      return 165;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("minecraft:written_book".equals(var1.J("id"))) {
         net.nj.f var3 = var1.o("tag");
         if(var3.K("pages", 9)) {
            net.nj.h var4 = var3.A("pages", 8);
            int var5 = 0;
            if(var5 < var4.z()) {
               String var6 = var4.w(var5);
               net.cb.t var7 = null;
               if(!"null".equals(var6) && !a7.Y(var6)) {
                  if(var6.charAt(0) == 34 && var6.charAt(var6.length() - 1) == 34 || var6.charAt(0) == 123 && var6.charAt(var6.length() - 1) == 125) {
                     var7 = (net.cb.t)net.yz.c.L(g.A, var6, net.cb.t.class, true);
                     var7 = new net.cb.l("");
                     if(var7 == null) {
                        var7 = net.cb.t.m(var6);
                     }

                     if(var7 == null) {
                        var7 = net.cb.t.h(var6);
                     }

                     if(var7 == null) {
                        var7 = new net.cb.l(var6);
                     }
                  } else {
                     var7 = new net.cb.l(var6);
                  }
               } else {
                  var7 = new net.cb.l("");
               }

               var4.S(var5, new net.nj.y(net.cb.t.m((net.cb.t)var7)));
               ++var5;
            }

            var3.K("pages", var4);
         }
      }

      return var1;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
