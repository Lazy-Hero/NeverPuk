package net.y7;

import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import net.xn;
import net.g.s;
import net.u.d;
import net.y7.b;
import net.y7.o;
import net.y7.p;
import net.y7.r;
import org.apache.commons.lang3.ArrayUtils;

public class a {
   private final o[] y;
   private final net.g.x[] q;
   private final b I;
   private final b F;

   public a(o[] var1, net.g.x[] var2, b var3, b var4) {
      this.y = var1;
      this.q = var2;
      this.I = var3;
      this.F = var4;
   }

   protected void v(Collection var1, Random var2, r var3) {
      p.h();
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;
      o[] var7 = this.y;
      int var8 = var7.length;
      int var9 = 0;
      if(var9 < var8) {
         o var10 = var7[var9];
         if(s.p(var10.l, var2, var3)) {
            int var11 = var10.l(var3.O());
            var5.add(var10);
            var6 = var6 + var11;
         }

         ++var9;
      }

   }

   public void G(Collection var1, Random var2, r var3) {
      if(s.p(this.q, var2, var3)) {
         int var4 = this.I.O(var2) + net.u.t.M(this.F.c(var2) * var3.O());

         for(int var5 = 0; var5 < var4; ++var5) {
            this.v(var1, var2, var3);
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class o implements JsonDeserializer, JsonSerializer {
      public a c(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var5 = net.yz.c.V(var1, "loot pool");
         p.h();
         o[] var6 = (o[])net.yz.c.m(var5, "entries", var3, o[].class);
         net.g.x[] var7 = (net.g.x[])net.yz.c.n(var5, "conditions", new net.g.x[0], var3, net.g.x[].class);
         b var8 = (b)net.yz.c.m(var5, "rolls", var3, b.class);
         b var9 = (b)net.yz.c.n(var5, "bonus_rolls", new b(0.0F, 0.0F), var3, b.class);
         a var10000 = new a(var6, var7, var8, var9);
         d.h(new d[4]);
         return var10000;
      }

      public JsonElement a(a var1, Type var2, JsonSerializationContext var3) {
         JsonObject var5 = new JsonObject();
         var5.add("entries", var3.serialize(var1.y));
         p.h();
         var5.add("rolls", var3.serialize(var1.I));
         if(Float.compare(var1.F.t(), 0.0F) != 0 && Float.compare(var1.F.N(), 0.0F) != 0) {
            var5.add("bonus_rolls", var3.serialize(var1.F));
         }

         if(!ArrayUtils.isEmpty(var1.q)) {
            var5.add("conditions", var3.serialize(var1.q));
         }

         return var5;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
