package net;

import java.awt.Color;
import net._d;
import net.xh;
import net.xn;
import net.nn.j;
import net.z.m;

public class p9 extends m {
   private int W;

   public p9(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public p9(int var1, int var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.W = 20;
   }

   public void u(int var1, int var2) {
      boolean var3 = _d.z();
      if(this.F) {
         this.P = var1 >= this.D && var2 >= this.R && var1 < this.D + this.s && var2 < this.R + this.h;
         Color var4 = new Color(215, 215, 215, 255);
         Color var5 = new Color(this.W - 15, 0, this.W - 15, 150);
         if(this.O) {
            if(this.P) {
               if(this.W < 100) {
                  this.W += 8;
               }

               var4 = new Color(255, 255, 255, 255);
            }

            if(this.W > 20) {
               this.W -= 8;
            }
         }

         xh.f((double)this.D, (double)this.R, (double)this.s, (double)this.h, var5, new Color(30, 30, 30, 255));
         float var10002 = (float)this.D + (float)this.s / 2.0F;
         float var10003 = (float)this.R;
         j.b().x.I(this.J, var10002, var10003 + (float)(this.h - 8) / 2.0F, var4.getRGB());
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
