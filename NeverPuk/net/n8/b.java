package net.n8;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.dq;
import net.xn;
import net.zk;
import net.n8.l;
import net.yz.m_;

public class b implements zk {
   private static final m_ w = new m_("brewed_potion");
   private final Map O = Maps.newHashMap();

   public m_ y() {
      return w;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      b.o var4 = (b.o)this.O.get(var1);
      if(var4 == null) {
         var4 = new b.o(var1);
         this.O.put(var1, var4);
      }

      var4.T(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      b.o var4 = (b.o)this.O.get(var1);
      if(var4 != null) {
         var4.M(var2);
         if(var4.h()) {
            this.O.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.O.remove(var1);
   }

   public b.c o(JsonObject var1, JsonDeserializationContext var2) {
      l.O();
      net.n_.b var4 = null;
      if(var1.has("potion")) {
         m_ var5 = new m_(net.yz.c.X(var1, "potion"));
         if(!net.n_.b.b.l(var5)) {
            throw new JsonSyntaxException("Unknown potion \'" + var5 + "\'");
         }

         var4 = (net.n_.b)net.n_.b.b.B(var5);
      }

      return new b.c(var4);
   }

   public void y(net.r.h var1, net.n_.b var2) {
      b.o var3 = (b.o)this.O.get(var1.S());
      var3.p(var2);
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   public static class c extends l {
      private final net.n_.b C;

      public c(@Nullable net.n_.b var1) {
         super(b.w);
         this.C = var1;
      }

      public boolean G(net.n_.b var1) {
         String var2 = l.O();
         return this.C == null || this.C == var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class o {
      private final dq t;
      private final Set p = Sets.newHashSet();

      public o(dq var1) {
         this.t = var1;
      }

      public boolean h() {
         return this.p.isEmpty();
      }

      public void T(zk.l var1) {
         this.p.add(var1);
      }

      public void M(zk.l var1) {
         this.p.remove(var1);
      }

      public void p(net.n_.b var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.p.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((b.c)var5.H()).G(var1)) {
               if(var3 == null) {
                  var3 = Lists.newArrayList();
               }

               var3.add(var5);
            }
         }

         if(var3 != null) {
            var4 = var3.iterator();
            if(var4.hasNext()) {
               zk.l var7 = (zk.l)var4.next();
               var7.T(this.t);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
