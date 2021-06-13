package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.gj;
import net.gq;
import net.mk;
import net.mw;
import net.xg;
import net.xh;
import net.xn;
import net.nn.j;
import net.y6.jb;

public class gw extends gq {
   private final mk i;
   float r = 0.0F;
   private int a = 120;

   public gw(mk var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.i = var1;
   }

   public void j(int var1, int var2) {
      gj var4;
      int var5;
      int var6;
      int var8;
      int var9;
      label0: {
         jb.J();
         var4 = this.U();
         var5 = var4.H() + this.Z();
         var6 = var4.i() + this.x();
         boolean var7 = this.R(var1, var2);
         var8 = this.H();
         var9 = this.V();
         if(var7) {
            if(this.a >= 200) {
               break label0;
            }

            this.a += 5;
         }

         if(this.a > 120) {
            this.a -= 5;
         }
      }

      this.r = mw.w(this.r, 2.3F, 0.01F);
      xh.J((double)((float)var5), (double)((float)var6), (double)((float)(var5 + var9)), (double)((float)(var6 + var8)), var4.r?150994944:xg.h(G, 255 - this.a).getRGB());
      j.b().R.i("Visible: " + ChatFormatting.GRAY + this.i.m, (float)var5 + 2.0F, (float)var6 + (float)this.H() / this.r - 2.0F, -1);
      super.j(var1, var2);
   }

   public void a(int var1, int var2, int var3) {
      if(this.R(var1, var2)) {
         this.i.m = !this.i.m;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
