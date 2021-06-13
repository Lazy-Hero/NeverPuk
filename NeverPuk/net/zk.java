package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.bp;
import net.dq;
import net.xc;
import net.xn;

public interface zk {
   net.yz.m_ y();

   void I(dq var1, zk.l var2);

   void Z(dq var1, zk.l var2);

   void k(dq var1);

   bp e(JsonObject var1, JsonDeserializationContext var2);

   public static class l {
      private final bp l;
      private final xc M;
      private final String j;
      private static boolean t;

      public l(bp var1, xc var2, String var3) {
         this.l = var1;
         this.M = var2;
         this.j = var3;
      }

      public bp H() {
         return this.l;
      }

      public void T(dq var1) {
         var1.Y(this.M, this.j);
      }

      public boolean equals(Object var1) {
         boolean var2 = D();
         if(this == var1) {
            return true;
         } else if(var1 != null && this.getClass() == var1.getClass()) {
            zk.l var3 = (zk.l)var1;
            return !this.l.equals(var3.l)?false:this.M.equals(var3.M) && this.j.equals(var3.j);
         } else {
            return false;
         }
      }

      public int hashCode() {
         int var1 = this.l.hashCode();
         var1 = 31 * var1 + this.M.hashCode();
         var1 = 31 * var1 + this.j.hashCode();
         return var1;
      }

      public static void D(boolean var0) {
         t = var0;
      }

      public static boolean D() {
         return t;
      }

      public static boolean p() {
         boolean var0 = D();
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }

      static {
         if(p()) {
            D(true);
         }

      }
   }
}
