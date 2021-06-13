package net;

public enum i8 {
   ADD,
   DELETE,
   IMPROVED,
   RECODE,
   FIXED,
   NONE,
   MOVED,
   NEW;

   private static int[] U;

   static {
      c((int[])null);
   }

   public static void c(int[] var0) {
      U = var0;
   }

   public static int[] T() {
      return U;
   }
}
