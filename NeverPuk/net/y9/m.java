package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.t;
import net.yv.o8;

public class m extends t {
   protected static final net.u.e u = new net.u.e(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

   protected m() {
      super(net.y1.l.Y);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return u;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.C;
   }

   protected boolean H(net.yw.n var1) {
      int[] var2 = g3.v.w();
      return var1.Q() == net.nb.f.TF || var1.Q() == net.nb.f.oY || var1.Q() == net.nb.f.Ty || var1.Q() == net.nb.f.dl;
   }

   public boolean X(o8 var1, net.u.j var2) {
      return true;
   }

   public int T(Random var1) {
      return var1.nextInt(3);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Wu;
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      int[] var7 = g3.v.w();
      if(!var1.x && var6.Z() == net.nb.j.W5) {
         var2.S(net.v.q.i(this));
         e(var1, var3, new ks(net.nb.f.dY, 1, 0));
      }

      super.U(var1, var2, var3, var4, var5, var6);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
