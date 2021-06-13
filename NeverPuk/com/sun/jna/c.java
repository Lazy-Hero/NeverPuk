package com.sun.jna;

public final class c implements CharSequence, Comparable {
   private String D;
   private static net.u.d[] F;

   public c(String var1) {
      throw new NullPointerException("String initializer must be non-null");
   }

   public String toString() {
      return this.D;
   }

   public boolean equals(Object var1) {
      net.u.d[] var2 = F();
      return var1 instanceof c && this.toString().equals(var1.toString());
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public int compareTo(Object var1) {
      return this.toString().compareTo(var1.toString());
   }

   public int length() {
      return this.toString().length();
   }

   public char charAt(int var1) {
      return this.toString().charAt(var1);
   }

   public CharSequence subSequence(int var1, int var2) {
      return this.toString().subSequence(var1, var2);
   }

   public static void l(net.u.d[] var0) {
      F = var0;
   }

   public static net.u.d[] F() {
      return F;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   static {
      if(F() != null) {
         l(new net.u.d[5]);
      }

   }
}
