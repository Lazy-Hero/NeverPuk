package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.ck;
import com.sun.jna.cq;
import com.sun.jna.cu;
import com.sun.jna.d;
import com.sun.jna.r;
import com.sun.jna.s;
import com.sun.jna.u;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class Pointer {
   public static final int i;
   public static final Pointer o;
   protected long U;

   public static final Pointer g(long var0) {
      return new Pointer.x(var0);
   }

   public static final Pointer B(int var0) {
      return new Pointer.x((long)var0 & -1L);
   }

   Pointer() {
   }

   public Pointer(long var1) {
      this.U = var1;
   }

   public Pointer B(long var1) {
      return this.x(var1, 0L);
   }

   public Pointer x(long var1, long var3) {
      return var1 == 0L?this:new Pointer(this.U + var1);
   }

   public void c(long var1) {
      this.E(0L, var1, (byte)0);
   }

   public boolean equals(Object var1) {
      return var1 == this;
   }

   public int hashCode() {
      return (int)((this.U >>> 32) + (this.U & -1L));
   }

   public long W(long var1, byte var3) {
      return Native.indexOf(this, this.U, var1, var3);
   }

   public void F(long var1, byte[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void G(long var1, short[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void C(long var1, char[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void X(long var1, int[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void c(long var1, long[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void n(long var1, float[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void K(long var1, double[] var3, int var4, int var5) {
      Native.read(this, this.U, var1, var3, var4, var5);
   }

   public void O(long var1, Pointer[] var3, int var4, int var5) {
      for(int var6 = 0; var6 < var5; ++var6) {
         Pointer var7 = this.f(var1 + (long)(var6 * i));
         Pointer var8 = var3[var6 + var4];
         if(var7.U != var8.U) {
            var3[var6 + var4] = var7;
         }
      }

   }

   public void Y(long var1, byte[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void B(long var1, short[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void a(long var1, char[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void b(long var1, int[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void X(long var1, long[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void U(long var1, float[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void D(long var1, double[] var3, int var4, int var5) {
      Native.write(this, this.U, var1, var3, var4, var5);
   }

   public void j(long var1, Pointer[] var3, int var4, int var5) {
      for(int var6 = 0; var6 < var5; ++var6) {
         this.U(var1 + (long)(var6 * i), var3[var4 + var6]);
      }

   }

   Object A(long var1, Class var3, Object var4) {
      Object var5 = null;
      if(s.class.isAssignableFrom(var3)) {
         s var6 = (s)var4;
         if(s.o.class.isAssignableFrom(var3)) {
            var6 = s.R(var3, var6, this.f(var1));
         } else {
            var6.H(this, (int)var1, true);
            var6.b();
         }

         var5 = var6;
      } else if(var3 != Boolean.TYPE && var3 != Boolean.class) {
         if(var3 != Byte.TYPE && var3 != Byte.class) {
            if(var3 != Short.TYPE && var3 != Short.class) {
               if(var3 != Character.TYPE && var3 != Character.class) {
                  if(var3 != Integer.TYPE && var3 != Integer.class) {
                     if(var3 != Long.TYPE && var3 != Long.class) {
                        if(var3 != Float.TYPE && var3 != Float.class) {
                           if(var3 != Double.TYPE && var3 != Double.class) {
                              if(Pointer.class.isAssignableFrom(var3)) {
                                 Pointer var10 = this.f(var1);
                                 Pointer var7 = var4 instanceof Pointer?(Pointer)var4:null;
                                 if(var10.U != var7.U) {
                                    var5 = var10;
                                 } else {
                                    var5 = var7;
                                 }
                              } else if(var3 == String.class) {
                                 Pointer var11 = this.f(var1);
                                 var5 = var11.x(0L);
                              } else if(var3 == c.class) {
                                 Pointer var12 = this.f(var1);
                                 var5 = new c(var12.Z(0L));
                              } else if(Callback.class.isAssignableFrom(var3)) {
                                 Pointer var13 = this.f(var1);
                                 var5 = null;
                              } else if(d.w && Buffer.class.isAssignableFrom(var3)) {
                                 Pointer var15 = this.f(var1);
                                 var5 = null;
                              } else {
                                 if(!b.class.isAssignableFrom(var3)) {
                                    if(var3.isArray()) {
                                       throw new IllegalStateException("Need an initialized array");
                                    }

                                    throw new IllegalArgumentException("Reading \"" + var3 + "\" from memory is not supported");
                                 }

                                 b var14 = (b)var4;
                                 Object var16 = this.A(var1, var14.Q(), (Object)null);
                                 var5 = var14.c(var16, new r(var3));
                                 if(var14.equals(var5)) {
                                    var5 = var14;
                                 }
                              }
                           } else {
                              var5 = Double.valueOf(this.C(var1));
                           }
                        } else {
                           var5 = Float.valueOf(this.A(var1));
                        }
                     } else {
                        var5 = Long.valueOf(this.u(var1));
                     }
                  } else {
                     var5 = Integer.valueOf(this.G(var1));
                  }
               } else {
                  var5 = Character.valueOf(this.q(var1));
               }
            } else {
               var5 = Short.valueOf(this.H(var1));
            }
         } else {
            var5 = Byte.valueOf(this.Z(var1));
         }
      } else {
         var5 = Function.c(this.G(var1) != 0);
      }

      return var5;
   }

   private void U(long var1, Object var3, Class var4) {
      int var5 = 0;
      var5 = Array.getLength(var3);
      if(var4 == Byte.TYPE) {
         this.F(var1, (byte[])((byte[])var3), 0, var5);
      } else if(var4 == Short.TYPE) {
         this.G(var1, (short[])((short[])var3), 0, var5);
      } else if(var4 == Character.TYPE) {
         this.C(var1, (char[])((char[])var3), 0, var5);
      } else if(var4 == Integer.TYPE) {
         this.X(var1, (int[])((int[])((int[])var3)), 0, var5);
      } else if(var4 == Long.TYPE) {
         this.c(var1, (long[])((long[])var3), 0, var5);
      } else if(var4 == Float.TYPE) {
         this.n(var1, (float[])((float[])var3), 0, var5);
      } else if(var4 == Double.TYPE) {
         this.K(var1, (double[])((double[])var3), 0, var5);
      } else if(Pointer.class.isAssignableFrom(var4)) {
         this.O(var1, (Pointer[])((Pointer[])var3), 0, var5);
      } else if(s.class.isAssignableFrom(var4)) {
         s[] var7 = (s[])((s[])var3);
         if(s.o.class.isAssignableFrom(var4)) {
            Pointer[] var8 = this.c(var1, var7.length);

            for(int var9 = 0; var9 < var7.length; ++var9) {
               var7[var9] = s.R(var4, var7[var9], var8[var9]);
            }
         } else {
            s var14 = var7[0];
            var14 = s.Z(var4, this.B(var1));
            var14.N();
            var7[0] = var14;
            s[] var17 = var14.R(var7.length);

            for(int var10 = 1; var10 < var7.length; ++var10) {
               if(var7[var10] == null) {
                  var7[var10] = var17[var10];
               } else {
                  var7[var10].H(this, (int)(var1 + (long)(var10 * var7[var10].F())), true);
                  var7[var10].b();
               }
            }
         }
      } else {
         if(!b.class.isAssignableFrom(var4)) {
            throw new IllegalArgumentException("Reading array of " + var4 + " from memory not supported");
         }

         b[] var13 = (b[])((b[])var3);
         ck var16 = ck.n(var4);
         int var18 = Native.J(var3.getClass(), var3) / var13.length;

         for(int var19 = 0; var19 < var13.length; ++var19) {
            Object var11 = this.A(var1 + (long)(var18 * var19), var16.E(), var13[var19]);
            var13[var19] = (b)var16.i(var11, new r(var4));
         }
      }

   }

   public byte Z(long var1) {
      return Native.getByte(this, this.U, var1);
   }

   public char q(long var1) {
      return Native.getChar(this, this.U, var1);
   }

   public short H(long var1) {
      return Native.getShort(this, this.U, var1);
   }

   public int G(long var1) {
      return Native.getInt(this, this.U, var1);
   }

   public long u(long var1) {
      return Native.getLong(this, this.U, var1);
   }

   public cq A(long var1) {
      return new cq(cq.r == 8?this.u(var1):(long)this.G(var1));
   }

   public float A(long var1) {
      return Native.getFloat(this, this.U, var1);
   }

   public double C(long var1) {
      return Native.getDouble(this, this.U, var1);
   }

   public Pointer f(long var1) {
      return Native.J(this.U + var1);
   }

   public ByteBuffer u(long var1, long var3) {
      return Native.getDirectByteBuffer(this, this.U, var1, var3).order(ByteOrder.nativeOrder());
   }

   /** @deprecated */
   @Deprecated
   public String J(long var1, boolean var3) {
      return this.Z(var1);
   }

   public String Z(long var1) {
      return Native.getWideString(this, this.U, var1);
   }

   public String x(long var1) {
      return this.u(var1, Native.L());
   }

   public String u(long var1, String var3) {
      return Native.O(this, var1, var3);
   }

   public byte[] F(long var1, int var3) {
      byte[] var4 = new byte[var3];
      this.F(var1, var4, 0, var3);
      return var4;
   }

   public char[] Q(long var1, int var3) {
      char[] var4 = new char[var3];
      this.C(var1, var4, 0, var3);
      return var4;
   }

   public short[] I(long var1, int var3) {
      short[] var4 = new short[var3];
      this.G(var1, var4, 0, var3);
      return var4;
   }

   public int[] N(long var1, int var3) {
      int[] var4 = new int[var3];
      this.X(var1, (int[])var4, 0, var3);
      return var4;
   }

   public long[] l(long var1, int var3) {
      long[] var4 = new long[var3];
      this.c(var1, var4, 0, var3);
      return var4;
   }

   public float[] V(long var1, int var3) {
      float[] var4 = new float[var3];
      this.n(var1, var4, 0, var3);
      return var4;
   }

   public double[] y(long var1, int var3) {
      double[] var4 = new double[var3];
      this.K(var1, var4, 0, var3);
      return var4;
   }

   public Pointer[] K(long var1) {
      ArrayList var3 = new ArrayList();
      int var4 = 0;
      Pointer var5 = this.f(var1);

      while(true) {
         var3.add(var5);
         var4 += i;
         var5 = this.f(var1 + (long)var4);
      }
   }

   public Pointer[] c(long var1, int var3) {
      Pointer[] var4 = new Pointer[var3];
      this.O(var1, var4, 0, var3);
      return var4;
   }

   public String[] b(long var1) {
      return this.b(var1, -1, Native.L());
   }

   public String[] y(long var1, String var3) {
      return this.b(var1, -1, var3);
   }

   public String[] F(long var1, int var3) {
      return this.b(var1, var3, Native.L());
   }

   /** @deprecated */
   @Deprecated
   public String[] J(long var1, boolean var3) {
      return this.F(var1, -1, var3);
   }

   public String[] e(long var1) {
      return this.V(var1, -1);
   }

   public String[] V(long var1, int var3) {
      return this.b(var1, var3, "--WIDE-STRING--");
   }

   /** @deprecated */
   @Deprecated
   public String[] F(long var1, int var3, boolean var4) {
      return this.b(var1, var3, "--WIDE-STRING--");
   }

   public String[] b(long var1, int var3, String var4) {
      c.F();
      ArrayList var6 = new ArrayList();
      int var8 = 0;
      if(var3 != -1) {
         Pointer var7 = this.f(var1 + (long)var8);
         int var9 = 0;
         if(var9++ < var3) {
            Object var10 = null;
            var6.add(var10);
            if(var9 < var3) {
               var8 += i;
               this.f(var1 + (long)var8);
            }
         }
      }

      Pointer var11;
      if((var11 = this.f(var1 + (long)var8)) != null) {
         Object var14 = null;
         var6.add(var14);
         var8 = var8 + i;
      }

      return (String[])var6.toArray(new String[var6.size()]);
   }

   void X(long var1, Object var3, Class var4) {
      if(var4 != Boolean.TYPE && var4 != Boolean.class) {
         if(var4 != Byte.TYPE && var4 != Byte.class) {
            if(var4 != Short.TYPE && var4 != Short.class) {
               if(var4 != Character.TYPE && var4 != Character.class) {
                  if(var4 != Integer.TYPE && var4 != Integer.class) {
                     if(var4 != Long.TYPE && var4 != Long.class) {
                        if(var4 != Float.TYPE && var4 != Float.class) {
                           if(var4 != Double.TYPE && var4 != Double.class) {
                              if(var4 == Pointer.class) {
                                 this.U(var1, (Pointer)var3);
                              } else if(var4 == String.class) {
                                 this.U(var1, (Pointer)var3);
                              } else if(var4 == c.class) {
                                 this.U(var1, (Pointer)var3);
                              } else if(s.class.isAssignableFrom(var4)) {
                                 s var5 = (s)var3;
                                 if(s.o.class.isAssignableFrom(var4)) {
                                    this.U(var1, (Pointer)null);
                                    var5.T();
                                 } else {
                                    var5.H(this, (int)var1, true);
                                    var5.v();
                                 }
                              } else if(Callback.class.isAssignableFrom(var4)) {
                                 this.U(var1, u.l((Callback)var3));
                              } else if(d.w && Buffer.class.isAssignableFrom(var4)) {
                                 Object var8 = null;
                                 this.U(var1, (Pointer)var8);
                              } else if(b.class.isAssignableFrom(var4)) {
                                 ck var7 = ck.n(var4);
                                 Class var6 = var7.E();
                                 this.X(var1, var7.Z(var3, new cu()), var6);
                              } else {
                                 if(!var4.isArray()) {
                                    throw new IllegalArgumentException("Writing " + var4 + " to memory is not supported");
                                 }

                                 this.k(var1, var3, var4.getComponentType());
                              }
                           } else {
                              this.C(var1, 0.0D);
                           }
                        } else {
                           this.e(var1, 0.0F);
                        }
                     } else {
                        this.N(var1, 0L);
                     }
                  } else {
                     this.c(var1, 0);
                  }
               } else {
                  this.b(var1, '\u0000');
               }
            } else {
               this.J(var1, (short)0);
            }
         } else {
            this.n(var1, (byte)0);
         }
      } else {
         this.c(var1, Boolean.TRUE.equals(var3)?-1:0);
      }

   }

   private void k(long var1, Object var3, Class var4) {
      if(var4 == Byte.TYPE) {
         byte[] var5 = (byte[])((byte[])var3);
         this.Y(var1, var5, 0, var5.length);
      } else if(var4 == Short.TYPE) {
         short[] var11 = (short[])((short[])var3);
         this.B(var1, var11, 0, var11.length);
      } else if(var4 == Character.TYPE) {
         char[] var12 = (char[])((char[])var3);
         this.a(var1, var12, 0, var12.length);
      } else if(var4 == Integer.TYPE) {
         int[] var13 = (int[])((int[])var3);
         this.b(var1, var13, 0, var13.length);
      } else if(var4 == Long.TYPE) {
         long[] var14 = (long[])((long[])var3);
         this.X(var1, (long[])var14, 0, var14.length);
      } else if(var4 == Float.TYPE) {
         float[] var15 = (float[])((float[])var3);
         this.U(var1, var15, 0, var15.length);
      } else if(var4 == Double.TYPE) {
         double[] var16 = (double[])((double[])var3);
         this.D(var1, var16, 0, var16.length);
      } else if(Pointer.class.isAssignableFrom(var4)) {
         Pointer[] var17 = (Pointer[])((Pointer[])var3);
         this.j(var1, var17, 0, var17.length);
      } else if(s.class.isAssignableFrom(var4)) {
         s[] var18 = (s[])((s[])var3);
         if(s.o.class.isAssignableFrom(var4)) {
            Pointer[] var6 = new Pointer[var18.length];

            for(int var7 = 0; var7 < var18.length; ++var7) {
               if(var18[var7] == null) {
                  var6[var7] = null;
               } else {
                  var6[var7] = var18[var7].y();
                  var18[var7].v();
               }
            }

            this.j(var1, var6, 0, var6.length);
         } else {
            s var20 = var18[0];
            var20 = s.Z(var4, this.B(var1));
            var18[0] = var20;
            var20.v();
            s[] var23 = var20.R(var18.length);

            for(int var8 = 1; var8 < var18.length; ++var8) {
               if(var18[var8] == null) {
                  var18[var8] = var23[var8];
               } else {
                  var18[var8].H(this, (int)(var1 + (long)(var8 * var18[var8].F())), true);
               }

               var18[var8].v();
            }
         }
      } else {
         if(!b.class.isAssignableFrom(var4)) {
            throw new IllegalArgumentException("Writing array of " + var4 + " to memory not supported");
         }

         b[] var19 = (b[])((b[])var3);
         ck var22 = ck.n(var4);
         Class var24 = var22.E();
         int var25 = Native.J(var3.getClass(), var3) / var19.length;

         for(int var9 = 0; var9 < var19.length; ++var9) {
            Object var10 = var22.Z(var19[var9], new cu());
            this.X(var1 + (long)(var9 * var25), var10, var24);
         }
      }

   }

   public void E(long var1, long var3, byte var5) {
      Native.setMemory(this, this.U, var1, var3, var5);
   }

   public void n(long var1, byte var3) {
      Native.setByte(this, this.U, var1, var3);
   }

   public void J(long var1, short var3) {
      Native.setShort(this, this.U, var1, var3);
   }

   public void b(long var1, char var3) {
      Native.setChar(this, this.U, var1, var3);
   }

   public void c(long var1, int var3) {
      Native.setInt(this, this.U, var1, var3);
   }

   public void N(long var1, long var3) {
      Native.setLong(this, this.U, var1, var3);
   }

   public void N(long var1, cq var3) {
      if(cq.r == 8) {
         this.N(var1, var3.longValue());
      } else {
         this.c(var1, var3.intValue());
      }

   }

   public void e(long var1, float var3) {
      Native.setFloat(this, this.U, var1, var3);
   }

   public void C(long var1, double var3) {
      Native.setDouble(this, this.U, var1, var3);
   }

   public void U(long var1, Pointer var3) {
      Native.setPointer(this, this.U, var1, var3.U);
   }

   /** @deprecated */
   @Deprecated
   public void v(long var1, String var3, boolean var4) {
      this.s(var1, var3);
   }

   public void s(long var1, String var3) {
      Native.setWideString(this, this.U, var1, var3);
   }

   public void r(long var1, c var3) {
      this.s(var1, (String)null);
   }

   public void y(long var1, String var3) {
      this.G(var1, var3, Native.L());
   }

   public void G(long var1, String var3, String var4) {
      byte[] var5 = Native.I(var3, var4);
      this.Y(var1, var5, 0, var5.length);
      this.n(var1 + (long)var5.length, (byte)0);
   }

   public String H(long var1, int var3) {
      boolean var10000 = true;
      String var10 = "memory dump";
      StringWriter var6 = new StringWriter("memory dump".length() + 2 + var3 * 2 + var3 / 4 * 4);
      PrintWriter var7 = new PrintWriter(var6);
      var7.println("memory dump");

      for(int var8 = 0; var8 < var3; ++var8) {
         byte var9 = this.Z(var1 + (long)var8);
         int var11 = var8 % 4;
         var7.print("[");
         if(var9 < 16) {
            var7.print("0");
         }

         var7.print(Integer.toHexString(var9 & 255));
         var11 = var8 % 4;
      }

      if(var6.getBuffer().charAt(var6.getBuffer().length() - 2) != 93) {
         var7.println("]");
      }

      return var6.toString();
   }

   public String toString() {
      return "native@0x" + Long.toHexString(this.U);
   }

   public static long c(Pointer var0) {
      return 0L;
   }

   public static void j(Pointer var0, long var1) {
      var0.U = var1;
   }

   static {
      if((i = Native.uz) == 0) {
         throw new Error("Native library not initialized");
      } else {
         o = null;
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   private static class x extends Pointer {
      private final String A;

      private x(long var1) {
         super(var1);
         this.A = "This pointer is opaque: " + this;
      }

      public Pointer x(long var1, long var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void c(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public long W(long var1, byte var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void F(long var1, byte[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void C(long var1, char[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void G(long var1, short[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void X(long var1, int[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void c(long var1, long[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void n(long var1, float[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void K(long var1, double[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void O(long var1, Pointer[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void Y(long var1, byte[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void a(long var1, char[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void B(long var1, short[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void b(long var1, int[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void X(long var1, long[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void U(long var1, float[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void D(long var1, double[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public void j(long var1, Pointer[] var3, int var4, int var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public ByteBuffer u(long var1, long var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public byte Z(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public char q(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public short H(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public int G(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public long u(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public float A(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public double C(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public Pointer f(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public String u(long var1, String var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public String Z(long var1) {
         throw new UnsupportedOperationException(this.A);
      }

      public void n(long var1, byte var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void b(long var1, char var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void J(long var1, short var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void c(long var1, int var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void N(long var1, long var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void e(long var1, float var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void C(long var1, double var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void U(long var1, Pointer var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void G(long var1, String var3, String var4) {
         throw new UnsupportedOperationException(this.A);
      }

      public void s(long var1, String var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public void E(long var1, long var3, byte var5) {
         throw new UnsupportedOperationException(this.A);
      }

      public String H(long var1, int var3) {
         throw new UnsupportedOperationException(this.A);
      }

      public String toString() {
         return "const@0x" + Long.toHexString(this.U);
      }
   }
}
