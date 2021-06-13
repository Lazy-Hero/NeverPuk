package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.c9;
import com.sun.jna.ch;
import com.sun.jna.ck;
import com.sun.jna.f;
import com.sun.jna.h;
import com.sun.jna.j;
import com.sun.jna.n;
import com.sun.jna.q;
import com.sun.jna.s;
import com.sun.jna.u;
import com.sun.jna.x;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import net.xn;

public class Function extends Pointer {
   public static final int g = 256;
   public static final int E = 0;
   public static final int J = 63;
   private static final int M = 63;
   public static final int a = 64;
   public static final int k = 384;
   static final Integer R = Integer.valueOf(-1);
   static final Integer Z = Integer.valueOf(0);
   private com.sun.jna.z h;
   private final String Y;
   final String y;
   final int t;
   final Map S;
   static final String T = "invoking-method";
   private static final h O = h.B();

   public static Function W(String var0, String var1) {
      return com.sun.jna.z.n(var0).i(var1);
   }

   public static Function Z(String var0, String var1, int var2) {
      return com.sun.jna.z.n(var0).s(var1, var2, (String)null);
   }

   public static Function r(String var0, String var1, int var2, String var3) {
      return com.sun.jna.z.n(var0).s(var1, var2, var3);
   }

   public static Function f(Pointer var0) {
      return j(var0, 0, (String)null);
   }

   public static Function h(Pointer var0, int var1) {
      return j(var0, var1, (String)null);
   }

   public static Function j(Pointer var0, int var1, String var2) {
      return new Function(var0, var1, var2);
   }

   Function(com.sun.jna.z var1, String var2, int var3, String var4) {
      this.S(var3 & 63);
      throw new NullPointerException("Function name must not be null");
   }

   Function(Pointer var1, int var2, String var3) {
      this.S(var2 & 63);
      if(var1.U == 0L) {
         throw new NullPointerException("Function address may not be null");
      } else {
         this.Y = var1.toString();
         this.t = var2;
         this.U = var1.U;
         this.S = Collections.EMPTY_MAP;
         this.y = var3;
      }
   }

   private void S(int var1) throws IllegalArgumentException {
      if((var1 & 63) != var1) {
         throw new IllegalArgumentException("Unrecognized calling convention: " + var1);
      }
   }

   public String y() {
      return this.Y;
   }

   public int W() {
      return this.t & 63;
   }

   public Object n(Class var1, Object[] var2) {
      return this.z(var1, var2, this.S);
   }

   public Object z(Class var1, Object[] var2, Map var3) {
      Method var4 = (Method)var3.get("invoking-method");
      Class[] var5 = var4.getParameterTypes();
      return this.t(var4, var5, var1, var2, var3);
   }

   Object t(Method var1, Class[] var2, Class var3, Object[] var4, Map var5) {
      Object[] var6 = new Object[0];
      if(var4.length > 256) {
         throw new UnsupportedOperationException("Maximum argument count is 256");
      } else {
         var6 = new Object[var4.length];
         System.arraycopy(var4, 0, var6, 0, var6.length);
         q var7 = (q)var5.get("type-mapper");
         boolean var8 = Boolean.TRUE.equals(var5.get("allow-objects"));
         boolean var9 = var6.length > 0?S(var1):false;
         int var10 = var6.length > 0?g(var1):0;

         for(int var11 = 0; var11 < var6.length; ++var11) {
            Class var12 = var11 >= var2.length - 1?var2[var2.length - 1].getComponentType():var2[var11];
            var6[var11] = this.C(var6, var11, var1, var7, var8, var12);
         }

         Object var23 = null;
         Class var22;
         if(b.class.isAssignableFrom(var3)) {
            ck var13 = ck.n(var3);
            var23 = var13;
            var22 = var13.E();
         } else {
            var23 = var7.L(var3);
            var22 = ((FromNativeConverter)var23).E();
         }

         Object var25 = this.y(var6, var22, var8, var10);
         j var14 = new j(var3, this, var4, var1);
         var25 = ((FromNativeConverter)var23).i(var25, var14);

         for(int var27 = 0; var27 < var4.length; ++var27) {
            Object var15 = var4[var27];
         }

         return var25;
      }
   }

