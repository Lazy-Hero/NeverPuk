package net.yf;

public interface f {
   boolean c();

   public static enum a implements f {
      NORMAL(false),
      ADVANCED(true);

      final boolean W;

      private a(boolean var3) {
         this.W = var3;
      }

      public boolean c() {
         return this.W;
      }
   }
}
