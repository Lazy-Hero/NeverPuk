package net.nv;

import net.xn;
import net.nv.f;
import net.nv.h;
import net.nv.t;

public class y_ extends h {
   public String k() {
      return "toggledownfall";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.downfall.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      this.T(var1);
      g(var2, this, "commands.downfall.success", new Object[0]);
   }

   protected void T(net.nx.f var1) {
      t.Y();
      net.cg.z var3 = var1.w1[0].B();
      var3.d(!var3.l());
   }

   private static xn a(xn var0) {
      return var0;
   }
}
