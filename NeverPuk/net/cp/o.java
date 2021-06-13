package net.cp;

import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;
import net.xn;
import net.cp.v;
import net.l.n;
import net.l.q;
import net.u.p;
import net.yv.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o implements net.l.h {
   private static final Logger N = LogManager.getLogger();
   private final q A;
   private final Long2ObjectMap F = new Long2ObjectOpenHashMap(8192) {
      protected void rehash(int var1) {
         if(var1 > this.key.length) {
            super.rehash(var1);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final r q;

   public o(r var1) {
      this.A = new n(var1, 0, 0);
      this.q = var1;
   }

   public void B(int var1, int var2) {
      q var3 = this.N(var1, var2);
      if(!var3.z()) {
         var3.J();
      }

      this.F.remove(p.M(var1, var2));
   }

   @Nullable
   public q e(int var1, int var2) {
      return (q)this.F.get(p.M(var1, var2));
   }

   public q J(int var1, int var2) {
      q var3 = new q(this.q, var1, var2);
      this.F.put(p.M(var1, var2), var3);
      var3.j(true);
      return var3;
   }

   public q N(int var1, int var2) {
      return (q)MoreObjects.firstNonNull(this.e(var1, var2), this.A);
   }

   public boolean Y() {
      v.s();
      long var2 = System.currentTimeMillis();
      ObjectIterator var4 = this.F.values().iterator();
      if(var4.hasNext()) {
         q var5 = (q)var4.next();
         var5.A(Long.compare(System.currentTimeMillis() - var2, 5L) > 0);
      }

      if(Long.compare(System.currentTimeMillis() - var2, 100L) > 0) {
         N.info("Warning: Clientside chunk ticking took {} ms", Long.valueOf(System.currentTimeMillis() - var2));
      }

      return false;
   }

   public String V() {
      return "MultiplayerChunkCache: " + this.F.size() + ", " + this.F.size();
   }

   public boolean S(int var1, int var2) {
      return this.F.containsKey(p.M(var1, var2));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
