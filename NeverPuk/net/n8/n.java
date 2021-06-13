package net.n8;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.dq;
import net.xn;
import net.zk;
import net.n0.ks;
import net.n8.l;
import net.n8.vg;
import net.n8.vx;
import net.yz.m_;

public class n implements zk {
   private static final m_ u = new m_("placed_block");
   private final Map C = Maps.newHashMap();

   public m_ y() {
      return u;
   }

   public void I(dq var1, zk.l var2) {
      n.j var3 = (n.j)this.C.get(var1);
      var3 = new n.j(var1);
      this.C.put(var1, var3);
      var3.H(var2);
   }

   public void Z(dq var1, zk.l var2) {
      n.j var3 = (n.j)this.C.get(var1);
      var3.j(var2);
      if(var3.i()) {
         this.C.remove(var1);
      }

   }

   public void k(dq var1) {
      this.C.remove(var1);
   }

   public n.q j(JsonObject var1, JsonDeserializationContext var2) {
      l.O();
      net.y9.l var4 = null;
      if(var1.has("block")) {
         m_ var5 = new m_(net.yz.c.X(var1, "block"));
         if(!net.y9.l.m.l(var5)) {
            throw new JsonSyntaxException("Unknown block type \'" + var5 + "\'");
         }

         var4 = (net.y9.l)net.y9.l.m.B(var5);
      }

      HashMap var12 = null;
      if(var1.has("state")) {
         if(var4 == null) {
            throw new JsonSyntaxException("Can\'t define block state without a specific block type");
         }

         net.yw.q var6 = var4.j();
         Iterator var7 = net.yz.c.b(var1, "state").entrySet().iterator();
         if(var7.hasNext()) {
            Entry var8 = (Entry)var7.next();
            net.yr.h var9 = var6.D((String)var8.getKey());
            if(var9 == null) {
               throw new JsonSyntaxException("Unknown block state property \'" + (String)var8.getKey() + "\' for block \'" + net.y9.l.m.t(var4) + "\'");
            }

            String var10 = net.yz.c.m((JsonElement)var8.getValue(), (String)var8.getKey());
            Optional var11 = var9.y(var10);
            if(!var11.isPresent()) {
               throw new JsonSyntaxException("Invalid block state value \'" + var10 + "\' for property \'" + (String)var8.getKey() + "\' on block \'" + net.y9.l.m.t(var4) + "\'");
            }

            if(var12 == null) {
               var12 = Maps.newHashMap();
            }

            var12.put(var9, var11.get());
         }
      }

      vx var13 = vx.n(var1.get("location"));
      vg var14 = vg.c(var1.get("item"));
      n.q var10000 = new n.q(var4, var12, var13, var14);
      if(net.u.d.y() == null) {
         l.o("YcRjtb");
      }

      return var10000;
   }

   public void a(net.r.h var1, net.u.j var2, ks var3) {
      net.yw.n var4 = var1.hl.Z(var2);
      n.j var5 = (n.j)this.C.get(var1.S());
      var5.h(var4, var2, var1.j(), var3);
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   static class j {
      private final dq M;
      private final Set I = Sets.newHashSet();

      public j(dq var1) {
         this.M = var1;
      }

      public boolean i() {
         return this.I.isEmpty();
      }

      public void H(zk.l var1) {
         this.I.add(var1);
      }

      public void j(zk.l var1) {
         this.I.remove(var1);
      }

      public void h(net.yw.n var1, net.u.j var2, net.yv.d var3, ks var4) {
         ArrayList var6 = null;
         l.O();
         Iterator var7 = this.I.iterator();
         if(var7.hasNext()) {
            zk.l var8 = (zk.l)var7.next();
            if(((n.q)var8.H()).c(var1, var2, var3, var4)) {
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
               var10.T(this.M);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class q extends l {
      private final net.y9.l n;
      private final Map w;
      private final vx G;
      private final vg K;

      public q(@Nullable net.y9.l var1, @Nullable Map var2, vx var3, vg var4) {
         super(n.u);
         this.n = var1;
         this.w = var2;
         this.G = var3;
         this.K = var4;
      }

      public boolean c(net.yw.n var1, net.u.j var2, net.yv.d var3, ks var4) {
         String var5 = l.O();
         if(this.n != null && var1.Q() != this.n) {
            return false;
         } else {
            if(this.w != null) {
               Iterator var6 = this.w.entrySet().iterator();
               if(var6.hasNext()) {
                  Entry var7 = (Entry)var6.next();
                  if(var1.i((net.yr.h)var7.getKey()) != var7.getValue()) {
                     return false;
                  }
               }
            }

            return !this.G.W(var3, (float)var2.t(), (float)var2.h(), (float)var2.y())?false:this.K.m(var4);
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
