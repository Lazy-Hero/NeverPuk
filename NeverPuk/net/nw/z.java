package net.nw;

import net.xn;
import net.a.t;
import net.nw.g;
import net.nw.h;
import net.nw.s;
import net.nw.v;
import net.r.r;

public class z extends h {
   private int Q;

   public z(t var1) {
      super(var1);
   }

   public void J() {
      ++this.Q;
      s.H();
      r var2 = this.h.hl.t(this.h, 20.0D, 10.0D);
      if(this.Q > 25) {
         this.h.c().D(v.w);
      }

      net.u.r var3 = (new net.u.r(var2.b - this.h.b, 0.0D, var2.hr - this.h.hr)).I();
      net.u.r var4 = (new net.u.r((double)net.u.t.A(this.h.hN * 0.017453292F), 0.0D, (double)(-net.u.t.m(this.h.hN * 0.017453292F)))).I();
      float var5 = (float)var4.d(var3);
      float var6 = (float)(Math.acos((double)var5) * 57.29577951308232D) + 0.5F;
      if(Float.compare(var6, 0.0F) < 0 || var6 > 10.0F) {
         double var7 = var2.b - this.h.kG.b;
         double var9 = var2.hr - this.h.kG.hr;
         double var11 = net.u.t.F(net.u.t.p(180.0D - net.u.t.V(var7, var9) * 57.29577951308232D - (double)this.h.hN), -100.0D, 100.0D);
         this.h.Ad *= 0.8F;
         float var13 = net.u.t.R(var7 * var7 + var9 * var9) + 1.0F;
         float var14 = var13;
         if(var13 > 40.0F) {
            var13 = 40.0F;
         }

         this.h.Ad = (float)((double)this.h.Ad + var11 * (double)(0.7F / var13 / var14));
         this.h.hN += this.h.Ad;
      }

      if(this.Q >= 100) {
         var2 = this.h.hl.t(this.h, 150.0D, 150.0D);
         this.h.c().D(v.V);
         this.h.c().D(v.Y);
         ((g)this.h.c().E(v.Y)).A(new net.u.r(var2.b, var2.hS, var2.hr));
      }

   }

   public void h() {
      this.Q = 0;
   }

   public v x() {
      return v.H;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
