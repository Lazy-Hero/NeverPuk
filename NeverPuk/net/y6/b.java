package net.y6;

import net.xn;
import net.y6.jb;
import net.y6.t;
import net.yz.aa;

public class b extends t {
   protected jb L;
   protected jb g;

   public b() {
      this(0.0F);
   }

   public b(float var1) {
      super(var1, 0.0F, 64, 64);
      this.a.B = false;
      this.P.B = false;
      this.H = new jb(this, 32, 0);
      this.H.d(-1.0F, -1.0F, -2.0F, 6, 10, 4, 0.0F);
      this.H.n(-1.9F, 12.0F, 0.0F);
      this.g = new jb(this, 0, 32);
      this.g.U(-20.0F, 0.0F, 0.0F, 20, 12, 1);
      this.L = new jb(this, 0, 32);
      this.L.x = true;
      this.L.U(0.0F, 0.0F, 0.0F, 20, 12, 1);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.V(var1, var2, var3, var4, var5, var6, var7);
      this.g.B(var7);
      this.L.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      net.y6.z.W();
      net.nk.t var9 = (net.nk.t)var7;
      if(var9.as()) {
         if(var9.a() == aa.RIGHT) {
            this.A.b = 3.7699115F;
         }

         this.B.b = 3.7699115F;
      }

      this.H.b += 0.62831855F;
      this.g.h = 2.0F;
      this.L.h = 2.0F;
      this.g.I = 1.0F;
      this.L.I = 1.0F;
      this.g.N = 0.47123894F + net.u.t.m(var3 * 0.8F) * 3.1415927F * 0.05F;
      this.L.N = -this.g.N;
      this.L.c = -0.47123894F;
      this.L.b = 0.47123894F;
      this.g.b = 0.47123894F;
      this.g.c = 0.47123894F;
   }

   public int w() {
      return 23;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
