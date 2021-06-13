package net.nl;

import net.nl.v;

public enum z2 {
   MAINHAND(z2.w.HAND, 0, 0, "mainhand"),
   OFFHAND(z2.w.HAND, 1, 5, "offhand"),
   FEET(z2.w.ARMOR, 0, 1, "feet"),
   LEGS(z2.w.ARMOR, 1, 2, "legs"),
   CHEST(z2.w.ARMOR, 2, 3, "chest"),
   HEAD(z2.w.ARMOR, 3, 4, "head");

   private final z2.w q;
   private final int X;
   private final int U;
   private final String A;

   private z2(z2.w var3, int var4, int var5, String var6) {
      this.q = var3;
      this.X = var4;
      this.U = var5;
      this.A = var6;
   }

   public z2.w x() {
      return this.q;
   }

   public int l() {
      return this.X;
   }

   public int B() {
      return this.U;
   }

   public String H() {
      return this.A;
   }

   public static z2 T(String var0) {
      v.N();
      z2[] var2 = values();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         z2 var5 = var2[var4];
         if(var5.H().equals(var0)) {
            return var5;
         }

         ++var4;
      }

      throw new IllegalArgumentException("Invalid slot \'" + var0 + "\'");
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static enum w {
      HAND,
      ARMOR;
   }
}
