package net;

import java.lang.reflect.Field;
import net.i3;
import net.m3;
import net.mf;

public class xp implements i3 {
   private m3 B = null;
   private String U = null;

   public xp(m3 var1, String var2) {
      this.B = var1;
      this.U = var2;
   }

   public Field q() {
      Class var1 = this.B.J();
      return null;
   }

   private Field a(Class var1, String var2) throws NoSuchFieldException {
      mf.O();
      Field[] var4 = var1.getDeclaredFields();
      int var5 = 0;
      if(var5 < var4.length) {
         Field var6 = var4[var5];
         if(var6.getName().equals(var2)) {
            return var6;
         }

         ++var5;
      }

      if(var1 == Object.class) {
         throw new NoSuchFieldException(var2);
      } else {
         return this.a(var1.getSuperclass(), var2);
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
