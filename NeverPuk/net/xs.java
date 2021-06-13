package net;

import java.util.Objects;
import net.in;
import net.xn;
import net.c1.c;
import net.c1.y;
import net.n0.k1;
import net.n0.k3;
import net.n0.ks;
import net.n0.q;
import net.nb.j;
import net.u.d;

public class xs implements in {
   private static int O;

   public static boolean v() {
      for(int var0 = 0; E.sf.a8.A(var0) == null || !(E.sf.a8.A(var0).Z() instanceof q); ++var0) {
         ;
      }

      return true;
   }

   public static int c() {
      int var0 = 0;

      while(true) {
         E.sf.a8.A(var0);
         if(E.sf.a8.A(var0).Z() == j.Wb) {
            return var0;
         }

         ++var0;
      }
   }

   public static int C() {
      int var0 = 0;

      while(true) {
         E.sf.a8.A(var0);
         if(E.sf.a8.A(var0).Z() == j.YD) {
            return var0;
         }

         ++var0;
      }
   }

   public static int z() {
      int var0 = 0;

      while(true) {
         ks var1 = E.sf.a8.A(var0);
         if(var1.Z() instanceof k3) {
            return var0;
         }

         ++var0;
      }
   }

   public static int g() {
      int var0 = 0;

      while(true) {
         ks var1 = E.sf.a8.A(var0);
         if(var1.Z() instanceof k1) {
            return var0;
         }

         ++var0;
      }
   }

   public static int p() {
      int var0 = 0;

      while(true) {
         ks var1 = E.sf.aW.f(var0).y();
         if(var1.Z() == j.YJ) {
            return var0;
         }

         ++var0;
      }
   }

   public static boolean F(ks var0, int var1) {
      D();
      float var3 = T(var0);
      String var4 = "";
      if(var1 == 1) {
         var4 = "helmet";
         d.h(new d[4]);
      }

      if(var1 == 2) {
         var4 = "chestplate";
      }

      if(var1 == 3) {
         var4 = "leggings";
      }

      if(var1 == 4) {
         var4 = "boots";
      }

      if(!var0.e().contains(var4)) {
         return false;
      } else {
         int var5 = 5;
         if(E.sf.aW.f(var5).T()) {
            ks var6 = E.sf.aW.f(var5).y();
            if(T(var6) > var3 && var6.e().contains(var4)) {
               return false;
            }
         }

         ++var5;
         return true;
      }
   }

   public static float T(ks var0) {
      int var10000 = D();
      float var2 = 0.0F;
      int var1 = var10000;
      if(var0.Z() instanceof net.n0.j) {
         net.n0.j var3 = (net.n0.j)var0.Z();
         var2 = (float)((double)var2 + (double)var3.x + (double)((100 - var3.x) * y.g((c)Objects.requireNonNull(c.R(0)), var0)) * 0.0075D);
         var2 = (float)((double)var2 + (double)y.g((c)Objects.requireNonNull(c.R(3)), var0) / 100.0D);
         var2 = (float)((double)var2 + (double)y.g((c)Objects.requireNonNull(c.R(1)), var0) / 100.0D);
         var2 = (float)((double)var2 + (double)y.g((c)Objects.requireNonNull(c.R(7)), var0) / 100.0D);
         var2 = (float)((double)var2 + (double)y.g((c)Objects.requireNonNull(c.R(34)), var0) / 50.0D);
         var2 = (float)((double)var2 + (double)y.g((c)Objects.requireNonNull(c.R(4)), var0) / 100.0D);
      }

      if(d.y() == null) {
         ++var1;
         B(var1);
      }

      return var2;
   }

   public static void B(int var0) {
      O = var0;
   }

   public static int D() {
      return O;
   }

   public static int r() {
      int var0 = D();
      return 107;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      B(69);
   }
}
