package net.y5;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.u.d;
import net.y5.c;
import net.y5.h;
import net.y5.s;
import net.y5.u;
import net.ym.w;
import net.yw.q;

public class y {
   private final c E;
   private final w D;
   private static String[] e;

   public y(c var1, w var2) {
      throw new IllegalArgumentException("Missing condition for selector");
   }

   public w L() {
      return this.D;
   }

   public Predicate b(q var1) {
      return this.E.Y(var1);
   }

   public boolean equals(Object var1) {
      String[] var2 = S();
      if(this == var1) {
         return true;
      } else {
         if(var1 instanceof y) {
            y var3 = (y)var1;
            if(this.E.equals(var3.E)) {
               return this.D.equals(var3.D);
            }
         }

         return false;
      }
   }

   public int hashCode() {
      return 31 * this.E.hashCode() + this.D.hashCode();
   }

   public static void f(String[] var0) {
      e = var0;
   }

   public static String[] S() {
      return e;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      f(new String[1]);
   }

   public static class o implements JsonDeserializer {
      private static final Function z = new Function() {
         @Nullable
         public c I(@Nullable JsonElement var1) {
            String[] var2 = y.e;
            return var1 == null?null:y.o.a(var1.getAsJsonObject());
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      private static final Function t = new Function() {
         @Nullable
         public c A(@Nullable Entry var1) {
            String[] var2 = y.e;
            return var1 == null?null:y.o.v(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      };

      public y T(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         return new y(this.z(var4), (w)var3.deserialize(var4.get("apply"), w.class));
      }

      private c z(JsonObject var1) {
         return var1.has("when")?a(net.yz.c.b(var1, "when")):c.y;
      }

      @VisibleForTesting
      static c a(JsonObject var0) {
         y.e;
         Set var2 = var0.entrySet();
         if(var2.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
         } else if(var2.size() == 1) {
            return (c)(var0.has("OR")?new s(Iterables.transform(net.yz.c.P(var0, "OR"), z)):(var0.has("AND")?new h(Iterables.transform(net.yz.c.P(var0, "AND"), z)):v((Entry)var2.iterator().next())));
         } else {
            h var10000 = new h(Iterables.transform(var2, t));
            if(d.y() == null) {
               y.e = new String[4];
            }

            return var10000;
         }
      }

      private static u v(Entry var0) {
         return new u((String)var0.getKey(), ((JsonElement)var0.getValue()).getAsString());
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
