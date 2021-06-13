package net.yv;

public class v {
   private static int[] y = new int[65536];

   public static void l(int[] var0) {
      y = var0;
   }

   public static int j(double var0, double var2) {
      var2 = var2 * var0;
      int var4 = (int)((1.0D - var0) * 255.0D);
      int var5 = (int)((1.0D - var2) * 255.0D);
      return y[var5 << 8 | var4];
   }

   public static int D() {
      return 6396257;
   }

   public static int H() {
      return 8431445;
   }

   public static int y() {
      return 4764952;
   }
}
