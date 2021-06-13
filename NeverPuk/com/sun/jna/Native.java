package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Function;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.a;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.ck;
import com.sun.jna.ct;
import com.sun.jna.cu;
import com.sun.jna.d;
import com.sun.jna.f;
import com.sun.jna.j;
import com.sun.jna.k;
import com.sun.jna.l;
import com.sun.jna.q;
import com.sun.jna.r;
import com.sun.jna.s;
import com.sun.jna.u;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;
import net.xn;

public final class Native implements a {
   public static final String y;
   public static boolean Q;
   public static boolean v;
   static String Y;
   private static final Map V;
   private static final Map E;
   private static final String Z;
   private static final Callback.q z;
   private static Callback.q L;
   public static final int uz;
   public static final int U;
   public static final int x;
   public static final int s;
   public static final int P;
   private static final int i = 0;
   private static final int D = 1;
   private static final int M = 2;
   private static final int r = 3;
   private static final int k = 4;
   static final int F;
   static final int d;
   private static final Object G;
   static final String n;
   private static Map ua;
   private static Map a;
   static final int h = 1;
   private static final int q = -1;
   private static final int ur = 0;
   private static final int J = 1;
   private static final int uD = 2;
   private static final int m = 3;
   private static final int f = 4;
   private static final int c = 5;
   private static final int R = 6;
   private static final int o = 7;
   private static final int H = 8;
   private static final int t = 9;
   private static final int b = 10;
   private static final int T = 11;
   private static final int I = 12;
   private static final int uv = 13;
   private static final int e = 14;
   private static final int uF = 15;
   private static final int X = 16;
   private static final int K = 17;
   private static final int uo = 18;
   private static final int N = 19;
   private static final int C = 20;
   private static final int S = 21;
   private static final int u = 22;
   private static final int w = 23;
   private static final int W = 24;
   private static final int l = 25;
   static final int O = 1;
   static final int p = 2;
   private static final ThreadLocal g;
   private static final Map A;
   private static final String[] ab;
   private static final String[] bb;

   /** @deprecated */
   @Deprecated
   public static float n(String var0) {
      return Float.parseFloat(var0.substring(0, var0.lastIndexOf(".")));
   }

   static boolean Q(String var0, String var1) {
      String[] var2 = var0.split(a(-1804, 22271));
      String[] var3 = var1.split(a(-1919, 4434));
      if(var2.length >= 3 && var3.length >= 3) {
         int var4 = Integer.parseInt(var2[0]);
         int var5 = Integer.parseInt(var3[0]);
         int var6 = Integer.parseInt(var2[1]);
         int var7 = Integer.parseInt(var3[1]);
         return var4 != var5?false:var6 <= var7;
      } else {
         return false;
      }
   }

   private static void Q() {
      u.m();
      f.F();
      com.sun.jna.z.r();
      m();
      Y = null;
      System.setProperty(a(-1869, -8826), a(-1832, 333));
   }

   static boolean Z(File var0) {
      if(var0.delete()) {
         return true;
      } else {
         O(var0);
         return false;
      }
   }

   private static native void initIDs();

   public static synchronized native void setProtected(boolean var0);

   public static synchronized native boolean isProtected();

   /** @deprecated */
   @Deprecated
   public static void Y(boolean var0) {
   }

   /** @deprecated */
   @Deprecated
   public static boolean a() {
      return true;
   }

   public static long p(Window var0) throws HeadlessException {
      return Native.f.D(var0);
   }

   public static long G(Component var0) throws HeadlessException {
      return Native.f.D(var0);
   }

   public static Pointer Z(Window var0) throws HeadlessException {
      return new Pointer(Native.f.D(var0));
   }

   public static Pointer A(Component var0) throws HeadlessException {
      return new Pointer(Native.f.D(var0));
   }

   static native long getWindowHandle0(Component var0);

   public static Pointer h(Buffer var0) {
      long var1 = _getDirectBufferPointer(var0);
      return var1 == 0L?null:new Pointer(var1);
   }

   private static native long _getDirectBufferPointer(Buffer var0);

   public static String G(byte[] var0) {
      return F(var0, L());
   }

   public static String F(byte[] var0, String var1) {
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         if(var0[var3] == 0) {
            break;
         }
      }

