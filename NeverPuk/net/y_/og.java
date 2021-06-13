package net.y_;

import net.xn;
import net.y_.b;

public abstract class og extends b {
   private final net.ne.s v;
   private final double i;
   protected int L;
   private int k;
   private int R;
   protected net.u.j t = net.u.j.V;
   private boolean j;
   private final int u;

   public og(net.ne.s var1, double var2, int var4) {
      this.v = var1;
      this.i = var2;
      this.u = var4;
      this.h(5);
   }

   public boolean f() {
      if(this.L > 0) {
         --this.L;
         return false;
      } else {
         this.L = 200 + this.v.Q().nextInt(200);
         return this.H();
      }
   }

   public boolean X() {
      return this.k >= -this.R && this.k <= 1200 && this.b(this.v.hl, this.t);
   }

   public void I() {
      this.v.H().k((double)((float)this.t.t()) + 0.5D, (double)(this.t.h() + 1), (double)((float)this.t.y()) + 0.5D, this.i);
      this.k = 0;
      this.R = this.v.Q().nextInt(this.v.Q().nextInt(1200) + 1200) + 1200;
   }

   public void E() {
      if(this.v.H(this.t.h()) > 1.0D) {
         this.j = false;
         ++this.k;
         if(this.k % 40 == 0) {
            this.v.H().k((double)((float)this.t.t()) + 0.5D, (double)(this.t.h() + 1), (double)((float)this.t.y()) + 0.5D, this.i);
         }
      } else {
         this.j = true;
         --this.k;
      }

   }

   protected boolean J() {
      return this.j;
   }

   private boolean H() {
      int var2 = this.u;
      b.E();
      boolean var10001 = true;
      net.u.j var4 = new net.u.j(this.v);
      int var5 = 0;
      int var6 = 0;
      if(var6 < var2) {
         int var7 = 0;
         int var8 = 0;
         net.u.j var9 = var4.F(var7, var5 - 1, var8);
         if(this.v.x(var9) && this.b(this.v.hl, var9)) {
            this.t = var9;
            return true;
         }

         var8 = 1 - var8;
         var7 = 1 - var7;
         ++var6;
      }

      var5 = 1 - var5;
      return false;
   }

   protected abstract boolean b(net.yv.r var1, net.u.j var2);

   private static xn c(xn var0) {
      return var0;
   }
}
