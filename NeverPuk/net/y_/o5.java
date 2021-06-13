package net.y_;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.y_.b;
import net.y_.s;

public class o5 extends b {
   private final net.yn.s W;
   private net.ne.a k;
   private final double m;
   private int M;

   public o5(net.yn.s var1, double var2) {
      this.W = var1;
      this.m = var2;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.E();
      if(this.W.z() >= 0) {
         return false;
      } else if(this.W.Q().nextInt(400) != 0) {
         return false;
      } else {
         List var2 = this.W.hl.p(net.yn.s.class, this.W.i().f(6.0D, 3.0D, 6.0D));
         double var3 = Double.MAX_VALUE;
         Iterator var5 = var2.iterator();
         if(var5.hasNext()) {
            net.yn.s var6 = (net.yn.s)var5.next();
            if(var6 != this.W && !var6.V6() && var6.z() < 0) {
               double var7 = var6.F(this.W);
               if(var7 <= var3) {
                  this.k = var6;
               }
            }
         }

         if(this.k == null) {
            net.u.r var9 = s.h(this.W, 16, 3);
            return true;
         } else {
            return true;
         }
      }
   }

   public boolean X() {
      return this.M > 0;
   }

   public void I() {
      if(this.k != null) {
         this.W.l(true);
      }

      this.M = 1000;
   }

   public void C() {
      this.W.l(false);
      this.k = null;
   }

   public void E() {
      --this.M;
      if(this.k != null) {
         if(this.W.F(this.k) > 4.0D) {
            this.W.H().F(this.k, this.m);
         }
      } else if(this.W.H().q()) {
         net.u.r var1 = s.h(this.W, 16, 3);
         return;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
