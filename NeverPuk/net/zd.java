package net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.mf;
import net.xn;
import net.z9;
import net.ym.b;
import net.ym.j;
import net.ym.t;
import net.yw.n;
import net.yz.aq;

public class zd {
   public static void K(j var0) {
      String var1 = mf.O();
      z9.v("Model: " + var0 + ", ao: " + var0.a() + ", gui3d: " + var0.M() + ", builtIn: " + var0.t() + ", particle: " + var0.o());
      aq[] var2 = aq.VALUES;
      int var3 = 0;
      if(var3 < var2.length) {
         aq var4 = var2[var3];
         List var5 = var0.h((n)null, var4, 0L);
         n(var4.f(), var5, "  ");
         ++var3;
      }

      List var7 = var0.h((n)null, (aq)null, 0L);
      n("General", var7, "  ");
   }

   private static void n(String var0, List var1, String var2) {
      for(Object var4 : var1) {
         i(var0, (t)var4, var2);
      }

   }

   public static void i(String var0, t var1, String var2) {
      z9.v(var2 + "Quad: " + var1.getClass().getName() + ", type: " + var0 + ", face: " + var1.c() + ", tint: " + var1.N() + ", sprite: " + var1.t());
      G(var1.I(), "  " + var2);
   }

   public static void G(int[] var0, String var1) {
      mf.O();
      int var3 = var0.length / 4;
      z9.v(var1 + "Length: " + var0.length + ", step: " + var3);
      int var4 = 0;
      int var5 = var4 * var3;
      float var6 = Float.intBitsToFloat(var0[var5 + 0]);
      float var7 = Float.intBitsToFloat(var0[var5 + 1]);
      float var8 = Float.intBitsToFloat(var0[var5 + 2]);
      int var9 = var0[var5 + 3];
      float var10 = Float.intBitsToFloat(var0[var5 + 4]);
      float var11 = Float.intBitsToFloat(var0[var5 + 5]);
      z9.v(var1 + var4 + " xyz: " + var6 + "," + var7 + "," + var8 + " col: " + var9 + " u,v: " + var10 + "," + var11);
      ++var4;
   }

   public static j u(j var0) {
      List var1 = r(var0.h((n)null, (aq)null, 0L));
      aq[] var2 = aq.VALUES;
      HashMap var3 = new HashMap();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         aq var5 = var2[var4];
         List var6 = var0.h((n)null, var5, 0L);
         List var7 = r(var6);
         var3.put(var5, var7);
      }

      b var8 = new b(var1, var3, var0.a(), var0.M(), var0.o(), var0.D(), var0.q());
      return var8;
   }

   public static List r(List var0) {
      ArrayList var1 = new ArrayList();

      for(Object var3 : var0) {
         t var4 = I((t)var3);
         var1.add(var4);
      }

      return var1;
   }

   public static t I(t var0) {
      t var1 = new t((int[])var0.I().clone(), var0.N(), var0.c(), var0.t());
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
