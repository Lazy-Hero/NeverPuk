package net.ym;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.xn;
import net.ym.d;
import net.ym.t;
import net.yz.m_;

public class u {
   private final m_ E;
   private final d L;
   private final boolean S;
   private final int e;

   public u(m_ var1, d var2, boolean var3, int var4) {
      this.E = var1;
      this.L = var2;
      this.S = var3;
      this.e = var4;
   }

   public m_ z() {
      return this.E;
   }

   public d p() {
      return this.L;
   }

   public boolean a() {
      return this.S;
   }

   public int t() {
      return this.e;
   }

   public String toString() {
      return "Variant{modelLocation=" + this.E + ", rotation=" + this.L + ", uvLock=" + this.S + ", weight=" + this.e + '}';
   }

   public boolean equals(Object var1) {
      int var2 = t.v();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof u)) {
         return false;
      } else {
         u var3 = (u)var1;
         return this.E.equals(var3.E) && this.L == var3.L && this.S == var3.S && this.e == var3.e;
      }
   }

   public int hashCode() {
      int var1 = this.E.hashCode();
      var1 = 31 * var1 + this.L.hashCode();
      var1 = 31 * var1 + Boolean.valueOf(this.S).hashCode();
      var1 = 31 * var1 + this.e;
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class s implements JsonDeserializer {
      public u v(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         String var5 = this.t(var4);
         d var6 = this.Q(var4);
         boolean var7 = this.D(var4);
         int var8 = this.B(var4);
         return new u(this.R(var5), var6, var7, var8);
      }

      private m_ R(String var1) {
         m_ var2 = new m_(var1);
         var2 = new m_(var2.A(), "block/" + var2.v());
         return var2;
      }

      private boolean D(JsonObject var1) {
         return net.yz.c.a(var1, "uvlock", false);
      }

      protected d Q(JsonObject var1) {
         int var3 = net.yz.c.t(var1, "x", 0);
         t.v();
         int var4 = net.yz.c.t(var1, "y", 0);
         d var5 = d.v(var3, var4);
         if(var5 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + var3 + ", y: " + var4);
         } else {
            return var5;
         }
      }

      protected String t(JsonObject var1) {
         return net.yz.c.X(var1, "model");
      }

      protected int B(JsonObject var1) {
         t.V();
         int var3 = net.yz.c.t(var1, "weight", 1);
         if(var3 < 1) {
            throw new JsonParseException("Invalid weight " + var3 + " found, expected integer >= 1");
         } else {
            return var3;
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
