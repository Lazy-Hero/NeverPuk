package net.ym;

import net.g0;
import net.i6;
import net.ug;
import net.w1;
import net.xn;
import net.z9;
import net.ym.i;
import net.yz.aq;

public class t implements w1 {
   protected int[] h;
   protected final int j;
   protected aq r;
   protected net.n9.v Z;
   private int[] l = null;
   protected boolean L = i6.uc.r();
   protected net.y8.q K = net.y8.x.d;
   private g0 S;
   private static int u;

   public t(int[] var1, int var2, aq var3, net.n9.v var4, boolean var5, net.y8.q var6) {
      this.h = var1;
      this.j = var2;
      this.r = var3;
      this.Z = var4;
      this.L = var5;
      this.K = var6;
      this.i();
   }

   public t(int[] var1, int var2, aq var3, net.n9.v var4) {
      this.h = var1;
      this.j = var2;
      this.r = var3;
      this.Z = var4;
      this.i();
   }

   public net.n9.v t() {
      if(this.Z == null) {
         this.Z = B(this.I());
      }

      return this.Z;
   }

   public int[] I() {
      this.i();
      return this.h;
   }

   public boolean D() {
      return this.j != -1;
   }

   public int N() {
      return this.j;
   }

   public aq c() {
      if(this.r == null) {
         this.r = i.S(this.I());
      }

      return this.r;
   }

   public int[] G() {
      if(this.l == null) {
         this.l = j(this.I(), this.t());
      }

      return this.l;
   }

   private static int[] j(int[] var0, net.n9.v var1) {
      int[] var3 = (int[])var0.clone();
      int var10000 = var1.Y / var1.d();
      var10000 = var1.W / var1.z();
      v();
      int var6 = var3.length / 4;
      int var7 = 0;
      int var8 = var7 * var6;
      float var9 = Float.intBitsToFloat(var3[var8 + 4]);
      float var10 = Float.intBitsToFloat(var3[var8 + 4 + 1]);
      float var11 = var1.M(var9);
      float var12 = var1.u(var10);
      var3[var8 + 4] = Float.floatToRawIntBits(var11);
      var3[var8 + 4 + 1] = Float.floatToRawIntBits(var12);
      ++var7;
      return var3;
   }

   public void S(ug var1) {
      i6.Q(i6.P, new Object[]{var1, this});
   }

   public net.y8.q e() {
      return this.K;
   }

   public boolean H() {
      return this.L;
   }

   private static net.n9.v B(int[] var0) {
      V();
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      int var6 = var0.length / 4;
      int var7 = 0;
      int var8 = var7 * var6;
      float var9 = Float.intBitsToFloat(var0[var8 + 4]);
      float var10 = Float.intBitsToFloat(var0[var8 + 4 + 1]);
      var2 = Math.min(var2, var9);
      var3 = Math.min(var3, var10);
      var4 = Math.max(var4, var9);
      var5 = Math.max(var5, var10);
      ++var7;
      float var16 = (var2 + var4) / 2.0F;
      float var17 = (var3 + var5) / 2.0F;
      net.n9.v var18 = net.nn.j.b().p().O((double)var16, (double)var17);
      return var18;
   }

   protected void i() {
      if(z9.Q()) {
         if(this.h.length == 28) {
            this.h = y(this.h);
         }
      } else if(this.h.length == 56) {
         this.h = V(this.h);
      }

   }

   private static int[] y(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 * 2;
      int[] var3 = new int[var2 * 4];
      int var4 = 0;

      while(true) {
         System.arraycopy(var0, var4 * var1, var3, var4 * var2, var1);
         ++var4;
      }
   }

   private static int[] V(int[] var0) {
      int var1 = var0.length / 4;
      int var2 = var1 / 2;
      int[] var3 = new int[var2 * 4];
      int var4 = 0;

      while(true) {
         System.arraycopy(var0, var4 * var1, var3, var4 * var2, var2);
         ++var4;
      }
   }

   public g0 U() {
      if(this.S == null) {
         this.S = new g0(this.I());
      }

      return this.S;
   }

   public float M() {
      g0 var1 = this.U();
      return (var1.S() + var1.F()) / 2.0F;
   }

   public double z() {
      g0 var1 = this.U();
      return (double)((var1.m() + var1.w()) / 2.0F);
   }

   public double t() {
      g0 var1 = this.U();
      return (double)((var1.a() + var1.L()) / 2.0F);
   }

   public boolean z() {
      g0 var1 = this.U();
      return var1.g(this.r);
   }

   public boolean O() {
      g0 var1 = this.U();
      return var1.j(this.r);
   }

   public boolean b() {
      return this.O() && this.z();
   }

   public String toString() {
      return "vertex: " + this.h.length / 7 + ", tint: " + this.j + ", facing: " + this.r + ", sprite: " + this.Z;
   }

   public static void H(int var0) {
      u = var0;
   }

   public static int v() {
      return u;
   }

   public static int V() {
      int var0 = v();
      return 13;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      H(56);
   }
}
