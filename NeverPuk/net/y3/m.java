package net.y3;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.y3.o;
import net.y3.y;
import org.apache.commons.lang3.Validate;

public class m extends o {
   public y n(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var5 = var1.getAsJsonObject();
      o.P();
      float[] var6 = new float[256];
      float[] var7 = new float[256];
      float[] var8 = new float[256];
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      if(var5.has("characters")) {
         if(!var5.get("characters").isJsonObject()) {
            throw new JsonParseException("Invalid font->characters: expected object, was " + var5.get("characters"));
         }

         JsonObject var12 = var5.getAsJsonObject("characters");
         if(var12.has("default")) {
            if(!var12.get("default").isJsonObject()) {
               throw new JsonParseException("Invalid font->characters->default: expected object, was " + var12.get("default"));
            }

            JsonObject var13 = var12.getAsJsonObject("default");
            var9 = net.yz.c.A(var13, "width", var9);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var9, "Invalid default width");
            var10 = net.yz.c.A(var13, "spacing", var10);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var10, "Invalid default spacing");
            var11 = net.yz.c.A(var13, "left", var10);
            Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var11, "Invalid default left");
         }

         int var19 = 0;
         JsonElement var14 = var12.get(Integer.toString(var19));
         JsonObject var18 = net.yz.c.V(var14, "characters[" + var19 + "]");
         float var15 = net.yz.c.A(var18, "width", var9);
         Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var15, "Invalid width");
         float var16 = net.yz.c.A(var18, "spacing", var10);
         Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var16, "Invalid spacing");
         float var17 = net.yz.c.A(var18, "left", var11);
         Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, (double)var17, "Invalid left");
         var6[var19] = var15;
         var7[var19] = var16;
         var8[var19] = var17;
         ++var19;
      }

      y var10000 = new y(var6, var8, var7);
      if(net.u.d.y() == null) {
         o.w("LMMJj");
      }

      return var10000;
   }

   public String E() {
      return "font";
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
