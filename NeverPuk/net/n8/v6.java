package net.n8;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.dq;
import net.xn;
import net.zk;
import net.n0.ks;
import net.n8.l;
import net.n8.vg;
import net.yz.m_;

public class v6 implements zk {
   private static final m_ B = new m_("used_totem");
   private final Map g = Maps.newHashMap();

   public m_ y() {
      return B;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      v6.p var4 = (v6.p)this.g.get(var1);
      if(var4 == null) {
         var4 = new v6.p(var1);
         this.g.put(var1, var4);
      }

      var4.H(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      v6.p var4 = (v6.p)this.g.get(var1);
      if(var4 != null) {
         var4.G(var2);
         if(var4.B()) {
            this.g.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.g.remove(var1);
   }

   public v6.q Q(JsonObject var1, JsonDeserializationContext var2) {
      vg var3 = vg.c(var1.get("item"));
      return new v6.q(var3);
   }

   public void h(net.r.h var1, ks var2) {
      v6.p var3 = (v6.p)this.g.get(var1.S());
      var3.G(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class p {
      private final dq F;
      private final Set X = Sets.newHashSet();

      public p(dq var1) {
         this.F = var1;
      }

      public boolean B() {
         return this.X.isEmpty();
      }

      public void H(zk.l var1) {
         this.X.add(var1);
      }

      public void G(zk.l var1) {
         this.X.remove(var1);
      }

      public void G(ks var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.X.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((v6.q)var5.H()).X(var1)) {
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
               var7.T(this.F);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class q extends l {
      private final vg e;

      public q(vg var1) {
         super(v6.B);
         this.e = var1;
      }

      public boolean X(ks var1) {
         return this.e.m(var1);
      }
   }
}
