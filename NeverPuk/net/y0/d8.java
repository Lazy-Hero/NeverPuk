package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.e4;
import net.y6.jb;
import net.ye.wr;
import net.yz.m_;

public class d8 extends l {
   public static final m_[] h = new m_[]{new m_("textures/entity/shulker/shulker_white.png"), new m_("textures/entity/shulker/shulker_orange.png"), new m_("textures/entity/shulker/shulker_magenta.png"), new m_("textures/entity/shulker/shulker_light_blue.png"), new m_("textures/entity/shulker/shulker_yellow.png"), new m_("textures/entity/shulker/shulker_lime.png"), new m_("textures/entity/shulker/shulker_pink.png"), new m_("textures/entity/shulker/shulker_gray.png"), new m_("textures/entity/shulker/shulker_silver.png"), new m_("textures/entity/shulker/shulker_cyan.png"), new m_("textures/entity/shulker/shulker_purple.png"), new m_("textures/entity/shulker/shulker_blue.png"), new m_("textures/entity/shulker/shulker_brown.png"), new m_("textures/entity/shulker/shulker_green.png"), new m_("textures/entity/shulker/shulker_red.png"), new m_("textures/entity/shulker/shulker_black.png")};

   public d8(d var1) {
      super(var1, new e4(), 0.0F);
      this.k(new d8.f());
   }

   public e4 b() {
      return (e4)super.v();
   }

   public void G(net.nk.j var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = var1.O();
      if(var1.HS()) {
         net.u.j var11 = var1.G();
         net.u.j var12 = var1.d();
         double var13 = (double)((float)var10 - var9) / 6.0D;
         var13 = var13 * var13;
         double var15 = (double)(var11.t() - var12.t()) * var13;
         double var17 = (double)(var11.h() - var12.h()) * var13;
         double var19 = (double)(var11.y() - var12.y()) * var13;
         super.C(var1, var2 - var15, var4 - var17, var6 - var19, var8, var9);
      } else {
         super.C(var1, var2, var4, var6, var8, var9);
      }

   }

   public boolean w(net.nk.j var1, net.cy.s var2, double var3, double var5, double var7) {
      if(super.d(var1, var2, var3, var5, var7)) {
         return true;
      } else if(var1.O() > 0 && var1.HS()) {
         net.u.j var9 = var1.d();
         net.u.j var10 = var1.G();
         net.u.r var11 = new net.u.r((double)var10.t(), (double)var10.h(), (double)var10.y());
         net.u.r var12 = new net.u.r((double)var9.t(), (double)var9.h(), (double)var9.y());
         return var2.E(new net.u.e(var12.p, var12.H, var12.a, var11.p, var11.H, var11.a));
      } else {
         return false;
      }
   }

   protected m_ C(net.nk.j var1) {
      return h[var1.A().d()];
   }

   protected void I(net.nk.j var1, float var2, float var3, float var4) {
      c.C();
      super.o(var1, var2, var3, var4);
      switch(null.s[var1.z().ordinal()]) {
      case 1:
      default:
      case 2:
         net.y.d.O(0.5F, 0.5F, 0.0F);
         net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(90.0F, 0.0F, 0.0F, 1.0F);
      case 3:
         net.y.d.O(-0.5F, 0.5F, 0.0F);
         net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(-90.0F, 0.0F, 0.0F, 1.0F);
      case 4:
         net.y.d.O(0.0F, 0.5F, -0.5F);
         net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
      case 5:
         net.y.d.O(0.0F, 0.5F, 0.5F);
         net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
      case 6:
         net.y.d.O(0.0F, 1.0F, 0.0F);
         net.y.d.P(180.0F, 1.0F, 0.0F, 0.0F);
      }
   }

   protected void L(net.nk.j var1, float var2) {
      float var10000 = 0.999F;
      net.y.d.W(0.999F, 0.999F, 0.999F);
   }

   private static xn b(xn var0) {
      return var0;
   }

   class f implements wr {
      private f() {
      }

      public void u(net.nk.j var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
         c.q();
         net.y.d.c();
         switch(null.s[var1.z().ordinal()]) {
         case 1:
         default:
         case 2:
            net.y.d.P(90.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.O(1.0F, -1.0F, 0.0F);
            net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
         case 3:
            net.y.d.P(-90.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.O(-1.0F, -1.0F, 0.0F);
            net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
         case 4:
            net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.O(0.0F, -1.0F, -1.0F);
         case 5:
            net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.O(0.0F, -1.0F, 1.0F);
         case 6:
            net.y.d.P(180.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.O(0.0F, -2.0F, 0.0F);
            jb var10 = d8.this.b().N;
            var10.N = var6 * 0.017453292F;
            var10.b = var7 * 0.017453292F;
            d8.this.i(d8.h[var1.A().d()]);
            var10.B(var8);
            net.y.d.Y();
         }
      }

      public boolean y() {
         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
