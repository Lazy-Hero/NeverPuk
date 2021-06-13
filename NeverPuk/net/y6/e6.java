package net.y6;

import net.xn;
import net.y6.ey;
import net.y6.jb;

public class e6 extends ey {
   private final jb Q;
   private final jb i;

   public e6(float var1) {
      super(15, var1);
      this.f = 128;
      this.C = 64;
      this.H = new jb(this, 0, 0);
      this.H.d(-2.0F, -14.0F, -10.0F, 4, 4, 9, var1);
      this.H.n(0.0F, 7.0F, -6.0F);
      this.H.k(0, 14).d(-4.0F, -16.0F, -6.0F, 8, 18, 6, var1);
      this.H.k(17, 0).d(-4.0F, -19.0F, -4.0F, 3, 3, 2, var1);
      this.H.k(17, 0).d(1.0F, -19.0F, -4.0F, 3, 3, 2, var1);
      this.h = new jb(this, 29, 0);
      this.h.d(-6.0F, -10.0F, -7.0F, 12, 18, 10, var1);
      this.h.n(0.0F, 5.0F, 2.0F);
      this.Q = new jb(this, 45, 28);
      this.Q.d(-3.0F, 0.0F, 0.0F, 8, 8, 3, var1);
      this.Q.n(-8.5F, 3.0F, 3.0F);
      this.Q.N = 1.5707964F;
      this.i = new jb(this, 45, 41);
      this.i.d(-3.0F, 0.0F, 0.0F, 8, 8, 3, var1);
      this.i.n(5.5F, 3.0F, 3.0F);
      this.i.N = 1.5707964F;
      boolean var10000 = true;
      var10000 = true;
      this.r = new jb(this, 29, 29);
      this.r.d(-2.0F, 0.0F, -2.0F, 4, 14, 4, var1);
      this.r.n(-2.5F, 10.0F, 6.0F);
      this.p = new jb(this, 29, 29);
      this.p.d(-2.0F, 0.0F, -2.0F, 4, 14, 4, var1);
      this.p.n(2.5F, 10.0F, 6.0F);
      this.O = new jb(this, 29, 29);
      this.O.d(-2.0F, 0.0F, -2.0F, 4, 14, 4, var1);
      this.O.n(-2.5F, 10.0F, -4.0F);
      this.a = new jb(this, 29, 29);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 14, 4, var1);
      this.a.n(2.5F, 10.0F, -4.0F);
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
      net.yn.q var9 = (net.yn.q)var1;
      if(!var9.H9() && var9.TJ()) {
         boolean var14 = true;
      } else {
         boolean var10000 = false;
      }

      this.p(var2, var3, var4, var5, var6, var7, var1);
      if(this.n) {
         float var15 = 2.0F;
         net.y.d.c();
         net.y.d.O(0.0F, this.V * var7, this.T * var7);
         net.y.d.Y();
         net.y.d.c();
         var15 = 0.7F;
         net.y.d.W(0.71428573F, 0.64935064F, 0.7936508F);
         net.y.d.O(0.0F, 21.0F * var7, 0.22F);
         this.H.B(var7);
         net.y.d.Y();
         net.y.d.c();
         var15 = 1.1F;
         net.y.d.W(0.625F, 0.45454544F, 0.45454544F);
         net.y.d.O(0.0F, 33.0F * var7, 0.0F);
         this.h.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.45454544F, 0.41322312F, 0.45454544F);
         net.y.d.O(0.0F, 33.0F * var7, 0.0F);
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
      this.Q.B(var7);
      this.i.B(var7);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
