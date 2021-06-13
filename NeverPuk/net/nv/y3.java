package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class y3 extends h {
   public String k() {
      return "xp";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.xp.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length <= 0) {
         throw new x("commands.xp.usage", new Object[0]);
      } else {
         String var5 = var3[0];
         if(!var5.endsWith("l") && !var5.endsWith("L")) {
            boolean var10 = false;
         } else {
            boolean var10000 = true;
         }

         if(var5.length() > 1) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         int var7 = j(var5);
         boolean var8 = var7 < 0;
         net.r.h var9 = var3.length > 1?l(var1, var2, var3[1]):x(var2);
         var2.n(l.p.QUERY_RESULT, var9.aX);
         var9.N(-var7);
         g(var2, this, "commands.xp.success.negative.levels", new Object[]{Integer.valueOf(var7), var9.Q()});
         var9.N(var7);
         g(var2, this, "commands.xp.success.levels", new Object[]{Integer.valueOf(var7), var9.Q()});
         var2.n(l.p.QUERY_RESULT, var9.ac);
         var9.E(var7);
         g(var2, this, "commands.xp.success", new Object[]{Integer.valueOf(var7), var9.Q()});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 2?D(var3, var1.k()):Collections.emptyList();
   }

   public boolean T(String[] var1, int var2) {
      return var2 == 1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
