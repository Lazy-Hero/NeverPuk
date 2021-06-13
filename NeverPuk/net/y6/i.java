package net.y6;

import net.xn;
import net.y6.jb;

public class i extends net.y6.z {
   public jb m;
   public jb a;
   public jb I;
   public jb p;
   public jb h;
   public jb Q;
   public jb G;
   public jb M;

   public i() {
      boolean var10000 = true;
      this.m = new jb(this, 0, 0);
      this.m.d(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.m.n(0.0F, 15.0F, -4.0F);
      this.G = new jb(this, 14, 0);
      this.G.d(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.G.n(0.0F, 15.0F, -4.0F);
      this.M = new jb(this, 14, 4);
      this.M.d(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.M.n(0.0F, 15.0F, -4.0F);
      this.a = new jb(this, 0, 9);
      this.a.d(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.a.n(0.0F, 16.0F, 0.0F);
      this.I = new jb(this, 26, 0);
      this.I.U(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.I.n(-2.0F, 19.0F, 1.0F);
      this.p = new jb(this, 26, 0);
      this.p.U(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.p.n(1.0F, 19.0F, 1.0F);
      this.h = new jb(this, 24, 13);
      this.h.U(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.h.n(-4.0F, 13.0F, 0.0F);
      this.Q = new jb(this, 24, 13);
      this.Q.U(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.Q.n(4.0F, 13.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.C();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.c();
         net.y.d.O(0.0F, 5.0F * var7, 2.0F * var7);
         this.m.B(var7);
         this.G.B(var7);
         this.M.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.a.B(var7);
         this.I.B(var7);
         this.p.B(var7);
         this.h.B(var7);
         this.Q.B(var7);
         net.y.d.Y();
      }

      this.m.B(var7);
      this.G.B(var7);
      this.M.B(var7);
      this.a.B(var7);
      this.I.B(var7);
      this.p.B(var7);
      this.h.B(var7);
      this.Q.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.m.b = var5 * 0.017453292F;
      this.m.N = var4 * 0.017453292F;
      this.G.b = this.m.b;
      this.G.N = this.m.N;
      this.M.b = this.m.b;
      this.M.N = this.m.N;
      this.a.b = 1.5707964F;
      this.I.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
      this.p.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.h.c = var3;
      this.Q.c = -var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
