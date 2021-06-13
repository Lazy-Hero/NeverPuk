package net.yv;

import net.xn;
import net.yv.r;

public enum o9 {
   NOT_SET(-1, "", ""),
   SURVIVAL(0, "survival", "s"),
   CREATIVE(1, "creative", "c"),
   ADVENTURE(2, "adventure", "a"),
   SPECTATOR(3, "spectator", "sp");

   int m;
   String a;
   String j;

   private o9(int var3, String var4, String var5) {
      this.m = var3;
      this.a = var4;
      this.j = var5;
   }

   public int x() {
      return this.m;
   }

   public String t() {
      return this.a;
   }

   public void M(net.r.n var1) {
      net.u.d[] var2 = r.C();
      if(this == CREATIVE) {
         var1.P = true;
         var1.V = true;
         var1.T = true;
      }

      if(this == SPECTATOR) {
         var1.P = true;
         var1.V = false;
         var1.T = true;
         var1.n = true;
      }

      var1.P = false;
      var1.V = false;
      var1.T = false;
      var1.n = false;
      var1.s = !this.p();
   }

   public boolean p() {
      return this == ADVENTURE || this == SPECTATOR;
   }

   public boolean U() {
      return this == CREATIVE;
   }

   public boolean a() {
      return this == SURVIVAL || this == ADVENTURE;
   }

   public static o9 M(int var0) {
      return A(var0, SURVIVAL);
   }

   public static o9 A(int var0, o9 var1) {
      for(o9 var5 : values()) {
         if(var5.m == var0) {
            return var5;
         }
      }

      return var1;
   }

   public static o9 p(String var0) {
      return l(var0, SURVIVAL);
   }

   public static o9 l(String var0, o9 var1) {
      for(o9 var5 : values()) {
         if(var5.a.equals(var0) || var5.j.equals(var0)) {
            return var5;
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
