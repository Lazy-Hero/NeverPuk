package net.cr;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.cr.l;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;
import net.yz.m_;

public class j implements s {
   private final int C;
   private final int y;
   private final net.yz.w z;
   private final ks d;
   private final String K;
   private static int[] O;

   public j(String var1, int var2, int var3, net.yz.w var4, ks var5) {
      this.K = var1;
      this.C = var2;
      this.y = var3;
      this.z = var4;
      this.d = var5;
   }

   public String X() {
      return this.K;
   }

   public ks E() {
      return this.d;
   }

   public net.yz.w K(ze var1) {
      net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ks var4 = var1.A(var3);
         if(var4.Z().U()) {
            var2.set(var3, new ks(var4.Z().y()));
         }
      }

      return var2;
   }

   public net.yz.w p() {
      return this.z;
   }

   public boolean T(int var1, int var2) {
      return var1 >= this.C && var2 >= this.y;
   }

   public boolean c(ze var1, net.yv.r var2) {
      for(int var3 = 0; var3 <= 3 - this.C; ++var3) {
         for(int var4 = 0; var4 <= 3 - this.y; ++var4) {
            if(this.f(var1, var3, var4, true)) {
               return true;
            }

            if(this.f(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean f(ze var1, int var2, int var3, boolean var4) {
      byte var5 = 0;
      int var6 = 0;

      while(true) {
         int var7 = var5 - var2;
         int var8 = var6 - var3;
         l var9 = l.r;
         if(var7 < this.C && var8 < this.y) {
            var9 = (l)this.z.get(this.C - var7 - 1 + var8 * this.C);
         }

         if(!var9.j(var1.P(var5, var6))) {
            return false;
         }

         ++var6;
      }
   }

   public ks h(ze var1) {
      return this.E().s();
   }

   public int M() {
      return this.C;
   }

   public int n() {
      return this.y;
   }

   public static j S(JsonObject var0) {
      String var1 = net.yz.c.x(var0, "group", "");
      Map var2 = r(net.yz.c.b(var0, "key"));
      String[] var3 = x(Q(net.yz.c.P(var0, "pattern")));
      int var4 = var3[0].length();
      int var5 = var3.length;
      net.yz.w var6 = r(var3, var2, var4, var5);
      ks var7 = s(net.yz.c.b(var0, "result"), true);
      return new j(var1, var4, var5, var6, var7);
   }

   private static net.yz.w r(String[] var0, Map var1, int var2, int var3) {
      net.yz.w var5 = net.yz.w.C(var2 * var3, l.r);
      HashSet var6 = Sets.newHashSet(var1.keySet());
      Y();
      var6.remove(" ");
      int var7 = 0;
      if(var7 < var0.length) {
         int var8 = 0;
         if(var8 < var0[var7].length()) {
            String var9 = var0[var7].substring(var8, var8 + 1);
            l var10 = (l)var1.get(var9);
            if(var10 == null) {
               throw new JsonSyntaxException("Pattern references symbol \'" + var9 + "\' but it\'s not defined in the key");
            }

            var6.remove(var9);
            var5.set(var8 + var2 * var7, var10);
            ++var8;
         }

         ++var7;
      }

      if(!var6.isEmpty()) {
         throw new JsonSyntaxException("Key defines symbols that aren\'t used in pattern: " + var6);
      } else {
         return var5;
      }
   }

   @VisibleForTesting
   static String[] x(String... var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 < var0.length; ++var5) {
         String var6 = var0[var5];
         var1 = Math.min(var1, o(var6));
         int var7 = A(var6);
         var2 = Math.max(var2, var7);
         ++var3;
         ++var4;
      }

      if(var0.length == var4) {
         return new String[0];
      } else {
         String[] var8 = new String[var0.length - var4 - var3];

         for(int var9 = 0; var9 < var8.length; ++var9) {
            var8[var9] = var0[var9 + var3].substring(var1, var2 + 1);
         }

         return var8;
      }
   }

   private static int o(String var0) {
      int var1;
      for(var1 = 0; var1 < var0.length() && var0.charAt(var1) == 32; ++var1) {
         ;
      }

      return var1;
   }

   private static int A(String var0) {
      int var1;
      for(var1 = var0.length() - 1; var0.charAt(var1) == 32; --var1) {
         ;
      }

      return var1;
   }

   private static String[] Q(JsonArray var0) {
      String[] var1 = new String[var0.size()];
      if(var1.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if(var1.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            String var3 = net.yz.c.m(var0.get(var2), "pattern[" + var2 + "]");
            if(var3.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if(var1[0].length() != var3.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            var1[var2] = var3;
         }

         return var1;
      }
   }

   private static Map r(JsonObject var0) {
      HashMap var1 = Maps.newHashMap();

      for(Entry var3 : var0.entrySet()) {
         if(((String)var3.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: \'" + (String)var3.getKey() + "\' is an invalid symbol (must be 1 character only).");
         }

         if(" ".equals(var3.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: \' \' is a reserved symbol.");
         }

         var1.put(var3.getKey(), o((JsonElement)var3.getValue()));
      }

      var1.put(" ", l.r);
      return var1;
   }

   public static l o(@Nullable JsonElement var0) {
      if(var0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if(var0.isJsonObject()) {
         return l.b(new ks[]{s(var0.getAsJsonObject(), false)});
      } else if(!var0.isJsonArray()) {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      } else {
         JsonArray var1 = var0.getAsJsonArray();
         if(var1.size() == 0) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            ks[] var2 = new ks[var1.size()];

            for(int var3 = 0; var3 < var1.size(); ++var3) {
               var2[var3] = s(net.yz.c.V(var1.get(var3), "item"), false);
            }

            return l.b(var2);
         }
      }
   }

   public static ks s(JsonObject var0, boolean var1) {
      String var2 = net.yz.c.X(var0, "item");
      net.n0.y var3 = (net.n0.y)net.n0.y.V.B(new m_(var2));
      throw new JsonSyntaxException("Unknown item \'" + var2 + "\'");
   }

   public static void S(int[] var0) {
      O = var0;
   }

   public static int[] Y() {
      return O;
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   static {
      S((int[])null);
   }
}
