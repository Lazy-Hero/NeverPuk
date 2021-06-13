package net.yz;

import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public enum ai {
   EXPLOSION_NORMAL,
   EXPLOSION_LARGE,
   EXPLOSION_HUGE,
   FIREWORKS_SPARK,
   WATER_BUBBLE,
   WATER_SPLASH,
   WATER_WAKE,
   SUSPENDED,
   SUSPENDED_DEPTH,
   CRIT,
   CRIT_MAGIC,
   SMOKE_NORMAL,
   SMOKE_LARGE,
   SPELL,
   SPELL_INSTANT,
   SPELL_MOB,
   SPELL_MOB_AMBIENT,
   SPELL_WITCH,
   DRIP_WATER,
   DRIP_LAVA,
   VILLAGER_ANGRY,
   VILLAGER_HAPPY,
   TOWN_AURA,
   NOTE,
   PORTAL,
   ENCHANTMENT_TABLE,
   FLAME,
   LAVA,
   FOOTSTEP,
   CLOUD,
   REDSTONE,
   SNOWBALL,
   SNOW_SHOVEL,
   SLIME,
   HEART,
   BARRIER,
   ITEM_CRACK,
   BLOCK_CRACK,
   BLOCK_DUST,
   WATER_DROP,
   ITEM_TAKE,
   MOB_APPEARANCE,
   DRAGON_BREATH,
   END_ROD,
   DAMAGE_INDICATOR,
   SWEEP_ATTACK,
   FALLING_DUST,
   TOTEM,
   SPIT;

   private final String u;
   private final int Q;
   private final boolean A;
   private final int j;
   private static final Map y;
   private static final Map z;

   private ai(String var3, int var4, boolean var5, int var6) {
      this.u = var3;
      this.Q = var4;
      this.A = var5;
      this.j = var6;
   }

   private ai(String var3, int var4, boolean var5) {
      this(var3, var4, var5, 0);
   }

   public static Set h() {
      return z.keySet();
   }

   public String T() {
      return this.u;
   }

   public int b() {
      return this.Q;
   }

   public int D() {
      return this.j;
   }

   public boolean x() {
      return this.A;
   }

   @Nullable
   public static ai P(int var0) {
      return (ai)y.get(Integer.valueOf(var0));
   }

   @Nullable
   public static ai E(String var0) {
      return (ai)z.get(var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
