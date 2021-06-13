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

public class a implements zk {
   private static final m_ x = new m_("enchanted_item");
   private final Map c = Maps.newHashMap();

   public m_ y() {
      return x;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      a.r var4 = (a.r)this.c.get(var1);
      if(var4 == null) {
         var4 = new a.r(var1);
         this.c.put(var1, var4);
      }

      var4.P(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      a.r var4 = (a.r)this.c.get(var1);
      if(var4 != null) {
         var4.b(var2);
         if(var4.I()) {
            this.c.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.c.remove(var1);
   }

   public a.i U(JsonObject var1, JsonDeserializationContext var2) {
      vg var3 = vg.c(var1.get("item"));
      x var4 = x.G(var1.get("levels"));
      return new a.i(var3, var4);
   }

   public void n(net.r.h var1, ks var2, int var3) {
      a.r var4 = (a.r)this.c.get(var1.S());
      var4.j(var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class i extends l {
      private final vg X;
      private final x x;

      public i(vg var1, x var2) {
         super(a.x);
         this.X = var1;
         this.x = var2;
      }

      public boolean n(ks var1, int var2) {
         String var3 = l.O();
         return !this.X.m(var1)?false:this.x.e((float)var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class r {
      private final dq P;
      private final Set k = Sets.newHashSet();

      public r(dq var1) {
         this.P = var1;
      }

      public boolean I() {
         return this.k.isEmpty();
      }

      public void P(zk.l var1) {
         this.k.add(var1);
      }

      public void b(zk.l var1) {
         this.k.remove(var1);
      }

      public void j(ks var1, int var2) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.k.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((a.i)var6.H()).n(var1, var2)) {
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
               var8.T(this.P);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
