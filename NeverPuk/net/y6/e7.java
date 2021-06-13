package net.y6;

import net.xn;
import net.y6.jb;

public class e7 extends net.y6.z {
   private final jb o = new jb(this, 0, 0);
   private final jb S;
   private final jb P;

   public e7() {
      this.o.n(-5.0F, 22.0F, -5.0F);
      this.o.U(0.0F, 0.0F, 0.0F, 10, 12, 10);
      this.S = new jb(this, 40, 0);
      this.S.n(1.5F, 22.0F, -4.0F);
      this.S.U(0.0F, 0.0F, 0.0F, 4, 14, 8);
      this.P = new jb(this, 40, 0);
      this.P.n(-1.5F, 22.0F, 4.0F);
      this.P.U(0.0F, 0.0F, 0.0F, 4, 14, 8);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      float var9 = var2 * 2.0F;
      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 = 1.0F - var9 * var9 * var9;
      this.S.c = 3.1415927F - var9 * 0.35F * 3.1415927F;
      this.P.c = 3.1415927F + var9 * 0.35F * 3.1415927F;
      this.P.N = 3.1415927F;
      float var10 = (var2 + net.u.t.A(var2 * 2.7F)) * 0.6F * 12.0F;
      this.S.I = 24.0F - var10;
      this.P.I = this.S.I;
      this.o.I = this.S.I;
      this.o.B(var7);
      this.S.B(var7);
      this.P.B(var7);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
