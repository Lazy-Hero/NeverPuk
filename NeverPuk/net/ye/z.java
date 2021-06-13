package net.ye;

import net.rd;
import net.xn;
import net.z9;
import net.n0.ks;
import net.nl.z2;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class z implements wr {
   private static final m_ R = new m_("textures/entity/elytra.png");
   protected final net.y0.o S;
   private final net.y6.a l = new net.y6.a();

   public z(net.y0.o var1) {
      this.S = var1;
   }

   public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      p.l();
      ks var10 = var1.U(z2.CHEST);
      if(var10.Z() == net.nb.j.SB) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.C();
         net.y.d.m(net.y.d.ONE, net.y.d.ZERO);
         if(var1 instanceof net.yy.f) {
            net.yy.f var11 = (net.yy.f)var1;
            if(var11.Tq() && var11.M() != null) {
               this.S.i(var11.M());
            }

            if(var11.Tx() && var11.TQ() && var11.J() != null && var11.o(net.r.j.CAPE)) {
               this.S.i(var11.J());
            }

            m_ var12 = R;
            if(z9.r()) {
               var12 = rd.Q(var10, var12);
            }

            this.S.i(var12);
         }

         m_ var13 = R;
         if(z9.r()) {
            var13 = rd.Q(var10, var13);
         }

         this.S.i(var13);
         net.y.d.c();
         net.y.d.O(0.0F, 0.0F, 0.125F);
         this.l.p(var2, var3, var5, var6, var7, var8, var1);
         this.l.V(var1, var2, var3, var5, var6, var7, var8);
         if(var10.g()) {
            p.D(this.S, var1, this.l, var2, var3, var4, var5, var6, var7, var8);
         }

         net.y.d.E();
         net.y.d.Y();
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
