package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.t;
import net.nw.s;
import net.nw.v;
import net.u.j;
import net.u.r;

public class m extends s {
   private boolean D;
   private t j;
   private r g;

   public m(net.a.t var1) {
      super(var1);
   }

   public void J() {
      if(!this.D && this.j != null) {
         j var1 = this.h.hl.D(net.w.e.z);
         double var2 = this.h.H(var1);
         if(var2 > 100.0D) {
            this.h.c().D(v.z);
         }
      } else {
         this.D = false;
         this.b();
      }

   }

   public void h() {
      this.D = true;
      this.j = null;
      this.g = null;
   }

   private void b() {
      s.H();
      int var2 = this.h.e();
      r var3 = this.h.c(1.0F);
      int var4 = this.h.W(-var3.p * 40.0D, 105.0D, -var3.a * 40.0D);
      if(this.h.k() != null && this.h.k().w() > 0) {
         var4 = var4 % 12;
         var4 = var4 + 12;
      }

      var4 = var4 - 12;
      var4 = var4 & 7;
      var4 = var4 + 12;
      this.j = this.h.v(var2, var4, (c)null);
      if(this.j != null) {
         this.j.u();
         this.I();
      }

   }

   private void I() {
      r var1 = this.j.k();
      this.j.u();

      double var2;
      while(true) {
         var2 = var1.H + (double)(this.h.Q().nextFloat() * 20.0F);
         if(var2 >= var1.H) {
            break;
         }
      }

      this.g = new r(var1.p, var2, var1.a);
   }

   @Nullable
   public r Y() {
      return this.g;
   }

   public v x() {
      return v.V;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
