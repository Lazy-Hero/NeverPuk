package net.nm;

import net.xn;
import net.nm.w;

public class q extends w {
   public q(net.yv.r var1) {
      super(var1);
   }

   public q(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void o(net.c0.d var0) {
      w.L(var0, q.class);
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      if(var1.Q()) {
         return false;
      } else if(this.t()) {
         return true;
      } else {
         if(!this.hl.x) {
            var1.W(this);
         }

         return true;
      }
   }

   public void K(int var1, int var2, int var3, boolean var4) {
      boolean var5 = w.h.u();
      if(var4) {
         if(this.t()) {
            this.Y();
         }

         if(this.P() == 0) {
            this.L(-this.T());
            this.Q(10);
            this.W(50.0F);
            this.E();
         }
      }

   }

   public w.h R() {
      return w.h.RIDEABLE;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
