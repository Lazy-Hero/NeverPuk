package net.y2;

import java.io.IOException;
import net.y.ui;
import net.y2.m;
import net.y2.t;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o {
   private static final Logger N = LogManager.getLogger();
   private static o Z;

   public static void e() {
      Z = new o();
   }

   public static o K() {
      return Z;
   }

   public void O(m var1) {
      var1.R().A(var1);
      var1.s().A(var1);
      ui.N(var1.z());
   }

   public int t() throws net.yf.a {
      t.h();
      int var2 = ui.B();
      if(var2 <= 0) {
         throw new net.yf.a("Could not create shader program (returned program ID " + var2 + ")");
      } else {
         return var2;
      }
   }

   public void i(m var1) throws IOException {
      t.h();
      var1.R().r(var1);
      var1.s().r(var1);
      ui.i(var1.z());
      int var3 = ui.i(var1.z(), ui.E);
      N.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", var1.s().c(), var1.R().c());
      N.warn(ui.M(var1.z(), '耀'));
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
