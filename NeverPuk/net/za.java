package net;

import net.zk;

public enum za {
   TASK("task", 0, net.cb.z.GREEN),
   CHALLENGE("challenge", 26, net.cb.z.DARK_PURPLE),
   GOAL("goal", 52, net.cb.z.GREEN);

   private final String C;
   private final int d;
   private final net.cb.z w;

   private za(String var3, int var4, net.cb.z var5) {
      this.C = var3;
      this.d = var4;
      this.w = var5;
   }

   public String O() {
      return this.C;
   }

   public int V() {
      return this.d;
   }

   public static za M(String var0) {
      za[] var2 = values();
      int var3 = var2.length;
      zk.l.D();
      int var4 = 0;
      if(var4 < var3) {
         za var5 = var2[var4];
         if(var5.C.equals(var0)) {
            return var5;
         }

         ++var4;
      }

      throw new IllegalArgumentException("Unknown frame type \'" + var0 + "\'");
   }

   public net.cb.z f() {
      return this.w;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
