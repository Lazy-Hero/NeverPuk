package net.z;

import net.xn;
import net.yz.m_;
import net.z.g;
import net.z.m;

public class te extends m {
   protected m_ U;
   protected boolean S;
   protected int r;
   protected int B;
   protected int c;
   protected int A;

   public te(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      super(var1, var2, var3, var4, var5, "");
      this.S = var6;
   }

   public void G(int var1, int var2, int var3, int var4, m_ var5) {
      this.r = var1;
      this.B = var2;
      this.c = var3;
      this.A = var4;
      this.U = var5;
   }

   public void Q(boolean var1) {
      this.S = var1;
   }

   public boolean o() {
      return this.S;
   }

   public void Y(int var1, int var2) {
      this.D = var1;
      this.R = var2;
   }

   public void Z(net.nn.j var1, int var2, int var3, float var4) {
      boolean var5 = g.C();
      if(this.F) {
         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         var1.n().E(this.U);
         net.y.d.z();
         int var6 = this.r;
         int var7 = this.B;
         if(this.S) {
            var6 += this.c;
         }

         if(this.P) {
            var7 += this.A;
         }

         this.g(this.D, this.R, var6, var7, this.s, this.h);
         net.y.d.B();
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
