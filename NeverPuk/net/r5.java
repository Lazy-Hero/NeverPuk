package net;

import net.mf;
import net.ob;
import net.xn;
import net.z9;
import net.yw.l;

public class r5 {
   private int e = -1;
   private int[] g = null;

   public r5(int var1) {
      this.e = var1;
   }

   public r5(int var1, int var2) {
      this.e = var1;
      if(var2 <= 15) {
         this.g = new int[]{var2};
      }

   }

   public r5(int var1, int[] var2) {
      this.e = var1;
      this.g = var2;
   }

   public int K() {
      return this.e;
   }

   public int[] E() {
      return this.g;
   }

   public boolean x(l var1) {
      return var1.z() != this.e?false:ob.Y(var1.Q(), this.g);
   }

   public boolean E(int var1, int var2) {
      return var1 != this.e?false:ob.Y(var2, this.g);
   }

   public void D(int var1) {
      String var2 = mf.O();
      if(this.g != null && var1 >= 0 && var1 <= 15) {
         int var3 = 0;
         if(var3 < this.g.length) {
            if(this.g[var3] == var1) {
               return;
            }

            ++var3;
         }

         this.g = z9.a(this.g, var1);
      }

   }

   public String toString() {
      return "" + this.e + ":" + z9.n(this.g);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
