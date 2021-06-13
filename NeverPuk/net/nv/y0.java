package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.n0.ks;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class y0 extends h {
   public String k() {
      return "give";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.give.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x("commands.give.usage", new Object[0]);
      } else {
         net.r.h var5 = l(var1, var2, var3[0]);
         net.n0.y var6 = h(var2, var3[1]);
         int var7 = var3.length >= 3?g(var3[2], 1, var6.E()):1;
         int var8 = var3.length >= 4?j(var3[3]):0;
         ks var9 = new ks(var6, var7, var8);
         if(var3.length >= 5) {
            String var10 = N(var3, 4);
            var9.t(net.nj.g.c(var10));
         }

         boolean var12 = var5.a8.D(var9);
         if(var12) {
            var5.hl.L((net.r.r)null, var5.b, var5.hS, var5.hr, net.nb.l.oM, net.yz.p.PLAYERS, 0.2F, ((var5.Q().nextFloat() - var5.Q().nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var5.aW.u();
         }

         if(var12 && var9.B()) {
            var9.u(1);
            var2.n(l.p.AFFECTED_ITEMS, var7);
            net.nm.i var11 = var5.Y(var9, false);
            if(var11 != null) {
               var11.W();
            }
         }

         var2.n(l.p.AFFECTED_ITEMS, var7 - var9.U());
         net.nm.i var13 = var5.Y(var9, false);
         if(var13 != null) {
            var13.F();
            var13.l(var5.Q());
         }

         g(var2, this, "commands.give.success", new Object[]{var9.b(), Integer.valueOf(var7), var5.Q()});
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length == 2?o(var3, net.n0.y.V.i()):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
