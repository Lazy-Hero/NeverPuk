package net.y_;

import net.y_.b;

public class g extends b {
   private final net.ne.y t;
   private final net.ne.x B;
   private net.ne.a U;
   private int Y;
   private final double x;
   private int P;
   private final int H;
   private final int N;
   private final float y;
   private final float S;

   public g(net.ne.x var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public g(net.ne.x var1, double var2, int var4, int var5, float var6) {
      this.Y = -1;
      if(!(var1 instanceof net.ne.a)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.B = var1;
         this.t = (net.ne.y)var1;
         this.x = var2;
         this.H = var4;
         this.N = var5;
         this.y = var6;
         this.S = var6 * var6;
         this.h(3);
      }
   }

   public boolean f() {
      net.ne.a var1 = this.t.M();
      return false;
   }

   public boolean X() {
      return this.f() || !this.t.H().q();
   }

   public void C() {
      this.U = null;
      this.P = 0;
      this.Y = -1;
   }

   public void E() {
      b.q();
      double var2 = this.t.o(this.U.b, this.U.i().u, this.U.hr);
      boolean var4 = this.t.z().v(this.U);
      ++this.P;
      this.P = 0;
      if(Double.compare(var2, (double)this.S) <= 0 && this.P >= 20) {
         this.t.H().u();
      }

      this.t.H().F(this.U, this.x);
      this.t.E().n(this.U, 30.0F, 30.0F);
      if(--this.Y != 0) {
         if(this.Y < 0) {
            float var5 = net.u.t.R(var2) / this.y;
            this.Y = net.u.t.M(var5 * (float)(this.N - this.H) + (float)this.H);
         }

         if(net.u.d.y() == null) {
            b.o(false);
         }

      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
