package net;

import java.util.Objects;
import net.in;
import net.xn;
import net.zj;
import net.zl;
import net.n_.f;
import net.n_.i;
import net.nn.j;
import net.u.d;
import net.u.e;
import net.u.t;
import net.yz.m;

public class w9 implements in {
   private static boolean V;

   public static float r() {
      j var0 = j.b();
      float var1 = var0.sf.hN;
      if(var0.sf.AQ < 0.0F) {
         var1 += 180.0F;
      }

      float var2 = 1.0F;
      if(var0.sf.AQ < 0.0F) {
         var2 = -0.5F;
      } else if(var0.sf.AQ > 0.0F) {
         var2 = 0.5F;
      }

      if(var0.sf.XG > 0.0F) {
         var1 -= 90.0F * var2;
      }

      if(var0.sf.XG < 0.0F) {
         var1 += 90.0F * var2;
      }

      var1 = var1 * 0.017453292F;
      return var1;
   }

   public static int m() {
      return E.sf.J(f.d)?((i)Objects.requireNonNull(E.sf.b((f)f.d))).d() + 1:0;
   }

   public static void y(double var0, float var2, double var3, double var5) {
      float var7 = var2;
      if(var5 != 0.0D) {
         if(var3 > 0.0D) {
            var7 = var2 + -45.0F;
         } else if(var3 < 0.0D) {
            var7 = var2 + 45.0F;
         }

         var3 = 0.0D;
         if(var5 > 0.0D) {
            var5 = 1.0D;
         } else if(var5 < 0.0D) {
            var5 = -1.0D;
         }
      }

      if(var3 > 0.0D) {
         var3 = 1.0D;
      } else if(var3 < 0.0D) {
         var3 = -1.0D;
      }

      double var8 = Math.cos(Math.toRadians((double)(var7 + 90.0F)));
      double var10 = Math.sin(Math.toRadians((double)(var7 + 90.0F)));
      E.sf.hf = var5 * var0 * var8 + var3 * var0 * var10;
      E.sf.J = var5 * var0 * var10 - var3 * var0 * var8;
   }

   public static void U() {
      if(!E.T.P.o()) {
         J(k());
      }
   }

   public static float k() {
      return (float)Math.sqrt(E.sf.hf * E.sf.hf + E.sf.J * E.sf.J);
   }

   public static void a(double var0) {
      double var2 = (double)m.n;
      double var4 = (double)m.P;
      float var6 = E.sf.hN;
      if(var2 == 0.0D && var4 == 0.0D) {
         E.sf.hf = 0.0D;
         E.sf.J = 0.0D;
      } else {
         if(var2 != 0.0D) {
            if(var4 > 0.0D) {
               var6 += (float)(var2 > 0.0D?-45:45);
            } else if(var4 < 0.0D) {
               var6 += (float)(var2 > 0.0D?45:-45);
            }

            var4 = 0.0D;
            if(var2 > 0.0D) {
               var2 = 1.0D;
            } else if(var2 < 0.0D) {
               var2 = -1.0D;
            }
         }

         double var7 = Math.cos(Math.toRadians((double)(var6 + 90.0F)));
         double var9 = Math.sin(Math.toRadians((double)(var6 + 90.0F)));
         E.sf.hf = var2 * var0 * var7 + var4 * var0 * var9;
         E.sf.J = var2 * var0 * var9 - var4 * var0 * var7;
      }

   }

