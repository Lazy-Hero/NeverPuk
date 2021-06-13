package net.o;

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
import net.g.x;
import net.o.a;
import net.o.d;
import net.o.g;
import net.o.h;
import net.o.j;
import net.o.l;
import net.o.n;
import net.o.r;
import net.o.s;
import net.yz.c;
import net.yz.m_;

public class v {
   private static final Map B = Maps.newHashMap();
   private static final Map F = Maps.newHashMap();

   public static void T(a.p var0) {
      m_ var1 = var0.R();
      Class var2 = var0.l();
      if(B.containsKey(var1)) {
         throw new IllegalArgumentException("Can\'t re-register item function name " + var1);
      } else if(F.containsKey(var2)) {
         throw new IllegalArgumentException("Can\'t re-register item function class " + var2.getName());
      } else {
         B.put(var1, var0);
         F.put(var2, var0);
      }
   }

   public static a.p K(m_ var0) {
      a.D();
      a.p var2 = (a.p)B.get(var0);
      if(var2 == null) {
         throw new IllegalArgumentException("Unknown loot item function \'" + var0 + "\'");
      } else {
         return var2;
      }
   }

   public static a.p l(a var0) {
      a.D();
      a.p var2 = (a.p)F.get(var0.getClass());
      if(var2 == null) {
         throw new IllegalArgumentException("Unknown loot item function " + var0);
      } else {
         return var2;
      }
   }

   static {
      T(new h.b());
      T(new s.i());
      T(new r.q());
      T(new j.n());
      T(new net.o.z());
      T(new l.r());
      T(new n.z());
      T(new g.c());
      T(new d.t());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   public static class j implements JsonDeserializer, JsonSerializer {
      public a q(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         a.D();
         JsonObject var5 = c.V(var1, "function");
         m_ var6 = new m_(c.X(var5, "function"));
         a.p var7 = v.K(var6);
         a var10000 = var7.z(var5, var3, (x[])c.n(var5, "conditions", new x[0], var3, x[].class));
         if(net.u.d.y() == null) {
            a.O(new String[5]);
         }

         return var10000;
      }

      public JsonElement G(a var1, Type var2, JsonSerializationContext var3) {
         a.D();
         a.p var5 = v.l(var1);
         JsonObject var6 = new JsonObject();
         var5.d(var6, var1, var3);
         var6.addProperty("function", var5.R().toString());
         if(var1.w() != null && var1.w().length > 0) {
            var6.add("conditions", var3.serialize(var1.w()));
         }

         return var6;
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }
   }
}
