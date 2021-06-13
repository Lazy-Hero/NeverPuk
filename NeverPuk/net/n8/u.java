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
import net.dq;
import net.xn;
import net.zk;
import net.n8.l;
import net.yz.m_;

public class u implements zk {
   private static final m_ s = new m_("recipe_unlocked");
   private final Map g = Maps.newHashMap();

   public m_ y() {
      return s;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      u.k var4 = (u.k)this.g.get(var1);
      if(var4 == null) {
         var4 = new u.k(var1);
         this.g.put(var1, var4);
      }

      var4.d(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      u.k var4 = (u.k)this.g.get(var1);
      if(var4 != null) {
         var4.U(var2);
         if(var4.A()) {
            this.g.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.g.remove(var1);
   }

   public u.x R(JsonObject var1, JsonDeserializationContext var2) {
      m_ var3 = new m_(net.yz.c.X(var1, "recipe"));
      net.cr.s var4 = net.cr.n.o(var3);
      throw new JsonSyntaxException("Unknown recipe \'" + var3 + "\'");
   }

   public void M(net.r.h var1, net.cr.s var2) {
      u.k var3 = (u.k)this.g.get(var1.S());
      var3.p(var2);
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   static class k {
      private final dq U;
      private final Set c = Sets.newHashSet();

      public k(dq var1) {
         this.U = var1;
      }

      public boolean A() {
         return this.c.isEmpty();
      }

      public void d(zk.l var1) {
         this.c.add(var1);
      }

      public void U(zk.l var1) {
         this.c.remove(var1);
      }

      public void p(net.cr.s var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.c.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((u.x)var5.H()).L(var1)) {
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
               var7.T(this.U);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class x extends l {
      private final net.cr.s I;

      public x(net.cr.s var1) {
         super(u.s);
         this.I = var1;
      }

      public boolean L(net.cr.s var1) {
         return this.I == var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
