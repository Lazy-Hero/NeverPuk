package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ai;

public class ga extends l {
   public ga() {
      super(net.y1.l.z);
      this.f(net.ys.r.M);
      this.y(0.2F);
      this.R(true);
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.M;
   }

   public void m(net.yv.r var1, net.u.j var2, net.ne.l var3) {
      int[] var4 = g3.v.w();
      if(!var3.X() && var3 instanceof net.ne.a && !net.c1.y.A((net.ne.a)var3)) {
         var3.H(net.yz.z.f, 1.0F);
      }

      super.m(var1, var2, var3);
   }

   public int w(net.yw.n var1, o8 var2, net.u.j var3) {
      return 15728880;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      net.u.j var6 = var2.h();
      g3.v.w();
      net.yw.n var7 = var1.Z(var6);
      if(var7.Q() == net.nb.f.uM || var7.Q() == net.nb.f.dy) {
         var1.J(var6);
         var1.M((net.r.r)null, var2, net.nb.l.oS, net.yz.p.BLOCKS, 0.5F, 2.6F + (var1.G.nextFloat() - var1.G.nextFloat()) * 0.8F);
         if(var1 instanceof net.yv.d) {
            ((net.yv.d)var1).q(ai.SMOKE_LARGE, (double)var6.t() + 0.5D, (double)var6.h() + 0.25D, (double)var6.y() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D, new int[0]);
         }
      }

   }

   public boolean H(net.yw.n var1, net.ne.l var2) {
      return var2.X();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
