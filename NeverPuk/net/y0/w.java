package net.y0;

import net.xn;
import net.n0.ks;
import net.y0.c;
import net.y0.d;
import net.yz.aa;
import net.yz.m_;

public class w extends c {
   private static final m_ Y = new m_("textures/particle/particles.png");

   public w(d var1) {
      super(var1);
   }

   public void V(net.n1.q var1, double var2, double var4, double var6, float var8, float var9) {
      c.q();
      net.r.r var11 = var1.k();
      if(!this.g) {
         net.y.d.c();
         net.y.d.O((float)var2, (float)var4, (float)var6);
         net.y.d.F();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         this.j(var1);
         net.y.r var12 = net.y.r.f();
         net.y.p var13 = var12.k();
         boolean var10000 = true;
         var10000 = true;
         float var71 = 0.0625F;
         var71 = 0.125F;
         var71 = 0.125F;
         var71 = 0.1875F;
         var71 = 1.0F;
         var71 = 0.5F;
         var71 = 0.5F;
         net.y.d.P(180.0F - this.A.I, 0.0F, 1.0F, 0.0F);
         net.y.d.P((float)(this.A.O.wR == 2?-1:1) * -this.A.Z, 1.0F, 0.0F, 0.0F);
         if(this.g) {
            net.y.d.G();
            net.y.d.o(this.B(var1));
         }

         var13.m(7, net.y8.x.T);
         var13.H(-0.5D, -0.5D, 0.0D).Y(0.0625D, 0.1875D).d(0.0F, 1.0F, 0.0F).W();
         var13.H(0.5D, -0.5D, 0.0D).Y(0.125D, 0.1875D).d(0.0F, 1.0F, 0.0F).W();
         var13.H(0.5D, 0.5D, 0.0D).Y(0.125D, 0.125D).d(0.0F, 1.0F, 0.0F).W();
         var13.H(-0.5D, 0.5D, 0.0D).Y(0.0625D, 0.125D).d(0.0F, 1.0F, 0.0F).W();
         var12.p();
         if(this.g) {
            net.y.d.o();
            net.y.d.e();
         }

         net.y.d.g();
         net.y.d.Y();
         int var23 = var11.a() == aa.RIGHT?1:-1;
         ks var24 = var11.S();
         if(var24.Z() != net.nb.j.WQ) {
            var23 = -var23;
         }

         float var25 = var11.p(var9);
         float var26 = net.u.t.A(net.u.t.g(var25) * 3.1415927F);
         float var27 = (var11.Az + (var11.AK - var11.Az) * var9) * 0.017453292F;
         double var28 = (double)net.u.t.A(var27);
         double var30 = (double)net.u.t.m(var27);
         double var32 = (double)var23 * 0.35D;
         double var78 = 0.8D;
         if((this.A.O == null || this.A.O.wR <= 0) && var11 == net.nn.j.b().sf) {
            float var44 = this.A.O.is;
            var44 = var44 / 100.0F;
            net.u.r var45 = new net.u.r((double)var23 * -0.36D * (double)var44, -0.045D * (double)var44, 0.4D);
            var45 = var45.f(-(var11.d + (var11.V - var11.d) * var9) * 0.017453292F);
            var45 = var45.T(-(var11.hq + (var11.hN - var11.hq) * var9) * 0.017453292F);
            var45 = var45.T(var26 * 0.5F);
            var45 = var45.f(-var26 * 0.7F);
            double var36 = var11.h + (var11.b - var11.h) * (double)var9 + var45.p;
            double var38 = var11.h6 + (var11.hS - var11.h6) * (double)var9 + var45.H;
            double var40 = var11.l + (var11.hr - var11.l) * (double)var9 + var45.a;
            double var42 = (double)var11.A();
         }

         double var59 = var11.h + (var11.b - var11.h) * (double)var9 - var30 * var32 - var28 * 0.8D;
         double var60 = var11.h6 + (double)var11.A() + (var11.hS - var11.h6) * (double)var9 - 0.45D;
         double var61 = var11.l + (var11.hr - var11.l) * (double)var9 - var28 * var32 + var30 * 0.8D;
         double var62 = var11.Q()?-0.1875D:0.0D;
         double var64 = var1.h + (var1.b - var1.h) * (double)var9;
         double var46 = var1.h6 + (var1.hS - var1.h6) * (double)var9 + 0.25D;
         double var48 = var1.l + (var1.hr - var1.l) * (double)var9;
         double var50 = (double)((float)(var59 - var64));
         double var52 = (double)((float)(var60 - var46)) + var62;
         double var54 = (double)((float)(var61 - var48));
         net.y.d.w();
         net.y.d.i();
         var13.m(3, net.y8.x.F);
         boolean var79 = true;
         int var57 = 0;
         float var58 = (float)var57 / 16.0F;
         var13.H(var2 + var50 * (double)var58, var4 + var52 * (double)(var58 * var58 + var58) * 0.5D + 0.25D, var6 + var54 * (double)var58).V(0, 0, 0, 255).W();
         ++var57;
         var12.p();
         net.y.d.K();
         net.y.d.S();
         super.w(var1, var2, var4, var6, var8, var9);
      }

   }

   protected m_ f(net.n1.q var1) {
      return Y;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
