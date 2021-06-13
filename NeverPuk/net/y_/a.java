package net.y_;

import net.xn;
import net.y_.b;
import net.y_.u;

public class a extends u {
   public a(net.ne.y var1) {
      super(var1);
   }

   public void D() {
      boolean var1 = b.q();
      if(this.p == u.t.MOVE_TO) {
         this.p = u.t.WAIT;
         this.D.I(true);
         double var2 = this.c - this.D.b;
         double var4 = this.X - this.D.hS;
         double var6 = this.Y - this.D.hr;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if(var8 < 2.500000277905201E-7D) {
            this.D.C(0.0F);
            this.D.M(0.0F);
            return;
         }

         float var10 = (float)(net.u.t.V(var6, var2) * 57.29577951308232D) - 90.0F;
         this.D.hN = this.p(this.D.hN, var10, 10.0F);
         if(this.D.k) {
            float var10000 = (float)(this.b * this.D.t(net.ne.d.G).K());
         }

         float var11 = (float)(this.b * this.D.t(net.ne.d.c).K());
         this.D.P(var11);
         double var12 = (double)net.u.t.R(var2 * var2 + var6 * var6);
         float var14 = (float)(-(net.u.t.V(var4, var12) * 57.29577951308232D));
         this.D.V = this.p(this.D.V, var14, 10.0F);
         this.D.C(var4 > 0.0D?var11:-var11);
      }

      this.D.I(false);
      this.D.C(0.0F);
      this.D.M(0.0F);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
