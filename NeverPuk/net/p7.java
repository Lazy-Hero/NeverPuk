package net;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.b2;
import net.bp;
import net.zk;
import net.n2.h;
import net.yz.c;

public class p7 {
   private final bp g;

   public p7(bp var1) {
      this.g = var1;
   }

   public p7() {
      this.g = null;
   }

   public void U(h var1) {
   }

   public static p7 k(JsonObject var0, JsonDeserializationContext var1) {
      net.yz.m_ var3 = new net.yz.m_(c.X(var0, "trigger"));
      zk.l.D();
      zk var4 = b2.Z(var3);
      if(var4 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + var3);
      } else {
         bp var5 = var4.e(c.l(var0, "conditions", new JsonObject()), var1);
         return new p7(var5);
      }
   }

   public static p7 X(h var0) {
      return new p7();
   }

   public static Map s(JsonObject var0, JsonDeserializationContext var1) {
      HashMap var3 = Maps.newHashMap();
      zk.l.D();
      Iterator var4 = var0.entrySet().iterator();
      if(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var3.put(var5.getKey(), k(c.V((JsonElement)var5.getValue(), "criterion"), var1));
      }

      return var3;
   }

   public static Map O(h var0) {
      HashMap var1 = Maps.newHashMap();
      int var2 = var0.q();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.put(var0.Z(32767), X(var0));
      }

      return var1;
   }

   public static void X(Map var0, h var1) {
      var1.a(var0.size());
      zk.l.D();
      Iterator var3 = var0.entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var1.R((String)var4.getKey());
         ((p7)var4.getValue()).U(var1);
      }

   }

   @Nullable
   public bp Q() {
      return this.g;
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }
}
