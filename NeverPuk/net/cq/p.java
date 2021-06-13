package net.cq;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import net.cq.x;
import net.nn.j;
import net.u.d;
import net.yz.c;
import net.yz.u;

public class p {
   public static void main(String[] var0) {
      OptionParser var2 = new OptionParser();
      var2.allowsUnrecognizedOptions();
      x.z();
      var2.accepts("demo");
      var2.accepts("fullscreen");
      var2.accepts("checkGlErrors");
      ArgumentAcceptingOptionSpec var3 = var2.accepts("server").withRequiredArg();
      ArgumentAcceptingOptionSpec var4 = var2.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), new Integer[0]);
      ArgumentAcceptingOptionSpec var5 = var2.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      ArgumentAcceptingOptionSpec var6 = var2.accepts("assetsDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var7 = var2.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var8 = var2.accepts("proxyHost").withRequiredArg();
      ArgumentAcceptingOptionSpec var9 = var2.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec var10 = var2.accepts("proxyUser").withRequiredArg();
      ArgumentAcceptingOptionSpec var11 = var2.accepts("proxyPass").withRequiredArg();
      ArgumentAcceptingOptionSpec var12 = var2.accepts("username").withRequiredArg().defaultsTo("Player" + j.E() % 1000L, new String[0]);
      ArgumentAcceptingOptionSpec var13 = var2.accepts("uuid").withRequiredArg();
      ArgumentAcceptingOptionSpec var14 = var2.accepts("accessToken").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var15 = var2.accepts("version").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var16 = var2.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), new Integer[0]);
      ArgumentAcceptingOptionSpec var17 = var2.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), new Integer[0]);
      ArgumentAcceptingOptionSpec var18 = var2.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var19 = var2.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var20 = var2.accepts("assetIndex").withRequiredArg();
      ArgumentAcceptingOptionSpec var21 = var2.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      ArgumentAcceptingOptionSpec var22 = var2.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      NonOptionArgumentSpec var23 = var2.nonOptions();
      OptionSet var24 = var2.parse(var0);
      List var25 = var24.valuesOf(var23);
      if(!var25.isEmpty()) {
         System.out.println("Completely ignored arguments: " + var25);
      }

      String var26 = (String)var24.valueOf(var8);
      Proxy var27 = Proxy.NO_PROXY;
      if(var26 != null) {
         var27 = new Proxy(Type.SOCKS, new InetSocketAddress(var26, ((Integer)var24.valueOf(var9)).intValue()));
      }

      final String var28 = (String)var24.valueOf(var10);
      final String var29 = (String)var24.valueOf(var11);
      if(!var27.equals(Proxy.NO_PROXY) && x(var28) && x(var29)) {
         Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(var28, var29.toCharArray());
            }
         });
      }

      int var30 = ((Integer)var24.valueOf(var16)).intValue();
      int var31 = ((Integer)var24.valueOf(var17)).intValue();
      boolean var32 = var24.has("fullscreen");
      boolean var33 = var24.has("checkGlErrors");
      boolean var34 = var24.has("demo");
      String var35 = (String)var24.valueOf(var15);
      Gson var36 = (new GsonBuilder()).registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var37 = (PropertyMap)c.b(var36, (String)var24.valueOf(var18), PropertyMap.class);
      PropertyMap var38 = (PropertyMap)c.b(var36, (String)var24.valueOf(var19), PropertyMap.class);
      String var39 = (String)var24.valueOf(var22);
      File var40 = (File)var24.valueOf(var5);
      File var41 = var24.has(var6)?(File)var24.valueOf(var6):new File(var40, "assets/");
      File var42 = var24.has(var7)?(File)var24.valueOf(var7):new File(var40, "resourcepacks/");
      String var43 = var24.has(var13)?(String)var13.value(var24):(String)var12.value(var24);
      String var44 = var24.has(var20)?(String)var20.value(var24):null;
      String var45 = (String)var24.valueOf(var3);
      Integer var46 = (Integer)var24.valueOf(var4);
      u var47 = new u((String)var12.value(var24), var43, (String)var14.value(var24), (String)var21.value(var24));
      x var48 = new x(new x.s(var47, var37, var38, var27), new x.r(var30, var31, var32, var33), new x.w(var40, var42, var41, var44), new x.a(var34, var35, var39), new x.j(var45, var46.intValue()));
      Runtime.getRuntime().addShutdownHook(new Thread("Client Shutdown Thread") {
         public void run() {
            j.I();
         }
      });
      Thread.currentThread().setName("Client thread");
      (new j(var48)).s();
      d.h(new d[2]);
   }

   private static boolean x(String var0) {
      return !var0.isEmpty();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
