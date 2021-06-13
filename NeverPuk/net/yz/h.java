package net.yz;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import net.xn;
import org.apache.logging.log4j.Logger;

public class h {
   public static h.y M() {
      String var0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      return var0.contains("win")?h.y.WINDOWS:(var0.contains("mac")?h.y.OSX:(var0.contains("solaris")?h.y.SOLARIS:(var0.contains("sunos")?h.y.SOLARIS:(var0.contains("linux")?h.y.LINUX:(var0.contains("unix")?h.y.LINUX:h.y.UNKNOWN)))));
   }

   @Nullable
   public static Object a(FutureTask var0, Logger var1) {
      var0.run();
      return var0.get();
   }

   public static Object s(List var0) {
      return var0.get(var0.size() - 1);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum y {
      LINUX,
      SOLARIS,
      WINDOWS,
      OSX,
      UNKNOWN;
   }
}
