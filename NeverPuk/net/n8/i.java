package net.n8;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.dq;
import net.xn;
import net.zk;
import net.n8.l;
import net.yz.m_;

public class i implements zk {
   public static final m_ W = new m_("tick");
   private final Map R = Maps.newHashMap();

   public m_ y() {
      return W;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      i.r var4 = (i.r)this.R.get(var1);
      if(var4 == null) {
         var4 = new i.r(var1);
         this.R.put(var1, var4);
      }

      var4.p(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      i.r var4 = (i.r)this.R.get(var1);
      if(var4 != null) {
         var4.x(var2);
         if(var4.u()) {
            this.R.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.R.remove(var1);
   }

   public i.s U(JsonObject var1, JsonDeserializationContext var2) {
      return new i.s();
   }

   public void F(net.r.h var1) {
      i.r var2 = (i.r)this.R.get(var1.S());
      var2.K();
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class r {
      private final dq G;
      private final Set e = Sets.newHashSet();

      public r(dq var1) {
         this.G = var1;
      }

      public boolean u() {
         return this.e.isEmpty();
      }

      public void p(zk.l var1) {
         this.e.add(var1);
      }

      public void x(zk.l var1) {
         this.e.remove(var1);
      }

      public void K() {
         l.O();
         Iterator var2 = Lists.newArrayList(this.e).iterator();
         if(var2.hasNext()) {
            zk.l var3 = (zk.l)var2.next();
            var3.T(this.G);
         }

      }
   }

   public static class s extends l {
      public s() {
         super(i.W);
      }
   }
}
