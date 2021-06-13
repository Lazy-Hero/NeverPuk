package net;

import java.net.URL;
import java.util.HashMap;
import java.util.function.BiConsumer;
import net.oa;

public class xe {
   private final oa h = new oa("com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication");
   private final oa n = new oa("com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService");
   private xe.a e;
   private static int[] M;

   public void n(xe.a var1) throws NoSuchFieldException, IllegalAccessException {
      int[] var2 = q();
      if(this.e != var1) {
         this.H(var1.K);
         this.e = var1;
      }
   }

   private void H(String var1) throws NoSuchFieldException, IllegalAccessException {
      q();
      HashMap var3 = new HashMap();
      String var4 = var1.contains("thealtening")?"http":"https";
      var3.put("ROUTE_AUTHENTICATE", this.Y(var4 + "://authserver." + var1 + ".com/authenticate"));
      var3.put("ROUTE_INVALIDATE", this.Y(var4 + "://authserver" + var1 + "com/invalidate"));
      var3.put("ROUTE_REFRESH", this.Y(var4 + "://authserver." + var1 + ".com/refresh"));
      var3.put("ROUTE_VALIDATE", this.Y(var4 + "://authserver." + var1 + ".com/validate"));
      var3.put("ROUTE_SIGNOUT", this.Y(var4 + "://authserver." + var1 + ".com/signout"));
      var3.forEach((var1, var2) -> {
         this.h.p(var1, var2);
      });
      this.h.p("BASE_URL", var4 + "://authserver." + var1 + ".com/");
      this.n.p("BASE_URL", var4 + "://sessionserver." + var1 + ".com/session/minecraft/");
      this.n.p("JOIN_URL", this.Y(var4 + "://sessionserver." + var1 + ".com/session/minecraft/join"));
      this.n.p("CHECK_URL", this.Y(var4 + "://sessionserver." + var1 + ".com/session/minecraft/hasJoined"));
      this.n.p("WHITELISTED_DOMAINS", new String[]{".minecraft.net", ".mojang.com", ".thealtening.com"});
   }

   private URL Y(String var1) {
      return new URL(var1);
   }

   public xe.a s() {
      int[] var1 = q();
      if(this.e == null) {
         this.e = xe.a.MOJANG;
      }

      return this.e;
   }

   public static void i(int[] var0) {
      M = var0;
   }

   public static int[] q() {
      return M;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      i((int[])null);
   }

   public static enum a {
      MOJANG("MOJANG", 0, "mojang"),
      THEALTENING("THEALTENING", 1, "thealtening");

      String K;

      private a(String var3, int var4, String var5) {
         this.K = var5;
      }
   }
}
