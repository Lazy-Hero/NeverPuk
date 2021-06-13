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

public class d implements zk {
   private static final m_ N = new m_("inventory_changed");
   private final Map u = Maps.newHashMap();

   public m_ y() {
      return N;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      d.t var4 = (d.t)this.u.get(var1);
      if(var4 == null) {
         var4 = new d.t(var1);
         this.u.put(var1, var4);
      }

      var4.B(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      d.t var4 = (d.t)this.u.get(var1);
      if(var4 != null) {
         var4.C(var2);
         if(var4.p()) {
            this.u.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.u.remove(var1);
   }

   public d.z K(JsonObject var1, JsonDeserializationContext var2) {
      JsonObject var4 = net.yz.c.l(var1, "slots", new JsonObject());
      l.O();
      x var5 = x.G(var4.get("occupied"));
      x var6 = x.G(var4.get("full"));
      x var7 = x.G(var4.get("empty"));
      vg[] var8 = vg.x(var1.get("items"));
      d.z var10000 = new d.z(var5, var6, var7, var8);
      net.u.d.h(new net.u.d[5]);
      return var10000;
   }

   public void c(net.r.h var1, net.r.i var2) {
      d.t var3 = (d.t)this.u.get(var1.S());
      var3.z(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class t {
      private final dq P;
      private final Set B = Sets.newHashSet();

      public t(dq var1) {
         this.P = var1;
      }

      public boolean p() {
         return this.B.isEmpty();
      }

      public void B(zk.l var1) {
         this.B.add(var1);
      }

      public void C(zk.l var1) {
         this.B.remove(var1);
      }

      public void z(net.r.i var1) {
         ArrayList var3 = null;
         l.O();
         Iterator var4 = this.B.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((d.z)var5.H()).f(var1)) {
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
               var7.T(this.P);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class z extends l {
      private final x Z;
      private final x F;
      private final x v;
      private final vg[] e;

      public z(x var1, x var2, x var3, vg[] var4) {
         super(d.N);
         this.Z = var1;
         this.F = var2;
         this.v = var3;
         this.e = var4;
      }

      public boolean f(net.r.i var1) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         l.O();
         ArrayList var6 = Lists.newArrayList(this.e);
         int var7 = 0;
         if(var7 < var1.e()) {
            ks var8 = var1.A(var7);
            if(var8.B()) {
               ++var4;
            }

            ++var5;
            if(var8.U() >= var8.j()) {
               ++var3;
            }

            Iterator var9 = var6.iterator();
            if(var9.hasNext()) {
               vg var10 = (vg)var9.next();
               if(var10.m(var8)) {
                  var9.remove();
               }
            }

            ++var7;
         }

         return !this.F.e((float)var3)?false:(!this.v.e((float)var4)?false:(!this.Z.e((float)var5)?false:var6.isEmpty()));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
