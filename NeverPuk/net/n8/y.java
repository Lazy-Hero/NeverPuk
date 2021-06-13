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

public class y implements zk {
   private static final m_ f = new m_("consume_item");
   private final Map a = Maps.newHashMap();

   public m_ y() {
      return f;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      y.k var4 = (y.k)this.a.get(var1);
      if(var4 == null) {
         var4 = new y.k(var1);
         this.a.put(var1, var4);
      }

      var4.D(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      y.k var4 = (y.k)this.a.get(var1);
      if(var4 != null) {
         var4.f(var2);
         if(var4.g()) {
            this.a.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.a.remove(var1);
   }

   public y.l n(JsonObject var1, JsonDeserializationContext var2) {
      vg var3 = vg.c(var1.get("item"));
      return new y.l(var3);
   }

   public void l(net.r.h var1, ks var2) {
      y.k var3 = (y.k)this.a.get(var1.S());
      var3.K(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class k {
      private final dq r;
      private final Set V = Sets.newHashSet();

      public k(dq var1) {
         this.r = var1;
      }

      public boolean g() {
         return this.V.isEmpty();
      }

      public void D(zk.l var1) {
         this.V.add(var1);
      }

      public void f(zk.l var1) {
         this.V.remove(var1);
      }

      public void K(ks var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.V.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((y.l)var5.H()).q(var1)) {
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
               var7.T(this.r);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class l extends l {
      private final vg n;

      public l(vg var1) {
         super(y.f);
         this.n = var1;
      }

      public boolean q(ks var1) {
         return this.n.m(var1);
      }
   }
}
