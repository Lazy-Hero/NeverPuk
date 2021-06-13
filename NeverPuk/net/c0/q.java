package net.c0;

import net.c0.a;

public enum q implements a {
   LEVEL,
   PLAYER,
   CHUNK,
   BLOCK_ENTITY,
   ENTITY,
   ITEM_INSTANCE,
   OPTIONS,
   STRUCTURE;

   private static String[] m;

   static {
      R((String[])null);
   }

   public static void R(String[] var0) {
      m = var0;
   }

   public static String[] G() {
      return m;
   }
}
