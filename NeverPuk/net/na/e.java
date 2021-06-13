package net.na;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.util.Random;
import net.xn;
import net.yz.m_;

public interface e {
   boolean H(Random var1, net.ne.l var2);

   public abstract static class w {
      private final m_ x;
      private final Class G;
      private static int j;

      protected w(m_ var1, Class var2) {
         this.x = var1;
         this.G = var2;
      }

      public m_ I() {
         return this.x;
      }

      public Class C() {
         return this.G;
      }

      public abstract JsonElement A(e var1, JsonSerializationContext var2);

      public abstract e T(JsonElement var1, JsonDeserializationContext var2);

      public static void q(int var0) {
         j = var0;
      }

      public static int J() {
         return j;
      }

      public static int y() {
         int var0 = J();
         return 60;
      }

      private static xn a(xn var0) {
         return var0;
      }

      static {
         if(J() == 0) {
            q(65);
         }

      }
   }
}
