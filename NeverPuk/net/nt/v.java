package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class v extends net.nv.h {
   public String k() {
      return "testforblock";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.testforblock.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 4) {
         throw new net.nv.x("commands.testforblock.usage", new Object[0]);
      } else {
         var2.n(net.nv.l.AFFECTED_BLOCKS, 0);
         J(var2, var3, 0, false);
         net.y9.l var6 = I(var2, var3[3]);
         throw new net.nv.j("commands.setblock.notFound", new Object[]{var3[3]});
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):(var3.length == 4?o(var3, net.y9.l.m.i()):Collections.emptyList());
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
