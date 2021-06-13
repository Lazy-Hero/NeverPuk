package net.y0;

import net.x7;
import net.xn;
import net.z9;
import net.y.u1;
import net.y.ui;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class ck extends c {
   private static final m_ F = new m_("textures/entity/experience_orb.png");

   public ck(d var1) {
      super(var1);
      this.W = 0.15F;
      this.r = 0.75F;
   }

   public void K(net.nm.s var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.q();
      if(!this.g) {
         net.y.d.c();
         net.y.d.O((float)var2, (float)var4, (float)var6);
         this.j(var1);
         u1.B();
         int var11 = var1.s();
         float var12 = (float)(var11 % 4 * 16 + 0) / 64.0F;
         float var13 = (float)(var11 % 4 * 16 + 16) / 64.0F;
         float var14 = (float)(var11 / 4 * 16 + 0) / 64.0F;
         float var15 = (float)(var11 / 4 * 16 + 16) / 64.0F;
         float var10000 = 1.0F;
         var10000 = 0.5F;
         var10000 = 0.25F;
         int var19 = var1.L();
         int var20 = var19 % 65536;
         int var21 = var19 / 65536;
         ui.c(ui.w, (float)var20, (float)var21);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = 255.0F;
         float var23 = ((float)var1.xg + var9) / 2.0F;
         if(z9.v()) {
            var23 = x7.t(var23);
         }

         var21 = (int)((net.u.t.A(var23 + 0.0F) + 1.0F) * 0.5F * 255.0F);
         boolean var37 = true;
         int var25 = (int)((net.u.t.A(var23 + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
         net.y.d.O(0.0F, 0.1F, 0.0F);
         net.y.d.P(180.0F - this.A.I, 0.0F, 1.0F, 0.0F);
         net.y.d.P((float)(this.A.O.wR == 2?-1:1) * -this.A.Z, 1.0F, 0.0F, 0.0F);
         float var38 = 0.3F;
         net.y.d.W(0.3F, 0.3F, 0.3F);
         net.y.r var27 = net.y.r.f();
         net.y.p var28 = var27.k();
         var28.m(7, net.y8.x.P);
         int var29 = var21;
         int var30 = 255;
         int var31 = var25;
         if(z9.v()) {
            int var32 = x7.n(var23);
            var29 = var32 >> 16 & 255;
            var30 = var32 >> 8 & 255;
            var31 = var32 >> 0 & 255;
         }

         var28.H(-0.5D, -0.25D, 0.0D).Y((double)var12, (double)var15).V(var29, var30, var31, 128).d(0.0F, 1.0F, 0.0F).W();
         var28.H(0.5D, -0.25D, 0.0D).Y((double)var13, (double)var15).V(var29, var30, var31, 128).d(0.0F, 1.0F, 0.0F).W();
         var28.H(0.5D, 0.75D, 0.0D).Y((double)var13, (double)var14).V(var29, var30, var31, 128).d(0.0F, 1.0F, 0.0F).W();
         var28.H(-0.5D, 0.75D, 0.0D).Y((double)var12, (double)var14).V(var29, var30, var31, 128).d(0.0F, 1.0F, 0.0F).W();
         var27.p();
         net.y.d.E();
         net.y.d.g();
         net.y.d.Y();
         super.w(var1, var2, var4, var6, var8, var9);
      }

   }

   protected m_ i(net.nm.s var1) {
      return F;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
