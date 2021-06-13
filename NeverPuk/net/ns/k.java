package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.w.f6;
import net.w.fb;
import net.w.fj;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;
import net.y9.zu;

public class k extends i {
   private final boolean n;
   private static final net.yw.n B = net.nb.f.u6.p().s(l7.d, gc.i.JUNGLE);
   private static final net.yw.n o = net.nb.f.Tu.p().s(g6.A, gc.i.JUNGLE).s(gh.u, Boolean.valueOf(false));
   private static final net.yw.n Q = net.nb.f.Tu.p().s(g6.A, gc.i.OAK).s(gh.u, Boolean.valueOf(false));

   public k(boolean var1, i.g var2) {
      i9.M();
      super(var2);
      this.n = var1;
      this.K.E = 2;
      this.K.E = 50;
      this.K.N = 25;
      this.K.D = 4;
      if(!var1) {
         this.b.add(new i.w(net.yn.g.class, 2, 1, 1));
      }

      this.v.add(new i.w(net.yn.k.class, 40, 1, 2));
      this.v.add(new i.w(net.yn.a.class, 10, 4, 4));
   }

   public net.w.x q(Random var1) {
      return (net.w.x)(var1.nextInt(10) == 0?d:(var1.nextInt(2) == 0?new net.w.n(B, Q):(!this.n && var1.nextInt(3) == 0?new net.w.d(false, 10, 20, B, o):new net.w.w(false, 4 + var1.nextInt(7), B, o, true))));
   }

   public net.w.f A(Random var1) {
      return var1.nextInt(4) == 0?new fb(zu.i.FERN):new fb(zu.i.GRASS);
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      super.f(var1, var2, var3);
      int var5 = var2.nextInt(16) + 8;
      int var6 = var2.nextInt(16) + 8;
      int var7 = var2.nextInt(var1.A(var3.F(var5, 0, var6)).h() * 2);
      (new fj()).K(var1, var2, var3.F(var5, var7, var6));
      i9.M();
      f6 var8 = new f6();
      int var9 = 0;
      var7 = var2.nextInt(16) + 8;
      boolean var10000 = true;
      int var11 = var2.nextInt(16) + 8;
      var8.K(var1, var2, var3.F(var7, 128, var11));
      ++var9;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
