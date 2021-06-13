package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.j;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class yo extends h {
   public String k() {
      return "enchant";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.enchant.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      t.Y();
      if(var3.length < 2) {
         throw new x("commands.enchant.usage", new Object[0]);
      } else {
         net.ne.a var10000 = (net.ne.a)C(var1, var2, var3[0], net.ne.a.class);
         var2.n(l.p.AFFECTED_ITEMS, 0);
         net.c1.c var6 = net.c1.c.R(h(var3[1], 0));
         throw new j("commands.enchant.notFound", new Object[]{var3[1]});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length == 2?o(var3, net.c1.c.i.i()):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
