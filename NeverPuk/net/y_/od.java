package net.y_;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.y_.b;

public class od extends b {
   public net.yn.l q;
   private double z;
   private int Y;

   public od(net.yn.l var1, double var2) {
      this.q = var1;
      this.z = var2;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.E();
      if(!this.q.ln() && !this.q.Ot()) {
         List var2 = this.q.hl.p(this.q.getClass(), this.q.i().f(9.0D, 4.0D, 9.0D));
         net.yn.l var3 = null;
         double var4 = Double.MAX_VALUE;
         Iterator var6 = var2.iterator();
         if(var6.hasNext()) {
            net.yn.l var7 = (net.yn.l)var6.next();
            if(var7.Ot() && !var7.O3()) {
               double var8 = this.q.F(var7);
               if(var8 <= var4) {
                  var4 = var8;
                  var3 = var7;
               }
            }
         }

         if(var3 == null) {
            var6 = var2.iterator();
            if(var6.hasNext()) {
               net.yn.l var11 = (net.yn.l)var6.next();
               if(var11.ln() && !var11.O3()) {
                  double var12 = this.q.F(var11);
                  if(var12 <= var4) {
                     var4 = var12;
                     var3 = var11;
                  }
               }
            }
         }

         if(var3 == null) {
            return false;
         } else {
            Double.compare(var4, 4.0D);
            if(!var3.ln() && !this.o(var3, 1)) {
               return false;
            } else {
               this.q.o(var3);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public boolean X() {
      if(this.q.Ot() && this.q.F().P() && this.o(this.q, 0)) {
         double var1 = this.q.F(this.q.F());
         if(var1 > 676.0D) {
            if(this.z <= 3.0D) {
               this.z *= 1.2D;
               this.Y = 40;
               return true;
            }

            if(this.Y == 0) {
               return false;
            }
         }

         if(this.Y > 0) {
            --this.Y;
         }

         return true;
      } else {
         return false;
      }
   }

   public void C() {
      this.q.pW();
      this.z = 2.1D;
   }

   public void E() {
      if(this.q.Ot()) {
         net.yn.l var1 = this.q.F();
         double var2 = (double)this.q.d(var1);
         float var10000 = 2.0F;
         net.u.r var5 = (new net.u.r(var1.b - this.q.b, var1.hS - this.q.hS, var1.hr - this.q.hr)).I().T(Math.max(var2 - 2.0D, 0.0D));
         this.q.H().k(this.q.b + var5.p, this.q.hS + var5.H, this.q.hr + var5.a, this.z);
      }

   }

   private boolean o(net.yn.l var1, int var2) {
      if(var2 > 8) {
         return false;
      } else if(var1.Ot()) {
         if(var1.F().ln()) {
            return true;
         } else {
            net.yn.l var3 = var1.F();
            ++var2;
            return this.o(var3, var2);
         }
      } else {
         return false;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
