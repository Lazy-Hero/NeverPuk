package com.sun.jna;

import com.sun.jna.c;
import com.sun.jna.cu;
import com.sun.jna.cy;
import com.sun.jna.m;
import com.sun.jna.n;
import com.sun.jna.q;
import com.sun.jna.r;
import net.xn;

public class ca extends cy {
   public static final q K;
   public static final q P;
   public static final q Q;
   private static int w;

   protected ca(boolean var1) {
      m var2 = new m() {
         public Object Z(Object var1, cu var2) {
            int var3 = ca.w;
            return var1 == null?null:(var1 instanceof String[]?new n((String[])((String[])var1), true):new c(var1.toString()));
         }

         public Object i(Object var1, r var2) {
            int var3 = ca.w;
            return var1 == null?null:var1.toString();
         }

         public Class E() {
            return c.class;
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.A(String.class, var2);
      this.t(String[].class, var2);
      var2 = new m() {
         public Object Z(Object var1, cu var2) {
            int var3 = ca.w;
            Integer var10000 = Integer.valueOf(Boolean.TRUE.equals(var1)?1:0);
            if(net.u.d.y() == null) {
               ++var3;
               ca.w = var3;
            }

            return var10000;
         }

         public Object i(Object var1, r var2) {
            return ((Integer)var1).intValue() != 0?Boolean.TRUE:Boolean.FALSE;
         }

         public Class E() {
            return Integer.class;
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      this.A(Boolean.class, var2);
   }

   static {
      if(E() == 0) {
         h(3);
      }

      K = new ca(true);
      P = new ca(false);
      Boolean.getBoolean("w32.ascii");
      Q = K;
   }

   public static void h(int var0) {
      w = var0;
   }

   public static int L() {
      return w;
   }

   public static int E() {
      int var0 = L();
      return 9;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
