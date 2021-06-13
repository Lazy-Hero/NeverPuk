package net.nt;

import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class t extends net.nv.h {
   public String k() {
      return "me";
   }

   public int o() {
      return 0;
   }

   public String K(net.nv.f var1) {
      return "commands.me.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length <= 0) {
         throw new net.nv.x("commands.me.usage", new Object[0]);
      } else {
         net.cb.t var5 = F(var2, var3, 0, !(var2 instanceof net.r.r));
         var1.c().b((net.cb.t)(new net.cb.h("chat.type.emote", new Object[]{var2.b(), var5})));
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return D(var3, var1.k());
   }

   private static net.nv.t a(net.nv.t var0) {
      return var0;
   }
}
