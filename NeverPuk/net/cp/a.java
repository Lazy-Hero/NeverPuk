package net.cp;

import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import net.cp.v;

public class a {
   private final String p;
   private final int n;

   private a(String var1, int var2) {
      this.p = var1;
      this.n = var2;
   }

   public String P() {
      return IDN.toASCII(this.p);
   }

   public int l() {
      return this.n;
   }

   public static a Y(String var0) {
      String[] var1 = v.s();
      if(var0 == null) {
         return null;
      } else {
         String[] var2 = var0.split(":");
         if(var0.startsWith("[")) {
            int var3 = var0.indexOf("]");
            if(var3 > 0) {
               String var4 = var0.substring(1, var3);
               String var5 = var0.substring(var3 + 1).trim();
               if(var5.startsWith(":") && !var5.isEmpty()) {
                  var5 = var5.substring(1);
                  String[] var10000 = new String[]{var4, var5};
               }

               var2 = new String[]{var4};
            }
         }

         if(var2.length > 2) {
            var2 = new String[]{var0};
         }

         String var6 = var2[0];
         if(var2.length > 1) {
            U(var2[1], 25565);
         } else {
            boolean var11 = true;
         }

         String[] var10 = i(var6);
         var6 = var10[0];
         int var8 = U(var10[1], 25565);
         return new a(var6, var8);
      }
   }

   private static String[] i(String var0) {
      String var10000 = "com.sun.jndi.dns.DnsContextFactory";
      Class.forName("com.sun.jndi.dns.DnsContextFactory");
      Hashtable var2 = new Hashtable();
      var2.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
      var2.put("java.naming.provider.url", "dns:");
      var2.put("com.sun.jndi.dns.timeout.retries", "1");
      InitialDirContext var3 = new InitialDirContext(var2);
      Attributes var4 = var3.getAttributes("_minecraft._tcp." + var0, new String[]{"SRV"});
      String[] var5 = var4.get("srv").get().toString().split(" ", 4);
      return new String[]{var5[3], var5[2]};
   }

   private static int U(String var0, int var1) {
      return Integer.parseInt(var0.trim());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
