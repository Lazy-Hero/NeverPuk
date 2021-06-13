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

public class v implements zk {
   private static final m_ F = new m_("used_ender_eye");
   private final Map w = Maps.newHashMap();

   public m_ y() {
      return F;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      v.g var4 = (v.g)this.w.get(var1);
      if(var4 == null) {
         var4 = new v.g(var1);
         this.w.put(var1, var4);
      }

      var4.U(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      v.g var4 = (v.g)this.w.get(var1);
      if(var4 != null) {
         var4.f(var2);
         if(var4.X()) {
            this.w.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.w.remove(var1);
   }

   public v.d N(JsonObject var1, JsonDeserializationContext var2) {
      x var3 = x.G(var1.get("distance"));
      return new v.d(var3);
   }

   public void f(net.r.h var1, net.u.j var2) {
      v.g var3 = (v.g)this.w.get(var1.S());
      double var4 = var1.b - (double)var2.t();
      double var6 = var1.hr - (double)var2.y();
      var3.U(var4 * var4 + var6 * var6);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class d extends l {
      private final x n;

      public d(x var1) {
         super(v.F);
         this.n = var1;
      }

      public boolean b(double var1) {
         return this.n.g(var1);
      }
   }

   static class g {
      private final dq c;
      private final Set q = Sets.newHashSet();

      public g(dq var1) {
         this.c = var1;
      }

      public boolean X() {
         return this.q.isEmpty();
      }

      public void U(zk.l var1) {
         this.q.add(var1);
      }

      public void f(zk.l var1) {
         this.q.remove(var1);
      }

      public void U(double var1) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.q.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((v.d)var6.H()).b(var1)) {
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
               var8.T(this.c);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
