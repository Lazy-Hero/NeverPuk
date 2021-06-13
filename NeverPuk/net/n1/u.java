package net.n1;

import net.xn;
import net.c0.d;
import net.n1.m;
import net.n1.o;
import net.yv.r;

public class u extends m {
   public u(r var1) {
      super(var1);
      this.S(0.3125F, 0.3125F);
   }

   public u(r var1, net.ne.a var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.S(0.3125F, 0.3125F);
   }

   public u(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.S(0.3125F, 0.3125F);
   }

   public static void P(d var0) {
      m.p(var0, "SmallFireball");
   }

   protected void t(net.u.m var1) {
      String var2 = o.s.H();
      if(!this.hl.x) {
         label19: {
            if(var1.e != null) {
               if(var1.e.X()) {
                  break label19;
               }

               boolean var3 = var1.e.H(net.yz.z.h(this, this.U0), 5.0F);
               this.q(this.U0, var1.e);
               var1.e.n(5);
            }

            boolean var5 = true;
            if(this.U0 != null && this.U0 instanceof net.ne.y) {
               var5 = this.hl.N().b("mobGriefing");
            }

            net.u.j var4 = var1.j().C(var1.d);
            if(this.hl.y(var4)) {
               this.hl.U(var4, net.nb.f.g.p());
            }
         }

         this.B();
      }

   }

   public boolean w() {
      return false;
   }

   public boolean H(net.yz.z var1, float var2) {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
