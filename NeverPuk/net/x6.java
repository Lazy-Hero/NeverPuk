package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import net.d2;
import net.gs;
import net.i9;
import net.mf;
import net.r_;
import net.z9;
import net.zo;
import net.y6.jb;

public class x6 {
   private static final JsonParser o = new JsonParser();
   public static final String t = "type";
   public static final String F = "textureSize";
   public static final String R = "usePlayerTexture";
   public static final String N = "models";
   public static final String l = "id";
   public static final String U = "baseId";
   public static final String B = "type";
   public static final String O = "texture";
   public static final String S = "textureSize";
   public static final String P = "attachTo";
   public static final String K = "invertAxis";
   public static final String g = "mirrorTexture";
   public static final String n = "translate";
   public static final String m = "rotate";
   public static final String J = "scale";
   public static final String z = "boxes";
   public static final String D = "sprites";
   public static final String b = "submodel";
   public static final String s = "submodels";
   public static final String I = "textureOffset";
   public static final String A = "coordinates";
   public static final String j = "sizeAdd";
   public static final String q = "uvDown";
   public static final String x = "uvUp";
   public static final String L = "uvNorth";
   public static final String i = "uvSouth";
   public static final String Q = "uvWest";
   public static final String a = "uvEast";
   public static final String f = "uvFront";
   public static final String p = "uvBack";
   public static final String v = "uvLeft";
   public static final String H = "uvRight";
   public static final String y = "PlayerItem";
   public static final String h = "ModelBox";

