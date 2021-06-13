package net.yv;

import javax.annotation.Nullable;
import net.xn;
import net.ns.i6;
import net.yv.c;
import net.yv.d;
import net.yv.h;
import net.yv.r;

public class k extends c {
   private net.yd.y w;

   public void b() {
      this.M = new i6(net.nb.x.P);
      net.nj.f var1 = this.H.B().k(h.THE_END);
      this.w = this.H instanceof d?new net.yd.y((d)this.H, var1.o("DragonFight")):null;
   }

   public net.cn.e z() {
      return new net.cn.y(this.H, this.H.B().X(), this.H.a(), this.u());
   }

   public float G(long var1, float var3) {
      return 0.0F;
   }

   @Nullable
   public float[] F(float var1, float var2) {
      return null;
   }

   public net.u.r o(float var1, float var2) {
      int var10000 = 10518688;
      float var4 = net.u.t.m(var1 * 6.2831855F) * 2.0F + 0.5F;
      var4 = net.u.t.T(var4, 0.0F, 1.0F);
      float var5 = 0.627451F;
      float var6 = 0.5019608F;
      float var7 = 0.627451F;
      var5 = var5 * (var4 * 0.0F + 0.15F);
      var6 = var6 * (var4 * 0.0F + 0.15F);
      var7 = var7 * (var4 * 0.0F + 0.15F);
      return new net.u.r((double)var5, (double)var6, (double)var7);
   }

   public boolean s() {
      return false;
   }

   public boolean X() {
      return false;
   }

   public boolean Z() {
      return false;
   }

   public float e() {
      return 8.0F;
   }

   public boolean i(int var1, int var2) {
      return this.H.i(new net.u.j(var1, 0, var2)).n().f();
   }

   public net.u.j u() {
      return new net.u.j(100, 50, 0);
   }

   public int v() {
      return 50;
   }

   public boolean J(int var1, int var2) {
      return false;
   }

   public h L() {
      return h.THE_END;
   }

   public void y() {
      r.C();
      net.nj.f var2 = new net.nj.f();
      if(this.w != null) {
         var2.K("DragonFight", this.w.F());
      }

      this.H.B().x(h.THE_END, var2);
   }

   public void G() {
      net.u.d[] var1 = r.C();
      if(this.w != null) {
         this.w.A();
      }

   }

   @Nullable
   public net.yd.y C() {
      return this.w;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
