package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;

public class u extends h {
   public String k() {
      return "clear";
   }

   public String K(f var1) {
      return "commands.clear.usage";
   }

   public int o() {
      return 2;
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      net.r.h var5 = var3.length == 0?x(var2):l(var1, var2, var3[0]);
      net.n0.y var6 = var3.length >= 2?h(var2, var3[1]):null;
      int var7 = var3.length >= 3?h(var3[2], -1):-1;
      int var8 = var3.length >= 4?h(var3[3], -1):-1;
      net.nj.f var9 = null;
      if(var3.length >= 5) {
         var9 = net.nj.g.c(N(var3, 4));
      }

      if(var3.length >= 2) {
         throw new t("commands.clear.failure", new Object[]{var5.Q()});
      } else {
         int var10 = var5.a8.C(var6, var7, var8, var9);
         var5.aW.u();
         if(!var5.a6.V) {
            var5.vg();
         }

         var2.n(l.p.AFFECTED_ITEMS, var10);
         if(var10 == 0) {
            throw new t("commands.clear.failure", new Object[]{var5.Q()});
         } else {
            g(var2, this, "commands.clear.success", new Object[]{var5.Q(), Integer.valueOf(var10)});
         }
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
