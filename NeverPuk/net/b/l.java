package net.b;

import net.b.c;
import net.b.n;

public class l {
   private c[] g = new c[128];
   private int T;

   public c R(c var1) {
      if(var1.K >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if(this.T == this.g.length) {
            c[] var2 = new c[this.T << 1];
            System.arraycopy(this.g, 0, var2, 0, this.T);
            this.g = var2;
         }

         this.g[this.T] = var1;
         var1.K = this.T;
         this.G(this.T++);
         return var1;
      }
   }

   public void D() {
      this.T = 0;
   }

   public c r() {
      c var1 = this.g[0];
      this.g[0] = this.g[--this.T];
      this.g[this.T] = null;
      if(this.T > 0) {
         this.T(0);
      }

      var1.K = -1;
      return var1;
   }

   public void Q(c var1, float var2) {
      float var3 = var1.Y;
      var1.Y = var2;
      if(var2 < var3) {
         this.G(var1.K);
      } else {
         this.T(var1.K);
      }

   }

   private void G(int var1) {
      c var2 = this.g[var1];
      float var4 = var2.Y;

      while(true) {
         int var3 = var1 - 1 >> 1;
         c var5 = this.g[var3];
         if(var4 >= var5.Y) {
            this.g[var1] = var2;
            var2.K = var1;
            return;
         }

         this.g[var1] = var5;
         var5.K = var1;
         var1 = var3;
      }
   }

   private void T(int var1) {
      c var3 = this.g[var1];
      n.q();
      float var4 = var3.Y;
      int var5 = 1 + (var1 << 1);
      int var6 = var5 + 1;
      if(var5 >= this.T) {
         ;
      }

      c var7 = this.g[var5];
      float var8 = var7.Y;
      if(var6 >= this.T) {
         Object var9 = null;
         float var10 = Float.POSITIVE_INFINITY;
      }

      c var11 = this.g[var6];
      float var12 = var11.Y;
      if(Float.compare(var8, var12) < 0) {
         if(Float.compare(var8, var4) >= 0) {
            ;
         }

         this.g[var1] = var7;
         var7.K = var1;
         var1 = var5;
      }

      if(var12 >= var4) {
         ;
      }

      this.g[var1] = var11;
      var11.K = var1;
      this.g[var6] = var3;
      var3.K = var6;
   }

   public boolean O() {
      return this.T == 0;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
