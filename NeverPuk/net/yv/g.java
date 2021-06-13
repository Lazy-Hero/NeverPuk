package net.yv;

import javax.annotation.concurrent.Immutable;
import net.xn;
import net.yv.l;
import net.yv.r;

@Immutable
public class g {
   private final l D;
   private final float t;

   public g(l var1, long var2, long var4, float var6) {
      this.D = var1;
      this.t = this.N(var1, var2, var4, var6);
   }

   public float V() {
      return this.t;
   }

   public boolean k(float var1) {
      return this.t > var1;
   }

   public float l() {
      return this.t < 2.0F?0.0F:(this.t > 4.0F?1.0F:(this.t - 2.0F) / 2.0F);
   }

   private float N(l var1, long var2, long var4, float var6) {
      net.u.d[] var7 = r.C();
      if(var1 == l.PEACEFUL) {
         return 0.0F;
      } else {
         boolean var8 = var1 == l.HARD;
         float var9 = 0.75F;
         float var10 = net.u.t.T(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         var9 = var9 + var10;
         float var11 = 0.0F;
         var11 = var11 + net.u.t.T((float)var4 / 3600000.0F, 0.0F, 1.0F) * 1.0F;
         var11 = var11 + net.u.t.T(var6 * 0.25F, 0.0F, var10);
         if(var1 == l.EASY) {
            var11 *= 0.5F;
         }

         var9 = var9 + var11;
         return (float)var1.L() * var9;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
