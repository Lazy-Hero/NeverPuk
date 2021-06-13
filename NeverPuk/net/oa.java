package net;

import java.lang.reflect.Field;
import net.oe;
import net.v;
import net.u.d;

public class oa {
   private String W;
   private Class b;

   public oa(String var1) {
      this.b = Class.forName(v.a(var1));
   }

   public void p(String var1, Object var2) throws NoSuchFieldException, IllegalAccessException {
      oe.F();
      Field var4 = this.b.getDeclaredField(v.c(this.b, var1));
      var4.setAccessible(true);
      Field var5 = Field.class.getDeclaredField("modifiers");
      var5.setAccessible(true);
      var5.setInt(var4, var4.getModifiers() & -17);
      var4.set((Object)null, var2);
      d.h(new d[4]);
   }

   private static NoSuchFieldException a(NoSuchFieldException var0) {
      return var0;
   }
}
