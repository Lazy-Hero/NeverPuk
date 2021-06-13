package net;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import net.mf;
import net.xn;
import net.xq;
import net.n9.e;
import net.n9.t;
import net.nn.j;
import net.yy.f;
import org.apache.commons.io.FilenameUtils;

public class ry {
   public static void l(f var0) {
      mf.O();
      String var2 = var0.F();
      if(var2 != null && !var2.isEmpty()) {
         String var3 = "http://s.optifine.net/capes/" + var2 + ".png";
         String var4 = FilenameUtils.getBaseName(var3);
         net.yz.m_ var5 = new net.yz.m_("capeof/" + var4);
         e var6 = j.b().n();
         t var7 = var6.m(var5);
         if(var7 != null && var7 instanceof net.y.uh) {
            net.y.uh var8 = (net.y.uh)var7;
            if(var8.C != null) {
               if(var8.C.booleanValue()) {
                  var0.P(var5);
               }

               return;
            }
         }

         xq var10 = new xq(var0, var5);
         net.y.uh var9 = new net.y.uh((File)null, var3, (net.yz.m_)null, var10);
         var9.F = true;
         var6.E(var5, var9);
      }

   }

   public static BufferedImage G(BufferedImage var0) {
      int var1 = 64;
      int var2 = 32;
      int var3 = var0.getWidth();

      for(int var4 = var0.getHeight(); var1 < var3 || var2 < var4; var2 *= 2) {
         var1 *= 2;
      }

      BufferedImage var6 = new BufferedImage(var1, var2, 2);
      Graphics var5 = var6.getGraphics();
      var5.drawImage(var0, 0, 0, (ImageObserver)null);
      var5.dispose();
      return var6;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
