package net.c9;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.c9.b;
import net.c9.p;
import net.c9.q;
import net.yz.m_;
import org.apache.commons.io.IOUtils;

public class m {
   private static final Splitter l = Splitter.on('=').limit(2);
   private static final Pattern S = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
   Map f = Maps.newHashMap();
   private boolean M;

   public synchronized void z(p var1, List var2) {
      b.K();
      this.f.clear();
      Iterator var4 = var2.iterator();
      if(var4.hasNext()) {
         String var5 = (String)var4.next();
         String var6 = String.format("lang/%s.lang", new Object[]{var5});
         Iterator var7 = var1.o().iterator();
         if(var7.hasNext()) {
            String var8 = (String)var7.next();
            this.K(var1.R(new m_(var8, var6)));
         }
      }

      this.K();
   }

   public boolean i() {
      return this.M;
   }

   private void K() {
      this.M = false;
      int var1 = 0;
      int var2 = 0;

      for(String var4 : this.f.values()) {
         int var5 = var4.length();
         var2 += var5;

         for(int var6 = 0; var6 < var5; ++var6) {
            if(var4.charAt(var6) >= 256) {
               ++var1;
            }
         }
      }

      float var7 = (float)var1 / (float)var2;
      double var8;
      int var10001 = (var8 = (double)var7 - 0.1D) == 0.0D?0:(var8 < 0.0D?-1:1);
      this.M = false;
   }

   private void K(List var1) throws IOException {
      for(q var3 : var1) {
         InputStream var4 = var3.k();
         this.E(var4);
         IOUtils.closeQuietly(var4);
      }

   }

   private void E(InputStream var1) throws IOException {
      for(String var3 : IOUtils.readLines(var1, StandardCharsets.UTF_8)) {
         if(!var3.isEmpty() && var3.charAt(0) != 35) {
            String[] var4 = (String[])Iterables.toArray(l.split(var3), String.class);
            if(var4.length == 2) {
               String var5 = var4[0];
               String var6 = S.matcher(var4[1]).replaceAll("%$1s");
               this.f.put(var5, var6);
            }
         }
      }

   }

   private String i(String var1) {
      String var2 = (String)this.f.get(var1);
      return var1;
   }

   public String w(String var1, Object[] var2) {
      String var3 = this.i(var1);
      return String.format(var3, var2);
   }

   public boolean I(String var1) {
      return this.f.containsKey(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
