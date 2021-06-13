package net.nt;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nt.x;
import net.yz.m_;

public class m extends net.nv.h {
   public String k() {
      return "summon";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.summon.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(var3.length < 1) {
         throw new net.nv.x("commands.summon.usage", new Object[0]);
      } else {
         String var5 = var3[0];
         net.u.j var6 = var2.z();
         net.u.r var7 = var2.A();
         double var8 = var7.p;
         double var10 = var7.H;
         double var12 = var7.a;
         if(var3.length >= 4) {
            var8 = K(var8, var3[1], true);
            var10 = K(var10, var3[2], false);
            var12 = K(var12, var3[3], true);
            var6 = new net.u.j(var8, var10, var12);
         }

         net.yv.r var14 = var2.T();
         if(!var14.o(var6)) {
            throw new net.nv.t("commands.summon.outOfWorld", new Object[0]);
         } else {
            if(net.ne.v.t.equals(new m_(var5))) {
               var14.i((net.ne.l)(new net.yi.e(var14, var8, var10, var12, false)));
               g(var2, this, "commands.summon.success", new Object[0]);
            }

            net.nj.f var15 = new net.nj.f();
            boolean var16 = false;
            if(var3.length >= 5) {
               String var17 = N(var3, 4);
               var15 = net.nj.g.c(var17);
               var16 = true;
            }

            var15.b("id", var5);
            net.ne.l var20 = net.ny.k.A(var15, var14, var8, var10, var12, true);
            if(var20 == null) {
               throw new net.nv.t("commands.summon.failed", new Object[0]);
            } else {
               var20.S(var8, var10, var12, var20.hN, var20.V);
               if(var20 instanceof net.ne.y) {
                  ((net.ne.y)var20).t(var14.G(new net.u.j(var20)), (net.ne.g)null);
               }

               g(var2, this, "commands.summon.success", new Object[0]);
            }
         }
      }
   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?o(var3, net.ne.v.J()):(var3.length > 1 && var3.length <= 4?h(var3, 1, var4):Collections.emptyList());
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
