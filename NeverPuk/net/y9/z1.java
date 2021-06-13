package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.z4;
import net.yz.a5;
import net.yz.ac;
import net.yz.aq;
import net.yz.at;

public class z1 extends z4 {
   public z1() {
      super(net.y1.l.y, net.y1.h.r);
      this.r(3.0F);
      this.f(net.ys.r.K);
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.h();
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(var1.x) {
         return true;
      } else {
         net.ni.v var11 = var1.L(var2);
         if(var11 instanceof net.ni.h) {
            var4.n((net.ni.h)var11);
            var4.S(net.v.q.J);
         }

         return true;
      }
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      g3.v.w();
      super.o(var1, var2, var3, var4, var5);
      if(var5.v()) {
         net.ni.v var7 = var1.L(var2);
         if(var7 instanceof net.ni.h) {
            ((net.ni.h)var7).o(var5.j());
         }
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      net.ni.v var6 = var2.L(var3);
      if(var6 instanceof net.ni.h) {
         ((net.ni.h)var6).d();
         var2.x(var3, this, 1, 0);
      }

   }

   public ac k() {
      return ac.CUTOUT;
   }

   public static void y(final net.yv.r var0, final net.u.j var1) {
      at.A.submit(new Runnable() {
         public void run() {
            g3.v.w();
            net.l.q var2 = var0.d(var1);
            int var3 = var1.h() - 1;
            final net.u.j var4 = new net.u.j(var1.t(), var3, var1.y());
            if(!var2.C(var4)) {
               ;
            }

            net.yw.n var5 = var0.Z(var4);
            if(var5.Q() == net.nb.f.uB) {
               ((net.yv.d)var0).d(new Runnable() {
                  public void run() {
                     g3.v.w();
                     net.ni.v var2 = var0.L(var4);
                     if(var2 instanceof net.ni.h) {
                        ((net.ni.h)var2).d();
                        var0.x(var4, net.nb.f.uB, 1, 0);
                     }

                  }

                  private static xn a(xn var0x) {
                     return var0x;
                  }
               });
            }

            --var3;
         }

         private static xn a(xn var0x) {
            return var0x;
         }
      });
   }

   private static xn a(xn var0) {
      return var0;
   }
}
