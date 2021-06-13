package net;

import net.x9;
import net.xn;
import net.u.d;

public enum p2 {
   IDENTIFIER("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "0123456789_:."),
   CONSTANT("0123456789", "."),
   OPERATOR("+-*/%", 1),
   COMMA(",", 1),
   BRACKET_OPEN("(", 1),
   BRACKET_CLOSE(")", 1);

   private final String P;
   private final String V;
   private int h;
   public static final p2[] VALUES = values();

   private p2(String var3) {
      this.P = var3;
      this.V = "";
   }

   private p2(String var3, int var4) {
      this.P = var3;
      this.V = "";
      this.h = var4;
   }

   private p2(String var3, String var4) {
      this.P = var3;
      this.V = var4;
   }

   public String J() {
      return this.P;
   }

   public String e() {
      return this.V;
   }

   public static p2 A(char var0) {
      x9.y();
      int var2 = 0;
      if(var2 < VALUES.length) {
         p2 var3 = VALUES[var2];
         if(var3.J().indexOf(var0) >= 0) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   public boolean i(char var1) {
      d[] var2 = x9.y();
      return this.J().indexOf(var1) >= 0?true:this.e().indexOf(var1) >= 0;
   }

   public int i() {
      return this.h;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
