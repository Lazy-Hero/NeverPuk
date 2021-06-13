package net.nk;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.nk.i;
import net.nk.l;
import net.nk.n;
import net.y_.o2;
import net.y_.o8;
import net.y_.oa;
import net.y_.of;
import net.y_.ok;
import net.yz.ai;
import net.yz.m_;

public class z extends i {
   private static final net.k.v U3 = net.k.n.q(net.nk.z.class, net.k.y.f);
   private static final net.k.v UY = net.k.n.q(net.nk.z.class, net.k.y.d);
   protected float UJ;
   protected float US;
   protected float U7;
   protected float Uq;
   protected float Uv;
   private net.ne.a Up;
   private int Us;
   private boolean UW;
   protected of U_;

   public z(net.yv.r var1) {
      super(var1);
      this.p0 = 10;
      this.S(0.85F, 0.85F);
      this.pn = new net.nk.z(this);
      this.UJ = this.p.nextFloat();
      this.US = this.UJ;
   }

   protected void D() {
      o2 var1 = new o2(this, 1.0D);
      this.U_ = new of(this, 1.0D, 80);
      this.p_.X(4, new net.nk.z(this));
      this.p_.X(5, var1);
      this.p_.X(7, this.U_);
      this.p_.X(8, new ok(this, net.r.r.class, 8.0F));
      this.p_.X(8, new ok(this, net.nk.z.class, 12.0F, 0.01F));
      this.p_.X(9, new oa(this));
      this.U_.h(3);
      var1.h(3);
      this.pM.X(1, new o8(this, net.ne.a.class, 10, true, false, new net.nk.z(this)));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.S).t(6.0D);
      this.t(net.ne.d.G).t(0.5D);
      this.t(net.ne.d.L).t(16.0D);
      this.t(net.ne.d.C).t(30.0D);
   }

   public static void t(net.c0.d var0) {
      net.ne.y.J(var0, net.nk.z.class);
   }

   protected net.b.n I(net.yv.r var1) {
      return new net.b.v(this, var1);
   }

   protected void g() {
      super.g();
      this.G.r(U3, Boolean.valueOf(false));
      this.G.r(UY, Integer.valueOf(0));
   }

   public boolean Ol() {
      return ((Boolean)this.G.a(U3)).booleanValue();
   }

   private void B(boolean var1) {
      this.G.d(U3, Boolean.valueOf(var1));
   }

   public int X() {
      return 80;
   }

   private void C(int var1) {
      this.G.d(UY, Integer.valueOf(var1));
   }

   public boolean Oe() {
      return ((Integer)this.G.a(UY)).intValue() != 0;
   }

   @Nullable
   public net.ne.a s() {
      if(!this.Oe()) {
         return null;
      } else if(this.hl.x) {
         if(this.Up != null) {
            return this.Up;
         } else {
            net.ne.l var1 = this.hl.S(((Integer)this.G.a(UY)).intValue());
            if(var1 instanceof net.ne.a) {
               this.Up = (net.ne.a)var1;
               return this.Up;
            } else {
               return null;
            }
         }
      } else {
         return this.M();
      }
   }

   public void O(net.k.v var1) {
      super.O(var1);
      if(UY.equals(var1)) {
         this.Us = 0;
         this.Up = null;
      }

   }

   public int g() {
      return 160;
   }

   protected net.yz.a T() {
      return this.p()?net.nb.l.Hb:net.nb.l.oy;
   }

   protected net.yz.a m(net.yz.z var1) {
      return this.p()?net.nb.l.Cy:net.nb.l.oN;
   }

   protected net.yz.a r() {
      return this.p()?net.nb.l.CP:net.nb.l.MA;
   }

   protected boolean k() {
      return false;
   }

   public float A() {
      return this.m * 0.5F;
   }

   public float O(net.u.j var1) {
      return this.hl.Z(var1).n() == net.y1.l.p?10.0F + this.hl.u(var1) - 0.5F:super.O(var1);
   }

   public void d() {
      net.u.d[] var1 = n.o.y();
      if(this.hl.x) {
         this.US = this.UJ;
         if(!this.p()) {
            this.U7 = 2.0F;
            if(this.K > 0.0D && this.UW && !this.c()) {
               this.hl.m(this.b, this.hS, this.hr, this.A(), this.E(), 1.0F, 1.0F, false);
            }

            this.UW = Double.compare(this.K, 0.0D) < 0 && this.hl.E((new net.u.j(this)).b(), false);
         }

         if(this.Ol()) {
            if(this.U7 < 0.5F) {
               this.U7 = 4.0F;
            }

            this.U7 += (0.5F - this.U7) * 0.1F;
         }

         this.U7 += (0.125F - this.U7) * 0.2F;
         this.UJ += this.U7;
         this.Uv = this.Uq;
         if(!this.p()) {
            this.Uq = this.p.nextFloat();
         }

         if(this.Ol()) {
            this.Uq += (0.0F - this.Uq) * 0.25F;
         }

         this.Uq += (1.0F - this.Uq) * 0.06F;
         if(this.Ol() && this.p()) {
            net.u.r var2 = this.r(0.0F);
            int var3 = 0;
            this.hl.n(ai.WATER_BUBBLE, this.b + (this.p.nextDouble() - 0.5D) * (double)this.h9 - var2.p * 1.5D, this.hS + this.p.nextDouble() * (double)this.m - var2.H * 1.5D, this.hr + (this.p.nextDouble() - 0.5D) * (double)this.h9 - var2.a * 1.5D, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var3;
         }

         if(this.Oe()) {
            if(this.Us < this.X()) {
               ++this.Us;
            }

            net.ne.a var15 = this.s();
            this.E().n(var15, 90.0F, 90.0F);
            this.E().p();
            double var17 = (double)this.a(0.0F);
            double var5 = var15.b - this.b;
            double var7 = var15.hS + (double)(var15.m * 0.5F) - (this.hS + (double)this.A());
            double var9 = var15.hr - this.hr;
            double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
            var5 = var5 / var11;
            var7 = var7 / var11;
            var9 = var9 / var11;
            double var13 = this.p.nextDouble();
            if(var13 < var11) {
               var13 = var13 + 1.8D - var17 + this.p.nextDouble() * (1.7D - var17);
               this.hl.n(ai.WATER_BUBBLE, this.b + var5 * var13, this.hS + var7 * var13 + (double)this.A(), this.hr + var9 * var13, 0.0D, 0.0D, 0.0D, new int[0]);
            }
         }
      }

      if(this.hW) {
         this.J(300);
      }

      if(this.k) {
         this.K += 0.5D;
         this.hf += (double)((this.p.nextFloat() * 2.0F - 1.0F) * 0.4F);
         this.J += (double)((this.p.nextFloat() * 2.0F - 1.0F) * 0.4F);
         this.hN = this.p.nextFloat() * 360.0F;
         this.k = false;
         this.w = true;
      }

      if(this.Oe()) {
         this.hN = this.A3;
      }

      super.d();
   }

   protected net.yz.a A() {
      return net.nb.l.CH;
   }

   public float g(float var1) {
      return this.US + (this.UJ - this.US) * var1;
   }

   public float N(float var1) {
      return this.Uv + (this.Uq - this.Uv) * var1;
   }

   public float a(float var1) {
      return ((float)this.Us + var1) / (float)this.X();
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pW;
   }

   protected boolean D() {
      return true;
   }

   public boolean l1() {
      return this.hl.N((net.u.e)this.i(), (net.ne.l)this) && this.hl.h(this, this.i()).isEmpty();
   }

   public boolean l4() {
      return (this.p.nextInt(20) == 0 || !this.hl.W(new net.u.j(this))) && super.l4();
   }

   public boolean H(net.yz.z var1, float var2) {
      if(!this.Ol() && !var1.p() && var1.g() instanceof net.ne.a) {
         net.ne.a var3 = (net.ne.a)var1.g();
         if(!var1.e()) {
            var3.H(net.yz.z.y(this), 2.0F);
         }
      }

      if(this.U_ != null) {
         this.U_.B();
      }

      return super.H(var1, var2);
   }

   public int w() {
      return 180;
   }

   public void E(float var1, float var2, float var3) {
      if(this.H7() && this.p()) {
         this.h(var1, var2, var3, 0.1F);
         this.N(net.ne.f.SELF, this.hf, this.K, this.J);
         this.hf *= 0.8999999761581421D;
         this.K *= 0.8999999761581421D;
         this.J *= 0.8999999761581421D;
         if(!this.Ol() && this.M() == null) {
            this.K -= 0.005D;
         }
      } else {
         super.E(var1, var2, var3);
      }

   }

   private static xn d(xn var0) {
      return var0;
   }

   static class d implements Predicate {
      private final net.nk.z c;

      public d(net.nk.z var1) {
         this.c = var1;
      }

      public boolean A(@Nullable net.ne.a var1) {
         net.u.d[] var2 = n.o.y();
         return (var1 instanceof net.r.r || var1 instanceof net.yn.m) && var1.F(this.c) > 9.0D;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class q extends net.y_.u {
      private final net.nk.z K;

      public q(net.nk.z var1) {
         super(var1);
         this.K = var1;
      }

      public void D() {
         net.u.d[] var1 = n.o.y();
         if(this.p == net.y_.u.MOVE_TO && !this.K.H().q()) {
            double var2 = this.c - this.K.b;
            double var4 = this.X - this.K.hS;
            double var6 = this.Y - this.K.hr;
            double var8 = (double)net.u.t.R(var2 * var2 + var4 * var4 + var6 * var6);
            var4 = var4 / var8;
            float var10 = (float)(net.u.t.V(var6, var2) * 57.29577951308232D) - 90.0F;
            this.K.hN = this.p(this.K.hN, var10, 90.0F);
            this.K.AK = this.K.hN;
            float var11 = (float)(this.b * this.K.t(net.ne.d.G).K());
            this.K.P(this.K.q() + (var11 - this.K.q()) * 0.125F);
            double var12 = Math.sin((double)(this.K.x + this.K.G()) * 0.5D) * 0.05D;
            double var14 = Math.cos((double)(this.K.hN * 0.017453292F));
            double var16 = Math.sin((double)(this.K.hN * 0.017453292F));
            this.K.hf += var12 * var14;
            this.K.J += var12 * var16;
            var12 = Math.sin((double)(this.K.x + this.K.G()) * 0.75D) * 0.05D;
            this.K.K += var12 * (var16 + var14) * 0.25D;
            this.K.K += (double)this.K.q() * var4 * 0.1D;
            net.y_.r var18 = this.K.E();
            double var19 = this.K.b + var2 / var8 * 2.0D;
            double var21 = (double)this.K.A() + this.K.hS + var4 / var8;
            double var23 = this.K.hr + var6 / var8 * 2.0D;
            double var25 = var18.v();
            double var27 = var18.B();
            double var29 = var18.k();
            if(!var18.A()) {
               var25 = var19;
               var27 = var21;
               var29 = var23;
            }

            this.K.E().u(var25 + (var19 - var25) * 0.125D, var27 + (var21 - var27) * 0.125D, var29 + (var23 - var29) * 0.125D, 10.0F, 40.0F);
            this.K.B(true);
         }

         this.K.P(0.0F);
         this.K.B(false);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class r extends net.y_.b {
      private final net.nk.z s;
      private int b;
      private final boolean k;

      public r(net.nk.z var1) {
         this.s = var1;
         this.k = var1 instanceof l;
         this.h(3);
      }

      public boolean f() {
         net.ne.a var1 = this.s.M();
         return var1.P();
      }

      public boolean X() {
         return super.X() && (this.k || this.s.F(this.s.M()) > 9.0D);
      }

      public void I() {
         this.b = -10;
         this.s.H().u();
         this.s.E().n(this.s.M(), 90.0F, 90.0F);
         this.s.w = true;
      }

      public void C() {
         this.s.C(0);
         this.s.C((net.ne.a)null);
         this.s.U_.B();
      }

      public void E() {
         net.ne.a var2 = this.s.M();
         n.o.y();
         this.s.H().u();
         this.s.E().n(var2, 90.0F, 90.0F);
         if(!this.s.b(var2)) {
            this.s.C((net.ne.a)null);
         }

         ++this.b;
         if(this.b == 0) {
            this.s.C(this.s.M().G());
            this.s.hl.k(this.s, (byte)21);
         }

         if(this.b >= this.s.X()) {
            float var3 = 1.0F;
            if(this.s.hl.k() == net.yv.l.HARD) {
               var3 += 2.0F;
            }

            if(this.k) {
               var3 += 2.0F;
            }

            var2.H(net.yz.z.G(this.s, this.s), var3);
            var2.H(net.yz.z.O(this.s), (float)this.s.t(net.ne.d.S).K());
            this.s.C((net.ne.a)null);
         }

         super.E();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
