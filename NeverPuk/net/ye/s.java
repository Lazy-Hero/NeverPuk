package net.ye;

import net.xn;
import net.n0.ks;
import net.ye.p;
import net.ye.wr;
import net.yz.aa;

public class s implements wr {
   protected final net.y0.o c;

   public s(net.y0.o var1) {
      this.c = var1;
   }

   public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      boolean var10 = var1.a() == aa.RIGHT;
      ks var11 = var1.L();
      ks var12 = var1.S();
      if(!var11.B() || !var12.B()) {
         net.y.d.c();
         if(this.c.v().n) {
            float var10000 = 0.5F;
            net.y.d.O(0.0F, 0.75F, 0.0F);
            net.y.d.W(0.5F, 0.5F, 0.5F);
         }

         this.H(var1, var12, net.ym.s.THIRD_PERSON_RIGHT_HAND, aa.RIGHT);
         this.H(var1, var11, net.ym.s.THIRD_PERSON_LEFT_HAND, aa.LEFT);
         net.y.d.Y();
      }

   }

   private void H(net.ne.a var1, ks var2, net.ym.s var3, aa var4) {
      if(!var2.B()) {
         net.y.d.c();
         this.G(var4);
         if(var1.Q()) {
            net.y.d.O(0.0F, 0.2F, 0.0F);
         }

         net.y.d.P(-90.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
         boolean var5 = var4 == aa.LEFT;
         net.y.d.O((float)-1 / 16.0F, 0.125F, -0.625F);
         net.nn.j.b().h().N(var1, var2, var3, var5);
         net.y.d.Y();
      }

   }

   protected void G(aa var1) {
      ((net.y6.t)this.c.v()).V(0.0625F, var1);
   }

   public boolean y() {
      return false;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
