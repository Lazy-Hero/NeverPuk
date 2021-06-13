package net.ym;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.ym.t;
import net.ym.u;

public class w {
   private final List h;

   public w(List var1) {
      this.h = var1;
   }

   public List k() {
      return this.h;
   }

   public boolean equals(Object var1) {
      int var2 = t.V();
      if(this == var1) {
         return true;
      } else if(var1 instanceof w) {
         w var3 = (w)var1;
         return this.h.equals(var3.h);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.h.hashCode();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class y implements JsonDeserializer {
      public w a(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         t.v();
         ArrayList var5 = Lists.newArrayList();
         if(var1.isJsonArray()) {
            JsonArray var6 = var1.getAsJsonArray();
            if(var6.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            Iterator var7 = var6.iterator();
            if(var7.hasNext()) {
               JsonElement var8 = (JsonElement)var7.next();
               var5.add(var3.deserialize(var8, u.class));
            }
         }

         var5.add(var3.deserialize(var1, u.class));
         return new w(var5);
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
