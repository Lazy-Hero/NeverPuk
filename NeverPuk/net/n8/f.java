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
import net.n8.v7;
import net.yz.m_;

public class f implements zk {
   private final Map b = Maps.newHashMap();
   private final m_ t;

   public f(m_ var1) {
      this.t = var1;
   }

   public m_ y() {
      return this.t;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      f.m var4 = (f.m)this.b.get(var1);
      if(var4 == null) {
         var4 = new f.m(var1);
         this.b.put(var1, var4);
      }

      var4.r(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      f.m var4 = (f.m)this.b.get(var1);
      if(var4 != null) {
         var4.H(var2);
         if(var4.y()) {
            this.b.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.b.remove(var1);
   }

   public f.c a(JsonObject var1, JsonDeserializationContext var2) {
      return new f.c(this.t, g.Y(var1.get("entity")), v7.P(var1.get("killing_blow")));
   }

   public void z(net.r.h var1, net.ne.l var2, net.yz.z var3) {
      f.m var4 = (f.m)this.b.get(var1.S());
      var4.k(var1, var2, var3);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c extends l {
      private final g G;
      private final v7 k;

      public c(m_ var1, g var2, v7 var3) {
         super(var1);
         this.G = var2;
         this.k = var3;
      }

      public boolean v(net.r.h var1, net.ne.l var2, net.yz.z var3) {
         String var4 = l.O();
         return this.k.U(var1, var3) && this.G.k(var1, var2);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class m {
      private final dq x;
      private final Set D = Sets.newHashSet();

      public m(dq var1) {
         this.x = var1;
      }

      public boolean y() {
         return this.D.isEmpty();
      }

      public void r(zk.l var1) {
         this.D.add(var1);
      }

      public void H(zk.l var1) {
         this.D.remove(var1);
      }

      public void k(net.r.h var1, net.ne.l var2, net.yz.z var3) {
         l.O();
         ArrayList var5 = null;
         Iterator var6 = this.D.iterator();
         if(var6.hasNext()) {
            zk.l var7 = (zk.l)var6.next();
            if(((f.c)var7.H()).v(var1, var2, var3)) {
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
               var9.T(this.x);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
