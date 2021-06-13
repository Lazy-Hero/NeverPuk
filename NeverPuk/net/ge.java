package net;

public enum ge {
   PRE,
   POST,
   SEND,
   RECEIVE;

   private static String[] w;

   static {
      W((String[])null);
   }

   public static void W(String[] var0) {
      w = var0;
   }

   public static String[] o() {
      return w;
   }
}
