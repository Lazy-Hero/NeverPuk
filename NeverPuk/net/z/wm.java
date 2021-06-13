package net.z;

import net.xn;
import net.y.u1;
import net.yz.m_;
import net.z.g;
import net.z.t;

public class wm extends g implements net.p.a {
   private static final m_ E = new m_("textures/gui/widgets.png");
   public static final m_ f = new m_("textures/gui/spectator_widgets.png");
   private final net.nn.j J;
   private long D;
   private net.p.p z;

   public wm(net.nn.j var1) {
      this.J = var1;
   }

   public void R(int var1) {
      this.D = net.nn.j.E();
      if(this.z != null) {
         this.z.M(var1);
      } else {
         this.z = new net.p.p(this);
      }

   }

   private float K() {
      long var1 = this.D - net.nn.j.E() + 5000L;
      return net.u.t.T((float)var1 / 2000.0F, 0.0F, 1.0F);
   }

   public void y(t var1, float var2) {
      if(this.z != null) {
         float var3 = this.K();
         if(var3 <= 0.0F) {
            this.z.O();
         } else {
            int var4 = var1.u() / 2;
            float var5 = d;
            d = -90.0F;
            float var6 = (float)var1.v() - 22.0F * var3;
            net.e.e var7 = this.z.e();
            this.X(var1, var3, var4, var6, var7);
            d = var5;
         }
      }

   }

   protected void X(t var1, float var2, int var3, float var4, net.e.e var5) {
      net.y.d.F();
      net.y.d.C();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.T(1.0F, 1.0F, 1.0F, var2);
      this.J.n().E(E);
      l((float)(var3 - 91), var4, 0, 0, 182, 22);
      if(var5.K() >= 0) {
         l((float)(var3 - 91 - 1 + var5.K() * 20), var4 - 1.0F, 0, 22, 24, 22);
      }

      u1.A();
      int var6 = 0;

      while(true) {
         this.x(var6, var1.u() / 2 - 90 + var6 * 20 + 2, var4 + 3.0F, var2, var5.i(var6));
         ++var6;
      }
   }

   private void x(int var1, int var2, float var3, float var4, net.p.n var5) {
      g.C();
      this.J.n().E(f);
      if(var5 != net.p.p.b) {
         int var7 = (int)(var4 * 255.0F);
         net.y.d.c();
         net.y.d.O((float)var2, var3, 0.0F);
         float var8 = var5.C()?1.0F:0.25F;
         net.y.d.T(var8, var8, var8, var4);
         var5.A(var8, var7);
         net.y.d.Y();
         String var9 = net.nr.d.y(this.J.T.ww[var1].m());
         if(var7 > 3 && var5.C()) {
            this.J.sO.U(var9, (float)(var2 + 19 - 2 - this.J.sO.r(var9)), var3 + 6.0F + 3.0F, 16777215 + (var7 << 24));
         }
      }

   }

   public void c(t var1) {
      int var2 = (int)(this.K() * 255.0F);
      if(var2 > 3 && this.z != null) {
         net.p.n var3 = this.z.R();
         String var4 = var3 == net.p.p.b?this.z.i().o().c():var3.m().c();
         int var5 = (var1.u() - this.J.sO.r(var4)) / 2;
         int var6 = var1.v() - 35;
         net.y.d.c();
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
         this.J.sO.U(var4, (float)var5, (float)var6, 16777215 + (var2 << 24));
         net.y.d.E();
         net.y.d.Y();
      }

   }

   public void N(net.p.p var1) {
      this.z = null;
      this.D = 0L;
   }

   public boolean w() {
      return this.z != null;
   }

   public void P(int var1) {
      int var2;
      for(var2 = this.z.w() + var1; var2 <= 8 && (this.z.V(var2) == net.p.p.b || !this.z.V(var2).C()); var2 += var1) {
         ;
      }

      if(var2 <= 8) {
         this.z.M(var2);
         this.D = net.nn.j.E();
      }

   }

   public void w() {
      this.D = net.nn.j.E();
      if(this.w()) {
         int var1 = this.z.w();
         if(var1 != -1) {
            this.z.M(var1);
         }
      } else {
         this.z = new net.p.p(this);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
