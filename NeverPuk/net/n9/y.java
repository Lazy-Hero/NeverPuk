package net.n9;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import net._5;
import net.i6;
import net.c9.q;
import net.n9.e;
import net.n9.x;
import net.y.d;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y {
   private static final Logger Z = LogManager.getLogger();
   private static final IntBuffer s = net.y.m.z(4194304);
   public static final x J = new x(16, 16);
   public static final int[] P = J.X();
   private static final float[] C;
   private static final int[] F;

   private static float G(int var0) {
      return C[var0 & 255];
   }

   public static int v() {
      return d.g();
   }

   public static void R(int var0) {
      d.a(var0);
   }

   public static int s(int var0, BufferedImage var1) {
      return c(var0, var1, false, false);
   }

   public static void c(int var0, int[] var1, int var2, int var3) {
      n(var0);
      k(0, var1, var2, var3, 0, 0, false, false, false);
   }

   public static int[][] a(int var0, int var1, int[][] var2) {
      e.d();
      int[][] var4 = new int[var0 + 1][];
      var4[0] = var2[0];
      boolean var5 = false;
      int var6 = 0;
      if(var6 < var2.length) {
         if(var2[0][var6] >> 24 == 0) {
            var5 = true;
         }

         ++var6;
      }

      var6 = 1;
      if(var6 <= var0) {
         if(var2[var6] != null) {
            var4[var6] = var2[var6];
         }

         int[] var7 = var4[var6 - 1];
         int[] var8 = new int[var7.length >> 2];
         int var9 = var1 >> var6;
         int var10 = var8.length / var9;
         int var11 = var9 << 1;
         int var12 = 0;
         if(var12 < var9) {
            int var13 = 0;
            if(var13 < var10) {
               int var14 = 2 * (var12 + var13 * var11);
               var8[var12 + var13 * var9] = g(var7[var14 + 0], var7[var14 + 1], var7[var14 + 0 + var11], var7[var14 + 1 + var11], var5);
               ++var13;
            }

            ++var12;
         }

         var4[var6] = var8;
         ++var6;
      }

      return var4;
   }

   private static int g(int var0, int var1, int var2, int var3, boolean var4) {
      return _5.w(var0, var1, var2, var3);
   }

   private static int W(int var0, int var1, int var2, int var3, int var4) {
      float var5 = G(var0 >> var4);
      float var6 = G(var1 >> var4);
      float var7 = G(var2 >> var4);
      float var8 = G(var3 >> var4);
      float var9 = (float)((double)((float)Math.pow((double)(var5 + var6 + var7 + var8) * 0.25D, 0.45454545454545453D)));
      return (int)((double)var9 * 255.0D);
   }

   public static void H(int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      for(int var7 = 0; var7 < var0.length; ++var7) {
         int[] var8 = var0[var7];
         k(var7, var8, var1 >> var7, var2 >> var7, var3 >> var7, var4 >> var7, var5, var6, var0.length > 1);
      }

   }

   private static void k(int var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
      int var9 = 4194304 / var2;
      z(var6, var8);
      v(var7);

      int var10;
      for(int var11 = 0; var11 < var2 * var3; var11 += var2 * var10) {
         int var12 = var11 / var2;
         var10 = Math.min(var9, var3 - var12);
         int var13 = var2 * var10;
         g(var1, var11, var13);
         d.I(3553, var0, var4, var5 + var12, var2, var10, '胡', '荧', s);
      }

   }

   public static int c(int var0, BufferedImage var1, boolean var2, boolean var3) {
      i(var0, var1.getWidth(), var1.getHeight());
      return b(var0, var1, 0, 0, var2, var3);
   }

   public static void i(int var0, int var1, int var2) {
      I(var0, 0, var1, var2);
   }

   public static void I(int var0, int var1, int var2, int var3) {
      Class var4 = y.class;
      if(i6.M6.l()) {
         var4 = i6.M6.J();
      }

      R(var0);
      n(var0);
      d.t(3553, '脽', var1);
      d.t(3553, '脺', 0);
      d.t(3553, '脻', var1);
      d.w(3553, '蔁', 0.0F);

      for(int var5 = 0; var5 <= var1; ++var5) {
         d.U(3553, var5, 6408, var2 >> var5, var3 >> var5, 0, '胡', '荧', (IntBuffer)null);
      }

   }

   public static int b(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5) {
      n(var0);
      c(var1, var2, var3, var4, var5);
      return var0;
   }

   private static void c(BufferedImage var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0.getWidth();
      int var6 = var0.getHeight();
      int var7 = 4194304 / var5;
      int[] var8 = new int[var7 * var5];
      X(var3);
      v(var4);

      for(int var9 = 0; var9 < var5 * var6; var9 += var5 * var7) {
         int var10 = var9 / var5;
         int var11 = Math.min(var7, var6 - var10);
         int var12 = var5 * var11;
         var0.getRGB(0, var10, var5, var11, var8, 0, var5);
         a(var8, var12);
         d.I(3553, 0, var1, var2 + var10, var5, var11, '胡', '荧', s);
      }

   }

   public static void v(boolean var0) {
      d.t(3553, 10242, '脯');
      d.t(3553, 10243, '脯');
   }

   private static void X(boolean var0) {
      z(var0, false);
   }

   public static void z(boolean var0, boolean var1) {
      d.t(3553, 10241, 9987);
      d.t(3553, 10240, 9729);
   }

   private static void a(int[] var0, int var1) {
      g(var0, 0, var1);
   }

   private static void g(int[] var0, int var1, int var2) {
      int[] var3 = var0;
      if(net.nn.j.b().T.iW) {
         var3 = s(var0);
      }

      s.clear();
      s.put(var3, var1, var2);
      s.position(0).limit(var2);
   }

   static void n(int var0) {
      d.z(var0);
   }

   public static int[] M(net.c9.p var0, m_ var1) throws IOException {
      q var2 = null;
      var2 = var0.A(var1);
      BufferedImage var4 = T(var2.k());
      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      int[] var7 = new int[var5 * var6];
      var4.getRGB(0, 0, var5, var6, var7, 0, var5);
      IOUtils.closeQuietly(var2);
      return var7;
   }

   public static BufferedImage T(InputStream var0) throws IOException {
      return null;
   }

   public static int[] s(int[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = I(var0[var2]);
      }

      return var1;
   }

   public static int I(int var0) {
      int var1 = var0 >> 24 & 255;
      int var2 = var0 >> 16 & 255;
      int var3 = var0 >> 8 & 255;
      int var4 = var0 & 255;
      int var5 = (var2 * 30 + var3 * 59 + var4 * 11) / 100;
      int var6 = (var2 * 30 + var3 * 70) / 100;
      int var7 = (var2 * 30 + var4 * 70) / 100;
      return var1 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   public static void E(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      int var4 = var2 / 2;

      for(int var5 = 0; var5 < var4; ++var5) {
         System.arraycopy(var0, var5 * var1, var3, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var5) * var1, var0, var5 * var1, var1);
         System.arraycopy(var3, 0, var0, (var2 - 1 - var5) * var1, var1);
      }

   }

   static {
      int var10000 = -16777216;
      var10000 = -524040;
      int[] var2 = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
      int[] var3 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
      int var4 = var2.length;
      int var5 = 0;

      while(true) {
         System.arraycopy(var2, 0, P, 16 * var5, var4);
         System.arraycopy(var3, 0, P, 16 * var5 + var4, var4);
         ++var5;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
