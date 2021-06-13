package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.z4;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;

public class zs extends z4 {
   protected static final net.u.e E = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);

   protected zs(net.y1.l var1) {
      super(var1);
      this.y(1.0F);
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.c();
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return E;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN && super.v(var1, var2, var3, var4);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public int T(Random var1) {
      return 0;
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      int[] var5 = g3.v.w();
      if(!var1.x && !var4.M() && !var4.t() && var4.S() && var4.i().O(var3.q(var1, var2).c(var2))) {
         var4.V(1);
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      double var5 = (double)((float)var3.t() + var4.nextFloat());
      double var7 = (double)((float)var3.h() + 0.8F);
      double var9 = (double)((float)var3.y() + var4.nextFloat());
      double var10000 = 0.0D;
      var10000 = 0.0D;
      var10000 = 0.0D;
      var2.n(ai.SMOKE_NORMAL, var5, var7, var9, 0.0D, 0.0D, 0.0D, new int[0]);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return ks.a;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.c;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
