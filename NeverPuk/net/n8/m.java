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
import net.nk.fu;
import net.yz.m_;

public class m implements zk {
   private static final m_ f = new m_("cured_zombie_villager");
   private final Map O = Maps.newHashMap();

   public m_ y() {
      return f;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      m.t var4 = (m.t)this.O.get(var1);
      if(var4 == null) {
         var4 = new m.t(var1);
         this.O.put(var1, var4);
      }

      var4.w(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      m.t var4 = (m.t)this.O.get(var1);
      if(var4 != null) {
         var4.a(var2);
         if(var4.E()) {
            this.O.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.O.remove(var1);
   }

   public m.h Q(JsonObject var1, JsonDeserializationContext var2) {
      g var3 = g.Y(var1.get("zombie"));
      g var4 = g.Y(var1.get("villager"));
      return new m.h(var3, var4);
   }

   public void N(net.r.h var1, fu var2, net.yn.s var3) {
      m.t var4 = (m.t)this.O.get(var1.S());
      var4.l(var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class h extends l {
      private final g k;
      private final g B;

      public h(g var1, g var2) {
         super(m.f);
         this.k = var1;
         this.B = var2;
      }

      public boolean L(net.r.h var1, fu var2, net.yn.s var3) {
         String var4 = l.O();
         return !this.k.k(var1, var2)?false:this.B.k(var1, var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class t {
      private final dq R;
      private final Set L = Sets.newHashSet();

      public t(dq var1) {
         this.R = var1;
      }

      public boolean E() {
         return this.L.isEmpty();
      }

      public void w(zk.l var1) {
         this.L.add(var1);
      }

      public void a(zk.l var1) {
         this.L.remove(var1);
      }

      public void l(net.r.h var1, fu var2, net.yn.s var3) {
         l.O();
         ArrayList var5 = null;
         Iterator var6 = this.L.iterator();
         if(var6.hasNext()) {
            zk.l var7 = (zk.l)var6.next();
            if(((m.h)var7.H()).L(var1, var2, var3)) {
               if(var5 == null) {
                  var5 = Lists.newArrayList();
               }

               var5.add(var7);
            }
         }

         if(var5 != null) {
            var6 = var5.iterator();
            if(var6.hasNext()) {
               zk.l var9 = (zk.l)var6.next();
               var9.T(this.R);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
