package net.nv;

public class t extends Exception {
   private final Object[] C;
   private static String[] Q;

   public t(String var1, Object... var2) {
      super(var1);
      this.C = var2;
   }

   public Object[] d() {
      return this.C;
   }

   public synchronized Throwable fillInStackTrace() {
      return this;
   }

   public static void B(String[] var0) {
      Q = var0;
   }

   public static String[] Y() {
      return Q;
   }

   static {
      if(Y() != null) {
         B(new String[2]);
      }

   }
}
