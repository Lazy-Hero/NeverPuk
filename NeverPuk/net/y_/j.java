package net.y_;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import net.y_.r;

public class j extends b {
   private final net.ne.y U;
   private final Predicate W;
   private net.ne.y y;
   private final double L;
   private final net.b.n c;
   private int u;
   private final float N;
   private float q;
   private final float p;

   public j(final net.ne.y var1, double var2, float var4, float var5) {
      this.U = var1;
      this.W = new Predicate() {
         public boolean o(@Nullable net.ne.y var1x) {
            boolean var2 = b.E();
            return var1x != null && var1.getClass() != var1x.getClass();
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.L = var2;
      this.c = var1.H();
      this.N = var4;
      this.p = var5;
      this.h(3);
      if(!(var1.H() instanceof net.b.s) && !(var1.H() instanceof net.b.k)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   public boolean f() {
      List var1 = this.U.hl.L(net.ne.y.class, this.U.i().x((double)this.p), this.W);
      if(!var1.isEmpty()) {
         for(net.ne.y var3 : var1) {
            if(!var3.e()) {
               this.y = var3;
               return true;
            }
         }
      }

      return false;
   }

   public boolean X() {
      return this.y != null && !this.c.q() && this.U.F(this.y) > (double)(this.N * this.N);
   }

   public void I() {
      this.u = 0;
      this.q = this.U.Q(net.b.m.WATER);
      this.U.v(net.b.m.WATER, 0.0F);
   }

   public void C() {
      this.y = null;
      this.c.u();
      this.U.v(net.b.m.WATER, this.q);
   }

   public void E() {
      boolean var1 = b.q();
      if(this.y != null && !this.U.ln()) {
         this.U.E().n(this.y, 10.0F, (float)this.U.w());
         if(--this.u <= 0) {
            this.u = 10;
            double var2 = this.U.b - this.y.b;
            double var4 = this.U.hS - this.y.hS;
            double var6 = this.U.hr - this.y.hr;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if(var8 > (double)(this.N * this.N)) {
               this.c.F(this.y, this.L);
            }

            this.c.u();
            r var10 = this.y.E();
            if(var8 <= (double)this.N || Double.compare(var10.v(), this.U.b) == 0 && var10.B() == this.U.hS && var10.k() == this.U.hr) {
               double var11 = this.y.b - this.U.b;
               double var13 = this.y.hr - this.U.hr;
               this.c.k(this.U.b - var11, this.U.hS, this.U.hr - var13, this.L);
            }
         }
      }

   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
