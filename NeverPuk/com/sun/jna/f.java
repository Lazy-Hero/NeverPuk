package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.c;
import com.sun.jna.ce;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public class f extends Pointer {
   private static final Map r = Collections.synchronizedMap(new WeakHashMap());
   private static final ce W = new ce();
   protected long b;

   public static void H() {
      W.N();
   }

   public static void F() {
      for(f var2 : new LinkedList(r.keySet())) {
         var2.S();
      }

   }

   public f(long var1) {
      this.b = var1;
      if(var1 <= 0L) {
         throw new IllegalArgumentException("Allocation size must be greater than zero");
      } else {
         this.U = O(var1);
         if(this.U == 0L) {
            throw new OutOfMemoryError("Cannot allocate " + var1 + " bytes");
         } else {
            r.put(this, new WeakReference(this));
         }
      }
   }

   protected f() {
   }

   public Pointer B(long var1) {
      return this.x(var1, this.g() - var1);
   }

   public Pointer x(long var1, long var3) {
      this.d(var1, var3);
      return new f.q(var1, var3);
   }

   public f D(int var1) {
      net.u.d[] var2 = c.F();
      if(var1 <= 0) {
         throw new IllegalArgumentException("Byte boundary must be positive: " + var1);
      } else {
         int var3 = 0;
         if(var1 == 1 << var3) {
            long var4 = ~((long)var1 - 1L);
            if((this.U & var4) != this.U) {
               long var6 = this.U + (long)var1 - 1L & var4;
               long var8 = this.U + this.b - var6;
               if(var8 <= 0L) {
                  throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
               } else {
                  return (f)this.x(var6 - this.U, var8);
               }
            } else {
               return this;
            }
         } else {
            ++var3;
            throw new IllegalArgumentException("Byte boundary must be a power of two");
         }
      }
   }

   protected void finalize() {
      this.S();
   }

   protected synchronized void S() {
      s(this.U);
      r.remove(this);
      this.U = 0L;
   }

   public void O() {
      this.c(this.b);
   }

   public boolean V() {
      return this.U != 0L;
   }

   public long g() {
      return this.b;
   }

   protected void d(long var1, long var3) {
      if(var1 < 0L) {
         throw new IndexOutOfBoundsException("Invalid offset: " + var1);
      } else if(var1 + var3 > this.b) {
         String var5 = "Bounds exceeds available space : size=" + this.b + ", offset=" + (var1 + var3);
         throw new IndexOutOfBoundsException(var5);
      }
   }

   public void F(long var1, byte[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 1L);
      super.F(var1, var3, var4, var5);
   }

   public void G(long var1, short[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 2L);
      super.G(var1, var3, var4, var5);
   }

   public void C(long var1, char[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 2L);
      super.C(var1, var3, var4, var5);
   }

   public void X(long var1, int[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 4L);
      super.X(var1, var3, var4, var5);
   }

   public void c(long var1, long[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 8L);
      super.c(var1, var3, var4, var5);
   }

   public void n(long var1, float[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 4L);
      super.n(var1, var3, var4, var5);
   }

   public void K(long var1, double[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 8L);
      super.K(var1, var3, var4, var5);
   }

   public void Y(long var1, byte[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 1L);
      super.Y(var1, var3, var4, var5);
   }

   public void B(long var1, short[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 2L);
      super.B(var1, var3, var4, var5);
   }

   public void a(long var1, char[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 2L);
      super.a(var1, var3, var4, var5);
   }

   public void b(long var1, int[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 4L);
      super.b(var1, var3, var4, var5);
   }

   public void X(long var1, long[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 8L);
      super.X(var1, var3, var4, var5);
   }

   public void U(long var1, float[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 4L);
      super.U(var1, var3, var4, var5);
   }

   public void D(long var1, double[] var3, int var4, int var5) {
      this.d(var1, (long)var5 * 8L);
      super.D(var1, var3, var4, var5);
   }

   public byte Z(long var1) {
      this.d(var1, 1L);
      return super.Z(var1);
   }

   public char q(long var1) {
      this.d(var1, 1L);
      return super.q(var1);
   }

   public short H(long var1) {
      this.d(var1, 2L);
      return super.H(var1);
   }

   public int G(long var1) {
      this.d(var1, 4L);
      return super.G(var1);
   }

   public long u(long var1) {
      this.d(var1, 8L);
      return super.u(var1);
   }

   public float A(long var1) {
      this.d(var1, 4L);
      return super.A(var1);
   }

   public double C(long var1) {
      this.d(var1, 8L);
      return super.C(var1);
   }

   public Pointer f(long var1) {
      this.d(var1, (long)Pointer.i);
      return super.f(var1);
   }

   public ByteBuffer u(long var1, long var3) {
      this.d(var1, var3);
      ByteBuffer var5 = super.u(var1, var3);
      W.c(var5, this);
      return var5;
   }

   public String u(long var1, String var3) {
      this.d(var1, 0L);
      return super.u(var1, var3);
   }

   public String Z(long var1) {
      this.d(var1, 0L);
      return super.Z(var1);
   }

   public void n(long var1, byte var3) {
      this.d(var1, 1L);
      super.n(var1, var3);
   }

   public void b(long var1, char var3) {
      this.d(var1, (long)Native.x);
      super.b(var1, var3);
   }

   public void J(long var1, short var3) {
      this.d(var1, 2L);
      super.J(var1, var3);
   }

   public void c(long var1, int var3) {
      this.d(var1, 4L);
      super.c(var1, var3);
   }

   public void N(long var1, long var3) {
      this.d(var1, 8L);
      super.N(var1, var3);
   }

   public void e(long var1, float var3) {
      this.d(var1, 4L);
      super.e(var1, var3);
   }

   public void C(long var1, double var3) {
      this.d(var1, 8L);
      super.C(var1, var3);
   }

   public void U(long var1, Pointer var3) {
      this.d(var1, (long)Pointer.i);
      super.U(var1, var3);
   }

   public void G(long var1, String var3, String var4) {
      this.d(var1, (long)Native.I(var3, var4).length + 1L);
      super.G(var1, var3, var4);
   }

   public void s(long var1, String var3) {
      this.d(var1, ((long)var3.length() + 1L) * (long)Native.x);
      super.s(var1, var3);
   }

   public String toString() {
      return "allocated@0x" + Long.toHexString(this.U) + " (" + this.b + " bytes)";
   }

   protected static void s(long var0) {
      if(var0 != 0L) {
         Native.free(var0);
      }

   }

   protected static long O(long var0) {
      return Native.malloc(var0);
   }

   public String i() {
      return this.H(0L, (int)this.g());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private class q extends f {
      public q(long var2, long var4) {
         this.b = var4;
         this.U = f.this.U + var2;
      }

      protected void S() {
         this.U = 0L;
      }

      protected void d(long var1, long var3) {
         f.this.d(this.U - f.this.U + var1, var3);
      }

      public String toString() {
         return super.toString() + " (shared from " + f.this.toString() + ")";
      }
   }
}
