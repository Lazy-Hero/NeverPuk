package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class y extends net.nv.h {
   public String k() {
      return "banlist";
   }

   public int o() {
      return 3;
   }

   public boolean F(net.nx.f var1, net.nv.f var2) {
      net.u.d[] var3 = x.O();
      return (var1.c().Y().v() || var1.c().D().v()) && super.F(var1, var2);
   }

   public String K(net.nv.f var1) {
      return "commands.banlist.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length >= 1 && "ips".equalsIgnoreCase(var3[0])) {
         var2.r(new net.cb.h("commands.banlist.ips", new Object[]{Integer.valueOf(var1.c().Y().g().length)}));
         var2.r(new net.cb.l(g(var1.c().Y().g())));
      }

      var2.r(new net.cb.h("commands.banlist.players", new Object[]{Integer.valueOf(var1.c().D().g().length)}));
      var2.r(new net.cb.l(g(var1.c().D().g())));
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"players", "ips"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
