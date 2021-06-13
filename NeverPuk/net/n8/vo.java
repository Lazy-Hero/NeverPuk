package net.n8;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.n8.l;
import net.n8.x;
import net.yz.m_;

public class vo {
   public static final vo r = new vo(Collections.emptyMap());
   private final Map n;

   public vo(Map var1) {
      this.n = var1;
   }

   public boolean I(net.ne.l var1) {
      return this == r?true:var1 instanceof net.ne.a && this.H(((net.ne.a)var1).x());
   }

   public boolean a(net.ne.a var1) {
      return this == r || this.H(var1.x());
   }

   public boolean H(Map var1) {
      if(this == r) {
         return true;
      } else {
         for(Entry var3 : this.n.entrySet()) {
            net.n_.i var4 = (net.n_.i)var1.get(var3.getKey());
            if(!((vo.q)var3.getValue()).o(var4)) {
               return false;
            }
         }

         return true;
      }
   }

   public static vo P(@Nullable JsonElement var0) {
      String var1 = l.O();
      if(var0 != null && !var0.isJsonNull()) {
         JsonObject var2 = net.yz.c.V(var0, "effects");
         HashMap var3 = Maps.newHashMap();
         Iterator var4 = var2.entrySet().iterator();
         if(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            m_ var6 = new m_((String)var5.getKey());
            net.n_.f var7 = (net.n_.f)net.n_.f.j.B(var6);
            if(var7 == null) {
               throw new JsonSyntaxException("Unknown effect \'" + var6 + "\'");
            }

            vo.q var8 = vo.q.d(net.yz.c.V((JsonElement)var5.getValue(), (String)var5.getKey()));
            var3.put(var7, var8);
         }

         return new vo(var3);
      } else {
         return r;
      }
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   public static class q {
      private final x i;
      private final x x;
      @Nullable
      private final Boolean g;
      @Nullable
      private final Boolean w;

      public q(x var1, x var2, @Nullable Boolean var3, @Nullable Boolean var4) {
         this.i = var1;
         this.x = var2;
         this.g = var3;
         this.w = var4;
      }

      public boolean o(@Nullable net.n_.i var1) {
         l.O();
         return false;
      }

      public static vo.q d(JsonObject var0) {
         x var1 = x.G(var0.get("amplifier"));
         x var2 = x.G(var0.get("duration"));
         Boolean var3 = var0.has("ambient")?Boolean.valueOf(net.yz.c.A(var0, "ambient")):null;
         Boolean var4 = var0.has("visible")?Boolean.valueOf(net.yz.c.A(var0, "visible")):null;
         return new vo.q(var1, var2, var3, var4);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
