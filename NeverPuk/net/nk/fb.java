package net.nk;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nk.fc;
import net.nk.n;
import net.yz.m_;

public class fb extends net.ne.h implements fc {
   private static final net.k.v WQ = net.k.n.q(fb.class, net.k.y.f);
   private int Wn = 1;

   public fb(net.yv.r var1) {
      super(var1);
      this.S(4.0F, 4.0F);
      this.hw = true;
      this.p0 = 5;
      this.pn = new fb.c(this);
   }

   protected void D() {
      this.p_.X(5, new fb.o(this));
      this.p_.X(7, new fb.f(this));
      this.p_.X(7, new fb.v(this));
      this.pM.X(1, new net.y_.f(this));
   }

   public boolean D() {
      return ((Boolean)this.G.a(WQ)).booleanValue();
   }

   public void Y(boolean var1) {
      this.G.d(WQ, Boolean.valueOf(var1));
   }

   public int o() {
      return this.Wn;
   }

   public void A() {
      super.A();
      if(!this.hl.x && this.hl.k() == net.yv.l.PEACEFUL) {
         this.B();
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      net.u.d[] var3 = n.o.y();
      if(this.w(var1)) {
         return false;
      } else if(var1.g() instanceof net.n1.y && var1.v() instanceof net.r.r) {
         super.H(var1, 1000.0F);
         return true;
      } else {
         return super.H(var1, var2);
      }
   }

   protected void g() {
      super.g();
      this.G.r(WQ, Boolean.valueOf(false));
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(10.0D);
      this.t(net.ne.d.L).t(100.0D);
   }

   public net.yz.p E() {
      return net.yz.p.HOSTILE;
   }

   protected net.yz.a T() {
      return net.nb.l.wo;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.KP;
   }

   protected net.yz.a r() {
      return net.nb.l.Df;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.x;
   }

   protected float G() {
      return 10.0F;
   }

   public boolean l4() {
      return this.p.nextInt(20) == 0 && super.l4() && this.hl.k() != net.yv.l.PEACEFUL;
   }

   public int W() {
      return 1;
   }

   public static void F(net.c0.d var0) {
      net.ne.y.J(var0, fb.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("ExplosionPower", this.Wn);
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("ExplosionPower", 99)) {
         this.Wn = var1.P("ExplosionPower");
      }

   }

   public float A() {
      return 2.6F;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static class c extends net.y_.u {
      private final fb B;
      private int v;

      public c(fb var1) {
         super(var1);
         this.B = var1;
      }

      public void D() {
         net.u.d[] var1 = n.o.y();
         if(this.p == net.y_.u.MOVE_TO) {
            double var2 = this.c - this.B.b;
            double var4 = this.X - this.B.hS;
            double var6 = this.Y - this.B.hr;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if(this.v-- <= 0) {
               this.v += this.B.Q().nextInt(5) + 2;
               var8 = (double)net.u.t.R(var8);
               if(this.U(this.c, this.X, this.Y, var8)) {
                  this.B.hf += var2 / var8 * 0.1D;
                  this.B.K += var4 / var8 * 0.1D;
                  this.B.J += var6 / var8 * 0.1D;
               }

               this.p = net.y_.u.WAIT;
            }
         }

      }

      private boolean U(double var1, double var3, double var5, double var7) {
         double var9 = (var1 - this.B.b) / var7;
         double var11 = (var3 - this.B.hS) / var7;
         double var13 = (var5 - this.B.hr) / var7;
         net.u.e var15 = this.B.i();

         for(int var16 = 1; (double)var16 < var7; ++var16) {
            var15 = var15.w(var9, var11, var13);
            if(!this.B.hl.h(this.B, var15).isEmpty()) {
               return false;
            }
         }

         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class f extends net.y_.b {
      private final fb p;

      public f(fb var1) {
         this.p = var1;
         this.h(2);
      }

      public boolean f() {
         return true;
      }

      public void E() {
         net.u.d[] var1 = n.o.y();
         if(this.p.M() == null) {
            this.p.hN = -((float)net.u.t.V(this.p.hf, this.p.J)) * 57.295776F;
            this.p.AK = this.p.hN;
         }

         net.ne.a var2 = this.p.M();
         double var10000 = 64.0D;
         if(var2.F(this.p) < 4096.0D) {
            double var5 = var2.b - this.p.b;
            double var7 = var2.hr - this.p.hr;
            this.p.hN = -((float)net.u.t.V(var5, var7)) * 57.295776F;
            this.p.AK = this.p.hN;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class o extends net.y_.b {
      private final fb Z;

      public o(fb var1) {
         this.Z = var1;
         this.h(1);
      }

      public boolean f() {
         n.o.y();
         net.y_.u var2 = this.Z.m();
         if(!var2.J()) {
            return true;
         } else {
            double var3 = var2.H() - this.Z.b;
            double var5 = var2.F() - this.Z.hS;
            double var7 = var2.s() - this.Z.hr;
            double var9 = var3 * var3 + var5 * var5 + var7 * var7;
            return Double.compare(var9, 1.0D) < 0 || Double.compare(var9, 3600.0D) > 0;
         }
      }

      public boolean X() {
         return false;
      }

      public void I() {
         Random var1 = this.Z.Q();
         double var2 = this.Z.b + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
         double var4 = this.Z.hS + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
         double var6 = this.Z.hr + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
         this.Z.m().Q(var2, var4, var6, 1.0D);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   static class v extends net.y_.b {
      private final fb Q;
      public int G;

      public v(fb var1) {
         this.Q = var1;
      }

      public boolean f() {
         return this.Q.M() != null;
      }

      public void I() {
         this.G = 0;
      }

      public void C() {
         this.Q.Y(false);
      }

      public void E() {
         n.o.y();
         net.ne.a var2 = this.Q.M();
         double var10000 = 64.0D;
         if(Double.compare(var2.F(this.Q), 4096.0D) < 0 && this.Q.b(var2)) {
            net.yv.r var5 = this.Q.hl;
            ++this.G;
            if(this.G == 10) {
               var5.N((net.r.r)null, 1015, new net.u.j(this.Q), 0);
            }

            if(this.G == 20) {
               var10000 = 4.0D;
               net.u.r var8 = this.Q.r(1.0F);
               double var9 = var2.b - (this.Q.b + var8.p * 4.0D);
               double var11 = var2.i().u + (double)(var2.m / 2.0F) - (0.5D + this.Q.hS + (double)(this.Q.m / 2.0F));
               double var13 = var2.hr - (this.Q.hr + var8.a * 4.0D);
               var5.N((net.r.r)null, 1016, new net.u.j(this.Q), 0);
               net.n1.y var15 = new net.n1.y(var5, this.Q, var9, var11, var13);
               var15.Aa = this.Q.o();
               var15.b = this.Q.b + var8.p * 4.0D;
               var15.hS = this.Q.hS + (double)(this.Q.m / 2.0F) + 0.5D;
               var15.hr = this.Q.hr + var8.a * 4.0D;
               var5.S(var15);
               this.G = -40;
            }
         }

         if(this.G > 0) {
            --this.G;
         }

         this.Q.Y(this.G > 10);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
