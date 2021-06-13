package net.ym;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.ym.t;

public class q {
   public float[] h;
   public final int O;

   public q(@Nullable float[] var1, int var2) {
      this.h = var1;
      this.O = var2;
   }

   public float Q(int var1) {
      int var2 = t.V();
      if(this.h == null) {
         throw new NullPointerException("uvs");
      } else {
         int var3 = this.O(var1);
         return var3 != 0 && var3 != 1?this.h[2]:this.h[0];
      }
   }

   public float D(int var1) {
      int var2 = t.v();
      if(this.h == null) {
         throw new NullPointerException("uvs");
      } else {
         int var3 = this.O(var1);
         return var3 != 0 && var3 != 3?this.h[3]:this.h[1];
      }
   }

   private int O(int var1) {
      return (var1 + this.O / 90) % 4;
   }

   public int G(int var1) {
      return (var1 + (4 - this.O / 90)) % 4;
   }

   public void a(float[] var1) {
      if(this.h == null) {
         this.h = var1;
      }

   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   static class p implements JsonDeserializer {
      public q X(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = var1.getAsJsonObject();
         float[] var5 = this.J(var4);
         int var6 = this.Q(var4);
         return new q(var5, var6);
      }

      protected int Q(JsonObject var1) {
         int var2 = net.yz.c.t(var1, "rotation", 0);
         if(var2 % 90 == 0 && var2 / 90 <= 3) {
            return var2;
         } else {
            throw new JsonParseException("Invalid rotation " + var2 + " found, only 0/90/180/270 allowed");
         }
      }

      @Nullable
      private float[] J(JsonObject var1) {
         int var2 = t.V();
         if(!var1.has("uv")) {
            return null;
         } else {
            JsonArray var3 = net.yz.c.P(var1, "uv");
            if(var3.size() != 4) {
               throw new JsonParseException("Expected 4 uv values, found: " + var3.size());
            } else {
               float[] var4 = new float[4];
               int var5 = 0;
               int var10001 = var4.length;
               var4[var5] = net.yz.c.T(var3.get(var5), "uv[" + var5 + "]");
               ++var5;
               return var4;
            }
         }
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
