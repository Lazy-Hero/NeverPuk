package net.yr;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import net.yz.au;

public class w extends net.yr.z {
   private final ImmutableSet c;
   private final Map J = Maps.newHashMap();

   protected w(String var1, Class var2, Collection var3) {
      super(var1, var2);
      this.c = ImmutableSet.copyOf(var3);

      for(Enum var5 : var3) {
         String var6 = ((au)var5).f();
         if(this.J.containsKey(var6)) {
            throw new IllegalArgumentException("Multiple values have the same name \'" + var6 + "\'");
         }

         this.J.put(var6, var5);
      }

   }

   public Collection Z() {
      return this.c;
   }

   public Optional y(String var1) {
      return Optional.fromNullable(this.J.get(var1));
   }

   public String p(Enum var1) {
      return ((au)var1).f();
   }

   public boolean equals(Object var1) {
      int[] var2 = net.yr.z.G();
      if(this == var1) {
         return true;
      } else if(var1 instanceof w && super.equals(var1)) {
         w var3 = (w)var1;
         return this.c.equals(var3.c) && this.J.equals(var3.J);
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.c.hashCode();
      var1 = 31 * var1 + this.J.hashCode();
      return var1;
   }

   public static w l(String var0, Class var1) {
      return L(var0, var1, Predicates.alwaysTrue());
   }

   public static w L(String var0, Class var1, Predicate var2) {
      return O(var0, var1, Collections2.filter(Lists.newArrayList(var1.getEnumConstants()), var2));
   }

   public static w g(String var0, Class var1, Enum... var2) {
      return O(var0, var1, Lists.newArrayList(var2));
   }

   public static w O(String var0, Class var1, Collection var2) {
      return new w(var0, var1, var2);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
