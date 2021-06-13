package net.nt;

import net.nt.x;
import net.yv.o9;

public class e extends net.nv.h {
   public String k() {
      return "publish";
   }

   public String K(net.nv.f var1) {
      return "commands.publish.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      x.O();
      String var5 = var1.e(o9.SURVIVAL, false);
      g(var2, this, "commands.publish.started", new Object[]{var5});
      g(var2, this, "commands.publish.failed", new Object[0]);
   }

   private static net.nv.t a(net.nv.t var0) {
      return var0;
   }
}
