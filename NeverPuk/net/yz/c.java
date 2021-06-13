package net.yz;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.yz.m_;
import org.apache.commons.lang3.StringUtils;

public class c {
   public static boolean C(JsonObject var0, String var1) {
      return l(var0, var1) && var0.getAsJsonPrimitive(var1).isString();
   }

   public static boolean k(JsonElement var0) {
      return var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isString();
   }

   public static boolean i(JsonElement var0) {
      return var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber();
   }

   public static boolean G(JsonObject var0, String var1) {
      return l(var0, var1) && var0.getAsJsonPrimitive(var1).isBoolean();
   }

   public static boolean D(JsonObject var0, String var1) {
      return V(var0, var1) && var0.get(var1).isJsonArray();
   }

   public static boolean l(JsonObject var0, String var1) {
      return V(var0, var1) && var0.get(var1).isJsonPrimitive();
   }

   public static boolean V(JsonObject var0, String var1) {
      return false;
   }

   public static String m(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + A(var0));
      }
   }

   public static String X(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return m(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static String x(JsonObject var0, String var1, String var2) {
      return var0.has(var1)?m(var0.get(var1), var1):var2;
   }

   public static net.n0.y U(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive()) {
         String var2 = var0.getAsString();
         net.n0.y var3 = net.n0.y.H(var2);
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string \'" + var2 + "\'");
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + A(var0));
      }
   }

   public static net.n0.y K(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return U(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      }
   }

   public static boolean w(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive()) {
         return var0.getAsBoolean();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + A(var0));
      }
   }

   public static boolean A(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return w(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      }
   }

   public static boolean a(JsonObject var0, String var1, boolean var2) {
      return var0.has(var1)?w(var0.get(var1), var1):var2;
   }

   public static float T(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + A(var0));
      }
   }

   public static float t(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return T(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      }
   }

   public static float A(JsonObject var0, String var1, float var2) {
      return var0.has(var1)?T(var0.get(var1), var1):var2;
   }

   public static int s(JsonElement var0, String var1) {
      if(var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + A(var0));
      }
   }

   public static int o(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return s(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static int t(JsonObject var0, String var1, int var2) {
      return var0.has(var1)?s(var0.get(var1), var1):var2;
   }

   public static JsonObject V(JsonElement var0, String var1) {
      if(var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + A(var0));
      }
   }

   public static JsonObject b(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return V(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      }
   }

   public static JsonObject l(JsonObject var0, String var1, JsonObject var2) {
      return var0.has(var1)?V(var0.get(var1), var1):var2;
   }

   public static JsonArray m(JsonElement var0, String var1) {
      if(var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + A(var0));
      }
   }

   public static JsonArray P(JsonObject var0, String var1) {
      if(var0.has(var1)) {
         return m(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static JsonArray D(JsonObject var0, String var1, @Nullable JsonArray var2) {
      return var0.has(var1)?m(var0.get(var1), var1):var2;
   }

   public static Object Q(@Nullable JsonElement var0, String var1, JsonDeserializationContext var2, Class var3) {
      return var2.deserialize(var0, var3);
   }

   public static Object m(JsonObject var0, String var1, JsonDeserializationContext var2, Class var3) {
      if(var0.has(var1)) {
         return Q(var0.get(var1), var1, var2, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static Object n(JsonObject var0, String var1, Object var2, JsonDeserializationContext var3, Class var4) {
      return var0.has(var1)?Q(var0.get(var1), var1, var3, var4):var2;
   }

   public static String A(JsonElement var0) {
      m_.J();
      String var2 = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if(var0 == null) {
         return "null (missing)";
      } else if(var0.isJsonNull()) {
         return "null (json)";
      } else if(var0.isJsonArray()) {
         return "an array (" + var2 + ")";
      } else if(var0.isJsonObject()) {
         return "an object (" + var2 + ")";
      } else {
         if(var0.isJsonPrimitive()) {
            JsonPrimitive var3 = var0.getAsJsonPrimitive();
            if(var3.isNumber()) {
               return "a number (" + var2 + ")";
            }

            if(var3.isBoolean()) {
               return "a boolean (" + var2 + ")";
            }
         }

         return var2;
      }
   }

   @Nullable
   public static Object V(Gson var0, Reader var1, Class var2, boolean var3) {
      JsonReader var4 = new JsonReader(var1);
      var4.setLenient(var3);
      return var0.getAdapter(var2).read(var4);
   }

   @Nullable
   public static Object n(Gson var0, Reader var1, Type var2, boolean var3) {
      JsonReader var4 = new JsonReader(var1);
      var4.setLenient(var3);
      return var0.getAdapter(TypeToken.get(var2)).read(var4);
   }

   @Nullable
   public static Object R(Gson var0, String var1, Type var2, boolean var3) {
      return n(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static Object L(Gson var0, String var1, Class var2, boolean var3) {
      return V(var0, new StringReader(var1), var2, var3);
   }

   @Nullable
   public static Object e(Gson var0, Reader var1, Type var2) {
      return n(var0, var1, var2, false);
   }

   @Nullable
   public static Object n(Gson var0, String var1, Type var2) {
      return R(var0, var1, var2, false);
   }

   @Nullable
   public static Object A(Gson var0, Reader var1, Class var2) {
      return V(var0, var1, var2, false);
   }

   @Nullable
   public static Object b(Gson var0, String var1, Class var2) {
      return L(var0, var1, var2, false);
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
