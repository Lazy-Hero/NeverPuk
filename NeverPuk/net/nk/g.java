package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.m;
import net.nk.n;
import net.nk.q;
import net.nl.z2;
import net.yz.m_;

public class g extends q {
   public g(net.yv.r var1) {
      super(var1);
   }

   public static void Q(net.c0.d var0) {
      net.ne.y.J(var0, g.class);
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pF;
   }

   protected net.yz.a T() {
      return net.nb.l.Hq;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Km;
   }

   protected net.yz.a r() {
      return net.nb.l.a;
   }

   net.yz.a R() {
      return net.nb.l.I;
   }

   public void O(net.yz.z var1) {
      n.o.y();
      super.O(var1);
      if(var1.v() instanceof m) {
         m var3 = (m)var1.v();
         if(var3.nl() && var3.nn()) {
            var3.H();
            this.O(new ks(net.nb.j.Y9, 1, 0), 0.0F);
         }
      }

   }

   protected net.n1.o c(float var1) {
      n.o.y();
      ks var3 = this.U(z2.OFFHAND);
      if(var3.Z() == net.nb.j.WT) {
         net.n1.l var5 = new net.n1.l(this.hl, this);
         var5.s(this, var1);
         return var5;
      } else {
         net.n1.o var4 = super.c(var1);
         if(var3.Z() == net.nb.j.l && var4 instanceof net.n1.b) {
            ((net.n1.b)var4).b(var3);
         }

         return var4;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
