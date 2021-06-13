package net.u;

import net.xn;
import net.nj.h;
import net.u.d;
import net.u.j;

public class f {
   protected final float I;
   protected final float W;
   protected final float U;

   public f(float var1, float var2, float var3) {
      this.I = !Float.isInfinite(var1) && !Float.isNaN(var1)?var1 % 360.0F:0.0F;
      this.W = !Float.isInfinite(var2) && !Float.isNaN(var2)?var2 % 360.0F:0.0F;
      this.U = !Float.isInfinite(var3) && !Float.isNaN(var3)?var3 % 360.0F:0.0F;
   }

   public f(h var1) {
      this(var1.h(0), var1.h(1), var1.h(2));
   }

   public h x() {
      h var1 = new h();
      var1.m(new net.nj.j(this.I));
      var1.m(new net.nj.j(this.W));
      var1.m(new net.nj.j(this.U));
      return var1;
   }

   public boolean equals(Object var1) {
      d[] var2 = j.n();
      if(!(var1 instanceof f)) {
         return false;
      } else {
         f var3 = (f)var1;
         return Float.compare(this.I, var3.I) == 0 && this.W == var3.W && this.U == var3.U;
      }
   }

   public float D() {
      return this.I;
   }

   public float L() {
      return this.W;
   }

   public float K() {
      return this.U;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
