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
import net.n8.g;
import net.n8.l;
import net.n8.vg;
import net.yz.m_;

public class vd implements zk {
   private static final m_ L = new m_("villager_trade");
   private final Map U = Maps.newHashMap();

   public m_ y() {
      return L;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      vd.b var4 = (vd.b)this.U.get(var1);
      if(var4 == null) {
         var4 = new vd.b(var1);
         this.U.put(var1, var4);
      }

      var4.l(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      vd.b var4 = (vd.b)this.U.get(var1);
      if(var4 != null) {
         var4.I(var2);
         if(var4.N()) {
            this.U.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.U.remove(var1);
   }

   public vd.e y(JsonObject var1, JsonDeserializationContext var2) {
      g var3 = g.Y(var1.get("villager"));
      vg var4 = vg.c(var1.get("item"));
      return new vd.e(var3, var4);
   }

   public void r(net.r.h var1, net.yn.s var2, ks var3) {
      vd.b var4 = (vd.b)this.U.get(var1.S());
      var4.q(var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class b {
      private final dq f;
      private final Set s = Sets.newHashSet();

      public b(dq var1) {
         this.f = var1;
      }

      public boolean N() {
         return this.s.isEmpty();
      }

      public void l(zk.l var1) {
         this.s.add(var1);
      }

      public void I(zk.l var1) {
         this.s.remove(var1);
      }

      public void q(net.r.h var1, net.yn.s var2, ks var3) {
         l.O();
         ArrayList var5 = null;
         Iterator var6 = this.s.iterator();
         if(var6.hasNext()) {
            zk.l var7 = (zk.l)var6.next();
            if(((vd.e)var7.H()).s(var1, var2, var3)) {
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
               var9.T(this.f);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class e extends l {
      private final g U;
      private final vg O;

      public e(g var1, vg var2) {
         super(vd.L);
         this.U = var1;
         this.O = var2;
      }

      public boolean s(net.r.h var1, net.yn.s var2, ks var3) {
         String var4 = l.O();
         return !this.U.k(var1, var2)?false:this.O.m(var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
