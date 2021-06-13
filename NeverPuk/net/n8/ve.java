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
import javax.annotation.Nullable;
import net.dq;
import net.xn;
import net.zk;
import net.n8.l;
import net.yz.m_;

public class ve implements zk {
   private static final m_ W = new m_("changed_dimension");
   private final Map k = Maps.newHashMap();

   public m_ y() {
      return W;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      ve.b var4 = (ve.b)this.k.get(var1);
      if(var4 == null) {
         var4 = new ve.b(var1);
         this.k.put(var1, var4);
      }

      var4.d(var2);
   }

   public void Z(dq var1, zk.l var2) {
      ve.b var3 = (ve.b)this.k.get(var1);
      var3.t(var2);
      if(var3.z()) {
         this.k.remove(var1);
      }

   }

   public void k(dq var1) {
      this.k.remove(var1);
   }

   public ve.l Z(JsonObject var1, JsonDeserializationContext var2) {
      String var3 = l.O();
      net.yv.h var4 = var1.has("from")?net.yv.h.u(net.yz.c.X(var1, "from")):null;
      net.yv.h var5 = var1.has("to")?net.yv.h.u(net.yz.c.X(var1, "to")):null;
      return new ve.l(var4, var5);
   }

   public void l(net.r.h var1, net.yv.h var2, net.yv.h var3) {
      ve.b var4 = (ve.b)this.k.get(var1.S());
      var4.X(var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class b {
      private final dq k;
      private final Set D = Sets.newHashSet();

      public b(dq var1) {
         this.k = var1;
      }

      public boolean z() {
         return this.D.isEmpty();
      }

      public void d(zk.l var1) {
         this.D.add(var1);
      }

      public void t(zk.l var1) {
         this.D.remove(var1);
      }

      public void X(net.yv.h var1, net.yv.h var2) {
         l.O();
         ArrayList var4 = null;
         Iterator var5 = this.D.iterator();
         if(var5.hasNext()) {
            zk.l var6 = (zk.l)var5.next();
            if(((ve.l)var6.H()).R(var1, var2)) {
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
               var8.T(this.k);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class l extends l {
      @Nullable
      private final net.yv.h Z;
      @Nullable
      private final net.yv.h L;

      public l(@Nullable net.yv.h var1, @Nullable net.yv.h var2) {
         super(ve.W);
         this.Z = var1;
         this.L = var2;
      }

      public boolean R(net.yv.h var1, net.yv.h var2) {
         String var3 = l.O();
         return this.Z != null && this.Z != var1?false:this.L == null || this.L == var2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
