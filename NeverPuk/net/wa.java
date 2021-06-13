package net;

import java.util.Map;
import net._c;
import net._p;
import net.bh;
import net.mf;
import net.xn;
import net.ym.t;

public class wa {
   private static final int T = 0;
   private static final int l = 1;
   private static final int G = 2;
   private static final int j = 3;
   private static final int H = 4;

   public static t[] G(int var0, _p var1, int var2, t var3, _c var4) {
      String var5 = mf.O();
      if(var1.v1 != null && var0 >= 0 && var0 < var1.v1.length) {
         int var6 = var1.v1[var0];
         if(var6 >= 0 && var6 <= var1.vt.length) {
            return A(var6, var1.vt, var3, var4);
         }
      }

      switch(var0) {
      case 1:
         return E(0, 3, var1.vt, var2, var3, var4);
      case 2:
         return A(3, var1.vt, var3, var4);
      case 3:
         return E(3, 0, var1.vt, var2, var3, var4);
      case 4:
         return J(0, 3, 2, 4, var1.vt, var2, var3, var4);
      case 5:
         return J(3, 0, 4, 2, var1.vt, var2, var3, var4);
      case 6:
         return J(2, 4, 2, 4, var1.vt, var2, var3, var4);
      case 7:
         return J(3, 3, 4, 4, var1.vt, var2, var3, var4);
      case 8:
         return J(4, 1, 4, 4, var1.vt, var2, var3, var4);
      case 9:
         return J(4, 4, 4, 1, var1.vt, var2, var3, var4);
      case 10:
         return J(1, 4, 1, 4, var1.vt, var2, var3, var4);
      case 11:
         return J(1, 1, 4, 4, var1.vt, var2, var3, var4);
      case 12:
         return p(0, 2, var1.vt, var2, var3, var4);
      case 13:
         return J(0, 3, 2, 1, var1.vt, var2, var3, var4);
      case 14:
         return p(3, 1, var1.vt, var2, var3, var4);
      case 15:
         return J(3, 0, 1, 2, var1.vt, var2, var3, var4);
      case 16:
         return J(2, 4, 0, 3, var1.vt, var2, var3, var4);
      case 17:
         return J(4, 2, 3, 0, var1.vt, var2, var3, var4);
      case 18:
         return J(4, 4, 3, 3, var1.vt, var2, var3, var4);
      case 19:
         return J(4, 2, 4, 2, var1.vt, var2, var3, var4);
      case 20:
         return J(1, 4, 4, 4, var1.vt, var2, var3, var4);
      case 21:
         return J(4, 4, 1, 4, var1.vt, var2, var3, var4);
      case 22:
         return J(4, 4, 1, 1, var1.vt, var2, var3, var4);
      case 23:
         return J(4, 1, 4, 1, var1.vt, var2, var3, var4);
      case 24:
         return A(2, var1.vt, var3, var4);
      case 25:
         return E(2, 1, var1.vt, var2, var3, var4);
      case 26:
         return A(1, var1.vt, var3, var4);
      case 27:
         return E(1, 2, var1.vt, var2, var3, var4);
      case 28:
         return J(2, 4, 2, 1, var1.vt, var2, var3, var4);
      case 29:
         return J(3, 3, 1, 4, var1.vt, var2, var3, var4);
      case 30:
         return J(2, 1, 2, 4, var1.vt, var2, var3, var4);
      case 31:
         return J(3, 3, 4, 1, var1.vt, var2, var3, var4);
      case 32:
         return J(1, 1, 1, 4, var1.vt, var2, var3, var4);
      case 33:
         return J(1, 1, 4, 1, var1.vt, var2, var3, var4);
      case 34:
         return J(4, 1, 1, 4, var1.vt, var2, var3, var4);
      case 35:
         return J(1, 4, 4, 1, var1.vt, var2, var3, var4);
      case 36:
         return p(2, 0, var1.vt, var2, var3, var4);
      case 37:
         return J(2, 1, 0, 3, var1.vt, var2, var3, var4);
      case 38:
         return p(1, 3, var1.vt, var2, var3, var4);
      case 39:
         return J(1, 2, 3, 0, var1.vt, var2, var3, var4);
      case 40:
         return J(4, 1, 3, 3, var1.vt, var2, var3, var4);
      case 41:
         return J(1, 2, 4, 2, var1.vt, var2, var3, var4);
      case 42:
         return J(1, 4, 3, 3, var1.vt, var2, var3, var4);
      case 43:
         return J(4, 2, 1, 2, var1.vt, var2, var3, var4);
      case 44:
         return J(1, 4, 1, 1, var1.vt, var2, var3, var4);
      case 45:
         return J(4, 1, 1, 1, var1.vt, var2, var3, var4);
      case 46:
         return A(4, var1.vt, var3, var4);
      default:
         return A(0, var1.vt, var3, var4);
      }
   }

