package net.y7;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Random;
import net.xn;
import net.y7.p;

public class b {
   private final float V;
   private final float X;

   public b(float var1, float var2) {
      this.V = var1;
      this.X = var2;
   }

   public b(float var1) {
      this.V = var1;
      this.X = var1;
   }

   public float t() {
      return this.V;
   }

   public float N() {
      return this.X;
   }

   public int O(Random var1) {
      return net.u.t.A(var1, net.u.t.M(this.V), net.u.t.M(this.X));
   }

   public float c(Random var1) {
      return net.u.t.M(var1, this.V, this.X);
   }

   public boolean e(int var1) {
      int[] var2 = p.h();
      return Float.compare((float)var1, this.X) <= 0 && (float)var1 >= this.V;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class g implements JsonDeserializer, JsonSerializer {
      public b B(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         int[] var4 = p.h();
         if(net.yz.c.i(var1)) {
            return new b(net.yz.c.T(var1, "value"));
         } else {
            JsonObject var5 = net.yz.c.V(var1, "value");
            float var6 = net.yz.c.t(var5, "min");
            float var7 = net.yz.c.t(var5, "max");
            return new b(var6, var7);
         }
      }

      public JsonElement U(b var1, Type var2, JsonSerializationContext var3) {
         if(var1.V == var1.X) {
            return new JsonPrimitive(Float.valueOf(var1.V));
         } else {
            JsonObject var4 = new JsonObject();
            var4.addProperty("min", Float.valueOf(var1.V));
            var4.addProperty("max", Float.valueOf(var1.X));
            return var4;
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
