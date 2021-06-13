package net;

import java.io.InputStream;
import java.util.Map;
import net.i6;
import net.mf;
import net.xn;
import net.cg.s;
import net.n0.j;
import net.n0.ks;
import net.n0.yn;
import net.y.u;
import net.y9.l;
import net.yv.r;
import net.yw.n;

public class wl {
   public static void C(net.yz.m_ var0, String var1) {
      if(!i6.K.r()) {
         Object var2 = i6.H(i6.uJ, new Object[0]);
         i6.b(var2, i6.K, new Object[]{var0, var1});
      }

   }

   public static void r(net.yz.m_ var0) {
      if(!i6.C0.r()) {
         Object var1 = i6.H(i6.uJ, new Object[0]);
         i6.b(var1, i6.C0, new Object[]{var0});
      }

   }

   public static void T(String var0, Object var1) {
      Map var2 = (Map)i6.n(i6.x);
      var2.put(var0, var1);
   }

   public static boolean J(u var0, float var1, int var2) {
      String var3 = mf.O();
      return i6.C.r() && i6.G(i6.C, new Object[]{var0, Float.valueOf(var1), Integer.valueOf(var2)});
   }

   public static InputStream E(String var0) {
      String var1 = mf.O();
      if(!i6.uV.I()) {
         return null;
      } else {
         Object var2 = i6.n(i6.uV);
         return null;
      }
   }

   public static boolean A(n var0) {
      l var1 = var0.Q();
      return !i6.C5.r()?var1.W():i6.I(var1, i6.C5, new Object[]{var0});
   }

   public static boolean z(ks var0) {
      return !i6.W.r()?var0.j():i6.I(var0.Z(), i6.W, new Object[]{var0});
   }

   public static boolean w(j var0, ks var1) {
      if(i6.uG.r()) {
         return i6.I(var0, i6.uG, new Object[]{var1});
      } else {
         int var2 = var0.e(var1);
         return var2 != 16777215;
      }
   }

   public static int n(n var0, net.yv.o8 var1, net.u.j var2) {
      return i6.BO.r()?i6.B(var0, i6.BO, new Object[]{var1, var2}):var0.f();
   }

   public static s t(yn var0, ks var1, r var2) {
      return i6.MI.l()?((yn)var1.Z()).t(var1, var2):var0.t(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
