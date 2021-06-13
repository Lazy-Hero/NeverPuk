package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;
import net.yz.ao;

public class b extends net.nv.h {
   public String k() {
      return "save-all";
   }

   public String K(net.nv.f var1) {
      return "commands.save.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      x.O();
      var2.r(new net.cb.h("commands.save.start", new Object[0]));
      if(var1.c() != null) {
         var1.c().o();
      }

      int var5 = 0;
      if(var5 < var1.w1.length) {
         if(var1.w1[var5] != null) {
            net.yv.d var6 = var1.w1[var5];
            boolean var7 = var6.Y;
            var6.Y = false;
            var6.K(true, (ao)null);
            var6.Y = var7;
         }

         ++var5;
      }

      if(var3.length > 0 && "flush".equals(var3[0])) {
         var2.r(new net.cb.h("commands.save.flushStart", new Object[0]));
         var5 = 0;
         if(var5 < var1.w1.length) {
            if(var1.w1[var5] != null) {
               net.yv.d var11 = var1.w1[var5];
               boolean var12 = var11.Y;
               var11.Y = false;
               var11.h();
               var11.Y = var12;
            }

            ++var5;
         }

         var2.r(new net.cb.h("commands.save.flushEnd", new Object[0]));
      }

      g(var2, this, "commands.save.success", new Object[0]);
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"flush"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
