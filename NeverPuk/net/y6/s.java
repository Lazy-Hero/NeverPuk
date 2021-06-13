package net.y6;

import net.xn;
import net.nk.fu;
import net.y6.t;

public class s extends t {
   public s() {
      this(0.0F, false);
   }

   public s(float var1, boolean var2) {
      super(var1, 0.0F, 64, 32);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.y6.z.W();
      super.p(var1, var2, var3, var4, var5, var6, var7);
      if(var7 instanceof fu && ((fu)var7).Ir()) {
         boolean var13 = true;
      } else {
         boolean var10000 = false;
      }

      float var10 = net.u.t.A(this.v * 3.1415927F);
      float var11 = net.u.t.A((1.0F - (1.0F - this.v) * (1.0F - this.v)) * 3.1415927F);
      this.A.c = 0.0F;
      this.B.c = 0.0F;
      this.A.N = -(0.1F - var10 * 0.6F);
      this.B.N = 0.1F - var10 * 0.6F;
      float var12 = -3.1415927F / 1.5F;
      this.A.b = var12;
      this.B.b = var12;
      this.A.b += var10 * 1.2F - var11 * 0.4F;
      this.B.b += var10 * 1.2F - var11 * 0.4F;
      this.A.c += net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
      this.B.c -= net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
      this.A.b += net.u.t.A(var3 * 0.067F) * 0.05F;
      this.B.b -= net.u.t.A(var3 * 0.067F) * 0.05F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
