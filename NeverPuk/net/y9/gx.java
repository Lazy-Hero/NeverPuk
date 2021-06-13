package net.y9;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.xn;
import net.y9.g3;
import net.y9.g5;
import net.y9.l;
import net.y9.r9;
import net.yz.aq;

public class gx extends g5 {
   int o;

   protected gx(net.y1.l var1) {
      super(var1);
   }

   private void F(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var1.k(var2, N(this.C).p().s(J, var3.i(J)), 2);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      g3.v.w();
      int var6 = ((Integer)var3.i(J)).intValue();
      byte var7 = 1;
      if(this.C == net.y1.l.U && !var1.F.T()) {
         var7 = 2;
      }

      int var8 = this.u(var1);
      if(var6 > 0) {
         int var9 = -100;
         this.o = 0;
         Iterator var10 = aq.u.HORIZONTAL.iterator();
         if(var10.hasNext()) {
            aq var11 = (aq)var10.next();
            var9 = this.s(var1, var2.C(var11), var9);
         }

         int var15 = var9 + var7;
         var15 = -1;
         int var18 = this.P(var1.Z(var2.h()));
         if(var18 >= 0) {
            if(var18 >= 8) {
               ;
            }

            var15 = var18 + 8;
         }

         if(this.o >= 2 && this.C == net.y1.l.p) {
            net.yw.n var12 = var1.Z(var2.b());
            if(var12.n().B()) {
               var15 = 0;
            }

            if(var12.n() == this.C && ((Integer)var12.i(J)).intValue() == 0) {
               var15 = 0;
            }
         }

         if(this.C == net.y1.l.U && var6 < 8 && var15 > var6 && var4.nextInt(4) != 0) {
            var8 *= 4;
         }

         if(var15 == var6) {
            this.F(var1, var2, var3);
         }

         var6 = var15;
         var1.J(var2);
         var3 = var3.s(J, Integer.valueOf(var15));
         var1.k(var2, var3, 2);
         var1.c(var2, this, var8);
         var1.b(var2, this, false);
      }

      this.F(var1, var2, var3);
      net.yw.n var14 = var1.Z(var2.b());
      if(this.R(var1, var2.b(), var14)) {
         if(this.C == net.y1.l.U && var1.Z(var2.b()).n() == net.y1.l.p) {
            var1.U(var2.b(), net.nb.f.oy.p());
            this.N(var1, var2.b());
            return;
         }

         if(var6 >= 8) {
            this.b(var1, var2.b(), var14, var6);
         }

         this.b(var1, var2.b(), var14, var6 + 8);
      }

      if(var6 >= 0 && (var6 == 0 || this.u(var1, var2.b(), var14))) {
         Set var17 = this.R(var1, var2);
         int var19 = var6 + var7;
         if(var6 >= 8) {
            var19 = 1;
         }

         if(var19 >= 8) {
            return;
         }

         Iterator var20 = var17.iterator();
         if(var20.hasNext()) {
            aq var13 = (aq)var20.next();
            this.b(var1, var2.C(var13), var1.Z(var2.C(var13)), var19);
         }
      }

   }

   private void b(net.yv.r var1, net.u.j var2, net.yw.n var3, int var4) {
      if(this.R(var1, var2, var3)) {
         if(var3.n() != net.y1.l.q) {
            if(this.C == net.y1.l.U) {
               this.N(var1, var2);
            } else {
               var3.Q().N(var1, var2, var3, 0);
            }
         }

         var1.k(var2, this.p().s(J, Integer.valueOf(var4)), 3);
      }

   }

   private int h(net.yv.r var1, net.u.j var2, int var3, aq var4) {
      int var5 = 1000;

      for(aq var7 : aq.u.HORIZONTAL) {
         if(var7 != var4) {
            net.u.j var8 = var2.C(var7);
            net.yw.n var9 = var1.Z(var8);
            if(!this.u(var1, var8, var9) && (var9.n() != this.C || ((Integer)var9.i(J)).intValue() > 0)) {
               if(!this.u(var1, var8.b(), var9)) {
                  return var3;
               }

               if(var3 < this.g(var1)) {
                  int var10 = this.h(var1, var8, var3 + 1, var7.f());
                  if(var10 < var5) {
                     var5 = var10;
                  }
               }
            }
         }
      }

      return var5;
   }

   private int g(net.yv.r var1) {
      return this.C == net.y1.l.U && !var1.F.T()?2:4;
   }

   private Set R(net.yv.r var1, net.u.j var2) {
      boolean var3 = true;
      EnumSet var4 = EnumSet.noneOf(aq.class);

      for(aq var6 : aq.u.HORIZONTAL) {
         net.u.j var7 = var2.C(var6);
         net.yw.n var8 = var1.Z(var7);
         if(!this.u(var1, var7, var8) && (var8.n() != this.C || ((Integer)var8.i(J)).intValue() > 0)) {
            if(this.u(var1, var7.b(), var1.Z(var7.b()))) {
               int var9 = this.h(var1, var7, 1, var6.f());
            } else {
               boolean var10 = false;
            }

            var4.clear();
            var4.add(var6);
         }
      }

      return var4;
   }

   private boolean u(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      l var4 = var1.Z(var2).Q();
      return !(var4 instanceof r9) && var4 != net.nb.f.uL && var4 != net.nb.f.K && var4 != net.nb.f.dF?var4.C == net.y1.l.s || var4.C == net.y1.l.j || var4.C.f():true;
   }

   protected int s(net.yv.r var1, net.u.j var2, int var3) {
      int var4 = this.P(var1.Z(var2));
      return var3;
   }

   private boolean R(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.y1.l var4 = var3.n();
      return var4 != this.C && var4 != net.y1.l.U && !this.u(var1, var2, var3);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.r(var1, var2, var3)) {
         var1.c(var2, this, this.u(var1));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
