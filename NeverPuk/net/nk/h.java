package net.nk;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.b;
import net.nk.n;
import net.nk.r;
import net.nl.z2;
import net.y_.o8;
import net.y_.of;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.yz.m_;

public class h extends r {
   private boolean jX;
   private static final Predicate jD = new Predicate() {
      public boolean h(@Nullable net.ne.l var1) {
         net.u.d[] var2 = n.o.y();
         return var1 instanceof net.ne.a && ((net.ne.a)var1).N();
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public h(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.95F);
   }

   public static void B(net.c0.d var0) {
      net.ne.y.J(var0, h.class);
   }

   protected void D() {
      super.D();
      this.p_.X(0, new op(this));
      this.p_.X(4, new net.y_.k(this, 1.0D, false));
      this.p_.X(8, new of(this, 0.6D));
      this.p_.X(9, new ok(this, net.r.r.class, 3.0F, 1.0F));
      this.p_.X(10, new ok(this, net.ne.y.class, 8.0F));
      this.pM.X(1, new oo(this, true, new Class[]{h.class}));
      this.pM.X(2, new o8(this, net.r.r.class, true));
      this.pM.X(3, new o8(this, net.yn.s.class, true));
      this.pM.X(3, new o8(this, b.class, true));
      this.pM.X(4, new h.b(this));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.3499999940395355D);
      this.t(net.ne.d.L).t(12.0D);
      this.t(net.ne.d.C).t(24.0D);
      this.t(net.ne.d.S).t(5.0D);
   }

   protected void g() {
      super.g();
   }

   protected m_ N() {
      return net.y7.p.E;
   }

   public boolean UO() {
      return this.i(1);
   }

   public void q(boolean var1) {
      this.o(1, var1);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      if(this.jX) {
         var1.c("Johnny", true);
      }

   }

   public r.o y() {
      return this.UO()?r.o.ATTACKING:r.o.CROSSED;
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("Johnny", 99)) {
         this.jX = var1.i("Johnny");
      }

   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      net.ne.g var3 = super.t(var1, var2);
      this.T(var1);
      this.I(var1);
      return var3;
   }

   protected void T(net.yv.g var1) {
      this.u(z2.MAINHAND, new ks(net.nb.j.Wv));
   }

   protected void T() {
      super.T();
      this.q(this.M() != null);
   }

   public boolean M(net.ne.l var1) {
      net.u.d[] var2 = n.o.y();
      return super.M(var1)?true:(var1 instanceof net.ne.a && ((net.ne.a)var1).g() == net.ne.u.ILLAGER?this.f() == null && var1.f() == null:false);
   }

   public void K(String var1) {
      super.K(var1);
      if(!this.jX && "Johnny".equals(var1)) {
         this.jX = true;
      }

   }

   protected net.yz.a T() {
      return net.nb.l.MD;
   }

   protected net.yz.a r() {
      return net.nb.l.Hw;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.wP;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class b extends o8 {
      public b(h var1) {
         super(var1, net.ne.a.class, 0, true, true, h.jD);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return ((h)this.k).jX && super.f();
      }

      private static xn d(xn var0) {
         return var0;
      }
   }
}
