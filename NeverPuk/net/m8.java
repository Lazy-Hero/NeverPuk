package net;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import net.mf;
import net.z9;
import net.c9.b;
import net.c9.x;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class m8 {
   private static final Splitter A = Splitter.on('=').limit(2);
   private static final Pattern T = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");

   public static void M() {
      Map var1 = b.j();
      ArrayList var2 = new ArrayList();
      mf.O();
      String var3 = "optifine/lang/";
      String var4 = "en_us";
      String var5 = ".lang";
      var2.add(var3 + var4 + var5);
      if(!z9.d().wP.equals(var4)) {
         var2.add(var3 + z9.d().wP + var5);
      }

      String[] var6 = (String[])var2.toArray(new String[var2.size()]);
      k(z9.U(), var6, var1);
      x[] var7 = z9.w();
      int var8 = 0;
      if(var8 < var7.length) {
         x var9 = var7[var8];
         k(var9, var6, var1);
         ++var8;
      }

   }

   private static void k(x var0, String[] var1, Map var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         net.yz.m_ var5 = new net.yz.m_(var4);
         if(var0.E(var5)) {
            InputStream var6 = var0.q(var5);
            o(var6, var2);
         }
      }

   }

   public static void o(InputStream var0, Map var1) throws IOException {
      mf.O();
      Iterator var3 = IOUtils.readLines(var0, Charsets.UTF_8).iterator();
      if(var3.hasNext()) {
         String var4 = (String)var3.next();
         if(!var4.isEmpty() && var4.charAt(0) != 35) {
            String[] var5 = (String[])Iterables.toArray(A.split(var4), String.class);
            if(var5 != null && var5.length == 2) {
               String var6 = var5[0];
               String var7 = T.matcher(var5[1]).replaceAll("%$1s");
               var1.put(var6, var7);
            }
         }
      }

   }

   public static String i(String var0) {
      return b.x(var0, new Object[0]);
   }

   public static String T(String var0, String var1) {
      String var2 = b.x(var0, new Object[0]);
      return !var2.equals(var0)?var2:var1;
   }

   public static String b() {
      return b.x("options.on", new Object[0]);
   }

   public static String o() {
      return b.x("options.off", new Object[0]);
   }

   public static String Q() {
      return b.x("options.graphics.fast", new Object[0]);
   }

   public static String v() {
      return b.x("options.graphics.fancy", new Object[0]);
   }

   public static String N() {
      return b.x("generator.default", new Object[0]);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
