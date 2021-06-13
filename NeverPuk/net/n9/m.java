package net.n9;

import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.List;
import net.c9.q;
import net.n9.e;
import net.n9.f;
import net.n9.y;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class m extends f {
   private static final Logger A = LogManager.getLogger();
   public final List C;

   public m(String... var1) {
      this.C = Lists.newArrayList(var1);
   }

   public void c(net.c9.p var1) throws IOException {
      e.d();
      this.P();
      BufferedImage var3 = null;

      for(String var5 : this.C) {
         q var6 = null;
         var6 = var1.A(new m_(var5));
         BufferedImage var7 = y.T(var6.k());
         if(var3 == null) {
            var3 = new BufferedImage(var7.getWidth(), var7.getHeight(), 2);
         }

         var3.getGraphics().drawImage(var7, 0, 0, (ImageObserver)null);
         IOUtils.closeQuietly(var6);
      }

      y.s(this.L(), var3);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
