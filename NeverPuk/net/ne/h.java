package net.ne;

import net.xn;
import net.ne.d;
import net.ne.f;
import net.ne.y;

public abstract class h extends y {
   public h(net.yv.r var1) {
      super(var1);
   }

   public void v(float var1, float var2) {
   }

   protected void s(double var1, boolean var3, net.yw.n var4, net.u.j var5) {
   }

   public void E(float var1, float var2, float var3) {
      boolean var4 = d.O();
      if(this.p()) {
         this.h(var1, var2, var3, 0.02F);
         this.N(f.SELF, this.hf, this.K, this.J);
         this.hf *= 0.800000011920929D;
         this.K *= 0.800000011920929D;
         this.J *= 0.800000011920929D;
      }

      if(this.h()) {
         this.h(var1, var2, var3, 0.02F);
         this.N(f.SELF, this.hf, this.K, this.J);
         this.hf *= 0.5D;
         this.K *= 0.5D;
         this.J *= 0.5D;
      }

      float var5 = 0.91F;
      if(this.k) {
         var5 = this.hl.Z(new net.u.j(net.u.t.L(this.b), net.u.t.L(this.i().u) - 1, net.u.t.L(this.hr))).Q().P * 0.91F;
      }

      float var6 = 0.16277136F / (var5 * var5 * var5);
      this.h(var1, var2, var3, this.k?0.1F * var6:0.02F);
      var5 = 0.91F;
      if(this.k) {
         var5 = this.hl.Z(new net.u.j(net.u.t.L(this.b), net.u.t.L(this.i().u) - 1, net.u.t.L(this.hr))).Q().P * 0.91F;
      }

      this.N(f.SELF, this.hf, this.K, this.J);
      this.hf *= (double)var5;
      this.K *= (double)var5;
      this.J *= (double)var5;
      this.AS = this.Aq;
      double var11 = this.b - this.h;
      double var7 = this.hr - this.l;
      float var9 = net.u.t.R(var11 * var11 + var7 * var7) * 4.0F;
      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      this.Aq += (var9 - this.Aq) * 0.4F;
      this.A5 += this.Aq;
      if(net.u.d.y() == null) {
         d.u(false);
      }

   }

   public boolean K() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
