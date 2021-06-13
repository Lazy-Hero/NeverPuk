package net.np;

import com.google.common.collect.Maps;
import java.util.Map;
import net.xn;

public class y implements net.c0.x {
   private static final Map z = Maps.newHashMap();

   public int X() {
      return 704;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = (String)z.get(var1.J("id"));
      var1.b("id", var2);
      return var1;
   }

   static {
      z.put("Airportal", "minecraft:end_portal");
      z.put("Banner", "minecraft:banner");
      z.put("Beacon", "minecraft:beacon");
      z.put("Cauldron", "minecraft:brewing_stand");
      z.put("Chest", "minecraft:chest");
      z.put("Comparator", "minecraft:comparator");
      z.put("Control", "minecraft:command_block");
      z.put("DLDetector", "minecraft:daylight_detector");
      z.put("Dropper", "minecraft:dropper");
      z.put("EnchantTable", "minecraft:enchanting_table");
      z.put("EndGateway", "minecraft:end_gateway");
      z.put("EnderChest", "minecraft:ender_chest");
      z.put("FlowerPot", "minecraft:flower_pot");
      z.put("Furnace", "minecraft:furnace");
      z.put("Hopper", "minecraft:hopper");
      z.put("MobSpawner", "minecraft:mob_spawner");
      z.put("Music", "minecraft:noteblock");
      z.put("Piston", "minecraft:piston");
      z.put("RecordPlayer", "minecraft:jukebox");
      z.put("Sign", "minecraft:sign");
      z.put("Skull", "minecraft:skull");
      z.put("Structure", "minecraft:structure_block");
      z.put("Trap", "minecraft:dispenser");
   }

   private static xn a(xn var0) {
      return var0;
   }
}
