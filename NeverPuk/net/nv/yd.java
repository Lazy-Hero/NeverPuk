package net.nv;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class yd extends h {
   public String k() {
      return "trigger";
   }

   public int o() {
      return 0;
   }

   public String K(f var1) {
      return "commands.trigger.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 3) {
         throw new x("commands.trigger.usage", new Object[0]);
      } else {
         if(var2 instanceof net.r.h) {
            net.r.h var5 = (net.r.h)var2;
         }

         net.ne.l var6 = var2.P();
         if(!(var6 instanceof net.r.h)) {
            throw new t("commands.trigger.invalidPlayer", new Object[0]);
         } else {
            net.r.h var10 = (net.r.h)var6;
            net.nc.b var11 = var1.n(0).J();
            net.nc.l var7 = var11.e(var3[0]);
            if(var7 != null && var7.v() == net.nc.u.z) {
               int var8 = j(var3[2]);
               if(!var11.M(var10.Q(), var7)) {
                  throw new t("commands.trigger.invalidObjective", new Object[]{var3[0]});
               }

               net.nc.o var9 = var11.p(var10.Q(), var7);
               if(var9.G()) {
                  throw new t("commands.trigger.disabled", new Object[]{var3[0]});
               }

               if("set".equals(var3[1])) {
                  var9.A(var8);
               }

               if(!"add".equals(var3[1])) {
                  throw new t("commands.trigger.invalidMode", new Object[]{var3[1]});
               }

               var9.R(var8);
               var9.b(true);
               if(var10.tA.x()) {
                  g(var2, this, "commands.trigger.success", new Object[]{var3[0], var3[1], var3[2]});
               }
            }

            throw new t("commands.trigger.invalidObjective", new Object[]{var3[0]});
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      if(var3.length == 1) {
         net.nc.b var5 = var1.n(0).J();
         ArrayList var6 = Lists.newArrayList();

         for(net.nc.l var8 : var5.q()) {
            if(var8.v() == net.nc.u.z) {
               var6.add(var8.e());
            }
         }

         return D(var3, (String[])var6.toArray(new String[var6.size()]));
      } else {
         return var3.length == 2?D(var3, new String[]{"add", "set"}):Collections.emptyList();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