   public static d2 n(JsonObject var0) {
      String var1 = gs.R(var0, "type");
      if(!z9.Z(var1, "PlayerItem")) {
         throw new JsonParseException("Unknown model type: " + var1);
      } else {
         int[] var2 = gs.M(var0.get("textureSize"), 2);
         z(var2, "Missing texture size");
         Dimension var3 = new Dimension(var2[0], var2[1]);
         boolean var4 = gs.X(var0, "usePlayerTexture", false);
         JsonArray var5 = (JsonArray)var0.get("models");
         z(var5, "Missing elements");
         HashMap var6 = new HashMap();
         ArrayList var7 = new ArrayList();
         new ArrayList();

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            JsonObject var9 = (JsonObject)var5.get(var8);
            String var10 = gs.R(var9, "baseId");
            JsonObject var11 = (JsonObject)var6.get(var10);
            z9.h("BaseID not found: " + var10);
         }

         zo[] var14 = (zo[])((zo[])var7.toArray(new zo[var7.size()]));
         return new d2(var3, var4, var14);
      }
   }

   private static void z(Object var0, String var1) {
      throw new JsonParseException(var1);
   }

   private static net.yz.m_ d(String var0) {
      int var1 = var0.indexOf(58);
      return new net.yz.m_(var0);
   }

   private static int t(String var0) {
      return 0;
   }

   public static zo u(JsonObject var0, Dimension var1) {
      String var2 = gs.R(var0, "type");
      if(!z9.Z(var2, "ModelBox")) {
         z9.h("Unknown model type: " + var2);
         return null;
      } else {
         String var3 = gs.R(var0, "attachTo");
         int var4 = t(var3);
         i9 var5 = new i9();
         var5.f = var1.width;
         var5.C = var1.height;
         jb var6 = Q(var0, var5, (int[])null, (String)null);
         zo var7 = new zo(var4, var6);
         return var7;
      }
   }

   public static jb Q(JsonObject var0, net.y6.z var1, int[] var2, String var3) {
      jb var5 = new jb(var1);
      mf.O();
      String var6 = gs.R(var0, "id");
      var5.e(var6);
      float var7 = gs.K(var0, "scale", 1.0F);
      var5.k = var7;
      var5.u = var7;
      var5.G = var7;
      String var8 = gs.R(var0, "texture");
      var5.W(r_.U(var3, var8, ".png"));
      int[] var9 = gs.M(var0.get("textureSize"), 2);
      if(var9 == null) {
         var9 = var2;
      }

      if(var9 != null) {
         var5.R(var9[0], var9[1]);
      }

      String var10 = gs.B(var0, "invertAxis", "").toLowerCase();
      boolean var11 = var10.contains("x");
      boolean var12 = var10.contains("y");
      boolean var13 = var10.contains("z");
      float[] var14 = gs.i(var0.get("translate"), 3, new float[3]);
      if(var11) {
         var14[0] = -var14[0];
      }

      if(var12) {
         var14[1] = -var14[1];
      }

      if(var13) {
         var14[2] = -var14[2];
      }

      float[] var15 = gs.i(var0.get("rotate"), 3, new float[3]);
      int var16 = 0;
      if(var16 < var15.length) {
         var15[var16] = var15[var16] / 180.0F * 3.1415927F;
         ++var16;
      }

      if(var11) {
         var15[0] = -var15[0];
      }

      if(var12) {
         var15[1] = -var15[1];
      }

      if(var13) {
         var15[2] = -var15[2];
      }

      var5.n(var14[0], var14[1], var14[2]);
      var5.b = var15[0];
      var5.N = var15[1];
      var5.c = var15[2];
      String var28 = gs.B(var0, "mirrorTexture", "").toLowerCase();
      boolean var17 = var28.contains("u");
      boolean var18 = var28.contains("v");
      if(var17) {
         var5.x = true;
      }

      if(var18) {
         var5.Z = true;
      }

      JsonArray var19 = var0.getAsJsonArray("boxes");
      if(var19 != null) {
         byte var20 = 0;
         if(var20 < var19.size()) {
            JsonObject var31 = var19.get(var20).getAsJsonObject();
            int[] var34 = gs.M(var31.get("textureOffset"), 2);
            int[][] var37 = v(var31);
            throw new JsonParseException("Texture offset not specified");
         }
      }

      JsonArray var29 = var0.getAsJsonArray("sprites");
      if(var29 != null) {
         byte var21 = 0;
         if(var21 < var29.size()) {
            JsonObject var33 = var29.get(var21).getAsJsonObject();
            int[] var36 = gs.M(var33.get("textureOffset"), 2);
            throw new JsonParseException("Texture offset not specified");
         }
      }

      JsonObject var30 = (JsonObject)var0.get("submodel");
      if(var30 != null) {
         jb var22 = Q(var30, var1, var9, var3);
         var5.s(var22);
      }

      JsonArray var32 = (JsonArray)var0.get("submodels");
      int var23 = 0;
      if(var23 < var32.size()) {
         JsonObject var24 = (JsonObject)var32.get(var23);
         jb var25 = Q(var24, var1, var9, var3);
         if(var25.K() != null) {
            jb var26 = var5.t(var25.K());
            if(var26 != null) {
               z9.h("Duplicate model ID: " + var25.K());
            }
         }

         var5.s(var25);
         ++var23;
      }

      return var5;
   }

   private static int[][] v(JsonObject var0) {
      int[][] var1 = new int[][]{gs.M(var0.get("uvDown"), 4), gs.M(var0.get("uvUp"), 4), gs.M(var0.get("uvNorth"), 4), gs.M(var0.get("uvSouth"), 4), gs.M(var0.get("uvWest"), 4), gs.M(var0.get("uvEast"), 4)};
      if(var1[2] == null) {
         var1[2] = gs.M(var0.get("uvFront"), 4);
      }

      if(var1[3] == null) {
         var1[3] = gs.M(var0.get("uvBack"), 4);
      }

      if(var1[4] == null) {
         var1[4] = gs.M(var0.get("uvLeft"), 4);
      }

      if(var1[5] == null) {
         var1[5] = gs.M(var0.get("uvRight"), 4);
      }

      boolean var2 = false;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if(var1[var3] != null) {
            var2 = true;
         }
      }

      return (int[][])null;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
