package net.nf;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.nf.i;

public class r {
   private static int x = 256;
   private static final List a = Lists.newArrayList();
   private static final List F = Lists.newArrayList();
   private static final List Q = Lists.newArrayList();
   private static final List u = Lists.newArrayList();

   public static synchronized int[] J(int var0) {
      net.u.d[] var1 = i.D();
      if(var0 <= 256) {
         if(a.isEmpty()) {
            int[] var6 = new int[256];
            F.add(var6);
            return var6;
         } else {
            int[] var5 = (int[])a.remove(a.size() - 1);
            F.add(var5);
            return var5;
         }
      } else if(var0 > x) {
         x = var0;
         Q.clear();
         u.clear();
         int[] var4 = new int[x];
         u.add(var4);
         return var4;
      } else if(Q.isEmpty()) {
         int[] var3 = new int[x];
         u.add(var3);
         return var3;
      } else {
         int[] var2 = (int[])Q.remove(Q.size() - 1);
         u.add(var2);
         return var2;
      }
   }

   public static synchronized void d() {
      if(!Q.isEmpty()) {
         Q.remove(Q.size() - 1);
      }

      if(!a.isEmpty()) {
         a.remove(a.size() - 1);
      }

      Q.addAll(u);
      a.addAll(F);
      u.clear();
      F.clear();
   }

   public static synchronized String L() {
      return "cache: " + Q.size() + ", tcache: " + a.size() + ", allocated: " + u.size() + ", tallocated: " + F.size();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
