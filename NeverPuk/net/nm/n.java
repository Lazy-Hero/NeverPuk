package net.nm;

import net.xn;
import net.k.y;
import net.n0.ks;
import net.ng.c;
import net.nm.w;
import net.yz.ai;

public class n extends net.ne.l {
   private static final net.k.v DG = net.k.n.q(n.class, y.k);
   private static final net.k.v DV = net.k.n.q(n.class, y.d);
   private int D0;
   private int DS;
   private net.ne.a DO;

   public n(net.yv.r var1) {
      super(var1);
      this.S(0.25F, 0.25F);
   }

   protected void g() {
      this.G.r(DG, ks.a);
      this.G.r(DV, Integer.valueOf(0));
   }

   public boolean p(double var1) {
      return var1 < 4096.0D && !this.D();
   }

   public boolean e(double var1, double var3, double var5) {
      return super.e(var1, var3, var5) && !this.D();
   }

   public n(net.yv.r var1, double var2, double var4, double var6, ks var8) {
      super(var1);
      this.D0 = 0;
      this.S(0.25F, 0.25F);
      this.t(var2, var4, var6);
      int var9 = 1;
      if(!var8.B() && var8.D()) {
         this.G.d(DG, var8.s());
         net.nj.f var10 = var8.o();
         net.nj.f var11 = var10.o("Fireworks");
         var9 += var11.R("Flight");
      }

      this.hf = this.p.nextGaussian() * 0.001D;
      this.J = this.p.nextGaussian() * 0.001D;
      this.K = 0.05D;
      this.DS = 10 * var9 + this.p.nextInt(6) + this.p.nextInt(7);
   }

   public n(net.yv.r var1, ks var2, net.ne.a var3) {
      this(var1, var3.b, var3.hS, var3.hr, var2);
      this.G.d(DV, Integer.valueOf(var3.G()));
      this.DO = var3;
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      if(this.d == 0.0F && this.hq == 0.0F) {
         float var7 = net.u.t.R(var1 * var1 + var5 * var5);
         this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
         this.V = (float)(net.u.t.V(var3, (double)var7) * 57.29577951308232D);
         this.hq = this.hN;
         this.d = this.V;
      }

   }

   public void A() {
      label0: {
         w.h.u();
         this.hL = this.b;
         this.F = this.hS;
         this.A = this.hr;
         super.A();
         if(this.D()) {
            if(this.DO == null) {
               net.ne.l var2 = this.hl.S(((Integer)this.G.a(DV)).intValue());
               if(var2 instanceof net.ne.a) {
                  this.DO = (net.ne.a)var2;
               }
            }

            if(this.DO == null) {
               break label0;
            }

            if(this.DO.I()) {
               net.u.r var7 = this.DO.g();
               double var10000 = 1.5D;
               var10000 = 0.1D;
               this.DO.hf += var7.p * 0.1D + (var7.p * 1.5D - this.DO.hf) * 0.5D;
               this.DO.K += var7.H * 0.1D + (var7.H * 1.5D - this.DO.K) * 0.5D;
               this.DO.J += var7.a * 0.1D + (var7.a * 1.5D - this.DO.J) * 0.5D;
            }

            this.t(this.DO.b, this.DO.hS, this.DO.hr);
            this.hf = this.DO.hf;
            this.K = this.DO.K;
            this.J = this.DO.J;
         }

         this.hf *= 1.15D;
         this.J *= 1.15D;
         this.K += 0.04D;
         this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      }

      float var8 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var8) * 57.29577951308232D);
      if(this.V - this.d < -180.0F) {
         this.d -= 360.0F;
      }

      if(this.V - this.d >= 180.0F) {
         this.d += 360.0F;
      }

      if(this.hN - this.hq < -180.0F) {
         this.hq -= 360.0F;
      }

      if(this.hN - this.hq >= 180.0F) {
         this.hq += 360.0F;
      }

      this.V = this.d + (this.V - this.d) * 0.2F;
      this.hN = this.hq + (this.hN - this.hq) * 0.2F;
      if(this.D0 == 0 && !this.c()) {
         this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.Dp, net.yz.p.AMBIENT, 3.0F, 1.0F);
      }

      ++this.D0;
      if(this.hl.x && this.D0 % 2 < 2) {
         this.hl.n(ai.FIREWORKS_SPARK, this.b, this.hS - 0.3D, this.hr, this.p.nextGaussian() * 0.05D, -this.K * 0.5D, this.p.nextGaussian() * 0.05D, new int[0]);
      }

      if(!this.hl.x && this.D0 > this.DS) {
         this.hl.k(this, (byte)17);
         this.z();
         this.B();
      }

   }

   private void z() {
      float var1 = 0.0F;
      ks var2 = (ks)this.G.a(DG);
      net.nj.f var3 = var2.B()?null:var2.j("Fireworks");
      net.nj.h var4 = var3.A("Explosions", 10);
      if(!var4.N()) {
         var1 = (float)(5 + var4.z() * 2);
      }

      float var13;
      int var10000 = (var13 = var1 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
   }

   public boolean D() {
      return ((Integer)this.G.a(DV)).intValue() > 0;
   }

   public void R(byte var1) {
      if(var1 == 17 && this.hl.x) {
         ks var2 = (ks)this.G.a(DG);
         net.nj.f var3 = var2.B()?null:var2.j("Fireworks");
         this.hl.u(this.b, this.hS, this.hr, this.hf, this.K, this.J, var3);
      }

      super.R(var1);
   }

   public static void e(net.c0.d var0) {
      var0.U(net.c0.q.ENTITY, new c(n.class, new String[]{"FireworksItem"}));
   }

   public void I(net.nj.f var1) {
      var1.r("Life", this.D0);
      var1.r("LifeTime", this.DS);
      ks var2 = (ks)this.G.a(DG);
      if(!var2.B()) {
         var1.K("FireworksItem", var2.Z(new net.nj.f()));
      }

   }

   public void o(net.nj.f var1) {
      this.D0 = var1.P("Life");
      this.DS = var1.P("LifeTime");
      net.nj.f var2 = var1.o("FireworksItem");
      ks var3 = new ks(var2);
      if(!var3.B()) {
         this.G.d(DG, var3);
      }

   }

   public boolean C() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
