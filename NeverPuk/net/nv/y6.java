package net.nv;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.l;
import net.nv.t;
import net.nv.x;

public class y6 extends h {
   public String k() {
      return "time";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.time.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length > 1) {
         if("set".equals(var3[0])) {
            if("day".equals(var3[1])) {
               boolean var9 = true;
            }

            if("night".equals(var3[1])) {
               boolean var10 = true;
            }

            int var11 = h(var3[1], 0);
            this.n(var1, var11);
            g(var2, this, "commands.time.set", new Object[]{Integer.valueOf(var11)});
            return;
         }

         if("add".equals(var3[0])) {
            int var8 = h(var3[1], 0);
            this.Q(var1, var8);
            g(var2, this, "commands.time.added", new Object[]{Integer.valueOf(var8)});
            return;
         }

         if("query".equals(var3[0])) {
            if("daytime".equals(var3[1])) {
               int var7 = (int)(var2.T().j() % 24000L);
               var2.n(l.p.QUERY_RESULT, var7);
               g(var2, this, "commands.time.query", new Object[]{Integer.valueOf(var7)});
               return;
            }

            if("day".equals(var3[1])) {
               int var6 = (int)(var2.T().j() / 24000L % 2147483647L);
               var2.n(l.p.QUERY_RESULT, var6);
               g(var2, this, "commands.time.query", new Object[]{Integer.valueOf(var6)});
               return;
            }

            if("gametime".equals(var3[1])) {
               int var5 = (int)(var2.T().y() % 2147483647L);
               var2.n(l.p.QUERY_RESULT, var5);
               g(var2, this, "commands.time.query", new Object[]{Integer.valueOf(var5)});
               return;
            }
         }
      }

      throw new x("commands.time.usage", new Object[0]);
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"set", "add", "query"}):(var3.length == 2 && "set".equals(var3[0])?D(var3, new String[]{"day", "night"}):(var3.length == 2 && "query".equals(var3[0])?D(var3, new String[]{"daytime", "gametime", "day"}):Collections.emptyList()));
   }

   protected void n(net.nx.f var1, int var2) {
      for(int var3 = 0; var3 < var1.w1.length; ++var3) {
         var1.w1[var3].N((long)var2);
      }

   }

   protected void Q(net.nx.f var1, int var2) {
      for(int var3 = 0; var3 < var1.w1.length; ++var3) {
         net.yv.d var4 = var1.w1[var3];
         var4.N(var4.j() + (long)var2);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
