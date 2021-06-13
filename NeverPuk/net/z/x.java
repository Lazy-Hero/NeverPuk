package net.z;

import net.xn;
import net.yz.m_;
import net.z.g;
import net.z.m;

public class x extends m {
   private final m_ t;
   private final int C;
   private final int Z;
   private final int S;

   public x(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, m_ var9) {
      super(var1, var2, var3, var4, var5, "");
      this.C = var6;
      this.Z = var7;
      this.S = var8;
      this.t = var9;
   }

   public void M(int var1, int var2) {
      this.D = var1;
      this.R = var2;
   }

   public void Z(net.nn.j var1, int var2, int var3, float var4) {
      boolean var5 = g.B();
      if(this.F) {
         this.P = var2 >= this.D && var3 >= this.R && var2 < this.D + this.s && var3 < this.R + this.h;
         var1.n().E(this.t);
         net.y.d.z();
         int var6 = this.C;
         int var7 = this.Z;
         if(this.P) {
            var7 += this.S;
         }

         this.g(this.D, this.R, var6, var7, this.s, this.h);
         net.y.d.B();
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
