package net.ng;

import net.xn;
import net.c0.l;
import net.c0.q;
import net.c0.w;
import net.ng.i;
import net.nj.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e implements w {
   private static final Logger l = LogManager.getLogger();

   public f X(l var1, f var2, int var3) {
      i.V();
      f var5 = var2.o("tag");
      if(var5.K("EntityTag", 10)) {
         f var6 = var5.o("EntityTag");
         String var7 = var2.J("id");
         if("minecraft:armor_stand".equals(var7)) {
            String var8 = var3 < 515?"ArmorStand":"minecraft:armor_stand";
         }

         if(!"minecraft:spawn_egg".equals(var7)) {
            return var2;
         }

         String var10 = var6.J("id");
         l.warn("Unable to resolve Entity for ItemInstance: {}", var7);
         boolean var9 = false;
         var9 = !var6.K("id", 8);
         var6.b("id", var10);
         var1.w(q.ENTITY, var6, var3);
         var6.A("id");
      }

      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
