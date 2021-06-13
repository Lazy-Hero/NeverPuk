package net.n6;

import java.util.Map;
import net.xn;
import net.cb.t;
import net.n6.k;

public class o {
   private final o.z C;
   private final t a;

   public o(o.z var1, t var2) {
      this.C = var1;
      this.a = var2;
   }

   public o.z z() {
      return this.C;
   }

   public t g() {
      return this.a;
   }

   public boolean equals(Object var1) {
      String[] var2 = k.U();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         o var3 = (o)var1;
         return this.C != var3.C?false:(this.a != null?this.a.equals(var3.a):var3.a == null);
      } else {
         return false;
      }
   }

   public String toString() {
      return "HoverEvent{action=" + this.C + ", value=\'" + this.a + '\'' + '}';
   }

   public int hashCode() {
      int var1 = this.C.hashCode();
      var1 = 31 * var1 + (this.a != null?this.a.hashCode():0);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum z {
      SHOW_TEXT,
      SHOW_ITEM,
      SHOW_ENTITY;

      private static final Map Z;
      private final boolean i;
      private final String V;

      private z(String var3, boolean var4) {
         this.V = var3;
         this.i = var4;
      }

      public boolean m() {
         return this.i;
      }

      public String x() {
         return this.V;
      }

      public static o.z x(String var0) {
         return (o.z)Z.get(var0);
      }

      static {
         // $FF: Couldn't be decompiled
      }
   }
}
