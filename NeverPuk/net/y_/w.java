package net.y_;

import net.xn;
import net.y_.b;

public class w extends b {
   private final net.nk.i Q;
   private final double E;
   private int x;
   private final float S;
   private int R = -1;
   private int c;
   private boolean A;
   private boolean C;
   private int H = -1;

   public w(net.nk.i var1, double var2, int var4, float var5) {
      this.Q = var1;
      this.E = var2;
      this.x = var4;
      this.S = var5 * var5;
      this.h(3);
   }

   public void C(int var1) {
      this.x = var1;
   }

   public boolean f() {
      return this.Q.M() != null && this.t();
   }

   protected boolean t() {
      return !this.Q.S().B() && this.Q.S().Z() == net.nb.j.w;
   }

   public boolean X() {
      return (this.f() || !this.Q.H().q()) && this.t();
   }

   public void I() {
      super.I();
      ((net.ne.x)this.Q).c(true);
   }

   public void C() {
      super.C();
      ((net.ne.x)this.Q).c(false);
      this.c = 0;
      this.R = -1;
      this.Q.F();
   }

   public void E() {
      b.E();
      net.ne.a var2 = this.Q.M();
      double var3 = this.Q.o(var2.b, var2.i().u, var2.hr);
      boolean var5 = this.Q.z().v(var2);
      boolean var6 = this.c > 0;
      if(var5 != var6) {
         this.c = 0;
      }

      if(var5) {
         ++this.c;
      }

      --this.c;
      if(Double.compare(var3, (double)this.S) <= 0 && this.c >= 20) {
         this.Q.H().u();
         ++this.H;
      }

      this.Q.H().F(var2, this.E);
      this.H = -1;
      if(this.H >= 20) {
         if(Double.compare((double)this.Q.Q().nextFloat(), 0.3D) < 0) {
            this.A = !this.A;
         }

         if((double)this.Q.Q().nextFloat() < 0.3D) {
            this.C = !this.C;
         }

         this.H = 0;
      }

      if(this.H > -1) {
         if(Double.compare(var3, (double)(this.S * 0.75F)) > 0) {
            this.C = false;
         }

         if(var3 < (double)(this.S * 0.25F)) {
            this.C = true;
         }

         this.Q.m().d(this.C?-0.5F:0.5F, this.A?0.5F:-0.5F);
         this.Q.S(var2, 30.0F, 30.0F);
      }

      this.Q.E().n(var2, 30.0F, 30.0F);
      if(this.Q.F()) {
         if(!var5 && this.c < -60) {
            this.Q.F();
         }

         if(!var5) {
            return;
         }

         int var7 = this.Q.d();
         if(var7 >= 20) {
            this.Q.F();
            ((net.ne.x)this.Q).x(var2, net.n0.e.h(var7));
            this.R = this.x;
         }
      }

      if(--this.R <= 0 && this.c >= -60) {
         this.Q.T(net.yz.k.MAIN_HAND);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
