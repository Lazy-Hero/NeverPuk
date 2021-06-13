package net.n2;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;
import net.n2.h;

public class s {
   private net.cb.t w;
   private s.a R;
   private s.l s;
   private String a;

   public net.cb.t G() {
      return this.w;
   }

   public void x(net.cb.t var1) {
      this.w = var1;
   }

   public s.a m() {
      return this.R;
   }

   public void K(s.a var1) {
      this.R = var1;
   }

   public s.l Z() {
      return this.s;
   }

   public void C(s.l var1) {
      this.s = var1;
   }

   public void g(String var1) {
      this.a = var1;
   }

   public String q() {
      return this.a;
   }

   public static class a {
      private final int P;
      private final int y;
      private GameProfile[] b;

      public a(int var1, int var2) {
         this.P = var1;
         this.y = var2;
      }

      public int I() {
         return this.P;
      }

      public int t() {
         return this.y;
      }

      public GameProfile[] u() {
         return this.b;
      }

      public void F(GameProfile[] var1) {
         this.b = var1;
      }

      public static class c implements JsonDeserializer, JsonSerializer {
         public s.a z(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
            h.w();
            JsonObject var5 = net.yz.c.V(var1, "players");
            s.a var6 = new s.a(net.yz.c.o(var5, "max"), net.yz.c.o(var5, "online"));
            if(net.yz.c.D(var5, "sample")) {
               JsonArray var7 = net.yz.c.P(var5, "sample");
               if(var7.size() > 0) {
                  GameProfile[] var8 = new GameProfile[var7.size()];
                  int var9 = 0;
                  if(var9 < var8.length) {
                     JsonObject var10 = net.yz.c.V(var7.get(var9), "player[" + var9 + "]");
                     String var11 = net.yz.c.X(var10, "id");
                     var8[var9] = new GameProfile(UUID.fromString(var11), net.yz.c.X(var10, "name"));
                     ++var9;
                  }

                  var6.F(var8);
               }
            }

            return var6;
         }

         public JsonElement F(s.a var1, Type var2, JsonSerializationContext var3) {
            JsonObject var4 = new JsonObject();
            var4.addProperty("max", Integer.valueOf(var1.I()));
            var4.addProperty("online", Integer.valueOf(var1.t()));
            if(var1.u() != null && var1.u().length > 0) {
               JsonArray var5 = new JsonArray();

               for(int var6 = 0; var6 < var1.u().length; ++var6) {
                  JsonObject var7 = new JsonObject();
                  UUID var8 = var1.u()[var6].getId();
                  var7.addProperty("id", "");
                  var7.addProperty("name", var1.u()[var6].getName());
                  var5.add(var7);
               }

               var4.add("sample", var5);
            }

            return var4;
         }

         private static JsonParseException a(JsonParseException var0) {
            return var0;
         }
      }
   }

   public static class f implements JsonDeserializer, JsonSerializer {
      public s c(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var5 = net.yz.c.V(var1, "status");
         h.X();
         s var6 = new s();
         if(var5.has("description")) {
            var6.x((net.cb.t)var3.deserialize(var5.get("description"), net.cb.t.class));
         }

         if(var5.has("players")) {
            var6.K((s.a)var3.deserialize(var5.get("players"), s.a.class));
         }

         if(var5.has("version")) {
            var6.C((s.l)var3.deserialize(var5.get("version"), s.l.class));
         }

         if(var5.has("favicon")) {
            var6.g(net.yz.c.X(var5, "favicon"));
         }

         return var6;
      }

      public JsonElement c(s var1, Type var2, JsonSerializationContext var3) {
         JsonObject var4 = new JsonObject();
         if(var1.G() != null) {
            var4.add("description", var3.serialize(var1.G()));
         }

         if(var1.m() != null) {
            var4.add("players", var3.serialize(var1.m()));
         }

         if(var1.Z() != null) {
            var4.add("version", var3.serialize(var1.Z()));
         }

         if(var1.q() != null) {
            var4.addProperty("favicon", var1.q());
         }

         return var4;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }

   public static class l {
      private final String L;
      private final int m;

      public l(String var1, int var2) {
         this.L = var1;
         this.m = var2;
      }

      public String e() {
         return this.L;
      }

      public int M() {
         return this.m;
      }

      public static class u implements JsonDeserializer, JsonSerializer {
         public s.l d(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
            JsonObject var4 = net.yz.c.V(var1, "version");
            return new s.l(net.yz.c.X(var4, "name"), net.yz.c.o(var4, "protocol"));
         }

         public JsonElement I(s.l var1, Type var2, JsonSerializationContext var3) {
            JsonObject var4 = new JsonObject();
            var4.addProperty("name", var1.e());
            var4.addProperty("protocol", Integer.valueOf(var1.M()));
            return var4;
         }
      }
   }
}
