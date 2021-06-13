package net.y6;

import net.xn;
import net.y6.jb;

public class ey extends net.y6.z {
   public jb H = new jb(this, 0, 0);
   public jb h;
   public jb r;
   public jb p;
   public jb O;
   public jb a;
   protected float V = 8.0F;
   protected float T = 4.0F;

   public ey(int var1, float var2) {
      this.H.d(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this.H.n(0.0F, (float)(18 - var1), -6.0F);
      this.h = new jb(this, 28, 8);
      this.h.d(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.h.n(0.0F, (float)(17 - var1), 2.0F);
      this.r = new jb(this, 0, 16);
      this.r.d(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.r.n(-3.0F, (float)(24 - var1), 7.0F);
      this.p = new jb(this, 0, 16);
      this.p.d(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.p.n(3.0F, (float)(24 - var1), 7.0F);
      this.O = new jb(this, 0, 16);
      this.O.d(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.O.n(-3.0F, (float)(24 - var1), -5.0F);
      this.a = new jb(this, 0, 16);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.a.n(3.0F, (float)(24 - var1), -5.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.c();
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
      this.H.b = var5 * 0.017453292F;
      this.H.N = var4 * 0.017453292F;
      this.h.b = 1.5707964F;
      this.r.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
      this.p.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.O.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.a.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
