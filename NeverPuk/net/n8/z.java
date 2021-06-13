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
import net.n8.x;
import net.yz.m_;

public class z implements zk {
   private static final m_ K = new m_("construct_beacon");
   private final Map b = Maps.newHashMap();

   public m_ y() {
      return K;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      net.n8.z var4 = (net.n8.z)this.b.get(var1);
      if(var4 == null) {
         var4 = new net.n8.z(var1);
         this.b.put(var1, var4);
      }

      var4.Q(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      net.n8.z var4 = (net.n8.z)this.b.get(var1);
      if(var4 != null) {
         var4.X(var2);
         if(var4.g()) {
            this.b.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.b.remove(var1);
   }

   public net.n8.z X(JsonObject var1, JsonDeserializationContext var2) {
      x var3 = x.G(var1.get("level"));
      return new net.n8.z(var3);
   }

   public void U(net.r.h var1, net.ni.h var2) {
      net.n8.z var3 = (net.n8.z)this.b.get(var1.S());
      var3.d(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class v extends l {
      private final x w;

      public v(x var1) {
         super(net.n8.z.K);
         this.w = var1;
      }

      public boolean z(net.ni.h var1) {
         return this.w.e((float)var1.w());
      }
   }

   static class y {
      private final dq J;
      private final Set b = Sets.newHashSet();

      public y(dq var1) {
         this.J = var1;
      }

      public boolean g() {
         return this.b.isEmpty();
      }

      public void Q(zk.l var1) {
         this.b.add(var1);
      }

      public void X(zk.l var1) {
         this.b.remove(var1);
      }

      public void d(net.ni.h var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.b.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((net.n8.z)var5.H()).z(var1)) {
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
               var7.T(this.J);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
