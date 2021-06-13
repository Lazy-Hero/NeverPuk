package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class h extends net.nv.h {
   public String k() {
      return "say";
   }

   public int o() {
      return 1;
   }

   public String K(net.nv.f var1) {
      return "commands.say.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length > 0 && var3[0].length() > 0) {
         net.cb.t var5 = F(var2, var3, 0, true);
         var1.c().b((net.cb.t)(new net.cb.h("chat.type.announcement", new Object[]{var2.b(), var5})));
      }

      throw new net.nv.x("commands.say.usage", new Object[0]);
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      net.u.d[] var5 = x.O();
      return var3.length >= 1?D(var3, var1.k()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
