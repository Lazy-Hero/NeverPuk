package net.nl;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.nl.v;
import net.nl.z1;

public class z3 {
   private static final Random J = new Random();

   public static void Z(net.yv.r var0, net.u.j var1, z1 var2) {
      O(var0, (double)var1.t(), (double)var1.h(), (double)var1.y(), var2);
   }

   public static void q(net.yv.r var0, net.ne.l var1, z1 var2) {
      O(var0, var1.b, var1.hS, var1.hr, var2);
   }

   private static void O(net.yv.r var0, double var1, double var3, double var5, z1 var7) {
      v.Q();
      int var9 = 0;
      if(var9 < var7.e()) {
         ks var10 = var7.A(var9);
         if(!var10.B()) {
            x(var0, var1, var3, var5, var10);
         }

         ++var9;
      }

   }

   public static void x(net.yv.r var0, double var1, double var3, double var5, ks var7) {
      v.N();
      float var9 = J.nextFloat() * 0.8F + 0.1F;
      float var10 = J.nextFloat() * 0.8F + 0.1F;
      float var11 = J.nextFloat() * 0.8F + 0.1F;
      if(!var7.B()) {
         net.nm.i var12 = new net.nm.i(var0, var1 + (double)var9, var3 + (double)var10, var5 + (double)var11, var7.w(J.nextInt(21) + 10));
         float var10000 = 0.05F;
         var12.hf = J.nextGaussian() * 0.05000000074505806D;
         var12.K = J.nextGaussian() * 0.05000000074505806D + 0.20000000298023224D;
         var12.J = J.nextGaussian() * 0.05000000074505806D;
         var0.S(var12);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
