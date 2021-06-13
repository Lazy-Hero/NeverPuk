package net.c5;

import java.nio.FloatBuffer;
import java.util.Random;
import net.be;
import net.xn;
import net.z9;
import net.c5.e;
import net.u.d;
import net.y.r;
import net.y8.x;
import net.yz.aq;
import net.yz.m_;

public class c extends e {
   private static final m_ C = new m_("textures/environment/end_sky.png");
   private static final m_ U = new m_("textures/entity/end_portal.png");
   private static final Random I = new Random(31100L);
   private static final FloatBuffer o = net.y.m.R(16);
   private static final FloatBuffer Y = net.y.m.R(16);
   private final FloatBuffer w = net.y.m.R(16);

   public void e(net.ni.c var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d[] var11 = e.F();
      if(!z9.Q() || !be.T(var1, var2, var4, var6, var8, var9, this.H())) {
         net.y.d.i();
         I.setSeed(31100L);
         net.y.d.t(2982, o);
         net.y.d.t(2983, Y);
         double var12 = var2 * var2 + var4 * var4 + var6 * var6;
         int var14 = this.g(var12);
         float var15 = this.H();
         boolean var16 = false;
         int var17 = 0;
         if(var17 < var14) {
            net.y.d.c();
            float var18 = 2.0F / (float)(18 - var17);
            this.L(C);
            var18 = 0.15F;
            net.y.d.C();
            net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
            net.y.d.c(net.y.d.S, 9216);
            net.y.d.c(net.y.d.T, 9216);
            net.y.d.c(net.y.d.R, 9216);
            net.y.d.x(net.y.d.S, 9474, this.Y(1.0F, 0.0F, 0.0F, 0.0F));
            net.y.d.x(net.y.d.T, 9474, this.Y(0.0F, 1.0F, 0.0F, 0.0F));
            net.y.d.x(net.y.d.R, 9474, this.Y(0.0F, 0.0F, 1.0F, 0.0F));
            net.y.d.h(net.y.d.S);
            net.y.d.h(net.y.d.T);
            net.y.d.h(net.y.d.R);
            net.y.d.Y();
            net.y.d.G(5890);
            net.y.d.c();
            net.y.d.s();
            net.y.d.O(0.5F, 0.5F, 0.0F);
            net.y.d.W(0.5F, 0.5F, 1.0F);
            float var19 = (float)(var17 + 1);
            net.y.d.O(17.0F / var19, (2.0F + var19 / 1.5F) * ((float)net.nn.j.E() % 800000.0F / 800000.0F), 0.0F);
            net.y.d.P((var19 * var19 * 4321.0F + var19 * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.W(4.5F - var19 / 4.0F, 4.5F - var19 / 4.0F, 1.0F);
            net.y.d.I(Y);
            net.y.d.I(o);
            r var20 = r.f();
            net.y.p var21 = var20.k();
            var21.m(7, x.F);
            float var22 = (I.nextFloat() * 0.5F + 0.1F) * var18;
            float var23 = (I.nextFloat() * 0.5F + 0.4F) * var18;
            float var24 = (I.nextFloat() * 0.5F + 0.5F) * var18;
            if(var1.y(aq.SOUTH)) {
               var21.H(var2, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4 + 1.0D, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4 + 1.0D, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
            }

            if(var1.y(aq.NORTH)) {
               var21.H(var2, var4 + 1.0D, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4 + 1.0D, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4, var6).m(var22, var23, var24, 1.0F).W();
            }

            if(var1.y(aq.EAST)) {
               var21.H(var2 + 1.0D, var4 + 1.0D, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4 + 1.0D, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6).m(var22, var23, var24, 1.0F).W();
            }

            if(var1.y(aq.WEST)) {
               var21.H(var2, var4, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4 + 1.0D, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4 + 1.0D, var6).m(var22, var23, var24, 1.0F).W();
            }

            if(var1.y(aq.DOWN)) {
               var21.H(var2, var4, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
            }

            if(var1.y(aq.UP)) {
               var21.H(var2, var4 + (double)var15, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4 + (double)var15, var6 + 1.0D).m(var22, var23, var24, 1.0F).W();
               var21.H(var2 + 1.0D, var4 + (double)var15, var6).m(var22, var23, var24, 1.0F).W();
               var21.H(var2, var4 + (double)var15, var6).m(var22, var23, var24, 1.0F).W();
            }

            var20.p();
            net.y.d.Y();
            net.y.d.G(5888);
            this.L(C);
            ++var17;
         }

         net.y.d.E();
         net.y.d.u(net.y.d.S);
         net.y.d.u(net.y.d.T);
         net.y.d.u(net.y.d.R);
         net.y.d.K();
      }

   }

   protected int g(double var1) {
      byte var3;
      if(var1 > 36864.0D) {
         var3 = 1;
      } else if(var1 > 25600.0D) {
         var3 = 3;
      } else if(var1 > 16384.0D) {
         var3 = 5;
      } else if(var1 > 9216.0D) {
         var3 = 7;
      } else if(var1 > 4096.0D) {
         var3 = 9;
      } else if(var1 > 1024.0D) {
         var3 = 11;
      } else if(var1 > 576.0D) {
         var3 = 13;
      } else if(var1 > 256.0D) {
         var3 = 14;
      } else {
         var3 = 15;
      }

      return var3;
   }

   protected float H() {
      return 0.75F;
   }

   private FloatBuffer Y(float var1, float var2, float var3, float var4) {
      this.w.clear();
      this.w.put(var1).put(var2).put(var3).put(var4);
      this.w.flip();
      return this.w;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
