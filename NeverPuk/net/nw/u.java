package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.t;
import net.nw.s;
import net.nw.v;
import net.u.d;
import net.u.j;
import net.u.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class u extends s {
   private static final Logger b = LogManager.getLogger();
   private int R;
   private t S;
   private r g;
   private net.ne.a K;
   private boolean J;

   public u(net.a.t var1) {
      super(var1);
   }

   public void J() {
      d[] var1 = s.H();
      if(this.K == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.h.c().D(v.z);
      }

      if(this.S != null && this.S.P()) {
         double var2 = this.K.b;
         double var4 = this.K.hr;
         double var6 = var2 - this.h.b;
         double var8 = var4 - this.h.hr;
         double var10 = (double)net.u.t.R(var6 * var6 + var8 * var8);
         double var12 = Math.min(0.4000000059604645D + var10 / 80.0D - 1.0D, 10.0D);
         this.g = new r(var2, this.K.hS + var12, var4);
      }

      double var26 = this.g == null?0.0D:this.g.s(this.h.b, this.h.hS, this.h.hr);
      if(Double.compare(var26, 100.0D) < 0 || var26 > 22500.0D) {
         this.f();
      }

      double var27 = 64.0D;
      if(Double.compare(this.K.F(this.h), 4096.0D) < 0) {
         if(this.h.b(this.K)) {
            ++this.R;
            r var28 = (new r(this.K.b - this.h.b, 0.0D, this.K.hr - this.h.hr)).I();
            r var7 = (new r((double)net.u.t.A(this.h.hN * 0.017453292F), 0.0D, (double)(-net.u.t.m(this.h.hN * 0.017453292F)))).I();
            float var29 = (float)var7.d(var28);
            float var9 = (float)(Math.acos((double)var29) * 57.29577951308232D);
            var9 = var9 + 0.5F;
            if(this.R >= 5 && var9 >= 0.0F && var9 < 10.0F) {
               double var31 = 1.0D;
               r var32 = this.h.r(1.0F);
               double var13 = this.h.kG.b - var32.p * 1.0D;
               double var15 = this.h.kG.hS + (double)(this.h.kG.m / 2.0F) + 0.5D;
               double var17 = this.h.kG.hr - var32.a * 1.0D;
               double var19 = this.K.b - var13;
               double var21 = this.K.hS + (double)(this.K.m / 2.0F) - (var15 + (double)(this.h.kG.m / 2.0F));
               double var23 = this.K.hr - var17;
               this.h.hl.N((net.r.r)null, 1017, new j(this.h), 0);
               net.n1.f var25 = new net.n1.f(this.h.hl, this.h, var19, var21, var23);
               var25.S(var13, var15, var17, 0.0F, 0.0F);
               this.h.hl.S(var25);
               this.R = 0;
               if(this.S != null && !this.S.P()) {
                  this.S.u();
               }

               this.h.c().D(v.z);
            }
         }

         if(this.R <= 0) {
            return;
         }

         --this.R;
      }

      if(this.R > 0) {
         --this.R;
      }

   }

   private void f() {
      if(this.S == null || this.S.P()) {
         int var1 = this.h.e();
         int var2 = var1;
         if(this.h.Q().nextInt(8) == 0) {
            this.J = !this.J;
            var2 = var1 + 6;
         }

         if(this.J) {
            ++var2;
         } else {
            --var2;
         }

         if(this.h.k() != null && this.h.k().w() > 0) {
            var2 = var2 % 12;
            var2 = var2 + 12;
         } else {
            var2 = var2 - 12;
            var2 = var2 & 7;
            var2 = var2 + 12;
         }

         this.S = this.h.v(var1, var2, (c)null);
         if(this.S != null) {
            this.S.u();
         }
      }

      this.k();
   }

   private void k() {
      if(this.S != null && !this.S.P()) {
         r var1 = this.S.k();
         this.S.u();
         double var2 = var1.p;
         double var4 = var1.a;

         double var6;
         while(true) {
            var6 = var1.H + (double)(this.h.Q().nextFloat() * 20.0F);
            if(var6 >= var1.H) {
               break;
            }
         }

         this.g = new r(var2, var6, var4);
      }

   }

   public void h() {
      this.R = 0;
      this.g = null;
      this.S = null;
      this.K = null;
   }

   public void N(net.ne.a var1) {
      this.K = var1;
      int var2 = this.h.e();
      int var3 = this.h.W(this.K.b, this.K.hS, this.K.hr);
      int var4 = net.u.t.L(this.K.b);
      int var5 = net.u.t.L(this.K.hr);
      double var6 = (double)var4 - this.h.b;
      double var8 = (double)var5 - this.h.hr;
      double var10 = (double)net.u.t.R(var6 * var6 + var8 * var8);
      double var12 = Math.min(0.4000000059604645D + var10 / 80.0D - 1.0D, 10.0D);
      int var14 = net.u.t.L(this.K.hS + var12);
      c var15 = new c(var4, var14, var5);
      this.S = this.h.v(var2, var3, var15);
      if(this.S != null) {
         this.S.u();
         this.k();
      }

   }

   @Nullable
   public r Y() {
      return this.g;
   }

   public v x() {
      return v.j;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
