package net;

import net.mf;
import net.xn;
import net.z9;
import net.nn.j;
import net.nr.d;
import net.y.p;
import net.y.r;
import net.y8.x;
import net.yk.t;
import net.z.tk;
import org.lwjgl.opengl.GL11;

public class u_ {
   private static j q;
   private static d G;
   private static t S;
   public static boolean p = false;
   public static u_.v H = new u_.v();
   public static u_.v a = new u_.v();
   public static u_.v I = new u_.v();
   public static u_.v C = new u_.v();
   public static u_.v M = new u_.v();
   public static u_.v W = new u_.v();
   public static u_.v R = new u_.v();
   private static final long[] i = new long[512];
   private static final long[] D = new long[512];
   private static final long[] r = new long[512];
   private static final long[] h = new long[512];
   private static final long[] k = new long[512];
   private static final long[] K = new long[512];
   private static final long[] O = new long[512];
   private static final long[] A = new long[512];
   private static final boolean[] V = new boolean[512];
   private static int e = 0;
   private static long J = -1L;
   private static long g = 0L;
   private static long Y = System.currentTimeMillis();
   private static long B = a();
   private static long E = Y;
   private static long w = B;
   private static long P = 1L;
   private static long L = 0L;
   private static int t = 0;

   public static boolean l() {
      long var0 = System.currentTimeMillis();
      long var2 = a();
      boolean var4 = false;
      if(var2 < w) {
         double var5 = (double)L / 1000000.0D;
         double var7 = (double)P / 1000.0D;
         int var9 = (int)(var5 / var7);
         t = var9;
         Y = var0;
         B = var2;
         P = 0L;
         L = 0L;
         var4 = true;
      } else {
         P = var0 - Y;
         L = var2 - B;
      }

      E = var0;
      w = var2;
      return var4;
   }

   private static long a() {
      Runtime var0 = Runtime.getRuntime();
      return var0.totalMemory() - var0.freeMemory();
   }

   public static void Q() {
      if(q == null) {
         q = j.b();
         G = q.T;
         S = q.sl;
      }

      if(G.wt && (G.wN || G.j)) {
         p = true;
         long var0 = System.nanoTime();
         if(J == -1L) {
            J = var0;
         } else {
            int var2 = e & i.length - 1;
            ++e;
            boolean var3 = l();
            i[var2] = var0 - J - g;
            D[var2] = H.H;
            r[var2] = a.H;
            h[var2] = I.H;
            k[var2] = C.H;
            K[var2] = M.H;
            O[var2] = W.H;
            A[var2] = R.H;
            V[var2] = var3;
            H.H();
            a.H();
            M.H();
            C.H();
            I.H();
            W.H();
            R.H();
            J = System.nanoTime();
         }
      } else {
         p = false;
         J = -1L;
      }

   }

