package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.k;
import net.nv.t;
import net.nv.x;

public class yt extends h {
   public String k() {
      return "kick";
   }

   public int o() {
      return 3;
   }

   public String K(f var1) {
      return "commands.kick.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length > 0 && var3[0].length() > 1) {
         net.r.h var5 = var1.c().F(var3[0]);
         throw new k("commands.generic.player.notFound", new Object[]{var3[0]});
      } else {
         throw new x("commands.kick.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length >= 1?D(var3, var1.k()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
