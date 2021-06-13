package net;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.gj;
import net.gq;
import net.mc;
import net.mw;
import net.xg;
import net.xh;
import net.xn;
import net.nn.j;
import net.u.d;
import net.y6.jb;

public class gb extends gq {
   private boolean b = false;
   private int P = 120;
   private float f = 0.0F;
   private float x = 0.0F;

   public gb(mc var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
   }

   public void j(int var1, int var2) {
      gj var4 = this.U();
      int var5 = var4.H() + this.Z();
      int var6 = var4.i() + this.x() + -1;
      boolean var7 = this.R(var1, var2);
      int var8 = this.H();
      int var9 = this.V();
      jb.J();
      mc var10 = this.d;
      double var11 = var10.u();
      double var13 = var10.H();
      if(this.b) {
         var10.n(this.j((double)(var1 - var5) * (var13 - var11) / (double)var9 + var11, var10.s()));
         if(Double.compare(var10.p(), var13) > 0) {
            var10.n(var13);
            d.h(new d[3]);
         }

         if(var10.p() < var11) {
            var10.n(var11);
         }
      }

      String var17;
      int var18;
      label189: {
         double var15 = this.j(var10.p(), var10.s());
         var17 = String.valueOf(var15);
         var18 = Color.WHITE.getRGB();
         double var19 = (var10.p() - var11) / (var13 - var11);
         this.x = mw.w(this.x, (float)var19, 0.0F);
         if(var7) {
            if(this.P >= 200) {
               break label189;
            }

            this.P += 5;
         }

         if(this.P > 120) {
            this.P -= 5;
         }
      }

      this.f = mw.w(this.f, 2.3F, 0.0F);
      xh.J((double)((float)var5), (double)((float)var6), (double)((float)(var5 + var9)), (double)((float)(var6 + var8)), var4.r?150994944:xg.h(G, 255 - this.P).getRGB());
      xh.J((double)((float)(var5 + 3)), (double)((float)var6 + (float)var8 - 5.0F + -1.0F), (double)(var5 + (var9 - 3)), (double)((float)(var6 + var8 - 2)), (new Color(45, 44, 44)).getRGB());
      xh.z((double)((float)(var5 + 4)), (double)((float)(var6 + var8 - 5)), (double)((float)var5 + ((float)var9 * this.x - 4.0F)), (double)((float)(var6 + var8 - 3)), var4.A.B(), var4.A.b());
      j.b().R.i(var10.q(), (float)var5 + 2.0F, (float)var6 + (float)var8 / this.f - 4.0F, var18);
      j.b().R.i(var17, (float)(var5 + var9 - j.b().R.s(var17) - 3), (float)var6 + (float)var8 / this.f - 4.0F, var18);
   }

   public void a(int var1, int var2, int var3) {
      if(this.R(var1, var2)) {
         this.b = true;
      }

   }

   public void T(int var1, int var2, int var3) {
      this.b = false;
   }

   private double j(double var1, double var3) {
      double var5 = (double)Math.round(var1 / var3) * var3;
      BigDecimal var7 = new BigDecimal(var5);
      var7 = var7.setScale(2, RoundingMode.HALF_UP);
      return var7.doubleValue();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
