package net.y_;

import net.xn;
import net.y_.b;

public class oa extends b {
   private final net.ne.y N;
   private double m;
   private double v;
   private int r;

   public oa(net.ne.y var1) {
      this.N = var1;
      this.h(3);
   }

   public boolean f() {
      boolean var1 = b.E();
      return Float.compare(this.N.Q().nextFloat(), 0.02F) < 0;
   }

   public boolean X() {
      boolean var1 = b.q();
      return this.r >= 0;
   }

   public void I() {
      double var1 = 6.283185307179586D * this.N.Q().nextDouble();
      this.m = Math.cos(var1);
      this.v = Math.sin(var1);
      this.r = 20 + this.N.Q().nextInt(20);
   }

   public void E() {
      --this.r;
      this.N.E().u(this.N.b + this.m, this.N.hS + (double)this.N.A(), this.N.hr + this.v, (float)this.N.v(), (float)this.N.w());
   }

   private static xn a(xn var0) {
      return var0;
   }
}
