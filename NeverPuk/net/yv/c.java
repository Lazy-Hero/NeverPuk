package net.yv;

import javax.annotation.Nullable;
import net.xn;
import net.ns.i6;
import net.ns.i9;
import net.yv.h;
import net.yv.j;
import net.yv.r;

public abstract class c {
   public static final float[] s = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   protected r H;
   private j i;
   private String J;
   protected i9 M;
   protected boolean F;
   protected boolean l;
   protected boolean Z;
   protected final float[] W = new float[16];
   private final float[] x = new float[4];

   public final void z(r var1) {
      this.H = var1;
      this.i = var1.B().h();
      this.J = var1.B().X();
      this.b();
      this.z();
   }

   protected void z() {
      float var10000 = 0.0F;
      int var2 = 0;

      while(true) {
         float var3 = 1.0F - (float)var2 / 15.0F;
         this.W[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * 1.0F + 0.0F;
         ++var2;
      }
   }

   protected void b() {
      this.Z = true;
      j var1 = this.H.B().h();
      if(var1 == j.T) {
         net.cn.a var2 = net.cn.a.n(this.H.B().X());
         this.M = new i6(net.ns.i.z(var2.q(), net.nb.x.Q));
      } else if(var1 == j.J) {
         this.M = new i6(net.nb.x.v);
      } else {
         this.M = new i9(this.H.B());
      }

   }

   public net.cn.e z() {
      net.u.d[] var1 = r.C();
      return (net.cn.e)(this.i == j.T?new net.cn.t(this.H, this.H.a(), this.H.B().X(), this.J):(this.i == j.J?new net.cn.f(this.H):(this.i == j.C?new net.cn.u(this.H, this.H.a(), this.H.B().X(), this.J):new net.cn.u(this.H, this.H.a(), this.H.B().X(), this.J))));
   }

   public boolean i(int var1, int var2) {
      net.u.j var3 = new net.u.j(var1, 0, var2);
      return this.H.P(var3).Y()?true:this.H.i(var3).Q() == net.nb.f.p;
   }

   public float G(long var1, float var3) {
      int var4 = (int)(var1 % 24000L);
      float var5 = ((float)var4 + var3) / 24000.0F - 0.25F;
      if(var5 < 0.0F) {
         ++var5;
      }

      if(var5 > 1.0F) {
         --var5;
      }

      float var6 = 1.0F - (float)((Math.cos((double)var5 * 3.141592653589793D) + 1.0D) / 2.0D);
      var5 = var5 + (var6 - var5) / 3.0F;
      return var5;
   }

   public int P(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean Z() {
      return true;
   }

   @Nullable
   public float[] F(float var1, float var2) {
      float var10000 = 0.4F;
      r.C();
      float var5 = net.u.t.m(var1 * 6.2831855F) - 0.0F;
      var10000 = -0.0F;
      if(Float.compare(var5, -0.4F) >= 0 && var5 <= 0.4F) {
         float var7 = (var5 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var8 = 1.0F - (1.0F - net.u.t.A(var7 * 3.1415927F)) * 0.99F;
         var8 = var8 * var8;
         this.x[0] = var7 * 0.3F + 0.7F;
         this.x[1] = var7 * var7 * 0.7F + 0.2F;
         this.x[2] = var7 * var7 * 0.0F + 0.2F;
         this.x[3] = var8;
         return this.x;
      } else {
         return null;
      }
   }

   public net.u.r o(float var1, float var2) {
      float var3 = net.u.t.m(var1 * 6.2831855F) * 2.0F + 0.5F;
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 = var4 * (var3 * 0.94F + 0.06F);
      var5 = var5 * (var3 * 0.94F + 0.06F);
      var6 = var6 * (var3 * 0.91F + 0.09F);
      return new net.u.r((double)var4, (double)var5, (double)var6);
   }

   public boolean X() {
      return true;
   }

   public float e() {
      return 128.0F;
   }

   public boolean s() {
      return true;
   }

   @Nullable
   public net.u.j u() {
      return null;
   }

   public int v() {
      return this.i == j.T?4:this.H.k() + 1;
   }

   public double i() {
      return this.i == j.T?1.0D:0.03125D;
   }

   public boolean J(int var1, int var2) {
      return false;
   }

   public i9 p() {
      return this.M;
   }

   public boolean T() {
      return this.F;
   }

   public boolean A() {
      return this.Z;
   }

   public boolean k() {
      return this.l;
   }

   public float[] U() {
      return this.W;
   }

   public net.nz.p E() {
      return new net.nz.p();
   }

   public void Q(net.r.h var1) {
   }

   public void d(net.r.h var1) {
   }

   public abstract h L();

   public void y() {
   }

   public void G() {
   }

   public boolean z(int var1, int var2) {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