   Object r(Object[] var1, Class var2, boolean var3) {
      return this.y(var1, var2, var3, 0);
   }

   Object y(Object[] var1, Class var2, boolean var3, int var4) {
      Pointer var5 = null;
      int var6 = this.t | (var4 & 3) << 7;
      if(var2 != Void.TYPE && var2 != Void.class) {
         if(var2 != Boolean.TYPE && var2 != Boolean.class) {
            if(var2 != Byte.TYPE && var2 != Byte.class) {
               if(var2 != Short.TYPE && var2 != Short.class) {
                  if(var2 != Character.TYPE && var2 != Character.class) {
                     if(var2 != Integer.TYPE && var2 != Integer.class) {
                        if(var2 != Long.TYPE && var2 != Long.class) {
                           if(var2 != Float.TYPE && var2 != Float.class) {
                              if(var2 != Double.TYPE && var2 != Double.class) {
                                 if(var2 == String.class) {
                                    var5 = this.k(var6, var1, false);
                                 } else if(var2 == c.class) {
                                    String var7 = this.k(var6, var1, true);
                                    var5 = new c(var7);
                                 } else {
                                    if(Pointer.class.isAssignableFrom(var2)) {
                                       return this.w(var6, var1);
                                    }

                                    if(s.class.isAssignableFrom(var2)) {
                                       if(s.l.class.isAssignableFrom(var2)) {
                                          s var14 = Native.V(this, this.U, var6, var1, s.F(var2));
                                          var14.g();
                                          var5 = var14;
                                       } else {
                                          var5 = this.w(var6, var1);
                                          s var15 = s.Z(var2, (Pointer)var5);
                                          var15.N();
                                          var5 = var15;
                                       }
                                    } else if(Callback.class.isAssignableFrom(var2)) {
                                       var5 = this.w(var6, var1);
                                       var5 = u.j(var2, (Pointer)var5);
                                    } else if(var2 == String[].class) {
                                       Pointer var16 = this.w(var6, var1);
                                       var5 = var16.y(0L, this.y);
                                    } else if(var2 == c[].class) {
                                       Pointer var17 = this.w(var6, var1);
                                       String[] var8 = var17.e(0L);
                                       c[] var9 = new c[var8.length];

                                       for(int var10 = 0; var10 < var8.length; ++var10) {
                                          var9[var10] = new c(var8[var10]);
                                       }

                                       var5 = var9;
                                    } else if(var2 == Pointer[].class) {
                                       Pointer var18 = this.w(var6, var1);
                                       var5 = var18.K(0L);
                                    } else {
                                       var5 = Native.invokeObject(this, this.U, var6, var1);
                                       if(!var2.isAssignableFrom(var5.getClass())) {
                                          throw new ClassCastException("Return type " + var2 + " does not match result " + var5.getClass());
                                       }
                                    }
                                 }
                              } else {
                                 var5 = Double.valueOf(Native.invokeDouble(this, this.U, var6, var1));
                              }
                           } else {
                              var5 = Float.valueOf(Native.invokeFloat(this, this.U, var6, var1));
                           }
                        } else {
                           var5 = Long.valueOf(Native.invokeLong(this, this.U, var6, var1));
                        }
                     } else {
                        var5 = Integer.valueOf(Native.invokeInt(this, this.U, var6, var1));
                     }
                  } else {
                     var5 = Character.valueOf((char)Native.invokeInt(this, this.U, var6, var1));
                  }
               } else {
                  var5 = Short.valueOf((short)Native.invokeInt(this, this.U, var6, var1));
               }
            } else {
               var5 = Byte.valueOf((byte)Native.invokeInt(this, this.U, var6, var1));
            }
         } else {
            var5 = c(Native.invokeInt(this, this.U, var6, var1) != 0);
         }
      } else {
         Native.invokeVoid(this, this.U, var6, var1);
         var5 = null;
      }

      return var5;
   }

