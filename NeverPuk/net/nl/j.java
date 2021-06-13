package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.s;
import net.nl.t;
import net.nl.v;
import net.nl.z1;
import net.nl.z2;
import net.nl.ze;

public class j extends v {
   private static final z2[] u = new z2[]{z2.HEAD, z2.CHEST, z2.LEGS, z2.FEET};
   public ze T = new ze(this, 2, 2);
   public s W = new s();
   public boolean c;
   private final net.r.r A;

   public j(net.r.i var1, boolean var2, net.r.r var3) {
      this.c = var2;
      this.A = var3;
      this.U(new t(var1.v, this.T, this.W, 0, 154, 28));
      byte var4 = 0;
      int var5 = 0;

      while(true) {
         this.U(new o(this.T, var5 + var4 * 2, 98 + var5 * 18, 18 + var4 * 18));
         ++var5;
      }
   }

   public void d(z1 var1) {
      this.u(this.A.hl, this.A, this.T, this.W);
   }

   public void K(net.r.r var1) {
      super.K(var1);
      this.W.T();
      if(!var1.hl.x) {
         this.o(var1, var1.hl, this.T);
      }

   }

   public boolean N(net.r.r var1) {
      return true;
   }

   public ks a(net.r.r var1, int var2) {
      v.Q();
      ks var4 = ks.a;
      o var5 = (o)this.e.get(var2);
      if(var5 != null && var5.T()) {
         ks var6 = var5.y();
         var4 = var6.s();
         z2 var7 = net.ne.y.M(var4);
         if(var2 == 0) {
            if(!this.V(var6, 9, 45, true)) {
               return ks.a;
            }

            var5.q(var6, var4);
         }

         if(var2 >= 1 && var2 < 5) {
            if(!this.V(var6, 9, 45, false)) {
               return ks.a;
            }
         } else if(var2 >= 5 && var2 < 9) {
            if(!this.V(var6, 9, 45, false)) {
               return ks.a;
            }
         } else {
            if(var7.x() == z2.w.ARMOR && !((o)this.e.get(8 - var7.l())).T()) {
               int var8 = 8 - var7.l();
               if(!this.V(var6, var8, var8 + 1, false)) {
                  return ks.a;
               }
            }

            if(var7 == z2.OFFHAND && !((o)this.e.get(45)).T()) {
               if(!this.V(var6, 45, 46, false)) {
                  return ks.a;
               }
            } else if(var2 >= 9 && var2 < 36) {
               if(!this.V(var6, 36, 45, false)) {
                  return ks.a;
               }
            } else if(var2 >= 36 && var2 < 45) {
               if(!this.V(var6, 9, 36, false)) {
                  return ks.a;
               }
            } else if(!this.V(var6, 9, 45, false)) {
               return ks.a;
            }
         }

         if(var6.B()) {
            var5.e(ks.a);
         }

         var5.y();
         if(var6.U() == var4.U()) {
            return ks.a;
         }

         ks var9 = var5.H(var1, var6);
         var1.Y(var9, false);
      }

      return var4;
   }

   public boolean g(ks var1, o var2) {
      return var2.M != this.W && super.g(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
