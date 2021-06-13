package net.yh;

import javax.annotation.Nullable;
import net.xn;
import net.y9.r1;
import net.yh.c;
import net.yh.x;
import net.yz.a5;

public class a extends x {
   float d;
   final float b;

   protected a(net.yv.r var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
      this.N = var8;
      this.F = var9;
      this.V = var10;
      float var10000 = 0.9F;
      this.g *= 0.75F;
      this.g *= 0.9F;
      this.d = this.g;
      this.a = (int)(32.0D / (Math.random() * 0.8D + 0.2D));
      this.a = (int)((float)this.a * 0.9F);
      this.b = ((float)Math.random() - 0.5F) * 0.1F;
      this.h = (float)Math.random() * 6.2831855F;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a * 32.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      this.g = this.d * var9;
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.w = this.h;
      this.h += 3.1415927F * this.b * 2.0F;
      if(this.T) {
         this.w = this.h = 0.0F;
      }

      this.Y(7 - this.x * 8 / this.a);
      this.f(this.B, this.R, this.L);
      this.R -= 0.003000000026077032D;
      this.R = Math.max(this.R, -0.14000000059604645D);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class x implements c {
      @Nullable
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         x.f();
         net.yw.n var17 = net.y9.l.P(var15[0]);
         if(var17.Q() != net.nb.f.ou && var17.C() == a5.INVISIBLE) {
            return null;
         } else {
            int var18 = net.nn.j.b().q().I(var17, var2, new net.u.j(var3, var5, var7));
            if(var17.Q() instanceof r1) {
               var18 = ((r1)var17.Q()).l(var17);
            }

            float var19 = (float)(var18 >> 16 & 255) / 255.0F;
            float var20 = (float)(var18 >> 8 & 255) / 255.0F;
            float var21 = (float)(var18 & 255) / 255.0F;
            return new a(var2, var3, var5, var7, var19, var20, var21);
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
