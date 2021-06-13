package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.gc;
import net.y9.l7;
import net.y9.lm;
import net.yz.ad;
import net.yz.ai;
import net.yz.aq;

public class y4 extends y {
   public static final int[] m = new int[]{1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};

   public y4() {
      this.z(true);
      this.d(0);
      this.M(net.ys.r.I);
   }

   public String f(ks var1) {
      int var2 = var1.n();
      return super.z() + "." + kw.q(var2).h();
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var1.n(var3.C(var5), var5, var10)) {
         return ad.FAIL;
      } else {
         kw var11 = kw.q(var10.n());
         if(var11 == kw.WHITE) {
            if(W(var10, var2, var3)) {
               if(!var2.x) {
                  var2.s(2005, var3, 0);
               }

               return ad.SUCCESS;
            }
         } else if(var11 == kw.BROWN) {
            net.yw.n var12 = var2.Z(var3);
            net.y9.l var13 = var12.Q();
            if(var13 == net.nb.f.u6 && var12.i(l7.d) == gc.i.JUNGLE) {
               if(var5 == aq.DOWN || var5 == aq.UP) {
                  return ad.FAIL;
               }

               var3 = var3.C(var5);
               if(var2.y(var3)) {
                  net.yw.n var14 = net.nb.f.TY.U(var2, var3, var5, var6, var7, var8, 0, var1);
                  var2.k(var3, var14, 10);
                  if(!var1.a6.V) {
                     var10.H(1);
                  }

                  return ad.SUCCESS;
               }
            }

            return ad.FAIL;
         }

         return ad.PASS;
      }
   }

   public static boolean W(ks var0, net.yv.r var1, net.u.j var2) {
      net.yw.n var3 = var1.Z(var2);
      if(var3.Q() instanceof lm) {
         lm var4 = (lm)var3.Q();
         if(var4.L(var1, var2, var3, var1.x)) {
            if(!var1.x) {
               if(var4.p(var1, var1.G, var2, var3)) {
                  var4.e(var1, var1.G, var2, var3);
               }

               var0.H(1);
            }

            return true;
         }
      }

      return false;
   }

   public static void d(net.yv.r var0, net.u.j var1, int var2) {
      var2 = 15;
      net.yw.n var3 = var0.Z(var1);
      if(var3.n() != net.y1.l.q) {
         int var4 = 0;

         while(true) {
            double var5 = u.nextGaussian() * 0.02D;
            double var7 = u.nextGaussian() * 0.02D;
            double var9 = u.nextGaussian() * 0.02D;
            var0.n(ai.VILLAGER_HAPPY, (double)((float)var1.t() + u.nextFloat()), (double)var1.h() + (double)u.nextFloat() * var3.q(var0, var1).c, (double)((float)var1.y() + u.nextFloat()), var5, var7, var9, new int[0]);
            ++var4;
         }
      }

   }

   public boolean X(ks var1, net.r.r var2, net.ne.a var3, net.yz.k var4) {
      if(var3 instanceof net.yn.b) {
         net.yn.b var5 = (net.yn.b)var3;
         kw var6 = kw.q(var1.n());
         if(!var5.D() && var5.n() != var6) {
            var5.S(var6);
            var1.H(1);
         }

         return true;
      } else {
         return false;
      }
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         int var3 = 0;

         while(true) {
            var2.add(new ks(this, 1, var3));
            ++var3;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
