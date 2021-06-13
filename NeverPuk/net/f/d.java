package net.f;

import java.util.Iterator;
import net.xn;
import net.f.l;
import net.nb.f;
import net.nn.j;
import net.r.r;
import net.u.e;
import net.y.u;
import net.y9.g5;

public class d implements l.g {
   private final j a;
   private r Q;
   private double C;
   private double z;
   private double o;

   public d(j var1) {
      this.a = var1;
   }

   public void X(float var1, long var2) {
      this.Q = this.a.sf;
      l.K();
      this.C = this.Q.hL + (this.Q.b - this.Q.hL) * (double)var1;
      this.z = this.Q.F + (this.Q.hS - this.Q.F) * (double)var1;
      this.o = this.Q.A + (this.Q.hr - this.Q.A) * (double)var1;
      net.u.j var5 = this.a.sf.z();
      net.yv.r var6 = this.a.sf.hl;
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.T(0.0F, 1.0F, 0.0F, 0.75F);
      net.y.d.w();
      net.y.d.y(6.0F);
      Iterator var7 = net.u.j.e(var5.F(-10, -10, -10), var5.F(10, 10, 10)).iterator();
      if(var7.hasNext()) {
         net.u.j var8 = (net.u.j)var7.next();
         net.yw.n var9 = var6.Z(var8);
         if(var9.Q() == f.uM || var9.Q() == f.dy) {
            double var10 = (double)g5.h(var9, var6, var8);
            u.Y((new e((double)((float)var8.t() + 0.01F), (double)((float)var8.h() + 0.01F), (double)((float)var8.y() + 0.01F), (double)((float)var8.t() + 0.99F), var10, (double)((float)var8.y() + 0.99F))).w(-this.C, -this.z, -this.o), 1.0F, 1.0F, 1.0F, 0.2F);
         }
      }

      var7 = net.u.j.e(var5.F(-10, -10, -10), var5.F(10, 10, 10)).iterator();
      if(var7.hasNext()) {
         net.u.j var15 = (net.u.j)var7.next();
         net.yw.n var16 = var6.Z(var15);
         if(var16.Q() == f.uM || var16.Q() == f.dy) {
            Integer var17 = (Integer)var16.i(g5.J);
            double var11 = var17.intValue() > 7?0.9D:1.0D - 0.11D * (double)var17.intValue();
            String var13 = var16.Q() == f.dy?"f":"s";
            l.M(var13 + " " + var17, (double)var15.t() + 0.5D, (double)var15.h() + var11, (double)var15.y() + 0.5D, var1, -16777216);
         }
      }

      net.y.d.S();
      net.y.d.E();
      if(net.u.d.y() == null) {
         l.l("Mp0hW");
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
