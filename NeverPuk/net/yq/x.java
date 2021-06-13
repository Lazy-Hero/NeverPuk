package net.yq;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Pattern;
import net.u.d;
import net.yq.e;
import org.apache.commons.io.IOUtils;

public class x {
   private static final Pattern S = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
   private static final Splitter N = Splitter.on('=').limit(2);
   private static final x O = new x();
   private final Map W = Maps.newHashMap();
   private long A;

   public x() {
      InputStream var1 = x.class.getResourceAsStream("/assets/minecraft/lang/en_us.lang");

      for(String var3 : IOUtils.readLines(var1, StandardCharsets.UTF_8)) {
         if(!var3.isEmpty() && var3.charAt(0) != 35) {
            String[] var4 = (String[])Iterables.toArray(N.split(var3), String.class);
            if(var4.length == 2) {
               String var5 = var4[0];
               String var6 = S.matcher(var4[1]).replaceAll("%$1s");
               this.W.put(var5, var6);
            }
         }
      }

      this.A = System.currentTimeMillis();
   }

   static x y() {
      return O;
   }

   public static synchronized void S(Map var0) {
      O.W.clear();
      e.M();
      O.W.putAll(var0);
      O.A = System.currentTimeMillis();
      d.h(new d[4]);
   }

   public synchronized String O(String var1) {
      return this.w(var1);
   }

   public synchronized String k(String var1, Object... var2) {
      e.C();
      String var4 = this.w(var1);
      return String.format(var4, var2);
   }

   private String w(String var1) {
      e.M();
      String var3 = (String)this.W.get(var1);
      return var3 == null?var1:var3;
   }

   public synchronized boolean e(String var1) {
      return this.W.containsKey(var1);
   }

   public long g() {
      return this.A;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