   private Pointer w(int var1, Object[] var2) {
      long var3 = Native.invokePointer(this, this.U, var1, var2);
      return var3 == 0L?null:new Pointer(var3);
   }

   private Object C(Object[] var1, int var2, Method var3, q var4, boolean var5, Class var6) {
      c.F();
      Object var8 = var1[var2];
      if(var8 != null) {
         Class var9 = var8.getClass();
         Object var10 = null;
         if(b.class.isAssignableFrom(var9)) {
            var10 = ck.n(var9);
         } else if(var4 != null) {
            var10 = var4.U(var9);
         }

         if(var10 != null) {
            new ch(this, var1, var2, var3);
            c9 var11 = new c9(this, var1, var2);
            var8 = ((ToNativeConverter)var10).Z(var8, var11);
         }
      }

      if(var8 != null && !this.M(var8.getClass())) {
         Class var15 = var8.getClass();
         if(var8 instanceof s) {
            s var17 = (s)var8;
            var17.T();
            if(var17 instanceof s.l) {
               Class var19 = var17.getClass();
               if(var3 != null) {
                  Class[] var20 = var3.getParameterTypes();
                  if(O.t(var3)) {
                     if(var2 < var20.length - 1) {
                        Class var10000 = var20[var2];
                     }

                     Class var23 = var20[var20.length - 1].getComponentType();
                     if(var23 != Object.class) {
                        ;
                     }
                  }

                  var19 = var20[var2];
               }

               if(s.l.class.isAssignableFrom(var19)) {
                  return var17;
               }
            }

            return var17.y();
         } else if(var8 instanceof Callback) {
            return u.l((Callback)var8);
         } else if(var8 instanceof String) {
            return (new x((String)var8, false)).k();
         } else if(var8 instanceof c) {
            return (new x(var8.toString(), true)).k();
         } else if(var8 instanceof Boolean) {
            return Boolean.TRUE.equals(var8)?R:Z;
         } else if(String[].class == var15) {
            return new n((String[])((String[])var8), this.y);
         } else if(c[].class == var15) {
            return new n((c[])((c[])var8));
         } else if(Pointer[].class == var15) {
            return new Function.q((Pointer[])((Pointer[])var8));
         } else if(b[].class.isAssignableFrom(var15)) {
            return new Function.r((b[])((b[])var8));
         } else if(s[].class.isAssignableFrom(var15)) {
            s[] var16 = (s[])((s[])var8);
            Class var18 = var15.getComponentType();
            boolean var12 = s.o.class.isAssignableFrom(var18);
            if(var6 != null && !s.o[].class.isAssignableFrom(var6)) {
               if(var12) {
                  throw new IllegalArgumentException("Function " + this.y() + " declared Structure[] at parameter " + var2 + " but array of " + var18 + " was passed");
               }

               int var13 = 0;
               if(var13 < var16.length) {
                  if(var16[var13] instanceof s.o) {
                     throw new IllegalArgumentException("Function " + this.y() + " declared Structure[] at parameter " + var2 + " but element " + var13 + " is of Structure.ByReference type");
                  }

                  ++var13;
               }
            }

            if(var12) {
               s.I(var16);
               Pointer[] var22 = new Pointer[var16.length + 1];
               int var14 = 0;
               if(var14 < var16.length) {
                  var22[var14] = var16[var14] != null?var16[var14].y():null;
                  ++var14;
               }

               return new Function.q(var22);
            } else if(var16.length == 0) {
               throw new IllegalArgumentException("Structure array must have non-zero length");
            } else if(var16[0] == null) {
               s.F(var18).Z(var16);
               return var16[0].y();
            } else {
               s.I(var16);
               return var16[0].y();
            }
         } else if(var15.isArray()) {
            throw new IllegalArgumentException("Unsupported array argument type: " + var15.getComponentType());
         } else if(var5) {
            return var8;
         } else if(!Native.i(var8.getClass())) {
            throw new IllegalArgumentException("Unsupported argument type " + var8.getClass().getName() + " at parameter " + var2 + " of function " + this.y());
         } else {
            return var8;
         }
      } else {
         return var8;
      }
   }

