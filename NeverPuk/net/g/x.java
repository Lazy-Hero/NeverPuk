package net.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.y7.r;
import net.yz.m_;

public interface x {
   boolean y(Random var1, r var2);

   public abstract static class s {
      private final m_ T;
      private final Class H;
      private static String[] u;

      protected s(m_ var1, Class var2) {
         this.T = var1;
         this.H = var2;
      }

      public m_ y() {
         return this.T;
      }

      public Class U() {
         return this.H;
      }

      public abstract void F(JsonObject var1, x var2, JsonSerializationContext var3);

      public abstract x x(JsonObject var1, JsonDeserializationContext var2);

      public static void y(String[] var0) {
         u = var0;
      }

      public static String[] U() {
         return u;
      }

      static {
         if(U() != null) {
            y(new String[4]);
         }

      }
   }
}
