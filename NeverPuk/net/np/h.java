package net.np;

import net.xn;
import net.np.g;

public class h implements net.c0.x {
   public static final String[] b = new String[]{"minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box"};

   public int X() {
      return 813;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("minecraft:shulker_box".equals(var1.J("id")) && var1.K("tag", 10)) {
         net.nj.f var3 = var1.o("tag");
         if(var3.K("BlockEntityTag", 10)) {
            net.nj.f var4 = var3.o("BlockEntityTag");
            if(var4.A("Items", 10).N()) {
               var4.A("Items");
            }

            int var5 = var4.P("Color");
            var4.A("Color");
            if(var4.N()) {
               var3.A("BlockEntityTag");
            }

            if(var3.N()) {
               var1.A("tag");
            }

            var1.b("id", b[var5 % 16]);
         }
      }

      return var1;
   }

   static {
      String[] var10000 = new String[]{"minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box"};
   }

   private static xn a(xn var0) {
      return var0;
   }
}
