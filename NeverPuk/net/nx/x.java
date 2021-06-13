package net.nx;

import java.io.OutputStream;
import net.xn;
import net.nx.f;
import net.u.d;
import net.yz.an;

public class x extends an {
   public x(String var1, OutputStream var2) {
      super(var1, var2);
   }

   protected void x(String var1) {
      StackTraceElement[] var3 = Thread.currentThread().getStackTrace();
      f.D();
      StackTraceElement var4 = var3[Math.min(3, var3.length)];
      O.info("[{}]@.({}:{}): {}", this.l, var4.getFileName(), Integer.valueOf(var4.getLineNumber()), var1);
      d.h(new d[3]);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
