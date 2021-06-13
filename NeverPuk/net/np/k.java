package net.np;

import com.google.common.collect.Sets;
import java.util.Set;
import net.xn;
import net.np.g;

public class k implements net.c0.x {
   private static final Set l = Sets.newHashSet(new String[]{"ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie"});

   public int X() {
      return 109;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if(l.contains(var1.J("id"))) {
         if(var1.K("HealF", 99)) {
            float var3 = var1.S("HealF");
            var1.A("HealF");
         }

         if(!var1.K("Health", 99)) {
            return var1;
         }

         float var4 = var1.S("Health");
         var1.d("Health", var4);
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
