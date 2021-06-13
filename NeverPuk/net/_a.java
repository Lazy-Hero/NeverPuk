package net;

import java.util.Map;
import net.mf;
import net.xn;
import net.ne.l;

public class _a {
   private static final Map o;
   private static final Map k;
   private static final Map c;

   public static int X(l var0) {
      return -1;
   }

   public static int M(Class var0) {
      mf.O();
      Integer var2 = (Integer)o.get(var0);
      return var2 == null?-1:var2.intValue();
   }

   public static int d(String var0) {
      mf.O();
      Integer var2 = (Integer)k.get(var0);
      return var2 == null?-1:var2.intValue();
   }

   public static int v(String var0) {
      mf.O();
      Integer var2 = (Integer)c.get(var0);
      return var2 == null?-1:var2.intValue();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }
}