   public static void q(zj var0, float var1) {
      float var3 = var0.U();
      float var4 = var0.b();
      float var5 = var0.g();
      int var6 = (int)((t.k(E.sf.hN - var1 - 23.5F - 135.0F) + 180.0F) / 45.0F);
      A();
      float var7 = 0.0F;
      float var8 = 0.0F;
      switch(var6) {
      case 0:
         var7 = var4;
         var8 = var3;
         d.h(new d[5]);
      case 1:
         var7 = var7 + var4;
         var8 = var8 - var4;
         float var10000 = var7 + var3;
         var10000 = var8 + var3;
      case 2:
         var7 = var3;
         var8 = -var4;
      case 3:
         var7 = var7 - var4;
         var8 = var8 - var4;
         float var24 = var7 + var3;
         var24 = var8 - var3;
      case 4:
         var7 = -var4;
         var8 = -var3;
      case 5:
         var7 = var7 - var4;
         var8 = var8 + var4;
         float var26 = var7 - var3;
         var26 = var8 - var3;
      case 6:
         var7 = -var3;
         var8 = var4;
      case 7:
         var7 = var7 + var4;
         var8 = var8 + var4;
         var7 = var7 - var3;
         var8 = var8 + var3;
      default:
         float var36;
         int var28 = (var36 = var7 - 1.0F) == 0.0F?0:(var36 < 0.0F?-1:1);
         Float.compare(var7, 0.9F);
         float var37;
         var28 = (var37 = var7 - 0.3F) == 0.0F?0:(var37 < 0.0F?-1:1);
         float var38;
         var28 = (var38 = var7 - -1.0F) == 0.0F?0:(var38 < 0.0F?-1:1);
         Float.compare(var7, -0.9F);
         Float.compare(var7, -0.3F);
         float var39;
         var28 = (var39 = var8 - 1.0F) == 0.0F?0:(var39 < 0.0F?-1:1);
         Float.compare(var8, 0.9F);
         float var40;
         var28 = (var40 = var8 - 0.3F) == 0.0F?0:(var40 < 0.0F?-1:1);
         float var41;
         var28 = (var41 = var8 - -1.0F) == 0.0F?0:(var41 < 0.0F?-1:1);
         float var42;
         var28 = (var42 = var8 - -0.9F) == 0.0F?0:(var42 < 0.0F?-1:1);
         float var9 = var8 * var8 + var7 * var7;
         float var43;
         var28 = (var43 = var9 - 1.0E-4F) == 0.0F?0:(var43 < 0.0F?-1:1);
         var9 = (float)((double)var5 / Math.max(1.0D, Math.sqrt((double)var9)));
         var8 = var8 * var9;
         var7 = var7 * var9;
         float var10 = t.A((float)((double)var1 * 3.141592653589793D / 180.0D));
         float var11 = t.m((float)((double)var1 * 3.141592653589793D / 180.0D));
         E.sf.hf += (double)(var8 * var11 - var7 * var10);
         E.sf.J += (double)(var7 * var11 + var8 * var10);
      }
   }

   public static void L(zl var0, double var1) {
      double var3 = (double)m.n;
      double var5 = (double)m.P;
      float var7 = E.sf.hN;
      if(var3 == 0.0D && var5 == 0.0D) {
         var0.N(0.0D);
         var0.Q(0.0D);
      } else {
         if(var3 != 0.0D) {
            if(var5 > 0.0D) {
               var7 += (float)(var3 > 0.0D?-45:45);
            } else if(var5 < 0.0D) {
               var7 += (float)(var3 > 0.0D?45:-45);
            }

            var5 = 0.0D;
            if(var3 > 0.0D) {
               var3 = 1.0D;
            } else if(var3 < 0.0D) {
               var3 = -1.0D;
            }
         }

         double var8 = Math.cos(Math.toRadians((double)(var7 + 90.0F)));
         double var10 = Math.sin(Math.toRadians((double)(var7 + 90.0F)));
         var0.N(var3 * var1 * var8 + var5 * var1 * var10);
         var0.Q(var3 * var1 * var10 - var5 * var1 * var8);
      }

   }

   public static void J(float var0) {
      if(E.sf.FD()) {
         double var1 = (double)r();
         E.sf.hf = -Math.sin(var1) * (double)var0;
         E.sf.J = Math.cos(var1) * (double)var0;
      }
   }

   public static double K() {
      j var0 = j.b();
      double var1 = var0.sf.hf;
      double var3 = var0.sf.J;
      double var5 = Math.atan2(var1, var3) / 3.141592653589793D * 180.0D;
      return -var5;
   }

   public static boolean U() {
      e var0 = new e(E.sf.b - 0.3D, E.sf.hS + (double)E.sf.A(), E.sf.hr + 0.3D, E.sf.b + 0.3D, E.sf.hS + (!E.sf.k?1.5D:2.5D), E.sf.hr - 0.3D);
      return !E.s8.h(E.sf, var0).isEmpty();
   }

   public static double J() {
      double var0 = 0.2873D;
      if(E.sf.J((f)Objects.requireNonNull(f.Q(1)))) {
         int var2 = ((i)Objects.requireNonNull(E.sf.b((f)((f)Objects.requireNonNull(f.Q(1)))))).d();
         var0 *= 1.0D + 0.2D * (double)(var2 + 1);
      }

      return var0;
   }

   public static void K(boolean var0) {
      V = var0;
   }

   public static boolean I() {
      return V;
   }

   public static boolean A() {
      boolean var0 = I();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!A()) {
         K(true);
      }

   }
}
