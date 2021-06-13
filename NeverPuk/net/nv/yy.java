package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;
import net.yv.o9;

public class yy extends h {
   public String k() {
      return "gamemode";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.gamemode.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length <= 0) {
         throw new x("commands.gamemode.usage", new Object[0]);
      } else {
         o9 var5 = this.r(var2, var3[0]);
         net.r.h var6 = var3.length >= 2?l(var1, var2, var3[1]):x(var2);
         var6.s(var5);
         net.cb.h var7 = new net.cb.h("gameMode." + var5.t(), new Object[0]);
         if(var2.T().N().b("sendCommandFeedback")) {
            var6.r(new net.cb.h("gameMode.changed", new Object[]{var7}));
         }

         if(var6 == var2) {
            z(var2, this, 1, "commands.gamemode.success.self", new Object[]{var7});
         }

         z(var2, this, 1, "commands.gamemode.success.other", new Object[]{var6.Q(), var7});
      }
   }

   protected o9 r(f var1, String var2) throws t {
      o9 var3 = o9.l(var2, o9.NOT_SET);
      return var3 == o9.NOT_SET?net.yv.t.K(g(var2, 0, o9.values().length - 2)):var3;
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      String[] var5 = t.Y();
      return var3.length == 1?D(var3, new String[]{"survival", "creative", "adventure", "spectator"}):(var3.length == 2?D(var3, var1.k()):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return var2 == 1;
   }

   private static Exception c(Exception var0) {
      return var0;
   }
}
