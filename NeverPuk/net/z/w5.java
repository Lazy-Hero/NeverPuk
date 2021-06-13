package net.z;

import net.xn;
import net.no.sj;
import net.yv.of;
import net.z.g;

public class w5 extends of {
   protected float c;
   protected long Q;

   public w5(sj var1) {
      super(var1.J(), var1.r(), var1.f(), var1.g());
      this.c = var1.w();
      this.w = var1.w();
      this.Q = net.nn.j.E();
      this.u(var1.n());
      this.O(var1.d());
      this.C(var1.V());
   }

   public void n(float var1) {
      this.w = this.g();
      this.c = var1;
      this.Q = net.nn.j.E();
   }

   public float g() {
      long var1 = net.nn.j.E() - this.Q;
      float var3 = net.u.t.T((float)var1 / 100.0F, 0.0F, 1.0F);
      return this.w + (this.c - this.w) * var3;
   }

   public void O(sj var1) {
      boolean var2 = g.B();
      switch(null.T[var1.L().ordinal()]) {
      case 1:
         this.T(var1.r());
      case 2:
         this.n(var1.w());
      case 3:
         this.A(var1.f());
         this.Y(var1.g());
      case 4:
         this.u(var1.n());
         this.O(var1.d());
      default:
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
