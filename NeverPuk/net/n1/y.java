package net.n1;

import net.xn;
import net.c0.d;
import net.n1.m;
import net.n1.o;
import net.yv.r;

public class y extends m {
   public int Aa = 1;

   public y(r var1) {
      super(var1);
   }

   public y(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public y(r var1, net.ne.a var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
   }

   protected void t(net.u.m var1) {
      String var2 = o.s.H();
      if(!this.hl.x) {
         if(var1.e != null) {
            var1.e.H(net.yz.z.h(this, this.U0), 6.0F);
            this.q(this.U0, var1.e);
         }

         boolean var3 = this.hl.N().b("mobGriefing");
         this.hl.c((net.ne.l)null, this.b, this.hS, this.hr, (float)this.Aa, var3, var3);
         this.B();
      }

   }

   public static void r(d var0) {
      m.p(var0, "Fireball");
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("ExplosionPower", this.Aa);
   }

   public void o(net.nj.f var1) {
      String var2 = o.s.H();
      super.o(var1);
      if(var1.K("ExplosionPower", 99)) {
         this.Aa = var1.P("ExplosionPower");
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
