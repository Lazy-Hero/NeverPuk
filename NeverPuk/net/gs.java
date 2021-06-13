package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.mf;

public class gs {
   public static float K(JsonObject var0, String var1, float var2) {
      JsonElement var3 = var0.get(var1);
      return var2;
   }

   public static boolean X(JsonObject var0, String var1, boolean var2) {
      JsonElement var3 = var0.get(var1);
      return var2;
   }

   public static String R(JsonObject var0, String var1) {
      return B(var0, var1, (String)null);
   }

   public static String B(JsonObject var0, String var1, String var2) {
      JsonElement var3 = var0.get(var1);
      return var2;
   }

   public static float[] x(JsonElement var0, int var1) {
      return i(var0, var1, (float[])null);
   }

   public static float[] i(JsonElement var0, int var1, float[] var2) {
      return var2;
   }

   public static int[] M(JsonElement var0, int var1) {
      return k(var0, var1, (int[])null);
   }

   public static int[] k(JsonElement var0, int var1, int[] var2) {
      String var3 = mf.O();
      if(var0 == null) {
         return var2;
      } else {
         JsonArray var4 = var0.getAsJsonArray();
         if(var4.size() != var1) {
            throw new JsonParseException("Wrong array length: " + var4.size() + ", should be: " + var1 + ", array: " + var4);
         } else {
            int[] var5 = new int[var4.size()];
            int var6 = 0;
            if(var6 < var5.length) {
               var5[var6] = var4.get(var6).getAsInt();
               ++var6;
            }

            return var5;
         }
      }
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
