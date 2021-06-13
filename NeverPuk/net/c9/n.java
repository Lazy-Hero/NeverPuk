package net.c9;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.c9.b;
import net.yz.m_;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class n {
   private static final Logger u = LogManager.getLogger();
   private final Map z = Maps.newHashMap();

   protected n() {
   }

   public n(File var1, String var2) {
      b.K();
      File var4 = new File(var1, "objects");
      File var5 = new File(var1, "indexes/" + var2 + ".json");
      BufferedReader var6 = null;
      var6 = Files.newReader(var5, StandardCharsets.UTF_8);
      JsonObject var7 = (new JsonParser()).parse(var6).getAsJsonObject();
      JsonObject var8 = net.yz.c.l(var7, "objects", (JsonObject)null);
      Iterator var9 = var8.entrySet().iterator();
      if(var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         JsonObject var11 = (JsonObject)var10.getValue();
         String var12 = (String)var10.getKey();
         String[] var13 = var12.split("/", 2);
         String var14 = var13.length == 1?var13[0]:var13[0] + ":" + var13[1];
         String var15 = net.yz.c.X(var11, "hash");
         File var16 = new File(var4, var15.substring(0, 2) + "/" + var15);
         this.z.put(var14, var16);
      }

      IOUtils.closeQuietly(var6);
   }

   @Nullable
   public File l(m_ var1) {
      String var2 = var1.toString();
      return (File)this.z.get(var2);
   }

   public boolean S(m_ var1) {
      File var2 = this.l(var1);
      return var2.isFile();
   }

   public File n() {
      return (File)this.z.get("pack.mcmeta");
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }
}
