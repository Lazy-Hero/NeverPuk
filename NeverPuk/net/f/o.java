package net.f;

import java.util.Iterator;
import net.xn;
import net.cp.v;
import net.f.l;
import net.nb.f;
import net.nn.j;
import net.y.p;
import net.y.r;
import net.y.u;
import net.yy.g;

public class o implements l.g {
   private final j k;

   public o(j var1) {
      this.k = var1;
   }

   public void X(float var1, long var2) {
      g var5 = this.k.sf;
      v var6 = this.k.s8;
      double var7 = var5.hL + (var5.b - var5.hL) * (double)var1;
      double var9 = var5.F + (var5.hS - var5.F) * (double)var1;
      double var11 = var5.A + (var5.hr - var5.A) * (double)var1;
      net.y.d.c();
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      l.K();
      net.y.d.w();
      net.u.j var13 = new net.u.j(var5.b, 0.0D, var5.hr);
      Iterable var14 = net.u.j.e(var13.F(-40, 0, -40), var13.F(40, 0, 40));
      r var15 = r.f();
      p var16 = var15.k();
      var16.m(5, net.y8.x.F);
      Iterator var17 = var14.iterator();
      if(var17.hasNext()) {
         net.u.j var18 = (net.u.j)var17.next();
         int var19 = var6.J(var18.t(), var18.y());
         if(var6.Z(var18.F(0, var19, 0).b()) == f.ou.p()) {
            u.o(var16, (double)((float)var18.t() + 0.25F) - var7, (double)var19 - var9, (double)((float)var18.y() + 0.25F) - var11, (double)((float)var18.t() + 0.75F) - var7, (double)var19 + 0.09375D - var9, (double)((float)var18.y() + 0.75F) - var11, 0.0F, 0.0F, 1.0F, 0.5F);
         }

         u.o(var16, (double)((float)var18.t() + 0.25F) - var7, (double)var19 - var9, (double)((float)var18.y() + 0.25F) - var11, (double)((float)var18.t() + 0.75F) - var7, (double)var19 + 0.09375D - var9, (double)((float)var18.y() + 0.75F) - var11, 0.0F, 1.0F, 0.0F, 0.5F);
      }

      var15.p();
      net.y.d.S();
      net.y.d.Y();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
