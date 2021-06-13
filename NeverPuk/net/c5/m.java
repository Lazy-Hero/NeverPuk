package net.c5;

import java.util.List;
import net.oz;
import net.xn;
import net.z9;
import net.c5.e;
import net.ni.h;
import net.u.d;
import net.y.r;
import net.y8.x;
import net.yz.m_;

public class m extends e {
   public static final m_ F = new m_("textures/entity/beacon_beam.png");

   public void Y(h var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      this.D(var2, var4, var6, (double)var8, (double)var1.e(), var1.r(), (double)var1.B().y());
   }

   public void D(double var1, double var3, double var5, double var7, double var9, List var11, double var12) {
      d[] var14 = e.F();
      if(Double.compare(var9, 0.0D) > 0 && var11.size() > 0) {
         if(z9.Q()) {
            oz.I();
         }

         net.y.d.d(516, 0.1F);
         this.L(F);
         if(Double.compare(var9, 0.0D) > 0) {
            net.y.d.V();
            byte var15 = 0;
            int var16 = 0;
            if(var16 < var11.size()) {
               h.u var17 = (h.u)var11.get(var16);
               l(var1, var3, var5, var7, var9, var12, var15, var17.y(), var17.T());
               int var10000 = var15 + var17.y();
               ++var16;
            }

            net.y.d.p();
         }

         if(z9.Q()) {
            oz.n8();
         }
      }

   }

   public static void l(double var0, double var2, double var4, double var6, double var8, double var10, int var12, int var13, float[] var14) {
      l(var0, var2, var4, var6, var8, var10, var12, var13, var14, 0.2D, 0.25D);
   }

   public static void l(double var0, double var2, double var4, double var6, double var8, double var10, int var12, int var13, float[] var14, double var15, double var17) {
      e.F();
      int var20 = var12 + var13;
      net.y.d.t(3553, 10242, 10497);
      net.y.d.t(3553, 10243, 10497);
      net.y.d.i();
      net.y.d.j();
      net.y.d.E();
      net.y.d.Y(true);
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE, net.y.d.ONE, net.y.d.ZERO);
      r var21 = r.f();
      net.y.p var22 = var21.k();
      double var23 = var10 + var6;
      double var27 = net.u.t.F(var23 * 0.2D - (double)net.u.t.L(var23 * 0.1D));
      float var29 = var14[0];
      float var30 = var14[1];
      float var31 = var14[2];
      double var32 = var23 * 0.025D * -1.5D;
      double var34 = 0.5D + Math.cos(var32 + 2.356194490192345D) * var15;
      double var36 = 0.5D + Math.sin(var32 + 2.356194490192345D) * var15;
      double var38 = 0.5D + Math.cos(var32 + 0.7853981633974483D) * var15;
      double var40 = 0.5D + Math.sin(var32 + 0.7853981633974483D) * var15;
      double var42 = 0.5D + Math.cos(var32 + 3.9269908169872414D) * var15;
      double var44 = 0.5D + Math.sin(var32 + 3.9269908169872414D) * var15;
      double var46 = 0.5D + Math.cos(var32 + 5.497787143782138D) * var15;
      double var48 = 0.5D + Math.sin(var32 + 5.497787143782138D) * var15;
      double var10000 = 0.0D;
      double var52 = 1.0D;
      double var54 = -1.0D + var27;
      double var56 = (double)var13 * var8 * (0.5D / var15) + var54;
      var22.m(7, x.r);
      var22.H(var0 + var34, var2 + (double)var20, var4 + var36).Y(1.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var34, var2 + (double)var12, var4 + var36).Y(1.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var38, var2 + (double)var12, var4 + var40).Y(0.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var38, var2 + (double)var20, var4 + var40).Y(0.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var46, var2 + (double)var20, var4 + var48).Y(1.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var46, var2 + (double)var12, var4 + var48).Y(1.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var42, var2 + (double)var12, var4 + var44).Y(0.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var42, var2 + (double)var20, var4 + var44).Y(0.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var38, var2 + (double)var20, var4 + var40).Y(1.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var38, var2 + (double)var12, var4 + var40).Y(1.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var46, var2 + (double)var12, var4 + var48).Y(0.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var46, var2 + (double)var20, var4 + var48).Y(0.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var42, var2 + (double)var20, var4 + var44).Y(1.0D, var56).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var42, var2 + (double)var12, var4 + var44).Y(1.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var34, var2 + (double)var12, var4 + var36).Y(0.0D, var54).m(var29, var30, var31, 1.0F).W();
      var22.H(var0 + var34, var2 + (double)var20, var4 + var36).Y(0.0D, var56).m(var29, var30, var31, 1.0F).W();
      var21.p();
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.Y(false);
      var32 = 0.5D - var17;
      var34 = 0.5D - var17;
      var36 = 0.5D + var17;
      var38 = 0.5D - var17;
      var40 = 0.5D - var17;
      var42 = 0.5D + var17;
      var44 = 0.5D + var17;
      var46 = 0.5D + var17;
      var48 = 0.0D;
      var10000 = 1.0D;
      var52 = -1.0D + var27;
      var54 = (double)var13 * var8 + var52;
      var22.m(7, x.r);
      var22.H(var0 + var32, var2 + (double)var20, var4 + var34).Y(1.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var32, var2 + (double)var12, var4 + var34).Y(1.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var36, var2 + (double)var12, var4 + var38).Y(0.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var36, var2 + (double)var20, var4 + var38).Y(0.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var44, var2 + (double)var20, var4 + var46).Y(1.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var44, var2 + (double)var12, var4 + var46).Y(1.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var40, var2 + (double)var12, var4 + var42).Y(0.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var40, var2 + (double)var20, var4 + var42).Y(0.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var36, var2 + (double)var20, var4 + var38).Y(1.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var36, var2 + (double)var12, var4 + var38).Y(1.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var44, var2 + (double)var12, var4 + var46).Y(0.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var44, var2 + (double)var20, var4 + var46).Y(0.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var40, var2 + (double)var20, var4 + var42).Y(1.0D, var54).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var40, var2 + (double)var12, var4 + var42).Y(1.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var32, var2 + (double)var12, var4 + var34).Y(0.0D, var52).m(var29, var30, var31, 0.125F).W();
      var22.H(var0 + var32, var2 + (double)var20, var4 + var34).Y(0.0D, var54).m(var29, var30, var31, 0.125F).W();
      var21.p();
      net.y.d.K();
      net.y.d.S();
      net.y.d.Y(true);
      d.h(new d[1]);
   }

   public boolean Q(h var1) {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
