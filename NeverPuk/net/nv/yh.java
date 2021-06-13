package net.nv;

import net.nv.f;
import net.nv.h;
import net.nv.t;

public class yh extends h {
   public boolean F(net.nx.f var1, f var2) {
      String[] var3 = t.Y();
      return var1.n() || super.F(var1, var2);
   }

   public String k() {
      return "seed";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.seed.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      Object var5 = var2 instanceof net.r.r?((net.r.r)var2).hl:var1.n(0);
      var2.r(new net.cb.h("commands.seed.success", new Object[]{Long.valueOf(((net.yv.r)var5).a())}));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
