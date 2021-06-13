package net;

import java.awt.Color;
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

public class gu extends gq {
   float B = 0.0F;
   float w = 0.0F;
   double l = 0.0D;
   private int S = 120;
   private int E = 20;

   public gu(mc var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
   }

   public void j(int var1, int var2) {
      gj var4;
      int var5;
      int var6;
      label0: {
         jb.J();
         var4 = this.U();
         var5 = var4.H() + this.Z();
         var6 = var4.i() + this.x();
         boolean var7 = this.R(var1, var2);
         if(var7) {
            if(this.S >= 200) {
               break label0;
            }

            this.S += 5;
         }

         if(this.S > 120) {
            this.S -= 5;
         }
      }

      label115: {
         if(this.d.Q()) {
            if(this.E >= 30) {
               break label115;
            }

            ++this.E;
         }

         if(this.E > 20) {
            --this.E;
         }
      }

      xh.J((double)((float)var5), (double)((float)var6), (double)((float)(var5 + this.V())), (double)((float)(var6 + this.H())), xg.h(G, 255 - this.S).getRGB());
      int var8 = this.d.Q()?-1:(new Color(this.S, this.S, this.S)).getRGB();
      this.B = mw.w(this.B, 2.3F, 0.0F);
      this.w = mw.w(this.w, this.d.Q()?10.0F:17.0F, 0.0F);
      this.l = (double)mw.w((float)this.l, (float)(this.d.Q()?3:10), 0.0F);
      xh.u((float)((double)var5 + this.e - 18.0D), (float)(var6 + 2), (double)((float)((double)var5 + this.e - 2.0D)), (double)((float)((double)var6 + this.C - 3.0D)), (new Color(14, 14, 14)).getRGB());
      xh.u((float)((double)var5 + this.e - (double)this.w), (float)(var6 + 3), (double)((float)((double)var5 + this.e - this.l)), (double)(var6 + this.H() - 4), this.d.Q()?var4.A.B():(new Color(50, 50, 50)).getRGB());
      j.b().R.i(this.d.q(), (float)var5 + 4.0F, (float)var6 + (float)this.H() / this.B - 3.0F, var8);
      if(d.y() == null) {
         jb.v(new int[2]);
      }

   }

   public void a(int var1, int var2, int var3) {
      if(this.R(var1, var2)) {
         this.d.O(!this.d.Q());
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
