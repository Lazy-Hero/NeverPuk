package net.c9;

import net.xn;
import net.c9.b;

public class pz implements Comparable {
   private final String y;
   private final String r;
   private final String D;
   private final boolean o;

   public pz(String var1, String var2, String var3, boolean var4) {
      this.y = var1;
      this.r = var2;
      this.D = var3;
      this.o = var4;
   }

   public String n() {
      return this.y;
   }

   public boolean V() {
      return this.o;
   }

   public String toString() {
      return String.format("%s (%s)", new Object[]{this.D, this.r});
   }

   public boolean equals(Object var1) {
      int[] var2 = b.K();
      return this == var1?true:var1 instanceof pz && this.y.equals(((pz)var1).y);
   }

   public int hashCode() {
      return this.y.hashCode();
   }

   public int K(pz var1) {
      return this.y.compareTo(var1.y);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
