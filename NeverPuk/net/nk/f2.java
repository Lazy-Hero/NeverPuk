package net.nk;

import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.fu;
import net.nk.n;
import net.nl.z2;
import net.y_.o8;
import net.y_.oo;
import net.yz.m_;

public class f2 extends fu {
   private static final UUID Gc = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final net.s.k G0 = (new net.s.k(Gc, "Attacking speed boost", 0.05D, 0)).A(false);
   private int Ga;
   private int GC;
   private UUID GG;

   public f2(net.yv.r var1) {
      super(var1);
      this.hw = true;
   }

   public void i(@Nullable net.ne.a var1) {
      super.i(var1);
      this.GG = var1.O();
   }

   protected void H() {
      this.pM.X(1, new f2.u(this));
      this.pM.X(2, new f2.g(this));
   }

   protected void W() {
      super.W();
      this.t(WJ).t(0.0D);
      this.t(net.ne.d.G).t(0.23000000417232513D);
      this.t(net.ne.d.S).t(5.0D);
   }

   protected void T() {
      n.o.y();
      net.s.i var2 = this.t(net.ne.d.G);
      if(this.lV()) {
         if(!this.H9() && !var2.U(G0)) {
            var2.g(G0);
         }

         --this.Ga;
      }

      if(var2.U(G0)) {
         var2.n(G0);
      }

      if(this.GC > 0 && --this.GC == 0) {
         this.I(net.nb.l.CJ, this.G() * 2.0F, ((this.p.nextFloat() - this.p.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      if(this.Ga > 0 && this.GG != null && this.X() == null) {
         net.r.r var3 = this.hl.W(this.GG);
         this.i(var3);
         this.AR = var3;
         this.Ae = this.h();
      }

      super.T();
   }

   public boolean l4() {
      return this.hl.k() != net.yv.l.PEACEFUL;
   }

   public boolean l1() {
      return this.hl.N((net.u.e)this.i(), (net.ne.l)this) && this.hl.h(this, this.i()).isEmpty() && !this.hl.p(this.i());
   }

   public static void u(net.c0.d var0) {
      net.ne.y.J(var0, f2.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.h("Anger", (short)this.Ga);
      if(this.GG != null) {
         var1.b("HurtBy", this.GG.toString());
      } else {
         var1.b("HurtBy", "");
      }

   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.Ga = var1.E("Anger");
      String var2 = var1.J("HurtBy");
      if(!var2.isEmpty()) {
         this.GG = UUID.fromString(var2);
         net.r.r var3 = this.hl.W(this.GG);
         this.i(var3);
         this.AR = var3;
         this.Ae = this.h();
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         net.ne.l var3 = var1.v();
         if(var3 instanceof net.r.r) {
            this.g(var3);
         }

         return super.H(var1, var2);
      }
   }

   private void g(net.ne.l var1) {
      this.Ga = 400 + this.p.nextInt(400);
      this.GC = this.p.nextInt(40);
      if(var1 instanceof net.ne.a) {
         this.i((net.ne.a)var1);
      }

   }

   public boolean lV() {
      return this.Ga > 0;
   }

   protected net.yz.a T() {
      return net.nb.l.Cm;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.wK;
   }

   protected net.yz.a r() {
      return net.nb.l.oR;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.L;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      return false;
   }

   protected void T(net.yv.g var1) {
      this.u(z2.MAINHAND, new ks(net.nb.j.SP));
   }

   protected ks Q() {
      return ks.a;
   }

   public boolean K(net.r.r var1) {
      return this.lV();
   }

   private static xn d(xn var0) {
      return var0;
   }

   static class g extends o8 {
      public g(f2 var1) {
         super(var1, net.r.r.class, true);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return ((f2)this.k).lV() && super.f();
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   static class u extends oo {
      public u(f2 var1) {
         super(var1, true, new Class[0]);
      }

      protected void A(net.ne.s var1, net.ne.a var2) {
         n.o.y();
         super.A(var1, var2);
         if(var1 instanceof f2) {
            ((f2)var1).g(var2);
         }

      }

      private static xn d(xn var0) {
         return var0;
      }
   }
}
