package net;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import net.g9;
import net.i3;
import net.mf;
import net.xn;
import net.nn.j;

public class x8 implements i3 {
   public Field q() {
      mf.O();
      Class var10001 = j.class;
      Field var3 = this.o();
      if(var3 == null) {
         return null;
      } else {
         Field var4 = g9.D(j.class, var3, Boolean.TYPE, 0);
         return var4;
      }
   }

   private Field o() {
      j var2 = j.b();
      mf.O();
      boolean var3 = var2.sJ;
      Field[] var4 = j.class.getDeclaredFields();
      var2.sJ = true;
      Field[] var5 = g9.Z(var2, var4, Boolean.TYPE, Boolean.TRUE);
      var2.sJ = false;
      Field[] var6 = g9.Z(var2, var4, Boolean.TYPE, Boolean.FALSE);
      var2.sJ = var3;
      HashSet var7 = new HashSet(Arrays.asList(var5));
      HashSet var8 = new HashSet(Arrays.asList(var6));
      HashSet var9 = new HashSet(var7);
      var9.retainAll(var8);
      Field[] var10 = (Field[])var9.toArray(new Field[var9.size()]);
      return var10.length != 1?null:var10[0];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
