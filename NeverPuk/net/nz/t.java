package net.nz;

public enum t {
   GROWING(4259712),
   SHRINKING(16724016),
   STATIONARY(2138367);

   private final int a;

   private t(int var3) {
      this.a = var3;
   }

   public int S() {
      return this.a;
   }
}
