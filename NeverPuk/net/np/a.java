package net.np;

import java.util.Random;
import net.np.g;

public class a implements net.c0.x {
   private static final Random p = new Random();

   public int X() {
      return 502;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("Zombie".equals(var1.J("id")) && var1.i("IsVillager")) {
         if(!var1.K("ZombieType", 99)) {
            int var3 = -1;
            if(var1.K("VillagerProfession", 99)) {
               var3 = this.G(var1.P("VillagerProfession"));
            }

            var3 = this.G(p.nextInt(6));
            var1.r("ZombieType", var3);
         }

         var1.A("IsVillager");
      }

      return var1;
   }

   private int G(int var1) {
      return var1 < 6?var1:-1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
