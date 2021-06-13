package net.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import net.xn;
import net.g.x;
import net.na.e;
import net.ne.l;
import net.u.d;
import net.y7.r;
import net.yz.m_;

public class q implements x {
   private final e[] q;
   private final r.h V;

   public q(e[] var1, r.h var2) {
      this.q = var1;
      this.V = var2;
   }

   public boolean y(Random var1, r var2) {
      x.s.U();
      l var4 = var2.u(this.V);
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c extends x.s {
      protected c() {
         super(new m_("entity_properties"), q.class);
      }

      public void A(JsonObject var1, q var2, JsonSerializationContext var3) {
         JsonObject var5 = new JsonObject();
         x.s.U();
         e[] var6 = var2.q;
         int var7 = var6.length;
         int var8 = 0;
         if(var8 < var7) {
            e var9 = var6[var8];
            e.w var10 = net.na.l.b(var9);
            var5.add(var10.I().toString(), var10.A(var9, var3));
            ++var8;
         }

         var1.add("properties", var5);
         var1.add("entity", var3.serialize(var2.V));
         if(d.y() == null) {
            x.s.y(new String[3]);
         }

      }

      public q v(JsonObject var1, JsonDeserializationContext var2) {
         Set var4 = net.yz.c.b(var1, "properties").entrySet();
         x.s.U();
         e[] var5 = new e[var4.size()];
         int var6 = 0;
         Iterator var7 = var4.iterator();
         if(var7.hasNext()) {
            Entry var8 = (Entry)var7.next();
            var5[var6++] = net.na.l.d(new m_((String)var8.getKey())).T((JsonElement)var8.getValue(), var2);
            d.h(new d[4]);
         }

         return new q(var5, (r.h)net.yz.c.m(var1, "entity", var2, r.h.class));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
