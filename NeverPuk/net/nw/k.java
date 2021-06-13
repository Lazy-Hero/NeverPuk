package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.t;
import net.nw.s;
import net.nw.u;
import net.nw.v;
import net.u.d;
import net.u.j;
import net.u.r;

public class k extends s {
   private t P;
   private r w;
   private boolean p;

   public k(net.a.t var1) {
      super(var1);
   }

   public v x() {
      return v.z;
   }

   public void J() {
      double var1 = this.w == null?0.0D:this.w.s(this.h.b, this.h.hS, this.h.hr);
      if(var1 < 100.0D || var1 > 22500.0D || this.h.t || this.h.u) {
         this.q();
      }

   }

   public void h() {
      this.P = null;
      this.w = null;
   }

   @Nullable
   public r Y() {
      return this.w;
   }

   private void q() {
      d[] var1 = s.H();
      if(this.P != null && this.P.P()) {
         j var2 = this.h.hl.D(new j(net.w.e.z));
         int var3 = this.h.k() == null?0:this.h.k().w();
         if(this.h.Q().nextInt(var3 + 3) == 0) {
            this.h.c().D(v.L);
            return;
         }

         double var4 = 64.0D;
         net.r.r var6 = this.h.hl.o(var2, var4, var4);
         if(var6 != null) {
            var4 = var6.H(var2) / 512.0D;
         }

         if(var6 != null && (this.h.Q().nextInt(net.u.t.l((int)var4) + 2) == 0 || this.h.Q().nextInt(var3 + 2) == 0)) {
            this.e(var6);
            return;
         }
      }

      if(this.P == null || this.P.P()) {
         int var7 = this.h.e();
         int var8 = var7;
         if(this.h.Q().nextInt(8) == 0) {
            this.p = !this.p;
            var8 = var7 + 6;
         }

         if(this.p) {
            ++var8;
         }

         --var8;
         if(this.h.k() != null && this.h.k().w() >= 0) {
            var8 = var8 % 12;
            var8 = var8 + 12;
         }

         var8 = var8 - 12;
         var8 = var8 & 7;
         var8 = var8 + 12;
         this.P = this.h.v(var7, var8, (c)null);
         if(this.P != null) {
            this.P.u();
         }
      }

      this.Z();
   }

   private void e(net.r.r var1) {
      this.h.c().D(v.j);
      ((u)this.h.c().E(v.j)).N(var1);
   }

   private void Z() {
      if(this.P != null && !this.P.P()) {
         r var1 = this.P.k();
         this.P.u();
         double var2 = var1.p;
         double var4 = var1.a;

         double var6;
         while(true) {
            var6 = var1.H + (double)(this.h.Q().nextFloat() * 20.0F);
            if(var6 >= var1.H) {
               break;
            }
         }

         this.w = new r(var2, var6, var4);
      }

   }

   public void g(net.nm.j var1, j var2, net.yz.z var3, @Nullable net.r.r var4) {
      if(!var4.a6.T) {
         this.e(var4);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
