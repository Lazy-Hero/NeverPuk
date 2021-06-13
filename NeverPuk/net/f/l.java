package net.f;

import net.xn;
import net.f.d;
import net.f.k;
import net.f.n;
import net.f.o;
import net.f.w;
import net.f.x;
import net.f.y;
import net.nn.j;
import net.z.r;

public class l {
   public final l.g h;
   public final l.g J;
   public final l.g L;
   public final l.g K;
   public final l.g X;
   public final l.g F;
   public final l.g Z;
   private boolean U;
   private boolean t;
   private boolean H;
   private boolean M;
   private boolean S;
   private boolean B;
   private boolean j;
   private static String C;

   public l(j var1) {
      this.h = new y(var1);
      this.J = new d(var1);
      this.L = new w(var1);
      this.K = new o(var1);
      this.X = new k(var1);
      this.F = new x(var1);
      this.Z = new n(var1);
   }

   public boolean D() {
      return this.U || this.t || this.H || this.M || this.S || this.B || this.j;
   }

   public boolean y() {
      this.U = !this.U;
      return this.U;
   }

   public void d(float var1, long var2) {
      if(this.t) {
         this.h.X(var1, var2);
      }

      if(this.U && !j.b().P()) {
         this.L.X(var1, var2);
      }

      if(this.H) {
         this.J.X(var1, var2);
      }

      if(this.M) {
         this.K.X(var1, var2);
      }

      if(this.S) {
         this.X.X(var1, var2);
      }

      if(this.B) {
         this.F.X(var1, var2);
      }

      if(this.j) {
         this.Z.X(var1, var2);
      }

   }

   public static void p(String var0, int var1, int var2, int var3, float var4, int var5) {
      M(var0, (double)var1 + 0.5D, (double)var2 + 0.5D, (double)var3 + 0.5D, var4, var5);
   }

   public static void M(String var0, double var1, double var3, double var5, float var7, int var8) {
      K();
      j var10 = j.b();
      if(var10.sf != null && var10.N() != null && var10.N().O != null) {
         r var11 = var10.sO;
         net.yy.g var12 = var10.sf;
         double var13 = var12.hL + (var12.b - var12.hL) * (double)var7;
         double var15 = var12.F + (var12.hS - var12.F) * (double)var7;
         double var17 = var12.A + (var12.hr - var12.A) * (double)var7;
         net.y.d.c();
         net.y.d.O((float)(var1 - var13), (float)(var3 - var15) + 0.07F, (float)(var5 - var17));
         net.y.d.b(0.0F, 1.0F, 0.0F);
         net.y.d.W(0.02F, -0.02F, 0.02F);
         net.y0.d var19 = var10.N();
         net.y.d.P(-var19.I, 0.0F, 1.0F, 0.0F);
         net.y.d.P((float)(var19.O.wR == 2?1:-1) * var19.Z, 1.0F, 0.0F, 0.0F);
         net.y.d.i();
         net.y.d.S();
         net.y.d.B();
         net.y.d.Y(true);
         net.y.d.W(-1.0F, 1.0F, 1.0F);
         var11.v(var0, (float)(-var11.r(var0) / 2), 0.0F, var8);
         net.y.d.K();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.Y();
      }

   }

   public static void l(String var0) {
      C = var0;
   }

   public static String K() {
      return C;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(K() != null) {
         l("tF6BHc");
      }

   }

   public interface g {
      void X(float var1, long var2);
   }
}
