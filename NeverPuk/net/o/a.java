package net.o;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.g.x;
import net.n0.ks;
import net.yz.m_;

public abstract class a {
   private final x[] o;
   private static String[] W;

   protected a(x[] var1) {
      this.o = var1;
   }

   public abstract ks K(ks var1, Random var2, net.y7.r var3);

   public x[] w() {
      return this.o;
   }

   public static void O(String[] var0) {
      W = var0;
   }

   public static String[] D() {
      return W;
   }

   static {
      if(D() != null) {
         O(new String[3]);
      }

   }

   public abstract static class p {
      private final m_ p;
      private final Class W;

      protected p(m_ var1, Class var2) {
         this.p = var1;
         this.W = var2;
      }

      public m_ R() {
         return this.p;
      }

      public Class l() {
         return this.W;
      }

      public abstract void d(JsonObject var1, a var2, JsonSerializationContext var3);

      public abstract a z(JsonObject var1, JsonDeserializationContext var2, x[] var3);
   }
}
