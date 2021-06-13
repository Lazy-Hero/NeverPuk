package net;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import net.mr;
import net.pq;
import net.r6;
import net.wv;
import net.xn;
import net.u.d;

public class _x {
   private static final HashMap U = new HashMap();
   private static int N;

   public static void K(Object var0) {
      for(Method var4 : var0.getClass().getDeclaredMethods()) {
         if(!n(var4)) {
            m(var4, var0);
         }
      }

   }

   public static void Y(Object var0, Class var1) {
      for(Method var5 : var0.getClass().getDeclaredMethods()) {
         if(!w(var5, var1)) {
            m(var5, var0);
         }
      }

   }

   public static void E(Object var0) {
      for(List var2 : U.values()) {
         for(_x.w var4 : var2) {
            if(var4.I().equals(var0)) {
               var2.remove(var4);
            }
         }
      }

      Y(true);
   }

   public static void z(Object var0, Class var1) {
      if(U.containsKey(var1)) {
         for(_x.w var3 : (List)U.get(var1)) {
            if(var3.I().equals(var0)) {
               ((List)U.get(var1)).remove(var3);
            }
         }

         Y(true);
      }

   }

   private static void m(Method var0, Object var1) {
      Class var3 = var0.getParameterTypes()[0];
      w();
      final _x.w var4 = new _x.w(var1, var0, ((mr)var0.getAnnotation(mr.class)).value());
      if(!var4.q().isAccessible()) {
         var4.q().setAccessible(true);
      }

      if(U.containsKey(var3)) {
         if(((List)U.get(var3)).contains(var4)) {
            return;
         }

         ((List)U.get(var3)).add(var4);
         W(var3);
      }

      U.put(var3, new CopyOnWriteArrayList() {
         private static final long serialVersionUID = 666L;

         {
            int var10000 = _x.N;
            int var2 = var10000;
            this.add(var4);
            if(d.y() == null) {
               ++var2;
               _x.N = var2;
            }

         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public static void H(Class var0) {
      Iterator var1 = U.entrySet().iterator();

      while(var1.hasNext()) {
         if(((Class)((Entry)var1.next()).getKey()).equals(var0)) {
            var1.remove();
            break;
         }
      }

   }

   public static void Y(boolean var0) {
      Iterator var1 = U.entrySet().iterator();

      while(var1.hasNext()) {
         if(((List)((Entry)var1.next()).getValue()).isEmpty()) {
            var1.remove();
         }
      }

   }

   private static void W(Class var0) {
      CopyOnWriteArrayList var1 = new CopyOnWriteArrayList();

      for(byte var5 : r6.t) {
         for(_x.w var7 : (List)U.get(var0)) {
            if(var7.C() == var5) {
               var1.add(var7);
            }
         }
      }

      U.put(var0, var1);
   }

   private static boolean n(Method var0) {
      return var0.getParameterTypes().length != 1 || !var0.isAnnotationPresent(mr.class);
   }

   private static boolean w(Method var0, Class var1) {
      return n(var0) || !var0.getParameterTypes()[0].equals(var1);
   }

   public static pq m(pq var0) {
      List var1 = (List)U.get(var0.getClass());
      if(var0 instanceof wv) {
         wv var2 = (wv)var0;

         for(_x.w var4 : var1) {
            L(var4, var0);
            if(var2.F()) {
               break;
            }
         }
      } else {
         for(_x.w var6 : var1) {
            L(var6, var0);
         }
      }

      return var0;
   }

   private static void L(_x.w var0, pq var1) {
      var0.q().invoke(var0.I(), new Object[]{var1});
   }

   static {
      m(46);
   }

   public static void m(int var0) {
      N = var0;
   }

   public static int w() {
      return N;
   }

   public static int B() {
      int var0 = w();
      return 87;
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static class w {
      private final Object B;
      private final Method M;
      private final byte A;

      public w(Object var1, Method var2, byte var3) {
         _x.B();
         super();
         this.B = var1;
         this.M = var2;
         this.A = var3;
         d.h(new d[1]);
      }

      public Object I() {
         return this.B;
      }

      public Method q() {
         return this.M;
      }

      public byte C() {
         return this.A;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
