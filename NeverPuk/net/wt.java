package net;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.logging.Logger;
import net.iq;
import net.p4;
import net.wc;
import net.xn;
import net.u.d;

public class wt extends wc {
   private final String t;
   private final String n = "http://api.thealtening.com/v1/";
   private final Logger T = Logger.getLogger("TheAltening");
   private final Gson N = new Gson();
   private static String[] e;

   public wt(String var1) {
      this.t = var1;
   }

   public p4 E() {
      System.setProperty("http.agent", "chrome");
      String var1 = this.v(String.format("http://api.thealtening.com/v1/license?token=%s", new Object[]{this.t}));
      return (p4)this.N.fromJson(var1, p4.class);
   }

   public iq W() {
      String var1 = this.v(String.format("http://api.thealtening.com/v1/generate?info=true&token=%s", new Object[]{this.t}));
      return (iq)this.N.fromJson(var1, iq.class);
   }

   public boolean R(String var1) {
      String[] var2 = F();
      String var3 = this.v("http://api.thealtening.com/v1/private?acctoken=" + var1 + "&token=" + this.t);
      JsonObject var4 = (JsonObject)this.N.fromJson(var3, JsonObject.class);
      return var4 != null && var4.has("success") && var4.get("success").getAsBoolean();
   }

   public boolean l(String var1) {
      String var2 = this.v("http://api.thealtening.com/v1/favorite?acctoken=" + var1 + "&token=" + this.t);
      JsonObject var3 = (JsonObject)this.N.fromJson(var2, JsonObject.class);
      return var3.has("success") && var3.get("success").getAsBoolean();
   }

   public static void C(String[] var0) {
      e = var0;
   }

   public static String[] F() {
      return e;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   static {
      C((String[])null);
   }

   public static class y {
      private final wt Z;

      public y(wt var1) {
         this.Z = var1;
      }

      public CompletableFuture Q() {
         wt var10000 = this.Z;
         this.Z.getClass();
         return CompletableFuture.supplyAsync(var10000::E);
      }

      public CompletableFuture H() {
         wt.e;
         wt var10000 = this.Z;
         this.Z.getClass();
         CompletableFuture var2 = CompletableFuture.supplyAsync(var10000::W);
         if(d.y() == null) {
            wt.e = new String[2];
         }

         return var2;
      }

      public CompletableFuture p(String var1) {
         return CompletableFuture.supplyAsync(() -> {
            return Boolean.valueOf(this.Z.R(var1));
         });
      }

      public CompletableFuture k(String var1) {
         return CompletableFuture.supplyAsync(() -> {
            return Boolean.valueOf(this.Z.l(var1));
         });
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
