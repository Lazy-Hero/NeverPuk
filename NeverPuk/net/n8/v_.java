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
import net.n8.l;
import net.yz.m_;

public class v_ implements zk {
   private static final m_ M = new m_("enter_block");
   private final Map U = Maps.newHashMap();

   public m_ y() {
      return M;
   }

   public void I(dq var1, zk.l var2) {
      v_.o var3 = (v_.o)this.U.get(var1);
      var3 = new v_.o(var1);
      this.U.put(var1, var3);
      var3.A(var2);
   }

   public void Z(dq var1, zk.l var2) {
      v_.o var3 = (v_.o)this.U.get(var1);
      var3.B(var2);
      if(var3.t()) {
         this.U.remove(var1);
      }

   }

   public void k(dq var1) {
      this.U.remove(var1);
   }

   public v_.h v(JsonObject var1, JsonDeserializationContext var2) {
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

      return new v_.h(var4, var12);
   }

   public void d(net.r.h var1, net.yw.n var2) {
      v_.o var3 = (v_.o)this.U.get(var1.S());
      var3.m(var2);
   }

   private static JsonSyntaxException a(JsonSyntaxException var0) {
      return var0;
   }

   public static class h extends l {
      private final net.y9.l X;
      private final Map B;

      public h(@Nullable net.y9.l var1, @Nullable Map var2) {
         super(v_.M);
         this.X = var1;
         this.B = var2;
      }

      public boolean F(net.yw.n var1) {
         String var2 = l.O();
         if(this.X != null && var1.Q() != this.X) {
            return false;
         } else {
            if(this.B != null) {
               Iterator var3 = this.B.entrySet().iterator();
               if(var3.hasNext()) {
                  Entry var4 = (Entry)var3.next();
                  if(var1.i((net.yr.h)var4.getKey()) != var4.getValue()) {
                     return false;
                  }
               }
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class o {
      private final dq S;
      private final Set Q = Sets.newHashSet();

      public o(dq var1) {
         this.S = var1;
      }

      public boolean t() {
         return this.Q.isEmpty();
      }

      public void A(zk.l var1) {
         this.Q.add(var1);
      }

      public void B(zk.l var1) {
         this.Q.remove(var1);
      }

      public void m(net.yw.n var1) {
         ArrayList var3 = null;
         l.O();
         Iterator var4 = this.Q.iterator();
         if(var4.hasNext()) {
            zk.l var5 = (zk.l)var4.next();
            if(((v_.h)var5.H()).F(var1)) {
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
               var7.T(this.S);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
