package net.l;

import javax.annotation.Nullable;
import net.xn;
import net.l.g;
import net.l.q;
import net.l.x;
import net.y9.l;

public class e implements g {
   private final net.yw.n[] K;
   private final x H;
   private final int p;
   private int W;

   public e(int var1, x var2) {
      this.K = new net.yw.n[1 << var1];
      this.p = var1;
      this.H = var2;
   }

   public int j(net.yw.n var1) {
      q.O();
      int var3 = 0;
      if(var3 < this.W) {
         if(this.K[var3] == var1) {
            return var3;
         }

         ++var3;
      }

      var3 = this.W;
      if(var3 < this.K.length) {
         this.K[var3] = var1;
         ++this.W;
         return var3;
      } else {
         return this.H.K(this.p + 1, var1);
      }
   }

   @Nullable
   public net.yw.n z(int var1) {
      return var1 < this.W?this.K[var1]:null;
   }

   public void J(net.n2.h var1) {
      this.W = var1.q();

      for(int var2 = 0; var2 < this.W; ++var2) {
         this.K[var2] = (net.yw.n)l.x.j(var1.q());
      }

   }

   public void x(net.n2.h var1) {
      var1.a(this.W);

      for(int var2 = 0; var2 < this.W; ++var2) {
         var1.a(l.x.X(this.K[var2]));
      }

   }

   public int I() {
      int var1 = net.n2.h.c(this.W);

      for(int var2 = 0; var2 < this.W; ++var2) {
         var1 += net.n2.h.c(l.x.X(this.K[var2]));
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
