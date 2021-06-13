package net.y0;

import net.xn;
import net.n0.ks;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class cy extends c {
   protected final net.n0.y Y;
   private final net.y.t I;

   public cy(d var1, net.n0.y var2, net.y.t var3) {
      super(var1);
      this.Y = var2;
      this.I = var3;
   }

   public void w(net.ne.l var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4, (float)var6);
      net.y.d.F();
      net.y.d.P(-this.A.I, 0.0F, 1.0F, 0.0F);
      net.y.d.P((float)(this.A.O.wR == 2?-1:1) * this.A.Z, 1.0F, 0.0F, 0.0F);
      net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
      this.i(net.n9.b.N);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      this.I.w(this.N(var1), net.ym.s.GROUND);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.g();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   public ks N(net.ne.l var1) {
      return new ks(this.Y);
   }

   protected m_ e(net.ne.l var1) {
      return net.n9.b.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
