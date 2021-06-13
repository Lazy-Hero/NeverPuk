package net.b;

import net.xn;
import net.b.c;
import net.b.i;
import net.b.m;
import net.b.n;
import net.b.t;
import net.b.u;
import net.nb.f;
import net.ne.y;
import net.u.j;

public class s extends n {
   private boolean M;

   public s(y var1, net.yv.r var2) {
      super(var1, var2);
   }

   protected u O() {
      this.e = new i();
      this.e.V(true);
      return new u(this.e);
   }

   protected boolean w() {
      return this.U.k || this.Q() && this.c() || this.U.M();
   }

   protected net.u.r U() {
      return new net.u.r(this.U.b, (double)this.o(), this.U.hr);
   }

   public t S(j var1) {
      if(this.P.Z(var1).n() == net.y1.l.q) {
         j var2;
         for(var2 = var1.b(); var2.h() > 0 && this.P.Z(var2).n() == net.y1.l.q; var2 = var2.b()) {
            ;
         }

         if(var2.h() > 0) {
            return super.S(var2.h());
         }

         while(var2.h() < this.P.Z() && this.P.Z(var2).n() == net.y1.l.q) {
            var2 = var2.h();
         }

         var1 = var2;
      }

      if(!this.P.Z(var1).n().B()) {
         return super.S(var1);
      } else {
         j var3;
         for(var3 = var1.h(); var3.h() < this.P.Z() && this.P.Z(var3).n().B(); var3 = var3.h()) {
            ;
         }

         return super.S(var3);
      }
   }

   public t v(net.ne.l var1) {
      return this.S(new j(var1));
   }

   private int o() {
      if(this.U.p() && this.Q()) {
         int var1 = (int)this.U.i().u;
         net.y9.l var2 = this.P.Z(new j(net.u.t.L(this.U.b), var1, net.u.t.L(this.U.hr))).Q();
         int var3 = 0;

         while(var2 == f.dy || var2 == f.uM) {
            ++var1;
            var2 = this.P.Z(new j(net.u.t.L(this.U.b), var1, net.u.t.L(this.U.hr))).Q();
            ++var3;
            if(var3 > 16) {
               return (int)this.U.i().u;
            }
         }

         return var1;
      } else {
         return (int)(this.U.i().u + 0.5D);
      }
   }

   protected void q() {
      super.q();
      if(this.M) {
         if(this.P.V(new j(net.u.t.L(this.U.b), (int)(this.U.i().u + 0.5D), net.u.t.L(this.U.hr)))) {
            return;
         }

         for(int var1 = 0; var1 < this.a.R(); ++var1) {
            c var2 = this.a.y(var1);
            if(this.P.V(new j(var2.H, var2.E, var2.i))) {
               this.a.H(var1 - 1);
               return;
            }
         }
      }

   }

   protected boolean D(net.u.r var1, net.u.r var2, int var3, int var4, int var5) {
      n.q();
      int var7 = net.u.t.L(var1.p);
      int var8 = net.u.t.L(var1.a);
      double var9 = var2.p - var1.p;
      double var11 = var2.a - var1.a;
      double var13 = var9 * var9 + var11 * var11;
      if(var13 < 1.0E-8D) {
         return false;
      } else {
         double var15 = 1.0D / Math.sqrt(var13);
         var9 = var9 * var15;
         var11 = var11 * var15;
         var3 = var3 + 2;
         var5 = var5 + 2;
         if(!this.u(var7, (int)var1.H, var8, var3, var4, var5, var1, var9, var11)) {
            return false;
         } else {
            var3 = var3 - 2;
            var5 = var5 - 2;
            double var17 = 1.0D / Math.abs(var9);
            double var19 = 1.0D / Math.abs(var11);
            double var21 = (double)var7 - var1.p;
            double var23 = (double)var8 - var1.a;
            if(Double.compare(var9, 0.0D) >= 0) {
               ++var21;
            }

            if(Double.compare(var11, 0.0D) >= 0) {
               ++var23;
            }

            var21 = var21 / var9;
            var23 = var23 / var11;
            int var25 = Double.compare(var9, 0.0D) < 0?-1:1;
            int var26 = Double.compare(var11, 0.0D) < 0?-1:1;
            int var27 = net.u.t.L(var2.p);
            int var28 = net.u.t.L(var2.a);
            int var29 = var27 - var7;
            int var30 = var28 - var8;

            while(var29 * var25 > 0 || var30 * var26 > 0) {
               if(Double.compare(var21, var23) < 0) {
                  var21 += var17;
                  var7 += var25;
                  var29 = var27 - var7;
               }

               var23 += var19;
               var8 += var26;
               var30 = var28 - var8;
               if(!this.u(var7, (int)var1.H, var8, var3, var4, var5, var1, var9, var11)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean u(int var1, int var2, int var3, int var4, int var5, int var6, net.u.r var7, double var8, double var10) {
      int var12 = var1 - var4 / 2;
      int var13 = var3 - var6 / 2;
      if(!this.o(var12, var2, var13, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for(int var14 = var12; var14 < var12 + var4; ++var14) {
            for(int var15 = var13; var15 < var13 + var6; ++var15) {
               double var16 = (double)var14 + 0.5D - var7.p;
               double var18 = (double)var15 + 0.5D - var7.a;
               if(var16 * var8 + var18 * var10 >= 0.0D) {
                  m var20 = this.e.V(this.P, var14, var2 - 1, var15, this.U, var4, var5, var6, true, true);
                  if(var20 == m.WATER) {
                     return false;
                  }

                  if(var20 == m.LAVA) {
                     return false;
                  }

                  if(var20 == m.OPEN) {
                     return false;
                  }

                  var20 = this.e.V(this.P, var14, var2, var15, this.U, var4, var5, var6, true, true);
                  float var21 = this.U.Q(var20);
                  if(var21 < 0.0F || var21 >= 8.0F) {
                     return false;
                  }

                  if(var20 == m.DAMAGE_FIRE || var20 == m.DANGER_FIRE || var20 == m.DAMAGE_OTHER) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private boolean o(int var1, int var2, int var3, int var4, int var5, int var6, net.u.r var7, double var8, double var10) {
      for(j var13 : j.e(new j(var1, var2, var3), new j(var1 + var4 - 1, var2 + var5 - 1, var3 + var6 - 1))) {
         double var14 = (double)var13.t() + 0.5D - var7.p;
         double var16 = (double)var13.y() + 0.5D - var7.a;
         if(var14 * var8 + var16 * var10 >= 0.0D) {
            net.y9.l var18 = this.P.Z(var13).Q();
            if(!var18.c(this.P, var13)) {
               return false;
            }
         }
      }

      return true;
   }

   public void D(boolean var1) {
      this.e.s(var1);
   }

   public void B(boolean var1) {
      this.e.V(var1);
   }

   public boolean y() {
      return this.e.l();
   }

   public void f(boolean var1) {
      this.e.O(var1);
   }

   public boolean Q() {
      return this.e.R();
   }

   public void P(boolean var1) {
      this.M = var1;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
