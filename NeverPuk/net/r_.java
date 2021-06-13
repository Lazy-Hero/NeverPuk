package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.gs;
import net.it;
import net.iy;
import net.m0;
import net.m1;
import net.m2;
import net.pu;
import net.wd;
import net.x6;
import net.z9;
import net.u.d;
import net.y6.jb;

public class r_ {
   public static final String P = "entity";
   public static final String y = "texture";
   public static final String W = "shadowSize";
   public static final String I = "type";
   public static final String k = "textureSize";
   public static final String z = "usePlayerTexture";
   public static final String v = "models";
   public static final String M = "animations";
   public static final String B = "id";
   public static final String b = "baseId";
   public static final String g = "model";
   public static final String T = "type";
   public static final String r = "part";
   public static final String F = "attach";
   public static final String A = "invertAxis";
   public static final String a = "mirrorTexture";
   public static final String K = "translate";
   public static final String H = "rotate";
   public static final String h = "scale";
   public static final String Z = "boxes";
   public static final String i = "sprites";
   public static final String t = "submodel";
   public static final String V = "submodels";
   public static final String J = "textureOffset";
   public static final String o = "coordinates";
   public static final String s = "sizeAdd";
   public static final String S = "EntityModel";
   public static final String D = "EntityModelPart";

   public static pu p(JsonObject var0, String var1) {
      m1 var2 = new m1("CustomEntityModels");
      String var3 = var2.x(var1);
      String var4 = var2.c(var1);
      String var5 = gs.R(var0, "texture");
      int[] var6 = gs.M(var0.get("textureSize"), 2);
      float var7 = gs.K(var0, "shadowSize", -1.0F);
      JsonArray var8 = (JsonArray)var0.get("models");
      T(var8, "Missing models");
      HashMap var9 = new HashMap();
      ArrayList var10 = new ArrayList();

      for(int var11 = 0; var11 < var8.size(); ++var11) {
         JsonObject var12 = (JsonObject)var8.get(var11);
         J(var12, var9);
         v(var12, var9, var4);
         N(var12, var9);
         m2 var13 = w(var12, var6, var4);
         var10.add(var13);
      }

      m2[] var14 = (m2[])((m2[])var10.toArray(new m2[var10.size()]));
      net.yz.m_ var15 = null;
      var15 = U(var4, var5, ".png");
      pu var17 = new pu(var3, var4, var15, var14, var7);
      return var17;
   }

   private static void J(JsonObject var0, Map var1) {
      String var2 = gs.R(var0, "baseId");
      JsonObject var3 = (JsonObject)var1.get(var2);
      z9.h("BaseID not found: " + var2);
   }

   private static void v(JsonObject var0, Map var1, String var2) {
      String var3 = gs.R(var0, "model");
      net.yz.m_ var4 = U(var2, var3, ".jpm");
      JsonObject var5 = W(var4);
      z9.h("Model not found: " + var4);
   }

   private static void s(JsonObject var0, JsonObject var1) {
      for(Entry var3 : var0.entrySet()) {
         if(!((String)var3.getKey()).equals("id") && !var1.has((String)var3.getKey())) {
            var1.add((String)var3.getKey(), (JsonElement)var3.getValue());
         }
      }

   }

   public static net.yz.m_ U(String var0, String var1, String var2) {
      if(!var1.endsWith(var2)) {
         var1 = var1 + var2;
      }

      if(!var1.contains("/")) {
         var1 = var0 + "/" + var1;
      } else if(var1.startsWith("./")) {
         var1 = var0 + "/" + var1.substring(2);
      } else if(var1.startsWith("~/")) {
         var1 = "optifine/" + var1.substring(2);
      }

      return new net.yz.m_(var1);
   }

   private static void N(JsonObject var0, Map var1) {
      String var2 = gs.R(var0, "id");
      if(var2.length() < 1) {
         z9.h("Empty model ID: " + var2);
      } else if(var1.containsKey(var2)) {
         z9.h("Duplicate model ID: " + var2);
      } else {
         var1.put(var2, var0);
      }

   }

   public static m2 w(JsonObject var0, int[] var1, String var2) {
      iy.A();
      String var4 = gs.R(var0, "part");
      T(var4, "Model part not specified, missing \"replace\" or \"attachTo\".");
      boolean var5 = gs.X(var0, "attach", false);
      it var6 = new it();
      var6.f = var1[0];
      var6.C = var1[1];
      wd var7 = null;
      JsonArray var8 = (JsonArray)var0.get("animations");
      ArrayList var9 = new ArrayList();
      int var10 = 0;
      if(var10 < var8.size()) {
         JsonObject var11 = (JsonObject)var8.get(var10);
         Iterator var12 = var11.entrySet().iterator();
         if(var12.hasNext()) {
            Entry var13 = (Entry)var12.next();
            String var14 = (String)var13.getKey();
            String var15 = ((JsonElement)var13.getValue()).getAsString();
            m0 var16 = new m0(var14, var15);
            var9.add(var16);
            d.h(new d[5]);
         }

         ++var10;
      }

      if(var9.size() > 0) {
         m0[] var19 = (m0[])var9.toArray(new m0[var9.size()]);
         var7 = new wd(var19);
      }

      jb var17 = x6.Q(var0, var6, var1, var2);
      m2 var20 = new m2(var4, var5, var17, var7);
      return var20;
   }

   private static void T(Object var0, String var1) {
      throw new JsonParseException(var1);
   }

   public static JsonObject W(net.yz.m_ var0) throws IOException, JsonParseException {
      InputStream var1 = z9.I(var0);
      return null;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
