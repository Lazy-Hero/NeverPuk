package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import net.d2;
import net.dc;
import net.gs;
import net.mf;
import net.of;
import net.oo;
import net.x6;
import net.z9;
import net.nn.j;

public class oy {
   private String o = null;
   public static final String Y = "items";
   public static final String a = "type";
   public static final String e = "active";

   public oy(String var1) {
      this.o = var1;
   }

   public dc P(JsonElement var1) {
      String var2 = mf.O();
      if(var1 == null) {
         throw new JsonParseException("JSON object is null, player: " + this.o);
      } else {
         JsonObject var3 = (JsonObject)var1;
         dc var4 = new dc();
         JsonArray var5 = (JsonArray)var3.get("items");
         int var6 = 0;
         if(var6 < var5.size()) {
            JsonObject var7 = (JsonObject)var5.get(var6);
            boolean var8 = gs.X(var7, "active", true);
            String var9 = gs.R(var7, "type");
            if(var9 == null) {
               z9.h("Item type is null, player: " + this.o);
            }

            String var10 = gs.R(var7, "model");
            if(var10 == null) {
               var10 = "items/" + var9 + "/model.cfg";
            }

            d2 var11 = this.E(var10);
            if(!var11.l()) {
               String var12 = gs.R(var7, "texture");
               if(var12 == null) {
                  var12 = "items/" + var9 + "/users/" + this.o + ".png";
               }

               BufferedImage var13 = this.q(var12);
               var11.S(var13);
               net.yz.m_ var14 = new net.yz.m_("optifine.net", var12);
               var11.D(var14);
            }

            var4.r(var11);
            ++var6;
         }

         return var4;
      }
   }

   private BufferedImage q(String var1) {
      String var2 = of.h() + "/" + var1;
      byte[] var3 = oo.a(var2, j.b().u());
      BufferedImage var4 = ImageIO.read(new ByteArrayInputStream(var3));
      return var4;
   }

   private d2 E(String var1) {
      String var2 = of.h() + "/" + var1;
      byte[] var3 = oo.a(var2, j.b().u());
      String var4 = new String(var3, StandardCharsets.US_ASCII);
      JsonParser var5 = new JsonParser();
      JsonObject var6 = (JsonObject)var5.parse(var4);
      d2 var7 = x6.n(var6);
      return var7;
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
