package net.nv;

import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.no.sw;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class yg extends h {
   public String k() {
      return "stopsound";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.stopsound.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length >= 1 && var3.length <= 3) {
         int var5 = 0;
         net.r.h var6 = l(var1, var2, var3[var5++]);
         String var7 = "";
         String var8 = "";
         if(var3.length >= 2) {
            String var9 = var3[var5++];
            net.yz.p var10 = net.yz.p.j(var9);
            if(var10 == null) {
               throw new t("commands.stopsound.unknownSoundSource", new Object[]{var9});
            }

            var7 = var10.W();
         }

         if(var3.length == 3) {
            var8 = var3[var5++];
         }

         net.n2.h var13 = new net.n2.h(Unpooled.buffer());
         var13.R(var7);
         var13.R(var8);
         var6.t1.h((net.n2.k)(new sw("MC|StopSound", var13)));
         var7.isEmpty();
         var8.isEmpty();
         g(var2, this, "commands.stopsound.success.all", new Object[]{var6.Q()});
         var8.isEmpty();
         g(var2, this, "commands.stopsound.success.soundSource", new Object[]{var7, var6.Q()});
         g(var2, this, "commands.stopsound.success.individualSound", new Object[]{var8, var7, var6.Q()});
      }

      throw new x(this.K(var2), new Object[0]);
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length == 2?o(var3, net.yz.p.n()):(var3.length == 3?o(var3, net.yz.a.h.i()):Collections.emptyList()));
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
