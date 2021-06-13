package net.cy;

import net.xn;
import net.u.d;

public class b {
   public float[][] q = new float[6][4];
   public float[] u = new float[16];
   public float[] X = new float[16];
   public float[] U = new float[16];
   private static String t;

   private float S(float[] var1, float var2, float var3, float var4) {
      return var1[0] * var2 + var1[1] * var3 + var1[2] * var4 + var1[3];
   }

   public boolean r(double var1, double var3, double var5, double var7, double var9, double var11) {
      C();
      float var14 = (float)var1;
      float var15 = (float)var3;
      float var16 = (float)var5;
      float var17 = (float)var7;
      float var18 = (float)var9;
      float var19 = (float)var11;
      int var20 = 0;
      float[] var21 = this.q[var20];
      if(Float.compare(this.S(var21, var14, var15, var16), 0.0F) <= 0 && Float.compare(this.S(var21, var17, var15, var16), 0.0F) <= 0 && this.S(var21, var14, var18, var16) <= 0.0F && this.S(var21, var17, var18, var16) <= 0.0F && this.S(var21, var14, var15, var19) <= 0.0F && this.S(var21, var17, var15, var19) <= 0.0F && this.S(var21, var14, var18, var19) <= 0.0F && this.S(var21, var17, var18, var19) <= 0.0F) {
         return false;
      } else {
         ++var20;
         d.h(new d[1]);
         return true;
      }
   }

   public static void Z(String var0) {
      t = var0;
   }

   public static String C() {
      return t;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(C() == null) {
         Z("S2Pvfc");
      }

   }
}
