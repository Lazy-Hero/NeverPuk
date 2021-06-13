package net.n0;

import net.xn;
import net.yz.au;

public enum kw implements au {
   WHITE,
   ORANGE,
   MAGENTA,
   LIGHT_BLUE,
   YELLOW,
   LIME,
   PINK,
   GRAY,
   SILVER,
   CYAN,
   PURPLE,
   BLUE,
   BROWN,
   GREEN,
   RED,
   BLACK;

   private static final kw[] q;
   private static final kw[] a;
   private final int b;
   private final int v;
   private final String J;
   private final String w;
   private final int h;
   private final float[] X;
   private final net.cb.z z;
   private static int[] i;

   private kw(int var3, int var4, String var5, String var6, int var7, net.cb.z var8) {
      this.b = var3;
      this.v = var4;
      this.J = var5;
      this.w = var6;
      this.h = var7;
      this.z = var8;
      int var9 = (var7 & 16711680) >> 16;
      int var10 = (var7 & '\uff00') >> 8;
      int var11 = (var7 & 255) >> 0;
      this.X = new float[]{(float)var9 / 255.0F, (float)var10 / 255.0F, (float)var11 / 255.0F};
   }

   public int d() {
      return this.b;
   }

   public int G() {
      return this.v;
   }

   public String L() {
      return this.J;
   }

   public String h() {
      return this.w;
   }

   public int z() {
      return this.h;
   }

   public float[] H() {
      return this.X;
   }

   public static kw q(int var0) {
      int[] var1 = b();
      if(var0 < 0 || var0 >= a.length) {
         var0 = 0;
      }

      return a[var0];
   }

   public static kw h(int var0) {
      int[] var1 = b();
      if(var0 < 0 || var0 >= q.length) {
         var0 = 0;
      }

      return q[var0];
   }

   public String toString() {
      return this.w;
   }

   public String f() {
      return this.J;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static void z(int[] var0) {
      i = var0;
   }

   public static int[] b() {
      return i;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
