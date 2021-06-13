package net.yo;

import net.xn;
import net.n0.ks;
import net.n0.y;
import net.n0.yh;
import net.n0.yn;
import net.n0.yv;
import net.nb.f;
import net.ne.v;
import net.nj.n;
import net.nj.q;
import net.u.d;
import net.y9.l;
import net.yo.j;
import net.yo.s;
import net.yv.e;
import net.yv.o8;
import net.yz.a9;

public class b {
   private final a9 I = new a9(32);

   public static b g(final j var0) {
      b var2 = new b();
      var2.K(new s() {
         public int O(ks var1, int var2) {
            String var3 = j.S();
            return var2 > 0?-1:((net.n0.j)var1.Z()).e(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.Sb, net.nb.j.SE, net.nb.j.Sf, net.nb.j.E});
      var2.j(new s() {
         public int O(ks var1, int var2) {
            j.S();
            net.y9.y var4 = net.y9.y.l(var1.n());
            return var4 != net.y9.y.GRASS && var4 != net.y9.y.FERN?-1:e.A(0.5D, 1.0D);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new l[]{f.Tg});
      var2.K(new s() {
         public int O(ks var1, int var2) {
            String var3 = j.S();
            if(var2 != 1) {
               return -1;
            } else {
               q var4 = yh.a(var1, "Colors");
               if(!(var4 instanceof n)) {
                  return 9079434;
               } else {
                  int[] var5 = ((n)var4).i();
                  if(var5.length == 1) {
                     return var5[0];
                  } else {
                     int var6 = 0;
                     int var7 = 0;
                     int var8 = 0;
                     int var10 = var5.length;
                     int var11 = 0;
                     if(var11 < var10) {
                        int var12 = var5[var11];
                        var6 += (var12 & 16711680) >> 16;
                        var7 += (var12 & '\uff00') >> 8;
                        var8 += (var12 & 255) >> 0;
                        ++var11;
                     }

                     var6 = var6 / var5.length;
                     var7 = var7 / var5.length;
                     var8 = var8 / var5.length;
                     return var6 << 16 | var7 << 8 | var8;
                  }
               }
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.c});
      var2.K(new s() {
         public int O(ks var1, int var2) {
            String var3 = j.S();
            return var2 > 0?-1:net.n_.y.N(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.I, net.nb.j.YD, net.nb.j.Wg});
      j.S();
      var2.K(new s() {
         public int O(ks var1, int var2) {
            j.S();
            v.m var4 = (v.m)v.V.get(yv.F(var1));
            return -1;
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.N});
      var2.j(new s() {
         public int O(ks var1, int var2) {
            net.yw.n var3 = ((net.n0.q)var1.Z()).o().D(var1.n());
            return var0.I(var3, (o8)null, (net.u.j)null, var2);
         }
      }, new l[]{f.p, f.TU, f.To, f.Tu, f.G, f.dD});
      var2.K(new s() {
         public int O(ks var1, int var2) {
            String var3 = j.S();
            return var2 == 0?net.n_.y.N(var1):-1;
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.l});
      var2.K(new s() {
         public int O(ks var1, int var2) {
            String var3 = j.S();
            return var2 == 0?-1:yn.O(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      }, new y[]{net.nb.j.WN});
      if(d.y() == null) {
         j.r("KHsz5");
      }

      return var2;
   }

   public int u(ks var1, int var2) {
      j.S();
      s var4 = (s)this.I.j(y.V.D(var1.Z()));
      return var4 == null?-1:var4.O(var1, var2);
   }

   public void j(s var1, l... var2) {
      String var3 = j.S();
      int var5 = var2.length;
      int var6 = 0;
      if(var6 < var5) {
         l var7 = var2[var6];
         this.I.u(var1, y.h(y.q(var7)));
         ++var6;
      }

   }

   public void K(s var1, y... var2) {
      int var5 = var2.length;
      j.S();
      int var6 = 0;
      if(var6 < var5) {
         y var7 = var2[var6];
         this.I.u(var1, y.h(var7));
         ++var6;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
