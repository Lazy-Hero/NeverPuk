package net.nl;

import net.b2;
import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zc;

public class i extends v {
   private final z1 g;
   private final o T;
   private int o;
   private int A;

   public i(net.r.i var1, z1 var2) {
      this.g = var2;
      this.U(new i.y(var2, 0, 56, 51));
      this.U(new i.y(var2, 1, 79, 58));
      this.U(new i.y(var2, 2, 102, 51));
      this.T = this.U(new i.b(var2, 3, 79, 17));
      this.U(new i.u(var2, 4, 17, 17));
      byte var3 = 0;
      int var4 = 0;

      while(true) {
         this.U(new o(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
         ++var4;
      }
   }

   public void w(zc var1) {
      super.w(var1);
      var1.t(this, this.g);
   }

   public void u() {
      super.u();

      for(int var1 = 0; var1 < this.E.size(); ++var1) {
         zc var2 = (zc)this.E.get(var1);
         if(this.o != this.g.e(0)) {
            var2.A(this, 0, this.g.e(0));
         }

         if(this.A != this.g.e(1)) {
            var2.A(this, 1, this.g.e(1));
         }
      }

      this.o = this.g.e(0);
      this.A = this.g.e(1);
   }

   public void k(int var1, int var2) {
      this.g.Z(var1, var2);
   }

   public boolean N(net.r.r var1) {
      return this.g.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      v.N();
      ks var4 = ks.a;
      o var5 = (o)this.e.get(var2);
      if(var5 != null && var5.T()) {
         ks var6 = var5.y();
         var4 = var6.s();
         if((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if(this.T.s(var6)) {
               if(!this.V(var6, 3, 4, false)) {
                  return ks.a;
               }
            } else if(i.y.T(var4) && var4.U() == 1) {
               if(!this.V(var6, 0, 3, false)) {
                  return ks.a;
               }
            } else if(i.u.M(var4)) {
               if(!this.V(var6, 4, 5, false)) {
                  return ks.a;
               }
            } else if(var2 >= 5 && var2 < 32) {
               if(!this.V(var6, 32, 41, false)) {
                  return ks.a;
               }
            } else if(var2 >= 32 && var2 < 41) {
               if(!this.V(var6, 5, 32, false)) {
                  return ks.a;
               }
            } else if(!this.V(var6, 5, 41, false)) {
               return ks.a;
            }
         } else {
            if(!this.V(var6, 5, 41, true)) {
               return ks.a;
            }

            var5.q(var6, var4);
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

   static class b extends o {
      public b(z1 var1, int var2, int var3, int var4) {
         super(var1, var2, var3, var4);
      }

      public boolean s(ks var1) {
         return net.n_.j.K(var1);
      }

      public int t() {
         return 64;
      }
   }

   static class u extends o {
      public u(z1 var1, int var2, int var3, int var4) {
         super(var1, var2, var3, var4);
      }

      public boolean s(ks var1) {
         return M(var1);
      }

      public static boolean M(ks var0) {
         return var0.Z() == net.nb.j.H;
      }

      public int t() {
         return 64;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class y extends o {
      public y(z1 var1, int var2, int var3, int var4) {
         super(var1, var2, var3, var4);
      }

      public boolean s(ks var1) {
         return T(var1);
      }

      public int t() {
         return 1;
      }

      public ks H(net.r.r var1, ks var2) {
         net.n_.b var3 = net.n_.y.h(var2);
         if(var1 instanceof net.r.h) {
            b2.b.y((net.r.h)var1, var3);
         }

         super.H(var1, var2);
         return var2;
      }

      public static boolean T(ks var0) {
         v.Q();
         net.n0.y var2 = var0.Z();
         return var2 == net.nb.j.I || var2 == net.nb.j.YD || var2 == net.nb.j.Wg || var2 == net.nb.j.SG;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
