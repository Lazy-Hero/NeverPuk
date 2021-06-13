package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.b9;
import net.uv;
import net.xn;

public class o_ {
   public static Pattern Y = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
   public static Pattern S = Pattern.compile("\\s*/\\*\\s+([A-Z]+):(\\S+)\\s+\\*/.*");
   public static Pattern c = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern h = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern J = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
   public static Pattern j = Pattern.compile(".*composite[0-9]?\\.fsh");
   public static Pattern i = Pattern.compile(".*final\\.fsh");
   public static Pattern Z = Pattern.compile("[0-7N]*");

   public static b9 D(String var0) {
      uv.l();
      Matcher var2 = Y.matcher(var0);
      if(var2.matches()) {
         return new b9(1, var2.group(1), "", var0);
      } else {
         Matcher var3 = S.matcher(var0);
         if(var3.matches()) {
            return new b9(2, var3.group(1), var3.group(2), var0);
         } else {
            Matcher var4 = c.matcher(var0);
            if(var4.matches()) {
               return new b9(3, var4.group(1), var4.group(2), var0);
            } else {
               Matcher var5 = h.matcher(var0);
               if(var5.matches()) {
                  return new b9(4, var5.group(1), var5.group(2), var0);
               } else {
                  Matcher var6 = J.matcher(var0);
                  return var6.matches()?new b9(5, var6.group(1), var6.group(2), var0):null;
               }
            }
         }
      }
   }

   public static int W(String var0, String var1, int var2, int var3) {
      if(var0.length() != var1.length() + 1) {
         return -1;
      } else if(!var0.startsWith(var1)) {
         return -1;
      } else {
         int var4 = var0.charAt(var1.length()) - 48;
         return var4 >= var2 && var4 <= var3?var4:-1;
      }
   }

   public static int N(String var0) {
      boolean var1 = true;
      switch(var0.hashCode()) {
      case -903579360:
         if(var0.equals("shadow")) {
            var1 = false;
         }
         break;
      case 1235669239:
         if(var0.equals("watershadow")) {
            var1 = true;
         }
      }

      return W(var0, "shadowtex", 0, 1);
   }

   public static int k(String var0) {
      boolean var1 = true;
      switch(var0.hashCode()) {
      case -1560188349:
         if(var0.equals("shadowcolor")) {
            var1 = false;
         }
      default:
         return W(var0, "shadowcolor", 0, 1);
      }
   }

   public static int M(String var0) {
      return W(var0, "depthtex", 0, 2);
   }

   public static int V(String var0) {
      int var1 = W(var0, "gaux", 1, 4);
      return var1 + 3;
   }

   public static boolean W(String var0) {
      return j.matcher(var0).matches();
   }

   public static boolean j(String var0) {
      return i.matcher(var0).matches();
   }

   public static boolean f(String var0) {
      return Z.matcher(var0).matches();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
