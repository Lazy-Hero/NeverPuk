package net;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import net.mf;
import net.xn;
import net.z9;
import net.yw.n;

public class iu {
   private static final ArrayDeque l = new ArrayDeque();
   private static final int B = 10;

   private static synchronized int[] t(int var0) {
      int[] var1 = (int[])l.pollLast();
      if(var1.length < var0) {
         var1 = new int[var0];
      }

      return var1;
   }

   public static synchronized void W(int[] var0) {
      if(l.size() < 10) {
         l.add(var0);
      }

   }

   public static void main(String[] var0) throws Exception {
      short var1 = 4096;
      int var2 = 500000;
      V(var1, var2);
      Q(var1, var2);
      Y(var1, var2);
      p(var1, var2);
      Z(n.class, var1, var2);
      long var3 = V(var1, var2);
      long var5 = Q(var1, var2);
      long var7 = Y(var1, var2);
      long var9 = p(var1, var2);
      long var11 = Z(n.class, var1, var2);
      z9.v("New: " + var3);
      z9.v("Clone: " + var5);
      z9.v("NewObj: " + var7);
      z9.v("CloneObj: " + var9);
      z9.v("NewObjDyn: " + var11);
   }

   private static long Q(int var0, int var1) {
      long var3 = System.currentTimeMillis();
      int[] var5 = new int[var0];
      mf.O();
      int var6 = 0;
      if(var6 < var1) {
         int[] var10000 = (int[])var5.clone();
         ++var6;
      }

      long var9 = System.currentTimeMillis();
      return var9 - var3;
   }

   private static long V(int var0, int var1) {
      mf.O();
      long var3 = System.currentTimeMillis();
      int var5 = 0;
      if(var5 < var1) {
         int[] var10000 = (int[])((int[])Array.newInstance(Integer.TYPE, var0));
         ++var5;
      }

      long var8 = System.currentTimeMillis();
      return var8 - var3;
   }

   private static long p(int var0, int var1) {
      mf.O();
      long var3 = System.currentTimeMillis();
      n[] var5 = new n[var0];
      int var6 = 0;
      if(var6 < var1) {
         n[] var10000 = (n[])var5.clone();
         ++var6;
      }

      long var9 = System.currentTimeMillis();
      return var9 - var3;
   }

   private static long Y(int var0, int var1) {
      long var2 = System.currentTimeMillis();

      for(int var4 = 0; var4 < var1; ++var4) {
         n[] var10000 = new n[var0];
      }

      long var6 = System.currentTimeMillis();
      return var6 - var2;
   }

   private static long Z(Class var0, int var1, int var2) {
      long var3 = System.currentTimeMillis();

      for(int var5 = 0; var5 < var2; ++var5) {
         Object[] var10000 = (Object[])((Object[])Array.newInstance(var0, var1));
      }

      long var7 = System.currentTimeMillis();
      return var7 - var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
