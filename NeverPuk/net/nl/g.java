package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.e;
import net.nl.f;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zc;

public class g extends v {
   private final z1 o;
   private int t;
   private int G;
   private int U;
   private int Z;

   public g(net.r.i var1, z1 var2) {
      this.o = var2;
      this.U(new o(var2, 0, 56, 17));
      this.U(new f(var2, 1, 56, 53));
      this.U(new e(var1.v, var2, 2, 116, 35));
      byte var3 = 0;
      int var4 = 0;

      while(true) {
         this.U(new o(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         ++var4;
      }
   }

   public void w(zc var1) {
      super.w(var1);
      var1.t(this, this.o);
   }

   public void u() {
      super.u();

      for(int var1 = 0; var1 < this.E.size(); ++var1) {
         zc var2 = (zc)this.E.get(var1);
         if(this.t != this.o.e(2)) {
            var2.A(this, 2, this.o.e(2));
         }

         if(this.U != this.o.e(0)) {
            var2.A(this, 0, this.o.e(0));
         }

         if(this.Z != this.o.e(1)) {
            var2.A(this, 1, this.o.e(1));
         }

         if(this.G != this.o.e(3)) {
            var2.A(this, 3, this.o.e(3));
         }
      }

      this.t = this.o.e(2);
      this.U = this.o.e(0);
      this.Z = this.o.e(1);
      this.G = this.o.e(3);
   }

   public void k(int var1, int var2) {
      this.o.Z(var1, var2);
   }

   public boolean N(net.r.r var1) {
      return this.o.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      ks var4 = ks.a;
      v.Q();
      o var5 = (o)this.e.get(var2);
      if(var5 != null && var5.T()) {
         ks var6 = var5.y();
         var4 = var6.s();
         if(var2 == 2) {
            if(!this.V(var6, 3, 39, true)) {
               return ks.a;
            }

            var5.q(var6, var4);
         }

         if(var2 != 1 && var2 != 0) {
            if(!net.cr.i.z().Q(var6).B()) {
               if(!this.V(var6, 0, 1, false)) {
                  return ks.a;
               }
            } else if(net.ni.l.Z(var6)) {
               if(!this.V(var6, 1, 2, false)) {
                  return ks.a;
               }
            } else if(var2 >= 3 && var2 < 30) {
               if(!this.V(var6, 30, 39, false)) {
                  return ks.a;
               }
            } else if(var2 >= 30 && var2 < 39 && !this.V(var6, 3, 30, false)) {
               return ks.a;
            }
         } else if(!this.V(var6, 3, 39, false)) {
            return ks.a;
         }

         if(var6.B()) {
            var5.e(ks.a);
         }

         var5.y();
         if(var6.U() == var4.U()) {
            return ks.a;
         }

         var5.H(var1, var6);
      }

      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
