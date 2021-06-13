package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.d2;
import net.yz.m_;

public class k extends c {
   private static final m_ c = new m_("textures/entity/endercrystal/endercrystal.png");
   private final net.y6.z U = new net.y6.k(0.0F, true);
   private final net.y6.z I = new net.y6.k(0.0F, false);

   public k(d var1) {
      super(var1);
      this.W = 0.5F;
   }

   public void o(net.nm.j var1, double var2, double var4, double var6, float var8, float var9) {
      c.q();
      float var11 = (float)var1.ad + var9;
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4, (float)var6);
      this.i(c);
      float var12 = net.u.t.A(var11 * 0.2F) / 2.0F + 0.5F;
      var12 = var12 * var12 + var12;
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      if(var1.N()) {
         this.U.V(var1, 0.0F, var11 * 3.0F, var12 * 0.2F, 0.0F, 0.0F, 0.0625F);
      }

      this.I.V(var1, 0.0F, var11 * 3.0F, var12 * 0.2F, 0.0F, 0.0F, 0.0625F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      net.u.j var13 = var1.u();
      this.i(d2.Z);
      float var14 = (float)var13.t() + 0.5F;
      float var15 = (float)var13.h() + 0.5F;
      float var16 = (float)var13.y() + 0.5F;
      double var17 = (double)var14 - var1.b;
      double var19 = (double)var15 - var1.hS;
      double var21 = (double)var16 - var1.hr;
      d2.Z(var2 + var17, var4 - 0.3D + (double)(var12 * 0.4F) + var19, var6 + var21, var9, (double)var14, (double)var15, (double)var16, var1.ad, var1.b, var1.hS, var1.hr);
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ d(net.nm.j var1) {
      return c;
   }

   public boolean D(net.nm.j var1, net.cy.s var2, double var3, double var5, double var7) {
      return super.i(var1, var2, var3, var5, var7) || var1.u() != null;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
