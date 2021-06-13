package net.ne;

import net.xn;
import net.ne.a;
import net.ne.d;
import net.ne.y;

public class z {
   private final a x;
   private int e;
   private float i;

   public z(a var1) {
      this.x = var1;
   }

   public void j() {
      d.p();
      double var2 = this.x.b - this.x.h;
      double var4 = this.x.hr - this.x.l;
      if(Double.compare(var2 * var2 + var4 * var4, 2.500000277905201E-7D) > 0) {
         this.x.AK = this.x.hN;
         this.x.A3 = this.Q(this.x.AK, this.x.A3, 75.0F);
         this.i = this.x.A3;
         this.e = 0;
      }

      if(this.x.H().isEmpty() || !(this.x.H().get(0) instanceof y)) {
         float var6 = 75.0F;
         if(Float.compare(Math.abs(this.x.A3 - this.i), 15.0F) > 0) {
            this.e = 0;
            this.i = this.x.A3;
         }

         ++this.e;
         boolean var10000 = true;
         if(this.e > 10) {
            var6 = Math.max(1.0F - (float)(this.e - 10) / 10.0F, 0.0F) * 75.0F;
         }

         this.x.AK = this.Q(this.x.A3, this.x.AK, var6);
      }

   }

   private float Q(float var1, float var2, float var3) {
      float var4 = net.u.t.k(var1 - var2);
      if(var4 < -var3) {
         var4 = -var3;
      }

      if(var4 >= var3) {
         var4 = var3;
      }

      return var1 - var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