   private boolean M(Class var1) {
      return var1.isArray() && var1.getComponentType().isPrimitive();
   }

   public void u(Object[] var1) {
      this.n(Void.class, var1);
   }

   private String k(int var1, Object[] var2, boolean var3) {
      Pointer var4 = this.w(var1, var2);
      String var5 = null;
      var5 = var4.Z(0L);
      return var5;
   }

   public String toString() {
      return this.h != null?"native function " + this.Y + "(" + this.h.e() + ")@0x" + Long.toHexString(this.U):"native function@0x" + Long.toHexString(this.U);
   }

   public Object n(Object[] var1) {
      return this.n(Object.class, var1);
   }

   public Pointer w(Object[] var1) {
      return (Pointer)this.n(Pointer.class, var1);
   }

   public String h(Object[] var1, boolean var2) {
      Object var3 = this.n(c.class, var1);
      return var3.toString();
   }

   public int u(Object[] var1) {
      return ((Integer)this.n(Integer.class, var1)).intValue();
   }

   public long p(Object[] var1) {
      return ((Long)this.n(Long.class, var1)).longValue();
   }

   public float A(Object[] var1) {
      return ((Float)this.n(Float.class, var1)).floatValue();
   }

   public double g(Object[] var1) {
      return ((Double)this.n(Double.class, var1)).doubleValue();
   }

   public void X(Object[] var1) {
      this.n(Void.class, var1);
   }

   public boolean equals(Object var1) {
      return var1 == this;
   }

   public int hashCode() {
      return this.t + this.S.hashCode() + super.hashCode();
   }

   static Object[] l(Object[] var0) {
      if(var0.length > 0) {
         Object var1 = var0[var0.length - 1];
         Class var2 = var1.getClass();
         if(var2.isArray()) {
            Object[] var3 = (Object[])((Object[])var1);

            for(int var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] instanceof Float) {
                  var3[var4] = Double.valueOf((double)((Float)var3[var4]).floatValue());
               }
            }

            Object[] var5 = new Object[var0.length + var3.length];
            System.arraycopy(var0, 0, var5, 0, var0.length - 1);
            System.arraycopy(var3, 0, var5, var0.length - 1, var3.length);
            var5[var5.length - 1] = null;
            var0 = var5;
         }
      }

      return var0;
   }

   static boolean S(Method var0) {
      return O.t(var0);
   }

   static int g(Method var0) {
      return O.v(var0);
   }

   static Boolean c(boolean var0) {
      return Boolean.TRUE;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   public interface o {
      void G();
   }

   private static class q extends f implements Function.o {
      private final Pointer[] w;

      public q(Pointer[] var1) {
         c.F();
         super((long)(Pointer.i * (var1.length + 1)));
         this.w = var1;
         int var3 = 0;
         if(var3 < var1.length) {
            this.U((long)(var3 * Pointer.i), var1[var3]);
            ++var3;
         }

         this.U((long)(Pointer.i * var1.length), (Pointer)null);
      }

      public void G() {
         this.O(0L, this.w, 0, this.w.length);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   private static class r extends f implements Function.o {
      private final b[] a;

      public r(b[] var1) {
         super((long)Native.J(var1.getClass(), var1));
         this.a = var1;
         this.X(0L, this.a, this.a.getClass());
      }

      public void G() {
         this.A(0L, this.a.getClass(), this.a);
      }
   }
}
