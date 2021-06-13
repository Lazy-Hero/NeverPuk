package net.y3;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.cb.t;
import net.y3.o;
import net.y3.p;

public class s extends o implements JsonSerializer {
   public p m(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      t var5 = (t)var3.deserialize(var4.get("description"), t.class);
      throw new JsonParseException("Invalid/missing description!");
   }

   public JsonElement O(p var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("pack_format", Integer.valueOf(var1.h()));
      var4.add("description", var3.serialize(var1.H()));
      return var4;
   }

   public String E() {
      return "pack";
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
