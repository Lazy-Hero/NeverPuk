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
import net.n8.w;
import net.yz.m_;

public class vr implements zk {
   private static final m_ b = new m_("player_hurt_entity");
   private final Map f = Maps.newHashMap();

   public m_ y() {
      return b;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      vr.g var4 = (vr.g)this.f.get(var1);
      if(var4 == null) {
         var4 = new vr.g(var1);
         this.f.put(var1, var4);
      }

      var4.e(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      vr.g var4 = (vr.g)this.f.get(var1);
      if(var4 != null) {
         var4.n(var2);
         if(var4.s()) {
            this.f.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.f.remove(var1);
   }

   public vr.c W(JsonObject var1, JsonDeserializationContext var2) {
      w var3 = w.N(var1.get("damage"));
      g var4 = g.Y(var1.get("entity"));
      return new vr.c(var3, var4);
   }

   public void E(net.r.h var1, net.ne.l var2, net.yz.z var3, float var4, float var5, boolean var6) {
      vr.g var7 = (vr.g)this.f.get(var1.S());
      var7.W(var1, var2, var3, var4, var5, var6);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c extends l {
      private final w A;
      private final g t;

      public c(w var1, g var2) {
         super(vr.b);
         this.A = var1;
         this.t = var2;
      }

      public boolean z(net.r.h var1, net.ne.l var2, net.yz.z var3, float var4, float var5, boolean var6) {
         String var7 = l.O();
         return !this.A.D(var1, var3, var4, var5, var6)?false:this.t.k(var1, var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class g {
      private final dq D;
      private final Set G = Sets.newHashSet();

      public g(dq var1) {
         this.D = var1;
      }

      public boolean s() {
         return this.G.isEmpty();
      }

      public void e(zk.l var1) {
         this.G.add(var1);
      }

      public void n(zk.l var1) {
         this.G.remove(var1);
      }

      public void W(net.r.h var1, net.ne.l var2, net.yz.z var3, float var4, float var5, boolean var6) {
         l.O();
         ArrayList var8 = null;
         Iterator var9 = this.G.iterator();
         if(var9.hasNext()) {
            zk.l var10 = (zk.l)var9.next();
            if(((vr.c)var10.H()).z(var1, var2, var3, var4, var5, var6)) {
               if(var8 == null) {
                  var8 = Lists.newArrayList();
               }

               var8.add(var10);
            }
         }

         if(var8 != null) {
            var9 = var8.iterator();
            if(var9.hasNext()) {
               zk.l var12 = (zk.l)var9.next();
               var12.T(this.D);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
