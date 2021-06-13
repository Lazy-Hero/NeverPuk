package net.y6;

import net.xn;
import net.y6.ey;
import net.y6.jb;

public class ed extends ey {
   public ed() {
      super(12, 0.0F);
      this.f = 128;
      this.C = 64;
      this.H = new jb(this, 0, 0);
      this.H.d(-3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F);
      this.H.n(0.0F, 10.0F, -16.0F);
      this.H.k(0, 44).d(-2.5F, 1.0F, -6.0F, 5, 3, 3, 0.0F);
      this.H.k(26, 0).d(-4.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
      jb var1 = this.H.k(26, 0);
      var1.x = true;
      var1.d(2.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
      this.h = new jb(this);
      this.h.k(0, 19).d(-5.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F);
      this.h.k(39, 0).d(-4.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F);
      this.h.n(-2.0F, 9.0F, 12.0F);
      boolean var10000 = true;
      this.r = new jb(this, 50, 22);
      this.r.d(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
      this.r.n(-3.5F, 14.0F, 6.0F);
      this.p = new jb(this, 50, 22);
      this.p.d(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
      this.p.n(3.5F, 14.0F, 6.0F);
      this.O = new jb(this, 50, 40);
      this.O.d(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
      this.O.n(-2.5F, 14.0F, -7.0F);
      this.a = new jb(this, 50, 40);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
      this.a.n(2.5F, 14.0F, -7.0F);
      --this.r.l;
      ++this.p.l;
      this.r.h += 0.0F;
      this.p.h += 0.0F;
      --this.O.l;
      ++this.a.l;
      --this.O.h;
      --this.a.h;
      this.T += 2.0F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.C();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 2.0F;
         this.V = 16.0F;
         this.T = 4.0F;
         net.y.d.c();
         net.y.d.W(0.6666667F, 0.6666667F, 0.6666667F);
         net.y.d.O(0.0F, this.V * var7, this.T * var7);
         this.H.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.h.B(var7);
         this.r.B(var7);
         this.p.B(var7);
         this.O.B(var7);
         this.a.B(var7);
         net.y.d.Y();
      }

      this.H.B(var7);
      this.h.B(var7);
      this.r.B(var7);
      this.p.B(var7);
      this.O.B(var7);
      this.a.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      float var8 = var3 - (float)var7.x;
      float var9 = ((net.nk.f)var7).c(var8);
      var9 = var9 * var9;
      float var10 = 1.0F - var9;
      this.h.b = 1.5707964F - var9 * 3.1415927F * 0.35F;
      this.h.I = 9.0F * var10 + 11.0F * var9;
      this.O.I = 14.0F * var10 + -6.0F * var9;
      this.O.h = -8.0F * var10 + -4.0F * var9;
      this.O.b -= var9 * 3.1415927F * 0.45F;
      this.a.I = this.O.I;
      this.a.h = this.O.h;
      this.a.b -= var9 * 3.1415927F * 0.45F;
      this.H.I = 10.0F * var10 + -12.0F * var9;
      this.H.h = -16.0F * var10 + -3.0F * var9;
      this.H.b += var9 * 3.1415927F * 0.15F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
