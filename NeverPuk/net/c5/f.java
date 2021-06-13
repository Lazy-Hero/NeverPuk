package net.c5;

import net.xn;
import net.c5.e;
import net.ni.sl;
import net.u.d;
import net.y.r;
import net.y8.x;

public class f extends e {
   public void Y(sl var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d[] var11 = e.F();
      if(net.nn.j.b().sf.Vm() || net.nn.j.b().sf.VX()) {
         super.A(var1, var2, var4, var6, var8, var9, var10);
         net.u.j var12 = var1.g();
         net.u.j var13 = var1.y();
         if(var13.t() >= 1 && var13.h() >= 1 && var13.y() >= 1 && (var1.x() == sl.s.SAVE || var1.x() == sl.s.LOAD)) {
            double var10000 = 0.01D;
            double var16 = (double)var12.t();
            double var18 = (double)var12.y();
            double var20 = var4 + (double)var12.h() - 0.01D;
            double var22 = var20 + (double)var13.h() + 0.02D;
            switch(null.B[var1.G().ordinal()]) {
            case 1:
               double var24 = (double)var13.t() + 0.02D;
               double var26 = -((double)var13.y() + 0.02D);
            case 2:
               double var41 = -((double)var13.t() + 0.02D);
               double var43 = (double)var13.y() + 0.02D;
            }

            double var42 = (double)var13.t() + 0.02D;
            double var44 = (double)var13.y() + 0.02D;
            switch(null.G[var1.A().ordinal()]) {
            case 1:
               double var28 = var2 + (var44 < 0.0D?var16 - 0.01D:var16 + 1.0D + 0.01D);
               double var30 = var6 + (var42 < 0.0D?var18 + 1.0D + 0.01D:var18 - 0.01D);
               var10000 = var28 - var44;
               var10000 = var30 + var42;
            case 2:
               double var45 = var2 + (var42 < 0.0D?var16 - 0.01D:var16 + 1.0D + 0.01D);
               double var48 = var6 + (var44 < 0.0D?var18 - 0.01D:var18 + 1.0D + 0.01D);
               var10000 = var45 - var42;
               var10000 = var48 - var44;
            case 3:
               double var46 = var2 + (var44 < 0.0D?var16 + 1.0D + 0.01D:var16 - 0.01D);
               double var49 = var6 + (var42 < 0.0D?var18 - 0.01D:var18 + 1.0D + 0.01D);
               var10000 = var46 + var44;
               var10000 = var49 - var42;
            default:
               double var47 = var2 + (var42 < 0.0D?var16 + 1.0D + 0.01D:var16 - 0.01D);
               double var50 = var6 + (var44 < 0.0D?var18 + 1.0D + 0.01D:var18 - 0.01D);
               double var32 = var47 + var42;
               double var34 = var50 + var44;
               boolean var57 = true;
               var57 = true;
               var57 = true;
               r var39 = r.f();
               net.y.p var40 = var39.k();
               net.y.d.V();
               net.y.d.i();
               net.y.d.w();
               net.y.d.C();
               net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
               this.k(true);
               if(var1.x() == sl.s.SAVE || var1.L()) {
                  this.k(var39, var40, var47, var20, var50, var32, var22, var34, 255, 223, 127);
               }

               if(var1.x() == sl.s.SAVE && var1.l()) {
                  this.S(var1, var2, var4, var6, var12, var39, var40, true);
                  this.S(var1, var2, var4, var6, var12, var39, var40, false);
               }

               this.k(false);
               net.y.d.y(1.0F);
               net.y.d.K();
               net.y.d.S();
               net.y.d.B();
               net.y.d.Y(true);
               net.y.d.p();
            }
         }
      }

   }

   private void S(sl var1, double var2, double var4, double var6, net.u.j var8, r var9, net.y.p var10, boolean var11) {
      net.y.d.y(3.0F);
      var10.m(3, x.F);
      net.yv.r var12 = var1.B();
      net.u.j var13 = var1.C();
      net.u.j var14 = var13.z(var8);

      for(net.u.j var16 : net.u.j.e(var14, var14.z(var1.y()).F(-1, -1, -1))) {
         net.yw.n var17 = var12.Z(var16);
         boolean var18 = var17 == net.nb.f.ou.p();
         boolean var19 = var17 == net.nb.f.f.p();
         float var20 = 0.05F;
         double var21 = (double)((float)(var16.t() - var13.t()) + 0.45F) + var2 - (double)var20;
         double var23 = (double)((float)(var16.h() - var13.h()) + 0.45F) + var4 - (double)var20;
         double var25 = (double)((float)(var16.y() - var13.y()) + 0.45F) + var6 - (double)var20;
         double var27 = (double)((float)(var16.t() - var13.t()) + 0.55F) + var2 + (double)var20;
         double var29 = (double)((float)(var16.h() - var13.h()) + 0.55F) + var4 + (double)var20;
         double var31 = (double)((float)(var16.y() - var13.y()) + 0.55F) + var6 + (double)var20;
         net.y.u.J(var10, var21, var23, var25, var27, var29, var31, 0.0F, 0.0F, 0.0F, 1.0F);
      }

      var9.p();
   }

   private void k(r var1, net.y.p var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15, int var16, int var17) {
      net.y.d.y(2.0F);
      var2.m(3, x.F);
      var2.H(var3, var5, var7).m((float)var16, (float)var16, (float)var16, 0.0F).W();
      var2.H(var3, var5, var7).V(var16, var16, var16, var15).W();
      var2.H(var9, var5, var7).V(var16, var17, var17, var15).W();
      var2.H(var9, var5, var13).V(var16, var16, var16, var15).W();
      var2.H(var3, var5, var13).V(var16, var16, var16, var15).W();
      var2.H(var3, var5, var7).V(var17, var17, var16, var15).W();
      var2.H(var3, var11, var7).V(var17, var16, var17, var15).W();
      var2.H(var9, var11, var7).V(var16, var16, var16, var15).W();
      var2.H(var9, var11, var13).V(var16, var16, var16, var15).W();
      var2.H(var3, var11, var13).V(var16, var16, var16, var15).W();
      var2.H(var3, var11, var7).V(var16, var16, var16, var15).W();
      var2.H(var3, var11, var13).V(var16, var16, var16, var15).W();
      var2.H(var3, var5, var13).V(var16, var16, var16, var15).W();
      var2.H(var9, var5, var13).V(var16, var16, var16, var15).W();
      var2.H(var9, var11, var13).V(var16, var16, var16, var15).W();
      var2.H(var9, var11, var7).V(var16, var16, var16, var15).W();
      var2.H(var9, var5, var7).V(var16, var16, var16, var15).W();
      var2.H(var9, var5, var7).m((float)var16, (float)var16, (float)var16, 0.0F).W();
      var1.p();
      net.y.d.y(1.0F);
   }

   public boolean x(sl var1) {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
