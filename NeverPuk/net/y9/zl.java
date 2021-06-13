package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;

public class zl extends z4 {
   protected zl(net.y1.l var1) {
      super(var1);
      this.y(1.0F);
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.z();
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      net.yw.n var5 = var2.Z(var3.C(var4));
      l var6 = var5.Q();
      return !var5.j() && var6 != net.nb.f.dU;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
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

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      g3.v.w();
      net.ni.v var6 = var2.L(var3);
      if(var6 instanceof net.ni.z) {
         int var7 = ((net.ni.z)var6).g();
         int var8 = 0;
         if(var8 < var7) {
            double var10000 = (double)((float)var3.t() + var4.nextFloat());
            double var11 = (double)((float)var3.h() + var4.nextFloat());
            double var13 = (double)((float)var3.y() + var4.nextFloat());
            double var15 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
            double var17 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
            double var19 = ((double)var4.nextFloat() - 0.5D) * 0.5D;
            int var21 = var4.nextInt(2) * 2 - 1;
            if(var4.nextBoolean()) {
               var13 = (double)var3.y() + 0.5D + 0.25D * (double)var21;
               var19 = (double)(var4.nextFloat() * 2.0F * (float)var21);
            }

            double var9 = (double)var3.t() + 0.5D + 0.25D * (double)var21;
            var15 = (double)(var4.nextFloat() * 2.0F * (float)var21);
            var2.n(ai.PORTAL, var9, var11, var13, var15, var17, var19, new int[0]);
            ++var8;
         }
      }

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
