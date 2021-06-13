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

public class e extends s {
   private t O;
   private r I;

   public e(net.a.t var1) {
      super(var1);
   }

   public v x() {
      return v.L;
   }

   public void h() {
      this.O = null;
      this.I = null;
   }

   public void J() {
      double var1 = this.I == null?0.0D:this.I.s(this.h.b, this.h.hS, this.h.hr);
      if(var1 < 100.0D || var1 > 22500.0D || this.h.t || this.h.u) {
         this.s();
      }

   }

   @Nullable
   public r Y() {
      return this.I;
   }

   private void s() {
      d[] var1 = s.H();
      if(this.O == null || this.O.P()) {
         int var2 = this.h.e();
         j var3 = this.h.hl.D(net.w.e.z);
         net.r.r var4 = this.h.hl.o(var3, 128.0D, 128.0D);
         r var6 = (new r(var4.b, 0.0D, var4.hr)).I();
         this.h.W(-var6.p * 40.0D, 105.0D, -var6.a * 40.0D);
         int var5 = this.h.W(40.0D, (double)var3.h(), 0.0D);
         c var7 = new c(var3.t(), var3.h(), var3.y());
         this.O = this.h.v(var2, var5, var7);
         if(this.O != null) {
            this.O.u();
         }
      }

      this.q();
      if(this.O != null && this.O.P()) {
         this.h.c().D(v.W);
      }

   }

   private void q() {
      if(this.O != null && !this.O.P()) {
         r var1 = this.O.k();
         this.O.u();
         double var2 = var1.p;
         double var4 = var1.a;

         double var6;
         while(true) {
            var6 = var1.H + (double)(this.h.Q().nextFloat() * 20.0F);
            if(var6 >= var1.H) {
               break;
            }
         }

         this.I = new r(var2, var6, var4);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
