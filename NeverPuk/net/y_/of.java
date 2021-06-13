package net.y_;

import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.s;

public class of extends b {
   protected final net.ne.s p;
   protected double L;
   protected double B;
   protected double O;
   protected final double X;
   protected int n;
   protected boolean s;

   public of(net.ne.s var1, double var2) {
      this(var1, var2, 120);
   }

   public of(net.ne.s var1, double var2, int var4) {
      this.p = var1;
      this.X = var2;
      this.n = var4;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.s) {
         if(this.p.y() >= 100) {
            return false;
         }

         if(this.p.Q().nextInt(this.n) != 0) {
            return false;
         }
      }

      net.u.r var2 = this.N();
      return false;
   }

   @Nullable
   protected net.u.r N() {
      return s.h(this.p, 10, 7);
   }

   public boolean X() {
      return !this.p.H().q();
   }

   public void I() {
      this.p.H().k(this.L, this.B, this.O, this.X);
   }

   public void B() {
      this.s = true;
   }

   public void d(int var1) {
      this.n = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
