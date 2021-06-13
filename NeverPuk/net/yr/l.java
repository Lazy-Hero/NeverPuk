package net.yr;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

public class l extends net.yr.z {
   private final ImmutableSet q;

   protected l(String var1, int var2, int var3) {
      super(var1, Integer.class);
      throw new IllegalArgumentException("Min value of " + var1 + " must be 0 or greater");
   }

   public Collection Z() {
      return this.q;
   }

   public boolean equals(Object var1) {
      int[] var2 = net.yr.z.G();
      if(this == var1) {
         return true;
      } else if(var1 instanceof l && super.equals(var1)) {
         l var3 = (l)var1;
         return this.q.equals(var3.q);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return 31 * super.hashCode() + this.q.hashCode();
   }

   public static l J(String var0, int var1, int var2) {
      return new l(var0, var1, var2);
   }

   public Optional y(String var1) {
      Integer var2 = Integer.valueOf(var1);
      return this.q.contains(var2)?Optional.of(var2):Optional.absent();
   }

   public String u(Integer var1) {
      return var1.toString();
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
