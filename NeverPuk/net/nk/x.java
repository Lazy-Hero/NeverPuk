package net.nk;

import javax.annotation.Nullable;
import net.xn;
import net.nk.i;
import net.nk.n;
import net.y_.o2;
import net.y_.o8;
import net.y_.oa;
import net.y_.ok;
import net.y_.oo;
import net.y_.ow;
import net.yz.ai;
import net.yz.m_;

public class x extends i {
   private float nP = 0.5F;
   private int nA;
   private static final net.k.v nj = net.k.n.q(x.class, net.k.y.g);

   public x(net.yv.r var1) {
      super(var1);
      this.v(net.b.m.WATER, -1.0F);
      this.v(net.b.m.LAVA, 8.0F);
      this.v(net.b.m.DANGER_FIRE, 0.0F);
      this.v(net.b.m.DAMAGE_FIRE, 0.0F);
      this.hw = true;
      this.p0 = 10;
   }

   public static void D(net.c0.d var0) {
      net.ne.y.J(var0, x.class);
   }

   protected void D() {
      this.p_.X(4, new x.z(this));
      this.p_.X(5, new o2(this, 1.0D));
      this.p_.X(7, new ow(this, 1.0D, 0.0F));
      this.p_.X(8, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(8, new oa(this));
      this.pM.X(1, new oo(this, true, new Class[0]));
      this.pM.X(2, new o8(this, net.r.r.class, true));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.S).t(6.0D);
      this.t(net.ne.d.G).t(0.23000000417232513D);
      this.t(net.ne.d.L).t(48.0D);
   }

   protected void g() {
      super.g();
      this.G.r(nj, Byte.valueOf((byte)0));
   }

   protected net.yz.a T() {
      return net.nb.l.Kk;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.D_;
   }

   protected net.yz.a r() {
      return net.nb.l.Mx;
   }

   public int L() {
      return 15728880;
   }

   public float d() {
      return 1.0F;
   }

   public void d() {
      net.u.d[] var1 = n.o.y();
      if(!this.k && Double.compare(this.K, 0.0D) < 0) {
         this.K *= 0.6D;
      }

      if(this.hl.x) {
         if(this.p.nextInt(24) == 0 && !this.c()) {
            this.hl.m(this.b + 0.5D, this.hS + 0.5D, this.hr + 0.5D, net.nb.l.w4, this.E(), 1.0F + this.p.nextFloat(), this.p.nextFloat() * 0.7F + 0.3F, false);
         }

         int var2 = 0;
         this.hl.n(ai.SMOKE_LARGE, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9, this.hS + this.p.nextDouble() * (double)this.m, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9, 0.0D, 0.0D, 0.0D, new int[0]);
         ++var2;
      }

      super.d();
   }

   protected void T() {
      if(this.J()) {
         this.H(net.yz.z.N, 1.0F);
      }

      --this.nA;
      if(this.nA <= 0) {
         this.nA = 100;
         this.nP = 0.5F + (float)this.p.nextGaussian() * 3.0F;
      }

      net.ne.a var1 = this.M();
      if(var1.hS + (double)var1.A() > this.hS + (double)this.A() + (double)this.nP) {
         this.K += (0.30000001192092896D - this.K) * 0.30000001192092896D;
         this.w = true;
      }

      super.T();
   }

   public void v(float var1, float var2) {
   }

   public boolean a() {
      return this.dw();
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.h;
   }

   public boolean dw() {
      return (((Byte)this.G.a(nj)).byteValue() & 1) != 0;
   }

   public void v(boolean var1) {
      byte var2 = ((Byte)this.G.a(nj)).byteValue();
      var2 = (byte)(var2 | 1);
      this.G.d(nj, Byte.valueOf(var2));
   }

   protected boolean D() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class z extends net.y_.b {
      private final x o;
      private int X;
      private int m;

      public z(x var1) {
         this.o = var1;
         this.h(3);
      }

      public boolean f() {
         net.ne.a var1 = this.o.M();
         return var1.P();
      }

      public void I() {
         this.X = 0;
      }

      public void C() {
         this.o.v(false);
      }

      public void E() {
         --this.m;
         n.o.y();
         net.ne.a var2 = this.o.M();
         double var3 = this.o.F(var2);
         if(Double.compare(var3, 4.0D) < 0) {
            if(this.m <= 0) {
               this.m = 20;
               this.o.S(var2);
            }

            this.o.m().Q(var2.b, var2.hS, var2.hr, 1.0D);
         }

         if(var3 < this.l() * this.l()) {
            double var5 = var2.b - this.o.b;
            double var7 = var2.i().u + (double)(var2.m / 2.0F) - (this.o.hS + (double)(this.o.m / 2.0F));
            double var9 = var2.hr - this.o.hr;
            if(this.m <= 0) {
               ++this.X;
               if(this.X == 1) {
                  this.m = 60;
                  this.o.v(true);
               }

               if(this.X <= 4) {
                  this.m = 6;
               }

               this.m = 100;
               this.X = 0;
               this.o.v(false);
               if(this.X > 1) {
                  float var11 = net.u.t.g(net.u.t.R(var3)) * 0.5F;
                  this.o.hl.N((net.r.r)null, 1018, new net.u.j((int)this.o.b, (int)this.o.hS, (int)this.o.hr), 0);
                  int var12 = 0;
                  net.n1.u var13 = new net.n1.u(this.o.hl, this.o, var5 + this.o.Q().nextGaussian() * (double)var11, var7, var9 + this.o.Q().nextGaussian() * (double)var11);
                  var13.hS = this.o.hS + (double)(this.o.m / 2.0F) + 0.5D;
                  this.o.hl.S(var13);
                  ++var12;
               }
            }

            this.o.E().n(var2, 10.0F, 10.0F);
         }

         this.o.H().u();
         this.o.m().Q(var2.b, var2.hS, var2.hr, 1.0D);
         super.E();
      }

      private double l() {
         net.s.i var1 = this.o.t(net.ne.d.L);
         return 16.0D;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
