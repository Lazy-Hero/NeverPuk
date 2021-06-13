package net.n1;

import java.util.List;
import net.xn;
import net.n1.o;
import net.u.e;
import net.yv.r;

public final class t {
   public static net.u.m d(net.ne.l var0, boolean var1, boolean var2, net.ne.l var3) {
      double var5 = var0.b;
      double var7 = var0.hS;
      o.s.H();
      double var9 = var0.hr;
      double var11 = var0.hf;
      double var13 = var0.K;
      double var15 = var0.J;
      r var17 = var0.hl;
      net.u.r var18 = new net.u.r(var5, var7, var9);
      net.u.r var19 = new net.u.r(var5 + var11, var7 + var13, var9 + var15);
      net.u.m var20 = var17.s(var18, var19, false, true, false);
      var19 = new net.u.r(var20.z.p, var20.z.H, var20.z.a);
      net.ne.l var21 = null;
      List var22 = var17.u(var0, var0.i().T(var11, var13, var15).x(1.0D));
      double var23 = 0.0D;
      int var25 = 0;
      if(var25 < var22.size()) {
         net.ne.l var26 = (net.ne.l)var22.get(var25);
         if(var26.w() && (var2 || !var26.Z(var3)) && !var26.r) {
            e var27 = var26.i().x(0.30000001192092896D);
            net.u.m var28 = var27.G(var18, var19);
            double var29 = var18.Y(var28.z);
            if(var29 >= var23) {
               double var33;
               int var10000 = (var33 = var23 - 0.0D) == 0.0D?0:(var33 < 0.0D?-1:1);
            }

            var21 = var26;
         }

         ++var25;
      }

      if(var21 != null) {
         var20 = new net.u.m(var21);
      }

      return var20;
   }

   public static final void J(net.ne.l var0, float var1) {
      double var2 = var0.hf;
      double var4 = var0.K;
      double var6 = var0.J;
      float var8 = net.u.t.R(var2 * var2 + var6 * var6);
      var0.hN = (float)(net.u.t.V(var6, var2) * 57.29577951308232D) + 90.0F;

      for(var0.V = (float)(net.u.t.V((double)var8, var4) * 57.29577951308232D) - 90.0F; var0.V - var0.d < -180.0F; var0.d -= 360.0F) {
         ;
      }

      while(var0.V - var0.d >= 180.0F) {
         var0.d += 360.0F;
      }

      while(var0.hN - var0.hq < -180.0F) {
         var0.hq -= 360.0F;
      }

      while(var0.hN - var0.hq >= 180.0F) {
         var0.hq += 360.0F;
      }

      var0.V = var0.d + (var0.V - var0.d) * var1;
      var0.hN = var0.hq + (var0.hN - var0.hq) * var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
