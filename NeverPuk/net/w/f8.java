package net.w;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.w.f;

public class f8 extends f {
   private boolean u;
   private f8.i H;
   private net.u.j J;

   public void c(f8.i var1) {
      this.H = var1;
   }

   public void N(boolean var1) {
      this.u = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.h();
      if(this.H == null) {
         throw new IllegalStateException("Decoration requires priming with a spike");
      } else {
         int var5 = this.H.B();
         Iterator var6 = net.u.j.X(new net.u.j(var3.t() - var5, 0, var3.y() - var5), new net.u.j(var3.t() + var5, this.H.M() + 10, var3.y() + var5)).iterator();
         if(var6.hasNext()) {
            net.u.j var7 = (net.u.j)var6.next();
            if(Double.compare(var7.s((double)var3.t(), (double)var7.h(), (double)var3.y()), (double)(var5 * var5 + 1)) <= 0 && var7.h() < this.H.M()) {
               this.k(var1, var7, net.nb.f.c.p());
            }

            if(var7.h() > 65) {
               this.k(var1, var7, net.nb.f.ou.p());
            }
         }

         if(this.H.B()) {
            int var9 = -2;
            int var12 = -2;
            if(net.u.t.l(var9) == 2 || net.u.t.l(var12) == 2) {
               this.k(var1, new net.u.j(var3.t() + var9, this.H.M(), var3.y() + var12), net.nb.f.d8.p());
               this.k(var1, new net.u.j(var3.t() + var9, this.H.M() + 1, var3.y() + var12), net.nb.f.d8.p());
               this.k(var1, new net.u.j(var3.t() + var9, this.H.M() + 2, var3.y() + var12), net.nb.f.d8.p());
            }

            this.k(var1, new net.u.j(var3.t() + var9, this.H.M() + 3, var3.y() + var12), net.nb.f.d8.p());
            ++var12;
            ++var9;
         }

         net.nm.j var11 = new net.nm.j(var1);
         var11.x(this.J);
         var11.T(this.u);
         var11.S((double)((float)var3.t() + 0.5F), (double)(this.H.M() + 1), (double)((float)var3.y() + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
         var1.S(var11);
         this.k(var1, new net.u.j(var3.t(), this.H.M(), var3.y()), net.nb.f.T8.p());
         if(net.u.d.y() == null) {
            ++var4;
            f.V(var4);
         }

         return true;
      }
   }

   public void t(@Nullable net.u.j var1) {
      this.J = var1;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   public static class i {
      private final int g;
      private final int i;
      private final int F;
      private final int R;
      private final boolean D;
      private final net.u.e m;

      public i(int var1, int var2, int var3, int var4, boolean var5) {
         this.g = var1;
         this.i = var2;
         this.F = var3;
         this.R = var4;
         this.D = var5;
         this.m = new net.u.e((double)(var1 - var3), 0.0D, (double)(var2 - var3), (double)(var1 + var3), 256.0D, (double)(var2 + var3));
      }

      public boolean S(net.u.j var1) {
         f.j();
         int var3 = this.g - this.F;
         int var4 = this.i - this.F;
         return var1.t() == (var3 & -16) && var1.y() == (var4 & -16);
      }

      public int z() {
         return this.g;
      }

      public int I() {
         return this.i;
      }

      public int B() {
         return this.F;
      }

      public int M() {
         return this.R;
      }

      public boolean B() {
         return this.D;
      }

      public net.u.e y() {
         return this.m;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
