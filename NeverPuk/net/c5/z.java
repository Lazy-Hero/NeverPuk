package net.c5;

import java.util.List;
import net.x7;
import net.xn;
import net.z9;
import net.c5.e;
import net.ni.sg;
import net.y.d;
import net.y6.es;
import net.y9.l;
import net.yz.m_;
import net.z.r;

public class z extends e {
   private static final m_ t = new m_("textures/entity/sign.png");
   private final es R = new es();

   public void i(sg var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      l var12 = var1.a();
      e.F();
      d.c();
      float var10001 = 0.6666667F;
      if(var12 == net.nb.f.uL) {
         d.O((float)var2 + 0.5F, (float)var4 + 0.5F, (float)var6 + 0.5F);
         float var14 = (float)(var1.B() * 360) / 16.0F;
         d.P(-var14, 0.0F, 1.0F, 0.0F);
         this.R.u.B = true;
      }

      int var21 = var1.B();
      float var15 = 0.0F;
      if(var21 == 2) {
         var15 = 180.0F;
      }

      if(var21 == 4) {
         var15 = 90.0F;
      }

      if(var21 == 5) {
         var15 = -90.0F;
      }

      d.O((float)var2 + 0.5F, (float)var4 + 0.5F, (float)var6 + 0.5F);
      d.P(-var15, 0.0F, 1.0F, 0.0F);
      d.O(0.0F, -0.3125F, -0.4375F);
      this.R.u.B = false;
      if(var9 >= 0) {
         this.L(L[var9]);
         d.G(5890);
         d.c();
         d.W(4.0F, 2.0F, 1.0F);
         d.O(0.0625F, 0.0625F, 0.0625F);
         d.G(5888);
      }

      this.L(t);
      d.F();
      d.c();
      d.W(0.6666667F, -0.6666667F, -0.6666667F);
      this.R.O();
      d.Y();
      r var22 = this.j();
      var15 = 0.010416667F;
      d.O(0.0F, 0.33333334F, 0.046666667F);
      d.W(0.010416667F, -0.010416667F, 0.010416667F);
      d.b(0.0F, 0.0F, -0.010416667F);
      d.Y(false);
      int var16 = 0;
      if(z9.v()) {
         var16 = x7.O(var16);
      }

      if(var9 < 0) {
         int var17 = 0;
         if(var17 < var1.k.length) {
            if(var1.k[var17] != null) {
               net.cb.t var18 = var1.k[var17];
               List var19 = net.z.l.f(var18, 90, var22, false, true);
               String var20 = var19 != null && !var19.isEmpty()?((net.cb.t)var19.get(0)).c():"";
               if(var17 == var1.c) {
                  var20 = "> " + var20 + " <";
                  var22.v(var20, (float)(-var22.r(var20) / 2), (float)(var17 * 10 - var1.k.length * 5), var16);
               }

               var22.v(var20, (float)(-var22.r(var20) / 2), (float)(var17 * 10 - var1.k.length * 5), var16);
            }

            ++var17;
         }
      }

      d.Y(true);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.Y();
      if(var9 >= 0) {
         d.G(5890);
         d.Y();
         d.G(5888);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
