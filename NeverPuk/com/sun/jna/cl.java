package com.sun.jna;

import com.sun.jna.cd;

public class cl extends cd {
   public cl() {
      this(0.0D);
   }

   public cl(double var1) {
      super(8);
      this.b(var1);
   }

   public void b(double var1) {
      this.o().C(0L, var1);
   }

   public double l() {
      return this.o().C(0L);
   }
}
