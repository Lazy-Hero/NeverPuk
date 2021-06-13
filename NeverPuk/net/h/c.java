package net.h;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.h.g;
import net.h.l;
import org.apache.commons.lang3.Validate;

public class c implements JsonDeserializer {
   public g B(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = net.yz.c.V(var1, "entry");
      boolean var5 = net.yz.c.a(var4, "replace", false);
      String var6 = net.yz.c.x(var4, "subtitle", (String)null);
      List var7 = this.G(var4);
      return new g(var7, var5, var6);
   }

   private List G(JsonObject var1) {
      ArrayList var2 = Lists.newArrayList();
      if(var1.has("sounds")) {
         JsonArray var3 = net.yz.c.P(var1, "sounds");

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            JsonElement var5 = var3.get(var4);
            if(net.yz.c.k(var5)) {
               String var6 = net.yz.c.m(var5, "sound");
               var2.add(new net.h.z(var6, 1.0F, 1.0F, 1, net.h.z.FILE, false));
            } else {
               var2.add(this.a(net.yz.c.V(var5, "sound")));
            }
         }
      }

      return var2;
   }

   private net.h.z a(JsonObject var1) {
      l.l();
      String var3 = net.yz.c.X(var1, "name");
      net.h.z var4 = this.D(var1, net.h.z.FILE);
      float var5 = net.yz.c.A(var1, "volume", 1.0F);
      Validate.isTrue(Float.compare(var5, 0.0F) > 0, "Invalid volume", new Object[0]);
      float var6 = net.yz.c.A(var1, "pitch", 1.0F);
      Validate.isTrue(Float.compare(var6, 0.0F) > 0, "Invalid pitch", new Object[0]);
      int var7 = net.yz.c.t(var1, "weight", 1);
      Validate.isTrue(var7 > 0, "Invalid weight", new Object[0]);
      boolean var8 = net.yz.c.a(var1, "stream", false);
      return new net.h.z(var3, var5, var6, var7, var4, var8);
   }

   private net.h.z D(JsonObject var1, net.h.z var2) {
      net.h.z var3 = var2;
      if(var1.has("type")) {
         var3 = net.h.z.k(net.yz.c.X(var1, "type"));
         Validate.notNull(var3, "Invalid type", new Object[0]);
      }

      return var3;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
