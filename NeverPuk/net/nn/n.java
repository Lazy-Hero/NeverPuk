package net.nn;

import net.nn.j;
import net.y.d;
import net.y.ui;
import net.y8.x;
import net.yz.ao;
import net.yz.r;
import net.z.g;
import net.z.t;

public class n implements ao {
   private String J = "";
   private final j M;
   private String L = "";
   private long a = j.E();
   private boolean v;
   private final t t;
   private final net.y2.t B;

   public n(j var1) {
      this.M = var1;
      this.t = new t(var1);
      this.B = new net.y2.t(var1.sB, var1.st, false);
      this.B.O(9728);
   }

   public void h(String var1) {
      this.v = false;
      this.u(var1);
   }

   public void H(String var1) {
      this.v = true;
      this.u(var1);
   }

   private void u(String var1) {
      this.L = var1;
      if(!this.M.sT) {
         if(!this.v) {
            throw new r();
         }
      } else {
         d.y(256);
         d.G(5889);
         d.s();
         if(ui.R()) {
            int var2 = t.K();
            d.g(0.0D, (double)(this.t.u() * var2), (double)(this.t.v() * var2), 0.0D, 100.0D, 300.0D);
         } else {
            t var3 = new t(this.M);
            d.g(0.0D, var3.q(), var3.c(), 0.0D, 100.0D, 300.0D);
         }

         d.G(5888);
         d.s();
         d.O(0.0F, 0.0F, -200.0F);
      }

   }

   public void y(String var1) {
      if(!this.M.sT) {
         if(!this.v) {
            throw new r();
         }
      } else {
         this.a = 0L;
         this.J = var1;
         this.H(-1);
         this.a = 0L;
      }

   }

   public void H(int var1) {
      net.u.d[] var2 = j.Q();
      if(!this.M.sT) {
         if(!this.v) {
            throw new r();
         }
      } else {
         long var3 = j.E();
         if(var3 - this.a >= 100L) {
            this.a = var3;
            t var5 = new t(this.M);
            int var6 = t.K();
            int var7 = var5.u();
            int var8 = var5.v();
            if(ui.R()) {
               this.B.r();
            }

            d.y(256);
            this.B.U(false);
            d.G(5889);
            d.s();
            d.g(0.0D, var5.q(), var5.c(), 0.0D, 100.0D, 300.0D);
            d.G(5888);
            d.s();
            d.O(0.0F, 0.0F, -200.0F);
            if(!ui.R()) {
               d.y(16640);
            }

            net.y.r var9 = net.y.r.f();
            net.y.p var10 = var9.k();
            this.M.n().E(g.v);
            float var10000 = 32.0F;
            var10.m(7, x.r);
            var10.H(0.0D, (double)var8, 0.0D).Y(0.0D, (double)((float)var8 / 32.0F)).V(64, 64, 64, 255).W();
            var10.H((double)var7, (double)var8, 0.0D).Y((double)((float)var7 / 32.0F), (double)((float)var8 / 32.0F)).V(64, 64, 64, 255).W();
            var10.H((double)var7, 0.0D, 0.0D).Y((double)((float)var7 / 32.0F), 0.0D).V(64, 64, 64, 255).W();
            var10.H(0.0D, 0.0D, 0.0D).Y(0.0D, 0.0D).V(64, 64, 64, 255).W();
            var9.p();
            if(var1 >= 0) {
               boolean var16 = true;
               var16 = true;
               int var14 = var7 / 2 - 50;
               int var15 = var8 / 2 + 16;
               d.w();
               var10.m(7, x.F);
               var10.H((double)var14, (double)var15, 0.0D).V(128, 128, 128, 255).W();
               var10.H((double)var14, (double)(var15 + 2), 0.0D).V(128, 128, 128, 255).W();
               var10.H((double)(var14 + 100), (double)(var15 + 2), 0.0D).V(128, 128, 128, 255).W();
               var10.H((double)(var14 + 100), (double)var15, 0.0D).V(128, 128, 128, 255).W();
               var10.H((double)var14, (double)var15, 0.0D).V(128, 255, 128, 255).W();
               var10.H((double)var14, (double)(var15 + 2), 0.0D).V(128, 255, 128, 255).W();
               var10.H((double)(var14 + var1), (double)(var15 + 2), 0.0D).V(128, 255, 128, 255).W();
               var10.H((double)(var14 + var1), (double)var15, 0.0D).V(128, 255, 128, 255).W();
               var9.p();
               d.S();
            }

            d.C();
            d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
            this.M.sO.U(this.L, (float)((var7 - this.M.sO.r(this.L)) / 2), (float)(var8 / 2 - 4 - 16), 16777215);
            this.M.sO.U(this.J, (float)((var7 - this.M.sO.r(this.J)) / 2), (float)(var8 / 2 - 4 + 8), 16777215);
            this.B.B();
            if(ui.R()) {
               this.B.u(var7 * var6, var8 * var6);
            }

            this.M.j();
            Thread.yield();
         }
      }

   }

   public void g() {
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
