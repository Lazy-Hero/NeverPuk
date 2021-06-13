package net;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.mf;
import net.mn;
import net.xn;
import net.z9;
import net.k.y;
import net.n0.ks;
import net.n1.m;
import net.ne.a;
import net.ne.l;
import net.nk.f8;
import net.nk.x;
import net.nm.i;
import net.nm.k;
import net.r.r;
import net.u.j;
import net.y.u;
import net.yz.ar;

public class oq {
   private static final Map N = new HashMap();
   private static long s = 0L;
   private static final double p = 7.5D;
   private static final double v = 56.25D;
   private static final int W = 15;
   private static final int D = 15;
   private static final int o = 10;
   private static final int S = 8;
   private static final int t = 13;
   private static final int g = 8;
   private static final int B = 8;
   private static final net.k.v P = new net.k.v(6, y.k);

   public static void C(l var0, u var1) {
   }

   public static void W(l var0, u var1) {
      Map var2 = N;
      mn var3 = (mn)N.remove(ar.m(var0.G()));
      var3.x(var1);
   }

   public static void w(u var0) {
      long var1 = System.currentTimeMillis();
      if(var1 >= s + 50L) {
         s = var1;
         Map var3 = N;
         F(var0);
         if(N.size() > 0) {
            for(mn var5 : N.values()) {
               var5.l(var0);
            }
         }
      }

   }

   private static void F(u var0) {
      net.cp.v var1 = var0.r();

      for(l var3 : var1.y()) {
         int var4 = m(var3);
         Integer var5 = ar.m(var3.G());
         mn var6 = (mn)N.get(var5);
         var6 = new mn(var3);
         N.put(var5, var6);
      }

   }

   public static int K(j var0, int var1) {
      double var2 = s(var0);
      var1 = V(var2, var1);
      return var1;
   }

   public static int u(l var0, int var1) {
      double var2 = (double)m(var0);
      var1 = V(var2, var1);
      return var1;
   }

   public static int V(double var0, int var2) {
      if(var0 > 0.0D) {
         int var3 = (int)(var0 * 16.0D);
         int var4 = var2 & 255;
         if(var3 > var4) {
            var2 = var2 & -256;
            var2 = var2 | var3;
         }
      }

      return var2;
   }

   public static double s(j var0) {
      double var1 = 0.0D;
      Map var3 = N;

      for(mn var5 : N.values()) {
         int var6 = var5.h();
         double var7 = var5.G();
         double var9 = var5.Z();
         double var11 = var5.J();
         double var13 = (double)var0.t() - var7;
         double var15 = (double)var0.h() - var9;
         double var17 = (double)var0.y() - var11;
         double var19 = var13 * var13 + var15 * var15 + var17 * var17;
         if(var5.j() && !z9.i()) {
            var6 = z9.C(var6 - 2, 0, 15);
            var19 *= 2.0D;
         }

         if(var19 <= 56.25D) {
            double var21 = Math.sqrt(var19);
            double var23 = 1.0D - var21 / 7.5D;
            double var25 = var23 * (double)var6;
            if(var25 > var1) {
               var1 = var25;
            }
         }
      }

      double var28 = z9.Y(var1, 0.0D, 15.0D);
      return var28;
   }

   public static int q(ks var0) {
      return 0;
   }

   public static int m(l var0) {
      String var1 = mf.O();
      if(var0 == z9.G().A() && !z9.j()) {
         return 0;
      } else {
         if(var0 instanceof r) {
            r var2 = (r)var0;
            if(var2.VX()) {
               return 0;
            }
         }

         if(var0.a()) {
            return 15;
         } else if(var0 instanceof m) {
            return 15;
         } else if(var0 instanceof k) {
            return 15;
         } else if(var0 instanceof x) {
            x var14 = (x)var0;
            return var14.dw()?15:10;
         } else if(var0 instanceof f8) {
            f8 var13 = (f8)var0;
            return Double.compare((double)var13.uK, 0.6D) > 0?13:8;
         } else {
            if(var0 instanceof net.nk.m) {
               net.nk.m var10 = (net.nk.m)var0;
               if(Double.compare((double)var10.e(0.0F), 0.001D) > 0) {
                  return 15;
               }
            }

            if(var0 instanceof a) {
               a var12 = (a)var0;
               ks var15 = var12.S();
               int var4 = q(var15);
               ks var5 = var12.L();
               int var6 = q(var5);
               ks var7 = var12.U(net.nl.z2.HEAD);
               int var8 = q(var7);
               int var9 = Math.max(var4, var6);
               return Math.max(var9, var8);
            } else if(var0 instanceof i) {
               i var11 = (i)var0;
               ks var3 = H(var11);
               return q(var3);
            } else {
               return 0;
            }
         }
      }
   }

   public static void C(u var0) {
      Map var1 = N;
      Collection var2 = N.values();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         mn var4 = (mn)var3.next();
         var3.remove();
         var4.x(var0);
      }

   }

   public static void q() {
      Map var0 = N;
      N.clear();
   }

   public static int T() {
      Map var0 = N;
      return N.size();
   }

   public static ks H(i var0) {
      ks var1 = (ks)var0.A().a(P);
      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
