package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.zz;
import net.yz.aq;

public class z3 extends zz {
   private final net.n4.k Y = new net.n4.y();

   protected net.n4.k H(ks var1) {
      return this.Y;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.x();
   }

   protected void o(net.yv.r var1, net.u.j var2) {
      g3.v.w();
      net.y9.z var4 = new net.y9.z(var1, var2);
      net.ni.p var5 = (net.ni.p)var4.L();
      if(var5 != null) {
         int var6 = var5.b();
         var1.s(1001, var2, 0);
         ks var7 = var5.A(var6);
         if(!var7.B()) {
            aq var8 = (aq)var1.Z(var2).i(H);
            net.u.j var9 = var2.C(var8);
            net.nl.z1 var10 = net.ni.i.c(var1, (double)var9.t(), (double)var9.h(), (double)var9.y());
            this.Y.M(var4, var7);
            ks var11 = net.ni.i.Q(var5, var10, var7.s().w(1), var8.f());
            if(var11.B()) {
               var11 = var7.s();
               var11.H(1);
            }

            var11 = var7.s();
            var5.S(var6, var11);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
