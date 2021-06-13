package net.ym;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.ym.c;
import net.ym.e;
import net.ym.g;
import net.ym.l;
import net.ym.q;
import net.ym.s;
import net.ym.t;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y {
   private static final Logger C = LogManager.getLogger();
   @VisibleForTesting
   static final Gson V = (new GsonBuilder()).registerTypeAdapter(y.class, new y.o()).registerTypeAdapter(g.class, new g.a()).registerTypeAdapter(net.ym.z.class, new net.ym.z()).registerTypeAdapter(q.class, new q.p()).registerTypeAdapter(c.class, new c.l()).registerTypeAdapter(s.class, new s.w()).registerTypeAdapter(e.class, new e.t()).create();
   private final List A;
   private final boolean O;
   private final boolean X;
   private final s e;
   private final List K;
   public String I = "";
   @VisibleForTesting
   protected final Map F;
   @VisibleForTesting
   protected y s;
   @VisibleForTesting
   protected m_ Q;

   public static y N(Reader var0) {
      return (y)net.yz.c.V(V, var0, y.class, false);
   }

   public static y z(String var0) {
      return N(new StringReader(var0));
   }

   public y(@Nullable m_ var1, List var2, Map var3, boolean var4, boolean var5, s var6, List var7) {
      this.A = var2;
      this.X = var4;
      this.O = var5;
      this.F = var3;
      this.Q = var1;
      this.e = var6;
      this.K = var7;
   }

   public List s() {
      return this.A.isEmpty() && this.q()?this.s.s():this.A;
   }

   private boolean q() {
      return this.s != null;
   }

   public boolean X() {
      return this.q()?this.s.X():this.X;
   }

   public boolean U() {
      return this.O;
   }

   public boolean t() {
      return this.Q == null || this.s != null && this.s.t();
   }

   public void A(Map var1) {
      if(this.Q != null) {
         this.s = (y)var1.get(this.Q);
      }

   }

   public Collection T() {
      HashSet var1 = Sets.newHashSet();

      for(e var3 : this.K) {
         var1.add(var3.E());
      }

      return var1;
   }

   protected List X() {
      return this.K;
   }

   public l p() {
      return this.K.isEmpty()?l.L:new l(this.K);
   }

   public boolean Y(String var1) {
      return !"missingno".equals(this.Y(var1));
   }

   public String Y(String var1) {
      if(!this.J(var1)) {
         var1 = '#' + var1;
      }

      return this.g(var1, new y.d(this));
   }

   private String g(String var1, y.d var2) {
      int var3 = t.v();
      if(this.J(var1)) {
         if(this == var2.e) {
            C.warn("Unable to resolve texture due to upward reference: {} in {}", var1, this.I);
            return "missingno";
         } else {
            String var4 = (String)this.F.get(var1.substring(1));
            if(var4 == null && this.q()) {
               var4 = this.s.g(var1, var2);
            }

            var2.e = this;
            if(var4 != null && this.J(var4)) {
               var4 = var2.c.g(var4, var2);
            }

            return var4 != null && !this.J(var4)?var4:"missingno";
         }
      } else {
         return var1;
      }
   }

   private boolean J(String var1) {
      return var1.charAt(0) == 35;
   }

   @Nullable
   public m_ V() {
      return this.Q;
   }

   public y c() {
      return this.q()?this.s.c():this;
   }

   public s H() {
      c var1 = this.G(s.r.THIRD_PERSON_LEFT_HAND);
      c var2 = this.G(s.r.THIRD_PERSON_RIGHT_HAND);
      c var3 = this.G(s.r.FIRST_PERSON_LEFT_HAND);
      c var4 = this.G(s.r.FIRST_PERSON_RIGHT_HAND);
      c var5 = this.G(s.r.HEAD);
      c var6 = this.G(s.r.GUI);
      c var7 = this.G(s.r.GROUND);
      c var8 = this.G(s.r.FIXED);
      return new s(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private c G(s.r var1) {
      return this.s != null && !this.e.E(var1)?this.s.G(var1):this.e.v(var1);
   }

   public static void n(Map var0) {
      Iterator var1 = var0.values().iterator();
      if(var1.hasNext()) {
         y var2 = (y)var1.next();
         y var3 = var2.s;

         for(y var4 = var3.s; var3 != var4; var4 = var4.s.s) {
            var3 = var3.s;
         }

         throw new y.h();
      }
   }

   private static y.h a(y.h var0) {
      return var0;
   }

   static final class d {
      public final y c;
      public y e;

      private d(y var1) {
         this.c = var1;
      }
   }

   public static class h extends RuntimeException {
   }

   public static class o implements JsonDeserializer {
      public y P(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         t.v();
         JsonObject var5 = var1.getAsJsonObject();
         List var6 = this.h(var3, var5);
         String var7 = this.R(var5);
         Map var8 = this.m(var5);
         boolean var9 = this.u(var5);
         s var10 = s.w;
         if(var5.has("display")) {
            JsonObject var11 = net.yz.c.b(var5, "display");
            var10 = (s)var3.deserialize(var11, s.class);
         }

         List var13 = this.s(var3, var5);
         m_ var12 = var7.isEmpty()?null:new m_(var7);
         return new y(var12, var6, var8, var9, true, var10, var13);
      }

      protected List s(JsonDeserializationContext var1, JsonObject var2) {
         ArrayList var3 = Lists.newArrayList();
         if(var2.has("overrides")) {
            for(JsonElement var5 : net.yz.c.P(var2, "overrides")) {
               var3.add(var1.deserialize(var5, e.class));
            }
         }

         return var3;
      }

      private Map m(JsonObject var1) {
         t.v();
         HashMap var3 = Maps.newHashMap();
         if(var1.has("textures")) {
            JsonObject var4 = var1.getAsJsonObject("textures");
            Iterator var5 = var4.entrySet().iterator();
            if(var5.hasNext()) {
               Entry var6 = (Entry)var5.next();
               var3.put(var6.getKey(), ((JsonElement)var6.getValue()).getAsString());
            }
         }

         return var3;
      }

      private String R(JsonObject var1) {
         return net.yz.c.x(var1, "parent", "");
      }

      protected boolean u(JsonObject var1) {
         return net.yz.c.a(var1, "ambientocclusion", true);
      }

      protected List h(JsonDeserializationContext var1, JsonObject var2) {
         ArrayList var3 = Lists.newArrayList();
         if(var2.has("elements")) {
            for(JsonElement var5 : net.yz.c.P(var2, "elements")) {
               var3.add(var1.deserialize(var5, g.class));
            }
         }

         return var3;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
