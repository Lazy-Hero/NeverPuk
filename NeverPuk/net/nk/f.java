package net.nk;

import com.google.common.base.Predicate;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.n;
import net.y_.o8;
import net.y_.oa;
import net.y_.of;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.oy;
import net.yz.m_;

public class f extends net.yn.w {
   private static final net.k.v FK = net.k.n.q(f.class, net.k.y.f);
   private float FT;
   private float FY;
   private int FW;

   public f(net.yv.r var1) {
      super(var1);
      this.S(1.3F, 1.4F);
   }

   public net.ne.j r(net.ne.j var1) {
      return new f(this.hl);
   }

   public boolean V(ks var1) {
      return false;
   }

   protected void D() {
      super.D();
      this.p_.X(0, new op(this));
      this.p_.X(1, new f.o());
      this.p_.X(1, new f.d());
      this.p_.X(4, new net.y_.h(this, 1.25D));
      this.p_.X(5, new of(this, 1.0D));
      this.p_.X(6, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(7, new oa(this));
      this.pM.X(1, new f.p());
      this.pM.X(2, new f.j());
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(30.0D);
      this.t(net.ne.d.L).t(20.0D);
      this.t(net.ne.d.G).t(0.25D);
      this.T().i(net.ne.d.S);
      this.t(net.ne.d.S).t(6.0D);
   }

   protected net.yz.a T() {
      return this.H9()?net.nb.l.De:net.nb.l.oI;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.ol;
   }

   protected net.yz.a r() {
      return net.nb.l.D1;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.Ky, 0.15F, 1.0F);
   }

   protected void H() {
      if(this.FW <= 0) {
         this.I(net.nb.l.Pa, 1.0F, 1.0F);
         this.FW = 40;
      }

   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pM;
   }

   protected void g() {
      super.g();
      this.G.r(FK, Boolean.valueOf(false));
   }

   public void A() {
      n.o.y();
      super.A();
      if(this.hl.x) {
         this.FT = this.FY;
         if(this.D()) {
            this.FY = net.u.t.T(this.FY + 1.0F, 0.0F, 6.0F);
         }

         this.FY = net.u.t.T(this.FY - 1.0F, 0.0F, 6.0F);
      }

      if(this.FW > 0) {
         --this.FW;
      }

   }

   public boolean S(net.ne.l var1) {
      boolean var2 = var1.H(net.yz.z.O(this), (float)((int)this.t(net.ne.d.S).K()));
      this.q(this, var1);
      return var2;
   }

   public boolean D() {
      return ((Boolean)this.G.a(FK)).booleanValue();
   }

   public void P(boolean var1) {
      this.G.d(FK, Boolean.valueOf(var1));
   }

   public float c(float var1) {
      return (this.FT + (this.FY - this.FT) * var1) / 6.0F;
   }

   protected float r() {
      return 0.98F;
   }

   public net.ne.g t(net.yv.g var1, net.ne.g var2) {
      if(var2 instanceof f.r) {
         if(((f.r)var2).S) {
            this.V(-24000);
         }
      } else {
         f.r var3 = new f.r();
         var3.S = true;
         var2 = var3;
      }

      return (net.ne.g)var2;
   }

   private static xn d(xn var0) {
      return var0;
   }

   class d extends oy {
      public d() {
         super(f.this, 2.0D);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return (f.this.H9() || f.this.a()) && super.f();
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class j extends o8 {
      public j() {
         super(f.this, net.r.r.class, 20, true, true, (Predicate)null);
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         if(f.this.H9()) {
            return false;
         } else {
            if(super.f()) {
               Iterator var2 = f.this.hl.p(f.class, f.this.i().f(8.0D, 4.0D, 8.0D)).iterator();
               if(var2.hasNext()) {
                  f var3 = (f)var2.next();
                  if(var3.H9()) {
                     return true;
                  }
               }
            }

            f.this.C((net.ne.a)null);
            return false;
         }
      }

      protected double h() {
         return super.h() * 0.5D;
      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   class o extends net.y_.k {
      public o() {
         super(f.this, 1.25D, true);
      }

      protected void T(net.ne.a var1, double var2) {
         n.o.y();
         double var5 = this.n(var1);
         if(Double.compare(var2, var5) <= 0 && this.V <= 0) {
            this.V = 20;
            this.D.S(var1);
            f.this.P(false);
         }

         if(var2 <= var5 * 2.0D) {
            if(this.V <= 0) {
               f.this.P(false);
               this.V = 20;
            }

            if(this.V > 10) {
               return;
            }

            f.this.P(true);
            f.this.H();
         }

         this.V = 20;
         f.this.P(false);
      }

      public void C() {
         f.this.P(false);
         super.C();
      }

      protected double n(net.ne.a var1) {
         return (double)(4.0F + var1.h9);
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class p extends oo {
      public p() {
         super(f.this, false, new Class[0]);
      }

      public void I() {
         n.o.y();
         super.I();
         if(f.this.H9()) {
            this.a();
            this.C();
         }

      }

      protected void A(net.ne.s var1, net.ne.a var2) {
         net.u.d[] var3 = n.o.y();
         if(var1 instanceof f && !var1.H9()) {
            super.A(var1, var2);
         }

      }

      private static xn d(xn var0) {
         return var0;
      }
   }

   static class r implements net.ne.g {
      public boolean S;

      private r() {
      }
   }
}
