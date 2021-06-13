package net.y0;

import javax.annotation.Nullable;
import net.i6;
import net.wl;
import net.xn;
import net.z9;
import net.n0.ks;
import net.n0.yn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class x extends c {
   private static final m_ C = new m_("textures/map/map_background.png");
   private final net.nn.j Z = net.nn.j.b();
   private final net.ym.a f = new net.ym.a("item_frame", "normal");
   private final net.ym.a b = new net.ym.a("item_frame", "map");
   private final net.y.t I;

   public x(d var1, net.y.t var2) {
      super(var1);
      this.I = var2;
   }

   public void t(net.nm.e var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      net.u.j var11 = var1.r();
      c.q();
      double var12 = (double)var11.t() - var1.b + var2;
      double var14 = (double)var11.h() - var1.hS + var4;
      double var16 = (double)var11.y() - var1.hr + var6;
      net.y.d.J(var12 + 0.5D, var14 + 0.5D, var16 + 0.5D);
      net.y.d.P(180.0F - var1.hN, 0.0F, 1.0F, 0.0F);
      this.A.H.E(net.n9.b.N);
      net.y.k var18 = this.Z.x();
      net.ym.v var19 = var18.a().l();
      if(var1.I().Z() instanceof yn) {
         var19.Y(this.b);
      }

      net.ym.j var20 = var19.Y(this.f);
      net.y.d.c();
      net.y.d.O(-0.5F, -0.5F, -0.5F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      var18.j().k(var20, 1.0F, 1.0F, 1.0F, 1.0F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      net.y.d.O(0.0F, 0.0F, 0.4375F);
      this.M(var1);
      net.y.d.Y();
      this.a(var1, var2 + (double)((float)var1.uz.v() * 0.3F), var4 - 0.25D, var6 + (double)((float)var1.uz.P() * 0.3F));
   }

   @Nullable
   protected m_ h(net.nm.e var1) {
      return null;
   }

   private void M(net.nm.e var1) {
      ks var2 = var1.I();
      if(!var2.B()) {
         if(!z9.l) {
            net.yy.g var3 = this.Z.sf;
            double var4 = var1.o(var3.b, var3.hS, var3.hr);
            if(var4 > 4096.0D) {
               return;
            }
         }

         net.y.d.c();
         net.y.d.i();
         boolean var7 = var2.Z() instanceof yn;
         int var8 = var1.P() % 4 * 2;
         net.y.d.P((float)var8 * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
         if(!i6.C(i6.MJ, new Object[]{var1, this})) {
            this.A.H.E(C);
            net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
            float var10000 = 0.0078125F;
            net.y.d.W(0.0078125F, 0.0078125F, 0.0078125F);
            net.y.d.O(-64.0F, -64.0F, 0.0F);
            net.cg.s var6 = wl.t(net.nb.j.WN, var2, var1.hl);
            net.y.d.O(0.0F, 0.0F, -1.0F);
            this.Z.s4.v().A(var6, true);
         }

         net.y.d.K();
         net.y.d.Y();
      }

   }

   protected void a(net.nm.e var1, double var2, double var4, double var6) {
      if(net.nn.j.O() && !var1.I().B() && var1.I().v() && this.A.o == var1) {
         double var8 = var1.F(this.A.J);
         float var10 = var1.Q()?32.0F:64.0F;
         if(var8 < (double)(var10 * var10)) {
            String var11 = var1.I().j();
            this.d(var1, var11, var2, var4, var6, 64);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
