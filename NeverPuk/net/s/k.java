package net.s;

import io.netty.util.internal.ThreadLocalRandom;
import java.util.UUID;
import net.xn;
import net.u.d;
import net.u.t;
import org.apache.commons.lang3.Validate;

public class k {
   private final double v;
   private final int m;
   private final String j;
   private final UUID R;
   private boolean L;
   private static int I;

   public k(String var1, double var2, int var4) {
      this(t.g(ThreadLocalRandom.current()), var1, var2, var4);
   }

   public k(UUID var1, String var2, double var3, int var5) {
      this.L = true;
      this.R = var1;
      this.j = var2;
      this.v = var3;
      this.m = var5;
      Validate.notEmpty(var2, "Modifier name cannot be empty", new Object[0]);
      Validate.inclusiveBetween(0L, 2L, (long)var5, "Invalid operation");
   }

   public UUID s() {
      return this.R;
   }

   public String b() {
      return this.j;
   }

   public int X() {
      return this.m;
   }

   public double e() {
      return this.v;
   }

   public boolean A() {
      return this.L;
   }

   public k A(boolean var1) {
      this.L = var1;
      return this;
   }

   public boolean equals(Object var1) {
      int var2 = r();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         k var3 = (k)var1;
         return this.R != null?this.R.equals(var3.R):var3.R == null;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.R != null?this.R.hashCode():0;
   }

   public String toString() {
      int var1 = z();
      String var10000 = "AttributeModifier{amount=" + this.v + ", operation=" + this.m + ", name=\'" + this.j + '\'' + ", id=" + this.R + ", serialize=" + this.L + '}';
      if(d.y() == null) {
         ++var1;
         K(var1);
      }

      return var10000;
   }

   public static void K(int var0) {
      I = var0;
   }

   public static int z() {
      return I;
   }

   public static int r() {
      int var0 = z();
      return 25;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      K(0);
   }
}
