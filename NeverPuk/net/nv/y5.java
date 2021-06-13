package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.nv.f;
import net.nv.h;
import net.nv.t;

public class y5 extends h {
   public String k() {
      return "kill";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.kill.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length == 0) {
         net.r.h var5 = x(var2);
         var5.L();
         g(var2, this, "commands.kill.successful", new Object[]{var5.b()});
      }

      net.ne.l var6 = w(var1, var2, var3[0]);
      var6.L();
      g(var2, this, "commands.kill.successful", new Object[]{var6.b()});
   }

   public boolean T(String[] var1, int var2) {
      String[] var3 = t.Y();
      return var2 == 0;
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      String[] var5 = t.Y();
      return var3.length == 1?D(var3, var1.k()):Collections.emptyList();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
