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
import net.n8.x;
import net.yz.m_;

public class p implements zk {
   private static final m_ n = new m_("item_durability_changed");
   private final Map W = Maps.newHashMap();

   public m_ y() {
      return n;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      p.n var4 = (p.n)this.W.get(var1);
      if(var4 == null) {
         var4 = new p.n(var1);
         this.W.put(var1, var4);
      }

      var4.y(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      p.n var4 = (p.n)this.W.get(var1);
      if(var4 != null) {
         var4.Q(var2);
         if(var4.L()) {
            this.W.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.W.remove(var1);
   }

   public p.y u(JsonObject var1, JsonDeserializationContext var2) {
      vg var3 = vg.c(var1.get("item"));
      x var4 = x.G(var1.get("durability"));
      x var5 = x.G(var1.get("delta"));
      return new p.y(var3, var4, var5);
   }

   public void w(net.r.h var1, ks var2, int var3) {
      p.n var4 = (p.n)this.W.get(var1.S());
      var4.F(var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class n {
      private final dq L;
      private final Set k = Sets.newHashSet();

      public n(dq var1) {
         this.L = var1;
      }

      public boolean L() {
         return this.k.isEmpty();
      }

      public void y(zk.l var1) {
         this.k.add(var1);
      }

      public void Q(zk.l var1) {
         this.k.remove(var1);
      }

      public void F(ks var1, int var2) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.k.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((p.y)var6.H()).B(var1, var2)) {
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
               var8.T(this.L);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class y extends l {
      private final vg n;
      private final x G;
      private final x w;

      public y(vg var1, x var2, x var3) {
         super(p.n);
         this.n = var1;
         this.G = var2;
         this.w = var3;
      }

      public boolean B(ks var1, int var2) {
         String var3 = l.O();
         return !this.n.m(var1)?false:(!this.G.e((float)(var1.Z() - var2))?false:this.w.e((float)(var1.z() - var2)));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
