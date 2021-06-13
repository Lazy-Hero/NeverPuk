package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class y8 extends h {
   public String k() {
      return "spawnpoint";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.spawnpoint.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length > 1 && var3.length < 4) {
         throw new x("commands.spawnpoint.usage", new Object[0]);
      } else {
         net.r.h var5 = var3.length > 0?l(var1, var2, var3[0]):x(var2);
         net.u.j var6 = var3.length > 3?J(var2, var3, 1, true):var5.z();
         if(var5.hl != null) {
            var5.a(var6, true);
            g(var2, this, "commands.spawnpoint.success", new Object[]{var5.Q(), Integer.valueOf(var6.t()), Integer.valueOf(var6.h()), Integer.valueOf(var6.y())});
         }

      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length > 1 && var3.length <= 4?h(var3, 1, var4):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