   private static t[] E(int var0, int var1, net.n9.v[] var2, int var3, t var4, _c var5) {
      return c(wa.v.LEFT, var0, wa.v.RIGHT, var1, var2, var3, var4, var5);
   }

   private static t[] p(int var0, int var1, net.n9.v[] var2, int var3, t var4, _c var5) {
      return c(wa.v.UP, var0, wa.v.DOWN, var1, var2, var3, var4, var5);
   }

   private static t[] J(int var0, int var1, int var2, int var3, net.n9.v[] var4, int var5, t var6, _c var7) {
      return var0 == var1?(var2 == var3?c(wa.v.UP, var0, wa.v.DOWN, var2, var4, var5, var6, var7):J(wa.v.UP, var0, wa.v.DOWN_LEFT, var2, wa.v.DOWN_RIGHT, var3, var4, var5, var6, var7)):(var2 == var3?J(wa.v.UP_LEFT, var0, wa.v.UP_RIGHT, var1, wa.v.DOWN, var2, var4, var5, var6, var7):(var0 == var2?(var1 == var3?c(wa.v.LEFT, var0, wa.v.RIGHT, var1, var4, var5, var6, var7):J(wa.v.LEFT, var0, wa.v.UP_RIGHT, var1, wa.v.DOWN_RIGHT, var3, var4, var5, var6, var7)):(var1 == var3?J(wa.v.UP_LEFT, var0, wa.v.DOWN_LEFT, var2, wa.v.RIGHT, var1, var4, var5, var6, var7):p(wa.v.UP_LEFT, var0, wa.v.UP_RIGHT, var1, wa.v.DOWN_LEFT, var2, wa.v.DOWN_RIGHT, var3, var4, var5, var6, var7))));
   }

   private static t[] A(int var0, net.n9.v[] var1, t var2, _c var3) {
      net.n9.v var4 = var1[var0];
      return bh.Z(var4, var2, var3);
   }

   private static t[] c(wa.v var0, int var1, wa.v var2, int var3, net.n9.v[] var4, int var5, t var6, _c var7) {
      t var8 = X(var4[var1], var0, var5, var6, var7);
      t var9 = X(var4[var3], var2, var5, var6, var7);
      return var7.s(var8, var9);
   }

   private static t[] J(wa.v var0, int var1, wa.v var2, int var3, wa.v var4, int var5, net.n9.v[] var6, int var7, t var8, _c var9) {
      t var10 = X(var6[var1], var0, var7, var8, var9);
      t var11 = X(var6[var3], var2, var7, var8, var9);
      t var12 = X(var6[var5], var4, var7, var8, var9);
      return var9.r(var10, var11, var12);
   }

   private static t[] p(wa.v var0, int var1, wa.v var2, int var3, wa.v var4, int var5, wa.v var6, int var7, net.n9.v[] var8, int var9, t var10, _c var11) {
      t var12 = X(var8[var1], var0, var9, var10, var11);
      t var13 = X(var8[var3], var2, var9, var10, var11);
      t var14 = X(var8[var5], var4, var9, var10, var11);
      t var15 = X(var8[var7], var6, var9, var10, var11);
      return var11.O(var12, var13, var14, var15);
   }

