package net.z;

import net.z.g;
import net.z.tu;

public class wx implements net.z.z {
   private final net.nn.j Z = net.nn.j.b();

   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
      g.C();
      int var11 = var3 + var5 / 2 - this.Z.sO.R / 2;
      this.Z.sO.v(net.c9.b.x("lanServer.scanning", new Object[0]), (float)(tu.q / 2 - this.Z.sO.r(net.c9.b.x("lanServer.scanning", new Object[0])) / 2), (float)var11, 16777215);
      switch((int)(net.nn.j.E() / 300L % 4L)) {
      case 0:
      default:
         String var12 = "O o o";
      case 1:
      case 3:
         String var13 = "o O o";
      case 2:
         String var14 = "o o O";
         this.Z.sO.v(var14, (float)(tu.q / 2 - this.Z.sO.r(var14) / 2), (float)(var11 + this.Z.sO.R), 8421504);
      }
   }

   public void h(int var1, int var2, int var3, float var4) {
   }

   public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
      return false;
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }
}
