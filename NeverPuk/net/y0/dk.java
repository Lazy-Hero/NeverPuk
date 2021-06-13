package net.y0;

import net.xn;
import net.y.ui;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.eo;
import net.yz.m_;

public class dk extends l {
   private static final m_ i = new m_("textures/entity/guardian.png");
   private static final m_ N = new m_("textures/entity/guardian_beam.png");

   public dk(d var1) {
      super(var1, new eo(), 0.5F);
   }

   public boolean m(net.nk.z var1, net.cy.s var2, double var3, double var5, double var7) {
      boolean var9 = c.q();
      if(super.d(var1, var2, var3, var5, var7)) {
         return true;
      } else if(var1.Oe()) {
         net.ne.a var10 = var1.s();
         net.u.r var11 = this.H(var10, (double)var10.m * 0.5D, 1.0F);
         net.u.r var12 = this.H(var1, (double)var1.A(), 1.0F);
         return var2.E(new net.u.e(var12.p, var12.H, var12.a, var11.p, var11.H, var11.a));
      } else {
         return false;
      }
   }

   private net.u.r H(net.ne.a var1, double var2, float var4) {
      double var5 = var1.hL + (var1.b - var1.hL) * (double)var4;
      double var7 = var2 + var1.F + (var1.hS - var1.F) * (double)var4;
      double var9 = var1.A + (var1.hr - var1.A) * (double)var4;
      return new net.u.r(var5, var7, var9);
   }

   public void E(net.nk.z var1, double var2, double var4, double var6, float var8, float var9) {
      c.q();
      super.C(var1, var2, var4, var6, var8, var9);
      net.ne.a var11 = var1.s();
      float var12 = var1.a(var9);
      net.y.r var13 = net.y.r.f();
      net.y.p var14 = var13.k();
      this.i(N);
      net.y.d.t(3553, 10242, 10497);
      net.y.d.t(3553, 10243, 10497);
      net.y.d.i();
      net.y.d.j();
      net.y.d.E();
      net.y.d.Y(true);
      float var10000 = 240.0F;
      ui.c(ui.w, 240.0F, 240.0F);
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE, net.y.d.ONE, net.y.d.ZERO);
      float var16 = (float)var1.hl.y() + var9;
      float var17 = var16 * 0.5F % 1.0F;
      float var18 = var1.A();
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4 + var18, (float)var6);
      net.u.r var19 = this.H(var11, (double)var11.m * 0.5D, var9);
      net.u.r var20 = this.H(var1, (double)var18, var9);
      net.u.r var21 = var19.q(var20);
      double var22 = var21.c() + 1.0D;
      var21 = var21.I();
      float var24 = (float)Math.acos(var21.H);
      float var25 = (float)Math.atan2(var21.a, var21.p);
      net.y.d.P((1.5707964F + -var25) * 57.295776F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(var24 * 57.295776F, 1.0F, 0.0F, 0.0F);
      boolean var80 = true;
      double var27 = (double)var16 * 0.05D * -1.5D;
      var14.m(7, net.y8.x.r);
      float var29 = var12 * var12;
      int var30 = 64 + (int)(var29 * 191.0F);
      int var31 = 32 + (int)(var29 * 191.0F);
      int var32 = 128 - (int)(var29 * 64.0F);
      double var81 = 0.2D;
      var81 = 0.282D;
      double var37 = 0.0D + Math.cos(var27 + 2.356194490192345D) * 0.282D;
      double var39 = 0.0D + Math.sin(var27 + 2.356194490192345D) * 0.282D;
      double var41 = 0.0D + Math.cos(var27 + 0.7853981633974483D) * 0.282D;
      double var43 = 0.0D + Math.sin(var27 + 0.7853981633974483D) * 0.282D;
      double var45 = 0.0D + Math.cos(var27 + 3.9269908169872414D) * 0.282D;
      double var47 = 0.0D + Math.sin(var27 + 3.9269908169872414D) * 0.282D;
      double var49 = 0.0D + Math.cos(var27 + 5.497787143782138D) * 0.282D;
      double var51 = 0.0D + Math.sin(var27 + 5.497787143782138D) * 0.282D;
      double var53 = 0.0D + Math.cos(var27 + 3.141592653589793D) * 0.2D;
      double var55 = 0.0D + Math.sin(var27 + 3.141592653589793D) * 0.2D;
      double var57 = 0.0D + Math.cos(var27 + 0.0D) * 0.2D;
      double var59 = 0.0D + Math.sin(var27 + 0.0D) * 0.2D;
      double var61 = 0.0D + Math.cos(var27 + 1.5707963267948966D) * 0.2D;
      double var63 = 0.0D + Math.sin(var27 + 1.5707963267948966D) * 0.2D;
      double var65 = 0.0D + Math.cos(var27 + 4.71238898038469D) * 0.2D;
      double var67 = 0.0D + Math.sin(var27 + 4.71238898038469D) * 0.2D;
      var81 = 0.0D;
      var81 = 0.4999D;
      double var73 = (double)(-1.0F + var17);
      double var75 = var22 * 2.5D + var73;
      var14.H(var53, var22, var55).Y(0.4999D, var75).V(var30, var31, var32, 255).W();
      var14.H(var53, 0.0D, var55).Y(0.4999D, var73).V(var30, var31, var32, 255).W();
      var14.H(var57, 0.0D, var59).Y(0.0D, var73).V(var30, var31, var32, 255).W();
      var14.H(var57, var22, var59).Y(0.0D, var75).V(var30, var31, var32, 255).W();
      var14.H(var61, var22, var63).Y(0.4999D, var75).V(var30, var31, var32, 255).W();
      var14.H(var61, 0.0D, var63).Y(0.4999D, var73).V(var30, var31, var32, 255).W();
      var14.H(var65, 0.0D, var67).Y(0.0D, var73).V(var30, var31, var32, 255).W();
      var14.H(var65, var22, var67).Y(0.0D, var75).V(var30, var31, var32, 255).W();
      double var77 = 0.0D;
      if(var1.x % 2 == 0) {
         var77 = 0.5D;
      }

      var14.H(var37, var22, var39).Y(0.5D, var77 + 0.5D).V(var30, var31, var32, 255).W();
      var14.H(var41, var22, var43).Y(1.0D, var77 + 0.5D).V(var30, var31, var32, 255).W();
      var14.H(var49, var22, var51).Y(1.0D, var77).V(var30, var31, var32, 255).W();
      var14.H(var45, var22, var47).Y(0.5D, var77).V(var30, var31, var32, 255).W();
      var13.p();
      net.y.d.Y();
   }

   protected m_ O(net.nk.z var1) {
      return i;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
