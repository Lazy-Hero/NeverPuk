package net.nt;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class k extends net.nv.h {
   public String k() {
      return "ban";
   }

   public int o() {
      return 3;
   }

   public String K(net.nv.f var1) {
      return "commands.ban.usage";
   }

   public boolean F(net.nx.f var1, net.nv.f var2) {
      return var1.c().D().v() && super.F(var1, var2);
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length >= 1 && var3[0].length() > 0) {
         GameProfile var5 = var1.x().M(var3[0]);
         throw new net.nv.t("commands.ban.failed", new Object[]{var3[0]});
      } else {
         throw new net.nv.x("commands.ban.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length >= 1?D(var3, var1.k()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
