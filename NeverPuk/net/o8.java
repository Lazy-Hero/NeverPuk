package net;

import net.mf;
import net.xn;
import net.z9;
import net.u.r;

public class o8 {
   private r E = null;
   private long z = System.currentTimeMillis();

   public r P(double var1, double var3, double var5) {
      String var7 = mf.O();
      if(this.E == null) {
         this.E = new r(var1, var3, var5);
         return this.E;
      } else {
         long var8 = System.currentTimeMillis();
         long var10 = var8 - this.z;
         if(Long.compare(var10, 0L) == 0) {
            return this.E;
         } else {
            this.z = var8;
            if(Math.abs(var1 - this.E.p) < 0.004D && Math.abs(var3 - this.E.H) < 0.004D && Math.abs(var5 - this.E.a) < 0.004D) {
               return this.E;
            } else {
               double var12 = (double)var10 * 0.001D;
               var12 = z9.Y(var12, 0.0D, 1.0D);
               double var14 = var1 - this.E.p;
               double var16 = var3 - this.E.H;
               double var18 = var5 - this.E.a;
               double var20 = this.E.p + var14 * var12;
               double var22 = this.E.H + var16 * var12;
               double var24 = this.E.a + var18 * var12;
               this.E = new r(var20, var22, var24);
               return this.E;
            }
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
