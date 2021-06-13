package net.yz;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import net.yz.m_;

public class ay {
   public static Map r(Iterable var0, Iterable var1) {
      return s(var0, var1, Maps.newLinkedHashMap());
   }

   public static Map s(Iterable var0, Iterable var1, Map var2) {
      m_.g();
      Iterator var4 = var1.iterator();
      Iterator var5 = var0.iterator();
      if(var5.hasNext()) {
         Object var6 = var5.next();
         var2.put(var6, var4.next());
      }

      if(var4.hasNext()) {
         throw new NoSuchElementException();
      } else {
         return var2;
      }
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}
