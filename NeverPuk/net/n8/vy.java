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

public class vy implements zk {
   private static final m_ s = new m_("summoned_entity");
   private final Map J = Maps.newHashMap();

   public m_ y() {
      return s;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      vy.m var4 = (vy.m)this.J.get(var1);
      if(var4 == null) {
         var4 = new vy.m(var1);
         this.J.put(var1, var4);
      }

      var4.b(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      vy.m var4 = (vy.m)this.J.get(var1);
      if(var4 != null) {
         var4.S(var2);
         if(var4.u()) {
            this.J.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.J.remove(var1);
   }

   public vy.d Z(JsonObject var1, JsonDeserializationContext var2) {
      g var3 = g.Y(var1.get("entity"));
      return new vy.d(var3);
   }

   public void g(net.r.h var1, net.ne.l var2) {
      vy.m var3 = (vy.m)this.J.get(var1.S());
      var3.e(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class d extends l {
      private final g S;

      public d(g var1) {
         super(vy.s);
         this.S = var1;
      }

      public boolean K(net.r.h var1, net.ne.l var2) {
         return this.S.k(var1, var2);
      }
   }

   static class m {
      private final dq z;
      private final Set I = Sets.newHashSet();

      public m(dq var1) {
         this.z = var1;
      }

      public boolean u() {
         return this.I.isEmpty();
      }

      public void b(zk.l var1) {
         this.I.add(var1);
      }

      public void S(zk.l var1) {
         this.I.remove(var1);
      }

      public void e(net.r.h var1, net.ne.l var2) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.I.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((vy.d)var6.H()).K(var1, var2)) {
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
               var8.T(this.z);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
