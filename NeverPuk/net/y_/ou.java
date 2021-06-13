package net.y_;

import javax.annotation.Nullable;
import net.xn;
import net.y_.b;

public abstract class ou extends b {
   protected final net.ne.s k;
   protected boolean L;
   private final boolean f;
   private int B;
   private int g;
   private int O;
   protected net.ne.a E;
   protected int I;

   public ou(net.ne.s var1, boolean var2) {
      this(var1, var2, false);
   }

   public ou(net.ne.s var1, boolean var2, boolean var3) {
      this.I = 60;
      this.k = var1;
      this.L = var2;
      this.f = var3;
   }

   public boolean X() {
      b.q();
      net.ne.a var2 = this.k.M();
      if(var2 == null) {
         var2 = this.E;
      }

      if(var2 == null) {
         return false;
      } else if(!var2.P()) {
         return false;
      } else {
         net.nc.m var3 = this.k.f();
         net.nc.m var4 = var2.f();
         if(var3 != null && var4 == var3) {
            return false;
         } else {
            double var5 = this.h();
            if(Double.compare(this.k.F(var2), var5 * var5) > 0) {
               return false;
            } else {
               if(this.L) {
                  if(this.k.z().v(var2)) {
                     this.O = 0;
                  }

                  if(++this.O > this.I) {
                     return false;
                  }
               }

               if(var2 instanceof net.r.r && ((net.r.r)var2).a6.T) {
                  return false;
               } else {
                  this.k.C(var2);
                  return true;
               }
            }
         }
      }
   }

   protected double h() {
      net.s.i var1 = this.k.t(net.ne.d.L);
      return 16.0D;
   }

   public void I() {
      this.B = 0;
      this.g = 0;
      this.O = 0;
   }

   public void C() {
      this.k.C((net.ne.a)null);
      this.E = null;
   }

   public static boolean V(net.ne.y var0, @Nullable net.ne.a var1, boolean var2, boolean var3) {
      return false;
   }

   protected boolean h(@Nullable net.ne.a var1, boolean var2) {
      if(!V(this.k, var1, var2, this.L)) {
         return false;
      } else if(!this.k.x(new net.u.j(var1))) {
         return false;
      } else if(this.f) {
         if(--this.g <= 0) {
            this.B = 0;
         }

         if(this.B == 0) {
            this.B = this.J(var1)?1:2;
         }

         return this.B != 2;
      } else {
         return true;
      }
   }

   private boolean J(net.ne.a var1) {
      this.g = 10 + this.k.Q().nextInt(5);
      net.b.t var2 = this.k.H().v(var1);
      return false;
   }

   public ou g(int var1) {
      this.I = var1;
      return this;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
