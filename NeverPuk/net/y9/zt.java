package net.y9;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.g5;
import net.y9.t;
import net.yv.o8;

public class zt extends t {
   protected static final net.u.e F = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.09375D, 0.9375D);

   protected zt() {
      this.f(net.ys.r.X);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      if(!(var6 instanceof net.nm.b)) {
         F(var3, var4, var5, F);
      }

   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      super.N(var1, var2, var3, var4);
      if(var4 instanceof net.nm.b) {
         var1.e(new net.u.j(var2), true);
      }

   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return F;
   }

   protected boolean H(net.yw.n var1) {
      return var1.Q() == net.nb.f.uM || var1.n() == net.y1.l.V;
   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(var2.h() >= 0 && var2.h() < 256) {
         net.yw.n var5 = var1.Z(var2.b());
         net.y1.l var6 = var5.n();
         return var6 == net.y1.l.p && ((Integer)var5.i(g5.J)).intValue() == 0 || var6 == net.y1.l.V;
      } else {
         return false;
      }
   }

   public int d(net.yw.n var1) {
      return 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
