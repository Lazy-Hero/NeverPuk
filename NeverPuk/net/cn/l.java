package net.cn;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.cn.e;
import net.cn.w;
import net.l.h;
import net.ny.j;
import net.yv.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l implements h {
   private static final Logger n = LogManager.getLogger();
   private final Set l = Sets.newHashSet();
   private final e T;
   private final j L;
   private final Long2ObjectMap p = new Long2ObjectOpenHashMap(8192);
   private final net.yv.d x;

   public l(net.yv.d var1, j var2, e var3) {
      this.x = var1;
      this.L = var2;
      this.T = var3;
   }

   public Collection V() {
      return this.p.values();
   }

   public void I(net.l.q var1) {
      if(this.x.F.z(var1.Q, var1.U)) {
         this.l.add(Long.valueOf(net.u.p.M(var1.Q, var1.U)));
         var1.J = true;
      }

   }

   public void f() {
      ObjectIterator var1 = this.p.values().iterator();

      while(var1.hasNext()) {
         net.l.q var2 = (net.l.q)var1.next();
         this.I(var2);
      }

   }

   @Nullable
   public net.l.q e(int var1, int var2) {
      long var3 = net.u.p.M(var1, var2);
      net.l.q var5 = (net.l.q)this.p.get(var3);
      var5.J = false;
      return var5;
   }

   @Nullable
   public net.l.q H(int var1, int var2) {
      net.l.q var3 = this.e(var1, var2);
      var3 = this.k(var1, var2);
      this.p.put(net.u.p.M(var1, var2), var3);
      var3.m();
      var3.m(this, this.T);
      return var3;
   }

   public net.l.q N(int var1, int var2) {
      w.a();
      net.l.q var4 = this.H(var1, var2);
      if(var4 == null) {
         long var5 = net.u.p.M(var1, var2);
         var4 = this.T.g(var1, var2);
         this.p.put(var5, var4);
         var4.m();
         var4.m(this, this.T);
      }

      return var4;
   }

   @Nullable
   private net.l.q k(int var1, int var2) {
      net.l.q var3 = this.L.y(this.x, var1, var2);
      var3.T(this.x.y());
      this.T.W(var3, var1, var2);
      return var3;
   }

   private void n(net.l.q var1) {
      this.L.I(this.x, var1);
   }

   private void S(net.l.q var1) {
      var1.T(this.x.y());
      this.L.N(this.x, var1);
   }

   public boolean C(boolean var1) {
      int var2 = 0;
      ArrayList var3 = Lists.newArrayList(this.p.values());

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         net.l.q var5 = (net.l.q)var3.get(var4);
         this.n(var5);
         if(var5.e(var1)) {
            this.S(var5);
            var5.w(false);
            ++var2;
            if(var2 == 24) {
               return false;
            }
         }
      }

      return true;
   }

   public void o() {
      this.L.x();
   }

   public boolean Y() {
      int var1 = w.a();
      if(!this.x.Y) {
         if(!this.l.isEmpty()) {
            Iterator var2 = this.l.iterator();
            int var3 = 0;
            if(var2.hasNext()) {
               Long var4 = (Long)var2.next();
               net.l.q var5 = (net.l.q)this.p.get(var4);
               if(var5.J) {
                  var5.J();
                  this.S(var5);
                  this.n(var5);
                  this.p.remove(var4);
                  ++var3;
               }

               var2.remove();
            }
         }

         this.L.V();
      }

      return false;
   }

   public boolean s() {
      return !this.x.Y;
   }

   public String V() {
      return "ServerChunkCache: " + this.p.size() + " Drop: " + this.l.size();
   }

   public List W(net.ne.q var1, net.u.j var2) {
      return this.T.x(var1, var2);
   }

   @Nullable
   public net.u.j p(r var1, String var2, net.u.j var3, boolean var4) {
      return this.T.P(var1, var2, var3, var4);
   }

   public boolean O(r var1, String var2, net.u.j var3) {
      return this.T.z(var1, var2, var3);
   }

   public int j() {
      return this.p.size();
   }

   public boolean W(int var1, int var2) {
      return this.p.containsKey(net.u.p.M(var1, var2));
   }

   public boolean S(int var1, int var2) {
      return this.p.containsKey(net.u.p.M(var1, var2)) || this.L.B(var1, var2);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
