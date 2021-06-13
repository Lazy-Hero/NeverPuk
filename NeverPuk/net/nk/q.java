package net.nk;

import java.util.Calendar;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.nk.b;
import net.nk.i;
import net.nk.n;
import net.nl.z2;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.op;
import net.y_.ov;
import net.y_.ow;

public abstract class q extends i implements net.ne.x {
   private static final net.k.v UT = net.k.n.q(q.class, net.k.y.f);
   private final net.y_.w U1 = new net.y_.w(this, 1.0D, 20, 15.0F);
   private final net.y_.k UU = new net.y_.k(this, 1.2D, var5) {
      public void C() {
         super.C();
         q.this.c(false);
      }

      public void I() {
         super.I();
         q.this.c(true);
      }
   };

   public q(net.yv.r var1) {
      super(var1);
      this.S(0.6F, 1.99F);
      this.H();
   }

   protected void D() {
      this.p_.X(1, new op(this));
      this.p_.X(2, new ov(this));
      this.p_.X(3, new net.y_.t(this, 1.0D));
      this.p_.X(3, new net.y_.n(this, net.yn.x.class, 6.0F, 1.0D, 1.2D));
      this.p_.X(5, new ow(this, 1.0D));
      this.p_.X(6, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(6, new oa(this));
      this.pM.X(1, new oo(this, false, new Class[0]));
      this.pM.X(2, new o8(this, net.r.r.class, true));
      this.pM.X(3, new o8(this, b.class, true));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.G).t(0.25D);
   }

   protected void g() {
      super.g();
      this.G.r(UT, Boolean.valueOf(false));
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(this.R(), 0.15F, 1.0F);
   }

   abstract net.yz.a R();

   public net.ne.u g() {
      return net.ne.u.UNDEAD;
   }

   public void d() {
      net.u.d[] var1 = n.o.y();
      if(this.hl.u() && !this.hl.x) {
         float var2 = this.d();
         net.u.j var3 = this.D() instanceof net.nm.b?(new net.u.j(this.b, (double)Math.round(this.hS), this.hr)).h():new net.u.j(this.b, (double)Math.round(this.hS), this.hr);
         if(var2 > 0.5F && this.p.nextFloat() * 30.0F < (var2 - 0.4F) * 2.0F && this.hl.V(var3)) {
            boolean var4 = true;
            ks var5 = this.U(z2.HEAD);
            if(!var5.B()) {
               if(var5.M()) {
                  var5.d(var5.z() + this.p.nextInt(2));
                  if(var5.z() >= var5.Z()) {
                     this.T(var5);
                     this.u(z2.HEAD, ks.a);
                  }
               }

               var4 = false;
            }

            this.n(8);
         }
      }

      super.d();
   }

   public void C() {
      super.C();
      if(this.D() instanceof net.ne.s) {
         net.ne.s var1 = (net.ne.s)this.D();
         this.AK = var1.AK;
      }

   }

   protected void T(net.yv.g var1) {
      super.T(var1);
      this.u(z2.MAINHAND, new ks(net.nb.j.w));
   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      this.T(var1);
      this.I(var1);
      this.H();
      this.t(this.p.nextFloat() < 0.55F * var1.l());
      if(this.U(z2.HEAD).B()) {
         Calendar var3 = this.hl.l();
         if(var3.get(2) + 1 == 10 && var3.get(5) == 31 && this.p.nextFloat() < 0.25F) {
            this.u(z2.HEAD, new ks(this.p.nextFloat() < 0.1F?net.nb.f.N:net.nb.f.TS));
            this.pw[z2.HEAD.l()] = 0.0F;
         }
      }

      return var2;
   }

   public void H() {
      if(this.hl != null && !this.hl.x) {
         this.p_.e(this.UU);
         this.p_.e(this.U1);
         ks var1 = this.S();
         if(var1.Z() == net.nb.j.w) {
            byte var2 = 20;
            if(this.hl.k() != net.yv.l.HARD) {
               var2 = 40;
            }

            this.U1.C(var2);
            this.p_.X(4, this.U1);
         } else {
            this.p_.X(4, this.UU);
         }
      }

   }

   public void x(net.ne.a var1, float var2) {
      net.n1.o var3 = this.c(var2);
      double var4 = var1.b - this.b;
      double var6 = var1.i().u + (double)(var1.m / 3.0F) - var3.hS;
      double var8 = var1.hr - this.hr;
      double var10 = (double)net.u.t.R(var4 * var4 + var8 * var8);
      var3.w(var4, var6 + var10 * 0.20000000298023224D, var8, 1.6F, (float)(14 - this.hl.k().L() * 4));
      this.I(net.nb.l.ok, 1.0F, 1.0F / (this.Q().nextFloat() * 0.4F + 0.8F));
      this.hl.S(var3);
   }

   protected net.n1.o c(float var1) {
      net.n1.b var2 = new net.n1.b(this.hl, this);
      var2.s(this, var1);
      return var2;
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.H();
   }

   public void u(z2 var1, ks var2) {
      super.u(var1, var2);
      if(!this.hl.x && var1 == z2.MAINHAND) {
         this.H();
      }

   }

   public float A() {
      return 1.74F;
   }

   public double O() {
      return -0.6D;
   }

   public boolean yy() {
      return ((Boolean)this.G.a(UT)).booleanValue();
   }

   public void c(boolean var1) {
      this.G.d(UT, Boolean.valueOf(var1));
   }

   private static xn d(xn var0) {
      return var0;
   }
}
