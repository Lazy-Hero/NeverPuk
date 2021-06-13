package net.nk;

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
import net.yz.ai;
import net.yz.m_;

public class w extends n implements net.ne.x {
   private int NA;
   private final net.u.r[][] Nw;

   public w(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.95F);
      this.p0 = 5;
      this.Nw = new net.u.r[2][4];
      int var2 = 0;

      while(true) {
         this.Nw[0][var2] = new net.u.r(0.0D, 0.0D, 0.0D);
         this.Nw[1][var2] = new net.u.r(0.0D, 0.0D, 0.0D);
         ++var2;
      }
   }

   protected void D() {
      super.D();
      this.p_.X(0, new op(this));
      this.p_.X(1, new n.h());
      this.p_.X(4, new w.t());
      this.p_.X(5, new w.j());
      this.p_.X(6, new net.y_.w(this, 0.5D, 20, 15.0F));
      this.p_.X(8, new of(this, 0.6D));
      this.p_.X(9, new ok(this, net.r.r.class, 3.0F, 1.0F));
      this.p_.X(10, new ok(this, net.ne.y.class, 8.0F));
      this.pM.X(1, new oo(this, true, new Class[]{w.class}));
      this.pM.X(2, (new o8(this, net.r.r.class, true)).g(300));
      this.pM.X(3, (new o8(this, net.yn.s.class, false)).g(300));
      this.pM.X(3, (new o8(this, b.class, false)).g(300));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.5D);
      this.t(net.ne.d.L).t(18.0D);
      this.t(net.ne.d.C).t(32.0D);
   }

   public net.ne.g t(net.yv.g var1, net.ne.g var2) {
      this.u(z2.MAINHAND, new ks(net.nb.j.w));
      return super.t(var1, var2);
   }

   protected void g() {
      super.g();
   }

   protected m_ N() {
      return net.y7.p.W;
   }

   public net.u.e S() {
      return this.i().f(3.0D, 0.0D, 3.0D);
   }

   public void d() {
      n.o.y();
      super.d();
      if(this.hl.x && this.e()) {
         --this.NA;
         if(this.NA < 0) {
            this.NA = 0;
         }

         if(this.Xl != 1 && this.x % 1200 != 0) {
            if(this.Xl != this.Ax - 1) {
               return;
            }

            this.NA = 3;
            int var2 = 0;
            this.Nw[0][var2] = this.Nw[1][var2];
            this.Nw[1][var2] = new net.u.r(0.0D, 0.0D, 0.0D);
            ++var2;
         }

         this.NA = 3;
         float var6 = -6.0F;
         boolean var10000 = true;
         int var4 = 0;
         this.Nw[0][var4] = this.Nw[1][var4];
         this.Nw[1][var4] = new net.u.r((double)(-6.0F + (float)this.p.nextInt(13)) * 0.5D, (double)Math.max(0, this.p.nextInt(6) - 4), (double)(-6.0F + (float)this.p.nextInt(13)) * 0.5D);
         ++var4;
         var4 = 0;
         this.hl.n(ai.CLOUD, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, 0.0D, 0.0D, 0.0D, new int[0]);
         ++var4;
         this.hl.m(this.b, this.hS, this.hr, net.nb.l.CE, this.E(), 1.0F, 1.0F, false);
      }

   }

   public net.u.r[] N(float var1) {
      if(this.NA > 0) {
         double var2 = (double)(((float)this.NA - var1) / 3.0F);
         var2 = Math.pow(var2, 0.25D);
         net.u.r[] var4 = new net.u.r[4];
         int var5 = 0;

         while(true) {
            var4[var5] = this.Nw[1][var5].T(1.0D - var2).v(this.Nw[0][var5].T(var2));
            ++var5;
         }
      }

      return this.Nw[1];
   }

   public boolean M(net.ne.l var1) {
      return super.M(var1)?true:(var1 instanceof net.ne.a && ((net.ne.a)var1).g() == net.ne.u.ILLAGER?this.f() == null && var1.f() == null:false);
   }

   protected net.yz.a T() {
      return net.nb.l.o_;
   }

   protected net.yz.a r() {
      return net.nb.l.l;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.ov;
   }

   protected net.yz.a d() {
      return net.nb.l.Dt;
   }

   public void x(net.ne.a var1, float var2) {
      net.n1.o var3 = this.M(var2);
      double var4 = var1.b - this.b;
      double var6 = var1.i().u + (double)(var1.m / 3.0F) - var3.hS;
      double var8 = var1.hr - this.hr;
      double var10 = (double)net.u.t.R(var4 * var4 + var8 * var8);
      var3.w(var4, var6 + var10 * 0.20000000298023224D, var8, 1.6F, (float)(14 - this.hl.k().L() * 4));
      this.I(net.nb.l.ok, 1.0F, 1.0F / (this.Q().nextFloat() * 0.4F + 0.8F));
      this.hl.S(var3);
   }

   protected net.n1.o M(float var1) {
      net.n1.b var2 = new net.n1.b(this.hl, this);
      var2.s(this, var1);
      return var2;
   }

   public boolean ak() {
      return this.i(1);
   }

   public void c(boolean var1) {
      this.o(1, var1);
   }

   public r.o y() {
      return this.k8()?r.o.SPELLCASTING:(this.ak()?r.o.BOW_AND_ARROW:r.o.CROSSED);
   }

   private static xn e(xn var0) {
      return var0;
   }

   class j extends n.o {
      private int O;

      private j() {
         super();
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return !super.f()?false:(w.this.M() == null?false:(w.this.M().G() == this.O?false:w.this.hl.G(new net.u.j(w.this)).k((float)net.yv.l.NORMAL.ordinal())));
      }

      public void I() {
         super.I();
         this.O = w.this.M().G();
      }

      protected int h() {
         return 20;
      }

      protected int T() {
         return 180;
      }

      protected void Q() {
         w.this.M().o(new net.n_.i(net.nb.b.T, 400));
      }

      protected net.yz.a H() {
         return net.nb.l.C_;
      }

      protected n.a K() {
         return n.a.BLINDNESS;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }

   class t extends n.o {
      private t() {
         super();
      }

      public boolean f() {
         net.u.d[] var1 = n.o.y();
         return !super.f()?false:!w.this.J(net.nb.b.y);
      }

      protected int h() {
         return 20;
      }

      protected int T() {
         return 340;
      }

      protected void Q() {
         w.this.o(new net.n_.i(net.nb.b.y, 1200));
      }

      @Nullable
      protected net.yz.a H() {
         return net.nb.l.Kd;
      }

      protected n.a K() {
         return n.a.DISAPPEAR;
      }

      private static xn c(xn var0) {
         return var0;
      }
   }
}
