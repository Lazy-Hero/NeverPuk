package net.np;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;
import net.yz.a7;

public class g implements net.c0.x {
   public static final Gson A = (new GsonBuilder()).registerTypeAdapter(net.cb.t.class, new JsonDeserializer() {
      public net.cb.t G(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         String var4 = g.d;
         if(var1.isJsonPrimitive()) {
            return new net.cb.l(var1.getAsString());
         } else if(var1.isJsonArray()) {
            JsonArray var5 = var1.getAsJsonArray();
            net.cb.t var6 = null;
            Iterator var7 = var5.iterator();
            if(var7.hasNext()) {
               JsonElement var8 = (JsonElement)var7.next();
               net.cb.t var9 = this.G(var8, var8.getClass(), var3);
               if(var6 == null) {
                  var6 = var9;
               }

               var6.h(var9);
            }

            return var6;
         } else {
            throw new JsonParseException("Don\'t know how to turn " + var1 + " into a Component");
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }).create();
   private static String d;

   public int X() {
      return 101;
   }

   public net.nj.f r(net.nj.f var1) {
      if("Sign".equals(var1.J("id"))) {
         this.h(var1, "Text1");
         this.h(var1, "Text2");
         this.h(var1, "Text3");
         this.h(var1, "Text4");
      }

      return var1;
   }

   private void h(net.nj.f var1, String var2) {
      D();
      String var4 = var1.J(var2);
      net.cb.t var5 = null;
      if(!"null".equals(var4) && !a7.Y(var4)) {
         if(var4.charAt(0) == 34 && var4.charAt(var4.length() - 1) == 34 || var4.charAt(0) == 123 && var4.charAt(var4.length() - 1) == 125) {
            var5 = (net.cb.t)net.yz.c.L(A, var4, net.cb.t.class, true);
            var5 = new net.cb.l("");
            if(var5 == null) {
               var5 = net.cb.t.m(var4);
            }

            if(var5 == null) {
               var5 = net.cb.t.h(var4);
            }

            if(var5 == null) {
               var5 = new net.cb.l(var4);
            }
         } else {
            var5 = new net.cb.l(var4);
         }
      } else {
         var5 = new net.cb.l("");
      }

      var1.b(var2, net.cb.t.m((net.cb.t)var5));
   }

   static {
      y("ftn9R");
   }

   public static void y(String var0) {
      d = var0;
   }

   public static String D() {
      return d;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
