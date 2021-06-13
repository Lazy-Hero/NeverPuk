package net.y;

import net.y.p;
import net.yz.ac;

public class b {
   private final p[] B = new p[ac.values().length];

   public b() {
      this.B[ac.SOLID.ordinal()] = new p(2097152);
      this.B[ac.CUTOUT.ordinal()] = new p(131072);
      this.B[ac.CUTOUT_MIPPED.ordinal()] = new p(131072);
      this.B[ac.TRANSLUCENT.ordinal()] = new p(262144);
   }

   public p M(ac var1) {
      return this.B[var1.ordinal()];
   }

   public p d(int var1) {
      return this.B[var1];
   }
}
