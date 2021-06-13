package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;

public class q extends i {
   private static final net.w.l U = new net.w.l(false);

   protected q(i.g var1) {
      i9.M();
      super(var1);
      this.v.add(new i.w(net.yn.c.class, 1, 2, 6));
      this.v.add(new i.w(net.yn.o.class, 1, 1, 1));
      if(this.Q() > 1.1F) {
         this.v.add(new i.w(net.yn.l.class, 8, 4, 4));
      }

      this.K.E = 1;
      this.K.D = 4;
      this.K.N = 20;
   }

   public net.w.x q(Random var1) {
      return (net.w.x)(var1.nextInt(5) > 0?U:V);
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      i9.M();
      G.o(net.y9.y.GRASS);
      int var5 = 0;
      int var6 = var2.nextInt(16) + 8;
      int var7 = var2.nextInt(16) + 8;
      int var8 = var2.nextInt(var1.A(var3.F(var6, 0, var7)).h() + 32);
      G.K(var1, var2, var3.F(var6, var8, var7));
      ++var5;
      super.f(var1, var2, var3);
   }

   public Class g() {
      return q.class;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
