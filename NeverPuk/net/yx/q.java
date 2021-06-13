package net.yx;

public enum q {
   OBTAINED(0),
   UNOBTAINED(1);

   private final int U;
   private static int[] p;

   private q(int var3) {
      this.U = var3;
   }

   public int r() {
      return this.U;
   }

   static {
      E(new int[5]);
   }

   public static void E(int[] var0) {
      p = var0;
   }

   public static int[] c() {
      return p;
   }
}
