package net.w;

import com.google.common.base.Predicate;
import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.lc;

public class f0 extends f {
   private final net.yw.n u;
   private final int i;
   private final Predicate v;

   public f0(net.yw.n var1, int var2) {
      this(var1, var2, new f0.w());
   }

   public f0(net.yw.n var1, int var2, Predicate var3) {
      this.u = var1;
      this.i = var2;
      this.v = var3;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      float var5 = var2.nextFloat() * 3.1415927F;
      double var6 = (double)((float)(var3.t() + 8) + net.u.t.A(var5) * (float)this.i / 8.0F);
      f.j();
      double var8 = (double)((float)(var3.t() + 8) - net.u.t.A(var5) * (float)this.i / 8.0F);
      double var10 = (double)((float)(var3.y() + 8) + net.u.t.m(var5) * (float)this.i / 8.0F);
      double var12 = (double)((float)(var3.y() + 8) - net.u.t.m(var5) * (float)this.i / 8.0F);
      double var14 = (double)(var3.h() + var2.nextInt(3) - 2);
      double var16 = (double)(var3.h() + var2.nextInt(3) - 2);
      int var18 = 0;
      if(var18 < this.i) {
         float var19 = (float)var18 / (float)this.i;
         double var20 = var6 + (var8 - var6) * (double)var19;
         double var22 = var14 + (var16 - var14) * (double)var19;
         double var24 = var10 + (var12 - var10) * (double)var19;
         double var26 = var2.nextDouble() * (double)this.i / 16.0D;
         double var28 = (double)(net.u.t.A(3.1415927F * var19) + 1.0F) * var26 + 1.0D;
         double var30 = (double)(net.u.t.A(3.1415927F * var19) + 1.0F) * var26 + 1.0D;
         int var32 = net.u.t.L(var20 - var28 / 2.0D);
         int var33 = net.u.t.L(var22 - var30 / 2.0D);
         int var34 = net.u.t.L(var24 - var28 / 2.0D);
         int var35 = net.u.t.L(var20 + var28 / 2.0D);
         int var36 = net.u.t.L(var22 + var30 / 2.0D);
         int var37 = net.u.t.L(var24 + var28 / 2.0D);
         if(var32 <= var35) {
            double var39 = ((double)var32 + 0.5D - var20) / (var28 / 2.0D);
            if(Double.compare(var39 * var39, 1.0D) < 0 && var33 <= var36) {
               double var42 = ((double)var33 + 0.5D - var22) / (var30 / 2.0D);
               if(Double.compare(var39 * var39 + var42 * var42, 1.0D) < 0 && var34 <= var37) {
                  double var45 = ((double)var34 + 0.5D - var24) / (var28 / 2.0D);
                  if(Double.compare(var39 * var39 + var42 * var42 + var45 * var45, 1.0D) < 0) {
                     net.u.j var47 = new net.u.j(var32, var33, var34);
                     if(this.v.apply(var1.Z(var47))) {
                        var1.k(var47, this.u, 2);
                     }
                  }

                  int var44 = var34 + 1;
               }

               int var41 = var33 + 1;
            }

            int var38 = var32 + 1;
         }

         ++var18;
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class w implements Predicate {
      private w() {
      }

      public boolean W(net.yw.n var1) {
         int var2 = f.h();
         if(var1 != null && var1.Q() == net.nb.f.oy) {
            lc.d var3 = (lc.d)var1.i(lc.W);
            return var3.K();
         } else {
            return false;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
