package net.y_;

import net.xn;
import net.y_.b;
import net.y_.s;

public class or extends b {
   private final net.yn.j t;
   private final double B;
   private double H;
   private double a;
   private double M;

   public or(net.yn.j var1, double var2) {
      this.t = var1;
      this.B = var2;
      this.h(1);
   }

   public boolean f() {
      if(!this.t.Up() && this.t.t()) {
         net.u.r var1 = s.h(this.t, 5, 4);
         return false;
      } else {
         return false;
      }
   }

   public void I() {
      this.t.H().k(this.H, this.a, this.M, this.B);
   }

   public boolean X() {
      return !this.t.Up() && !this.t.H().q() && this.t.t();
   }

   public void E() {
      boolean var1 = b.E();
      if(!this.t.Up() && this.t.Q().nextInt(50) == 0) {
         net.ne.l var2 = (net.ne.l)this.t.H().get(0);
         if(var2 == null) {
            return;
         }

         if(var2 instanceof net.r.r) {
            int var3 = this.t.c();
            int var4 = this.t.x();
            if(var4 > 0 && this.t.Q().nextInt(var4) < var3) {
               this.t.w((net.r.r)var2);
               return;
            }

            this.t.n(5);
         }

         this.t.Y();
         this.t.Is();
         this.t.hl.k(this.t, (byte)6);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
