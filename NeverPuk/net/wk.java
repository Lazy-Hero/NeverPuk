package net;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.ig;
import net.oz;
import net.uv;
import net.xn;
import net.u.d;
import net.u.j;
import net.y.p;
import net.y8.q;
import net.y9.l;
import net.yw.n;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class wk {
   int n;
   int k;
   int f;
   int h;
   boolean V;
   boolean G;
   boolean Z;
   boolean i;
   long[] E = new long[10];
   int H = 0;

   public wk() {
      this.E[this.H] = 0L;
   }

   public static void m(p var0) {
      var0.L = new wk();
   }

   public void T(long var1) {
      ++this.H;
      this.E[this.H] = var1;
   }

   public void Z() {
      this.E[this.H] = 0L;
      --this.H;
   }

   public static void j(n var0, j var1, net.yv.o8 var2, p var3) {
      l var4 = var0.Q();
      int var5;
      int var6;
      if(var0 instanceof net.yw.l) {
         net.yw.l var7 = (net.yw.l)var0;
         var5 = var7.z();
         var6 = var7.Q();
      } else {
         var5 = l.h(var4);
         var6 = var4.d(var0);
      }

      var5 = ig.s(var5, var6);
      int var11 = var4.o(var0).ordinal();
      int var8 = ((var11 & '\uffff') << 16) + (var5 & '\uffff');
      int var9 = var6 & '\uffff';
      var3.L.T(((long)var9 << 32) + (long)var8);
   }

   public static void w(p var0) {
      var0.L.Z();
   }

   public static boolean L(boolean var0, p var1) {
      var1.L.Z();
      return var0;
   }

   public static void A(p var0) {
      wk var1 = var0.L;
      q var2 = var0.T();
      var1.n = var2.H() / 4;
      var1.V = var2.y();
      var1.G = var1.V;
      var1.Z = var2.w(0);
      var1.k = var1.V?var2.m() / 4:0;
      var1.f = var1.Z?var2.u(0) / 4:0;
      var1.h = 8;
   }

   public static void L(p var0) {
      if(var0.o == 0) {
         A(var0);
      }

   }

   public static void G(p var0) {
      wk var1 = var0.L;
      if(var1.n == 14) {
         if(var0.X == 7 && var0.o % 4 == 0) {
            var1.b(var0, var0.F() - 4 * var1.n);
         }

         long var2 = var1.E[var1.H];
         int var4 = var0.F() - 14 + 12;
         var0.D.put(var4, (int)var2);
         var0.D.put(var4 + 1, (int)(var2 >> 32));
      }

   }

   public static void S(p var0, int[] var1) {
      if(var0.o == 0) {
         A(var0);
      }

      wk var2 = var0.L;
      if(var2.n == 14) {
         long var3 = var2.E[var2.H];

         for(int var5 = 12; var5 + 1 < var1.length; var5 += 14) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }

   }

   public static void q(p var0) {
      wk var1 = var0.L;
      if(var1.n == 14 && var0.X == 7 && var0.o % 4 == 0) {
         var1.b(var0, var0.F() - 4 * var1.n);
      }

   }

   public void b(p var1, int var2) {
      FloatBuffer var4 = var1.w;
      IntBuffer var5 = var1.D;
      var1.F();
      float var7 = var4.get(var2 + 0 * this.n);
      float var8 = var4.get(var2 + 0 * this.n + 1);
      float var9 = var4.get(var2 + 0 * this.n + 2);
      float var10 = var4.get(var2 + 0 * this.n + this.f);
      float var11 = var4.get(var2 + 0 * this.n + this.f + 1);
      uv.l();
      float var12 = var4.get(var2 + 1 * this.n);
      float var13 = var4.get(var2 + 1 * this.n + 1);
      float var14 = var4.get(var2 + 1 * this.n + 2);
      float var15 = var4.get(var2 + 1 * this.n + this.f);
      float var16 = var4.get(var2 + 1 * this.n + this.f + 1);
      float var17 = var4.get(var2 + 2 * this.n);
      float var18 = var4.get(var2 + 2 * this.n + 1);
      float var19 = var4.get(var2 + 2 * this.n + 2);
      float var20 = var4.get(var2 + 2 * this.n + this.f);
      float var21 = var4.get(var2 + 2 * this.n + this.f + 1);
      float var22 = var4.get(var2 + 3 * this.n);
      float var23 = var4.get(var2 + 3 * this.n + 1);
      float var24 = var4.get(var2 + 3 * this.n + 2);
      float var25 = var4.get(var2 + 3 * this.n + this.f);
      float var26 = var4.get(var2 + 3 * this.n + this.f + 1);
      float var27 = var17 - var7;
      float var28 = var18 - var8;
      float var29 = var19 - var9;
      float var30 = var22 - var12;
      float var31 = var23 - var13;
      float var32 = var24 - var14;
      float var33 = var28 * var32 - var31 * var29;
      float var34 = var29 * var30 - var32 * var27;
      float var35 = var27 * var31 - var30 * var28;
      float var36 = var33 * var33 + var34 * var34 + var35 * var35;
      float var37 = (double)var36 != 0.0D?(float)(1.0D / Math.sqrt((double)var36)):1.0F;
      var33 = var33 * var37;
      var34 = var34 * var37;
      var35 = var35 * var37;
      var27 = var12 - var7;
      var28 = var13 - var8;
      var29 = var14 - var9;
      float var38 = var15 - var10;
      float var39 = var16 - var11;
      var30 = var17 - var7;
      var31 = var18 - var8;
      var32 = var19 - var9;
      float var40 = var20 - var10;
      float var41 = var21 - var11;
      float var42 = var38 * var41 - var40 * var39;
      float var43 = var42 != 0.0F?1.0F / var42:1.0F;
      float var44 = (var41 * var27 - var39 * var30) * var43;
      float var45 = (var41 * var28 - var39 * var31) * var43;
      float var46 = (var41 * var29 - var39 * var32) * var43;
      float var47 = (var38 * var30 - var40 * var27) * var43;
      float var48 = (var38 * var31 - var40 * var28) * var43;
      float var49 = (var38 * var32 - var40 * var29) * var43;
      var36 = var44 * var44 + var45 * var45 + var46 * var46;
      var37 = (double)var36 != 0.0D?(float)(1.0D / Math.sqrt((double)var36)):1.0F;
      var44 = var44 * var37;
      var45 = var45 * var37;
      var46 = var46 * var37;
      var36 = var47 * var47 + var48 * var48 + var49 * var49;
      var37 = (double)var36 != 0.0D?(float)(1.0D / Math.sqrt((double)var36)):1.0F;
      var47 = var47 * var37;
      var48 = var48 * var37;
      var49 = var49 * var37;
      float var50 = var35 * var45 - var34 * var46;
      float var51 = var33 * var46 - var35 * var44;
      float var52 = var34 * var44 - var33 * var45;
      float var53 = var47 * var50 + var48 * var51 + var49 * var52 < 0.0F?-1.0F:1.0F;
      int var54 = (int)(var33 * 127.0F) & 255;
      int var55 = (int)(var34 * 127.0F) & 255;
      int var56 = (int)(var35 * 127.0F) & 255;
      int var57 = (var56 << 16) + (var55 << 8) + var54;
      var5.put(var2 + 0 * this.n + this.k, var57);
      var5.put(var2 + 1 * this.n + this.k, var57);
      var5.put(var2 + 2 * this.n + this.k, var57);
      var5.put(var2 + 3 * this.n + this.k, var57);
      int var58 = ((int)(var44 * 32767.0F) & '\uffff') + (((int)(var45 * 32767.0F) & '\uffff') << 16);
      int var59 = ((int)(var46 * 32767.0F) & '\uffff') + (((int)(var53 * 32767.0F) & '\uffff') << 16);
      var5.put(var2 + 0 * this.n + 10, var58);
      var5.put(var2 + 0 * this.n + 10 + 1, var59);
      var5.put(var2 + 1 * this.n + 10, var58);
      var5.put(var2 + 1 * this.n + 10 + 1, var59);
      var5.put(var2 + 2 * this.n + 10, var58);
      var5.put(var2 + 2 * this.n + 10 + 1, var59);
      var5.put(var2 + 3 * this.n + 10, var58);
      var5.put(var2 + 3 * this.n + 10 + 1, var59);
      float var60 = (var10 + var15 + var20 + var25) / 4.0F;
      float var61 = (var11 + var16 + var21 + var26) / 4.0F;
      var4.put(var2 + 0 * this.n + 8, var60);
      var4.put(var2 + 0 * this.n + 8 + 1, var61);
      var4.put(var2 + 1 * this.n + 8, var60);
      var4.put(var2 + 1 * this.n + 8 + 1, var61);
      var4.put(var2 + 2 * this.n + 8, var60);
      var4.put(var2 + 2 * this.n + 8 + 1, var61);
      var4.put(var2 + 3 * this.n + 8, var60);
      var4.put(var2 + 3 * this.n + 8 + 1, var61);
      if(d.y() == null) {
         uv.t(new int[1]);
      }

   }

   public static void Q(p var0) {
      if(var0.T().y() && var0.X == 7 && var0.o % 4 == 0) {
         wk var1 = var0.L;
         A(var0);
         int var2 = var0.o * var1.n;

         for(int var3 = 0; var3 < var2; var3 += var1.n * 4) {
            var1.b(var0, var3);
         }
      }

   }

   public static void h(int var0, int var1, int var2, p var3) {
      q var4 = var3.T();
      int var5 = var4.H();
      if(var5 == 56) {
         ByteBuffer var6 = var3.E();
         var6.position(32);
         GL20.glVertexAttribPointer(oz.A, 2, 5126, false, var5, var6);
         var6.position(40);
         GL20.glVertexAttribPointer(oz.e4, 4, 5122, false, var5, var6);
         var6.position(48);
         GL20.glVertexAttribPointer(oz.K6, 3, 5122, false, var5, var6);
         var6.position(0);
         GL20.glEnableVertexAttribArray(oz.A);
         GL20.glEnableVertexAttribArray(oz.e4);
         GL20.glEnableVertexAttribArray(oz.K6);
         GL11.glDrawArrays(var0, var1, var2);
         GL20.glDisableVertexAttribArray(oz.A);
         GL20.glDisableVertexAttribArray(oz.e4);
         GL20.glDisableVertexAttribArray(oz.K6);
      } else {
         GL11.glDrawArrays(var0, var1, var2);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
