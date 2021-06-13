package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;

public class t extends i {
   protected boolean R;

   protected t(boolean var1, i.g var2) {
      super(var2);
      this.R = var1;
      this.v.add(new i.w(net.yn.c.class, 5, 2, 6));
      this.v.add(new i.w(net.yn.o.class, 1, 1, 3));
      this.K.E = 0;
      this.K.e = 0.05F;
      this.K.D = 4;
      this.K.N = 10;
   }

   public net.y9.n j(Random var1, net.u.j var2) {
      double var3 = g.Q((double)var2.t() / 200.0D, (double)var2.y() / 200.0D);
      if(var3 < -0.8D) {
         int var6 = var1.nextInt(4);
         switch(var6) {
         case 0:
            return net.y9.n.ORANGE_TULIP;
         case 1:
            return net.y9.n.RED_TULIP;
         case 2:
            return net.y9.n.PINK_TULIP;
         case 3:
         default:
            return net.y9.n.WHITE_TULIP;
         }
      } else if(var1.nextInt(3) > 0) {
         int var5 = var1.nextInt(3);
         return net.y9.n.POPPY;
      } else {
         return net.y9.n.DANDELION;
      }
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      i9.M();
      double var5 = g.Q((double)(var3.t() + 8) / 200.0D, (double)(var3.y() + 8) / 200.0D);
      if(Double.compare(var5, -0.8D) < 0) {
         this.K.D = 15;
         this.K.N = 5;
      }

      this.K.D = 4;
      this.K.N = 10;
      G.o(net.y9.y.GRASS);
      int var7 = 0;
      int var8 = var2.nextInt(16) + 8;
      int var9 = var2.nextInt(16) + 8;
      int var10 = var2.nextInt(var1.A(var3.F(var8, 0, var9)).h() + 32);
      G.K(var1, var2, var3.F(var8, var10, var9));
      ++var7;
      if(this.R) {
         G.o(net.y9.y.SUNFLOWER);
         var7 = 0;
         var8 = var2.nextInt(16) + 8;
         var9 = var2.nextInt(16) + 8;
         var10 = var2.nextInt(var1.A(var3.F(var8, 0, var9)).h() + 32);
         G.K(var1, var2, var3.F(var8, var10, var9));
         ++var7;
      }

      super.f(var1, var2, var3);
   }

   public net.w.x q(Random var1) {
      return (net.w.x)(var1.nextInt(3) == 0?d:V);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
