package net.f;

import java.util.Iterator;
import java.util.List;
import net.xn;
import net.f.l;
import net.nn.j;
import net.r.r;
import net.u.e;
import net.y.u;

public class k implements l.g {
   private final j j;
   private r I;
   private double l;
   private double V;
   private double d;

   public k(j var1) {
      this.j = var1;
   }

   public void X(float var1, long var2) {
      this.I = this.j.sf;
      this.l = this.I.hL + (this.I.b - this.I.hL) * (double)var1;
      this.V = this.I.F + (this.I.hS - this.I.F) * (double)var1;
      this.d = this.I.A + (this.I.hr - this.I.A) * (double)var1;
      net.yv.r var5 = this.j.sf.hl;
      List var6 = var5.h(this.I, this.I.i().x(6.0D));
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.y(2.0F);
      net.y.d.w();
      l.K();
      net.y.d.Y(false);
      Iterator var7 = var6.iterator();
      if(var7.hasNext()) {
         e var8 = (e)var7.next();
         u.a(var8.x(0.002D).w(-this.l, -this.V, -this.d), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      net.y.d.Y(true);
      net.y.d.S();
      net.y.d.E();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
