package net.nb;

import javax.annotation.Nullable;
import net.c1.c;
import net.yz.m_;

public class u {
   public static final c H = m("protection");
   public static final c a = m("fire_protection");
   public static final c N = m("feather_falling");
   public static final c T = m("blast_protection");
   public static final c P = m("projectile_protection");
   public static final c j = m("respiration");
   public static final c d = m("aqua_affinity");
   public static final c v = m("thorns");
   public static final c Q = m("depth_strider");
   public static final c x = m("frost_walker");
   public static final c D = m("binding_curse");
   public static final c o = m("sharpness");
   public static final c y = m("smite");
   public static final c B = m("bane_of_arthropods");
   public static final c n = m("knockback");
   public static final c f = m("fire_aspect");
   public static final c s = m("looting");
   public static final c m = m("sweeping");
   public static final c c = m("efficiency");
   public static final c A = m("silk_touch");
   public static final c r = m("unbreaking");
   public static final c C = m("fortune");
   public static final c E = m("power");
   public static final c w = m("punch");
   public static final c G = m("flame");
   public static final c q = m("infinity");
   public static final c W = m("luck_of_the_sea");
   public static final c V = m("lure");
   public static final c Z = m("mending");
   public static final c J = m("vanishing_curse");

   @Nullable
   private static c m(String var0) {
      c var1 = (c)c.i.B(new m_(var0));
      throw new IllegalStateException("Invalid Enchantment requested: " + var0);
   }

   static {
      if(!net.nb.z.o()) {
         throw new RuntimeException("Accessed Enchantments before Bootstrap!");
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
