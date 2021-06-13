package net.y_;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.fu;
import net.nl.z2;
import net.y_.b;
import net.y_.ou;

public class o8 extends ou {
   protected final Class r;
   private final int K;
   protected final o8.j X;
   protected final Predicate D;
   protected net.ne.a T;

   public o8(net.ne.s var1, Class var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public o8(net.ne.s var1, Class var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate)null);
   }

   public o8(net.ne.s var1, Class var2, int var3, boolean var4, boolean var5, @Nullable final Predicate var6) {
      super(var1, var4, var5);
      this.r = var2;
      this.K = var3;
      this.X = new o8.j(var1);
      this.h(1);
      this.D = new Predicate() {
         public boolean A(@Nullable net.ne.a var1) {
            b.E();
            return false;
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
   }

   public boolean f() {
      boolean var1 = b.E();
      if(this.K > 0 && this.k.Q().nextInt(this.K) != 0) {
         return false;
      } else if(this.r != net.r.r.class && this.r != net.r.h.class) {
         List var2 = this.k.hl.L(this.r, this.Q(this.h()), this.D);
         if(var2.isEmpty()) {
            return false;
         } else {
            Collections.sort(var2, this.X);
            this.T = (net.ne.a)var2.get(0);
            return true;
         }
      } else {
         this.T = this.k.hl.m(this.k.b, this.k.hS + (double)this.k.A(), this.k.hr, this.h(), this.h(), new Function() {
            @Nullable
            public Double b(@Nullable net.r.r var1) {
               b.q();
               ks var3 = var1.U(z2.HEAD);
               if(var3.Z() == net.nb.j.Y9) {
                  int var4 = var3.z();
                  boolean var5 = o8.this.k instanceof net.nk.g && var4 == 0;
                  boolean var6 = o8.this.k instanceof fu && var4 == 2;
                  boolean var7 = o8.this.k instanceof net.nk.m && var4 == 4;
               }

               return Double.valueOf(1.0D);
            }

            private static xn a(xn var0) {
               return var0;
            }
         }, this.D);
         return this.T != null;
      }
   }

   protected net.u.e Q(double var1) {
      return this.k.i().f(var1, 4.0D, var1);
   }

   public void I() {
      this.k.C(this.T);
      super.I();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class j implements Comparator {
      private final net.ne.l o;

      public j(net.ne.l var1) {
         this.o = var1;
      }

      public int N(net.ne.l var1, net.ne.l var2) {
         b.E();
         double var4 = this.o.F(var1);
         double var6 = this.o.F(var2);
         return Double.compare(var4, var6) < 0?-1:(Double.compare(var4, var6) > 0?1:0);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
