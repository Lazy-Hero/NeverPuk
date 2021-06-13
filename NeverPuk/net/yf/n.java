package net.yf;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.v.c;
import net.ys.r;

public class n extends c {
   public static final Map Q = Maps.newHashMap();
   public static final List z = Lists.newArrayList();

   private static net.q.o h(r var0) {
      net.q.o var1 = new net.q.o();
      z.add(var1);
      ((List)Q.computeIfAbsent(var0, (var0) -> {
         return new ArrayList();
      })).add(var1);
      ((List)Q.computeIfAbsent(r.B, (var0) -> {
         return new ArrayList();
      })).add(var1);
      return var1;
   }

   private static r q(ks var0) {
      r var1 = var0.Z().V();
      return var1 != r.M && var1 != r.y && var1 != r.i?(var1 == r.R?r.y:r.K):var1;
   }

   static {
      HashBasedTable var0 = HashBasedTable.create();

      for(s var2 : net.cr.n.v) {
         if(!var2.c()) {
            r var3 = q(var2.E());
            String var4 = var2.X();
            net.q.o var5;
            if(var4.isEmpty()) {
               var5 = h(var3);
            } else {
               net.q.o var6 = (net.q.o)var0.get(var3, var4);
               var5 = h(var3);
               var0.put(var3, var4, var5);
            }

            var5.k(var2);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
