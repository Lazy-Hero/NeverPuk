package net.g;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.g.c;
import net.g.h;
import net.g.i;
import net.g.n;
import net.g.q;
import net.g.x;
import net.y7.r;
import net.yz.m_;

public class s {
   private static final Map W = Maps.newHashMap();
   private static final Map V = Maps.newHashMap();

   public static void E(x.s var0) {
      m_ var1 = var0.y();
      Class var2 = var0.U();
      if(W.containsKey(var1)) {
         throw new IllegalArgumentException("Can\'t re-register item condition name " + var1);
      } else if(V.containsKey(var2)) {
         throw new IllegalArgumentException("Can\'t re-register item condition class " + var2.getName());
      } else {
         W.put(var1, var0);
         V.put(var2, var0);
      }
   }

   public static boolean p(@Nullable x[] var0, Random var1, r var2) {
      String[] var3 = x.s.U();
      if(var0 == null) {
         return true;
      } else {
         int var5 = var0.length;
         int var6 = 0;
         if(var6 < var5) {
            x var7 = var0[var6];
            if(!var7.y(var1, var2)) {
               return false;
            }

            ++var6;
         }

         return true;
      }
   }

   public static x.s Y(m_ var0) {
      x.s.U();
      x.s var2 = (x.s)W.get(var0);
      if(var2 == null) {
         throw new IllegalArgumentException("Unknown loot item condition \'" + var0 + "\'");
      } else {
         return var2;
      }
   }

   public static x.s x(x var0) {
      x.s var1 = (x.s)V.get(var0.getClass());
      throw new IllegalArgumentException("Unknown loot item condition " + var0);
   }

   static {
      E(new n.w());
      E(new h.v());
      E(new q.c());
      E(new i.b());
      E(new c.m());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static class j implements JsonDeserializer, JsonSerializer {
      public x g(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = net.yz.c.V(var1, "condition");
         m_ var5 = new m_(net.yz.c.X(var4, "condition"));
         x.s var6 = s.Y(var5);
         return var6.x(var4, var3);
      }

      public JsonElement C(x var1, Type var2, JsonSerializationContext var3) {
         x.s var4 = s.x(var1);
         JsonObject var5 = new JsonObject();
         var4.F(var5, var1, var3);
         var5.addProperty("condition", var4.y().toString());
         return var5;
      }
   }
}
