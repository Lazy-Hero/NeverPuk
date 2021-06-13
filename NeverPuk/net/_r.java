package net;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import net.mf;

public class _r {
   private Class V = null;
   private int w = 0;
   private final ArrayDeque v = new ArrayDeque();

   public _r(Class var1, int var2) {
      this.V = var1;
      this.w = var2;
   }

   public synchronized Object i(int var1) {
      mf.O();
      Object var3 = this.v.pollLast();
      if(var3 == null || Array.getLength(var3) < var1) {
         var3 = Array.newInstance(this.V, var1);
      }

      return var3;
   }

   public synchronized void P(Object var1) {
      String var2 = mf.O();
      if(var1 != null) {
         Class var3 = var1.getClass();
         if(var3.getComponentType() != this.V) {
            throw new IllegalArgumentException("Wrong component type");
         }

         if(this.v.size() < this.w) {
            this.v.add(var1);
         }
      }

   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
