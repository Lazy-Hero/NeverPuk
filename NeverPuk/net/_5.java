package net;

import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.mf;
import net.os;
import net.xn;
import net.z9;
import org.lwjgl.opengl.GL11;

public class _5 {
   private final String c;
   private final int E;
   private final int n;
   private final int[] b;
   private final boolean J;
   private final int[][] P;
   private IntBuffer[] p;
   private final Dimension[] L;

   public _5(String var1, int var2, int var3, int[] var4, boolean var5) {
      this.c = var1;
      this.E = var2;
      this.n = var3;
      this.b = var4;
      this.J = var5;
      this.L = A(var2, var3, var1);
      this.P = z(var4, var2, var3, this.L);
      this.p = L(this.L, this.P);
   }

   public static Dimension[] A(int var0, int var1, String var2) {
      int var3 = os.W(var0);
      int var4 = os.W(var1);
      if(var3 == var0 && var4 == var1) {
         ArrayList var5 = new ArrayList();
         int var6 = var3 / 2;
         int var7 = var4 / 2;
         Dimension[] var8 = (Dimension[])((Dimension[])var5.toArray(new Dimension[var5.size()]));
         return var8;
      } else {
         z9.h("Mipmaps not possible (power of 2 dimensions needed), texture: " + var2 + ", dim: " + var0 + "x" + var1);
         return new Dimension[0];
      }
   }

   public static int[][] z(int[] var0, int var1, int var2, Dimension[] var3) {
      String var4 = mf.O();
      boolean var7 = true;
      int[][] var8 = new int[var3.length][];
      int var9 = 0;
      if(var9 < var3.length) {
         Dimension var10 = var3[var9];
         int var11 = var10.width;
         int var12 = var10.height;
         int[] var13 = new int[var11 * var12];
         var8[var9] = var13;
         int var10000 = var9 + 1;
         int var15 = 0;
         if(var15 < var11) {
            int var16 = 0;
            if(var16 < var12) {
               int var17 = var0[var15 * 2 + 0 + (var16 * 2 + 0) * var1];
               int var18 = var0[var15 * 2 + 1 + (var16 * 2 + 0) * var1];
               int var19 = var0[var15 * 2 + 1 + (var16 * 2 + 1) * var1];
               int var20 = var0[var15 * 2 + 0 + (var16 * 2 + 1) * var1];
               int var21 = w(var17, var18, var19, var20);
               var13[var15 + var16 * var11] = var21;
               ++var16;
            }

            ++var15;
         }

         if(var11 <= 1 || var12 <= 1) {
            var7 = false;
         }

         ++var9;
      }

      return var8;
   }

   public static int w(int var0, int var1, int var2, int var3) {
      int var4 = N(var0, var1);
      int var5 = N(var2, var3);
      int var6 = N(var4, var5);
      return var6;
   }

   private static int N(int var0, int var1) {
      int var2 = (var0 & -16777216) >> 24 & 255;
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 + var3) / 2;
      var2 = 1;
      var3 = 1;
      int var5 = (var0 >> 16 & 255) * var2;
      int var6 = (var0 >> 8 & 255) * var2;
      int var7 = (var0 & 255) * var2;
      int var8 = (var1 >> 16 & 255) * var3;
      int var9 = (var1 >> 8 & 255) * var3;
      int var10 = (var1 & 255) * var3;
      int var11 = (var5 + var8) / (var2 + var3);
      int var12 = (var6 + var9) / (var2 + var3);
      int var13 = (var7 + var10) / (var2 + var3);
      return var4 << 24 | var11 << 16 | var12 << 8 | var13;
   }

   private int M(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   public static IntBuffer[] L(Dimension[] var0, int[][] var1) {
      return null;
   }

   public static void u(int var0, int var1, String var2) {
      Dimension[] var3 = A(var0, var1, var2);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Dimension var5 = var3[var4];
         int var6 = var5.width;
         int var7 = var5.height;
         int var8 = var4 + 1;
         GL11.glTexImage2D(3553, var8, 6408, var6, var7, 0, '胡', '荧', (IntBuffer)null);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
