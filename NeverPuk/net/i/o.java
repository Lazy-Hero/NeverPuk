package net.i;

import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.xn;
import net.i.b;
import net.u.d;
import net.y9.l;
import net.ym.a;
import net.yw.n;

public abstract class o implements b {
   protected Map M = Maps.newLinkedHashMap();
   private static int b;

   public String o(Map var1) {
      int var10000 = Z();
      StringBuilder var3 = new StringBuilder();
      int var2 = var10000;
      Iterator var4 = var1.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         if(var3.length() != 0) {
            var3.append(",");
         }

         net.yr.h var6 = (net.yr.h)var5.getKey();
         var3.append(var6.l());
         var3.append("=");
         var3.append(this.B(var6, (Comparable)var5.getValue()));
      }

      if(var3.length() == 0) {
         var3.append("normal");
      }

      String var8 = var3.toString();
      if(d.y() == null) {
         ++var2;
         b(var2);
      }

      return var8;
   }

   private String B(net.yr.h var1, Comparable var2) {
      return var1.p(var2);
   }

   public Map p(l var1) {
      UnmodifiableIterator var2 = var1.j().v().iterator();

      while(var2.hasNext()) {
         n var3 = (n)var2.next();
         this.M.put(var3, this.g(var3));
      }

      return this.M;
   }

   protected abstract a g(n var1);

   public static void b(int var0) {
      b = var0;
   }

   public static int Z() {
      return b;
   }

   public static int M() {
      int var0 = Z();
      return 27;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static {
      if(Z() != 0) {
         b(113);
      }

   }
}
