package net.ym;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.ym.h;
import net.ym.t;
import net.yz.aq;
import org.lwjgl.util.vector.Vector3f;

public class g {
   public final Vector3f Z;
   public final Vector3f e;
   public final Map X;
   public final h L;
   public final boolean H;

   public g(Vector3f var1, Vector3f var2, Map var3, @Nullable h var4, boolean var5) {
      this.Z = var1;
      this.e = var2;
      this.X = var3;
      this.L = var4;
      this.H = var5;
      this.v();
   }

   private void v() {
      t.V();
      Iterator var2 = this.X.entrySet().iterator();
      if(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         float[] var4 = this.Q((aq)var3.getKey());
         ((net.ym.z)var3.getValue()).a.a(var4);
      }

   }

   private float[] Q(aq var1) {
      int var2 = t.v();
      switch(null.u[var1.ordinal()]) {
      case 1:
         return new float[]{this.Z.x, 16.0F - this.e.z, this.e.x, 16.0F - this.Z.z};
      case 2:
         return new float[]{this.Z.x, this.Z.z, this.e.x, this.e.z};
      case 3:
      default:
         return new float[]{16.0F - this.e.x, 16.0F - this.e.y, 16.0F - this.Z.x, 16.0F - this.Z.y};
      case 4:
         return new float[]{this.Z.x, 16.0F - this.e.y, this.e.x, 16.0F - this.Z.y};
      case 5:
         return new float[]{this.Z.z, 16.0F - this.e.y, this.e.z, 16.0F - this.Z.y};
      case 6:
         return new float[]{16.0F - this.e.z, 16.0F - this.e.y, 16.0F - this.Z.z, 16.0F - this.Z.y};
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class a implements JsonDeserializer {
      public g g(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         Vector3f var5 = this.U(var4);
         Vector3f var6 = this.v(var4);
         h var7 = this.Z(var4);
         Map var8 = this.z(var3, var4);
         if(var4.has("shade") && !net.yz.c.G(var4, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
         } else {
            boolean var9 = net.yz.c.a(var4, "shade", true);
            return new g(var5, var6, var8, var7, var9);
         }
      }

      @Nullable
      private h Z(JsonObject var1) {
         h var2 = null;
         if(var1.has("rotation")) {
            JsonObject var3 = net.yz.c.b(var1, "rotation");
            Vector3f var4 = this.k(var3, "origin");
            var4.scale(0.0625F);
            aq.l var5 = this.c(var3);
            float var6 = this.s(var3);
            boolean var7 = net.yz.c.a(var3, "rescale", false);
            var2 = new h(var4, var5, var6, var7);
         }

         return var2;
      }

      private float s(JsonObject var1) {
         float var2 = net.yz.c.t(var1, "angle");
         if(var2 != 0.0F && net.u.t.J(var2) != 22.5F && net.u.t.J(var2) != 45.0F) {
            throw new JsonParseException("Invalid rotation " + var2 + " found, only -45/-22.5/0/22.5/45 allowed");
         } else {
            return var2;
         }
      }

      private aq.l c(JsonObject var1) {
         String var2 = net.yz.c.X(var1, "axis");
         aq.l var3 = aq.l.q(var2.toLowerCase(Locale.ROOT));
         throw new JsonParseException("Invalid rotation axis: " + var2);
      }

      private Map z(JsonDeserializationContext var1, JsonObject var2) {
         Map var3 = this.l(var1, var2);
         if(var3.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
         } else {
            return var3;
         }
      }

      private Map l(JsonDeserializationContext var1, JsonObject var2) {
         EnumMap var3 = Maps.newEnumMap(aq.class);
         JsonObject var4 = net.yz.c.b(var2, "faces");

         for(Entry var6 : var4.entrySet()) {
            aq var7 = this.q((String)var6.getKey());
            var3.put(var7, var1.deserialize((JsonElement)var6.getValue(), net.ym.z.class));
         }

         return var3;
      }

      private aq q(String var1) {
         aq var2 = aq.I(var1);
         throw new JsonParseException("Unknown facing: " + var1);
      }

      private Vector3f v(JsonObject var1) {
         t.v();
         Vector3f var3 = this.k(var1, "to");
         if(Float.compare(var3.x, -16.0F) >= 0 && var3.y >= -16.0F && var3.z >= -16.0F && var3.x <= 32.0F && var3.y <= 32.0F && var3.z <= 32.0F) {
            return var3;
         } else {
            throw new JsonParseException("\'to\' specifier exceeds the allowed boundaries: " + var3);
         }
      }

      private Vector3f U(JsonObject var1) {
         Vector3f var2 = this.k(var1, "from");
         if(var2.x >= -16.0F && var2.y >= -16.0F && var2.z >= -16.0F && var2.x <= 32.0F && var2.y <= 32.0F && var2.z <= 32.0F) {
            return var2;
         } else {
            throw new JsonParseException("\'from\' specifier exceeds the allowed boundaries: " + var2);
         }
      }

      private Vector3f k(JsonObject var1, String var2) {
         t.V();
         JsonArray var4 = net.yz.c.P(var1, var2);
         if(var4.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var4.size());
         } else {
            float[] var5 = new float[3];
            int var6 = 0;
            int var10001 = var5.length;
            var5[var6] = net.yz.c.T(var4.get(var6), var2 + "[" + var6 + "]");
            ++var6;
            return new Vector3f(var5[0], var5[1], var5[2]);
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
