package net.y7;

import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.xn;
import net.n0.ks;
import net.nl.z1;
import net.y7.a;
import net.y7.p;
import net.y7.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z {
   private static final Logger z = LogManager.getLogger();
   public static final net.y7.z G = new net.y7.z(new a[0]);
   private final a[] n;

   public z(a[] var1) {
      this.n = var1;
   }

   public List g(Random var1, r var2) {
      ArrayList var3 = Lists.newArrayList();
      if(var2.a(this)) {
         for(a var7 : this.n) {
            var7.G(var3, var1, var2);
         }

         var2.N(this);
      } else {
         z.warn("Detected infinite loop in loot tables");
      }

      return var3;
   }

   public void B(z1 var1, Random var2, r var3) {
      List var4 = this.g(var2, var3);
      List var5 = this.I(var1, var2);
      this.O(var4, var5.size(), var2);

      for(ks var7 : var4) {
         if(var5.isEmpty()) {
            z.warn("Tried to over-fill a container");
            return;
         }

         if(var7.B()) {
            var1.S(((Integer)var5.remove(var5.size() - 1)).intValue(), ks.a);
         } else {
            var1.S(((Integer)var5.remove(var5.size() - 1)).intValue(), var7);
         }
      }

   }

   private void O(List var1, int var2, Random var3) {
      p.h();
      ArrayList var5 = Lists.newArrayList();
      Iterator var6 = var1.iterator();
      if(var6.hasNext()) {
         ks var7 = (ks)var6.next();
         if(var7.B()) {
            var6.remove();
         }

         if(var7.U() > 1) {
            var5.add(var7);
            var6.remove();
         }
      }

      var2 = var2 - var1.size();
      if(!var5.isEmpty()) {
         ks var11 = (ks)var5.remove(net.u.t.A(var3, 0, var5.size() - 1));
         int var8 = net.u.t.A(var3, 1, var11.U() / 2);
         ks var9 = var11.w(var8);
         if(var11.U() > 1 && var3.nextBoolean()) {
            var5.add(var11);
         }

         var1.add(var11);
         if(var9.U() > 1 && var3.nextBoolean()) {
            var5.add(var9);
         }

         var1.add(var9);
      }

      var1.addAll(var5);
      Collections.shuffle(var1, var3);
   }

   private List I(z1 var1, Random var2) {
      ArrayList var3 = Lists.newArrayList();

      for(int var4 = 0; var4 < var1.e(); ++var4) {
         if(var1.A(var4).B()) {
            var3.add(Integer.valueOf(var4));
         }
      }

      Collections.shuffle(var3, var2);
      return var3;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class v implements JsonDeserializer, JsonSerializer {
      public net.y7.z W(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
         JsonObject var4 = net.yz.c.V(var1, "loot table");
         a[] var5 = (a[])net.yz.c.n(var4, "pools", new a[0], var3, a[].class);
         return new net.y7.z(var5);
      }

      public JsonElement p(net.y7.z var1, Type var2, JsonSerializationContext var3) {
         JsonObject var4 = new JsonObject();
         var4.add("pools", var3.serialize(var1.n));
         return var4;
      }
   }
}
