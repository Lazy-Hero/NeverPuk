package net.ym;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ym.e;
import net.ym.t;
import net.yz.m_;

public class l {
   public static final l L = new l();
   private final List b = Lists.newArrayList();

   private l() {
   }

   public l(List var1) {
      int var2 = var1.size() - 1;

      while(true) {
         this.b.add(var1.get(var2));
         --var2;
      }
   }

   @Nullable
   public m_ J(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
      int var4 = t.v();
      if(!this.b.isEmpty()) {
         Iterator var5 = this.b.iterator();
         if(var5.hasNext()) {
            e var6 = (e)var5.next();
            if(var6.s(var1, var2, var3)) {
               return var6.E();
            }
         }
      }

      return null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
