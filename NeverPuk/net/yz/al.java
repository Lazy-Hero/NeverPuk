package net.yz;

import net.xn;
import net.yz.m_;

public class al {
   private float A;
   private float z;
   private float E;

   public float p(float var1, float var2) {
      this.A += var1;
      m_.J();
      var1 = (this.A - this.z) * var2;
      this.E += (var1 - this.E) * 0.5F;
      if(Float.compare(var1, 0.0F) > 0 && var1 > this.E || var1 < 0.0F && var1 < this.E) {
         var1 = this.E;
      }

      this.z += var1;
      return var1;
   }

   public void A() {
      this.A = 0.0F;
      this.z = 0.0F;
      this.E = 0.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
