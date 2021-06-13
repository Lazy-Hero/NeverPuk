package net;

import java.lang.reflect.Field;
import net.i3;
import net.m3;
import net.mf;

public class m9 implements i3 {
   private m3 a;
   private Class Y;
   private final int q;

   public m9(m3 var1, Class var2) {
      this(var1, var2, 0);
   }

   public m9(m3 var1, Class var2, int var3) {
      this.a = null;
      this.Y = null;
      this.a = var1;
      this.Y = var2;
      this.q = var3;
   }

   public Field q() {
      mf.O();
      Class var2 = this.a.J();
      if(var2 == null) {
         return null;
      } else {
         Field[] var3 = var2.getDeclaredFields();
         int var4 = 0;
         int var5 = 0;
         if(var5 < var3.length) {
            Field var6 = var3[var5];
            if(var6.getType() == this.Y) {
               if(var4 == this.q) {
                  var6.setAccessible(true);
                  return var6;
               }

               ++var4;
            }

            ++var5;
         }

         return null;
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
