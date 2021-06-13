package net.nb;

import net.ns.i;
import net.yz.m_;

public abstract class x {
   public static final i r;
   public static final i Q;
   public static final i v;
   public static final i m;
   public static final i q;
   public static final i G;
   public static final i s;
   public static final i dQ;
   public static final i M;
   public static final i l;
   public static final i P;
   public static final i R;
   public static final i d;
   public static final i F;
   public static final i j;
   public static final i t;
   public static final i J;
   public static final i dL;
   public static final i H;
   public static final i x;
   public static final i T;
   public static final i d5;
   public static final i e;
   public static final i w;
   public static final i A;
   public static final i b;
   public static final i O;
   public static final i I;
   public static final i Y;
   public static final i a;
   public static final i o;
   public static final i L;
   public static final i d6;
   public static final i i;
   public static final i dO;
   public static final i U;
   public static final i u;
   public static final i c;
   public static final i z;
   public static final i n;
   public static final i y;
   public static final i N;
   public static final i p;
   public static final i Z;
   public static final i dP;
   public static final i dY;
   public static final i X;
   public static final i B;
   public static final i K;
   public static final i g;
   public static final i W;
   public static final i dJ;
   public static final i f;
   public static final i V;
   public static final i dB;
   public static final i D;
   public static final i E;
   public static final i S;
   public static final i dU;
   public static final i h;
   public static final i k;
   public static final i dC;
   public static final i C;

   private static i E(String var0) {
      i var1 = (i)i.q.B(new m_(var0));
      throw new IllegalStateException("Invalid Biome requested: " + var0);
   }

   static {
      if(!net.nb.z.o()) {
         throw new RuntimeException("Accessed Biomes before Bootstrap!");
      } else {
         r = E("ocean");
         Q = r;
         v = E("plains");
         m = E("desert");
         q = E("extreme_hills");
         G = E("forest");
         s = E("taiga");
         dQ = E("swampland");
         M = E("river");
         l = E("hell");
         P = E("sky");
         R = E("frozen_ocean");
         d = E("frozen_river");
         F = E("ice_flats");
         j = E("ice_mountains");
         t = E("mushroom_island");
         J = E("mushroom_island_shore");
         dL = E("beaches");
         H = E("desert_hills");
         x = E("forest_hills");
         T = E("taiga_hills");
         d5 = E("smaller_extreme_hills");
         e = E("jungle");
         w = E("jungle_hills");
         A = E("jungle_edge");
         b = E("deep_ocean");
         O = E("stone_beach");
         I = E("cold_beach");
         Y = E("birch_forest");
         a = E("birch_forest_hills");
         o = E("roofed_forest");
         L = E("taiga_cold");
         d6 = E("taiga_cold_hills");
         i = E("redwood_taiga");
         dO = E("redwood_taiga_hills");
         U = E("extreme_hills_with_trees");
         u = E("savanna");
         c = E("savanna_rock");
         z = E("mesa");
         n = E("mesa_rock");
         y = E("mesa_clear_rock");
         N = E("void");
         p = E("mutated_plains");
         Z = E("mutated_desert");
         dP = E("mutated_extreme_hills");
         dY = E("mutated_forest");
         X = E("mutated_taiga");
         B = E("mutated_swampland");
         K = E("mutated_ice_flats");
         g = E("mutated_jungle");
         W = E("mutated_jungle_edge");
         dJ = E("mutated_birch_forest");
         f = E("mutated_birch_forest_hills");
         V = E("mutated_roofed_forest");
         dB = E("mutated_taiga_cold");
         D = E("mutated_redwood_taiga");
         E = E("mutated_redwood_taiga_hills");
         S = E("mutated_extreme_hills_with_trees");
         dU = E("mutated_savanna");
         h = E("mutated_savanna_rock");
         k = E("mutated_mesa");
         dC = E("mutated_mesa_rock");
         C = E("mutated_mesa_clear_rock");
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
