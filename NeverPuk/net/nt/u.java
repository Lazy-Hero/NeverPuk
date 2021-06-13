package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nl.z1;
import net.nt.x;

public class u extends net.nv.h {
   public String k() {
      return "setblock";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.setblock.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 4) {
         throw new net.nv.x("commands.setblock.usage", new Object[0]);
      } else {
         var2.n(net.nv.l.AFFECTED_BLOCKS, 0);
         net.u.j var5 = J(var2, var3, 0, false);
         net.y9.l var6 = net.nv.h.I(var2, var3[3]);
         if(var3.length >= 5) {
            U(var6, var3[4]);
         }

         net.yw.n var7 = var6.p();
         net.yv.r var8 = var2.T();
         if(!var8.o(var5)) {
            throw new net.nv.t("commands.setblock.outOfWorld", new Object[0]);
         } else {
            new net.nj.f();
            boolean var10 = false;
            if(var3.length >= 7 && var6.W()) {
               String var11 = N(var3, 6);
               net.nj.g.c(var11);
               var10 = true;
            }

            if(var3.length >= 6) {
               if("destroy".equals(var3[5])) {
                  var8.e(var5, true);
                  if(var6 == net.nb.f.ou) {
                     g(var2, this, "commands.setblock.success", new Object[0]);
                     return;
                  }
               } else if("keep".equals(var3[5]) && !var8.y(var5)) {
                  throw new net.nv.t("commands.setblock.noChange", new Object[0]);
               }
            }

            net.ni.v var14 = var8.L(var5);
            if(var14 != null && var14 instanceof z1) {
               ((z1)var14).T();
            }

            if(!var8.k(var5, var7, 2)) {
               throw new net.nv.t("commands.setblock.noChange", new Object[0]);
            } else {
               var8.c(var5, var7.Q(), false);
               var2.n(net.nv.l.AFFECTED_BLOCKS, 1);
               g(var2, this, "commands.setblock.success", new Object[0]);
            }
         }
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length > 0 && var3.length <= 3?h(var3, 0, var4):(var3.length == 4?o(var3, net.y9.l.m.i()):(var3.length == 6?D(var3, new String[]{"replace", "destroy", "keep"}):Collections.emptyList()));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
