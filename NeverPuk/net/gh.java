package net;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net._8;
import net.oz;
import net.uv;
import net.wr;
import net.z9;
import net.c9.p;
import net.c9.q;
import net.n9.b;
import net.n9.e;
import net.n9.f;
import net.n9.l;
import net.n9.m;
import net.n9.t;
import net.n9.x;
import net.n9.y;
import net.nn.j;
import net.y.d;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class gh {
   public static final int y = 1048576;
   public static ByteBuffer U = BufferUtils.createByteBuffer(4194304);
   public static IntBuffer C = U.asIntBuffer();
   public static int[] R = new int[1048576];
   public static final int Y = 0;
   public static final int a = -8421377;
   public static final int k = 0;
   public static Map E = new HashMap();
   public static b K = null;
   public static net.n9.v u = null;
   public static _8 o = null;
   public static _8 s = null;
   public static int Z = 0;
   public static String w = null;
   public static p L = null;
   static net.yz.m_ f = null;
   static int V = 0;

   public static IntBuffer W(int var0) {
      if(C.capacity() < var0) {
         int var1 = J(var0);
         U = BufferUtils.createByteBuffer(var1 * 4);
         C = U.asIntBuffer();
      }

      return C;
   }

   public static int[] S(int var0) {
      if(R == null) {
         R = new int[1048576];
      }

      if(R.length < var0) {
         R = new int[J(var0)];
      }

      return R;
   }

   public static int J(int var0) {
      int var1 = var0 - 1;
      var1 = var1 | var1 >> 1;
      var1 = var1 | var1 >> 2;
      var1 = var1 | var1 >> 4;
      var1 = var1 | var1 >> 8;
      var1 = var1 | var1 >> 16;
      return var1 + 1;
   }

   public static int b(int var0) {
      int var1 = 0;
      if((var0 & -65536) != 0) {
         var1 += 16;
         var0 >>= 16;
      }

      if((var0 & '\uff00') != 0) {
         var1 += 8;
         var0 >>= 8;
      }

      if((var0 & 240) != 0) {
         var1 += 4;
         var0 >>= 4;
      }

      if((var0 & 6) != 0) {
         var1 += 2;
         var0 >>= 2;
      }

      if((var0 & 2) != 0) {
         ++var1;
      }

      return var1;
   }

   public static IntBuffer L(int var0, int var1) {
      S(var0);
      W(var0);
      Arrays.fill(R, 0, var0, var1);
      C.put(R, 0, var0);
      return C;
   }

   public static int[] Z(int var0) {
      int[] var1 = new int[var0 * 3];
      Arrays.fill(var1, 0, var0, 0);
      Arrays.fill(var1, var0, var0 * 2, -8421377);
      Arrays.fill(var1, var0 * 2, var0 * 3, 0);
      return var1;
   }

   public static int[] X(int var0, int var1) {
      int[] var2 = new int[var0 * 3];
      Arrays.fill(var2, 0, var0, var1);
      Arrays.fill(var2, var0, var0 * 2, -8421377);
      Arrays.fill(var2, var0 * 2, var0 * 3, 0);
      return var2;
   }

   public static _8 i(f var0) {
      _8 var1 = var0.J;
      int var2 = var0.L();
      var1 = (_8)E.get(Integer.valueOf(var2));
      var1 = new _8(var2, GL11.glGenTextures(), GL11.glGenTextures());
      E.put(Integer.valueOf(var2), var1);
      var0.J = var1;
      return var1;
   }

   public static void y(f var0, int var1) {
      _8 var2 = var0.J;
      var0.J = null;
      E.remove(Integer.valueOf(var2.t));
      d.a(var2.y);
      d.a(var2.K);
      if(var2.t != var1) {
         wr.t("Error : MultiTexID.base mismatch: " + var2.t + ", texid: " + var1);
         d.a(var2.t);
      }

   }

   public static void f(int var0, int var1) {
      if(oz.ey && d.k() == '蓀') {
         d.t('蓂');
         d.z(var0);
         d.t('蓃');
         d.z(var1);
         d.t('蓀');
      }

   }

   public static void J(_8 var0) {
      f(var0.y, var0.K);
   }

   public static void J(int var0, int var1, int var2) {
      if(oz.ey && d.k() == '蓀') {
         d.t('蓂');
         d.z(var1);
         d.t('蓃');
         d.z(var2);
         d.t('蓀');
      }

      d.z(var0);
   }

   public static void d(_8 var0) {
      s = var0;
      if(oz.ey && d.k() == '蓀') {
         if(oz.ek) {
            d.t('蓂');
            d.z(var0.y);
         }

         if(oz.H3) {
            d.t('蓃');
            d.z(var0.K);
         }

         d.t('蓀');
      }

      d.z(var0.t);
   }

   public static void A(t var0) {
      var0.L();
      if(var0 instanceof b) {
         oz.EX = ((b)var0).W;
         oz.es = ((b)var0).Y;
         d(var0.t());
      } else {
         oz.EX = 0;
         oz.es = 0;
         d(var0.t());
      }

   }

   public static void U(e var0, net.yz.m_ var1) {
      b var2 = (b)var0.m(var1);
      oz.EX = var2.W;
      oz.es = var2.Y;
      d(o = var2.t());
   }

   public static void O(int var0) {
      _8 var1 = (_8)E.get(Integer.valueOf(var0));
      d(var1);
   }

   public static void W(int var0, int var1, int var2, x var3) {
      _8 var4 = var3.t();
      int[] var5 = var3.X();
      int var6 = var1 * var2;
      Arrays.fill(var5, var6, var6 * 2, -8421377);
      Arrays.fill(var5, var6 * 2, var6 * 3, 0);
      y.i(var4.t, var1, var2);
      y.z(false, false);
      y.v(false);
      y.i(var4.y, var1, var2);
      y.z(false, false);
      y.v(false);
      y.i(var4.K, var1, var2);
      y.z(false, false);
      y.v(false);
      d.z(var4.t);
   }

   public static void J(int var0, int[] var1, int var2, int var3, x var4) {
      _8 var5 = var4.t();
      d.z(var5.t);
      p(var1, var2, var3, 0, 0, 0);
      d.z(var5.y);
      p(var1, var2, var3, 0, 0, 1);
      d.z(var5.K);
      p(var1, var2, var3, 0, 0, 2);
      d.z(var5.t);
   }

   public static void p(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = W(var6);
      var7.clear();
      int var8 = var5 * var6;
      if(var0.length >= var8 + var6) {
         var7.put(var0, var8, var6).position(0).limit(var6);
         GL11.glTexSubImage2D(3553, 0, var3, var4, var1, var2, '胡', '荧', var7);
         var7.clear();
      }

   }

   public static t X() {
      x var0 = new x(1, 1);
      var0.X()[0] = -1;
      var0.g();
      return var0;
   }

   public static void a(int var0, int var1, int var2, int var3, l var4, b var5) {
      wr.H("allocateTextureMap " + var1 + " " + var2 + " " + var3 + " ");
      K = var5;
      var5.W = var2;
      var5.Y = var3;
      _8 var6 = i(var5);
      o = var6;
      y.I(var6.t, var1, var2, var3);
      if(oz.ek) {
         y.I(var6.y, var1, var2, var3);
      }

      if(oz.H3) {
         y.I(var6.K, var1, var2, var3);
      }

      d.z(var0);
   }

   public static net.n9.v L(net.n9.v var0) {
      u = var0;
      return var0;
   }

   public static String T(String var0) {
      w = var0;
      return var0;
   }

   public static void B(int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      y.H(var0, var1, var2, var3, var4, var5, var6);
      boolean var7 = false;
      if(oz.ek) {
         int[][] var8 = M(w + "_n", var1, var2, var0.length, var7, -8421377);
         d.z(o.y);
         y.H(var8, var1, var2, var3, var4, var5, var6);
      }

      if(oz.H3) {
         int[][] var9 = M(w + "_s", var1, var2, var0.length, var7, 0);
         d.z(o.K);
         y.H(var9, var1, var2, var3, var4, var5, var6);
      }

      d.z(o.t);
   }

   public static int[][] M(String var0, int var1, int var2, int var3, boolean var4, int var5) {
      int[][] var6 = new int[var3][];
      int[] var7;
      var6[0] = var7 = new int[var1 * var2];
      boolean var8 = false;
      BufferedImage var9 = G(K.l(new net.yz.m_(var0)));
      int var10 = var9.getWidth();
      var9.getHeight();
      if(var10 + 16 == var1) {
         var8 = true;
         var9.getRGB(0, 0, var10, var10, var7, 0, var10);
      }

      Arrays.fill(var7, var5);
      d.z(o.K);
      var6 = i(var6.length - 1, var1, var6);
      return var6;
   }

   public static BufferedImage G(net.yz.m_ var0) {
      if(!z9.Y(var0)) {
         return null;
      } else {
         InputStream var1 = z9.I(var0);
         return null;
      }
   }

   public static int[][] i(int var0, int var1, int[][] var2) {
      for(int var3 = 1; var3 <= var0; ++var3) {
         if(var2[var3] == null) {
            int var4 = var1 >> var3;
            int var5 = var4 * 2;
            int[] var6 = var2[var3 - 1];
            int[] var7 = var2[var3] = new int[var4 * var4];

            for(int var8 = 0; var8 < var4; ++var8) {
               for(int var9 = 0; var9 < var4; ++var9) {
                  int var10 = var8 * 2 * var5 + var9 * 2;
                  var7[var8 * var4 + var9] = p(var6[var10], var6[var10 + 1], var6[var10 + var5], var6[var10 + var5 + 1]);
               }
            }
         }
      }

      return var2;
   }

   public static void Z(int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      y.H(var0, var1, var2, var3, var4, var5, var6);
      if(oz.ek || oz.H3) {
         if(oz.ek) {
            d.z(o.y);
            S(var0, var1, var2, var3, var4, 1);
         }

         if(oz.H3) {
            d.z(o.K);
            S(var0, var1, var2, var3, var4, 2);
         }

         d.z(o.t);
      }

   }

   public static void S(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 * var2;
      IntBuffer var7 = W(var6);
      int var8 = var0.length;
      int var9 = 0;
      int var10 = var1;
      int var11 = var2;
      int var12 = var3;

      for(int var13 = var4; var9 < var8; ++var9) {
         int var14 = var10 * var11;
         int[] var15 = var0[var9];
         var7.clear();
         if(var15.length >= var14 * (var5 + 1)) {
            var7.put(var15, var14 * var5, var14).position(0).limit(var14);
            GL11.glTexSubImage2D(3553, var9, var12, var13, var10, var11, '胡', '荧', var7);
         }

         var10 >>= 1;
         var11 >>= 1;
         var12 >>= 1;
         var13 >>= 1;
      }

      var7.clear();
   }

   public static int E(int var0, int var1, int var2, int var3) {
      int var4 = var0 >>> 24 & 255;
      int var5 = var1 >>> 24 & 255;
      int var6 = var2 >>> 24 & 255;
      int var7 = var3 >>> 24 & 255;
      int var8 = var4 + var5 + var6 + var7;
      int var9 = (var8 + 2) / 4;
      int var11 = (var8 + 1) / 2;
      int var12 = var9 << 24 | ((var0 >>> 16 & 255) * var4 + (var1 >>> 16 & 255) * var5 + (var2 >>> 16 & 255) * var6 + (var3 >>> 16 & 255) * var7 + var11) / var8 << 16 | ((var0 >>> 8 & 255) * var4 + (var1 >>> 8 & 255) * var5 + (var2 >>> 8 & 255) * var6 + (var3 >>> 8 & 255) * var7 + var11) / var8 << 8 | ((var0 >>> 0 & 255) * var4 + (var1 >>> 0 & 255) * var5 + (var2 >>> 0 & 255) * var6 + (var3 >>> 0 & 255) * var7 + var11) / var8 << 0;
      return var12;
   }

   public static int p(int var0, int var1, int var2, int var3) {
      int var4 = ((var0 >>> 24 & 255) + (var1 >>> 24 & 255) + (var2 >>> 24 & 255) + (var3 >>> 24 & 255) + 2) / 4 << 24 | ((var0 >>> 16 & 255) + (var1 >>> 16 & 255) + (var2 >>> 16 & 255) + (var3 >>> 16 & 255) + 2) / 4 << 16 | ((var0 >>> 8 & 255) + (var1 >>> 8 & 255) + (var2 >>> 8 & 255) + (var3 >>> 8 & 255) + 2) / 4 << 8 | ((var0 >>> 0 & 255) + (var1 >>> 0 & 255) + (var2 >>> 0 & 255) + (var3 >>> 0 & 255) + 2) / 4 << 0;
      return var4;
   }

   public static void q(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for(var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for(int var11 = 0; var11 < var9; ++var11) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for(int var14 = 0; var14 < var8; ++var14) {
               var0[var12 + var14] = E(var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]);
            }
         }

         ++var10;
         var5 = var8;
         var6 = var9;
      }

      while(true) {
         --var10;
         var5 = var2 >> var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for(int var20 = 0; var20 < var6; ++var20) {
            for(int var21 = 0; var21 < var5; ++var21) {
               if(var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               ++var19;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static void G(int[] var0, int var1, int var2, int var3) {
      Math.min(var2, var3);
      int var4 = var1;
      int var5 = var2;
      int var6 = var3;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      int var10;
      for(var10 = 0; var5 > 1 && var6 > 1; var4 = var7) {
         var7 = var4 + var5 * var6;
         var8 = var5 / 2;
         var9 = var6 / 2;

         for(int var11 = 0; var11 < var9; ++var11) {
            int var12 = var7 + var11 * var8;
            int var13 = var4 + var11 * 2 * var5;

            for(int var14 = 0; var14 < var8; ++var14) {
               var0[var12 + var14] = p(var0[var13 + var14 * 2], var0[var13 + var14 * 2 + 1], var0[var13 + var5 + var14 * 2], var0[var13 + var5 + var14 * 2 + 1]);
            }
         }

         ++var10;
         var5 = var8;
         var6 = var9;
      }

      while(true) {
         --var10;
         var5 = var2 >> var10;
         var6 = var3 >> var10;
         var4 = var7 - var5 * var6;
         int var19 = var4;

         for(int var20 = 0; var20 < var6; ++var20) {
            for(int var21 = 0; var21 < var5; ++var21) {
               if(var0[var19] == 0) {
                  var0[var19] = var0[var7 + var20 / 2 * var8 + var21 / 2] & 16777215;
               }

               ++var19;
            }
         }

         var7 = var4;
         var8 = var5;
      }
   }

   public static boolean Z(int[] var0, int var1, int var2) {
      int var3 = var1 * var2;
      if(var0[0] >>> 24 == 255 && var0[var3 - 1] == 0) {
         return true;
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var0[var4] >>> 24;
            if(var5 != 255) {
               return true;
            }
         }

         return false;
      }
   }

   public static void p(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = var1;
      int var7 = var2;
      int var8 = var3;
      int var9 = var4;

      while(true) {
         GL11.glCopyTexSubImage2D(3553, var5, var8, var9, 0, 0, var6, var7);
         ++var5;
         var6 /= 2;
         var7 /= 2;
         var8 /= 2;
         var9 /= 2;
      }
   }

   public static void F(_8 var0, int[] var1, int var2, int var3, boolean var4, boolean var5) {
      int[] var6 = uv.l();
      int var7 = var4?9729:9728;
      int var8 = var5?10496:10497;
      int var9 = var2 * var3;
      IntBuffer var10 = W(var9);
      var10.clear();
      var10.put(var1, 0, var9).position(0).limit(var9);
      d.z(var0.t);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, '胡', '荧', var10);
      GL11.glTexParameteri(3553, 10241, var7);
      GL11.glTexParameteri(3553, 10240, var7);
      GL11.glTexParameteri(3553, 10242, var8);
      GL11.glTexParameteri(3553, 10243, var8);
      var10.put(var1, var9, var9).position(0).limit(var9);
      d.z(var0.y);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, '胡', '荧', var10);
      GL11.glTexParameteri(3553, 10241, var7);
      GL11.glTexParameteri(3553, 10240, var7);
      GL11.glTexParameteri(3553, 10242, var8);
      GL11.glTexParameteri(3553, 10243, var8);
      var10.put(var1, var9 * 2, var9).position(0).limit(var9);
      d.z(var0.K);
      GL11.glTexImage2D(3553, 0, 6408, var2, var3, 0, '胡', '荧', var10);
      GL11.glTexParameteri(3553, 10241, var7);
      GL11.glTexParameteri(3553, 10240, var7);
      GL11.glTexParameteri(3553, 10242, var8);
      GL11.glTexParameteri(3553, 10243, var8);
      d.z(var0.t);
   }

   public static void y(_8 var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      int var9 = var2 * var3;
      IntBuffer var10 = W(var9);
      var10.clear();
      var10.put(var1, 0, var9);
      var10.position(0).limit(var9);
      uv.l();
      d.z(var0.t);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, '胡', '荧', var10);
      if(var1.length == var9 * 3) {
         var10.clear();
         var10.put(var1, var9, var9).position(0);
         var10.position(0).limit(var9);
      }

      d.z(var0.y);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, '胡', '荧', var10);
      if(var1.length == var9 * 3) {
         var10.clear();
         var10.put(var1, var9 * 2, var9);
         var10.position(0).limit(var9);
      }

      d.z(var0.K);
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      GL11.glTexSubImage2D(3553, 0, var4, var5, var2, var3, '胡', '荧', var10);
      d.t('蓀');
   }

   public static net.yz.m_ U(net.yz.m_ var0, String var1) {
      String var2 = var0.v();
      String[] var3 = var2.split(".png");
      String var4 = var3[0];
      return new net.yz.m_(var0.A(), var4 + "_" + var1 + ".png");
   }

   public static void b(p var0, net.yz.m_ var1, int var2, int var3, int[] var4) {
      if(oz.ek) {
         h(var0, U(var1, "n"), var2, var3, var4, var2 * var3, -8421377);
      }

      if(oz.H3) {
         h(var0, U(var1, "s"), var2, var3, var4, var2 * var3 * 2, 0);
      }

   }

   public static void h(p var0, net.yz.m_ var1, int var2, int var3, int[] var4, int var5, int var6) {
      boolean var7 = false;
      q var8 = var0.A(var1);
      BufferedImage var9 = ImageIO.read(var8.k());
      if(var9.getWidth() == var2 && var9.getHeight() == var3) {
         var9.getRGB(0, 0, var2, var3, var4, var5, var2);
         var7 = true;
      }

      Arrays.fill(var4, var5, var5 + var2 * var3, var6);
   }

   public static int G(int var0, BufferedImage var1, boolean var2, boolean var3, p var4, net.yz.m_ var5, _8 var6) {
      int var7 = var1.getWidth();
      int var8 = var1.getHeight();
      int var9 = var7 * var8;
      int[] var10 = S(var9 * 3);
      var1.getRGB(0, 0, var7, var8, var10, 0, var7);
      b(var4, var5, var7, var8, var10);
      F(var6, var10, var7, var8, var2, var3);
      return var0;
   }

   public static void a(int[] var0, int var1, int var2, int var3) {
   }

   public static int D(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      return ((var0 >>> 24 & 255) * var2 + (var1 >>> 24 & 255) * var3) / 255 << 24 | ((var0 >>> 16 & 255) * var2 + (var1 >>> 16 & 255) * var3) / 255 << 16 | ((var0 >>> 8 & 255) * var2 + (var1 >>> 8 & 255) * var3) / 255 << 8 | ((var0 >>> 0 & 255) * var2 + (var1 >>> 0 & 255) * var3) / 255 << 0;
   }

   public static void X(m var0, p var1, List var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int[] var6 = null;

      for(Object var8 : var2) {
         net.yz.m_ var9 = new net.yz.m_((String)var8);
         InputStream var10 = var1.A(var9).k();
         BufferedImage var11 = ImageIO.read(var10);
         var3 = var11.getWidth();
         var4 = var11.getHeight();
         var5 = var3 * var4;
         var6 = X(var5, 0);
         int[] var12 = S(var5 * 3);
         var11.getRGB(0, 0, var3, var4, var12, 0, var3);
         b(var1, var9, var3, var4, var12);

         for(int var13 = 0; var13 < var5; ++var13) {
            int var14 = var12[var13] >>> 24 & 255;
            var6[var5 * 0 + var13] = D(var12[var5 * 0 + var13], var6[var5 * 0 + var13], var14);
            var6[var5 * 1 + var13] = D(var12[var5 * 1 + var13], var6[var5 * 1 + var13], var14);
            var6[var5 * 2 + var13] = D(var12[var5 * 2 + var13], var6[var5 * 2 + var13], var14);
         }
      }

      F(var0.t(), var6, var3, var4, false, false);
   }

   static void o() {
      e var0 = j.b().n();
      t var1 = var0.m(b.N);
      _8 var2 = var1.t();
      d.z(var2.t);
      GL11.glTexParameteri(3553, 10241, oz.KN[oz.EG]);
      GL11.glTexParameteri(3553, 10240, oz.eS[oz.Kt]);
      d.z(var2.y);
      GL11.glTexParameteri(3553, 10241, oz.KN[oz._j]);
      GL11.glTexParameteri(3553, 10240, oz.eS[oz.HN]);
      d.z(var2.K);
      GL11.glTexParameteri(3553, 10241, oz.KN[oz.Ev]);
      GL11.glTexParameteri(3553, 10240, oz.eS[oz.ev]);
      d.z(0);
   }

   public static q c(p var0, net.yz.m_ var1) throws IOException {
      L = var0;
      f = var1;
      return var0.A(var1);
   }

   public static int[] B(BufferedImage var0, int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      V = var3 * var4;
      var0.getRGB(var1, var2, var3, var4, var5, var6, var7);
      b(L, f, var3, var4, var5);
      return var5;
   }

   public static int[][] b(int[][] var0, int var1, int var2, int var3) {
      int var4 = var0.length;
      int[][] var5 = new int[var4][];

      for(int var6 = 0; var6 < var4; ++var6) {
         int[] var7 = var0[var6];
         int var8 = (var1 >> var6) * (var2 >> var6);
         int[] var9 = new int[var8 * 3];
         var5[var6] = var9;
         int var10 = var7.length / 3;
         int var11 = var8 * var3;
         int var12 = 0;
         System.arraycopy(var7, var11, var9, var12, var8);
         var11 = var11 + var10;
         var12 = var12 + var8;
         System.arraycopy(var7, var11, var9, var12, var8);
         var11 = var11 + var10;
         var12 = var12 + var8;
         System.arraycopy(var7, var11, var9, var12, var8);
      }

      return var5;
   }

   public static int[][] U(net.n9.v var0, int[][] var1, int var2, int var3) {
      boolean var10000 = true;
      return var1;
   }

   public static void u(net.n9.v var0, int[] var1) {
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
