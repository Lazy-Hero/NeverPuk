package net.y_;

import net.xn;
import net.n0.ks;
import net.y_.b;

public class l extends b {
   private final net.yn.x w;
   private net.r.r b;
   private final net.yv.r J;
   private final float R;
   private int d;

   public l(net.yn.x var1, float var2) {
      this.w = var1;
      this.J = var1.hl;
      this.R = var2;
      this.h(2);
   }

   public boolean f() {
      this.b = this.J.d(this.w, (double)this.R);
      return this.b != null && this.B(this.b);
   }

   public boolean X() {
      return !this.b.P()?false:(this.w.F(this.b) > (double)(this.R * this.R)?false:this.d > 0 && this.B(this.b));
   }

   public void I() {
      this.w.F(true);
      this.d = 40 + this.w.Q().nextInt(40);
   }

   public void C() {
      this.w.F(false);
      this.b = null;
   }

   public void E() {
      this.w.E().u(this.b.b, this.b.hS + (double)this.b.A(), this.b.hr, 10.0F, (float)this.w.w());
      --this.d;
   }

   private boolean B(net.r.r var1) {
      net.yz.k[] var3 = net.yz.k.values();
      b.E();
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         net.yz.k var6 = var3[var5];
         ks var7 = var1.o((net.yz.k)var6);
         if(this.w.D() && var7.Z() == net.nb.j.SU) {
            return true;
         }

         if(this.w.V(var7)) {
            return true;
         }

         ++var5;
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
