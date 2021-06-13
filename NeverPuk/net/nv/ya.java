package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class ya extends h {
   public String k() {
      return "locate";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.locate.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length != 1) {
         throw new x("commands.locate.usage", new Object[0]);
      } else {
         String var5 = var3[0];
         net.u.j var6 = var2.T().p(var5, var2.z(), false);
         var2.r(new net.cb.h("commands.locate.success", new Object[]{var5, Integer.valueOf(var6.t()), Integer.valueOf(var6.y())}));
         throw new t("commands.locate.failure", new Object[]{var5});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"Stronghold", "Monument", "Village", "Mansion", "EndCity", "Fortress", "Temple", "Mineshaft"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
