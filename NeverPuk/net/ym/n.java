package net.ym;

import java.util.Arrays;
import net.ym.i;
import net.ym.t;

public class n extends t {
   private final net.n9.v C;
   private final net.n9.v F;

   public n(t var1, net.n9.v var2) {
      super(Arrays.copyOf(var1.I(), var1.I().length), var1.j, i.S(var1.I()), var2);
      this.C = var2;
      this.K = var1.K;
      this.L = var1.L;
      this.F = var1.t();
      this.I();
      this.i();
   }

   private void I() {
      t.V();
      int var2 = 0;
      int var3 = this.K.u() * var2;
      int var4 = this.K.u(0) / 4;
      this.h[var3 + var4] = Float.floatToRawIntBits(this.C.W((double)this.F.x(Float.intBitsToFloat(this.h[var3 + var4]))));
      this.h[var3 + var4 + 1] = Float.floatToRawIntBits(this.C.L((double)this.F.G(Float.intBitsToFloat(this.h[var3 + var4 + 1]))));
      ++var2;
   }
}
