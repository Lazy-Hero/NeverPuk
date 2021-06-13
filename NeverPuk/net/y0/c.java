package net.y0;

import javax.annotation.Nullable;
import net.bx;
import net.oz;
import net.xn;
import net.z9;
import net.y0.d;
import net.yz.a5;
import net.yz.m_;

public abstract class c implements bx {
   private static final m_ K = new m_("textures/misc/shadow.png");
   protected final d A;
   public float W;
   protected float r = 1.0F;
   protected boolean g;
   private Class l = null;
   private m_ P = null;
   private static boolean o;

   protected c(d var1) {
      this.A = var1;
   }

   public void U(boolean var1) {
      this.g = var1;
   }

   public boolean i(net.ne.l var1, net.cy.s var2, double var3, double var5, double var7) {
      net.u.e var9 = var1.S().x(0.5D);
      if(var9.p() || var9.O() == 0.0D) {
         var9 = new net.u.e(var1.b - 2.0D, var1.hS - 2.0D, var1.hr - 2.0D, var1.b + 2.0D, var1.hS + 2.0D, var1.hr + 2.0D);
      }

      return var1.e(var3, var5, var7) && (var1.hz || var2.E(var9));
   }

   public void w(net.ne.l var1, double var2, double var4, double var6, float var8, float var9) {
      if(!this.g) {
         this.i(var1, var2, var4, var6);
      }

   }

   protected int B(net.ne.l var1) {
      int var2 = 16777215;
      net.nc.y var3 = (net.nc.y)var1.f();
      String var4 = net.z.r.N(var3.G());
      if(var4.length() >= 2) {
         var2 = this.V().Z(var4.charAt(1));
      }

      return var2;
   }

   protected void i(net.ne.l var1, double var2, double var4, double var6) {
      if(this.W(var1)) {
         this.d(var1, var1.b().c(), var2, var4, var6, 64);
      }

   }

   protected boolean W(net.ne.l var1) {
      return var1.z() && var1.H();
   }

   protected void Q(net.ne.l var1, double var2, double var4, double var6, String var8, double var9) {
      this.d(var1, var8, var2, var4, var6, 64);
   }

   @Nullable
   protected abstract m_ e(net.ne.l var1);

   protected boolean j(net.ne.l var1) {
      m_ var2 = this.e(var1);
      if(this.P != null) {
         var2 = this.P;
      }

      return false;
   }

   public void i(m_ var1) {
      this.A.H.E(var1);
   }

   private void q(net.ne.l var1, double var2, double var4, double var6, float var8) {
      net.y.d.i();
      q();
      net.n9.b var10 = net.nn.j.b().p();
      net.n9.v var11 = var10.O("minecraft:blocks/fire_layer_0");
      var10.O("minecraft:blocks/fire_layer_1");
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4, (float)var6);
      float var13 = var1.h9 * 1.4F;
      net.y.d.W(var13, var13, var13);
      net.y.r var14 = net.y.r.f();
      net.y.p var15 = var14.k();
      float var16 = 0.5F;
      float var10000 = 0.0F;
      float var18 = var1.m / var13;
      float var19 = (float)(var1.hS - var1.i().u);
      net.y.d.P(-this.A.I, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.0F, 0.0F, -0.3F + (float)((int)var18) * 0.02F);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      float var20 = 0.0F;
      int var21 = 0;
      var15.m(7, net.y8.x.H);
      if(var18 > 0.0F) {
         int var33 = var21 % 2;
         this.i(net.n9.b.N);
         float var23 = var11.q();
         float var24 = var11.n();
         float var25 = var11.o();
         float var26 = var11.r();
         var33 = var21 / 2 % 2;
         var15.H((double)(var16 - 0.0F), (double)(0.0F - var19), (double)var20).Y((double)var23, (double)var26).W();
         var15.H((double)(-var16 - 0.0F), (double)(0.0F - var19), (double)var20).Y((double)var25, (double)var26).W();
         var15.H((double)(-var16 - 0.0F), (double)(1.4F - var19), (double)var20).Y((double)var25, (double)var24).W();
         var15.H((double)(var16 - 0.0F), (double)(1.4F - var19), (double)var20).Y((double)var23, (double)var24).W();
         var18 = var18 - 0.45F;
         var19 = var19 - 0.45F;
         var16 = var16 * 0.9F;
         var20 = var20 + 0.03F;
         ++var21;
      }

