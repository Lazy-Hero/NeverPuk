package net.np;

import net.xn;
import net.np.g;
import net.yz.aq;

public class o implements net.c0.x {
   public int X() {
      return 111;
   }

   public net.nj.f r(net.nj.f var1) {
      g.D();
      String var3 = var1.J("id");
      boolean var4 = "Painting".equals(var3);
      boolean var5 = "ItemFrame".equals(var3);
      if((var4 || var5) && !var1.K("Facing", 99)) {
         aq var6;
         label69: {
            if(var1.K("Direction", 99)) {
               var6 = aq.Q(var1.R("Direction"));
               var1.r("TileX", var1.P("TileX") + var6.v());
               var1.r("TileY", var1.P("TileY") + var6.z());
               var1.r("TileZ", var1.P("TileZ") + var6.P());
               var1.A("Direction");
               if(!var1.K("ItemRotation", 99)) {
                  break label69;
               }

               var1.D("ItemRotation", (byte)(var1.R("ItemRotation") * 2));
            }

            var6 = aq.Q(var1.R("Dir"));
            var1.A("Dir");
         }

         var1.D("Facing", (byte)var6.u());
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
