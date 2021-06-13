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
import net.n8.vx;
import net.yz.m_;

public class s implements zk {
   private final m_ R;
   private final Map S = Maps.newHashMap();

   public s(m_ var1) {
      this.R = var1;
   }

   public m_ y() {
      return this.R;
   }

   public void I(dq var1, zk.l var2) {
      l.O();
      s.a var4 = (s.a)this.S.get(var1);
      if(var4 == null) {
         var4 = new s.a(var1);
         this.S.put(var1, var4);
      }

      var4.L(var2);
   }

   public void Z(dq var1, zk.l var2) {
      l.O();
      s.a var4 = (s.a)this.S.get(var1);
      if(var4 != null) {
         var4.w(var2);
         if(var4.t()) {
            this.S.remove(var1);
         }
      }

   }

   public void k(dq var1) {
      this.S.remove(var1);
   }

   public s.e p(JsonObject var1, JsonDeserializationContext var2) {
      vx var3 = vx.n(var1);
      return new s.e(this.R, var3);
   }

   public void o(net.r.h var1) {
      l.O();
      s.a var3 = (s.a)this.S.get(var1.S());
      if(var3 != null) {
         var3.w(var1.j(), var1.b, var1.hS, var1.hr);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   static class a {
      private final dq y;
      private final Set s = Sets.newHashSet();

      public a(dq var1) {
         this.y = var1;
      }

      public boolean t() {
         return this.s.isEmpty();
      }

      public void L(zk.l var1) {
         this.s.add(var1);
      }

      public void w(zk.l var1) {
         this.s.remove(var1);
      }

      public void w(net.yv.d var1, double var2, double var4, double var6) {
         l.O();
         ArrayList var9 = null;
         Iterator var10 = this.s.iterator();
         if(var10.hasNext()) {
            zk.l var11 = (zk.l)var10.next();
            if(((s.e)var11.H()).o(var1, var2, var4, var6)) {
               if(var9 == null) {
                  var9 = Lists.newArrayList();
               }

               var9.add(var11);
            }
         }

         if(var9 != null) {
            var10 = var9.iterator();
            if(var10.hasNext()) {
               zk.l var13 = (zk.l)var10.next();
               var13.T(this.y);
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class e extends l {
      private final vx B;

      public e(m_ var1, vx var2) {
         super(var1);
         this.B = var2;
      }

      public boolean o(net.yv.d var1, double var2, double var4, double var6) {
         return this.B.C(var1, var2, var4, var6);
      }
   }
}
