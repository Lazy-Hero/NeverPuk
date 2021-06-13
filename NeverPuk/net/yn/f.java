package net.yn;

import net.xn;
import net.yn.wy;

public abstract class f extends net.ne.y implements wy {
   public f(net.yv.r var1) {
      super(var1);
   }

   public boolean R() {
      return true;
   }

   public boolean l4() {
      return true;
   }

   public boolean l1() {
      return this.hl.N((net.u.e)this.i(), (net.ne.l)this);
   }

   public int g() {
      return 120;
   }

   protected boolean lB() {
      return true;
   }

   protected int Q(net.r.r var1) {
      return 1 + this.hl.G.nextInt(3);
   }

   public void i() {
      net.yn.z.B();
      int var2 = this.b();
      super.i();
      if(this.P() && !this.p()) {
         --var2;
         this.J(var2);
         if(this.b() != -20) {
            return;
         }

         this.J(0);
         this.H(net.yz.z.N, 2.0F);
      }

      this.J(300);
   }

   public boolean i() {
      return false;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
