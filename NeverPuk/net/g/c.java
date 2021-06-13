package net.g;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import net.xn;
import net.g.x;
import net.nc.b;
import net.ne.l;
import net.y7.r;
import net.yz.m_;

public class c implements x {
   private final Map a;
   private final r.h s;

   public c(Map var1, r.h var2) {
      this.a = var1;
      this.s = var2;
   }

   public boolean y(Random var1, r var2) {
      x.s.U();
      l var4 = var2.u(this.s);
      if(var4 == null) {
         return false;
      } else {
         b var5 = var4.hl.J();
         Iterator var6 = this.a.entrySet().iterator();
         if(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            if(!this.C(var4, var5, (String)var7.getKey(), (net.y7.b)var7.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean C(l var1, b var2, String var3, net.y7.b var4) {
      net.nc.l var5 = var2.e(var3);
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class m extends x.s {
      protected m() {
         super(new m_("entity_scores"), c.class);
      }

      public void F(JsonObject var1, c var2, JsonSerializationContext var3) {
         x.s.U();
         JsonObject var5 = new JsonObject();
         Iterator var6 = var2.a.entrySet().iterator();
         if(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            var5.add((String)var7.getKey(), var3.serialize(var7.getValue()));
         }

         var1.add("scores", var5);
         var1.add("entity", var3.serialize(var2.s));
      }

      public c p(JsonObject var1, JsonDeserializationContext var2) {
         x.s.U();
         Set var4 = net.yz.c.b(var1, "scores").entrySet();
         LinkedHashMap var5 = Maps.newLinkedHashMap();
         Iterator var6 = var4.iterator();
         if(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            var5.put(var7.getKey(), net.yz.c.Q((JsonElement)var7.getValue(), "score", var2, net.y7.b.class));
         }

         return new c(var5, (r.h)net.yz.c.m(var1, "entity", var2, r.h.class));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
