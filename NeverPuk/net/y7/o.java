package net.y7;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Random;
import net.u.d;
import net.y7.c;
import net.y7.n;
import net.y7.p;
import net.y7.r;
import net.y7.x;

public abstract class o {
   protected final int n;
   protected final int Z;
   protected final net.g.x[] l;

   protected o(int var1, int var2, net.g.x[] var3) {
      this.n = var1;
      this.Z = var2;
      this.l = var3;
   }

   public int l(float var1) {
      return Math.max(net.u.t.M((float)this.n + (float)this.Z * var1), 0);
   }

   public abstract void n(Collection var1, Random var2, r var3);

   protected abstract void j(JsonObject var1, JsonSerializationContext var2);

   public static class g implements JsonDeserializer, JsonSerializer {
      public o v(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         p.h();
         JsonObject var5 = net.yz.c.V(var1, "loot item");
         String var6 = net.yz.c.X(var5, "type");
         int var7 = net.yz.c.t(var5, "weight", 1);
         int var8 = net.yz.c.t(var5, "quality", 0);
         if(var5.has("conditions")) {
            net.g.x[] var9 = (net.g.x[])net.yz.c.m(var5, "conditions", var3, net.g.x[].class);
         }

         net.g.x[] var10 = new net.g.x[0];
         if("item".equals(var6)) {
            return x.R(var5, var3, var7, var8, var10);
         } else if("loot_table".equals(var6)) {
            return n.o(var5, var3, var7, var8, var10);
         } else if("empty".equals(var6)) {
            c var10000 = c.A(var5, var3, var7, var8, var10);
            if(d.y() == null) {
               p.d(new int[1]);
            }

            return var10000;
         } else {
            throw new JsonSyntaxException("Unknown loot entry type \'" + var6 + "\'");
         }
      }

      public JsonElement e(o var1, Type var2, JsonSerializationContext var3) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("weight", Integer.valueOf(var1.n));
         var4.addProperty("quality", Integer.valueOf(var1.Z));
         if(var1.l.length > 0) {
            var4.add("conditions", var3.serialize(var1.l));
         }

         if(var1 instanceof x) {
            var4.addProperty("type", "item");
         } else if(var1 instanceof n) {
            var4.addProperty("type", "loot_table");
         } else {
            if(!(var1 instanceof c)) {
               throw new IllegalArgumentException("Don\'t know how to serialize " + var1);
            }

            var4.addProperty("type", "empty");
         }

         var1.j(var4, var3);
         return var4;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
