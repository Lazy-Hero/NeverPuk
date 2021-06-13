package net;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.dn;
import net.xn;
import net.zk;
import net.n2.h;
import net.yz.c;

public class pg implements Comparable {
   private final Map D = Maps.newHashMap();
   private String[][] m = new String[0][];

   public void T(Map var1, String[][] var2) {
      Set var4 = var1.keySet();
      zk.l.p();
      Iterator var5 = this.D.entrySet().iterator();
      if(var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         if(!var4.contains(var6.getKey())) {
            var5.remove();
         }
      }

      Iterator var8 = var4.iterator();
      if(var8.hasNext()) {
         String var7 = (String)var8.next();
         if(!this.D.containsKey(var7)) {
            this.D.put(var7, new dn(this));
         }
      }

      this.m = var2;
   }

   public boolean l() {
      if(this.m.length == 0) {
         return false;
      } else {
         String[][] var1 = this.m;
         int var2 = var1.length;
         byte var3 = 0;
         if(var3 >= var2) {
            return true;
         } else {
            String[] var4 = var1[var3];
            boolean var5 = false;

            for(String var9 : var4) {
               dn var10 = this.M(var9);
               if(var10.F()) {
                  var5 = true;
                  break;
               }
            }

            return false;
         }
      }
   }

   public boolean M() {
      for(dn var2 : this.D.values()) {
         if(var2.F()) {
            return true;
         }
      }

      return false;
   }

   public boolean a(String var1) {
      dn var2 = (dn)this.D.get(var1);
      if(!var2.F()) {
         var2.m();
         return true;
      } else {
         return false;
      }
   }

   public boolean m(String var1) {
      dn var2 = (dn)this.D.get(var1);
      if(var2.F()) {
         var2.B();
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return "AdvancementProgress{criteria=" + this.D + ", requirements=" + Arrays.deepToString(this.m) + '}';
   }

   public void H(h var1) {
      var1.a(this.D.size());

      for(Entry var3 : this.D.entrySet()) {
         var1.R((String)var3.getKey());
         ((dn)var3.getValue()).j(var1);
      }

   }

   public static pg l(h var0) {
      pg var1 = new pg();
      int var2 = var0.q();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.D.put(var0.Z(32767), dn.e(var0, var1));
      }

      return var1;
   }

   @Nullable
   public dn M(String var1) {
      return (dn)this.D.get(var1);
   }

   public float F() {
      if(this.D.isEmpty()) {
         return 0.0F;
      } else {
         float var1 = (float)this.m.length;
         float var2 = (float)this.w();
         return var2 / var1;
      }
   }

   @Nullable
   public String y() {
      if(this.D.isEmpty()) {
         return null;
      } else {
         int var1 = this.m.length;
         if(var1 <= 1) {
            return null;
         } else {
            int var2 = this.w();
            return var2 + "/" + var1;
         }
      }
   }

   private int w() {
      int var1 = 0;

      for(String[] var5 : this.m) {
         boolean var6 = false;

         for(String var10 : var5) {
            dn var11 = this.M(var10);
            if(var11.F()) {
               var6 = true;
               break;
            }
         }

         ++var1;
      }

      return var1;
   }

   public Iterable d() {
      ArrayList var1 = Lists.newArrayList();

      for(Entry var3 : this.D.entrySet()) {
         if(!((dn)var3.getValue()).F()) {
            var1.add(var3.getKey());
         }
      }

      return var1;
   }

   public Iterable B() {
      ArrayList var1 = Lists.newArrayList();

      for(Entry var3 : this.D.entrySet()) {
         if(((dn)var3.getValue()).F()) {
            var1.add(var3.getKey());
         }
      }

      return var1;
   }

   @Nullable
   public Date p() {
      Date var1 = null;

      for(dn var3 : this.D.values()) {
         if(var3.F() && var3.r().before(var1)) {
            var1 = var3.r();
         }
      }

      return var1;
   }

   public int I(pg var1) {
      Date var2 = this.p();
      Date var3 = var1.p();
      return 1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class t implements JsonDeserializer, JsonSerializer {
      public JsonElement X(pg var1, Type var2, JsonSerializationContext var3) {
         zk.l.D();
         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         Iterator var7 = var1.D.entrySet().iterator();
         if(var7.hasNext()) {
            Entry var8 = (Entry)var7.next();
            dn var9 = (dn)var8.getValue();
            if(var9.F()) {
               var6.add((String)var8.getKey(), var9.h());
            }
         }

         if(!var6.entrySet().isEmpty()) {
            var5.add("criteria", var6);
         }

         var5.addProperty("done", Boolean.valueOf(var1.l()));
         return var5;
      }

      public pg Z(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = c.V(var1, "advancement");
         JsonObject var5 = c.l(var4, "criteria", new JsonObject());
         pg var6 = new pg();

         for(Entry var8 : var5.entrySet()) {
            String var9 = (String)var8.getKey();
            var6.D.put(var9, dn.y(var6, c.m((JsonElement)var8.getValue(), var9)));
         }

         return var6;
      }

      private static JsonParseException a(JsonParseException var0) {
         return var0;
      }
   }
}
