package net;

import net._f;
import net.mf;
import net.xn;
import net.z9;
import net.l.h;
import net.l.n;
import net.l.q;
import net.nb.f;
import net.ne.l;
import net.nr.d;
import net.u.j;
import net.y9.o;
import net.yv.r;

public class by {
   public static void p(d var0, r var1) {
      String var2 = mf.O();
      byte var3 = 3;
      if(var0.iC) {
         var3 = 1;
      }

      o.x(f.uM, var3);
      o.x(f.dy, var3);
      if(var1 != null) {
         h var26 = var1.G();
         l var4 = z9.G().A();
         if(var4 != null) {
            int var5 = (int)var4.b / 16;
            int var6 = (int)var4.hr / 16;
            int var7 = var5 - 512;
            int var8 = var5 + 512;
            int var9 = var6 - 512;
            int var10 = var6 + 512;
            int var11 = 0;
            if(var7 < var8) {
               if(var9 < var10) {
                  q var14 = var26.e(var7, var9);
                  if(!(var14 instanceof n)) {
                     int var15 = var7 << 4;
                     int var16 = var9 << 4;
                     int var17 = var15 + 16;
                     int var18 = var16 + 16;
                     _f var19 = new _f(0, 0, 0);
                     _f var20 = new _f(0, 0, 0);
                     if(var15 < var17) {
                        if(var16 < var18) {
                           var19.S(var15, 0, var16);
                           j var23 = var1.d((j)var19);
                           int var24 = 0;
                           if(var24 < var23.h()) {
                              var20.S(var15, var24, var16);
                              net.yw.n var25 = var1.Z(var20);
                              if(var25.n() == net.y1.l.p) {
                                 var1.W(var15, var16, var20.h(), var23.h());
                                 ++var11;
                              }

                              ++var24;
                           }

                           int var22 = var16 + 1;
                        }

                        int var21 = var15 + 1;
                     }
                  }

                  int var13 = var9 + 1;
               }

               int var12 = var7 + 1;
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
