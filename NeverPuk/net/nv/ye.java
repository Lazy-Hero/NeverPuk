package net.nv;

import java.util.UUID;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class ye extends h {
   public String k() {
      return "entitydata";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.entitydata.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x("commands.entitydata.usage", new Object[0]);
      } else {
         net.ne.l var5 = w(var1, var2, var3[0]);
         if(var5 instanceof net.r.r) {
            throw new t("commands.entitydata.noPlayers", new Object[]{var5.b()});
         } else {
            net.nj.f var6 = c(var5);
            net.nj.f var7 = var6.F();
            net.nj.f var8 = net.nj.g.c(N(var3, 1));
            UUID var9 = var5.O();
            var6.I(var8);
            var5.k(var9);
            if(var6.equals(var7)) {
               throw new t("commands.entitydata.failed", new Object[]{var6.toString()});
            } else {
               var5.B(var6);
               g(var2, this, "commands.entitydata.success", new Object[]{var6.toString()});
            }
         }
      }
   }

   public boolean T(String[] var1, int var2) {
      String[] var3 = t.Y();
      return var2 == 0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
