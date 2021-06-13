package net.y;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import javax.annotation.Nullable;
import net.xn;
import net.y.p;
import net.y.um;

public class q implements um {
   private int[] H;
   private int g;
   private int c;

   @Nullable
   public BufferedImage i(BufferedImage var1) {
      String var2 = p.S();
      if(var1 == null) {
         return null;
      } else {
         this.g = 64;
         this.c = 64;
         int var3 = var1.getWidth();
         int var4 = var1.getHeight();
         int var5 = 1;
         if(this.g < var3 || this.c < var4) {
            this.g *= 2;
            this.c *= 2;
            var5 *= 2;
         }

         BufferedImage var6 = new BufferedImage(this.g, this.c, 2);
         Graphics var7 = var6.getGraphics();
         var7.drawImage(var1, 0, 0, (ImageObserver)null);
         boolean var8 = var1.getHeight() == 32 * var5;
         var7.dispose();
         this.H = ((DataBufferInt)var6.getRaster().getDataBuffer()).getData();
         this.G(0 * var5, 0 * var5, 32 * var5, 16 * var5);
         this.G(0 * var5, 16 * var5, 64 * var5, 32 * var5);
         this.G(16 * var5, 48 * var5, 48 * var5, 64 * var5);
         return var6;
      }
   }

   public void X() {
   }

   private void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 < var3; ++var5) {
         for(int var6 = var2; var6 < var4; ++var6) {
            int var7 = this.H[var5 + var6 * this.g];
            if((var7 >> 24 & 255) < 128) {
               return;
            }
         }
      }

      for(int var8 = var1; var8 < var3; ++var8) {
         for(int var9 = var2; var9 < var4; ++var9) {
            this.H[var8 + var9 * this.g] &= 16777215;
         }
      }

   }

   private void G(int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 < var3; ++var5) {
         for(int var6 = var2; var6 < var4; ++var6) {
            this.H[var5 + var6 * this.g] |= -16777216;
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
