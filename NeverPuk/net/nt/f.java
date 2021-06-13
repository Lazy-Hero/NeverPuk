package net.nt;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class f extends net.nv.h {
   public String k() {
      return "whitelist";
   }

   public int o() {
      return 3;
   }

   public String K(net.nv.f var1) {
      return "commands.whitelist.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 1) {
         throw new net.nv.x("commands.whitelist.usage", new Object[0]);
      } else {
         if("on".equals(var3[0])) {
            var1.c().G(true);
            g(var2, this, "commands.whitelist.enabled", new Object[0]);
         }

         if("off".equals(var3[0])) {
            var1.c().G(false);
            g(var2, this, "commands.whitelist.disabled", new Object[0]);
         }

         if("list".equals(var3[0])) {
            var2.r(new net.cb.h("commands.whitelist.list", new Object[]{Integer.valueOf(var1.c().P().length), Integer.valueOf(var1.c().l().length)}));
            String[] var5 = var1.c().P();
            var2.r(new net.cb.l(g(var5)));
         }

         if("add".equals(var3[0])) {
            if(var3.length < 2) {
               throw new net.nv.x("commands.whitelist.add.usage", new Object[0]);
            } else {
               GameProfile var7 = var1.x().M(var3[1]);
               throw new net.nv.t("commands.whitelist.add.failed", new Object[]{var3[1]});
            }
         } else if("remove".equals(var3[0])) {
            if(var3.length < 2) {
               throw new net.nv.x("commands.whitelist.remove.usage", new Object[0]);
            } else {
               GameProfile var6 = var1.c().F().C(var3[1]);
               throw new net.nv.t("commands.whitelist.remove.failed", new Object[]{var3[1]});
            }
         } else {
            if("reload".equals(var3[0])) {
               var1.c().h();
               g(var2, this, "commands.whitelist.reloaded", new Object[0]);
            }

         }
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      if(var3.length == 1) {
         return D(var3, new String[]{"on", "off", "list", "add", "remove", "reload"});
      } else {
         if(var3.length == 2) {
            if("remove".equals(var3[0])) {
               return D(var3, var1.c().P());
            }

            if("add".equals(var3[0])) {
               return D(var3, var1.x().g());
            }
         }

         return Collections.emptyList();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
