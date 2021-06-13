package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y_.om;
import net.yn.j;
import net.yz.m_;

public class e extends j {
   private final om of = new om(this);
   private boolean o7;
   private int oS;

   public e(net.yv.r var1) {
      super(var1);
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(15.0D);
      this.t(net.ne.d.G).t(0.20000000298023224D);
      this.t(NA).t(this.o());
   }

   protected net.yz.a T() {
      super.T();
      return net.nb.l.P1;
   }

   protected net.yz.a r() {
      super.r();
      return net.nb.l.PJ;
   }

   protected net.yz.a m(net.yz.z var1) {
      super.m(var1);
      return net.nb.l.wY;
   }

   public net.ne.u g() {
      return net.ne.u.UNDEAD;
   }

   public double e() {
      return super.e() - 0.1875D;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.C;
   }

   public void d() {
      super.d();
      if(this.kS() && this.oS++ >= 18000) {
         this.B();
      }

   }

   public static void v(net.c0.d var0) {
      j.t(var0, e.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c("SkeletonTrap", this.kS());
      var1.r("SkeletonTrapTime", this.oS);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.X(var1.i("SkeletonTrap"));
      this.oS = var1.P("SkeletonTrapTime");
   }

   public boolean kS() {
      return this.o7;
   }

   public void X(boolean var1) {
      if(var1 != this.o7) {
         this.o7 = var1;
         this.p_.X(1, this.of);
      }

   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      boolean var5 = !var4.B();
      if(!this.Up()) {
         return false;
      } else if(this.H9()) {
         return super.R(var1, var2);
      } else if(var1.Q()) {
         this.t(var1);
         return true;
      } else if(this.t()) {
         return super.R(var1, var2);
      } else {
         this.n(var1);
         return true;
      }
   }

   private static xn d(xn var0) {
      return var0;
   }
}
