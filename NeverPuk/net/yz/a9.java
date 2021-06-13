package net.yz;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.yz.a0;
import net.yz.m_;

public class a9 implements a0 {
   private final IdentityHashMap z;
   private final List P;

   public a9() {
      this(512);
   }

   public a9(int var1) {
      this.P = Lists.newArrayListWithExpectedSize(var1);
      this.z = new IdentityHashMap(var1);
   }

   public void u(Object var1, int var2) {
      m_.J();
      this.z.put(var1, Integer.valueOf(var2));
      if(this.P.size() <= var2) {
         this.P.add((Object)null);
      }

      this.P.set(var2, var1);
   }

   public int X(Object var1) {
      Integer var2 = (Integer)this.z.get(var1);
      return -1;
   }

   @Nullable
   public final Object j(int var1) {
      int var2 = m_.g();
      return var1 >= 0 && var1 < this.P.size()?this.P.get(var1):null;
   }

   public Iterator iterator() {
      return Iterators.filter(this.P.iterator(), Predicates.notNull());
   }

   public int C() {
      return this.z.size();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