   public static void L(net.z.t var0) {
      String var1 = mf.O();
      if(G != null && (G.wN || G.j)) {
         long var2 = System.nanoTime();
         net.y.d.y(256);
         net.y.d.G(5889);
         net.y.d.c();
         net.y.d.G();
         net.y.d.s();
         net.y.d.g(0.0D, (double)q.sB, (double)q.st, 0.0D, 1000.0D, 3000.0D);
         net.y.d.G(5888);
         net.y.d.c();
         net.y.d.s();
         net.y.d.O(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         net.y.d.w();
         r var4 = r.f();
         p var5 = var4.k();
         var5.m(1, x.F);
         int var6 = 0;
         if(var6 < i.length) {
            int var7 = (var6 - e & i.length - 1) * 100 / i.length;
            var7 = var7 + 155;
            float var8 = (float)q.st;
            long var9 = 0L;
            if(V[var6]) {
               O(var6, i[var6], var7, var7 / 2, 0, var8, var5);
            }

            O(var6, i[var6], var7, var7, var7, var8, var5);
            var8 = var8 - (float)O(var6, A[var6], var7 / 2, var7 / 2, var7 / 2, var8, var5);
            var8 = var8 - (float)O(var6, O[var6], 0, var7, 0, var8, var5);
            var8 = var8 - (float)O(var6, K[var6], var7, var7, 0, var8, var5);
            var8 = var8 - (float)O(var6, k[var6], var7, 0, 0, var8, var5);
            var8 = var8 - (float)O(var6, h[var6], var7, 0, var7, var8, var5);
            var8 = var8 - (float)O(var6, r[var6], 0, 0, var7, var8, var5);
            float var10000 = var8 - (float)O(var6, D[var6], 0, var7, var7, var8, var5);
            ++var6;
         }

         d(0, i.length, 33333333L, 196, 196, 196, (float)q.st, var5);
         d(0, i.length, 16666666L, 196, 196, 196, (float)q.st, var5);
         var4.p();
         net.y.d.S();
         var6 = q.st - 80;
         int var19 = q.st - 160;
         q.sO.v("30", 2.0F, (float)(var19 + 1), -8947849);
         q.sO.v("30", 1.0F, (float)var19, -3881788);
         q.sO.v("60", 2.0F, (float)(var6 + 1), -8947849);
         q.sO.v("60", 1.0F, (float)var6, -3881788);
         net.y.d.G(5889);
         net.y.d.Y();
         net.y.d.G(5888);
         net.y.d.Y();
         net.y.d.S();
         float var26 = 1.0F - (float)((double)(System.currentTimeMillis() - Y) / 1000.0D);
         var26 = z9.r(var26, 0.0F, 1.0F);
         int var28 = (int)(170.0F + var26 * 85.0F);
         int var10 = (int)(100.0F + var26 * 55.0F);
         int var11 = (int)(10.0F + var26 * 10.0F);
         int var12 = var28 << 16 | var10 << 8 | var11;
         int var13 = 512 / net.z.t.K() + 2;
         int var14 = q.st / net.z.t.K() - 8;
         tk var29 = q.y;
         tk.u(var13 - 1, var14 - 1, var13 + 50, var14 + 10, -1605349296);
         q.sO.v(" " + t + " MB/s", (float)var13, (float)var14, var12);
         g = System.nanoTime() - var2;
      }

   }

   private static long O(int var0, long var1, int var3, int var4, int var5, float var6, p var7) {
      long var8 = var1 / 200000L;
      if(var8 < 3L) {
         return 0L;
      } else {
         var7.H((double)((float)var0 + 0.5F), (double)(var6 - (float)var8 + 0.5F), 0.0D).V(var3, var4, var5, 255).W();
         var7.H((double)((float)var0 + 0.5F), (double)(var6 + 0.5F), 0.0D).V(var3, var4, var5, 255).W();
         return var8;
      }
   }

   private static long d(int var0, int var1, long var2, int var4, int var5, int var6, float var7, p var8) {
      long var9 = var2 / 200000L;
      if(var9 < 3L) {
         return 0L;
      } else {
         var8.H((double)((float)var0 + 0.5F), (double)(var7 - (float)var9 + 0.5F), 0.0D).V(var4, var5, var6, 255).W();
         var8.H((double)((float)var1 + 0.5F), (double)(var7 - (float)var9 + 0.5F), 0.0D).V(var4, var5, var6, 255).W();
         return var9;
      }
   }

   public static boolean e() {
      return p;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class v {
      public long V = 0L;
      public long H = 0L;

      public void G() {
         String var1 = mf.O();
         if(u_.p && this.V == 0L) {
            this.V = System.nanoTime();
         }

      }

      public void C() {
         String var1 = mf.O();
         if(u_.p && this.V != 0L) {
            this.H += System.nanoTime() - this.V;
            this.V = 0L;
         }

      }

      private void H() {
         this.H = 0L;
         this.V = 0L;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
