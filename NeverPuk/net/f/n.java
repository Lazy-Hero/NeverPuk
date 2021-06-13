package net.f;

import java.util.Iterator;
import net.xn;
import net.f.l;
import net.nb.f;
import net.nn.j;
import net.u.e;
import net.u.t;
import net.y.p;
import net.yv.r;
import net.yy.g;
import net.yz.aq;

public class n implements l.g {
   private final j e;

   public n(j var1) {
      this.e = var1;
   }

   public void X(float var1, long var2) {
      g var5 = this.e.sf;
      l.K();
      double var6 = var5.hL + (var5.b - var5.hL) * (double)var1;
      double var8 = var5.F + (var5.hS - var5.F) * (double)var1;
      double var10 = var5.A + (var5.hr - var5.A) * (double)var1;
      r var12 = this.e.sf.hl;
      Iterable var13 = net.u.j.e(t.L(var5.b - 6.0D), t.L(var5.hS - 6.0D), t.L(var5.hr - 6.0D), t.L(var5.b + 6.0D), t.L(var5.hS + 6.0D), t.L(var5.hr + 6.0D));
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.y(2.0F);
      net.y.d.w();
      net.y.d.Y(false);
      Iterator var14 = var13.iterator();
      if(var14.hasNext()) {
         net.u.j var15 = (net.u.j)var14.next();
         net.yw.n var16 = var12.Z(var15);
         if(var16.Q() != f.ou) {
            e var17 = var16.u(var12, var15).x(0.002D).w(-var6, -var8, -var10);
            double var18 = var17.n;
            double var20 = var17.u;
            double var22 = var17.N;
            double var24 = var17.d;
            double var26 = var17.c;
            double var28 = var17.r;
            float var10000 = 1.0F;
            var10000 = 0.0F;
            var10000 = 0.0F;
            var10000 = 0.5F;
            if(var16.B(var12, var15, aq.WEST) == net.yw.g.SOLID) {
               net.y.r var34 = net.y.r.f();
               p var35 = var34.k();
               var35.m(5, net.y8.x.F);
               var35.H(var18, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var35.H(var18, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var35.H(var18, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var35.H(var18, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var34.p();
            }

            if(var16.B(var12, var15, aq.SOUTH) == net.yw.g.SOLID) {
               net.y.r var36 = net.y.r.f();
               p var41 = var36.k();
               var41.m(5, net.y8.x.F);
               var41.H(var18, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var41.H(var18, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var41.H(var24, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var41.H(var24, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var36.p();
            }

            if(var16.B(var12, var15, aq.EAST) == net.yw.g.SOLID) {
               net.y.r var37 = net.y.r.f();
               p var42 = var37.k();
               var42.m(5, net.y8.x.F);
               var42.H(var24, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var42.H(var24, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var42.H(var24, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var42.H(var24, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var37.p();
            }

            if(var16.B(var12, var15, aq.NORTH) == net.yw.g.SOLID) {
               net.y.r var38 = net.y.r.f();
               p var43 = var38.k();
               var43.m(5, net.y8.x.F);
               var43.H(var24, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var43.H(var24, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var43.H(var18, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var43.H(var18, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var38.p();
            }

            if(var16.B(var12, var15, aq.DOWN) == net.yw.g.SOLID) {
               net.y.r var39 = net.y.r.f();
               p var44 = var39.k();
               var44.m(5, net.y8.x.F);
               var44.H(var18, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var44.H(var24, var20, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var44.H(var18, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var44.H(var24, var20, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var39.p();
            }

            if(var16.B(var12, var15, aq.UP) == net.yw.g.SOLID) {
               net.y.r var40 = net.y.r.f();
               p var45 = var40.k();
               var45.m(5, net.y8.x.F);
               var45.H(var18, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var45.H(var18, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var45.H(var24, var26, var22).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var45.H(var24, var26, var28).m(1.0F, 0.0F, 0.0F, 0.5F).W();
               var40.p();
            }
         }
      }

      net.y.d.Y(true);
      net.y.d.S();
      net.y.d.E();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
