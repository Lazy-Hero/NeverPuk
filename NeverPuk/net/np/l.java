package net.np;

import net.np.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l implements net.c0.x {
   private static final Logger L = LogManager.getLogger();

   public int X() {
      return 1125;
   }

   public net.nj.f r(net.nj.f var1) {
      g.D();
      boolean var10001 = true;
      net.nj.f var4 = var1.o("Level");
      int var5 = var4.P("xPos");
      int var6 = var4.P("zPos");
      net.nj.h var7 = var4.A("TileEntities", 10);
      net.nj.h var8 = var4.A("Sections", 10);
      int var9 = 0;
      if(var9 < var8.z()) {
         net.nj.f var10 = var8.i(var9);
         byte var11 = var10.R("Y");
         byte[] var12 = var10.q("Blocks");
         int var13 = 0;
         if(var13 < var12.length) {
            if(416 == (var12[var13] & 255) << 4) {
               int var14 = var13 & 15;
               int var15 = var13 >> 8 & 15;
               int var16 = var13 >> 4 & 15;
               net.nj.f var17 = new net.nj.f();
               var17.b("id", "bed");
               var17.r("x", var14 + (var5 << 4));
               var17.r("y", var15 + (var11 << 4));
               var17.r("z", var16 + (var6 << 4));
               var7.m(var17);
            }

            ++var13;
         }

         ++var9;
      }

      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
