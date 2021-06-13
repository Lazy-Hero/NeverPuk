package net.y_;

import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.s;

public class oy extends b {
   protected final net.ne.s M;
   protected double L;
   protected double s;
   protected double X;
   protected double S;

   public oy(net.ne.s var1, double var2) {
      this.M = var1;
      this.L = var2;
      this.h(1);
   }

   public boolean f() {
      if(this.M.X() == null && !this.M.a()) {
         return false;
      } else if(this.M.a()) {
         net.u.j var1 = this.l(this.M.hl, this.M, 5, 4);
         this.s = (double)var1.t();
         this.X = (double)var1.h();
         this.S = (double)var1.y();
         return true;
      } else {
         return this.o();
      }
   }

   protected boolean o() {
      net.u.r var1 = s.h(this.M, 5, 4);
      return false;
   }

   public void I() {
      this.M.H().k(this.s, this.X, this.S, this.L);
   }

   public boolean X() {
      return !this.M.H().q();
   }

   @Nullable
   private net.u.j l(net.yv.r var1, net.ne.l var2, int var3, int var4) {
      b.q();
      net.u.j var6 = new net.u.j(var2);
      int var7 = var6.t();
      int var8 = var6.h();
      int var9 = var6.y();
      float var10 = (float)(var3 * var3 * var4 * 2);
      net.u.j var11 = null;
      net.u.j var12 = new net.u.j();
      int var13 = var7 - var3;
      if(var13 <= var7 + var3) {
         int var14 = var8 - var4;
         if(var14 <= var8 + var4) {
            int var15 = var9 - var3;
            if(var15 <= var9 + var3) {
               var12.V(var13, var14, var15);
               net.yw.n var16 = var1.Z(var12);
               if(var16.n() == net.y1.l.p) {
                  float var17 = (float)((var13 - var7) * (var13 - var7) + (var14 - var8) * (var14 - var8) + (var15 - var9) * (var15 - var9));
                  if(var17 < var10) {
                     var11 = new net.u.j(var12);
                  }
               }

               ++var15;
            }

            ++var14;
         }

         ++var13;
      }

      return var11;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
