package net.nt;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import javax.annotation.Nullable;
import net.nt.x;

public class g extends net.nv.h {
   public String k() {
      return "pardon-ip";
   }

   public int o() {
      return 3;
   }

   public boolean F(net.nx.f var1, net.nv.f var2) {
      return var1.c().Y().v() && super.F(var1, var2);
   }

   public String K(net.nv.f var1) {
      return "commands.unbanip.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length == 1 && var3[0].length() > 1) {
         Matcher var5 = x.t.matcher(var3[0]);
         if(var5.matches()) {
            var1.c().Y().U(var3[0]);
            g(var2, this, "commands.unbanip.success", new Object[]{var3[0]});
         }

         throw new net.nv.v("commands.unbanip.invalid", new Object[0]);
      } else {
         throw new net.nv.x("commands.unbanip.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.c().Y().g()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
