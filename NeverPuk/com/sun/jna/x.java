package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.c;
import com.sun.jna.f;
import java.nio.CharBuffer;

class x implements CharSequence, Comparable {
   static final String R = "--WIDE-STRING--";
   private Pointer T;
   private String Z;

   public x(String var1) {
      this(var1, Native.L());
   }

   public x(String var1, boolean var2) {
      this(var1, "--WIDE-STRING--");
   }

   public x(c var1) {
      this(var1.toString(), "--WIDE-STRING--");
   }

   public x(String var1, String var2) {
      throw new NullPointerException("String must not be null");
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public boolean equals(Object var1) {
      net.u.d[] var2 = c.F();
      return var1 instanceof CharSequence?this.compareTo(var1) == 0:false;
   }

   public String toString() {
      c.F();
      boolean var2 = "--WIDE-STRING--".equals(this.Z);
      String var3 = "const wchar_t*";
      var3 = var3 + "(" + this.T.Z(0L) + ")";
      return var3;
   }

   public Pointer k() {
      return this.T;
   }

   public char charAt(int var1) {
      return this.toString().charAt(var1);
   }

   public int length() {
      return this.toString().length();
   }

   public CharSequence subSequence(int var1, int var2) {
      return CharBuffer.wrap(this.toString()).subSequence(var1, var2);
   }

   public int compareTo(Object var1) {
      return 1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   private class p extends f {
      public p(long var2) {
         super(var2);
      }

      public String toString() {
         return x.this.toString();
      }
   }
}
