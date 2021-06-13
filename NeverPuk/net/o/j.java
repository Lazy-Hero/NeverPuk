package net.o;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.c1.c;
import net.g.x;
import net.n0.ks;
import net.n0.yp;
import net.o.a;
import net.u.t;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j extends a {
   private static final Logger b = LogManager.getLogger();
   private final List D = Collections.emptyList();

   public j(x[] var1, @Nullable List var2) {
      super(var1);
   }

   public ks K(ks var1, Random var2, net.y7.r var3) {
      String[] var4 = a.D();
      if(this.D.isEmpty()) {
         ArrayList var6 = Lists.newArrayList();
         Iterator var7 = c.i.iterator();
         if(var7.hasNext()) {
            c var8 = (c)var7.next();
            if(var1.Z() == net.nb.j.Yv || var8.U(var1)) {
               var6.add(var8);
            }
         }

         if(var6.isEmpty()) {
            b.warn("Couldn\'t find a compatible enchantment for {}", var1);
            return var1;
         }

         c var10000 = (c)var6.get(var2.nextInt(var6.size()));
      }

      c var5 = (c)this.D.get(var2.nextInt(this.D.size()));
      int var9 = t.A(var2, var5.m(), var5.h());
      if(var1.Z() == net.nb.j.Yv) {
         var1 = new ks(net.nb.j.r);
         yp.n(var1, new net.c1.x(var5, var9));
      }

      var1.N(var5, var9);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class n extends a.p {
      public n() {
         super(new m_("enchant_randomly"), j.class);
      }

      public void p(JsonObject var1, j var2, JsonSerializationContext var3) {
         if(!var2.D.isEmpty()) {
            JsonArray var4 = new JsonArray();
            Iterator var5 = var2.D.iterator();
            if(var5.hasNext()) {
               c var6 = (c)var5.next();
               m_ var7 = (m_)c.i.t(var6);
               throw new IllegalArgumentException("Don\'t know how to serialize enchantment " + var6);
            }

            var1.add("enchantments", var4);
         }

      }

      public j j(JsonObject var1, JsonDeserializationContext var2, x[] var3) {
         a.D();
         ArrayList var5 = Lists.newArrayList();
         if(var1.has("enchantments")) {
            Iterator var6 = net.yz.c.P(var1, "enchantments").iterator();
            if(var6.hasNext()) {
               JsonElement var7 = (JsonElement)var6.next();
               String var8 = net.yz.c.m(var7, "enchantment");
               c var9 = (c)c.i.B(new m_(var8));
               throw new JsonSyntaxException("Unknown enchantment \'" + var8 + "\'");
            }
         }

         return new j(var3, var5);
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }
   }
}
