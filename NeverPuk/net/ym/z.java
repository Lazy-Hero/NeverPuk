package net.ym;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.ym.q;
import net.yz.aq;

public class z {
   public static final aq p = null;
   public final aq M;
   public final int j;
   public final String V;
   public final q a;

   public z(@Nullable aq var1, int var2, String var3, q var4) {
      this.M = var1;
      this.j = var2;
      this.V = var3;
      this.a = var4;
   }

   static class x implements JsonDeserializer {
      public net.ym.z k(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         aq var5 = this.I(var4);
         int var6 = this.I(var4);
         String var7 = this.A(var4);
         q var8 = (q)var3.deserialize(var4, q.class);
         return new net.ym.z(var5, var6, var7, var8);
      }

      protected int I(JsonObject var1) {
         return net.yz.c.t(var1, "tintindex", -1);
      }

      private String A(JsonObject var1) {
         return net.yz.c.X(var1, "texture");
      }

      @Nullable
      private aq I(JsonObject var1) {
         String var2 = net.yz.c.x(var1, "cullface", "");
         return aq.I(var2);
      }
   }
}
