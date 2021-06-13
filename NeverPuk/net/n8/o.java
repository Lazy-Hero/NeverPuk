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
import net.n8.vx;
import net.yz.m_;

public class o implements zk {
   private static final m_ j = new m_("nether_travel");
   private final Map M = Maps.newHashMap();

   public m_ y() {
      return j;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      o.i var4 = (o.i)this.M.get(var1);
      if(var4 == null) {
         var4 = new o.i(var1);
         this.M.put(var1, var4);
      }

      var4.G(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      o.i var4 = (o.i)this.M.get(var1);
      if(var4 != null) {
         var4.Q(var2);
         if(var4.J()) {
            this.M.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.M.remove(var1);
   }

   public o.t r(JsonObject var1, JsonDeserializationContext var2) {
      vx var3 = vx.n(var1.get("entered"));
      vx var4 = vx.n(var1.get("exited"));
      j var5 = j.u(var1.get("distance"));
      return new o.t(var3, var4, var5);
   }

   public void k(net.r.h var1, net.u.r var2) {
      l.O();
      o.i var4 = (o.i)this.M.get(var1.S());
      if(var4 != null) {
         var4.h(var1.j(), var2, var1.b, var1.hS, var1.hr);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   static class i {
      private final dq I;
      private final Set w = Sets.newHashSet();

      public i(dq var1) {
         this.I = var1;
      }

      public boolean J() {
         return this.w.isEmpty();
      }

      public void G(zk.l var1) {
         this.w.add(var1);
      }

      public void Q(zk.l var1) {
         this.w.remove(var1);
      }

      public void h(net.yv.d var1, net.u.r var2, double var3, double var5, double var7) {
         l.O();
         ArrayList var10 = null;
         Iterator var11 = this.w.iterator();
         if(var11.hasNext()) {
            zk.l var12 = (zk.l)var11.next();
            if(((o.t)var12.H()).G(var1, var2, var3, var5, var7)) {
               if(var10 == null) {
                  var10 = Lists.newArrayList();
               }

               var10.add(var12);
            }
         }

         if(var10 != null) {
            var11 = var10.iterator();
            if(var11.hasNext()) {
               zk.l var14 = (zk.l)var11.next();
               var14.T(this.I);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class t extends l {
      private final vx k;
      private final vx C;
      private final j R;

      public t(vx var1, vx var2, j var3) {
         super(o.j);
         this.k = var1;
         this.C = var2;
         this.R = var3;
      }

      public boolean G(net.yv.d var1, net.u.r var2, double var3, double var5, double var7) {
         String var9 = l.O();
         return !this.k.C(var1, var2.p, var2.H, var2.a)?false:(!this.C.C(var1, var3, var5, var7)?false:this.R.C(var2.p, var2.H, var2.a, var3, var5, var7));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
