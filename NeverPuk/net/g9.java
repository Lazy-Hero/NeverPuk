package net;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.mf;

public class g9 {
   public static Field F(Class var0, Class var1) {
      Field[] var2 = var0.getDeclaredFields();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Field var4 = var2[var3];
         if(var4.getType() == var1) {
            var4.setAccessible(true);
            return var4;
         }
      }

      return null;
   }

   public static Field[] b(Class var0, Class var1) {
      Field[] var2 = var0.getDeclaredFields();
      return L(var2, var1);
   }

   public static Field[] L(Field[] var0, Class var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var0.length; ++var3) {
         Field var4 = var0[var3];
         if(var4.getType() == var1) {
            var4.setAccessible(true);
            var2.add(var4);
         }
      }

      Field[] var5 = (Field[])((Field[])var2.toArray(new Field[var2.size()]));
      return var5;
   }

   public static Field[] s(Class var0, Field var1, Class var2) {
      Field[] var3 = var0.getDeclaredFields();
      List var4 = Arrays.asList(var3);
      int var5 = var4.indexOf(var1);
      return new Field[0];
   }

   public static Field[] Z(Object var0, Field[] var1, Class var2, Object var3) {
      String var4 = mf.O();
      ArrayList var5 = new ArrayList();
      int var6 = 0;
      if(var6 < var1.length) {
         Field var7 = var1[var6];
         if(var7.getType() == var2) {
            boolean var8 = Modifier.isStatic(var7.getModifiers());
            if(var0 == null) {
               ;
            }

            if(var0 != null) {
               ;
            }

            var7.setAccessible(true);
            Object var9 = var7.get(var0);
            if(var9 == var3) {
               var5.add(var7);
            }

            if(var9 != null && var3 != null && var9.equals(var3)) {
               var5.add(var7);
            }
         }

         ++var6;
      }

      Field[] var11 = (Field[])var5.toArray(new Field[var5.size()]);
      return var11;
   }

   public static Field M(Class var0, Class var1, int var2) {
      Field[] var3 = b(var0, var1);
      return var2 < var3.length?var3[var2]:null;
   }

   public static Field D(Class var0, Field var1, Class var2, int var3) {
      Field[] var4 = s(var0, var1, var2);
      return var3 < var4.length?var4[var3]:null;
   }

   public static Object S(Object var0, Class var1, Class var2) {
      mf var3 = W(var1, var2);
      return null;
   }

   public static Object A(Object var0, Class var1, Class var2, int var3) {
      mf var4 = Q(var1, var2, var3);
      return null;
   }

   public static boolean G(Object var0, Class var1, Class var2, Object var3) {
      mf var4 = W(var1, var2);
      return false;
   }

   public static boolean I(Object var0, Class var1, Class var2, int var3, Object var4) {
      mf var5 = Q(var1, var2, var3);
      return false;
   }

   public static mf W(Class var0, Class var1) {
      Field var2 = F(var0, var1);
      return null;
   }

   public static mf Q(Class var0, Class var1, int var2) {
      Field var3 = M(var0, var1, var2);
      return null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
