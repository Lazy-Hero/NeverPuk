package net.ni;

import javax.annotation.Nullable;
import net.xn;
import net.ni.r;
import net.ni.v;
import net.ni.w;
import net.yz.ae;
import net.yz.m_;

public class u extends v implements net.yz.i {
   private final r k = new r() {
      public void Y(int var1) {
         u.this.J.x(u.this.S, net.nb.f.uw, var1, 0);
      }

      public net.yv.r k() {
         return u.this.J;
      }

      public net.u.j P() {
         return u.this.S;
      }

      public void U(ae var1) {
         w.C();
         super.U(var1);
         if(this.k() != null) {
            net.yw.n var3 = this.k().Z(this.P());
            this.k().V(u.this.S, var3, var3, 4);
         }

      }

      private static xn b(xn var0) {
         return var0;
      }
   };

   public static void V(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.c0.w() {
         public net.nj.f X(net.c0.l var1, net.nj.f var2, int var3) {
            int[] var4 = w.C();
            if(v.p(u.class).equals(new m_(var2.J("id")))) {
               if(var2.K("SpawnPotentials", 9)) {
                  net.nj.h var5 = var2.A("SpawnPotentials", 10);
                  int var6 = 0;
                  if(var6 < var5.z()) {
                     net.nj.f var7 = var5.i(var6);
                     var7.K("Entity", var1.w(net.c0.q.ENTITY, var7.o("Entity"), var3));
                     ++var6;
                  }
               }

               var2.K("SpawnData", var1.w(net.c0.q.ENTITY, var2.o("SpawnData"), var3));
            }

            return var2;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.k.u(var1);
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      this.k.y(var1);
      return var1;
   }

   public void m() {
      this.k.i();
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 1, this.e());
   }

   public net.nj.f e() {
      net.nj.f var1 = this.b(new net.nj.f());
      var1.A("SpawnPotentials");
      return var1;
   }

   public boolean q(int var1, int var2) {
      int[] var3 = w.C();
      return this.k.l(var1) || super.q(var1, var2);
   }

   public boolean u() {
      return true;
   }

   public r H() {
      return this.k;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
