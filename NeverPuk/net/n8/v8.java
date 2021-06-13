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

public class v8 implements zk {
   private static final m_ H = new m_("bred_animals");
   private final Map Z = Maps.newHashMap();

   public m_ y() {
      return H;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      v8.q var4 = (v8.q)this.Z.get(var1);
      if(var4 == null) {
         var4 = new v8.q(var1);
         this.Z.put(var1, var4);
      }

      var4.o(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      v8.q var4 = (v8.q)this.Z.get(var1);
      if(var4 != null) {
         var4.q(var2);
         if(var4.D()) {
            this.Z.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.Z.remove(var1);
   }

   public v8.s C(JsonObject var1, JsonDeserializationContext var2) {
      g var3 = g.Y(var1.get("parent"));
      g var4 = g.Y(var1.get("partner"));
      g var5 = g.Y(var1.get("child"));
      return new v8.s(var3, var4, var5);
   }

   public void g(net.r.h var1, net.yn.w var2, net.yn.w var3, net.ne.j var4) {
      v8.q var5 = (v8.q)this.Z.get(var1.S());
      var5.o(var1, var2, var3, var4);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class q {
      private final dq o;
      private final Set V = Sets.newHashSet();

      public q(dq var1) {
         this.o = var1;
      }

      public boolean D() {
         return this.V.isEmpty();
      }

      public void o(zk.l var1) {
         this.V.add(var1);
      }

      public void q(zk.l var1) {
         this.V.remove(var1);
      }

      public void o(net.r.h var1, net.yn.w var2, net.yn.w var3, net.ne.j var4) {
         l.O();
         ArrayList var6 = null;
         Iterator var7 = this.V.iterator();
         if(var7.hasNext()) {
            zk.l var8 = (zk.l)var7.next();
            if(((v8.s)var8.H()).G(var1, var2, var3, var4)) {
               if(var6 == null) {
                  var6 = Lists.newArrayList();
               }

               var6.add(var8);
            }
         }

         if(var6 != null) {
            var7 = var6.iterator();
            if(var7.hasNext()) {
               zk.l var10 = (zk.l)var7.next();
               var10.T(this.o);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class s extends l {
      private final g U;
      private final g h;
      private final g a;

      public s(g var1, g var2, g var3) {
         super(v8.H);
         this.U = var1;
         this.h = var2;
         this.a = var3;
      }

      public boolean G(net.r.h var1, net.yn.w var2, net.yn.w var3, net.ne.j var4) {
         String var5 = l.O();
         return !this.a.k(var1, var4)?false:this.U.k(var1, var2) && this.h.k(var1, var3) || this.U.k(var1, var3) && this.h.k(var1, var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
