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
import net.n8.vo;
import net.yz.m_;

public class r implements zk {
   private static final m_ c = new m_("effects_changed");
   private final Map T = Maps.newHashMap();

   public m_ y() {
      return c;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      r.d var4 = (r.d)this.T.get(var1);
      if(var4 == null) {
         var4 = new r.d(var1);
         this.T.put(var1, var4);
      }

      var4.U(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      r.d var4 = (r.d)this.T.get(var1);
      if(var4 != null) {
         var4.M(var2);
         if(var4.m()) {
            this.T.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.T.remove(var1);
   }

   public r.n B(JsonObject var1, JsonDeserializationContext var2) {
      vo var3 = vo.P(var1.get("effects"));
      return new r.n(var3);
   }

   public void u(net.r.h var1) {
      r.d var2 = (r.d)this.T.get(var1.S());
      var2.l(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class d {
      private final dq t;
      private final Set L = Sets.newHashSet();

      public d(dq var1) {
         this.t = var1;
      }

      public boolean m() {
         return this.L.isEmpty();
      }

      public void U(zk.l var1) {
         this.L.add(var1);
      }

      public void M(zk.l var1) {
         this.L.remove(var1);
      }

      public void l(net.r.h var1) {
         l.O();
         ArrayList var3 = null;
         Iterator var4 = this.L.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((r.n)var5.H()).R(var1)) {
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
               var7.T(this.t);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class n extends l {
      private final vo M;

      public n(vo var1) {
         super(r.c);
         this.M = var1;
      }

      public boolean R(net.r.h var1) {
         return this.M.a((net.ne.a)var1);
      }
   }
}
