package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.a;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.w;
import net.nv.x;

public class yf extends h {
   public String k() {
      return "execute";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.execute.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 5) {
         throw new x("commands.execute.usage", new Object[0]);
      } else {
         net.ne.l var5 = C(var1, var2, var3[0], net.ne.l.class);
         double var6 = K(var5.b, var3[1], false);
         double var8 = K(var5.hS, var3[2], false);
         double var10 = K(var5.hr, var3[3], false);
         new net.u.j(var6, var8, var10);
         byte var12 = 4;
         if("detect".equals(var3[4]) && var3.length > 10) {
            net.yv.r var13 = var5.T();
            double var14 = K(var6, var3[5], false);
            double var16 = K(var8, var3[6], false);
            double var18 = K(var10, var3[7], false);
            net.y9.l var20 = I(var2, var3[8]);
            net.u.j var21 = new net.u.j(var14, var16, var18);
            if(!var13.o(var21)) {
               throw new t("commands.execute.failed", new Object[]{"detect", var5.Q()});
            }

            net.yw.n var22 = var13.Z(var21);
            if(var22.Q() != var20) {
               throw new t("commands.execute.failed", new Object[]{"detect", var5.Q()});
            }

            if(!h.L(var20, var3[9]).apply(var22)) {
               throw new t("commands.execute.failed", new Object[]{"detect", var5.Q()});
            }

            var12 = 10;
         }

         String var23 = N(var3, var12);
         a var24 = a.m(var2).G(var5, new net.u.r(var6, var8, var10)).E(var1.w1[0].N().b("commandBlockOutput"));
         w var15 = var1.f();
         int var25 = var15.L(var24, var23);
         if(var25 < 1) {
            throw new t("commands.execute.allInvocationsFailed", new Object[]{var23});
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length > 1 && var3.length <= 4?h(var3, 1, var4):(var3.length > 5 && var3.length <= 8 && "detect".equals(var3[4])?h(var3, 5, var4):(var3.length == 9 && "detect".equals(var3[4])?o(var3, net.y9.l.m.i()):Collections.emptyList())));
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
