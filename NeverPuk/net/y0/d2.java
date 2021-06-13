package net.y0;

import net.xn;
import net.y.u1;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class d2 extends l {
   public static final m_ Z = new m_("textures/entity/endercrystal/endercrystal_beam.png");
   private static final m_ i = new m_("textures/entity/enderdragon/dragon_exploding.png");
   private static final m_ E = new m_("textures/entity/enderdragon/dragon.png");

   public d2(d var1) {
      super(var1, new net.y6.x(0.0F), 0.5F);
      this.k(new net.ye.j(this));
      this.k(new net.ye.b());
   }

   protected void V(net.a.t var1, float var2, float var3, float var4) {
      float var5 = (float)var1.O(7, var4)[0];
      float var6 = (float)(var1.O(5, var4)[1] - var1.O(10, var4)[1]);
      net.y.d.P(-var5, 0.0F, 1.0F, 0.0F);
      net.y.d.P(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.O(0.0F, 0.0F, 1.0F);
      if(var1.AA > 0) {
         float var7 = ((float)var1.AA + var4 - 1.0F) / 20.0F * 1.6F;
         var7 = net.u.t.g(var7);
         if(var7 > 1.0F) {
            var7 = 1.0F;
         }

         net.y.d.P(var7 * this.L(var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected void L(net.a.t var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if(var1.k9 > 0) {
         float var8 = (float)var1.k9 / 200.0F;
         net.y.d.n(515);
         net.y.d.m();
         net.y.d.d(516, var8);
         this.i(i);
         this.y.V(var1, var2, var3, var4, var5, var6, var7);
         net.y.d.d(516, 0.1F);
         net.y.d.n(514);
      }

      this.j(var1);
      this.y.V(var1, var2, var3, var4, var5, var6, var7);
      if(var1.Xl > 0) {
         net.y.d.n(514);
         net.y.d.w();
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
         net.y.d.T(1.0F, 0.0F, 0.0F, 0.5F);
         this.y.V(var1, var2, var3, var4, var5, var6, var7);
         net.y.d.S();
         net.y.d.E();
         net.y.d.n(515);
      }

   }

   public void H(net.a.t var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      super.C(var1, var2, var4, var6, var8, var9);
      if(var1.k5 != null) {
         this.i(Z);
         float var11 = net.u.t.A(((float)var1.k5.x + var9) * 0.2F) / 2.0F + 0.5F;
         var11 = (var11 * var11 + var11) * 0.2F;
         Z(var2, var4, var6, var9, var1.b + (var1.h - var1.b) * (double)(1.0F - var9), var1.hS + (var1.h6 - var1.hS) * (double)(1.0F - var9), var1.hr + (var1.l - var1.hr) * (double)(1.0F - var9), var1.x, var1.k5.b, (double)var11 + var1.k5.hS, var1.k5.hr);
      }

   }

   public static void Z(double var0, double var2, double var4, float var6, double var7, double var9, double var11, int var13, double var14, double var16, double var18) {
      c.C();
      float var21 = (float)(var14 - var7);
      float var22 = (float)(var16 - 1.0D - var9);
      float var23 = (float)(var18 - var11);
      float var24 = net.u.t.g(var21 * var21 + var23 * var23);
      float var25 = net.u.t.g(var21 * var21 + var22 * var22 + var23 * var23);
      net.y.d.c();
      net.y.d.O((float)var0, (float)var2 + 2.0F, (float)var4);
      net.y.d.P((float)(-Math.atan2((double)var23, (double)var21)) * 57.295776F - 90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P((float)(-Math.atan2((double)var24, (double)var22)) * 57.295776F - 90.0F, 1.0F, 0.0F, 0.0F);
      net.y.r var26 = net.y.r.f();
      net.y.p var27 = var26.k();
      u1.m();
      net.y.d.j();
      net.y.d.Q(7425);
      float var28 = 0.0F - ((float)var13 + var6) * 0.01F;
      float var29 = net.u.t.g(var21 * var21 + var22 * var22 + var23 * var23) / 32.0F - ((float)var13 + var6) * 0.01F;
      var27.m(5, net.y8.x.r);
      boolean var10000 = true;
      int var31 = 0;
      float var32 = net.u.t.A((float)(var31 % 8) * 6.2831855F / 8.0F) * 0.75F;
      float var33 = net.u.t.m((float)(var31 % 8) * 6.2831855F / 8.0F) * 0.75F;
      float var34 = (float)(var31 % 8) / 8.0F;
      var27.H((double)(var32 * 0.2F), (double)(var33 * 0.2F), 0.0D).Y((double)var34, (double)var28).V(0, 0, 0, 255).W();
      var27.H((double)var32, (double)var33, (double)var25).Y((double)var34, (double)var29).V(255, 255, 255, 255).W();
      ++var31;
      var26.p();
      net.y.d.a();
      net.y.d.Q(7424);
      u1.B();
      net.y.d.Y();
   }

   protected m_ w(net.a.t var1) {
      return E;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
