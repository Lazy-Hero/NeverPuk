package net;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.oz;
import net.uv;
import net.w6;
import net.xn;
import net.ne.l;
import net.u.j;
import net.u.t;

public class b0 {
   public static Iterator c(net.cp.v var0, double var1, l var3, int var4, net.y.uu var5) {
      uv.l();
      float var7 = oz.G();
      if(Float.compare(var7, 0.0F) > 0 && var7 < (float)((var4 - 1) * 16)) {
         int var19 = t.Y(var7 / 16.0F) + 1;
         float var20 = var0.C((float)var1);
         float var10 = oz.EA * 0.017453292F;
         float var11 = Float.compare(var20, 1.5707964F) > 0 && var20 < 4.712389F?var20 + 3.1415927F:var20;
         float var12 = -t.A(var11);
         float var13 = t.m(var11) * t.m(var10);
         float var14 = -t.m(var11) * t.A(var10);
         j var15 = new j(t.L(var3.b) >> 4, t.L(var3.hS) >> 4, t.L(var3.hr) >> 4);
         j var16 = var15.G((double)(-var12 * (float)var19), (double)(-var13 * (float)var19), (double)(-var14 * (float)var19));
         j var17 = var15.G((double)(var12 * (float)var4), (double)(var13 * (float)var4), (double)(var14 * (float)var4));
         w6 var18 = new w6(var5, var16, var17, var19, var19);
         return var18;
      } else {
         List var8 = Arrays.asList(var5.M);
         Iterator var9 = var8.iterator();
         return var9;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
