package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.w.f0;
import net.y9.lh;

public class d extends i {
   private final net.w.f i = new f0(net.nb.f.uX.p().s(lh.a, lh.m.STONE), 9);
   private final net.w.h r = new net.w.h(false);
   private final d.y a;

   protected d(d.y var1, i.g var2) {
      super(var2);
      if(var1 == d.y.EXTRA_TREES) {
         this.K.E = 3;
      }

      this.v.add(new i.w(net.yn.l.class, 5, 4, 6));
      this.a = var1;
   }

   public net.w.x q(Random var1) {
      return (net.w.x)(var1.nextInt(3) > 0?this.r:super.q(var1));
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      i9.M();
      super.f(var1, var2, var3);
      int var5 = 3 + var2.nextInt(6);
      int var6 = 0;
      if(var6 < var5) {
         int var7 = var2.nextInt(16);
         int var8 = var2.nextInt(28) + 4;
         int var9 = var2.nextInt(16);
         net.u.j var10 = var3.F(var7, var8, var9);
         if(var1.Z(var10).Q() == net.nb.f.oy) {
            var1.k(var10, net.nb.f.m.p(), 2);
         }

         ++var6;
      }

      var6 = 0;
      int var14 = var2.nextInt(16);
      int var15 = var2.nextInt(64);
      int var16 = var2.nextInt(16);
      this.i.K(var1, var2, var3.F(var14, var15, var16));
      ++var6;
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      this.j = net.nb.f.p.p();
      this.y = net.nb.f.dl.p();
      if((var6 < -1.0D || var6 > 2.0D) && this.a == d.y.MUTATED) {
         this.j = net.nb.f.D.p();
         this.y = net.nb.f.D.p();
      } else if(var6 > 1.0D && this.a != d.y.EXTRA_TREES) {
         this.j = net.nb.f.oy.p();
         this.y = net.nb.f.oy.p();
      }

      this.B(var1, var2, var3, var4, var5, var6);
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum y {
      NORMAL,
      EXTRA_TREES,
      MUTATED;
   }
}
