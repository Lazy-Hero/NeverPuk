package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.util.ArrayList;
import net.gj;
import net.gq;
import net.mc;
import net.xg;
import net.xh;
import net.xn;
import net.y6.jb;

public class gr extends gq {
   private int q = 120;

   public gr(mc var1, gj var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
   }

   public void j(int var1, int var2) {
      gj var4;
      int var5;
      int var6;
      label0: {
         var4 = this.U();
         var5 = var4.H() + this.Z();
         var6 = var4.i() + this.x();
         jb.J();
         boolean var7 = this.R(var1, var2);
         if(var7) {
            if(this.q >= 200) {
               break label0;
            }

            this.q += 5;
         }

         if(this.q > 120) {
            this.q -= 5;
         }
      }

      xh.J((double)var5, (double)var6, (double)(var5 + this.V()), (double)(var6 + this.H()), var4.r?150994944:xg.h(G, 255 - this.q).getRGB());
      (new Color(this.q, this.q, this.q)).getRGB();
      D.R.i(String.format("%s: %s", new Object[]{this.d.q(), ChatFormatting.GRAY + this.d.M()}), (float)(var5 + 2), (float)var6 + (float)this.H() / 2.0F - 2.0F, -1);
   }

   public void a(int var1, int var2, int var3) {
      if(this.R(var1, var2)) {
         ArrayList var4 = this.d.L();
         int var5 = var4.indexOf(this.d.M());
         ++var5;
         if(var5 >= var4.size()) {
            var5 = 0;
         } else {
            var5 = var4.size() - 1;
         }

         this.d.r((String)this.d.L().get(var5));
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
