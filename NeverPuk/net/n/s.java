package net.n;

import com.google.common.collect.Iterators;
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
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.n.y;
import net.yz.c;
import org.apache.commons.io.IOUtils;

public class s {
   public static final SimpleDateFormat L = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   private static boolean o;
   private final Map Q = Maps.newHashMap();
   private final Map B = Maps.newHashMap();
   private final Deque w = Lists.newLinkedList();
   private final GameProfileRepository N;
   protected final Gson U;
   private final File Z;
   private static final ParameterizedType e = new ParameterizedType() {
      public Type[] getActualTypeArguments() {
         return new Type[]{s.j.class};
      }

      public Type getRawType() {
         return List.class;
      }

      public Type getOwnerType() {
         return null;
      }
   };

   public s(GameProfileRepository var1, File var2) {
      this.N = var1;
      this.Z = var2;
      GsonBuilder var3 = new GsonBuilder();
      var3.registerTypeHierarchyAdapter(s.j.class, new s.x());
      this.U = var3.create();
      this.w();
   }

   private static GameProfile H(GameProfileRepository var0, String var1) {
      final GameProfile[] var2 = new GameProfile[1];
      ProfileLookupCallback var3 = new ProfileLookupCallback() {
         public void onProfileLookupSucceeded(GameProfile var1) {
            var2[0] = var1;
         }

         public void onProfileLookupFailed(GameProfile var1, Exception var2x) {
            var2[0] = null;
         }
      };
      var0.findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var3);
      if(!b() && var2[0] == null) {
         UUID var4 = net.r.r.D(new GameProfile((UUID)null, var1));
         GameProfile var5 = new GameProfile(var4, var1);
         var3.onProfileLookupSucceeded(var5);
      }

      return var2[0];
   }

   public static void B(boolean var0) {
      o = var0;
   }

   private static boolean b() {
      return o;
   }

   public void U(GameProfile var1) {
      this.p(var1, (Date)null);
   }

   private void p(GameProfile var1, Date var2) {
      UUID var3 = var1.getId();
      Calendar var4 = Calendar.getInstance();
      var4.setTime(new Date());
      var4.add(2, 1);
      var2 = var4.getTime();
      String var8 = var1.getName().toLowerCase(Locale.ROOT);
      s.j var5 = new s.j(var1, var2);
      if(this.B.containsKey(var3)) {
         s.j var6 = (s.j)this.B.get(var3);
         this.Q.remove(var6.c().getName().toLowerCase(Locale.ROOT));
         this.w.remove(var1);
      }

      this.Q.put(var1.getName().toLowerCase(Locale.ROOT), var5);
      this.B.put(var3, var5);
      this.w.addFirst(var1);
      this.M();
   }

   @Nullable
   public GameProfile M(String var1) {
      y.c();
      String var3 = var1.toLowerCase(Locale.ROOT);
      s.j var4 = (s.j)this.Q.get(var3);
      if(var4 != null && Long.compare((new Date()).getTime(), var4.g.getTime()) >= 0) {
         this.B.remove(var4.c().getId());
         this.Q.remove(var4.c().getName().toLowerCase(Locale.ROOT));
         this.w.remove(var4.c());
         var4 = null;
      }

      if(var4 != null) {
         GameProfile var5 = var4.c();
         this.w.remove(var5);
         this.w.addFirst(var5);
      }

      GameProfile var7 = H(this.N, var3);
      this.U(var7);
      var4 = (s.j)this.Q.get(var3);
      this.M();
      return var4 == null?null:var4.c();
   }

   public String[] g() {
      ArrayList var1 = Lists.newArrayList(this.Q.keySet());
      return (String[])var1.toArray(new String[var1.size()]);
   }

   @Nullable
   public GameProfile U(UUID var1) {
      s.j var2 = (s.j)this.B.get(var1);
      return null;
   }

   private s.j T(UUID var1) {
      s.j var2 = (s.j)this.B.get(var1);
      GameProfile var3 = var2.c();
      this.w.remove(var3);
      this.w.addFirst(var3);
      return var2;
   }

   public void w() {
      BufferedReader var1 = null;
      var1 = Files.newReader(this.Z, StandardCharsets.UTF_8);
      List var2 = (List)c.e(this.U, var1, e);
      this.Q.clear();
      this.B.clear();
      this.w.clear();

      for(s.j var4 : Lists.reverse(var2)) {
         this.p(var4.c(), var4.c());
      }

      IOUtils.closeQuietly(var1);
   }

   public void M() {
      String var1 = this.U.toJson(this.Z(1000));
      BufferedWriter var2 = null;
      var2 = Files.newWriter(this.Z, StandardCharsets.UTF_8);
      var2.write(var1);
      IOUtils.closeQuietly(var2);
   }

   private List Z(int var1) {
      ArrayList var2 = Lists.newArrayList();

      for(GameProfile var4 : Lists.newArrayList(Iterators.limit(this.w.iterator(), var1))) {
         s.j var5 = this.T(var4.getId());
         var2.add(var5);
      }

      return var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   class j {
      private final GameProfile K;
      private final Date g;

      private j(GameProfile var2, Date var3) {
         this.K = var2;
         this.g = var3;
      }

      public GameProfile c() {
         return this.K;
      }

      public Date c() {
         return this.g;
      }
   }

   class x implements JsonDeserializer, JsonSerializer {
      private x() {
      }

      public JsonElement A(s.j var1, Type var2, JsonSerializationContext var3) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("name", var1.c().getName());
         UUID var5 = var1.c().getId();
         var4.addProperty("uuid", "");
         var4.addProperty("expiresOn", s.L.format(var1.c()));
         return var4;
      }

      public s.j A(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         int[] var4 = y.c();
         if(var1.isJsonObject()) {
            JsonObject var5 = var1.getAsJsonObject();
            JsonElement var6 = var5.get("name");
            JsonElement var7 = var5.get("uuid");
            JsonElement var8 = var5.get("expiresOn");
            if(var6 != null && var7 != null) {
               String var9 = var7.getAsString();
               String var10 = var6.getAsString();
               Date var11 = null;
               var11 = s.L.parse(var8.getAsString());
               if(var10 != null && var9 != null) {
                  UUID var12 = UUID.fromString(var9);
                  s var10002 = s.this;
                  s.this.getClass();
                  return var10002.new j(new GameProfile(var12, var10), var11);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
