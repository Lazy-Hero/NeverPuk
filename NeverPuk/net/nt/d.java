package net.nt;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class d extends net.nv.h {
   public String k() {
      return "deop";
   }

   public int o() {
      return 3;
   }

   public String K(net.nv.f var1) {
      return "commands.deop.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length == 1 && var3[0].length() > 0) {
         GameProfile var5 = var1.c().z().Z(var3[0]);
         throw new net.nv.t("commands.deop.failed", new Object[]{var3[0]});
      } else {
         throw new net.nv.x("commands.deop.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.c().F()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
