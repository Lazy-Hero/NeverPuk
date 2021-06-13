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
import net.n8.l;
import net.n8.w;
import net.yz.m_;

public class e implements zk {
   private static final m_ v = new m_("entity_hurt_player");
   private final Map l = Maps.newHashMap();

   public m_ y() {
      return v;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      e.u var4 = (e.u)this.l.get(var1);
      if(var4 == null) {
         var4 = new e.u(var1);
         this.l.put(var1, var4);
      }

      var4.Y(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      e.u var4 = (e.u)this.l.get(var1);
      if(var4 != null) {
         var4.g(var2);
         if(var4.V()) {
            this.l.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.l.remove(var1);
   }

   public e.p o(JsonObject var1, JsonDeserializationContext var2) {
      w var3 = w.N(var1.get("damage"));
      return new e.p(var3);
   }

   public void B(net.r.h var1, net.yz.z var2, float var3, float var4, boolean var5) {
      e.u var6 = (e.u)this.l.get(var1.S());
      var6.j(var1, var2, var3, var4, var5);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class p extends l {
      private final w w;

      public p(w var1) {
         super(e.v);
         this.w = var1;
      }

      public boolean x(net.r.h var1, net.yz.z var2, float var3, float var4, boolean var5) {
         return this.w.D(var1, var2, var3, var4, var5);
      }
   }

   static class u {
      private final dq i;
      private final Set k = Sets.newHashSet();

      public u(dq var1) {
         this.i = var1;
      }

      public boolean V() {
         return this.k.isEmpty();
      }

      public void Y(zk.l var1) {
         this.k.add(var1);
      }

      public void g(zk.l var1) {
         this.k.remove(var1);
      }

      public void j(net.r.h var1, net.yz.z var2, float var3, float var4, boolean var5) {
         l.O();
         ArrayList var7 = null;
         Iterator var8 = this.k.iterator();
         if(var8.hasNext()) {
            zk.l var9 = (zk.l)var8.next();
            if(((e.p)var9.H()).x(var1, var2, var3, var4, var5)) {
               if(var7 == null) {
                  var7 = Lists.newArrayList();
               }

               var7.add(var9);
            }
         }

         if(var7 != null) {
            var8 = var7.iterator();
            if(var8.hasNext()) {
               zk.l var11 = (zk.l)var8.next();
               var11.T(this.i);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