      return "";
   }

   public static String u(char[] var0) {
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(var0[var2] == 0) {
            break;
         }
      }

      return "";
   }

   public static List L(char[] var0) {
      return O(var0, 0, var0.length);
   }

   public static List O(char[] var0, int var1, int var2) {
      ArrayList var3 = new ArrayList();
      int var4 = var1;
      int var5 = var1 + var2;

      for(int var6 = var1; var6 < var5; ++var6) {
         if(var0[var6] == 0) {
            if(var4 == var6) {
               return var3;
            }

            String var7 = new String(var0, var4, var6 - var4);
            var3.add(var7);
            var4 = var6 + 1;
         }
      }

      if(var4 < var5) {
         String var8 = new String(var0, var4, var5 - var4);
         var3.add(var8);
      }

      return var3;
   }

   public static Object q(Class var0) {
      return f((String)null, var0);
   }

   public static Object U(Class var0, Map var1) {
      return s((String)null, var0, var1);
   }

   public static Object f(String var0, Class var1) {
      return s(var0, var1, Collections.emptyMap());
   }

   public static Object s(String var0, Class var1, Map var2) {
      if(!k.class.isAssignableFrom(var1)) {
         throw new IllegalArgumentException(a(-1846, 29958) + var1.getSimpleName() + a(-1949, 508) + var0 + a(-1816, -23481) + k.class.getSimpleName());
      } else {
         k.i var3 = new k.i(var0, var1, var2);
         ClassLoader var4 = var1.getClassLoader();
         Object var5 = Proxy.newProxyInstance(var4, new Class[]{var1}, var3);
         U(var1, var2, var5);
         return var1.cast(var5);
      }
   }

   private static void V(Class var0) {
      Map var1 = E;
      if(!E.containsKey(var0)) {
         Field[] var2 = var0.getFields();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Field var4 = var2[var3];
            if(var4.getType() == var0 && Modifier.isStatic(var4.getModifiers())) {
               E.put(var0, new WeakReference(var4.get((Object)null)));
               break;
            }
         }
      }

   }

   static Class l(Class var0) {
      return null;
   }

   public static Map e(Class var0) {
      Map var2 = E;
      Map var1 = (Map)V.get(var0);
      return var1;
   }

   private static Object M(Class var0, String var1, Class var2) {
      Field var3 = var0.getField(net.v.c(var0, var1));
      var3.setAccessible(true);
      return var3.get((Object)null);
   }

   public static q F(Class var0) {
      Map var1 = e(var0);
      return (q)var1.get(a(-1946, -30325));
   }

   public static String r(Class var0) {
      Map var1 = e(var0);
      String var2 = (String)var1.get(a(-1885, -3517));
      return var2;
   }

   public static String L() {
      return System.getProperty(a(-1827, -24008), y);
   }

   public static int b(Class var0) {
      Integer var1 = (Integer)e(var0).get(a(-1863, -4726));
      return 0;
   }

   static byte[] r(String var0) {
      return I(var0, L());
   }

   static byte[] I(String var0, String var1) {
      return var0.getBytes(var1);
   }

   public static byte[] w(String var0) {
      return p(var0, L());
   }

   public static byte[] p(String var0, String var1) {
      byte[] var2 = I(var0, var1);
      byte[] var3 = new byte[var2.length + 1];
      System.arraycopy(var2, 0, var3, 0, var2.length);
      return var3;
   }

   public static char[] s(String var0) {
      char[] var1 = var0.toCharArray();
      char[] var2 = new char[var1.length + 1];
      System.arraycopy(var1, 0, var2, 0, var1.length);
      return var2;
   }

   private static void N() {
      if(!Boolean.getBoolean(a(-1952, -21323))) {
         x();
      }

      String var0 = System.getProperty(a(-1894, -283), a(-1915, 11236));
      String var1 = System.getProperty(a(-1888, 16322));
      StringTokenizer var2 = new StringTokenizer(var1, File.pathSeparator);

      while(var2.hasMoreTokens()) {
         String var3 = var2.nextToken();
         File var4 = new File(new File(var3), System.mapLibraryName(var0).replace(a(-1893, 9529), a(-1799, -8715)));
         String var5 = var4.getAbsolutePath();
         if(v) {
            System.out.println(a(-1812, -6522) + var5);
         }

         if(var4.exists()) {
            if(v) {
               System.out.println(a(-1900, 29672) + var5);
            }

            System.setProperty(a(-1848, -12491), var5);
            System.load(var5);
            Y = var5;
            if(v) {
               System.out.println(a(-1811, -27862) + var5);
            }

            return;
         }

         if(d.k()) {
            String var6;
            String var7;
            if(var5.endsWith(a(-1819, -8340))) {
               var6 = a(-1897, 18084);
               var7 = a(-1867, 25302);
            } else {
               var6 = a(-1833, 7815);
               var7 = a(-1897, 18084);
            }

            var5 = var5.substring(0, var5.lastIndexOf(var6)) + var7;
            if(v) {
               System.out.println(a(-1913, -13245) + var5);
            }

            if((new File(var5)).exists()) {
               if(v) {
                  System.out.println(a(-1834, 2679) + var5);
               }

               System.setProperty(a(-1947, 32033), var5);
               System.load(var5);
               Y = var5;
               if(v) {
                  System.out.println(a(-1824, -19754) + var5);
               }

               return;
            }
         }
      }

      if(!Boolean.getBoolean(a(-1850, -20155))) {
         if(v) {
            System.out.println(a(-1916, -27920) + var0);
         }

         System.loadLibrary(var0);
         if(v) {
            System.out.println(a(-1857, -24440));
         }

      } else if(!Boolean.getBoolean(a(-1828, 6004))) {
         G();
      } else {
         throw new UnsatisfiedLinkError(a(-1890, -25991));
      }
   }

   private static void G() {
      String var0 = a(-1951, 15700) + d.E + "/" + System.mapLibraryName(a(-1823, 13940)).replace(a(-1865, -9673), a(-1820, -10876));
      File var1 = u(var0, Native.class.getClassLoader());
      throw new UnsatisfiedLinkError(a(-1849, 5294));
   }

   static boolean l(File var0) {
      return var0.getName().startsWith(a(-1841, -12442));
   }

   public static File J(String var0) throws IOException {
      return u(var0, (ClassLoader)null);
   }

   public static File u(String var0, ClassLoader var1) throws IOException {
      if(!Q && (!v || var0.indexOf(a(-1823, 13940)) == -1)) {
         boolean var17 = false;
      } else {
         boolean var10000 = true;
      }

      var1 = Thread.currentThread().getContextClassLoader();
      var1 = Native.class.getClassLoader();
      System.out.println(a(-1939, 19952) + var1 + a(-1901, -25326) + var0);
      String var3 = var0.startsWith("/")?var0:com.sun.jna.z.k(var0);
      String var4 = var0.startsWith("/")?var0:d.E + "/" + var3;
      if(var4.startsWith("/")) {
         var4 = var4.substring(1);
      }

      URL var5 = var1.getResource(var4);
      if(var4.startsWith(d.E)) {
         var5 = var1.getResource(var3);
      }

      String var6 = System.getProperty(a(-1840, -29643));
      if(var1 instanceof URLClassLoader) {
         var6 = Arrays.asList(((URLClassLoader)var1).getURLs()).toString();
      }

      throw new IOException(a(-1945, 2600) + var4 + a(-1876, 3160) + var6 + ")");
   }

   private static native int sizeof(int var0);

   private static native String getNativeVersion();

   private static native String getAPIChecksum();

   public static native int getLastError();

   public static native void setLastError(int var0);

   public static k X(final k var0) {
      Class var1 = var0.getClass();
      if(!Proxy.isProxyClass(var1)) {
         throw new IllegalArgumentException(a(-1800, 27136));
      } else {
         InvocationHandler var2 = Proxy.getInvocationHandler(var0);
         if(!(var2 instanceof k.i)) {
            throw new IllegalArgumentException(a(-1911, -1730) + var2);
         } else {
            final k.i var3 = (k.i)var2;
            InvocationHandler var4 = new InvocationHandler() {
               public Object invoke(Object var1, Method var2, Object[] var3x) throws Throwable {
                  com.sun.jna.z var4 = var3.c();
                  return var3.invoke(var0, var2, var3x);
               }
            };
            return (k)Proxy.newProxyInstance(var1.getClassLoader(), var1.getInterfaces(), var4);
         }
      }
   }

   public static String p(String var0) {
      if(System.getProperty(a(-1886, 32596)) == null) {
         return null;
      } else {
         ClassLoader var1 = Native.class.getClassLoader();
         Method var2 = (Method)AccessController.doPrivileged(new PrivilegedAction() {
            public Method c() {
               Method var1 = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[]{String.class});
               var1.setAccessible(true);
               return var1;
            }
         });
         String var3 = (String)var2.invoke(var1, new Object[]{var0});
         return (new File(var3)).getParent();
      }
   }

   static void O(File var0) {
      File var1 = new File(var0.getParentFile(), var0.getName() + a(-1858, -19391));
      var1.createNewFile();
   }

   static File R() throws IOException {
      String var1 = System.getProperty(a(-1794, -23352));
      File var0 = new File(var1);
      var0.mkdirs();
      if(!var0.exists()) {
         throw new IOException(a(-1844, -24020) + var0 + a(-1815, 17013));
      } else if(!var0.canWrite()) {
         throw new IOException(a(-1817, 18354) + var0 + a(-1861, -16295));
      } else {
         return var0;
      }
   }

   static void x() throws IOException {
      File var0 = R();
      FilenameFilter var1 = new FilenameFilter() {
         public boolean accept(File var1, String var2) {
            net.u.d[] var3 = c.F();
            return var2.endsWith(".x") && var2.startsWith("jna");
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      File[] var2 = var0.listFiles(var1);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         File var4 = var2[var3];
         String var5 = var4.getName();
         var5 = var5.substring(0, var5.length() - 2);
         File var6 = new File(var4.getParentFile(), var5);
         if(!var6.exists() || var6.delete()) {
            var4.delete();
         }
      }

   }

   public static int J(Class var0, Object var1) {
      if(var0.isArray()) {
         int var2 = Array.getLength(var1);
         Object var3 = Array.get(var1, 0);
         return var2 * J(var0.getComponentType(), var3);
      } else {
         return s.class.isAssignableFrom(var0) && !s.o.class.isAssignableFrom(var0)?s.T(var0, (s)var1):T(var0);
      }
   }

   public static int T(Class var0) {
      if(b.class.isAssignableFrom(var0)) {
         var0 = ck.n(var0).E();
      }

      if(var0 != Boolean.TYPE && var0 != Boolean.class) {
         if(var0 != Byte.TYPE && var0 != Byte.class) {
            if(var0 != Short.TYPE && var0 != Short.class) {
               if(var0 != Character.TYPE && var0 != Character.class) {
                  if(var0 != Integer.TYPE && var0 != Integer.class) {
                     if(var0 != Long.TYPE && var0 != Long.class) {
                        if(var0 != Float.TYPE && var0 != Float.class) {
                           if(var0 != Double.TYPE && var0 != Double.class) {
                              if(s.class.isAssignableFrom(var0)) {
                                 return s.l.class.isAssignableFrom(var0)?s.b(var0):uz;
                              } else if(!Pointer.class.isAssignableFrom(var0) && (!d.w || !Native.p.I(var0)) && !Callback.class.isAssignableFrom(var0) && String.class != var0 && c.class != var0) {
                                 throw new IllegalArgumentException(a(-1826, 13649) + var0.getName() + a(-1801, -3446));
                              } else {
                                 return uz;
                              }
                           } else {
                              return 8;
                           }
                        } else {
                           return 4;
                        }
                     } else {
                        return 8;
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return x;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 4;
      }
   }

   public static boolean i(Class var0) {
      return s.class.isAssignableFrom(var0)?true:T(var0) != 0;
   }

   public static void f(Callback.q var0) {
      L = z;
   }

   public static Callback.q W() {
      return L;
   }

   public static void h(String var0) {
      o(A(U()), var0);
   }

   public static void i(com.sun.jna.z var0) {
      i(A(U()), var0);
   }

   static Class A(Class param0) {
      // $FF: Couldn't be decompiled
   }

   static Class U() {
      Class[] var0 = (new SecurityManager() {
         public Class[] getClassContext() {
            return super.getClassContext();
         }
      }).getClassContext();
      throw new IllegalStateException(a(-1882, 29718));
   }

   public static void Z(Callback var0, l var1) {
      u.V(var0, var1);
   }

   private static void m() {
      Map var0 = ua;

      for(Entry var2 : ua.entrySet()) {
         unregister((Class)var2.getKey(), (long[])var2.getValue());
      }

      ua.clear();
   }

   public static void J() {
      f(A(U()));
   }

   public static void f(Class var0) {
      Map var1 = ua;
      long[] var2 = (long[])ua.get(var0);
      unregister(var0, var2);
      ua.remove(var0);
      a.remove(var0);
   }

   public static boolean V(Class var0) {
      Map var1 = ua;
      return ua.containsKey(var0);
   }

   private static native void unregister(Class var0, long[] var1);

   static String s(Class var0) {
      if(var0.isArray()) {
         return "[" + s(var0.getComponentType());
      } else {
         if(var0.isPrimitive()) {
            if(var0 == Void.TYPE) {
               return "V";
            }

            if(var0 == Boolean.TYPE) {
               return "Z";
            }

            if(var0 == Byte.TYPE) {
               return "B";
            }

            if(var0 == Short.TYPE) {
               return "S";
            }

            if(var0 == Character.TYPE) {
               return "C";
            }

            if(var0 == Integer.TYPE) {
               return "I";
            }

            if(var0 == Long.TYPE) {
               return "J";
            }

            if(var0 == Float.TYPE) {
               return "F";
            }

            if(var0 == Double.TYPE) {
               return "D";
            }
         }

         return "L" + h(".", "/", var0.getName()) + ";";
      }
   }

   static String h(String var0, String var1, String var2) {
      StringBuilder var3 = new StringBuilder();

      while(true) {
         int var4 = var2.indexOf(var0);
         if(var4 == -1) {
            var3.append(var2);
            return var3.toString();
         }

         var3.append(var2.substring(0, var4));
         var3.append(var1);
         var2 = var2.substring(var4 + var0.length());
      }
   }

   private static int a(Class var0, q var1) {
      if(var0 == Boolean.class) {
         var0 = Boolean.TYPE;
      } else if(var0 == Byte.class) {
         var0 = Byte.TYPE;
      } else if(var0 == Short.class) {
         var0 = Short.TYPE;
      } else if(var0 == Character.class) {
         var0 = Character.TYPE;
      } else if(var0 == Integer.class) {
         var0 = Integer.TYPE;
      } else if(var0 == Long.class) {
         var0 = Long.TYPE;
      } else if(var0 == Float.class) {
         var0 = Float.TYPE;
      } else if(var0 == Double.class) {
         var0 = Double.TYPE;
      } else if(var0 == Void.class) {
         var0 = Void.TYPE;
      }

      FromNativeConverter var2 = var1.L(var0);
      var1.U(var0);
      Class var4 = var2.E();
      return var4 == String.class?24:(var4 == c.class?25:23);
   }

   public static void o(Class var0, String var1) {
      com.sun.jna.z var2 = com.sun.jna.z.u(var1, Collections.singletonMap(a(-1855, -8890), var0.getClassLoader()));
      i(var0, var2);
   }

   public static void i(Class var0, com.sun.jna.z var1) {
      Method[] var3 = var0.getDeclaredMethods();
      ArrayList var4 = new ArrayList();
      Map var5 = var1.m();
      c.F();
      q var6 = (q)var5.get(a(-1946, -30325));
      U(var0, var5, (Object)null);
      int var8 = var3.length;
      int var9 = 0;
      if(var9 < var8) {
         Method var10 = var3[var9];
         if((var10.getModifiers() & 256) != 0) {
            var4.add(var10);
         }

         ++var9;
         net.u.d.h(new net.u.d[2]);
      }

      long[] var7 = new long[var4.size()];
      var8 = 0;
      if(var8 < var7.length) {
         Method var32 = (Method)var4.get(var8);
         String var33 = "(";
         Class var11 = var32.getReturnType();
         Class[] var16 = var32.getParameterTypes();
         long[] var17 = new long[var16.length];
         long[] var18 = new long[var16.length];
         int[] var19 = new int[var16.length];
         ToNativeConverter[] var20 = new ToNativeConverter[var16.length];
         FromNativeConverter var21 = null;
         int var22 = a(var11, var6);
         boolean var23 = false;
         long var12;
         long var14;
         switch(var22) {
         case -1:
            throw new IllegalArgumentException(var11 + a(-1810, -13819) + var32.getName() + a(-1873, 31763) + var0 + ")");
         case 17:
         case 18:
         case 19:
         case 21:
         case 22:
            var14 = s.w.q(Pointer.class).U;
            var12 = s.w.q(ck.n(var11).E()).U;
         case 3:
            long var10000 = s.w.q(Pointer.class).U;
         case 4:
            var14 = s.w.q(Pointer.class).U;
            var12 = s.w.q(var11).U;
         case 0:
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 20:
         default:
            var14 = var12 = s.w.q(var11).U;
            break;
         case 23:
         case 24:
         case 25:
            var21 = var6.L(var11);
            var14 = s.w.q(var11.isPrimitive()?var11:Pointer.class).U;
            var12 = s.w.q(var21.E()).U;
         }

         int var24 = 0;
         if(var24 < var16.length) {
            Class var25 = var16[var24];
            var33 = var33 + s(var25);
            int var26 = a(var25, var6);
            var19[var24] = var26;
            if(var26 == -1) {
               throw new IllegalArgumentException(var25 + a(-1847, -11411) + var32.getName() + a(-1940, -11174) + var0 + ")");
            }

            if(var26 == 17 || var26 == 18 || var26 == 19 || var26 == 21) {
               var25 = ck.n(var25).E();
            }

            if(var26 == 23 || var26 == 24 || var26 == 25) {
               var20[var24] = var6.U(var25);
            }

            switch(var26) {
            case 4:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
               var17[var24] = s.w.q(var25).U;
               var18[var24] = s.w.q(Pointer.class).U;
            case 23:
            case 24:
            case 25:
               var18[var24] = s.w.q(var25.isPrimitive()?var25:Pointer.class).U;
               var17[var24] = s.w.q(var20[var24].E()).U;
            case 0:
               var18[var24] = var17[var24] = s.w.q(var25).U;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 20:
            default:
               var18[var24] = var17[var24] = s.w.q(Pointer.class).U;
               ++var24;
            }
         }

         var33 = var33 + ")";
         var33 = var33 + s(var11);
         Class[] var41 = var32.getExceptionTypes();
         int var42 = 0;
         if(var42 < var41.length) {
            if(ct.class.isAssignableFrom(var41[var42])) {
               var23 = true;
            }

            ++var42;
         }

         Function var44 = var1.W(var32.getName(), var32);
         var7[var8] = registerMethod(var0, var32.getName(), var33, var19, var18, var17, var22, var14, var12, var32, var44.U, var44.W(), var23, var20, var21, var44.y);
         ++var8;
      }

      Map var30 = ua;
      ua.put(var0, var7);
      a.put(var0, var1);
   }

   private static Map U(Class var0, Map var1, Object var2) {
      HashMap var3 = new HashMap(var1);
      var3.put(a(-1884, 2720), var0);
      Map var4 = E;
      V.put(var0, var3);
      E.put(var0, new WeakReference(var2));
      if(!var0.isInterface() && k.class.isAssignableFrom(var0)) {
         Class[] var5 = var0.getInterfaces();

         for(Class var9 : var5) {
            if(k.class.isAssignableFrom(var9)) {
               U(var9, var3, var2);
               break;
            }
         }
      }

      return var3;
   }

   private static native long registerMethod(Class var0, String var1, String var2, int[] var3, long[] var4, long[] var5, int var6, long var7, long var9, Method var11, long var12, int var14, boolean var15, ToNativeConverter[] var16, FromNativeConverter var17, String var18);

   private static b N(Class var0, Object var1) {
      return (b)ck.n(var0).i(var1, new r(var0));
   }

   private static b U(Method var0, Object var1) {
      Class var2 = var0.getReturnType();
      return (b)ck.n(var2).i(var1, new j(var2, (Function)null, (Object[])null, var0));
   }

   private static Class C(Class var0) {
      return ck.n(var0).E();
   }

   private static Object C(ToNativeConverter var0, Object var1) {
      return var0.Z(var1, new cu());
   }

   private static Object x(FromNativeConverter var0, Object var1, Method var2) {
      return var0.i(var1, new j(var2.getReturnType(), (Function)null, (Object[])null, var2));
   }

   public static native long ffi_prep_cif(int var0, int var1, long var2, long var4);

   public static native void ffi_call(long var0, long var2, long var4, long var6);

   public static native long ffi_prep_closure(long var0, Native.ffi_callback var2);

   public static native void ffi_free_closure(long var0);

   static native int initialize_ffi_type(long var0);

   public static void main(String[] var0) {
      a(-1907, -25085);
      a(-1895, -12236);
      a(-1818, 32596);
      Package var4 = Native.class.getPackage();
      String var5 = var4.getSpecificationTitle();
      var5 = a(-1797, -18040);
      String var6 = var4.getSpecificationVersion();
      var6 = a(-1871, -482);
      var5 = var5 + a(-1902, -27113) + var6;
      System.out.println(var5);
      var6 = var4.getImplementationVersion();
      var6 = a(-1806, -14855);
      System.out.println(a(-1943, -10806) + var6);
      System.out.println(a(-1905, -20873) + getNativeVersion() + a(-1887, 17533) + getAPIChecksum() + ")");
      System.out.println(a(-1798, 17138) + d.E);
   }

   static synchronized native void freeNativeCallback(long var0);

   static synchronized native long createNativeCallback(Callback var0, Method var1, Class[] var2, Class var3, int var4, int var5, String var6);

   static native int invokeInt(Function var0, long var1, int var3, Object[] var4);

   static native long invokeLong(Function var0, long var1, int var3, Object[] var4);

   static native void invokeVoid(Function var0, long var1, int var3, Object[] var4);

   static native float invokeFloat(Function var0, long var1, int var3, Object[] var4);

   static native double invokeDouble(Function var0, long var1, int var3, Object[] var4);

   static native long invokePointer(Function var0, long var1, int var3, Object[] var4);

   private static native void invokeStructure(Function var0, long var1, int var3, Object[] var4, long var5, long var7);

   static s V(Function var0, long var1, int var3, Object[] var4, s var5) {
      invokeStructure(var0, var1, var3, var4, var5.y().U, var5.C().U);
      return var5;
   }

   static native Object invokeObject(Function var0, long var1, int var3, Object[] var4);

   static long z(String var0) {
      return open(var0, -1);
   }

   static native long open(String var0, int var1);

   static native void close(long var0);

   static native long findSymbol(long var0, String var2);

   static native long indexOf(Pointer var0, long var1, long var3, byte var5);

   static native void read(Pointer var0, long var1, long var3, byte[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, short[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, char[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, int[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, long[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, float[] var5, int var6, int var7);

   static native void read(Pointer var0, long var1, long var3, double[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, byte[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, short[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, char[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, int[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, long[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, float[] var5, int var6, int var7);

   static native void write(Pointer var0, long var1, long var3, double[] var5, int var6, int var7);

   static native byte getByte(Pointer var0, long var1, long var3);

   static native char getChar(Pointer var0, long var1, long var3);

   static native short getShort(Pointer var0, long var1, long var3);

   static native int getInt(Pointer var0, long var1, long var3);

   static native long getLong(Pointer var0, long var1, long var3);

   static native float getFloat(Pointer var0, long var1, long var3);

   static native double getDouble(Pointer var0, long var1, long var3);

   static Pointer J(long var0) {
      long var2 = _getPointer(var0);
      return var2 == 0L?null:new Pointer(var2);
   }

   private static native long _getPointer(long var0);

   static native String getWideString(Pointer var0, long var1, long var3);

   static String K(Pointer var0, long var1) {
      return O(var0, var1, L());
   }

   static String O(Pointer var0, long var1, String var3) {
      byte[] var4 = getStringBytes(var0, var0.U, var1);
      return new String(var4, var3);
   }

   static native byte[] getStringBytes(Pointer var0, long var1, long var3);

   static native void setMemory(Pointer var0, long var1, long var3, long var5, byte var7);

   static native void setByte(Pointer var0, long var1, long var3, byte var5);

   static native void setShort(Pointer var0, long var1, long var3, short var5);

   static native void setChar(Pointer var0, long var1, long var3, char var5);

   static native void setInt(Pointer var0, long var1, long var3, int var5);

   static native void setLong(Pointer var0, long var1, long var3, long var5);

   static native void setFloat(Pointer var0, long var1, long var3, float var5);

   static native void setDouble(Pointer var0, long var1, long var3, double var5);

   static native void setPointer(Pointer var0, long var1, long var3, long var5);

   static native void setWideString(Pointer var0, long var1, long var3, String var5);

   static native ByteBuffer getDirectByteBuffer(Pointer var0, long var1, long var3, long var5);

   public static native long malloc(long var0);

   public static native void free(long var0);

   /** @deprecated */
   @Deprecated
   public static native ByteBuffer getDirectByteBuffer(long var0, long var2);

   public static void l(boolean var0) {
      Thread var1 = Thread.currentThread();
      A.remove(var1);
      Pointer var10000 = (Pointer)g.get();
      setDetachState(true, 0L);
   }

   static Pointer i(Thread var0) {
      return (Pointer)A.get(var0);
   }

   private static native void setDetachState(boolean var0, long var1);

   // $FF: synthetic method
   static void access$000() {
      Q();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -1819) & '\uffff';
      if(bb[var2] == null) {
         char[] var3 = ab[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 205;
            break;
         case 1:
            var10000 = 105;
            break;
         case 2:
            var10000 = 56;
            break;
         case 3:
            var10000 = 137;
            break;
         case 4:
            var10000 = 210;
            break;
         case 5:
            var10000 = 116;
            break;
         case 6:
            var10000 = 129;
            break;
         case 7:
            var10000 = 120;
            break;
         case 8:
            var10000 = 157;
            break;
         case 9:
            var10000 = 81;
            break;
         case 10:
            var10000 = 163;
            break;
         case 11:
            var10000 = 224;
            break;
         case 12:
            var10000 = 14;
            break;
         case 13:
            var10000 = 63;
            break;
         case 14:
            var10000 = 225;
            break;
         case 15:
            var10000 = 80;
            break;
         case 16:
            var10000 = 231;
            break;
         case 17:
            var10000 = 171;
            break;
         case 18:
            var10000 = 203;
            break;
         case 19:
            var10000 = 161;
            break;
         case 20:
            var10000 = 107;
            break;
         case 21:
            var10000 = 149;
            break;
         case 22:
            var10000 = 188;
            break;
         case 23:
            var10000 = 133;
            break;
         case 24:
            var10000 = 122;
            break;
         case 25:
            var10000 = 204;
            break;
         case 26:
            var10000 = 251;
            break;
         case 27:
            var10000 = 29;
            break;
         case 28:
            var10000 = 219;
            break;
         case 29:
            var10000 = 11;
            break;
         case 30:
            var10000 = 172;
            break;
         case 31:
            var10000 = 212;
            break;
         case 32:
            var10000 = 60;
            break;
         case 33:
            var10000 = 68;
            break;
         case 34:
            var10000 = 31;
            break;
         case 35:
            var10000 = 242;
            break;
         case 36:
            var10000 = 51;
            break;
         case 37:
            var10000 = 189;
            break;
         case 38:
            var10000 = 115;
            break;
         case 39:
            var10000 = 123;
            break;
         case 40:
            var10000 = 193;
            break;
         case 41:
            var10000 = 253;
            break;
         case 42:
            var10000 = 155;
            break;
         case 43:
            var10000 = 62;
            break;
         case 44:
            var10000 = 32;
            break;
         case 45:
            var10000 = 85;
            break;
         case 46:
            var10000 = 139;
            break;
         case 47:
            var10000 = 100;
            break;
         case 48:
            var10000 = 45;
            break;
         case 49:
            var10000 = 43;
            break;
         case 50:
            var10000 = 215;
            break;
         case 51:
            var10000 = 181;
            break;
         case 52:
            var10000 = 52;
            break;
         case 53:
            var10000 = 178;
            break;
         case 54:
            var10000 = 140;
            break;
         case 55:
            var10000 = 75;
            break;
         case 56:
            var10000 = 55;
            break;
         case 57:
            var10000 = 76;
            break;
         case 58:
            var10000 = 106;
            break;
         case 59:
            var10000 = 50;
            break;
         case 60:
            var10000 = 16;
            break;
         case 61:
            var10000 = 36;
            break;
         case 62:
            var10000 = 1;
            break;
         case 63:
            var10000 = 69;
            break;
         case 64:
            var10000 = 99;
            break;
         case 65:
            var10000 = 145;
            break;
         case 66:
            var10000 = 234;
            break;
         case 67:
            var10000 = 159;
            break;
         case 68:
            var10000 = 21;
            break;
         case 69:
            var10000 = 22;
            break;
         case 70:
            var10000 = 202;
            break;
         case 71:
            var10000 = 147;
            break;
         case 72:
            var10000 = 87;
            break;
         case 73:
            var10000 = 173;
            break;
         case 74:
            var10000 = 113;
            break;
         case 75:
            var10000 = 176;
            break;
         case 76:
            var10000 = 168;
            break;
         case 77:
            var10000 = 5;
            break;
         case 78:
            var10000 = 82;
            break;
         case 79:
            var10000 = 131;
            break;
         case 80:
            var10000 = 186;
            break;
         case 81:
            var10000 = 255;
            break;
         case 82:
            var10000 = 44;
            break;
         case 83:
            var10000 = 27;
            break;
         case 84:
            var10000 = 206;
            break;
         case 85:
            var10000 = 195;
            break;
         case 86:
            var10000 = 177;
            break;
         case 87:
            var10000 = 104;
            break;
         case 88:
            var10000 = 61;
            break;
         case 89:
            var10000 = 23;
            break;
         case 90:
            var10000 = 73;
            break;
         case 91:
            var10000 = 179;
            break;
         case 92:
            var10000 = 135;
            break;
         case 93:
            var10000 = 164;
            break;
         case 94:
            var10000 = 142;
            break;
         case 95:
            var10000 = 182;
            break;
         case 96:
            var10000 = 185;
            break;
         case 97:
            var10000 = 83;
            break;
         case 98:
            var10000 = 125;
            break;
         case 99:
            var10000 = 58;
            break;
         case 100:
            var10000 = 200;
            break;
         case 101:
            var10000 = 246;
            break;
         case 102:
            var10000 = 254;
            break;
         case 103:
            var10000 = 190;
            break;
         case 104:
            var10000 = 59;
            break;
         case 105:
            var10000 = 132;
            break;
         case 106:
            var10000 = 227;
            break;
         case 107:
            var10000 = 194;
            break;
         case 108:
            var10000 = 197;
            break;
         case 109:
            var10000 = 33;
            break;
         case 110:
            var10000 = 118;
            break;
         case 111:
            var10000 = 7;
            break;
         case 112:
            var10000 = 183;
            break;
         case 113:
            var10000 = 119;
            break;
         case 114:
            var10000 = 3;
            break;
         case 115:
            var10000 = 46;
            break;
         case 116:
            var10000 = 86;
            break;
         case 117:
            var10000 = 207;
            break;
         case 118:
            var10000 = 35;
            break;
         case 119:
            var10000 = 117;
            break;
         case 120:
            var10000 = 71;
            break;
         case 121:
            var10000 = 53;
            break;
         case 122:
            var10000 = 232;
            break;
         case 123:
            var10000 = 228;
            break;
         case 124:
            var10000 = 199;
            break;
         case 125:
            var10000 = 103;
            break;
         case 126:
            var10000 = 10;
            break;
         case 127:
            var10000 = 127;
            break;
         case 128:
            var10000 = 187;
            break;
         case 129:
            var10000 = 244;
            break;
         case 130:
            var10000 = 126;
            break;
         case 131:
            var10000 = 245;
            break;
         case 132:
            var10000 = 175;
            break;
         case 133:
            var10000 = 114;
            break;
         case 134:
            var10000 = 211;
            break;
         case 135:
            var10000 = 213;
            break;
         case 136:
            var10000 = 249;
            break;
         case 137:
            var10000 = 47;
            break;
         case 138:
            var10000 = 196;
            break;
         case 139:
            var10000 = 237;
            break;
         case 140:
            var10000 = 220;
            break;
         case 141:
            var10000 = 88;
            break;
         case 142:
            var10000 = 13;
            break;
         case 143:
            var10000 = 91;
            break;
         case 144:
            var10000 = 67;
            break;
         case 145:
            var10000 = 77;
            break;
         case 146:
            var10000 = 24;
            break;
         case 147:
            var10000 = 152;
            break;
         case 148:
            var10000 = 18;
            break;
         case 149:
            var10000 = 165;
            break;
         case 150:
            var10000 = 6;
            break;
         case 151:
            var10000 = 238;
            break;
         case 152:
            var10000 = 154;
            break;
         case 153:
            var10000 = 0;
            break;
         case 154:
            var10000 = 89;
            break;
         case 155:
            var10000 = 84;
            break;
         case 156:
            var10000 = 124;
            break;
         case 157:
            var10000 = 250;
            break;
         case 158:
            var10000 = 109;
            break;
         case 159:
            var10000 = 136;
            break;
         case 160:
            var10000 = 12;
            break;
         case 161:
            var10000 = 72;
            break;
         case 162:
            var10000 = 160;
            break;
         case 163:
            var10000 = 25;
            break;
         case 164:
            var10000 = 96;
            break;
         case 165:
            var10000 = 19;
            break;
         case 166:
            var10000 = 217;
            break;
         case 167:
            var10000 = 94;
            break;
         case 168:
            var10000 = 130;
            break;
         case 169:
            var10000 = 54;
            break;
         case 170:
            var10000 = 233;
            break;
         case 171:
            var10000 = 141;
            break;
         case 172:
            var10000 = 167;
            break;
         case 173:
            var10000 = 151;
            break;
         case 174:
            var10000 = 243;
            break;
         case 175:
            var10000 = 95;
            break;
         case 176:
            var10000 = 239;
            break;
         case 177:
            var10000 = 180;
            break;
         case 178:
            var10000 = 166;
            break;
         case 179:
            var10000 = 30;
            break;
         case 180:
            var10000 = 2;
            break;
         case 181:
            var10000 = 97;
            break;
         case 182:
            var10000 = 230;
            break;
         case 183:
            var10000 = 214;
            break;
         case 184:
            var10000 = 38;
            break;
         case 185:
            var10000 = 226;
            break;
         case 186:
            var10000 = 9;
            break;
         case 187:
            var10000 = 236;
            break;
         case 188:
            var10000 = 148;
            break;
         case 189:
            var10000 = 235;
            break;
         case 190:
            var10000 = 101;
            break;
         case 191:
            var10000 = 229;
            break;
         case 192:
            var10000 = 42;
            break;
         case 193:
            var10000 = 79;
            break;
         case 194:
            var10000 = 209;
            break;
         case 195:
            var10000 = 184;
            break;
         case 196:
            var10000 = 216;
            break;
         case 197:
            var10000 = 93;
            break;
         case 198:
            var10000 = 198;
            break;
         case 199:
            var10000 = 138;
            break;
         case 200:
            var10000 = 143;
            break;
         case 201:
            var10000 = 248;
            break;
         case 202:
            var10000 = 40;
            break;
         case 203:
            var10000 = 252;
            break;
         case 204:
            var10000 = 134;
            break;
         case 205:
            var10000 = 241;
            break;
         case 206:
            var10000 = 90;
            break;
         case 207:
            var10000 = 92;
            break;
         case 208:
            var10000 = 240;
            break;
         case 209:
            var10000 = 78;
            break;
         case 210:
            var10000 = 70;
            break;
         case 211:
            var10000 = 26;
            break;
         case 212:
            var10000 = 102;
            break;
         case 213:
            var10000 = 15;
            break;
         case 214:
            var10000 = 66;
            break;
         case 215:
            var10000 = 247;
            break;
         case 216:
            var10000 = 192;
            break;
         case 217:
            var10000 = 208;
            break;
         case 218:
            var10000 = 49;
            break;
         case 219:
            var10000 = 64;
            break;
         case 220:
            var10000 = 221;
            break;
         case 221:
            var10000 = 98;
            break;
         case 222:
            var10000 = 156;
            break;
         case 223:
            var10000 = 108;
            break;
         case 224:
            var10000 = 17;
            break;
         case 225:
            var10000 = 57;
            break;
         case 226:
            var10000 = 218;
            break;
         case 227:
            var10000 = 34;
            break;
         case 228:
            var10000 = 169;
            break;
         case 229:
            var10000 = 111;
            break;
         case 230:
            var10000 = 128;
            break;
         case 231:
            var10000 = 191;
            break;
         case 232:
            var10000 = 121;
            break;
         case 233:
            var10000 = 74;
            break;
         case 234:
            var10000 = 153;
            break;
         case 235:
            var10000 = 150;
            break;
         case 236:
            var10000 = 28;
            break;
         case 237:
            var10000 = 174;
            break;
         case 238:
            var10000 = 146;
            break;
         case 239:
            var10000 = 37;
            break;
         case 240:
            var10000 = 39;
            break;
         case 241:
            var10000 = 8;
            break;
         case 242:
            var10000 = 144;
            break;
         case 243:
            var10000 = 162;
            break;
         case 244:
            var10000 = 222;
            break;
         case 245:
            var10000 = 41;
            break;
         case 246:
            var10000 = 170;
            break;
         case 247:
            var10000 = 20;
            break;
         case 248:
            var10000 = 112;
            break;
         case 249:
            var10000 = 65;
            break;
         case 250:
            var10000 = 110;
            break;
         case 251:
            var10000 = 48;
            break;
         case 252:
            var10000 = 4;
            break;
         case 253:
            var10000 = 201;
            break;
         case 254:
            var10000 = 223;
            break;
         default:
            var10000 = 158;
         }

         short var4 = var10000;
         int var5 = (var1 & 255) - var4;
         var5 = var5 + 256;
         int var6 = ((var1 & '\uffff') >>> 8) - var4;
         var6 = var6 + 256;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            var3[var7] = (char)(var3[var7] ^ var5);
            var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
         }

         bb[var2] = (new String(var3)).intern();
      }

      return bb[var2];
   }

   private static class f {
      static long P(Window var0) throws HeadlessException {
         return D(var0);
      }

      static long D(Object var0) throws HeadlessException {
         net.u.d[] var1 = c.F();
         if(GraphicsEnvironment.isHeadless()) {
            throw new HeadlessException("No native windows when headless");
         } else {
            Component var2 = (Component)var0;
            if(var2.isLightweight()) {
               throw new IllegalArgumentException("Component must be heavyweight");
            } else if(!var2.isDisplayable()) {
               throw new IllegalStateException("Component must be displayable");
            } else if(d.b() && System.getProperty("java.version").startsWith("1.4") && !var2.isVisible()) {
               throw new IllegalStateException("Component must be visible");
            } else {
               return Native.getWindowHandle0(var2);
            }
         }
      }

      private static HeadlessException a(HeadlessException var0) {
         return var0;
      }
   }

   public interface ffi_callback {
      void Y(long var1, long var3, long var5);
   }

   private static class p {
      static boolean I(Class var0) {
         return Buffer.class.isAssignableFrom(var0);
      }
   }
}
