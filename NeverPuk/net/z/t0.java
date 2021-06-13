package net.z;

import net.xn;
import net.z.g;
import net.z.m;

public class t0 extends m {
   private boolean H;

   public t0(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public boolean y() {
      return this.H;
   }

   public void A(boolean var1) {
      this.H = var1;
   }

   public void Z(net.nn.j var1, int var2, int var3, float var4) {
      boolean var5 = g.C();
      if(this.F) {
         var1.n().E(m.b);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         if(var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h) {
            boolean var11 = true;
         } else {
            boolean var10000 = false;
         }

         if(this.H) {
            if(!this.O) {
               t0.j var7 = t0.j.LOCKED_DISABLED;
            }

            t0.j var8 = t0.j.LOCKED;
         }

         if(!this.O) {
            t0.j var9 = t0.j.UNLOCKED_DISABLED;
         }

         t0.j var10 = t0.j.UNLOCKED;
         this.g(this.D, this.R, var10.B(), var10.X(), this.s, this.h);
      }

   }

   private static xn c(xn var0) {
      return var0;
   }

   static enum j {
      LOCKED(0, 146),
      LOCKED_HOVER(0, 166),
      LOCKED_DISABLED(0, 186),
      UNLOCKED(20, 146),
      UNLOCKED_HOVER(20, 166),
      UNLOCKED_DISABLED(20, 186);

      private final int G;
      private final int x;

      private j(int var3, int var4) {
         this.G = var3;
         this.x = var4;
      }

      public int B() {
         return this.G;
      }

      public int X() {
         return this.x;
      }
   }
}
