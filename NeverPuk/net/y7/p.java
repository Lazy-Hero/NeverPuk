package net.y7;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import net.y7.t;
import net.yz.m_;

public class p {
   private static final Set Y = Sets.newHashSet();
   private static final Set U = Collections.unmodifiableSet(Y);
   public static final m_ W = Z("empty");
   public static final m_ o = Z("chests/spawn_bonus_chest");
   public static final m_ e = Z("chests/end_city_treasure");
   public static final m_ p = Z("chests/simple_dungeon");
   public static final m_ pj = Z("chests/village_blacksmith");
   public static final m_ pv = Z("chests/abandoned_mineshaft");
   public static final m_ Q = Z("chests/nether_bridge");
   public static final m_ pA = Z("chests/stronghold_library");
   public static final m_ t = Z("chests/stronghold_crossing");
   public static final m_ s = Z("chests/stronghold_corridor");
   public static final m_ y = Z("chests/desert_pyramid");
   public static final m_ v = Z("chests/jungle_temple");
   public static final m_ P = Z("chests/jungle_temple_dispenser");
   public static final m_ H = Z("chests/igloo_chest");
   public static final m_ pm = Z("chests/woodland_mansion");
   public static final m_ l = Z("entities/witch");
   public static final m_ h = Z("entities/blaze");
   public static final m_ pn = Z("entities/creeper");
   public static final m_ c = Z("entities/spider");
   public static final m_ p0 = Z("entities/cave_spider");
   public static final m_ i = Z("entities/giant");
   public static final m_ S = Z("entities/silverfish");
   public static final m_ u = Z("entities/enderman");
   public static final m_ pW = Z("entities/guardian");
   public static final m_ T = Z("entities/elder_guardian");
   public static final m_ D = Z("entities/shulker");
   public static final m_ N = Z("entities/iron_golem");
   public static final m_ po = Z("entities/snowman");
   public static final m_ K = Z("entities/rabbit");
   public static final m_ R = Z("entities/chicken");
   public static final m_ J = Z("entities/pig");
   public static final m_ pM = Z("entities/polar_bear");
   public static final m_ a = Z("entities/horse");
   public static final m_ k = Z("entities/donkey");
   public static final m_ pl = Z("entities/mule");
   public static final m_ d = Z("entities/zombie_horse");
   public static final m_ C = Z("entities/skeleton_horse");
   public static final m_ ph = Z("entities/cow");
   public static final m_ q = Z("entities/mushroom_cow");
   public static final m_ pw = Z("entities/wolf");
   public static final m_ pa = Z("entities/ocelot");
   public static final m_ pH = Z("entities/sheep");
   public static final m_ A = Z("entities/sheep/white");
   public static final m_ I = Z("entities/sheep/orange");
   public static final m_ px = Z("entities/sheep/magenta");
   public static final m_ O = Z("entities/sheep/light_blue");
   public static final m_ r = Z("entities/sheep/yellow");
   public static final m_ p6 = Z("entities/sheep/lime");
   public static final m_ pg = Z("entities/sheep/pink");
   public static final m_ pZ = Z("entities/sheep/gray");
   public static final m_ G = Z("entities/sheep/silver");
   public static final m_ j = Z("entities/sheep/cyan");
   public static final m_ B = Z("entities/sheep/purple");
   public static final m_ p2 = Z("entities/sheep/blue");
   public static final m_ f = Z("entities/sheep/brown");
   public static final m_ p_ = Z("entities/sheep/green");
   public static final m_ pp = Z("entities/sheep/red");
   public static final m_ z = Z("entities/sheep/black");
   public static final m_ V = Z("entities/bat");
   public static final m_ Z = Z("entities/slime");
   public static final m_ pk = Z("entities/magma_cube");
   public static final m_ x = Z("entities/ghast");
   public static final m_ pJ = Z("entities/squid");
   public static final m_ X = Z("entities/endermite");
   public static final m_ pP = Z("entities/zombie");
   public static final m_ L = Z("entities/zombie_pigman");
   public static final m_ pF = Z("entities/skeleton");
   public static final m_ g = Z("entities/wither_skeleton");
   public static final m_ pB = Z("entities/stray");
   public static final m_ pe = Z("entities/husk");
   public static final m_ b = Z("entities/zombie_villager");
   public static final m_ F = Z("entities/villager");
   public static final m_ M = Z("entities/evocation_illager");
   public static final m_ E = Z("entities/vindication_illager");
   public static final m_ pL = Z("entities/llama");
   public static final m_ n = Z("entities/parrot");
   public static final m_ pG = Z("entities/vex");
   public static final m_ pC = Z("entities/ender_dragon");
   public static final m_ w = Z("gameplay/fishing");
   public static final m_ m = Z("gameplay/fishing/junk");
   public static final m_ pD = Z("gameplay/fishing/treasure");
   public static final m_ pN = Z("gameplay/fishing/fish");
   private static int[] pr;

   private static m_ Z(String var0) {
      return g(new m_("minecraft", var0));
   }

   public static m_ g(m_ var0) {
      if(Y.add(var0)) {
         return var0;
      } else {
         throw new IllegalArgumentException(var0 + " is already a registered built-in loot table");
      }
   }

   public static Set g() {
      return U;
   }

   public static boolean c() {
      h();
      t var1 = new t((File)null);
      Iterator var2 = U.iterator();
      if(var2.hasNext()) {
         m_ var3 = (m_)var2.next();
         if(var1.k(var3) == net.y7.z.G) {
            return false;
         }
      }

      return true;
   }

   static {
      d(new int[3]);
   }

   public static void d(int[] var0) {
      pr = var0;
   }

   public static int[] h() {
      return pr;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
