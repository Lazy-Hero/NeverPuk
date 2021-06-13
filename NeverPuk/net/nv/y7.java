package net.nv;

import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.no.sa;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y7 extends h {
   private static final Logger Y = LogManager.getLogger();

   public String k() {
      return "title";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.title.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length < 2) {
         throw new x("commands.title.usage", new Object[0]);
      } else {
         if(var3.length < 3) {
            if("title".equals(var3[1]) || "subtitle".equals(var3[1]) || "actionbar".equals(var3[1])) {
               throw new x("commands.title.usage.title", new Object[0]);
            }

            if("times".equals(var3[1])) {
               throw new x("commands.title.usage.times", new Object[0]);
            }
         }

         net.r.h var5 = l(var1, var2, var3[0]);
         sa.t var6 = sa.t.Z(var3[1]);
         if(var6 != sa.t.CLEAR && var6 != sa.t.RESET) {
            if(var6 == sa.t.TIMES) {
               if(var3.length != 5) {
                  throw new x("commands.title.usage", new Object[0]);
               }

               int var7 = j(var3[2]);
               int var8 = j(var3[3]);
               int var9 = j(var3[4]);
               sa var10 = new sa(var7, var8, var9);
               var5.t1.h((net.n2.k)var10);
               g(var2, this, "commands.title.success", new Object[0]);
            }

            if(var3.length < 3) {
               throw new x("commands.title.usage", new Object[0]);
            }

            String var11 = N(var3, 2);
            net.cb.t var13 = net.cb.t.m(var11);
            sa var14 = new sa(var6, net.cb.y.x(var2, var13, var5));
            var5.t1.h((net.n2.k)var14);
            g(var2, this, "commands.title.success", new Object[0]);
         }

         if(var3.length != 2) {
            throw new x("commands.title.usage", new Object[0]);
         } else {
            sa var12 = new sa(var6, (net.cb.t)null);
            var5.t1.h((net.n2.k)var12);
            g(var2, this, "commands.title.success", new Object[0]);
         }
      }
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, var1.k()):(var3.length == 2?D(var3, sa.t.f()):Collections.emptyList());
   }

   public boolean T(String[] var1, int var2) {
      return true;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
