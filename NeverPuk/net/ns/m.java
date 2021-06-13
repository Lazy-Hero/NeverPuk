package net.ns;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import net.xn;
import net.ns.e;
import net.ns.i;
import net.ns.i9;
import net.w.f8;

public class m extends e {
   private static final LoadingCache A = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new m.c());
   private final f8 I = new f8();

   protected void K(i var1, net.yv.r var2, Random var3) {
      this.T(var2, var3);
      f8.i[] var5 = d(var2);
      i9.M();
      int var7 = var5.length;
      int var8 = 0;
      if(var8 < var7) {
         f8.i var9 = var5[var8];
         if(var9.S(this.o)) {
            this.I.c(var9);
            this.I.K(var2, var3, new net.u.j(var9.z(), 45, var9.I()));
         }

         ++var8;
      }

   }

   public static f8.i[] d(net.yv.r var0) {
      Random var1 = new Random(var0.a());
      long var2 = var1.nextLong() & 65535L;
      return (f8.i[])A.getUnchecked(Long.valueOf(var2));
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class c extends CacheLoader {
      private c() {
      }

      public f8.i[] P(Long var1) throws Exception {
         i9.M();
         ArrayList var3 = Lists.newArrayList(ContiguousSet.create(Range.closedOpen(Integer.valueOf(0), Integer.valueOf(10)), DiscreteDomain.integers()));
         Collections.shuffle(var3, new Random(var1.longValue()));
         f8.i[] var4 = new f8.i[10];
         int var5 = 0;
         int var6 = (int)(42.0D * Math.cos(2.0D * (-3.141592653589793D + 0.3141592653589793D * (double)var5)));
         int var7 = (int)(42.0D * Math.sin(2.0D * (-3.141592653589793D + 0.3141592653589793D * (double)var5)));
         int var8 = ((Integer)var3.get(var5)).intValue();
         int var9 = 2 + var8 / 3;
         int var10 = 76 + var8 * 3;
         boolean var11 = var8 == 1 || var8 == 2;
         var4[var5] = new f8.i(var6, var7, var9, var10, var11);
         ++var5;
         return var4;
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
