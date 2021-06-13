package net.y_;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.y_.b;

public class h extends b {
   net.yn.w d;
   net.yn.w D;
   double Q;
   private int C;

   public h(net.yn.w var1, double var2) {
      this.d = var1;
      this.Q = var2;
   }

   public boolean f() {
      boolean var1 = b.E();
      if(this.d.z() >= 0) {
         return false;
      } else {
         List var2 = this.d.hl.p(this.d.getClass(), this.d.i().f(8.0D, 4.0D, 8.0D));
         Object var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();
         if(var6.hasNext()) {
            net.yn.w var7 = (net.yn.w)var6.next();
            if(var7.z() >= 0) {
               double var8 = this.d.F(var7);
               if(var8 <= var4) {
                  ;
               }
            }
         }

         return false;
      }
   }

   public boolean X() {
      if(this.d.z() >= 0) {
         return false;
      } else if(!this.D.P()) {
         return false;
      } else {
         double var1 = this.d.F(this.D);
         return var1 >= 9.0D && var1 <= 256.0D;
      }
   }

   public void I() {
      this.C = 0;
   }

   public void C() {
      this.D = null;
   }

   public void E() {
      if(--this.C <= 0) {
         this.C = 10;
         this.d.H().F(this.D, this.Q);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
