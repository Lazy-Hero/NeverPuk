package net.y3;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.y3.a;
import net.y3.o;
import net.y3.r;
import org.apache.commons.lang3.Validate;

public class v extends o implements JsonSerializer {
   public r B(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      ArrayList var5 = Lists.newArrayList();
      o.P();
      JsonObject var6 = net.yz.c.V(var1, "metadata section");
      int var7 = net.yz.c.t(var6, "frametime", 1);
      if(var7 != 1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var7, "Invalid default frame time");
      }

      if(var6.has("frames")) {
         JsonArray var8 = net.yz.c.P(var6, "frames");
         int var9 = 0;
         if(var9 < var8.size()) {
            JsonElement var10 = var8.get(var9);
            a var11 = this.Y(var9, var10);
            var5.add(var11);
            ++var9;
            net.u.d.h(new net.u.d[5]);
         }
      }

      int var12 = net.yz.c.t(var6, "width", -1);
      int var14 = net.yz.c.t(var6, "height", -1);
      if(var12 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var12, "Invalid width");
      }

      if(var14 != -1) {
         Validate.inclusiveBetween(1L, 2147483647L, (long)var14, "Invalid height");
      }

      boolean var15 = net.yz.c.a(var6, "interpolate", false);
      return new r(var5, var12, var14, var7, var15);
   }

   private a Y(int var1, JsonElement var2) {
      if(var2.isJsonPrimitive()) {
         return new a(net.yz.c.s(var2, "frames[" + var1 + "]"));
      } else if(var2.isJsonObject()) {
         JsonObject var3 = net.yz.c.V(var2, "frames[" + var1 + "]");
         int var4 = net.yz.c.t(var3, "time", -1);
         if(var3.has("time")) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)var4, "Invalid frame time");
         }

         int var5 = net.yz.c.o(var3, "index");
         Validate.inclusiveBetween(0L, 2147483647L, (long)var5, "Invalid frame index");
         return new a(var5, var4);
      } else {
         return null;
      }
   }

   public JsonElement Y(r var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("frametime", Integer.valueOf(var1.T()));
      if(var1.M() != -1) {
         var4.addProperty("width", Integer.valueOf(var1.M()));
      }

      if(var1.Z() != -1) {
         var4.addProperty("height", Integer.valueOf(var1.Z()));
      }

      if(var1.w() > 0) {
         JsonArray var5 = new JsonArray();

         for(int var6 = 0; var6 < var1.w(); ++var6) {
            if(var1.d(var6)) {
               JsonObject var7 = new JsonObject();
               var7.addProperty("index", Integer.valueOf(var1.r(var6)));
               var7.addProperty("time", Integer.valueOf(var1.e(var6)));
               var5.add(var7);
            } else {
               var5.add(new JsonPrimitive(Integer.valueOf(var1.r(var6))));
            }
         }

         var4.add("frames", var5);
      }

      return var4;
   }

   public String E() {
      return "animation";
   }

   private static ClassCastException a(ClassCastException var0) {
      return var0;
   }
}
