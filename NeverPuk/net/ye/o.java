package net.ye;

import net.xn;
import net.n0.ks;
import net.nk.f_;
import net.y0.cm;
import net.ye.p;
import net.ye.wr;
import net.yz.a5;

public class o implements wr {
   private final cm L;

   public o(cm var1) {
      this.L = var1;
   }

   public void X(f_ var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      p.l();
      ks var10 = var1.S();
      if(!var10.B()) {
         net.y.d.Z(1.0F, 1.0F, 1.0F);
         net.y.d.c();
         if(this.L.W().n) {
            net.y.d.O(0.0F, 0.625F, 0.0F);
            net.y.d.P(-20.0F, -1.0F, 0.0F, 0.0F);
            float var11 = 0.5F;
            net.y.d.W(0.5F, 0.5F, 0.5F);
         }

         this.L.W().U.I(0.0625F);
         net.y.d.O(-0.0625F, 0.53125F, 0.21875F);
         net.n0.y var14 = var10.Z();
         net.nn.j var12 = net.nn.j.b();
         if(net.y9.l.F(var14).p().C() == a5.ENTITYBLOCK_ANIMATED) {
            net.y.d.O(0.0F, 0.0625F, -0.25F);
            net.y.d.P(30.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.P(-5.0F, 0.0F, 1.0F, 0.0F);
            float var10000 = 0.375F;
            net.y.d.W(0.375F, -0.375F, 0.375F);
         }

         if(var14 == net.nb.j.w) {
            net.y.d.O(0.0F, 0.125F, -0.125F);
            net.y.d.P(-45.0F, 0.0F, 1.0F, 0.0F);
            float var15 = 0.625F;
            net.y.d.W(0.625F, -0.625F, 0.625F);
            net.y.d.P(-100.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.P(-20.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var14.a()) {
            if(var14.O()) {
               net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
               net.y.d.O(0.0F, -0.0625F, 0.0F);
            }

            this.L.E();
            net.y.d.O(0.0625F, -0.125F, 0.0F);
            float var16 = 0.625F;
            net.y.d.W(0.625F, -0.625F, 0.625F);
            net.y.d.P(0.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.P(0.0F, 0.0F, 1.0F, 0.0F);
         }

         net.y.d.O(0.1875F, 0.1875F, 0.0F);
         float var17 = 0.875F;
         net.y.d.W(0.875F, 0.875F, 0.875F);
         net.y.d.P(-20.0F, 0.0F, 0.0F, 1.0F);
         net.y.d.P(-60.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(-30.0F, 0.0F, 0.0F, 1.0F);
         net.y.d.P(-15.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(40.0F, 0.0F, 0.0F, 1.0F);
         var12.h().L(var1, var10, net.ym.s.THIRD_PERSON_RIGHT_HAND);
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
