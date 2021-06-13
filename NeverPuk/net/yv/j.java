package net.yv;

import net.xn;
import net.yv.r;

public class j {
   public static final j[] O = new j[16];
   public static final j R = (new j(0, "default", 1)).I();
   public static final j T = new j(1, "flat");
   public static final j p = new j(2, "largeBiomes");
   public static final j I = (new j(3, "amplified")).E();
   public static final j C = new j(4, "customized");
   public static final j J = new j(5, "debug_all_block_states");
   public static final j f = (new j(8, "default_1_1", 0)).C(false);
   private final int h;
   private final String N;
   private final int U;
   private boolean e;
   private boolean o;
   private boolean g;

   private j(int var1, String var2) {
      this(var1, var2, 0);
   }

   private j(int var1, String var2, int var3) {
      this.N = var2;
      this.U = var3;
      this.e = true;
      this.h = var1;
      O[var1] = this;
   }

   public String H() {
      return this.N;
   }

   public String I() {
      return "generator." + this.N;
   }

   public String e() {
      return this.I() + ".info";
   }

   public int w() {
      return this.U;
   }

   public j U(int var1) {
      return this == R?f:this;
   }

   private j C(boolean var1) {
      this.e = var1;
      return this;
   }

   public boolean f() {
      return this.e;
   }

   private j I() {
      this.o = true;
      return this;
   }

   public boolean z() {
      return this.o;
   }

   public static j X(String var0) {
      j[] var2 = O;
      r.C();
      int var3 = var2.length;
      int var4 = 0;
      if(var4 < var3) {
         j var5 = var2[var4];
         if(var5.N.equalsIgnoreCase(var0)) {
            return var5;
         }

         ++var4;
      }

      return null;
   }

   public int N() {
      return this.h;
   }

   public boolean S() {
      return this.g;
   }

   private j E() {
      this.g = true;
      return this;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
