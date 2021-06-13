package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;

public class p extends net.nv.h {
   public String k() {
      return "testfor";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.testfor.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 1) {
         throw new net.nv.x("commands.testfor.usage", new Object[0]);
      } else {
         net.ne.l var5 = w(var1, var2, var3[0]);
         net.nj.f var6 = null;
         if(var3.length >= 2) {
            var6 = net.nj.g.c(N(var3, 1));
         }

         if(var6 != null) {
            net.nj.f var7 = c(var5);
            if(!net.nj.e.v(var6, var7, true)) {
               throw new net.nv.t("commands.testfor.failure", new Object[]{var5.Q()});
            }
         }

         g(var2, this, "commands.testfor.success", new Object[]{var5.Q()});
      }
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
