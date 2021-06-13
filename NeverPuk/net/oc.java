package net;

import java.util.ArrayList;
import java.util.List;
import net.mf;
import net.xn;
import net.z9;
import net.zd;
import net.y9.l;
import net.ym.j;
import net.ym.t;
import net.yw.n;
import net.yz.aq;

public class oc {
   private static j X = null;
   private static j h = null;
   private static j u = null;
   private static j i = null;
   private static j D = null;
   private static j S = null;
   private static List B = null;
   private static List t = null;
   private static List m = null;
   private static List A = null;
   private static List g = null;
   private static List x = null;
   private static j o = null;
   private static j q = null;
   private static j a = null;
   private static j H = null;
   private static j n = null;
   private static j s = null;

   public static j t(j var0, n var1) {
      if(!z9.x()) {
         return var0;
      } else {
         List var2 = var0.h(var1, (aq)null, 0L);
         return var2 == B?o:(var2 == t?q:(var2 == m?a:(var2 == A?H:(var2 == g?n:(var2 == x?s:var0)))));
      }
   }

   public static boolean m(n var0, n var1) {
      if(var0 == var1) {
         return true;
      } else {
         l var2 = var0.Q();
         l var3 = var1.Q();
         return var2 != var3?false:(var2 instanceof net.y9.g6?((net.y9.gc)var0.i(net.y9.g6.A)).equals(var1.i(net.y9.g6.A)):var2 instanceof net.y9.gu && ((net.y9.gc)var0.i(net.y9.gu.E)).equals(var1.i(net.y9.gu.E)));
      }
   }

   public static void B() {
      ArrayList var0 = new ArrayList();
      X = g("acacia", var0);
      h = g("birch", var0);
      u = g("dark_oak", var0);
      i = g("jungle", var0);
      D = g("oak", var0);
      S = g("spruce", var0);
      B = V(X);
      t = V(h);
      m = V(u);
      A = V(i);
      g = V(D);
      x = V(S);
      o = u(X);
      q = u(h);
      a = u(u);
      H = u(i);
      n = u(D);
      s = u(S);
      if(var0.size() > 0) {
         z9.v("Enable face culling: " + z9.O(var0.toArray()));
      }

   }

   private static List V(j var0) {
      return null;
   }

   static j g(String var0, List var1) {
      net.ym.v var2 = z9.a();
      return null;
   }

   private static j u(j var0) {
      String var1 = mf.O();
      if(var0 == null) {
         return null;
      } else if(var0.h((n)null, (aq)null, 0L).size() > 0) {
         z9.h("SmartLeaves: Model is not cube, general quads: " + var0.h((n)null, (aq)null, 0L).size() + ", model: " + var0);
         return var0;
      } else {
         aq[] var2 = aq.VALUES;
         int var3 = 0;
         if(var3 < var2.length) {
            aq var4 = var2[var3];
            List var5 = var0.h((n)null, var4, 0L);
            if(var5.size() != 1) {
               z9.h("SmartLeaves: Model is not cube, side: " + var4 + ", quads: " + var5.size() + ", model: " + var0);
               return var0;
            }

            ++var3;
         }

         j var14 = zd.u(var0);
         List[] var15 = new List[var2.length];
         int var16 = 0;
         if(var16 < var2.length) {
            aq var6 = var2[var16];
            List var7 = var14.h((n)null, var6, 0L);
            t var8 = (t)var7.get(0);
            t var9 = new t((int[])var8.I().clone(), var8.N(), var8.c(), var8.t());
            int[] var10 = var9.I();
            int[] var11 = (int[])var10.clone();
            int var12 = var10.length / 4;
            System.arraycopy(var10, 0 * var12, var11, 3 * var12, var12);
            System.arraycopy(var10, 1 * var12, var11, 2 * var12, var12);
            System.arraycopy(var10, 2 * var12, var11, 1 * var12, var12);
            System.arraycopy(var10, 3 * var12, var11, 0 * var12, var12);
            System.arraycopy(var11, 0, var10, 0, var11.length);
            var7.add(var9);
            ++var16;
         }

         return var14;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
