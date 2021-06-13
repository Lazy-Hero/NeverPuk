package net.n;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.xn;
import net.n.a;
import net.n.y;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class r {
   protected static final Logger H = LogManager.getLogger();
   protected final Gson d;
   private final File T;
   private final Map A = Maps.newHashMap();
   private boolean b = true;
   private static final ParameterizedType y = new ParameterizedType() {
      public Type[] getActualTypeArguments() {
         return new Type[]{a.class};
      }

      public Type getRawType() {
         return List.class;
      }

      public Type getOwnerType() {
         return null;
      }
   };

   public r(File var1) {
      this.T = var1;
      GsonBuilder var2 = (new GsonBuilder()).setPrettyPrinting();
      var2.registerTypeHierarchyAdapter(a.class, new r.w());
      this.d = var2.create();
   }

   public boolean v() {
      return this.b;
   }

   public void A(boolean var1) {
      this.b = var1;
   }

   public void a(a var1) {
      this.A.put(this.s(var1.u()), var1);
      this.V();
   }

   public a g(Object var1) {
      this.q();
      return (a)this.A.get(this.s(var1));
   }

   public void U(Object var1) {
      this.A.remove(this.s(var1));
      this.V();
   }

   public String[] g() {
      return (String[])this.A.keySet().toArray(new String[this.A.size()]);
   }

   protected String s(Object var1) {
      return var1.toString();
   }

   protected boolean d(Object var1) {
      return this.A.containsKey(this.s(var1));
   }

   private void q() {
      y.c();
      ArrayList var2 = Lists.newArrayList();
      Iterator var3 = this.A.values().iterator();
      if(var3.hasNext()) {
         a var4 = (a)var3.next();
         if(var4.v()) {
            var2.add(var4.u());
         }
      }

      var3 = var2.iterator();
      if(var3.hasNext()) {
         Object var6 = var3.next();
         this.A.remove(var6);
      }

   }

   protected a x(JsonObject var1) {
      return new a((Object)null, var1);
   }

   protected Map q() {
      return this.A;
   }

   public void V() throws IOException {
      Collection var1 = this.A.values();
      String var2 = this.d.toJson(var1);
      BufferedWriter var3 = null;
      var3 = Files.newWriter(this.T, StandardCharsets.UTF_8);
      var3.write(var2);
      IOUtils.closeQuietly(var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   class w implements JsonDeserializer, JsonSerializer {
      private w() {
      }

      public JsonElement a(a var1, Type var2, JsonSerializationContext var3) {
         JsonObject var4 = new JsonObject();
         var1.H(var4);
         return var4;
      }

      public a h(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         int[] var4 = y.c();
         if(var1.isJsonObject()) {
            JsonObject var5 = var1.getAsJsonObject();
            return r.this.x(var5);
         } else {
            return null;
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
