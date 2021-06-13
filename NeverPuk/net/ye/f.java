package net.ye;

import net.x7;
import net.xn;
import net.z9;
import net.n0.kw;
import net.y0.dd;
import net.y6.e5;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class f implements wr {
   private static final m_ x = new m_("textures/entity/sheep/sheep_fur.png");
   private final dd k;
   public e5 O = new e5();

   public f(dd var1) {
      this.k = var1;
   }

   public void K(net.yn.b var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if(!var1.D() && !var1.e()) {
         this.k.i(x);
         if(var1.H() && "jeb_".equals(var1.X())) {
            boolean var10 = true;
            int var11 = var1.x / 25 + var1.G();
            int var12 = kw.values().length;
            int var13 = var11 % var12;
            int var14 = (var11 + 1) % var12;
            float var15 = ((float)(var1.x % 25) + var4) / 25.0F;
            float[] var16 = net.yn.b.f(kw.h(var13));
            float[] var17 = net.yn.b.f(kw.h(var14));
            if(z9.v()) {
               var16 = x7.G(kw.h(var13), var16);
               var17 = x7.G(kw.h(var14), var17);
            }

            net.y.d.Z(var16[0] * (1.0F - var15) + var17[0] * var15, var16[1] * (1.0F - var15) + var17[1] * var15, var16[2] * (1.0F - var15) + var17[2] * var15);
         }

         float[] var18 = net.yn.b.f(var1.n());
         if(z9.v()) {
            var18 = x7.G(var1.n(), var18);
         }

         net.y.d.Z(var18[0], var18[1], var18[2]);
         this.O.q(this.k.v());
         this.O.x(var1, var2, var3, var4);
         this.O.V(var1, var2, var3, var5, var6, var7, var8);
      }

   }

   public boolean y() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
