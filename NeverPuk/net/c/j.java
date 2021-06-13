package net.c;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.xn;
import net.c.w;

public class j extends w {
   private final Object k;

   public j(Object var1) {
      this.k = var1;
   }

   @Nonnull
   public Object B(@Nullable Object var1) {
      w.N();
      Object var3 = super.B(var1);
      return var3 == null?this.k:var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
