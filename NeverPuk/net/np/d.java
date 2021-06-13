package net.np;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.np.g;

public class d implements net.c0.x {
   private static final List l = Lists.newArrayList(new String[]{"MinecartRideable", "MinecartChest", "MinecartFurnace", "MinecartTNT", "MinecartSpawner", "MinecartHopper", "MinecartCommandBlock"});

   public int X() {
      return 106;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("Minecart".equals(var1.J("id"))) {
         String var3 = "MinecartRideable";
         int var4 = var1.P("Type");
         if(var4 < l.size()) {
            var3 = (String)l.get(var4);
         }

         var1.b("id", var3);
         var1.A("Type");
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
