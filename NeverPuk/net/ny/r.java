package net.ny;

import net.nb.x;
import net.nj.h;
import net.ns.i9;
import net.ny.f;
import net.ny.y;

public class r {
   public static r.u E(net.nj.f var0) {
      int var1 = var0.P("xPos");
      int var2 = var0.P("zPos");
      r.u var3 = new r.u(var1, var2);
      var3.X = var0.q("Blocks");
      var3.a = new y(var0.q("Data"), 7);
      var3.t = new y(var0.q("SkyLight"), 7);
      var3.O = new y(var0.q("BlockLight"), 7);
      var3.Z = var0.q("HeightMap");
      var3.T = var0.i("TerrainPopulated");
      var3.I = var0.A("Entities", 10);
      var3.F = var0.A("TileEntities", 10);
      var3.n = var0.A("TileTicks", 10);
      var3.P = var0.P("LastUpdate");
      return var3;
   }

   public static void y(r.u var0, net.nj.f var1, i9 var2) {
      var1.r("xPos", var0.r);
      var1.r("zPos", var0.c);
      f.h();
      var1.V("LastUpdate", var0.P);
      int[] var4 = new int[var0.Z.length];
      int var5 = 0;
      if(var5 < var0.Z.length) {
         var4[var5] = var0.Z[var5];
         ++var5;
      }

      var1.H("HeightMap", var4);
      var1.c("TerrainPopulated", var0.T);
      h var18 = new h();
      int var6 = 0;
      boolean var7 = true;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = var8 << 11 | var10 << 7 | var9 + (var6 << 4);
      byte var12 = var0.X[var11];
      if(var12 != 0) {
         var7 = false;
      }

      ++var10;
      ++var9;
      ++var8;
      ++var6;
      var1.K("Sections", var18);
      byte[] var20 = new byte[256];
      net.u.j var22 = new net.u.j();
      var8 = 0;
      var9 = 0;
      var22.V(var0.r << 4 | var8, 0, var0.c << 4 | var9);
      var20[var9 << 4 | var8] = (byte)(net.ns.i.y(var2.L(var22, x.Q)) & 255);
      ++var9;
      ++var8;
      var1.S("Biomes", var20);
      var1.K("Entities", var0.I);
      var1.K("TileEntities", var0.F);
      if(var0.n != null) {
         var1.K("TileTicks", var0.n);
      }

      if(net.u.d.y() == null) {
         f.F(new String[2]);
      }

   }

   private static ClassCastException a(ClassCastException var0) {
      return var0;
   }

   public static class u {
      public long P;
      public boolean T;
      public byte[] Z;
      public y O;
      public y t;
      public y a;
      public byte[] X;
      public h I;
      public h F;
      public h n;
      public final int r;
      public final int c;

      public u(int var1, int var2) {
         this.r = var1;
         this.c = var2;
      }
   }
}
