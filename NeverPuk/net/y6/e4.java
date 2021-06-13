package net.y6;

import net.xn;
import net.y6.jb;

public class e4 extends net.y6.z {
   public final jb G;
   public final jb s;
   public jb N;

   public e4() {
      this.C = 64;
      this.f = 64;
      this.s = new jb(this);
      this.G = new jb(this);
      this.N = new jb(this);
      this.s.k(0, 0).U(-8.0F, -16.0F, -8.0F, 16, 12, 16);
      this.s.n(0.0F, 24.0F, 0.0F);
      this.G.k(0, 28).U(-8.0F, -8.0F, -8.0F, 16, 8, 16);
      this.G.n(0.0F, 24.0F, 0.0F);
      this.N.k(0, 52).U(-3.0F, 0.0F, -3.0F, 6, 6, 6);
      this.N.n(0.0F, 12.0F, 0.0F);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.nk.j var9 = (net.nk.j)var7;
      float var10 = var3 - (float)var9.x;
      float var11 = (0.5F + var9.V(var10)) * 3.1415927F;
      net.y6.z.W();
      float var12 = -1.0F + net.u.t.A(var11);
      float var13 = 0.0F;
      if(Float.compare(var11, 3.1415927F) > 0) {
         var13 = net.u.t.A(var3 * 0.1F) * 0.7F;
      }

      this.s.n(0.0F, 16.0F + net.u.t.A(var11) * 8.0F + var13, 0.0F);
      if(var9.V(var10) > 0.3F) {
         this.s.N = var12 * var12 * var12 * var12 * 3.1415927F * 0.125F;
      }

      this.s.N = 0.0F;
      this.N.b = var5 * 0.017453292F;
      this.N.N = var4 * 0.017453292F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.G.B(var7);
      this.s.B(var7);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
