package net.n9;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.List;
import net.c9.q;
import net.n0.kw;
import net.n9.e;
import net.n9.f;
import net.n9.y;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r extends f {
   private static final Logger M = LogManager.getLogger();
   private final m_ C;
   private final List l;
   private final List v;

   public r(m_ var1, List var2, List var3) {
      this.C = var1;
      this.l = var2;
      this.v = var3;
   }

   public void c(net.c9.p var1) throws IOException {
      e.d();
      this.P();
      q var3 = null;
      var3 = var1.A(this.C);
      BufferedImage var5 = y.T(var3.k());
      int var6 = var5.getType();
      if(var6 == 0) {
         var6 = 6;
      }

      BufferedImage var4 = new BufferedImage(var5.getWidth(), var5.getHeight(), var6);
      Graphics var7 = var4.getGraphics();
      var7.drawImage(var5, 0, 0, (ImageObserver)null);
      int var8 = 0;

      while(true) {
         if(var8 >= this.l.size() || var8 >= this.v.size()) {
            IOUtils.closeQuietly(var3);
         }

         q var9 = null;
         String var10 = (String)this.l.get(var8);
         int var11 = ((kw)this.v.get(var8)).z();
         var9 = var1.A(new m_(var10));
         BufferedImage var12 = y.T(var9.k());
         if(var12.getWidth() == var4.getWidth() && var12.getHeight() == var4.getHeight() && var12.getType() == 6) {
            int var13 = 0;
            if(var13 < var12.getHeight()) {
               int var14 = 0;
               if(var14 < var12.getWidth()) {
                  int var15 = var12.getRGB(var14, var13);
                  if((var15 & -16777216) != 0) {
                     int var16 = (var15 & 16711680) << 8 & -16777216;
                     int var17 = var5.getRGB(var14, var13);
                     int var18 = net.u.t.S(var17, var11) & 16777215;
                     var12.setRGB(var14, var13, var16 | var18);
                  }

                  ++var14;
               }

               ++var13;
            }

            var4.getGraphics().drawImage(var12, 0, 0, (ImageObserver)null);
         }

         IOUtils.closeQuietly(var9);
         ++var8;
      }
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
