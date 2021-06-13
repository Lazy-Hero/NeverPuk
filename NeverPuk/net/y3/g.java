package net.y3;

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import net.c9.pz;
import net.y3.e;
import net.y3.o;

public class g extends o {
   public e d(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      o.P();
      JsonObject var5 = var1.getAsJsonObject();
      HashSet var6 = Sets.newHashSet();
      Iterator var7 = var5.entrySet().iterator();
      if(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         String var9 = (String)var8.getKey();
         if(var9.length() > 16) {
            throw new JsonParseException("Invalid language->\'" + var9 + "\': language code must not be more than " + 16 + " characters long");
         }

         JsonObject var10 = net.yz.c.V((JsonElement)var8.getValue(), "language");
         String var11 = net.yz.c.X(var10, "region");
         String var12 = net.yz.c.X(var10, "name");
         boolean var13 = net.yz.c.a(var10, "bidirectional", false);
         if(var11.isEmpty()) {
            throw new JsonParseException("Invalid language->\'" + var9 + "\'->region: empty value");
         }

         if(var12.isEmpty()) {
            throw new JsonParseException("Invalid language->\'" + var9 + "\'->name: empty value");
         }

         if(!var6.add(new pz(var9, var11, var12, var13))) {
            throw new JsonParseException("Duplicate language->\'" + var9 + "\' defined");
         }
      }

      return new e(var6);
   }

   public String E() {
      return "language";
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
