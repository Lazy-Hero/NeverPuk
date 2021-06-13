package net.cw;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.cw.t;
import net.y9.l;
import net.yw.n;

public class c implements Predicate {
   private final l D;

   private c(l var1) {
      this.D = var1;
   }

   public static c c(l var0) {
      return new c(var0);
   }

   public boolean M(@Nullable n var1) {
      String[] var2 = t.q.Z();
      return var1 != null && var1.Q() == this.D;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
