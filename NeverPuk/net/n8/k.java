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
import net.n8.g;
import net.n8.l;
import net.yz.m_;

public class k implements zk {
   private static final m_ R = new m_("tame_animal");
   private final Map h = Maps.newHashMap();

   public m_ y() {
      return R;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      k.d var4 = (k.d)this.h.get(var1);
      if(var4 == null) {
         var4 = new k.d(var1);
         this.h.put(var1, var4);
      }

      var4.N(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      k.d var4 = (k.d)this.h.get(var1);
      if(var4 != null) {
         var4.b(var2);
         if(var4.e()) {
            this.h.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.h.remove(var1);
   }

   public k.p R(JsonObject var1, JsonDeserializationContext var2) {
      g var3 = g.Y(var1.get("entity"));
      return new k.p(var3);
   }

   public void I(net.r.h var1, net.yn.w var2) {
      k.d var3 = (k.d)this.h.get(var1.S());
      var3.d(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class d {
      private final dq H;
      private final Set U = Sets.newHashSet();

      public d(dq var1) {
         this.H = var1;
      }

      public boolean e() {
         return this.U.isEmpty();
      }

      public void N(zk.l var1) {
         this.U.add(var1);
      }

      public void b(zk.l var1) {
         this.U.remove(var1);
      }

      public void d(net.r.h var1, net.yn.w var2) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.U.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((k.p)var6.H()).r(var1, var2)) {
               if(var4 == null) {
                  var4 = Lists.newArrayList();
               }

               var4.add(var6);
            }
         }

         if(var4 != null) {
            var5 = var4.iterator();
            if(var5.hasNext()) {
               zk.l var8 = (zk.l)var5.next();
               var8.T(this.H);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class p extends l {
      private final g A;

      public p(g var1) {
         super(k.R);
         this.A = var1;
      }

      public boolean r(net.r.h var1, net.yn.w var2) {
         return this.A.k(var1, var2);
      }
   }
}
