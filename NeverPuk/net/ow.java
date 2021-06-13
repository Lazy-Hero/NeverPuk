package net;

import java.lang.reflect.Method;
import java.util.ArrayList;
import net.i6;
import net.m3;
import net.mf;

public class ow {
   private m3 U;
   private String b;
   private Class[] t;
   private boolean O;
   private Method J;

   public ow(m3 var1, String var2) {
      this(var1, var2, (Class[])null, false);
   }

   public ow(m3 var1, String var2, Class[] var3) {
      this(var1, var2, var3, false);
   }

   public ow(m3 var1, String var2, Class[] var3, boolean var4) {
      this.U = null;
      this.b = null;
      this.t = null;
      this.O = false;
      this.J = null;
      this.U = var1;
      this.b = var2;
      this.t = var3;
      this.V();
   }

   public Method V() {
      if(this.O) {
         return this.J;
      } else {
         this.O = true;
         Class var1 = this.U.J();
         return null;
      }
   }

   public boolean r() {
      String var1 = mf.O();
      return this.O?this.J != null:this.V() != null;
   }

   public Class Y() {
      mf.O();
      Method var2 = this.V();
      return var2 == null?null:var2.getReturnType();
   }

   public void L() {
      this.O = true;
      this.J = null;
   }

   public static Method J(Class var0, String var1, Class[] var2) {
      Method[] var3 = var0.getDeclaredMethods();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if(var5.getName().equals(var1)) {
            Class[] var6 = var5.getParameterTypes();
            if(i6.f(var2, var6)) {
               return var5;
            }
         }
      }

      return null;
   }

   public static Method[] c(Class var0, String var1) {
      ArrayList var2 = new ArrayList();
      Method[] var3 = var0.getDeclaredMethods();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Method var5 = var3[var4];
         if(var5.getName().equals(var1)) {
            var2.add(var5);
         }
      }

      Method[] var6 = (Method[])((Method[])var2.toArray(new Method[var2.size()]));
      return var6;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
