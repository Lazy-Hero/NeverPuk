package net.cb;

import net.xn;
import net.cb.k;

public enum c {
   CHAT((byte)0),
   SYSTEM((byte)1),
   GAME_INFO((byte)2);

   private final byte V;

   private c(byte var3) {
      this.V = var3;
   }

   public byte N() {
      return this.V;
   }

   public static c m(byte var0) {
      k.B();
      c[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         c var5 = var2[var4];
         if(var0 == var5.V) {
            return var5;
         }

         ++var4;
      }

      return CHAT;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
