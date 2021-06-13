package net.nv;

import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class y2 extends h {
   public String k() {
      return "reload";
   }

   public int o() {
      return 3;
   }

   public String K(f var1) {
      return "commands.reload.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length > 0) {
         throw new x("commands.reload.usage", new Object[0]);
      } else {
         var1.j();
         g(var2, this, "commands.reload.success", new Object[0]);
      }
   }

   private static t a(t var0) {
      return var0;
   }
}
