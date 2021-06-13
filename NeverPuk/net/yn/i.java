package net.yn;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y_.o6;
import net.y_.oa;
import net.y_.ok;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yz.m_;

public class i extends w {
   public i(net.yv.r var1) {
      super(var1);
      this.S(0.9F, 1.4F);
   }

   public static void n(net.c0.d var0) {
      net.ne.y.J(var0, i.class);
   }

   protected void D() {
      this.p_.X(0, new op(this));
      this.p_.X(1, new oy(this, 2.0D));
      int var10000 = net.yn.z.C();
      this.p_.X(2, new ot(this, 1.0D));
      this.p_.X(3, new o6(this, 1.25D, net.nb.j.Sd, false));
      this.p_.X(4, new net.y_.h(this, 1.25D));
      this.p_.X(5, new ow(this, 1.0D));
      int var1 = var10000;
      this.p_.X(6, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(7, new oa(this));
      if(net.u.d.y() == null) {
         ++var1;
         net.yn.z.c(var1);
      }

   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(10.0D);
      this.t(net.ne.d.G).t(0.20000000298023224D);
   }

   protected net.yz.a T() {
      return net.nb.l.wr;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.oC;
   }

   protected net.yz.a r() {
      return net.nb.l.D9;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.wJ, 0.15F, 1.0F);
   }

   protected float G() {
      return 0.4F;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.ph;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.C();
      ks var4 = var1.o((net.yz.k)var2);
      if(var4.Z() == net.nb.j.YF && !var1.a6.V && !this.H9()) {
         var1.I(net.nb.l.wl, 1.0F, 1.0F);
         var4.H(1);
         if(var4.B()) {
            var1.e(var2, new ks(net.nb.j.Sl));
         }

         if(!var1.a8.D(new ks(net.nb.j.Sl))) {
            var1.Y(new ks(net.nb.j.Sl), false);
         }

         return true;
      } else {
         return super.R(var1, var2);
      }
   }

   public i A(net.ne.j var1) {
      return new i(this.hl);
   }

   public float A() {
      return this.H9()?this.m:1.3F;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
