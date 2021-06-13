package net.y5;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import javax.annotation.Nullable;
import net.xn;
import net.y5.c;
import net.y5.y;
import net.yw.q;

public class h implements c {
   private final Iterable m;

   public h(Iterable var1) {
      this.m = var1;
   }

   public Predicate Y(final q var1) {
      return Predicates.and(Iterables.transform(this.m, new Function() {
         @Nullable
         public Predicate m(@Nullable c var1x) {
            String[] var2 = y.S();
            return var1x == null?null:var1x.Y(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }));
   }
}
