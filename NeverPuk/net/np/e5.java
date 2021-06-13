package net.np;

import net.xn;
import net.np.g;

public class e5 implements net.c0.x {
   private static final String[] T = new String[128];

   public int X() {
      return 102;
   }

   public net.nj.f r(net.nj.f var1) {
      String var2 = g.D();
      if("minecraft:potion".equals(var1.J("id"))) {
         net.nj.f var3 = var1.o("tag");
         short var4 = var1.E("Damage");
         if(!var3.K("Potion", 8)) {
            String var5 = T[var4 & 127];
            var3.b("Potion", var5 == null?"minecraft:water":var5);
            var1.K("tag", var3);
            if((var4 & 16384) == 16384) {
               var1.b("id", "minecraft:splash_potion");
            }
         }

         if(var4 != 0) {
            var1.h("Damage", (short)0);
         }
      }

      return var1;
   }

   static {
      T[0] = "minecraft:water";
      T[1] = "minecraft:regeneration";
      T[2] = "minecraft:swiftness";
      T[3] = "minecraft:fire_resistance";
      T[4] = "minecraft:poison";
      T[5] = "minecraft:healing";
      T[6] = "minecraft:night_vision";
      T[7] = null;
      T[8] = "minecraft:weakness";
      T[9] = "minecraft:strength";
      T[10] = "minecraft:slowness";
      T[11] = "minecraft:leaping";
      T[12] = "minecraft:harming";
      T[13] = "minecraft:water_breathing";
      T[14] = "minecraft:invisibility";
      T[15] = null;
      T[16] = "minecraft:awkward";
      T[17] = "minecraft:regeneration";
      T[18] = "minecraft:swiftness";
      T[19] = "minecraft:fire_resistance";
      T[20] = "minecraft:poison";
      T[21] = "minecraft:healing";
      T[22] = "minecraft:night_vision";
      T[23] = null;
      T[24] = "minecraft:weakness";
      T[25] = "minecraft:strength";
      T[26] = "minecraft:slowness";
      T[27] = "minecraft:leaping";
      T[28] = "minecraft:harming";
      T[29] = "minecraft:water_breathing";
      T[30] = "minecraft:invisibility";
      T[31] = null;
      T[32] = "minecraft:thick";
      T[33] = "minecraft:strong_regeneration";
      T[34] = "minecraft:strong_swiftness";
      T[35] = "minecraft:fire_resistance";
      T[36] = "minecraft:strong_poison";
      T[37] = "minecraft:strong_healing";
      T[38] = "minecraft:night_vision";
      T[39] = null;
      T[40] = "minecraft:weakness";
      T[41] = "minecraft:strong_strength";
      T[42] = "minecraft:slowness";
      T[43] = "minecraft:strong_leaping";
      T[44] = "minecraft:strong_harming";
      T[45] = "minecraft:water_breathing";
      T[46] = "minecraft:invisibility";
      T[47] = null;
      T[48] = null;
      T[49] = "minecraft:strong_regeneration";
      T[50] = "minecraft:strong_swiftness";
      T[51] = "minecraft:fire_resistance";
      T[52] = "minecraft:strong_poison";
      T[53] = "minecraft:strong_healing";
      T[54] = "minecraft:night_vision";
      T[55] = null;
      T[56] = "minecraft:weakness";
      T[57] = "minecraft:strong_strength";
      T[58] = "minecraft:slowness";
      T[59] = "minecraft:strong_leaping";
      T[60] = "minecraft:strong_harming";
      T[61] = "minecraft:water_breathing";
      T[62] = "minecraft:invisibility";
      T[63] = null;
      T[64] = "minecraft:mundane";
      T[65] = "minecraft:long_regeneration";
      T[66] = "minecraft:long_swiftness";
      T[67] = "minecraft:long_fire_resistance";
      T[68] = "minecraft:long_poison";
      T[69] = "minecraft:healing";
      T[70] = "minecraft:long_night_vision";
      T[71] = null;
      T[72] = "minecraft:long_weakness";
      T[73] = "minecraft:long_strength";
      T[74] = "minecraft:long_slowness";
      T[75] = "minecraft:long_leaping";
      T[76] = "minecraft:harming";
      T[77] = "minecraft:long_water_breathing";
      T[78] = "minecraft:long_invisibility";
      T[79] = null;
      T[80] = "minecraft:awkward";
      T[81] = "minecraft:long_regeneration";
      T[82] = "minecraft:long_swiftness";
      T[83] = "minecraft:long_fire_resistance";
      T[84] = "minecraft:long_poison";
      T[85] = "minecraft:healing";
      T[86] = "minecraft:long_night_vision";
      T[87] = null;
      T[88] = "minecraft:long_weakness";
      T[89] = "minecraft:long_strength";
      T[90] = "minecraft:long_slowness";
      T[91] = "minecraft:long_leaping";
      T[92] = "minecraft:harming";
      T[93] = "minecraft:long_water_breathing";
      T[94] = "minecraft:long_invisibility";
      T[95] = null;
      T[96] = "minecraft:thick";
      T[97] = "minecraft:regeneration";
      T[98] = "minecraft:swiftness";
      T[99] = "minecraft:long_fire_resistance";
      T[100] = "minecraft:poison";
      T[101] = "minecraft:strong_healing";
      T[102] = "minecraft:long_night_vision";
      T[103] = null;
      T[104] = "minecraft:long_weakness";
      T[105] = "minecraft:strength";
      T[106] = "minecraft:long_slowness";
      T[107] = "minecraft:leaping";
      T[108] = "minecraft:strong_harming";
      T[109] = "minecraft:long_water_breathing";
      T[110] = "minecraft:long_invisibility";
      T[111] = null;
      T[112] = null;
      T[113] = "minecraft:regeneration";
      T[114] = "minecraft:swiftness";
      T[115] = "minecraft:long_fire_resistance";
      T[116] = "minecraft:poison";
      T[117] = "minecraft:strong_healing";
      T[118] = "minecraft:long_night_vision";
      T[119] = null;
      T[120] = "minecraft:long_weakness";
      T[121] = "minecraft:strength";
      T[122] = "minecraft:long_slowness";
      T[123] = "minecraft:leaping";
      T[124] = "minecraft:strong_harming";
      T[125] = "minecraft:long_water_breathing";
      T[126] = "minecraft:long_invisibility";
      T[127] = null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
