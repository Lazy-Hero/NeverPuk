package net;

import net.in;
import net.si;
import net.xn;
import net.m.i;
import net.m.p;
import net.n0.kq;
import net.n0.ks;
import net.ne.l;
import net.u.d;
import net.u.j;
import net.u.t;
import net.yz.k;

public class ba implements in {
   private static String[] V;

   public static void v(boolean var0) {
      if(E.sf.L().Z() instanceof kq) {
         E.T.iF.V = E.sf.d(si.d) <= si.n.e();
      }

   }

   public static void F() {
      if(!E.sf.Hj() && E.sf.o(k.OFF_HAND).Z() instanceof kq) {
         E.sE.u(E.sf, E.s8, k.OFF_HAND);
      }

   }

   public static boolean R(l var0) {
      for(ks var2 : var0.J()) {
         if(var2.B()) {
            return false;
         }
      }

      return true;
   }

   public static void S(l var0, boolean var1, boolean var2) {
      String[] var3 = i();
      E.sf.x3.L((net.n2.k)(new p(var0)));
      d.h(new d[3]);
      E.sE.B(E.sf, var0);
      E.sf.N(k.MAIN_HAND);
      E.sf.x3.L((net.n2.k)(new i(k.MAIN_HAND)));
   }

   public static double M(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var0 - var6;
      double var14 = var2 - var8;
      double var16 = var4 - var10;
      return (double)t.R(var12 * var12 + var14 * var14 + var16 * var16);
   }

   public static double O(l var0, j var1) {
      return M(var0.b, var0.hS, var0.hr, (double)var1.t(), (double)var1.h(), (double)var1.y());
   }

   public static float G(double var0, double var2, double var4) {
      if(var0 <= var2) {
         var0 = var2;
      }

      if(var0 >= var4) {
         var0 = var4;
      }

      return (float)var0;
   }

   public static void C(String[] var0) {
      V = var0;
   }

   public static String[] i() {
      return V;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(i() == null) {
         C(new String[2]);
      }

   }
}
