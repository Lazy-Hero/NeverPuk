package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.a;
import net.y9.g3;
import net.y9.l;
import net.yz.aq;

public class i extends a {
   public static final net.yr.l F = net.yr.l.J("age", 0, 3);

   public i() {
      this.r(this.b.T().s(F, Integer.valueOf(0)));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(F)).intValue();
   }

   public net.yw.n D(int var1) {
      return this.p().s(F, Integer.valueOf(net.u.t.g(var1, 0, 3)));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if((var4.nextInt(3) == 0 || this.Q(var1, var2) < 4) && var1.y(var2) > 11 - ((Integer)var3.i(F)).intValue() - var3.K()) {
         this.b(var1, var2, var3, var4, true);
      } else {
         var1.c(var2, this, net.u.t.A(var4, 20, 40));
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(var4 == this) {
         int var6 = this.Q(var2, var3);
         if(var6 < 2) {
            this.h(var2, var3);
         }
      }

   }

   private int Q(net.yv.r var1, net.u.j var2) {
      int var3 = 0;

      for(aq var7 : aq.values()) {
         if(var1.Z(var2.C(var7)).Q() == this) {
            ++var3;
            if(var3 >= 4) {
               return var3;
            }
         }
      }

      return var3;
   }

   protected void b(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4, boolean var5) {
      g3.v.w();
      int var7 = ((Integer)var3.i(F)).intValue();
      if(var7 < 3) {
         var1.k(var2, var3.s(F, Integer.valueOf(var7 + 1)), 2);
         var1.c(var2, this, net.u.t.A(var4, 20, 40));
      }

      this.h(var1, var2);
      if(var5) {
         aq[] var8 = aq.values();
         int var9 = var8.length;
         int var10 = 0;
         if(var10 < var9) {
            aq var11 = var8[var10];
            net.u.j var12 = var2.C(var11);
            net.yw.n var13 = var1.Z(var12);
            if(var13.Q() == this) {
               this.b(var1, var12, var13, var4, false);
            }

            ++var10;
         }
      }

   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F});
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return ks.a;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
