package net.y6;

import net.xn;
import net.y6.jb;

public class er extends net.y6.z {
   public jb I;
   public jb E;
   public jb u;
   public jb D;
   public jb a;
   public jb b;
   jb m;
   jb w;

   public er() {
      float var10000 = 0.0F;
      var10000 = 13.5F;
      this.I = new jb(this, 0, 0);
      this.I.d(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
      this.I.n(-1.0F, 13.5F, -7.0F);
      this.E = new jb(this, 18, 14);
      this.E.d(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
      this.E.n(0.0F, 14.0F, 2.0F);
      this.w = new jb(this, 21, 0);
      this.w.d(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
      this.w.n(-1.0F, 14.0F, 2.0F);
      this.u = new jb(this, 0, 18);
      this.u.d(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
      this.u.n(-2.5F, 16.0F, 7.0F);
      this.D = new jb(this, 0, 18);
      this.D.d(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
      this.D.n(0.5F, 16.0F, 7.0F);
      this.a = new jb(this, 0, 18);
      this.a.d(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
      this.a.n(-2.5F, 16.0F, -4.0F);
      this.b = new jb(this, 0, 18);
      this.b.d(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
      this.b.n(0.5F, 16.0F, -4.0F);
      this.m = new jb(this, 9, 18);
      this.m.d(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
      this.m.n(-1.0F, 12.0F, 8.0F);
      this.I.k(16, 14).d(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
      this.I.k(16, 14).d(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
      this.I.k(0, 10).d(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.V(var1, var2, var3, var4, var5, var6, var7);
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.c();
         net.y.d.O(0.0F, 5.0F * var7, 2.0F * var7);
         this.I.R(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.E.B(var7);
         this.u.B(var7);
         this.D.B(var7);
         this.a.B(var7);
         this.b.B(var7);
         this.m.R(var7);
         this.w.B(var7);
         net.y.d.Y();
      } else {
         this.I.R(var7);
         this.E.B(var7);
         this.u.B(var7);
         this.D.B(var7);
         this.a.B(var7);
         this.b.B(var7);
         this.m.R(var7);
         this.w.B(var7);
      }

   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      net.y6.z.C();
      net.yn.x var6 = (net.yn.x)var1;
      if(var6.d9()) {
         this.m.N = 0.0F;
      }

      this.m.N = net.u.t.m(var2 * 0.6662F) * 1.4F * var3;
      if(var6.Ke()) {
         this.w.n(-1.0F, 16.0F, -3.0F);
         this.w.b = 1.2566371F;
         this.w.N = 0.0F;
         this.E.n(0.0F, 18.0F, 0.0F);
         this.E.b = 0.7853982F;
         this.m.n(-1.0F, 21.0F, 6.0F);
         this.u.n(-2.5F, 22.0F, 2.0F);
         this.u.b = 4.712389F;
         this.D.n(0.5F, 22.0F, 2.0F);
         this.D.b = 4.712389F;
         this.a.b = 5.811947F;
         this.a.n(-2.49F, 17.0F, -4.0F);
         this.b.b = 5.811947F;
         this.b.n(0.51F, 17.0F, -4.0F);
      }

      this.E.n(0.0F, 14.0F, 2.0F);
      this.E.b = 1.5707964F;
      this.w.n(-1.0F, 14.0F, -3.0F);
      this.w.b = this.E.b;
      this.m.n(-1.0F, 12.0F, 8.0F);
      this.u.n(-2.5F, 16.0F, 7.0F);
      this.D.n(0.5F, 16.0F, 7.0F);
      this.a.n(-2.5F, 16.0F, -4.0F);
      this.b.n(0.5F, 16.0F, -4.0F);
      this.u.b = net.u.t.m(var2 * 0.6662F) * 1.4F * var3;
      this.D.b = net.u.t.m(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
      this.a.b = net.u.t.m(var2 * 0.6662F + 3.1415927F) * 1.4F * var3;
      this.b.b = net.u.t.m(var2 * 0.6662F) * 1.4F * var3;
      this.I.c = var6.T(var4) + var6.H(var4, 0.0F);
      this.w.c = var6.H(var4, -0.08F);
      this.E.c = var6.H(var4, -0.16F);
      this.m.c = var6.H(var4, -0.2F);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.I.b = var5 * 0.017453292F;
      this.I.N = var4 * 0.017453292F;
      this.m.b = var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
