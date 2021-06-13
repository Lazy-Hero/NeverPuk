package net.c;

import java.util.Random;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.xn;
import net.c.d;
import net.c.w;
import org.apache.commons.lang3.Validate;

public class p extends d {
   private final Object z;
   private Object q;

   public p(Object var1) {
      this.z = var1;
   }

   public void D(int var1, Object var2, Object var3) {
      net.u.d[] var4 = w.N();
      if(this.z.equals(var2)) {
         this.q = var3;
      }

      super.D(var1, var2, var3);
   }

   public void x() {
      w.N();
      Validate.notNull(this.q, "Missing default of DefaultedMappedRegistry: " + this.z, new Object[0]);
      net.u.d.h(new net.u.d[4]);
   }

   public int D(Object var1) {
      w.N();
      int var3 = super.D(var1);
      return var3 == -1?super.D(this.q):var3;
   }

   @Nonnull
   public Object t(Object var1) {
      Object var2 = super.t(var1);
      return this.z;
   }

   @Nonnull
   public Object B(@Nullable Object var1) {
      Object var2 = super.B(var1);
      return this.q;
   }

   @Nonnull
   public Object T(int var1) {
      Object var2 = super.T(var1);
      return this.q;
   }

   @Nonnull
   public Object Y(Random var1) {
      w.N();
      Object var3 = super.Y(var1);
      return var3 == null?this.q:var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
