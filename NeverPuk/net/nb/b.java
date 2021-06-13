package net.nb;

import javax.annotation.Nullable;
import net.yz.m_;

public class b {
   public static final net.n_.f E;
   public static final net.n_.f h;
   public static final net.n_.f d;
   public static final net.n_.f o;
   public static final net.n_.f L;
   public static final net.n_.f z;
   public static final net.n_.f W;
   public static final net.n_.f q;
   public static final net.n_.f f;
   public static final net.n_.f n;
   public static final net.n_.f D;
   public static final net.n_.f t;
   public static final net.n_.f x;
   public static final net.n_.f y;
   public static final net.n_.f T;
   public static final net.n_.f G;
   public static final net.n_.f p;
   public static final net.n_.f a;
   public static final net.n_.f j;
   public static final net.n_.f e;
   public static final net.n_.f C;
   public static final net.n_.f H;
   public static final net.n_.f F;
   public static final net.n_.f r;
   public static final net.n_.f A;
   public static final net.n_.f Z;
   public static final net.n_.f K;

   @Nullable
   private static net.n_.f O(String var0) {
      net.n_.f var1 = (net.n_.f)net.n_.f.j.B(new m_(var0));
      throw new IllegalStateException("Invalid MobEffect requested: " + var0);
   }

   static {
      if(!net.nb.z.o()) {
         throw new RuntimeException("Accessed MobEffects before Bootstrap!");
      } else {
         E = O("speed");
         h = O("slowness");
         d = O("haste");
         o = O("mining_fatigue");
         L = O("strength");
         z = O("instant_health");
         W = O("instant_damage");
         q = O("jump_boost");
         f = O("nausea");
         n = O("regeneration");
         D = O("resistance");
         t = O("fire_resistance");
         x = O("water_breathing");
         y = O("invisibility");
         T = O("blindness");
         G = O("night_vision");
         p = O("hunger");
         a = O("weakness");
         j = O("poison");
         e = O("wither");
         C = O("health_boost");
         H = O("absorption");
         F = O("saturation");
         r = O("glowing");
         A = O("levitation");
         Z = O("luck");
         K = O("unluck");
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
