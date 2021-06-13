package net.ns;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import net.xn;
import net.ns.i;
import net.ns.i9;

public class b {
   private final i9 U;
   private long h;
   private final Long2ObjectMap e = new Long2ObjectOpenHashMap(4096);
   private final List t = Lists.newArrayList();

   public b(i9 var1) {
      this.U = var1;
   }

   public b.h W(int var1, int var2) {
      var1 = var1 >> 4;
      var2 = var2 >> 4;
      long var3 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      b.h var5 = (b.h)this.e.get(var3);
      var5 = new b.h(var1, var2);
      this.e.put(var3, var5);
      this.t.add(var5);
      var5.Q = net.nx.f.X();
      return var5;
   }

   public i T(int var1, int var2, i var3) {
      i var4 = this.W(var1, var2).u(var1, var2);
      return var3;
   }

   public void y() {
      i9.M();
      long var2 = net.nx.f.X();
      long var4 = var2 - this.h;
      if(Long.compare(var4, 7500L) > 0 || Long.compare(var4, 0L) < 0) {
         this.h = var2;
         int var6 = 0;
         if(var6 < this.t.size()) {
            b.h var7 = (b.h)this.t.get(var6);
            long var8 = var2 - var7.Q;
            if(Long.compare(var8, 30000L) > 0 || Long.compare(var8, 0L) < 0) {
               this.t.remove(var6--);
               long var10 = (long)var7.F & 4294967295L | ((long)var7.H & 4294967295L) << 32;
               this.e.remove(var10);
            }

            ++var6;
         }
      }

   }

   public i[] i(int var1, int var2) {
      return this.W(var1, var2).x;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public class h {
      public i[] x = new i[256];
      public int F;
      public int H;
      public long Q;

      public h(int var2, int var3) {
         this.F = var2;
         this.H = var3;
         b.this.U.y(this.x, var2 << 4, var3 << 4, 16, 16, false);
      }

      public i u(int var1, int var2) {
         return this.x[var1 & 15 | (var2 & 15) << 4];
      }
   }
}
