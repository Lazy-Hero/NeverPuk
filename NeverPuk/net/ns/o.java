package net.ns;

import java.util.Random;
import net.xn;
import net.nk.f0;
import net.ns.i;
import net.ns.i9;
import net.w.fd;

public class o extends i {
   protected static final net.yw.n r = net.nb.f.dD.p();

   protected o(i.g var1) {
      super(var1);
      this.K.E = 2;
      this.K.D = 1;
      this.K.P = 1;
      this.K.z = 8;
      this.K.g = 10;
      this.K.x = 1;
      this.K.m = 4;
      this.K.U = 0;
      this.K.G = 0;
      this.K.N = 5;
      this.b.add(new i.w(f0.class, 1, 1, 1));
   }

   public net.w.x q(Random var1) {
      return c;
   }

   public int r(net.u.j var1) {
      double var2 = g.Q((double)var1.t() * 0.0225D, (double)var1.y() * 0.0225D);
      return var2 < -0.1D?5011004:6975545;
   }

   public int d(net.u.j var1) {
      return 6975545;
   }

   public net.y9.n j(Random var1, net.u.j var2) {
      return net.y9.n.BLUE_ORCHID;
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      i9.M();
      double var9 = g.Q((double)var4 * 0.25D, (double)var5 * 0.25D);
      if(var9 > 0.0D) {
         int var11 = var4 & 15;
         int var12 = var5 & 15;
         int var13 = 255;
         if(var3.b(var12, var13, var11).n() == net.y1.l.q) {
            --var13;
         }
      }

      this.B(var1, var2, var3, var4, var5, var6);
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      super.f(var1, var2, var3);
      if(var2.nextInt(64) == 0) {
         (new fd()).K(var1, var2, var3);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
