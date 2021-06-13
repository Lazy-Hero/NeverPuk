package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class x extends i {
   public x(long var1, i var3) {
      super(var1);
      super.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      var1 = var1 - 2;
      var2 = var2 - 2;
      int var6 = var1 >> 2;
      i.D();
      int var7 = var2 >> 2;
      int var8 = (var3 >> 2) + 2;
      int var9 = (var4 >> 2) + 2;
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int var11 = var8 - 1 << 2;
      int var12 = var9 - 1 << 2;
      int[] var13 = r.J(var11 * var12);
      int var14 = 0;
      if(var14 < var9 - 1) {
         int var15 = 0;
         int var16 = var10[var15 + 0 + (var14 + 0) * var8];
         int var17 = var10[var15 + 0 + (var14 + 1) * var8];
         if(var15 < var8 - 1) {
            double var10000 = 3.6D;
            this.N((long)(var15 + var6 << 2), (long)(var14 + var7 << 2));
            double var20 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D;
            double var22 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D;
            this.N((long)(var15 + var6 + 1 << 2), (long)(var14 + var7 << 2));
            double var24 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
            double var26 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D;
            this.N((long)(var15 + var6 << 2), (long)(var14 + var7 + 1 << 2));
            double var28 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D;
            double var30 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
            this.N((long)(var15 + var6 + 1 << 2), (long)(var14 + var7 + 1 << 2));
            double var32 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
            double var34 = ((double)this.u(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
            int var36 = var10[var15 + 1 + (var14 + 0) * var8] & 255;
            int var37 = var10[var15 + 1 + (var14 + 1) * var8] & 255;
            int var38 = 0;
            int var39 = ((var14 << 2) + var38) * var11 + (var15 << 2);
            int var40 = 0;
            double var41 = ((double)var38 - var22) * ((double)var38 - var22) + ((double)var40 - var20) * ((double)var40 - var20);
            double var43 = ((double)var38 - var26) * ((double)var38 - var26) + ((double)var40 - var24) * ((double)var40 - var24);
            double var45 = ((double)var38 - var30) * ((double)var38 - var30) + ((double)var40 - var28) * ((double)var40 - var28);
            double var47 = ((double)var38 - var34) * ((double)var38 - var34) + ((double)var40 - var32) * ((double)var40 - var32);
            if(Double.compare(var41, var43) < 0 && Double.compare(var41, var45) < 0 && Double.compare(var41, var47) < 0) {
               var13[var39++] = var16;
            }

            if(var43 < var41 && Double.compare(var43, var45) < 0 && Double.compare(var43, var47) < 0) {
               var13[var39++] = var36;
            }

            if(var45 < var41 && var45 < var43 && var45 < var47) {
               var13[var39++] = var17;
            }

            var13[var39++] = var37;
            ++var40;
            ++var38;
            ++var15;
         }

         ++var14;
      }

      int[] var52 = r.J(var3 * var4);
      int var54 = 0;
      if(var54 < var4) {
         System.arraycopy(var13, (var54 + (var2 & 3)) * var11 + (var1 & 3), var52, var54 * var3, var3);
         ++var54;
      }

      if(net.u.d.y() == null) {
         i.u(new net.u.d[1]);
      }

      return var52;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
