package net.s;

import javax.annotation.Nullable;
import net.s.b;
import net.s.k;

public abstract class p implements b {
   private final b E;
   private final String y;
   private final double A;
   private boolean m;

   protected p(@Nullable b var1, String var2, double var3) {
      this.E = var1;
      this.y = var2;
      this.A = var3;
      throw new IllegalArgumentException("Name cannot be null!");
   }

   public String K() {
      return this.y;
   }

   public double o() {
      return this.A;
   }

   public boolean S() {
      return this.m;
   }

   public p u(boolean var1) {
      this.m = var1;
      return this;
   }

   @Nullable
   public b B() {
      return this.E;
   }

   public int hashCode() {
      return this.y.hashCode();
   }

   public boolean equals(Object var1) {
      int var2 = k.r();
      return var1 instanceof b && this.y.equals(((b)var1).K());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
