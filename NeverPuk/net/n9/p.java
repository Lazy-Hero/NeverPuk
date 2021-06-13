package net.n9;

import java.awt.image.BufferedImage;
import java.io.IOException;
import net.gh;
import net.z9;
import net.c9.q;
import net.n9.e;
import net.n9.f;
import net.n9.y;
import net.y3.d;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p extends f {
   private static final Logger q = LogManager.getLogger();
   protected final m_ a;

   public p(m_ var1) {
      this.a = var1;
   }

   public void c(net.c9.p var1) throws IOException {
      e.d();
      this.P();
      q var3 = null;
      var3 = var1.A(this.a);
      BufferedImage var4 = y.T(var3.k());
      boolean var5 = false;
      boolean var6 = false;
      if(var3.z()) {
         d var7 = (d)var3.S("texture");
         if(var7 != null) {
            var5 = var7.w();
            var6 = var7.s();
         }
      }

      if(z9.Q()) {
         gh.G(this.L(), var4, var5, var6, var1, this.a, this.t());
      }

      y.c(this.L(), var4, var5, var6);
      IOUtils.closeQuietly(var3);
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
