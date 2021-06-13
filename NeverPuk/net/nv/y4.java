package net.nv;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.nv.f;
import net.nv.h;
import net.nv.t;
import net.nv.x;

public class y4 extends h {
   public String k() {
      return "weather";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.weather.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      String[] var4 = t.Y();
      if(var3.length >= 1 && var3.length <= 2) {
         int var5 = (300 + (new Random()).nextInt(600)) * 20;
         if(var3.length >= 2) {
            var5 = g(var3[1], 1, 1000000) * 20;
         }

         net.yv.d var6 = var1.w1[0];
         net.cg.z var7 = var6.B();
         if("clear".equalsIgnoreCase(var3[0])) {
            var7.d(var5);
            var7.P(0);
            var7.H(0);
            var7.d(false);
            var7.p(false);
            g(var2, this, "commands.weather.clear", new Object[0]);
         }

         if("rain".equalsIgnoreCase(var3[0])) {
            var7.d(0);
            var7.P(var5);
            var7.H(var5);
            var7.d(true);
            var7.p(false);
            g(var2, this, "commands.weather.rain", new Object[0]);
         }

         if(!"thunder".equalsIgnoreCase(var3[0])) {
            throw new x("commands.weather.usage", new Object[0]);
         }

         var7.d(0);
         var7.P(var5);
         var7.H(var5);
         var7.d(true);
         var7.p(true);
         g(var2, this, "commands.weather.thunder", new Object[0]);
      }

      throw new x("commands.weather.usage", new Object[0]);
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length == 1?D(var3, new String[]{"clear", "rain", "thunder"}):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