   private static t X(net.n9.v var0, wa.v var1, int var2, t var3, _c var4) {
      switch(null.o[var1.ordinal()]) {
      case 1:
         return f(var0, var1, 0, 0, 16, 8, var2, var3, var4);
      case 2:
         return f(var0, var1, 8, 0, 16, 8, var2, var3, var4);
      case 3:
         return f(var0, var1, 8, 0, 16, 16, var2, var3, var4);
      case 4:
         return f(var0, var1, 8, 8, 16, 16, var2, var3, var4);
      case 5:
         return f(var0, var1, 0, 8, 16, 16, var2, var3, var4);
      case 6:
         return f(var0, var1, 0, 8, 8, 16, var2, var3, var4);
      case 7:
         return f(var0, var1, 0, 0, 8, 16, var2, var3, var4);
      case 8:
         return f(var0, var1, 0, 0, 8, 8, var2, var3, var4);
      default:
         return var3;
      }
   }

   private static t f(net.n9.v var0, wa.v var1, int var2, int var3, int var4, int var5, int var6, t var7, _c var8) {
      Map[][] var9 = bh.D();
      return var7;
   }

   private static t Q(t var0, net.n9.v var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = (int[])var0.I().clone();
      net.n9.v var8 = var0.t();
      int var9 = 0;

      while(true) {
         k(var7, var9, var8, var1, var2, var3, var4, var5, var6);
         ++var9;
      }
   }

   private static void k(int[] var0, int var1, net.n9.v var2, net.n9.v var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var0.length / 4;
      int var10 = var9 * var1;
      float var11 = Float.intBitsToFloat(var0[var10 + 4]);
      float var12 = Float.intBitsToFloat(var0[var10 + 4 + 1]);
      double var13 = var2.O(var11);
      double var15 = var2.p(var12);
      float var17 = Float.intBitsToFloat(var0[var10 + 0]);
      float var18 = Float.intBitsToFloat(var0[var10 + 1]);
      float var19 = Float.intBitsToFloat(var0[var10 + 2]);
      float var20;
      float var21;
      switch(var4) {
      case 0:
         var20 = var17;
         var21 = 1.0F - var19;
         break;
      case 1:
         var20 = var17;
         var21 = var19;
         break;
      case 2:
         var20 = 1.0F - var17;
         var21 = 1.0F - var18;
         break;
      case 3:
         var20 = var17;
         var21 = 1.0F - var18;
         break;
      case 4:
         var20 = var19;
         var21 = 1.0F - var18;
         break;
      case 5:
         var20 = 1.0F - var19;
         var21 = 1.0F - var18;
         break;
      default:
         return;
      }

      float var22 = 15.968F;
      float var23 = 15.968F;
      if(var13 < (double)var5) {
         var20 = (float)((double)var20 + ((double)var5 - var13) / (double)var22);
         var13 = (double)var5;
      }

      if(var13 > (double)var7) {
         var20 = (float)((double)var20 - (var13 - (double)var7) / (double)var22);
         var13 = (double)var7;
      }

      if(var15 < (double)var6) {
         var21 = (float)((double)var21 + ((double)var6 - var15) / (double)var23);
         var15 = (double)var6;
      }

      if(var15 > (double)var8) {
         var21 = (float)((double)var21 - (var15 - (double)var8) / (double)var23);
         var15 = (double)var8;
      }

      switch(var4) {
      case 0:
         var17 = var20;
         var19 = 1.0F - var21;
         break;
      case 1:
         var17 = var20;
         var19 = var21;
         break;
      case 2:
         var17 = 1.0F - var20;
         var18 = 1.0F - var21;
         break;
      case 3:
         var17 = var20;
         var18 = 1.0F - var21;
         break;
      case 4:
         var19 = var20;
         var18 = 1.0F - var21;
         break;
      case 5:
         var19 = 1.0F - var20;
         var18 = 1.0F - var21;
         break;
      default:
         return;
      }

      var0[var10 + 4] = Float.floatToRawIntBits(var3.W(var13));
      var0[var10 + 4 + 1] = Float.floatToRawIntBits(var3.L(var15));
      var0[var10 + 0] = Float.floatToRawIntBits(var17);
      var0[var10 + 1] = Float.floatToRawIntBits(var18);
      var0[var10 + 2] = Float.floatToRawIntBits(var19);
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static enum v {
      UP,
      UP_RIGHT,
      RIGHT,
      DOWN_RIGHT,
      DOWN,
      DOWN_LEFT,
      LEFT,
      UP_LEFT;

      public static final wa.v[] VALUES = values();
   }
}
