package net.y;

import net._c;
import net.wk;
import net.x7;
import net.xn;
import net.z9;
import net.y.p;
import net.y9.g5;
import net.y9.lu;
import net.yv.o8;
import net.yz.aq;

public class e {
   private final net.yo.j H;
   private final net.n9.v[] O = new net.n9.v[2];
   private final net.n9.v[] M = new net.n9.v[2];
   private net.n9.v F;

   public e(net.yo.j var1) {
      this.H = var1;
      this.s();
   }

   protected void s() {
      net.n9.b var1 = net.nn.j.b().p();
      this.O[0] = var1.O("minecraft:blocks/lava_still");
      this.O[1] = var1.O("minecraft:blocks/lava_flow");
      this.M[0] = var1.O("minecraft:blocks/water_still");
      this.M[1] = var1.O("minecraft:blocks/water_flow");
      this.F = var1.O("minecraft:blocks/water_overlay");
   }

   public boolean q(o8 var1, net.yw.n var2, net.u.j var3, p var4) {
      String var5 = p.S();
      if(z9.Q()) {
         wk.j(var2, var3, var1, var4);
      }

      g5 var7 = (g5)var2.Q();
      boolean var8 = var2.n() == net.y1.l.U;
      net.n9.v[] var9 = this.O;
      _c var10 = var4.X(var1, var2, var3);
      int var11 = x7.O(var1, var2, var3, var10);
      float var12 = (float)(var11 >> 16 & 255) / 255.0F;
      float var13 = (float)(var11 >> 8 & 255) / 255.0F;
      float var14 = (float)(var11 & 255) / 255.0F;
      boolean var15 = var2.F(var1, var3, aq.UP);
      boolean var16 = var2.F(var1, var3, aq.DOWN);
      boolean[] var17 = var10.U();
      var17[0] = var2.F(var1, var3, aq.NORTH);
      var17[1] = var2.F(var1, var3, aq.SOUTH);
      var17[2] = var2.F(var1, var3, aq.WEST);
      var17[3] = var2.F(var1, var3, aq.EAST);
      if(!var15 && !var16 && !var17[0] && !var17[1] && !var17[2] && !var17[3]) {
         boolean var66 = false;
         if(z9.Q()) {
            wk.w(var4);
         }

         return var66;
      } else {
         boolean var6 = false;
         float var10000 = 0.5F;
         var10000 = 1.0F;
         var10000 = 0.8F;
         var10000 = 0.6F;
         net.y1.l var22 = var2.n();
         float var23 = this.N(var1, var3, var22);
         float var24 = this.N(var1, var3.d(), var22);
         float var25 = this.N(var1, var3.g().d(), var22);
         float var26 = this.N(var1, var3.g(), var22);
         double var27 = (double)var3.t();
         double var29 = (double)var3.h();
         double var31 = (double)var3.y();
         float var33 = 0.001F;
         if(var15) {
            var6 = true;
            float var34 = g5.M(var1, var3, var22, var2);
            net.n9.v var35 = var34 > -999.0F?var9[1]:var9[0];
            var4.b(var35);
            var23 = var23 - 0.001F;
            var24 = var24 - 0.001F;
            var25 -= 0.001F;
            var26 -= 0.001F;
            if(var34 < -999.0F) {
               float var36 = var35.W(0.0D);
               float var40 = var35.L(0.0D);
               float var41 = var35.L(16.0D);
               float var38 = var35.W(16.0D);
            }

            float var44 = net.u.t.A(var34) * 0.25F;
            float var45 = net.u.t.m(var34) * 0.25F;
            float var46 = 8.0F;
            float var74 = var35.W((double)(8.0F + (-var45 - var44) * 16.0F));
            float var86 = var35.L((double)(8.0F + (-var45 + var44) * 16.0F));
            float var37 = var35.W((double)(8.0F + (-var45 + var44) * 16.0F));
            float var90 = var35.L((double)(8.0F + (var45 + var44) * 16.0F));
            float var80 = var35.W((double)(8.0F + (var45 + var44) * 16.0F));
            float var42 = var35.L((double)(8.0F + (var45 - var44) * 16.0F));
            float var39 = var35.W((double)(8.0F + (var45 - var44) * 16.0F));
            float var43 = var35.L((double)(8.0F + (-var45 - var44) * 16.0F));
            int var95 = var2.T(var1, var3);
            int var96 = var95 >> 16 & '\uffff';
            int var98 = var95 & '\uffff';
            float var47 = 1.0F * var12;
            float var48 = 1.0F * var13;
            float var49 = 1.0F * var14;
            var4.H(var27 + 0.0D, var29 + (double)var23, var31 + 0.0D).m(var47, var48, var49, 1.0F).Y((double)var74, (double)var86).C(var96, var98).W();
            var4.H(var27 + 0.0D, var29 + (double)var24, var31 + 1.0D).m(var47, var48, var49, 1.0F).Y((double)var37, (double)var90).C(var96, var98).W();
            var4.H(var27 + 1.0D, var29 + (double)var25, var31 + 1.0D).m(var47, var48, var49, 1.0F).Y((double)var80, (double)var42).C(var96, var98).W();
            var4.H(var27 + 1.0D, var29 + (double)var26, var31 + 0.0D).m(var47, var48, var49, 1.0F).Y((double)var39, (double)var43).C(var96, var98).W();
            if(var7.J(var1, var3.h())) {
               var4.H(var27 + 0.0D, var29 + (double)var23, var31 + 0.0D).m(var47, var48, var49, 1.0F).Y((double)var74, (double)var86).C(var96, var98).W();
               var4.H(var27 + 1.0D, var29 + (double)var26, var31 + 0.0D).m(var47, var48, var49, 1.0F).Y((double)var39, (double)var43).C(var96, var98).W();
               var4.H(var27 + 1.0D, var29 + (double)var25, var31 + 1.0D).m(var47, var48, var49, 1.0F).Y((double)var80, (double)var42).C(var96, var98).W();
               var4.H(var27 + 0.0D, var29 + (double)var24, var31 + 1.0D).m(var47, var48, var49, 1.0F).Y((double)var37, (double)var90).C(var96, var98).W();
            }
         }

         if(var16) {
            float var69 = var9[0].q();
            float var72 = var9[0].o();
            float var75 = var9[0].n();
            float var78 = var9[0].r();
            int var81 = var2.T(var1, var3.b());
            int var83 = var81 >> 16 & '\uffff';
            int var87 = var81 & '\uffff';
            var4.H(var27, var29, var31 + 1.0D).m(var12 * 0.5F, var13 * 0.5F, var14 * 0.5F, 1.0F).Y((double)var69, (double)var78).C(var83, var87).W();
            var4.H(var27, var29, var31).m(var12 * 0.5F, var13 * 0.5F, var14 * 0.5F, 1.0F).Y((double)var69, (double)var75).C(var83, var87).W();
            var4.H(var27 + 1.0D, var29, var31).m(var12 * 0.5F, var13 * 0.5F, var14 * 0.5F, 1.0F).Y((double)var72, (double)var75).C(var83, var87).W();
            var4.H(var27 + 1.0D, var29, var31 + 1.0D).m(var12 * 0.5F, var13 * 0.5F, var14 * 0.5F, 1.0F).Y((double)var72, (double)var78).C(var83, var87).W();
            var6 = true;
         }

         int var70 = 0;
         byte var73 = 0;
         int var76 = 0;
         --var76;
         net.u.j var79 = var3.F(var73, 0, var76);
         net.n9.v var82 = var9[1];
         var4.b(var82);
         float var84 = 0.0F;
         float var88 = 0.0F;
         net.yw.n var91 = var1.Z(var79);
         net.y9.l var92 = var91.Q();
         if(var92 == net.nb.f.Tm || var92 == net.nb.f.T5 || var92 == net.nb.f.uB || var92 == net.nb.f.di) {
            var82 = this.F;
            var4.b(var82);
         }

         if(var92 == net.nb.f.dJ || var92 == net.nb.f.A) {
            var84 = 0.9375F;
            var88 = 0.9375F;
         }

         if(var92 instanceof lu) {
            lu var93 = (lu)var92;
            if(!var93.l() && var91.i(lu.R) == lu.k.BOTTOM) {
               var84 = 0.5F;
               var88 = 0.5F;
            }
         }

         if(var17[var70]) {
            double var99 = var27 + 1.0D;
            double var97 = var31 + 0.0010000000474974513D;
            double var101 = var31 + 0.0010000000474974513D;
            double var94 = var27 + 1.0D - 0.0010000000474974513D;
            var99 = var27 + 1.0D - 0.0010000000474974513D;
            var101 = var31 + 1.0D;
            if(Float.compare(var26, var84) > 0 || Float.compare(var25, var88) > 0) {
               var84 = Math.min(var84, var26);
               var88 = Math.min(var88, var25);
               if(Float.compare(var84, var33) > 0) {
                  var84 -= var33;
               }

               if(Float.compare(var88, var33) > 0) {
                  var88 -= var33;
               }

               var6 = true;
               float var51 = var82.W(0.0D);
               float var52 = var82.W(8.0D);
               float var53 = var82.L((double)((1.0F - var26) * 16.0F * 0.5F));
               float var54 = var82.L((double)((1.0F - var25) * 16.0F * 0.5F));
               var82.L(8.0D);
               float var56 = var82.L((double)((1.0F - var84) * 16.0F * 0.5F));
               float var57 = var82.L((double)((1.0F - var88) * 16.0F * 0.5F));
               int var58 = var2.T(var1, var79);
               int var59 = var58 >> 16 & '\uffff';
               int var60 = var58 & '\uffff';
               float var61 = 0.8F;
               float var62 = 1.0F * var61 * var12;
               float var63 = 1.0F * var61 * var13;
               float var64 = 1.0F * var61 * var14;
               var4.H(var94, var29 + (double)var26, var31).m(var62, var63, var64, 1.0F).Y((double)var51, (double)var53).C(var59, var60).W();
               var4.H(var99, var29 + (double)var25, var101).m(var62, var63, var64, 1.0F).Y((double)var52, (double)var54).C(var59, var60).W();
               var4.H(var99, var29 + (double)var88, var101).m(var62, var63, var64, 1.0F).Y((double)var52, (double)var57).C(var59, var60).W();
               var4.H(var94, var29 + (double)var84, var31).m(var62, var63, var64, 1.0F).Y((double)var51, (double)var56).C(var59, var60).W();
               if(var82 != this.F) {
                  var4.H(var94, var29 + (double)var84, var31).m(var62, var63, var64, 1.0F).Y((double)var51, (double)var56).C(var59, var60).W();
                  var4.H(var99, var29 + (double)var88, var101).m(var62, var63, var64, 1.0F).Y((double)var52, (double)var57).C(var59, var60).W();
                  var4.H(var99, var29 + (double)var25, var101).m(var62, var63, var64, 1.0F).Y((double)var52, (double)var54).C(var59, var60).W();
                  var4.H(var94, var29 + (double)var26, var31).m(var62, var63, var64, 1.0F).Y((double)var51, (double)var53).C(var59, var60).W();
               }
            }
         }

         ++var70;
         var4.b((net.n9.v)null);
         if(z9.Q()) {
            wk.w(var4);
         }

         return var6;
      }
   }

   private float N(o8 param1, net.u.j param2, net.y1.l param3) {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
