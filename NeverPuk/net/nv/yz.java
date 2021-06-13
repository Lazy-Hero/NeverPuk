package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;
import net.yz.ai;

public class yz extends h {
   public String k() {
      return "particle";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.particle.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 8) {
         throw new x("commands.particle.usage", new Object[0]);
      } else {
         boolean var10000 = false;
         ai var6 = ai.E(var3[0]);
         throw new t("commands.particle.notFound", new Object[]{var3[0]});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?o(var3, ai.h()):(var3.length > 1 && var3.length <= 4?h(var3, 1, var4):(var3.length == 10?D(var3, new String[]{"normal", "force"}):(var3.length == 11?D(var3, var1.k()):Collections.emptyList())));
   }

   public boolean T(String[] var1, int var2) {
      return var2 == 10;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
