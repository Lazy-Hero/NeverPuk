package net.y6;

import net.ub;
import net.xn;
import net.z9;
import net.y6.ex;

public class j7 {
   public ex[] g;
   public int b;
   private boolean J;

   public j7(ex[] var1) {
      this.g = var1;
      this.b = var1.length;
   }

   public j7(ex[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].i((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].i((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].i((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].i((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void J() {
      ex[] var1 = new ex[this.g.length];

      for(int var2 = 0; var2 < this.g.length; ++var2) {
         var1[var2] = this.g[this.g.length - var2 - 1];
      }

      this.g = var1;
   }

   public void h(net.y.p var1, float var2) {
      net.u.r var4 = this.g[1].Q.I(this.g[0].Q);
      net.y6.z.C();
      net.u.r var5 = this.g[1].Q.I(this.g[2].Q);
      net.u.r var6 = var5.M(var4).I();
      float var7 = (float)var6.p;
      float var8 = (float)var6.H;
      float var9 = (float)var6.a;
      if(this.J) {
         var7 = -var7;
         var8 = -var8;
         var9 = -var9;
      }

      if(z9.Q()) {
         var1.m(7, ub.V);
      }

      var1.m(7, net.y8.x.D);
      int var10 = 0;
      ex var11 = this.g[var10];
      var1.H(var11.Q.p * (double)var2, var11.Q.H * (double)var2, var11.Q.a * (double)var2).Y((double)var11.v, (double)var11.c).d(var7, var8, var9).W();
      ++var10;
      net.y.r.f().p();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
