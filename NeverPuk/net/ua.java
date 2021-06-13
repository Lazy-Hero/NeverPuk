package net;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import net._t;
import net.dc;
import net.mf;
import net.ot;
import net.oy;

public class ua implements ot {
   private String k = null;

   public ua(String var1) {
      this.k = var1;
   }

   public void G(String var1, byte[] var2, Throwable var3) {
      String var4 = mf.O();
      String var5 = new String(var2, StandardCharsets.US_ASCII);
      JsonParser var6 = new JsonParser();
      JsonElement var7 = var6.parse(var5);
      oy var8 = new oy(this.k);
      dc var9 = var8.P(var7);
      if(var9 != null) {
         var9.K(true);
         _t.v(this.k, var9);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
