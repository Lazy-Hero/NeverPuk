package net.y3;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.y3.d;
import net.y3.o;

public class b extends o {
   public d G(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      boolean var5 = net.yz.c.a(var4, "blur", false);
      boolean var6 = net.yz.c.a(var4, "clamp", false);
      return new d(var5, var6);
   }

   public String E() {
      return "texture";
   }
}
