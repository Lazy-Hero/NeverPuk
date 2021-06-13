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
import net.n8.j;
import net.n8.l;
import net.n8.x;
import net.yz.m_;

public class h implements zk {
   private static final m_ z = new m_("levitation");
   private final Map q = Maps.newHashMap();

   public m_ y() {
      return z;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      h.a var4 = (h.a)this.q.get(var1);
      if(var4 == null) {
         var4 = new h.a(var1);
         this.q.put(var1, var4);
      }

      var4.X(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      h.a var4 = (h.a)this.q.get(var1);
      if(var4 != null) {
         var4.J(var2);
         if(var4.K()) {
            this.q.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.q.remove(var1);
   }

   public h.c s(JsonObject var1, JsonDeserializationContext var2) {
      j var3 = j.u(var1.get("distance"));
      x var4 = x.G(var1.get("duration"));
      return new h.c(var3, var4);
   }

   public void s(net.r.h var1, net.u.r var2, int var3) {
      h.a var4 = (h.a)this.q.get(var1.S());
      var4.V(var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class a {
      private final dq A;
      private final Set G = Sets.newHashSet();

      public a(dq var1) {
         this.A = var1;
      }

      public boolean K() {
         return this.G.isEmpty();
      }

      public void X(zk.l var1) {
         this.G.add(var1);
      }

      public void J(zk.l var1) {
         this.G.remove(var1);
      }

      public void V(net.r.h var1, net.u.r var2, int var3) {
         l.O();
         ArrayList var5 = null;
         Iterator var6 = this.G.iterator();
         if(var6.hasNext()) {
            zk.l var7 = (zk.l)var6.next();
            if(((h.c)var7.H()).L(var1, var2, var3)) {
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
               var9.T(this.A);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class c extends l {
      private final j T;
      private final x h;

      public c(j var1, x var2) {
         super(h.z);
         this.T = var1;
         this.h = var2;
      }

      public boolean L(net.r.h var1, net.u.r var2, int var3) {
         String var4 = l.O();
         return !this.T.C(var2.p, var2.H, var2.a, var1.b, var1.hS, var1.hr)?false:this.h.e((float)var3);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
