package net.nb;

import com.google.common.collect.Sets;
import java.util.Set;
import net.yz.m_;

public class w {
   private static final Set W;
   public static final net.n_.b j;
   public static final net.n_.b d;
   public static final net.n_.b y;
   public static final net.n_.b R;
   public static final net.n_.b w;
   public static final net.n_.b N;
   public static final net.n_.b J;
   public static final net.n_.b p;
   public static final net.n_.b a;
   public static final net.n_.b n;
   public static final net.n_.b q;
   public static final net.n_.b x;
   public static final net.n_.b r;
   public static final net.n_.b A;
   public static final net.n_.b H;
   public static final net.n_.b K;
   public static final net.n_.b c;
   public static final net.n_.b E;
   public static final net.n_.b M;
   public static final net.n_.b t;
   public static final net.n_.b L;
   public static final net.n_.b Z;
   public static final net.n_.b f;
   public static final net.n_.b B;
   public static final net.n_.b g;
   public static final net.n_.b D;
   public static final net.n_.b k;
   public static final net.n_.b S;
   public static final net.n_.b Y;
   public static final net.n_.b e;
   public static final net.n_.b h;
   public static final net.n_.b G;
   public static final net.n_.b X;
   public static final net.n_.b O;
   public static final net.n_.b P;
   public static final net.n_.b z;

   private static net.n_.b e(String var0) {
      net.n_.b var1 = (net.n_.b)net.n_.b.b.B(new m_(var0));
      if(!W.add(var1)) {
         throw new IllegalStateException("Invalid Potion requested: " + var0);
      } else {
         return var1;
      }
   }

   static {
      if(!net.nb.z.o()) {
         throw new RuntimeException("Accessed Potions before Bootstrap!");
      } else {
         W = Sets.newHashSet();
         j = e("empty");
         d = e("water");
         y = e("mundane");
         R = e("thick");
         w = e("awkward");
         N = e("night_vision");
         J = e("long_night_vision");
         p = e("invisibility");
         a = e("long_invisibility");
         n = e("leaping");
         q = e("long_leaping");
         x = e("strong_leaping");
         r = e("fire_resistance");
         A = e("long_fire_resistance");
         H = e("swiftness");
         K = e("long_swiftness");
         c = e("strong_swiftness");
         E = e("slowness");
         M = e("long_slowness");
         t = e("water_breathing");
         L = e("long_water_breathing");
         Z = e("healing");
         f = e("strong_healing");
         B = e("harming");
         g = e("strong_harming");
         D = e("poison");
         k = e("long_poison");
         S = e("strong_poison");
         Y = e("regeneration");
         e = e("long_regeneration");
         h = e("strong_regeneration");
         G = e("strength");
         X = e("long_strength");
         O = e("strong_strength");
         P = e("weakness");
         z = e("long_weakness");
         W.clear();
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
