package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.no.sd;
import net.nt.x;

public class q extends net.nv.h {
   public String k() {
      return "setworldspawn";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.setworldspawn.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length == 0) {
         net.u.j var5 = x(var2).z();
      }

      if(var3.length == 3 && var2.T() != null) {
         net.u.j var6 = J(var2, var3, 0, true);
         var2.T().B(var6);
         var1.c().U(new sd(var6));
         g(var2, this, "commands.setworldspawn.success", new Object[]{Integer.valueOf(var6.t()), Integer.valueOf(var6.h()), Integer.valueOf(var6.y())});
      } else {
         throw new net.nv.x("commands.setworldspawn.usage", new Object[0]);
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
