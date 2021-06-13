package net.yr;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.xn;

public class o extends net.yr.z {
   private final ImmutableSet k = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));

   protected o(String var1) {
      super(var1, Boolean.class);
   }

   public Collection Z() {
      return this.k;
   }

   public static o k(String var0) {
      return new o(var0);
   }

   public Optional y(String var1) {
      return !"true".equals(var1) && !"false".equals(var1)?Optional.absent():Optional.of(Boolean.valueOf(var1));
   }

   public String u(Boolean var1) {
      return var1.toString();
   }

   public boolean equals(Object var1) {
      int[] var2 = net.yr.z.G();
      if(this == var1) {
         return true;
      } else if(var1 instanceof o && super.equals(var1)) {
         o var3 = (o)var1;
         return this.k.equals(var3.k);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return 31 * super.hashCode() + this.k.hashCode();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
