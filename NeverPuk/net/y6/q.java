package net.y6;

import net.xn;
import net.y6.jb;

public class q extends net.y6.z {
   private final jb[] P = new jb[12];
   private final jb F;

   public q() {
      for(int var1 = 0; var1 < this.P.length; ++var1) {
         this.P[var1] = new jb(this, 0, 16);
         this.P[var1].U(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.F = new jb(this, 0, 0);
      this.F.U(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.F.B(var7);

      for(jb var11 : this.P) {
         var11.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.y6.z.W();
      float var9 = var3 * 3.1415927F * -0.1F;
      int var10 = 0;
      this.P[var10].I = -2.0F + net.u.t.m(((float)(var10 * 2) + var3) * 0.25F);
      this.P[var10].l = net.u.t.m(var9) * 9.0F;
      this.P[var10].h = net.u.t.A(var9) * 9.0F;
      ++var9;
      ++var10;
      var9 = 0.7853982F + var3 * 3.1415927F * 0.03F;
      var10 = 4;
      this.P[var10].I = 2.0F + net.u.t.m(((float)(var10 * 2) + var3) * 0.25F);
      this.P[var10].l = net.u.t.m(var9) * 7.0F;
      this.P[var10].h = net.u.t.A(var9) * 7.0F;
      ++var9;
      ++var10;
      var9 = 0.47123894F + var3 * 3.1415927F * -0.05F;
      var10 = 8;
      this.P[var10].I = 11.0F + net.u.t.m(((float)var10 * 1.5F + var3) * 0.5F);
      this.P[var10].l = net.u.t.m(var9) * 5.0F;
      this.P[var10].h = net.u.t.A(var9) * 5.0F;
      ++var9;
      ++var10;
      this.F.N = var4 * 0.017453292F;
      this.F.b = var5 * 0.017453292F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
