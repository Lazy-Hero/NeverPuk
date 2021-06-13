package net.y0;

import net.oz;
import net.xn;
import net.z9;
import net.y.ui;
import net.y0.c;
import net.y0.d;
import net.y0.o;

public abstract class l extends o {
   private static boolean k;

   public l(d var1, net.y6.z var2, float var3) {
      super(var1, var2, var3);
   }

   protected boolean e(net.ne.y var1) {
      return super.C(var1) && (var1.z() || var1.H() && var1 == this.A.o);
   }

   public boolean d(net.ne.y var1, net.cy.s var2, double var3, double var5, double var7) {
      if(super.i(var1, var2, var3, var5, var7)) {
         return true;
      } else if(var1.ln() && var1.M() != null) {
         net.ne.l var9 = var1.M();
         return var2.E(var9.S());
      } else {
         return false;
      }
   }

   public void C(net.ne.y var1, double var2, double var4, double var6, float var8, float var9) {
      super.R(var1, var2, var4, var6, var8, var9);
      if(!this.g) {
         this.l(var1, var2, var4, var6, var8, var9);
      }

   }

   public void I(net.ne.y var1) {
      int var2 = var1.L();
      int var3 = var2 % 65536;
      int var4 = var2 / 65536;
      ui.c(ui.w, (float)var3, (float)var4);
   }

   private double V(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   protected void l(net.ne.y var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.q();
      if(!z9.Q() || !oz.Hr) {
         net.ne.l var11 = var1.M();
         var4 = var4 - (1.6D - (double)var1.m) * 0.5D;
         net.y.r var12 = net.y.r.f();
         net.y.p var13 = var12.k();
         double var14 = this.V((double)var11.hq, (double)var11.hN, (double)(var9 * 0.5F)) * 0.01745329238474369D;
         double var16 = this.V((double)var11.d, (double)var11.V, (double)(var9 * 0.5F)) * 0.01745329238474369D;
         double var18 = Math.cos(var14);
         double var20 = Math.sin(var14);
         double var22 = Math.sin(var16);
         if(var11 instanceof net.ne.n) {
            var18 = 0.0D;
            var20 = 0.0D;
            var22 = -1.0D;
         }

         double var24 = Math.cos(var16);
         double var26 = this.V(var11.h, var11.b, (double)var9) - var18 * 0.7D - var20 * 0.5D * var24;
         double var28 = this.V(var11.h6 + (double)var11.A() * 0.7D, var11.hS + (double)var11.A() * 0.7D, (double)var9) - var22 * 0.5D - 0.25D;
         double var30 = this.V(var11.l, var11.hr, (double)var9) - var20 * 0.7D + var18 * 0.5D * var24;
         double var32 = this.V((double)var1.Az, (double)var1.AK, (double)var9) * 0.01745329238474369D + 1.5707963267948966D;
         var18 = Math.cos(var32) * (double)var1.h9 * 0.4D;
         var20 = Math.sin(var32) * (double)var1.h9 * 0.4D;
         double var34 = this.V(var1.h, var1.b, (double)var9) + var18;
         double var36 = this.V(var1.h6, var1.hS, (double)var9);
         double var38 = this.V(var1.l, var1.hr, (double)var9) + var20;
         var2 = var2 + var18;
         var6 = var6 + var20;
         double var40 = (double)((float)(var26 - var34));
         double var42 = (double)((float)(var28 - var36));
         double var44 = (double)((float)(var30 - var38));
         net.y.d.w();
         net.y.d.i();
         net.y.d.j();
         if(z9.Q()) {
            oz.o();
         }

         boolean var10000 = true;
         double var72 = 0.025D;
         var13.m(5, net.y8.x.F);
         int var49 = 0;
         float var50 = 0.5F;
         float var51 = 0.4F;
         float var52 = 0.3F;
         int var73 = var49 % 2;
         var50 = var50 * 0.7F;
         var51 = var51 * 0.7F;
         var52 = var52 * 0.7F;
         float var53 = (float)var49 / 24.0F;
         var13.H(var2 + var40 * (double)var53 + 0.0D, var4 + var42 * (double)(var53 * var53 + var53) * 0.5D + (double)((24.0F - (float)var49) / 18.0F + 0.125F), var6 + var44 * (double)var53).m(var50, var51, var52, 1.0F).W();
         var13.H(var2 + var40 * (double)var53 + 0.025D, var4 + var42 * (double)(var53 * var53 + var53) * 0.5D + (double)((24.0F - (float)var49) / 18.0F + 0.125F) + 0.025D, var6 + var44 * (double)var53).m(var50, var51, var52, 1.0F).W();
         ++var49;
         var12.p();
         var13.m(5, net.y8.x.F);
         var49 = 0;
         var50 = 0.5F;
         var51 = 0.4F;
         var52 = 0.3F;
         var73 = var49 % 2;
         var50 = var50 * 0.7F;
         var51 = var51 * 0.7F;
         var52 = var52 * 0.7F;
         var53 = (float)var49 / 24.0F;
         var13.H(var2 + var40 * (double)var53 + 0.0D, var4 + var42 * (double)(var53 * var53 + var53) * 0.5D + (double)((24.0F - (float)var49) / 18.0F + 0.125F) + 0.025D, var6 + var44 * (double)var53).m(var50, var51, var52, 1.0F).W();
         var13.H(var2 + var40 * (double)var53 + 0.025D, var4 + var42 * (double)(var53 * var53 + var53) * 0.5D + (double)((24.0F - (float)var49) / 18.0F + 0.125F), var6 + var44 * (double)var53 + 0.025D).m(var50, var51, var52, 1.0F).W();
         ++var49;
         var12.p();
         if(z9.Q()) {
            oz.nA();
         }

         net.y.d.K();
         net.y.d.S();
         net.y.d.a();
      }

   }

   public static void c(boolean var0) {
      k = var0;
   }

   public static boolean c() {
      return k;
   }

   public static boolean B() {
      boolean var0 = c();
      return true;
   }

   private static xn c(xn var0) {
      return var0;
   }

   static {
      if(!B()) {
         c(true);
      }

   }
}
