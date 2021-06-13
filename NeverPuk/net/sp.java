package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;
import net.yn.w;
import org.apache.commons.lang3.RandomStringUtils;

public class sp extends mk {
   public sp() {
      super("AntiAFK", or.Player);
   }

   @mr
   public void V(zg var1) {
      w.I();
      String var3 = RandomStringUtils.randomAlphabetic(4);
      if(!p.sf.FD() && this.v()) {
         if(p.sf.x % 200 == 0 && p.sf.k) {
            p.sf.Z();
         }

         if(p.sf.x % 400 == 0) {
            p.Z();
         }

         if(p.sf.x % 600 == 0) {
            p.sf.f(var3);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
