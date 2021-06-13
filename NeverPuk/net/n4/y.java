package net.n4;

import net.xn;
import net.n0.ks;
import net.n4.h;
import net.n4.i;
import net.n4.k;
import net.u.d;
import net.y9.zz;
import net.yv.r;
import net.yz.aq;

public class y implements k {
   private static int[] m;

   public final ks M(i var1, ks var2) {
      ks var3 = this.B(var1, var2);
      this.Q(var1);
      this.F(var1, (aq)var1.K().i(zz.H));
      return var3;
   }

   protected ks B(i var1, ks var2) {
      aq var3 = (aq)var1.K().i(zz.H);
      h var4 = zz.S(var1);
      ks var5 = var2.w(1);
      l(var1.v(), var5, 6, var3, var4);
      return var2;
   }

   public static void l(r var0, ks var1, int var2, aq var3, h var4) {
      double var6 = var4.e();
      e();
      double var8 = var4.A();
      double var10 = var4.x();
      if(var3.r() == aq.l.Y) {
         var8 -= 0.125D;
         d.h(new d[3]);
      }

      var8 = var8 - 0.15625D;
      net.nm.i var12 = new net.nm.i(var0, var6, var8, var10, var1);
      double var13 = var0.G.nextDouble() * 0.1D + 0.2D;
      var12.hf = (double)var3.v() * var13;
      var12.K = 0.20000000298023224D;
      var12.J = (double)var3.P() * var13;
      var12.hf += var0.G.nextGaussian() * 0.007499999832361937D * (double)var2;
      var12.K += var0.G.nextGaussian() * 0.007499999832361937D * (double)var2;
      var12.J += var0.G.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.S(var12);
   }

   protected void Q(i var1) {
      var1.v().s(1000, var1.X(), 0);
   }

   protected void F(i var1, aq var2) {
      var1.v().s(2000, var1.X(), this.J(var2));
   }

   private int J(aq var1) {
      return var1.v() + 1 + (var1.P() + 1) * 3;
   }

   public static void Q(int[] var0) {
      m = var0;
   }

   public static int[] e() {
      return m;
   }

   private static xn c(xn var0) {
      return var0;
   }

   static {
      if(e() != null) {
         Q(new int[2]);
      }

   }
}
