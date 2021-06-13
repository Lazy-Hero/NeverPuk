package net.ym;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.ky;
import net.ym.t;
import net.yz.m_;

public class e {
   private final m_ Z;
   private final Map j;

   public e(m_ var1, Map var2) {
      this.Z = var1;
      this.j = var2;
   }

   public m_ E() {
      return this.Z;
   }

   boolean s(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
      t.V();
      net.n0.y var5 = var1.Z();
      Iterator var6 = this.j.entrySet().iterator();
      if(var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         ky var8 = var5.x((m_)var7.getKey());
         if(var8 == null || Float.compare(var8.k(var1, var2, var3), ((Float)var7.getValue()).floatValue()) < 0) {
            return false;
         }
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class t implements JsonDeserializer {
      public e x(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         m_ var5 = new m_(net.yz.c.X(var4, "model"));
         Map var6 = this.j(var4);
         return new e(var5, var6);
      }

      protected Map j(JsonObject var1) {
         t.v();
         LinkedHashMap var3 = Maps.newLinkedHashMap();
         JsonObject var4 = net.yz.c.b(var1, "predicate");
         Iterator var5 = var4.entrySet().iterator();
         if(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            var3.put(new m_((String)var6.getKey()), Float.valueOf(net.yz.c.T((JsonElement)var6.getValue(), (String)var6.getKey())));
         }

         return var3;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
