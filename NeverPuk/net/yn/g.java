package net.yn;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y_.o0;
import net.y_.o6;
import net.y_.o_;
import net.y_.oc;
import net.y_.oj;
import net.y_.ok;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.ox;
import net.yn.a;
import net.yn.d;
import net.yn.w;
import net.yz.m_;

public class g extends d {
   private static final net.k.v pS = net.k.n.q(g.class, net.k.y.d);
   private net.y_.n ps;
   private o6 pF;

   public g(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 0.7F);
   }

   protected void D() {
      net.yn.z.C();
      this.I9 = new o0(this);
      this.pF = new o6(this, 0.6D, net.nb.j.YB, true);
      this.p_.X(1, new op(this));
      this.p_.X(2, this.I9);
      this.p_.X(3, this.pF);
      this.p_.X(5, new net.y_.v(this, 1.0D, 10.0F, 5.0F));
      this.p_.X(6, new ox(this, 0.8D));
      this.p_.X(7, new oc(this, 0.3F));
      this.p_.X(8, new o_(this));
      this.p_.X(9, new ot(this, 0.8D));
      this.p_.X(10, new ow(this, 0.8D, 1.0000001E-5F));
      this.p_.X(11, new ok(this, net.r.r.class, 10.0F));
      this.pM.X(1, new oj(this, a.class, false, (Predicate)null));
      net.u.d.h(new net.u.d[3]);
   }

   protected void g() {
      super.g();
      this.G.r(pS, Integer.valueOf(0));
   }

   public void T() {
      if(this.m().J()) {
         double var1 = this.m().A();
         if(var1 == 0.6D) {
            this.K(true);
            this.j(false);
         } else if(var1 == 1.33D) {
            this.K(false);
            this.j(true);
         } else {
            this.K(false);
            this.j(false);
         }
      } else {
         this.K(false);
         this.j(false);
      }

   }

   protected boolean lB() {
      return !this.D() && this.x > 2400;
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(10.0D);
      this.t(net.ne.d.G).t(0.30000001192092896D);
   }

   public void v(float var1, float var2) {
   }

   public static void M(net.c0.d var0) {
      net.ne.y.J(var0, g.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("CatType", this.E());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.e(var1.P("CatType"));
   }

   @Nullable
   protected net.yz.a T() {
      return this.D()?(this.BZ()?net.nb.l.wx:(this.p.nextInt(4) == 0?net.nb.l.Hj:net.nb.l.CN)):null;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.wz;
   }

   protected net.yz.a r() {
      return net.nb.l.o9;
   }

   protected float G() {
      return 0.4F;
   }

   public boolean S(net.ne.l var1) {
      return var1.H(net.yz.z.O(this), 3.0F);
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         if(this.I9 != null) {
            this.I9.n(false);
         }

         return super.H(var1, var2);
      }
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pa;
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.C();
      ks var4 = var1.o((net.yz.k)var2);
      if(this.D()) {
         if(!this.s(var1) || this.hl.x || this.V(var4)) {
            return super.R(var1, var2);
         }

         this.I9.n(!this.Ke());
      }

      if((this.pF == null || this.pF.O()) && var4.Z() == net.nb.j.YB && Double.compare(var1.F(this), 9.0D) < 0) {
         if(!var1.a6.V) {
            var4.H(1);
         }

         if(!this.hl.x) {
            if(this.p.nextInt(3) == 0) {
               this.q(var1);
               this.e(1 + this.hl.G.nextInt(3));
               this.P(true);
               this.I9.n(true);
               this.hl.k(this, (byte)7);
            }

            this.P(false);
            this.hl.k(this, (byte)6);
         }

         return true;
      } else {
         return super.R(var1, var2);
      }
   }

   public g Z(net.ne.j var1) {
      g var2 = new g(this.hl);
      if(this.D()) {
         var2.w(this.q());
         var2.c(true);
         var2.e(this.E());
      }

      return var2;
   }

   public boolean V(ks var1) {
      return var1.Z() == net.nb.j.YB;
   }

   public boolean b(w var1) {
      if(var1 == this) {
         return false;
      } else if(!this.D()) {
         return false;
      } else if(!(var1 instanceof g)) {
         return false;
      } else {
         g var2 = (g)var1;
         return !var2.D()?false:this.BZ() && var2.BZ();
      }
   }

   public int E() {
      return ((Integer)this.G.a(pS)).intValue();
   }

   public void e(int var1) {
      this.G.d(pS, Integer.valueOf(var1));
   }

   public boolean l4() {
      return this.hl.G.nextInt(3) != 0;
   }

   public boolean l1() {
      if(this.hl.N((net.u.e)this.i(), (net.ne.l)this) && this.hl.h(this, this.i()).isEmpty() && !this.hl.p(this.i())) {
         net.u.j var1 = new net.u.j(this.b, this.i().u, this.hr);
         if(var1.h() < this.hl.k()) {
            return false;
         } else {
            net.yw.n var2 = this.hl.Z(var1.b());
            net.y9.l var3 = var2.Q();
            return var3 == net.nb.f.p || var2.n() == net.y1.l.h;
         }
      } else {
         return false;
      }
   }

   public String Q() {
      return this.H()?this.X():(this.D()?net.yq.e.E("entity.Cat.name"):super.Q());
   }

   protected void H() {
      if(this.ps == null) {
         this.ps = new net.y_.n(this, net.r.r.class, 16.0F, 0.8D, 1.33D);
      }

      this.p_.e(this.ps);
      if(!this.D()) {
         this.p_.X(4, this.ps);
      }

   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      if(this.E() == 0 && this.hl.G.nextInt(7) == 0) {
         int var3 = 0;

         while(true) {
            g var4 = new g(this.hl);
            var4.S(this.b, this.hS, this.hr, this.hN, 0.0F);
            var4.V(-24000);
            this.hl.S(var4);
            ++var3;
         }
      }

      return var2;
   }

   private static xn d(xn var0) {
      return var0;
   }
}
