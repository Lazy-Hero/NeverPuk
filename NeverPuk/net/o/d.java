package net.o;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.g.x;
import net.n0.ks;
import net.nl.z2;
import net.o.a;
import net.y7.b;
import net.yz.c;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d extends a {
   private static final Logger i = LogManager.getLogger();
   private final d.k[] T;

   public d(x[] var1, d.k[] var2) {
      super(var1);
      this.T = var2;
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      d.k[] var5 = this.T;
      a.D();
      int var6 = var5.length;
      int var7 = 0;
      if(var7 < var6) {
         d.k var8 = var5[var7];
         UUID var9 = var8.s;
         if(var9 == null) {
            var9 = UUID.randomUUID();
         }

         z2 var10 = var8.l[var2.nextInt(var8.l.length)];
         var1.Z(var8.r, new net.s.k(var9, var8.j, (double)var8.R.c(var2), var8.V), var10);
         ++var7;
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class k {
      private final String j;
      private final String r;
      private final int V;
      private final b R;
      @Nullable
      private final UUID s;
      private final z2[] l;

      private k(String var1, String var2, int var3, b var4, z2[] var5, @Nullable UUID var6) {
         this.j = var1;
         this.r = var2;
         this.V = var3;
         this.R = var4;
         this.s = var6;
         this.l = var5;
      }

      public JsonObject q(JsonSerializationContext var1) {
         JsonObject var2 = new JsonObject();
         var2.addProperty("name", this.j);
         var2.addProperty("attribute", this.r);
         var2.addProperty("operation", b(this.V));
         var2.add("amount", var1.serialize(this.R));
         if(this.s != null) {
            var2.addProperty("id", this.s.toString());
         }

         if(this.l.length == 1) {
            var2.addProperty("slot", this.l[0].H());
         } else {
            JsonArray var3 = new JsonArray();

            for(z2 var7 : this.l) {
               var3.add(new JsonPrimitive(var7.H()));
            }

            var2.add("slot", var3);
         }

         return var2;
      }

      public static d.k F(JsonObject var0, JsonDeserializationContext var1) {
         String var3 = c.X(var0, "name");
         a.D();
         String var4 = c.X(var0, "attribute");
         int var5 = T(c.X(var0, "operation"));
         b var6 = (b)c.m(var0, "amount", var1, b.class);
         UUID var7 = null;
         if(c.C(var0, "slot")) {
            z2[] var10000 = new z2[]{z2.T(c.X(var0, "slot"))};
            net.u.d.h(new net.u.d[3]);
         }

         if(!c.D(var0, "slot")) {
            throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
         } else {
            JsonArray var9 = c.P(var0, "slot");
            z2[] var8 = new z2[var9.size()];
            int var10 = 0;
            Iterator var11 = var9.iterator();
            if(var11.hasNext()) {
               JsonElement var12 = (JsonElement)var11.next();
               var8[var10++] = z2.T(c.m(var12, "slot"));
            }

            if(var8.length == 0) {
               throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            } else {
               if(var0.has("id")) {
                  String var13 = c.X(var0, "id");
                  var7 = UUID.fromString(var13);
               }

               return new d.k(var3, var4, var5, var6, var8, var7);
            }
         }
      }

      private static String b(int var0) {
         switch(var0) {
         case 0:
            return "addition";
         case 1:
            return "multiply_base";
         case 2:
            return "multiply_total";
         default:
            throw new IllegalArgumentException("Unknown operation " + var0);
         }
      }

      private static int T(String var0) {
         if("addition".equals(var0)) {
            return 0;
         } else if("multiply_base".equals(var0)) {
            return 1;
         } else if("multiply_total".equals(var0)) {
            return 2;
         } else {
            throw new JsonSyntaxException("Unknown attribute modifier operation " + var0);
         }
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }

   public static class t extends a.p {
      public t() {
         super(new m_("set_attributes"), d.class);
      }

      public void g(JsonObject var1, d var2, JsonSerializationContext var3) {
         a.D();
         JsonArray var5 = new JsonArray();
         d.k[] var6 = var2.T;
         int var7 = var6.length;
         int var8 = 0;
         if(var8 < var7) {
            d.k var9 = var6[var8];
            var5.add(var9.q(var3));
            ++var8;
         }

         var1.add("modifiers", var5);
      }

      public d o(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         a.D();
         JsonArray var5 = c.P(var1, "modifiers");
         d.k[] var6 = new d.k[var5.size()];
         int var7 = 0;
         Iterator var8 = var5.iterator();
         if(var8.hasNext()) {
            JsonElement var9 = (JsonElement)var8.next();
            var6[var7++] = d.k.F(c.V(var9, "modifier"), var2);
         }

         if(var6.length == 0) {
            throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
         } else {
            return new d(var3, var6);
         }
      }

      private static JsonSyntaxException a(JsonSyntaxException var0) {
         return var0;
      }
   }
}