      var14.p();
      net.y.d.Y();
      net.y.d.K();
   }

   private void B(net.ne.l var1, double var2, double var4, double var6, float var8, float var9) {
      if(!z9.Q() || !oz.E_) {
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
         this.A.H.E(K);
         net.yv.r var10 = this.o();
         net.y.d.Y(false);
         float var11 = this.W;
         if(var1 instanceof net.ne.y) {
            net.ne.y var12 = (net.ne.y)var1;
            var11 *= var12.z();
            if(var12.H9()) {
               var11 *= 0.5F;
            }
         }

         double var35 = var1.hL + (var1.b - var1.hL) * (double)var9;
         double var14 = var1.F + (var1.hS - var1.F) * (double)var9;
         double var16 = var1.A + (var1.hr - var1.A) * (double)var9;
         int var18 = net.u.t.L(var35 - (double)var11);
         int var19 = net.u.t.L(var35 + (double)var11);
         int var20 = net.u.t.L(var14 - (double)var11);
         int var21 = net.u.t.L(var14);
         int var22 = net.u.t.L(var16 - (double)var11);
         int var23 = net.u.t.L(var16 + (double)var11);
         double var24 = var2 - var35;
         double var26 = var4 - var14;
         double var28 = var6 - var16;
         net.y.r var30 = net.y.r.f();
         net.y.p var31 = var30.k();
         var31.m(7, net.y8.x.r);

         for(net.u.j var33 : net.u.j.X(new net.u.j(var18, var20, var22), new net.u.j(var19, var21, var23))) {
            net.yw.n var34 = var10.Z(var33.b());
            if(var34.C() != a5.INVISIBLE && var10.y(var33) > 3) {
               this.m(var34, var2, var4, var6, var33, var8, var11, var24, var26, var28);
            }
         }

         var30.p();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.E();
         net.y.d.Y(true);
      }

   }

   private net.yv.r o() {
      return this.A.q;
   }

   private void m(net.yw.n var1, double var2, double var4, double var6, net.u.j var8, float var9, float var10, double var11, double var13, double var15) {
      if(var1.O()) {
         net.y.r var17 = net.y.r.f();
         net.y.p var18 = var17.k();
         double var19 = ((double)var9 - (var4 - ((double)var8.h() + var13)) / 2.0D) * 0.5D * (double)this.o().u(var8);
         if(var19 >= 0.0D) {
            if(var19 > 1.0D) {
               var19 = 1.0D;
            }

            net.u.e var21 = var1.q(this.o(), var8);
            double var22 = (double)var8.t() + var21.n + var11;
            double var24 = (double)var8.t() + var21.d + var11;
            double var26 = (double)var8.h() + var21.u + var13 + 0.015625D;
            double var28 = (double)var8.y() + var21.N + var15;
            double var30 = (double)var8.y() + var21.r + var15;
            float var32 = (float)((var2 - var22) / 2.0D / (double)var10 + 0.5D);
            float var33 = (float)((var2 - var24) / 2.0D / (double)var10 + 0.5D);
            float var34 = (float)((var6 - var28) / 2.0D / (double)var10 + 0.5D);
            float var35 = (float)((var6 - var30) / 2.0D / (double)var10 + 0.5D);
            var18.H(var22, var26, var28).Y((double)var32, (double)var34).m(1.0F, 1.0F, 1.0F, (float)var19).W();
            var18.H(var22, var26, var30).Y((double)var32, (double)var35).m(1.0F, 1.0F, 1.0F, (float)var19).W();
            var18.H(var24, var26, var30).Y((double)var33, (double)var35).m(1.0F, 1.0F, 1.0F, (float)var19).W();
            var18.H(var24, var26, var28).Y((double)var33, (double)var34).m(1.0F, 1.0F, 1.0F, (float)var19).W();
         }
      }

   }

   public static void U(net.u.e var0, double var1, double var3, double var5) {
      net.y.d.w();
      net.y.r var8 = net.y.r.f();
      net.y.p var9 = var8.k();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      var9.S(var1, var3, var5);
      var9.m(7, net.y8.x.z);
      var9.H(var0.n, var0.c, var0.N).d(0.0F, 0.0F, -1.0F).W();
      var9.H(var0.d, var0.c, var0.N).d(0.0F, 0.0F, -1.0F).W();
      var9.H(var0.d, var0.u, var0.N).d(0.0F, 0.0F, -1.0F).W();
      var9.H(var0.n, var0.u, var0.N).d(0.0F, 0.0F, -1.0F).W();
      var9.H(var0.n, var0.u, var0.r).d(0.0F, 0.0F, 1.0F).W();
      var9.H(var0.d, var0.u, var0.r).d(0.0F, 0.0F, 1.0F).W();
      var9.H(var0.d, var0.c, var0.r).d(0.0F, 0.0F, 1.0F).W();
      var9.H(var0.n, var0.c, var0.r).d(0.0F, 0.0F, 1.0F).W();
      q();
      var9.H(var0.n, var0.u, var0.N).d(0.0F, -1.0F, 0.0F).W();
      var9.H(var0.d, var0.u, var0.N).d(0.0F, -1.0F, 0.0F).W();
      var9.H(var0.d, var0.u, var0.r).d(0.0F, -1.0F, 0.0F).W();
      var9.H(var0.n, var0.u, var0.r).d(0.0F, -1.0F, 0.0F).W();
      var9.H(var0.n, var0.c, var0.r).d(0.0F, 1.0F, 0.0F).W();
      var9.H(var0.d, var0.c, var0.r).d(0.0F, 1.0F, 0.0F).W();
      var9.H(var0.d, var0.c, var0.N).d(0.0F, 1.0F, 0.0F).W();
      var9.H(var0.n, var0.c, var0.N).d(0.0F, 1.0F, 0.0F).W();
      var9.H(var0.n, var0.u, var0.r).d(-1.0F, 0.0F, 0.0F).W();
      var9.H(var0.n, var0.c, var0.r).d(-1.0F, 0.0F, 0.0F).W();
      var9.H(var0.n, var0.c, var0.N).d(-1.0F, 0.0F, 0.0F).W();
      var9.H(var0.n, var0.u, var0.N).d(-1.0F, 0.0F, 0.0F).W();
      var9.H(var0.d, var0.u, var0.N).d(1.0F, 0.0F, 0.0F).W();
      var9.H(var0.d, var0.c, var0.N).d(1.0F, 0.0F, 0.0F).W();
      var9.H(var0.d, var0.c, var0.r).d(1.0F, 0.0F, 0.0F).W();
      var9.H(var0.d, var0.u, var0.r).d(1.0F, 0.0F, 0.0F).W();
      var8.p();
      var9.S(0.0D, 0.0D, 0.0D);
      net.y.d.S();
      if(net.u.d.y() == null) {
         L(false);
      }

   }

   public void C(net.ne.l var1, double var2, double var4, double var6, float var8, float var9) {
      if(this.A.O != null) {
         if(this.A.O.wZ && this.W > 0.0F && !var1.e() && this.A.M()) {
            double var10 = this.A.Q(var1.b, var1.hS, var1.hr);
            float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.r);
            if(var12 > 0.0F) {
               this.B(var1, var2, var4, var6, var12, var9);
            }
         }

         if(var1.G() && (!(var1 instanceof net.r.r) || !((net.r.r)var1).VX())) {
            this.q(var1, var2, var4, var6, var9);
         }
      }

   }

   public net.z.r V() {
      return this.A.K();
   }

   protected void d(net.ne.l var1, String var2, double var3, double var5, double var7, int var9) {
      double var10 = var1.F(this.A.J);
      if(var10 <= (double)(var9 * var9)) {
         boolean var12 = var1.Q();
         float var13 = this.A.I;
         float var14 = this.A.Z;
         boolean var15 = this.A.O.wR == 2;
         float var16 = var1.m + 0.5F - 0.25F;
         int var17 = "deadmau5".equals(var2)?-10:0;
         net.y.n.H(this.V(), var2, (float)var3, (float)var5 + var16, (float)var7, var17, var13, var14, var15, var12);
      }

   }

   public d g() {
      return this.A;
   }

   public boolean K() {
      return false;
   }

   public void W(net.ne.l var1, double var2, double var4, double var6, float var8, float var9) {
   }

   public Class j() {
      return this.l;
   }

   public void Z(Class var1) {
      this.l = var1;
   }

   public m_ P() {
      return this.P;
   }

   public void b(m_ var1) {
      this.P = var1;
   }

   static {
      L(true);
   }

   public static void L(boolean var0) {
      o = var0;
   }

   public static boolean C() {
      return o;
   }

   public static boolean q() {
      boolean var0 = C();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
