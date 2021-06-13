package net.y5;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.xn;
import net.y5.y;
import net.yw.q;

public class n {
   private final List f;
   private q p;

   public n(List var1) {
      this.f = var1;
   }

   public List P() {
      return this.f;
   }

   public Set K() {
      HashSet var1 = Sets.newHashSet();

      for(y var3 : this.f) {
         var1.add(var3.L());
      }

      return var1;
   }

   public void i(q var1) {
      this.p = var1;
   }

   public q k() {
      return this.p;
   }

   public boolean equals(Object var1) {
      String[] var2 = y.S();
      if(this == var1) {
         return true;
      } else {
         if(var1 instanceof n) {
            n var3 = (n)var1;
            if(this.f.equals(var3.f)) {
               if(this.p == null) {
                  return var3.p == null;
               }

               return this.p.equals(var3.p);
            }
         }

         return false;
      }
   }

   public int hashCode() {
      return 31 * this.f.hashCode() + (this.p == null?0:this.p.hashCode());
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class j implements JsonDeserializer {
      public n q(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         return new n(this.H(var3, var1.getAsJsonArray()));
      }

      private List H(JsonDeserializationContext var1, JsonArray var2) {
         ArrayList var4 = Lists.newArrayList();
         y.S();
         Iterator var5 = var2.iterator();
         if(var5.hasNext()) {
            JsonElement var6 = (JsonElement)var5.next();
            var4.add(var1.deserialize(var6, y.class));
         }

         return var4;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
