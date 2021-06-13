package net.yr;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.yr.w;
import net.yz.aq;

public class g extends w {
   protected g(String var1, Collection var2) {
      super(var1, aq.class, var2);
   }

   public static g l(String var0) {
      return B(var0, Predicates.alwaysTrue());
   }

   public static g B(String var0, Predicate var1) {
      return x(var0, Collections2.filter(Lists.newArrayList(aq.values()), var1));
   }

   public static g x(String var0, Collection var1) {
      return new g(var0, var1);
   }
}
