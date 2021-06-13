package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.j;
import net.nv.t;
import net.nv.x;

public class yq extends h {
   public String k() {
      return "effect";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.effect.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x("commands.effect.usage", new Object[0]);
      } else {
         net.ne.a var5 = (net.ne.a)C(var1, var2, var3[0], net.ne.a.class);
         if("clear".equals(var3[1])) {
            if(var5.o().isEmpty()) {
               throw new t("commands.effect.failure.notActive.all", new Object[]{var5.Q()});
            }

            var5.f();
            g(var2, this, "commands.effect.success.removed.all", new Object[]{var5.Q()});
         }

         net.n_.f var6 = net.n_.f.Q(h(var3[1], 1));
         throw new j("commands.effect.notFound", new Object[]{var3[1]});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length == 2?o(var3, net.n_.f.j.i()):(var3.length == 5?D(var3, new String[]{"true", "false"}):Collections.emptyList()));
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
