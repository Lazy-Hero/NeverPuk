package net.v;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.n2.k;
import net.no.si;
import net.r.h;
import net.r.r;
import net.v.n;
import net.v.q;
import net.v.u;
import net.yz.aj;
import net.yz.x;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p extends u {
   private static final Logger S = LogManager.getLogger();
   private final net.nx.f H;
   private final File D;
   private final Set P = Sets.newHashSet();
   private int w = -300;

   public p(net.nx.f var1, File var2) {
      this.H = var1;
      this.D = var2;
   }

   public void l() {
      if(this.D.isFile()) {
         this.c.clear();
         this.c.putAll(this.m(FileUtils.readFileToString(this.D)));
      }

   }

   public void Z() {
      FileUtils.writeStringToFile(this.D, e(this.c));
   }

   public void H(r var1, n var2, int var3) {
      super.H(var1, var2, var3);
      this.P.add(var2);
   }

   private Set N() {
      HashSet var1 = Sets.newHashSet(this.P);
      this.P.clear();
      return var1;
   }

   public Map m(String var1) {
      n.I();
      JsonElement var3 = (new JsonParser()).parse(var1);
      if(!var3.isJsonObject()) {
         return Maps.newHashMap();
      } else {
         JsonObject var4 = var3.getAsJsonObject();
         HashMap var5 = Maps.newHashMap();
         Iterator var6 = var4.entrySet().iterator();
         if(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            n var8 = q.O((String)var7.getKey());
            aj var9 = new aj();
            if(((JsonElement)var7.getValue()).isJsonPrimitive() && ((JsonElement)var7.getValue()).getAsJsonPrimitive().isNumber()) {
               var9.p(((JsonElement)var7.getValue()).getAsInt());
            }

            if(((JsonElement)var7.getValue()).isJsonObject()) {
               JsonObject var10 = ((JsonElement)var7.getValue()).getAsJsonObject();
               if(var10.has("value") && var10.get("value").isJsonPrimitive() && var10.get("value").getAsJsonPrimitive().isNumber()) {
                  var9.p(var10.getAsJsonPrimitive("value").getAsInt());
               }

               if(var10.has("progress") && var8.J() != null) {
                  Constructor var11 = var8.J().getConstructor(new Class[0]);
                  x var12 = (x)var11.newInstance(new Object[0]);
                  var12.R(var10.get("progress"));
                  var9.X(var12);
               }
            }

            var5.put(var8, var9);
            S.warn("Invalid statistic in {}: Don\'t know what {} is", this.D, var7.getKey());
         }

         return var5;
      }
   }

   public static String e(Map var0) {
      JsonObject var1 = new JsonObject();

      for(Entry var3 : var0.entrySet()) {
         if(((aj)var3.getValue()).e() != null) {
            JsonObject var4 = new JsonObject();
            var4.addProperty("value", Integer.valueOf(((aj)var3.getValue()).j()));
            var4.add("progress", ((aj)var3.getValue()).e().K());
            var1.add(((n)var3.getKey()).r, var4);
         } else {
            var1.addProperty(((n)var3.getKey()).r, Integer.valueOf(((aj)var3.getValue()).j()));
         }
      }

      return var1.toString();
   }

   public void P() {
      this.P.addAll(this.c.keySet());
   }

   public void E(h var1) {
      int var2 = this.H.s();
      HashMap var3 = Maps.newHashMap();
      if(var2 - this.w > 300) {
         this.w = var2;

         for(n var5 : this.N()) {
            var3.put(var5, Integer.valueOf(this.H(var5)));
         }
      }

      var1.t1.h((k)(new si(var3)));
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
