package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.a5;
import net.yz.m_;

public class t extends c {
   public t(d var1) {
      super(var1);
      this.W = 0.5F;
   }

   public void u(net.nm.v var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.C();
      if(var1.t() != null) {
         net.yw.n var11 = var1.t();
         if(var11.C() == a5.MODEL) {
            net.yv.r var12 = var1.c();
            if(var11 != var12.Z(new net.u.j(var1)) && var11.C() != a5.INVISIBLE) {
               this.i(net.n9.b.N);
               net.y.d.c();
               net.y.d.i();
               net.y.r var13 = net.y.r.f();
               net.y.p var14 = var13.k();
               if(this.g) {
                  net.y.d.G();
                  net.y.d.o(this.B(var1));
               }

               var14.m(7, net.y8.x.M);
               net.u.j var15 = new net.u.j(var1.b, var1.i().c, var1.hr);
               net.y.d.O((float)(var2 - (double)var15.t() - 0.5D), (float)(var4 - (double)var15.h()), (float)(var6 - (double)var15.y() - 0.5D));
               net.y.k var16 = net.nn.j.b().x();
               var16.j().C(var12, var16.Z(var11), var11, var15, var14, false, net.u.t.a((net.u.d)var1.T()));
               var13.p();
               if(this.g) {
                  net.y.d.o();
                  net.y.d.e();
               }

               net.y.d.K();
               net.y.d.Y();
               super.w(var1, var2, var4, var6, var8, var9);
            }
         }
      }

   }

   protected m_ A(net.nm.v var1) {
      return net.n9.b.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
