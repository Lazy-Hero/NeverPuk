package net.z;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.z.g;
import net.z.m;
import net.z.th;
import net.z.tl;

public class u extends net.z.z {
   private final List o;

   public u(net.nn.j var1, int var2, int var3, int var4, int var5, int var6, net.nr.d... var7) {
      super(var1, var2, var3, var4, var5, var6);
      g.B();
      this.o = Lists.newArrayList();
      this.K = false;
      int var9 = 0;
      if(var9 < var7.length) {
         net.nr.d var10 = var7[var9];
         net.nr.d var11 = var9 < var7.length - 1?var7[var9 + 1]:null;
         m var12 = this.x(var1, var2 / 2 - 155, 0, var10);
         m var13 = this.x(var1, var2 / 2 - 155 + 160, 0, var11);
         this.o.add(new u.o(var12, var13));
         var9 = var9 + 2;
      }

   }

   private m x(net.nn.j var1, int var2, int var3, net.nr.d var4) {
      boolean var5 = g.C();
      if(var4 == null) {
         return null;
      } else {
         int var6 = var4.p();
         return (m)(var4.k()?new tl(var6, var2, var3, var4):new th(var6, var2, var3, var4, var1.T.L(var4)));
      }
   }

   public u.o c(int var1) {
      return (u.o)this.o.get(var1);
   }

   protected int V() {
      return this.o.size();
   }

   public int C() {
      return 400;
   }

   protected int I() {
      return super.I() + 32;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class o implements net.z.z {
      private final net.nn.j I = net.nn.j.b();
      private final m d;
      private final m u;

      public o(m var1, m var2) {
         this.d = var1;
         this.u = var2;
      }

      public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, float var9) {
         if(this.d != null) {
            this.d.R = var3;
            this.d.Z(this.I, var6, var7, var9);
         }

         if(this.u != null) {
            this.u.R = var3;
            this.u.Z(this.I, var6, var7, var9);
         }

      }

      public boolean i(int var1, int var2, int var3, int var4, int var5, int var6) {
         boolean var7 = g.C();
         if(this.d.X(this.I, var2, var3)) {
            if(this.d instanceof th) {
               this.I.T.T(((th)this.d).P(), 1);
               this.d.J = this.I.T.L(net.nr.d.i(this.d.g));
            }

            return true;
         } else if(this.u != null && this.u.X(this.I, var2, var3)) {
            if(this.u instanceof th) {
               this.I.T.T(((th)this.u).P(), 1);
               this.u.J = this.I.T.L(net.nr.d.i(this.u.g));
            }

            return true;
         } else {
            return false;
         }
      }

      public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
         if(this.d != null) {
            this.d.A(var2, var3);
         }

         if(this.u != null) {
            this.u.A(var2, var3);
         }

      }

      public void h(int var1, int var2, int var3, float var4) {
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
