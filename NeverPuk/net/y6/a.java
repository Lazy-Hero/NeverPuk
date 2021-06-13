package net.y6;

import net.xn;
import net.y6.jb;

public class a extends net.y6.z {
   private final jb w;
   private final jb A = new jb(this, 22, 0);

   public a() {
      this.A.d(-10.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
      this.w = new jb(this, 22, 0);
      this.w.x = true;
      this.w.d(0.0F, 0.0F, 0.0F, 10, 20, 2, 1.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y.d.g();
      net.y.d.j();
      if(var1 instanceof net.ne.a && ((net.ne.a)var1).H9()) {
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 1.5F, -0.1F);
         this.A.B(var7);
         this.w.B(var7);
         net.y.d.Y();
      } else {
         this.A.B(var7);
         this.w.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      net.y6.z.W();
      float var9 = 0.2617994F;
      float var10 = -0.2617994F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      if(var7 instanceof net.ne.a && ((net.ne.a)var7).I()) {
         float var13 = 1.0F;
         if(var7.K < 0.0D) {
            net.u.r var14 = (new net.u.r(var7.hf, var7.K, var7.J)).I();
            var13 = 1.0F - (float)Math.pow(-var14.H, 1.5D);
         }

         var9 = var13 * 0.34906584F + (1.0F - var13) * var9;
         var10 = var13 * -1.5707964F + (1.0F - var13) * var10;
      }

      if(var7.Q()) {
         var9 = 0.69813174F;
         var10 = -0.7853982F;
         var11 = 3.0F;
         var12 = 0.08726646F;
      }

      this.A.l = 5.0F;
      this.A.I = var11;
      if(var7 instanceof net.yy.f) {
         net.yy.f var15 = (net.yy.f)var7;
         var15.wa = (float)((double)var15.wa + (double)(var9 - var15.wa) * 0.1D);
         var15.wT = (float)((double)var15.wT + (double)(var12 - var15.wT) * 0.1D);
         var15.w3 = (float)((double)var15.w3 + (double)(var10 - var15.w3) * 0.1D);
         this.A.b = var15.wa;
         this.A.N = var15.wT;
         this.A.c = var15.w3;
      }

      this.A.b = var9;
      this.A.c = var10;
      this.A.N = var12;
      this.w.l = -this.A.l;
      this.w.N = -this.A.N;
      this.w.I = this.A.I;
      this.w.b = this.A.b;
      this.w.c = -this.A.c;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
