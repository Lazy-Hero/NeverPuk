package net.nv;

import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class y9 extends h {
   public String k() {
      return "setidletimeout";
   }

   public int o() {
      return 3;
   }

   public String K(f var1) {
      return "commands.setidletimeout.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length != 1) {
         throw new x("commands.setidletimeout.usage", new Object[0]);
      } else {
         int var5 = h(var3[0], 0);
         var1.N(var5);
         g(var2, this, "commands.setidletimeout.success", new Object[]{Integer.valueOf(var5)});
      }
   }

   private static t a(t var0) {
      return var0;
   }
}
