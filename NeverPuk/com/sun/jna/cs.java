package com.sun.jna;

import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.r;

public abstract class cs extends Number implements b {
   private static final long serialVersionUID = 1L;
   private int P;
   private Number S;
   private boolean i;
   private long I;

   public cs(int var1) {
      this(var1, 0L, false);
   }

   public cs(int var1, boolean var2) {
      this(var1, 0L, var2);
   }

   public cs(int var1, long var2) {
      this(var1, var2, false);
   }

   public cs(int var1, long var2, boolean var4) {
      this.P = var1;
      this.i = var4;
      this.e(var2);
   }

   public void e(long var1) {
      c.F();
      this.I = var1;
      switch(this.P) {
      case 1:
         if(this.i) {
            this.I = var1 & 255L;
         }

         long var10000 = (long)((byte)((int)var1));
         this.S = Byte.valueOf((byte)((int)var1));
      case 2:
         if(this.i) {
            this.I = var1 & 65535L;
         }

         long var8 = (long)((short)((int)var1));
         this.S = Short.valueOf((short)((int)var1));
      case 4:
         if(this.i) {
            this.I = var1 & 4294967295L;
         }

         long var9 = (long)((int)var1);
         this.S = Integer.valueOf((int)var1);
      case 8:
         this.S = Long.valueOf(var1);
      case 3:
      case 5:
      case 6:
      case 7:
      default:
         throw new IllegalArgumentException("Unsupported size: " + this.P);
      }
   }

   public Object E() {
      return this.S;
   }

   public Object c(Object var1, r var2) {
      long var3 = 0L;
      cs var5 = (cs)this.getClass().newInstance();
      var5.e(var3);
      return var5;
   }

   public Class Q() {
      return this.S.getClass();
   }

   public int intValue() {
      return (int)this.I;
   }

   public long longValue() {
      return this.I;
   }

   public float floatValue() {
      return this.S.floatValue();
   }

   public double doubleValue() {
      return this.S.doubleValue();
   }

   public boolean equals(Object var1) {
      return var1 instanceof cs && this.S.equals(((cs)var1).S);
   }

   public String toString() {
      return this.S.toString();
   }

   public int hashCode() {
      return this.S.hashCode();
   }

   public static int F(cs var0, cs var1) {
      return var0 == var1?0:1;
   }

   public static int x(cs var0, long var1) {
      return 1;
   }

   public static final int p(long var0, long var2) {
      return var0 == var2?0:(var0 < var2?-1:1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
