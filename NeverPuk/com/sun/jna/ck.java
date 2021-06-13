package com.sun.jna;

import com.sun.jna.Pointer;
import com.sun.jna.b;
import com.sun.jna.cu;
import com.sun.jna.m;
import com.sun.jna.r;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

public class ck implements m {
   private static final Map M = new WeakHashMap();
   private final Class y;
   private final Class P;
   private final b t;

   public static ck n(Class var0) {
      Map var1 = M;
      Reference var2 = (Reference)M.get(var0);
      ck var3 = (ck)var2.get();
      var3 = new ck(var0);
      M.put(var0, new SoftReference(var3));
      return var3;
   }

   public ck(Class var1) {
      if(!b.class.isAssignableFrom(var1)) {
         throw new IllegalArgumentException("Type must derive from " + b.class);
      } else {
         this.y = var1;
         this.t = this.t();
         this.P = this.t.Q();
      }
   }

   public b t() {
      return (b)this.y.newInstance();
   }

   public Object i(Object var1, r var2) {
      return this.t.c(var1, var2);
   }

   public Class E() {
      return this.P;
   }

   public Object Z(Object var1, cu var2) {
      if(Pointer.class.isAssignableFrom(this.P)) {
         return null;
      } else {
         var1 = this.t();
         return ((b)var1).E();
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
