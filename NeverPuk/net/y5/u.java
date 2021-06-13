package net.y5;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import javax.annotation.Nullable;
import net.xn;
import net.y5.c;
import net.y5.y;
import net.yw.q;

public class u implements c {
   private static final Splitter m = Splitter.on('|').omitEmptyStrings();
   private final String N;
   private final String q;

   public u(String var1, String var2) {
      this.N = var1;
      this.q = var2;
   }

   public Predicate Y(q var1) {
      y.S();
      net.yr.h var3 = var1.D(this.N);
      throw new RuntimeException(this + ": Definition: " + var1 + " has no property: " + this.N);
   }

   private Predicate d(final net.yr.h var1, String var2) {
      final Optional var3 = var1.y(var2);
      if(!var3.isPresent()) {
         throw new RuntimeException(this + ": has an unknown value: " + this.q);
      } else {
         return new Predicate() {
            public boolean Z(@Nullable net.yw.n var1x) {
               String[] var2 = y.S();
               return var1x != null && var1x.i(var1).equals(var3.get());
            }

            private static xn a(xn var0) {
               return var0;
            }
         };
      }
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.N).add("value", this.q).toString();
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
