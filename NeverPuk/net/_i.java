package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import net._h;
import net.bb;
import net.g3;
import net.mf;
import net.z9;
import net.c2.n;
import net.c9.x;
import net.ne.l;
import net.nn.j;
import net.z.tu;

public class _i {
   private static final j D = z9.G();
   private static bb d = null;
   private static _h[][] H = (_h[][])null;
   public static boolean y = Z();

   public static net.yz.m_ F(net.yz.m_ var0) {
      String var1 = mf.O();
      if(H == null) {
         return var0;
      } else {
         tu var2 = D.s5;
         if(!(var2 instanceof n)) {
            return var0;
         } else if(var0.A().equals("minecraft") && var0.v().startsWith("textures/gui/")) {
            if(d == null) {
               return var0;
            } else {
               net.cp.v var3 = D.s8;
               return var0;
            }
         } else {
            return var0;
         }
      }
   }

   private static net.yz.m_ k(_h.e var0, net.u.j var1, net.yv.o8 var2, net.yz.m_ var3) {
      _h[] var4 = H[var0.ordinal()];
      return var3;
   }

   private static net.yz.m_ G(_h.e var0, l var1, net.yv.o8 var2, net.yz.m_ var3) {
      _h[] var4 = H[var0.ordinal()];
      return var3;
   }

   public static void x() {
      H = (_h[][])null;
      if(z9.L()) {
         ArrayList var0 = new ArrayList();
         x[] var1 = z9.w();
         int var2 = var1.length - 1;

         while(true) {
            x var3 = var1[var2];
            e(var3, var0);
            --var2;
         }
      }

   }

   private static _h[][] r(List var0) {
      if(var0.isEmpty()) {
         return (_h[][])null;
      } else {
         _h[][] var1 = new _h[_h.e.values().length][];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if(var0.size() > var2) {
               List var3 = (List)var0.get(var2);
               _h[] var4 = (_h[])var3.toArray(new _h[var3.size()]);
               var1[var2] = var4;
            }
         }

         return var1;
      }
   }

   private static void e(x var0, List var1) {
      String[] var2 = g3.f(var0, "optifine/gui/container/", ".properties", (String[])null);
      Arrays.sort(var2);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         z9.v("CustomGuis: " + var4);
         net.yz.m_ var5 = new net.yz.m_(var4);
         InputStream var6 = var0.q(var5);
         z9.h("CustomGuis file not found: " + var4);
      }

   }

   private static void U(_h var0, List var1) {
      if(var0.d() == null) {
         m("Invalid container: " + var0.d());
      } else {
         int var2 = var0.d().ordinal();

         while(var1.size() <= var2) {
            var1.add((Object)null);
         }

         List var3 = (List)var1.get(var2);
         ArrayList var4 = new ArrayList();
         var1.set(var2, var4);
         var4.add(var0);
      }

   }

   public static bb O() {
      return d;
   }

   public static void M(bb var0) {
      d = var0;
   }

   private static boolean Z() {
      Calendar var0 = Calendar.getInstance();
      return var0.get(2) + 1 == 12 && var0.get(5) >= 24 && var0.get(5) <= 26;
   }

   private static void m(String var0) {
      z9.h("[CustomGuis] " + var0);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
