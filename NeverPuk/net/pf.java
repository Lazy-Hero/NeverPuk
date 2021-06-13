package net;

import java.util.ArrayList;
import java.util.List;
import net.in;
import net.pv;
import net.xn;
import net.nb.f;
import net.u.d;
import net.u.j;
import net.y9.l;
import net.y9.o;
import net.yw.n;

public class pf implements in {
   private static boolean S;

   public static j c() {
      return E.sf == null?j.V:new j(Math.floor(E.sf.b), Math.floor(E.sf.hS), Math.floor(E.sf.hr));
   }

   public static pv m(float var0, int var1) {
      pv var2 = null;
      float var3 = var0;

      for(float var4 = var0; var4 >= -var0; --var4) {
         for(float var5 = -var0; var5 <= var0; ++var5) {
            for(float var6 = var0; var6 >= -var0; --var6) {
               int var7 = (int)(E.sf.b + (double)var4);
               int var8 = (int)(E.sf.hS + (double)var5);
               int var9 = (int)(E.sf.hr + (double)var6);
               float var10 = (float)E.sf.R((double)var7, (double)var8, (double)var9);
               if(l.h(s(var7, var8 - 1, var9)) == var1 && s(var7, var8, var9) instanceof o && var10 <= var3) {
                  var3 = var10;
                  var2 = new pv((float)var7, (float)var8, (float)var9);
               }
            }
         }
      }

      return var2;
   }

   public static boolean Y(j var0) {
      n var1 = E.s8.Z(var0);
      return var1.Q() instanceof net.y9.rv || var1.Q() instanceof net.y9.rs && !(var1.Q() instanceof net.y9.rz)?E.s8.Z(var0.h()).Q() == f.ou:false;
   }

   public static List g(j var0, float var1, int var2, boolean var3, boolean var4, int var5) {
      L();
      ArrayList var7 = new ArrayList();
      int var8 = var0.t();
      int var9 = var0.h();
      int var10 = var0.y();
      int var11 = var8 - (int)var1;
      if((float)var11 <= (float)var8 + var1) {
         int var12 = var10 - (int)var1;
         if((float)var12 <= (float)var10 + var1) {
            int var13 = var4?var9 - (int)var1:var9;
            float var14 = (float)var9 + var1;
            if(Float.compare((float)var13, var14) < 0) {
               double var15 = (double)((var8 - var11) * (var8 - var11) + (var10 - var12) * (var10 - var12) + (var4?(var9 - var13) * (var9 - var13):0));
               if(var15 < (double)(var1 * var1) && (!var3 || var15 >= (double)((var1 - 1.0F) * (var1 - 1.0F)))) {
                  j var17 = new j(var11, var13 + var5, var12);
                  var7.add(var17);
               }

               ++var13;
               d.h(new d[5]);
            }

            ++var12;
         }

         ++var11;
      }

      return var7;
   }

   public static ArrayList f(int var0, int var1, int var2) {
      j var3 = new j(E.sf.b - (double)var0, E.sf.hS - (double)var1, E.sf.hr - (double)var2);
      j var4 = new j(E.sf.b + (double)var0, E.sf.hS + (double)var1, E.sf.hr + (double)var2);
      return l(var3, var4);
   }

   public static l I(j var0) {
      return Y(var0).Q();
   }

   public static n Y(j var0) {
      return E.s8.Z(var0);
   }

   public static ArrayList l(j var0, j var1) {
      ArrayList var2 = new ArrayList();
      j var3 = new j(Math.min(var0.t(), var1.t()), Math.min(var0.h(), var1.h()), Math.min(var0.y(), var1.y()));
      j var4 = new j(Math.max(var0.t(), var1.t()), Math.max(var0.h(), var1.h()), Math.max(var0.y(), var1.y()));

      for(int var5 = var3.t(); var5 <= var4.t(); ++var5) {
         for(int var6 = var3.h(); var6 <= var4.h(); ++var6) {
            for(int var7 = var3.y(); var7 <= var4.y(); ++var7) {
               var2.add(new j(var5, var6, var7));
            }
         }
      }

      return var2;
   }

   public static l s(int var0, int var1, int var2) {
      return E.s8.Z(new j(var0, var1, var2)).Q();
   }

   public static void O(boolean var0) {
      S = var0;
   }

   public static boolean L() {
      return S;
   }

   public static boolean d() {
      boolean var0 = L();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!L()) {
         O(true);
      }

   }
}
