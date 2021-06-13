package net.cw;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.cw.t;
import net.y1.l;
import net.yw.n;

public class x implements Predicate {
   private final l p;

   private x(l var1) {
      this.p = var1;
   }

   public static x z(l var0) {
      return new x(var0);
   }

   public boolean z(@Nullable n var1) {
      String[] var2 = t.q.Z();
      return var1 != null && var1.n() == this.p;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
