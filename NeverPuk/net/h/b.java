package net.h;

import net.xn;
import net.h.l;
import net.h.w;
import net.u.t;
import net.yz.p;

public class b extends w {
   private final net.yy.g P;
   private int d;

   public b(net.yy.g var1) {
      super(net.nb.l.Kz, p.PLAYERS);
      this.P = var1;
      this.B = true;
      this.y = 0;
      this.e = 0.1F;
   }

   public void m() {
      l.l();
      ++this.d;
      if(!this.P.Z && (this.d <= 20 || this.P.I())) {
         this.g = (float)this.P.b;
         this.C = (float)this.P.hS;
         this.t = (float)this.P.hr;
         float var2 = t.R(this.P.hf * this.P.hf + this.P.J * this.P.J + this.P.K * this.P.K);
         float var3 = var2 / 2.0F;
         if((double)var2 >= 0.01D) {
            this.e = t.T(var3 * var3, 0.0F, 1.0F);
         }

         this.e = 0.0F;
         if(this.d < 20) {
            this.e = 0.0F;
         }

         if(this.d < 40) {
            this.e = (float)((double)this.e * ((double)(this.d - 20) / 20.0D));
         }

         float var10000 = 0.8F;
         if(this.e > 0.8F) {
            this.J = 1.0F + (this.e - 0.8F);
         }

         this.J = 1.0F;
      }

      this.r = true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
