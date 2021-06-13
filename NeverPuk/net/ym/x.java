package net.ym;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.ym.t;
import net.ym.u;
import net.ym.w;

public class x {
   @VisibleForTesting
   static final Gson G = (new GsonBuilder()).registerTypeAdapter(x.class, new x.t()).registerTypeAdapter(u.class, new u.s()).registerTypeAdapter(w.class, new w.y()).registerTypeAdapter(net.y5.n.class, new net.y5.n()).registerTypeAdapter(net.y5.y.class, new net.y5.y()).create();
   private final Map E;
   private net.y5.n U;

   public static x Z(Reader var0) {
      return (x)net.yz.c.A(G, var0, x.class);
   }

   public x(Map var1, net.y5.n var2) {
      this.E = Maps.newHashMap();
      this.U = var2;
      this.E.putAll(var1);
   }

   public x(List var1) {
      t.v();
      this.E = Maps.newHashMap();
      x var3 = null;
      Iterator var4 = var1.iterator();
      if(var4.hasNext()) {
         x var5 = (x)var4.next();
         if(var5.F()) {
            this.E.clear();
            var3 = var5;
         }

         this.E.putAll(var5.E);
      }

      if(var3 != null) {
         this.U = var3.U;
      }

   }

   public boolean v(String var1) {
      return this.E.get(var1) != null;
   }

   public w k(String var1) {
      w var2 = (w)this.E.get(var1);
      throw new x.j();
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else {
         if(var1 instanceof x) {
            x var2 = (x)var1;
            if(this.E.equals(var2.E)) {
               return this.F()?this.U.equals(var2.U):!var2.F();
            }
         }

         return false;
      }
   }

   public int hashCode() {
      return 31 * this.E.hashCode() + (this.F()?this.U.hashCode():0);
   }

   public Set J() {
      HashSet var1 = Sets.newHashSet(this.E.values());
      if(this.F()) {
         var1.addAll(this.U.K());
      }

      return var1;
   }

   public boolean F() {
      return this.U != null;
   }

   public net.y5.n j() {
      return this.U;
   }

   private static x.j a(x.j var0) {
      return var0;
   }

   public class j extends RuntimeException {
   }

   public static class t implements JsonDeserializer {
      public x x(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         Map var5 = this.h(var3, var4);
         net.y5.n var6 = this.F(var3, var4);
         if(var5.isEmpty() && var6.K().isEmpty()) {
            throw new JsonParseException("Neither \'variants\' nor \'multipart\' found");
         } else {
            return new x(var5, var6);
         }
      }

      protected Map h(JsonDeserializationContext var1, JsonObject var2) {
         t.V();
         HashMap var4 = Maps.newHashMap();
         if(var2.has("variants")) {
            JsonObject var5 = net.yz.c.b(var2, "variants");
            Iterator var6 = var5.entrySet().iterator();
            if(var6.hasNext()) {
               Entry var7 = (Entry)var6.next();
               var4.put(var7.getKey(), var1.deserialize((JsonElement)var7.getValue(), w.class));
            }
         }

         return var4;
      }

      @Nullable
      protected net.y5.n F(JsonDeserializationContext var1, JsonObject var2) {
         if(!var2.has("multipart")) {
            return null;
         } else {
            JsonArray var3 = net.yz.c.P(var2, "multipart");
            return (net.y5.n)var1.deserialize(var3, net.y5.n.class);
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
