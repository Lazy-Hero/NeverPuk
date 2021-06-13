package net.y_;

import net.xn;
import net.y_.b;

public class k extends b {
   net.yv.r K;
   protected net.ne.s D;
   protected int V;
   double n;
   boolean C;
   net.b.t J;
   private int A;
   private double Y;
   private double I;
   private double o;
   protected final int G = 20;

   public k(net.ne.s var1, double var2, boolean var4) {
      this.D = var1;
      this.K = var1.hl;
      this.n = var2;
      this.C = var4;
      this.h(3);
   }

   public boolean f() {
      net.ne.a var1 = this.D.M();
      return false;
   }

   public boolean X() {
      net.ne.a var1 = this.D.M();
      return false;
   }

   public void I() {
      this.D.H().Y(this.J, this.n);
      this.A = 0;
   }

   public void C() {
      net.ne.a var1 = this.D.M();
      if(var1 instanceof net.r.r && (((net.r.r)var1).VX() || ((net.r.r)var1).V8())) {
         this.D.C((net.ne.a)null);
      }

      this.D.H().u();
   }

   public void E() {
      b.E();
      net.ne.a var2 = this.D.M();
      this.D.E().n(var2, 30.0F, 30.0F);
      double var3 = this.D.o(var2.b, var2.i().u, var2.hr);
      --this.A;
      if((this.C || this.D.z().v(var2)) && this.A <= 0 && (Double.compare(this.Y, 0.0D) == 0 && Double.compare(this.I, 0.0D) == 0 && Double.compare(this.o, 0.0D) == 0 || var2.o(this.Y, this.I, this.o) >= 1.0D || this.D.Q().nextFloat() < 0.05F)) {
         this.Y = var2.b;
         this.I = var2.i().u;
         this.o = var2.hr;
         this.A = 4 + this.D.Q().nextInt(7);
         if(var3 > 1024.0D) {
            this.A += 10;
         }

         if(var3 > 256.0D) {
            this.A += 5;
         }

         if(!this.D.H().F(var2, this.n)) {
            this.A += 15;
         }
      }

      this.V = Math.max(this.V - 1, 0);
      this.T(var2, var3);
   }

   protected void T(net.ne.a var1, double var2) {
      double var4 = this.n(var1);
      if(var2 <= var4 && this.V <= 0) {
         this.V = 20;
         this.D.N(net.yz.k.MAIN_HAND);
         this.D.S(var1);
      }

   }

   protected double n(net.ne.a var1) {
      return (double)(this.D.h9 * 2.0F * this.D.h9 * 2.0F + var1.h9);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
