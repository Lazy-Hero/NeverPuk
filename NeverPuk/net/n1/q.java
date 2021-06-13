package net.n1;

import java.util.List;
import net.xn;
import net.k.n;
import net.k.v;
import net.n0.ks;
import net.n1.o;
import net.nm.i;
import net.r.r;
import net.u.e;
import net.y9.g5;
import net.yv.d;
import net.yz.ai;

public class q extends net.ne.l {
   private static final v hh = n.q(q.class, net.k.y.d);
   private boolean hm;
   private int he;
   private r h1;
   private int h7;
   private int hQ;
   private int h5;
   private int ht;
   private float hD;
   public net.ne.l hb;
   private q.u hJ = q.u.FLYING;
   private int hc;
   private int hk;

   public q(net.yv.r var1, r var2, double var3, double var5, double var7) {
      super(var1);
      this.p(var2);
      this.t(var3, var5, var7);
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
   }

   public q(net.yv.r var1, r var2) {
      super(var1);
      this.p(var2);
      this.D();
   }

   private void p(r var1) {
      this.S(0.25F, 0.25F);
      this.hz = true;
      this.h1 = var1;
      this.h1.aS = this;
   }

   public void A(int var1) {
      this.hk = var1;
   }

   public void z(int var1) {
      this.hc = var1;
   }

   private void D() {
      float var1 = this.h1.d + (this.h1.V - this.h1.d);
      float var2 = this.h1.hq + (this.h1.hN - this.h1.hq);
      float var3 = net.u.t.m(-var2 * 0.017453292F - 3.1415927F);
      float var4 = net.u.t.A(-var2 * 0.017453292F - 3.1415927F);
      float var5 = -net.u.t.m(-var1 * 0.017453292F);
      float var6 = net.u.t.A(-var1 * 0.017453292F);
      double var7 = this.h1.h + (this.h1.b - this.h1.h) - (double)var4 * 0.3D;
      double var9 = this.h1.h6 + (this.h1.hS - this.h1.h6) + (double)this.h1.A();
      double var11 = this.h1.l + (this.h1.hr - this.h1.l) - (double)var3 * 0.3D;
      this.S(var7, var9, var11, var2, var1);
      this.hf = (double)(-var4);
      this.K = (double)net.u.t.T(-(var6 / var5), -5.0F, 5.0F);
      this.J = (double)(-var3);
      float var13 = net.u.t.R(this.hf * this.hf + this.K * this.K + this.J * this.J);
      this.hf *= 0.6D / (double)var13 + 0.5D + this.p.nextGaussian() * 0.0045D;
      this.K *= 0.6D / (double)var13 + 0.5D + this.p.nextGaussian() * 0.0045D;
      this.J *= 0.6D / (double)var13 + 0.5D + this.p.nextGaussian() * 0.0045D;
      float var14 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var14) * 57.29577951308232D);
      this.hq = this.hN;
      this.d = this.V;
   }

   protected void g() {
      this.A().r(hh, Integer.valueOf(0));
   }

   public void O(v var1) {
      if(hh.equals(var1)) {
         int var2 = ((Integer)this.A().a(hh)).intValue();
         this.hb = this.hl.S(var2 - 1);
      }

      super.O(var1);
   }

   public boolean p(double var1) {
      double var10000 = 64.0D;
      return var1 < 4096.0D;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   public void A() {
      super.A();
      if(this.h1 == null) {
         this.B();
      } else if(this.hl.x || !this.E()) {
         if(this.hm) {
            ++this.he;
            if(this.he >= 1200) {
               this.B();
               return;
            }
         }

         float var1 = 0.0F;
         net.u.j var2 = new net.u.j(this);
         net.yw.n var3 = this.hl.Z(var2);
         if(var3.n() == net.y1.l.p) {
            var1 = g5.H(var3, this.hl, var2);
         }

         if(this.hJ == q.u.FLYING) {
            if(this.hb != null) {
               this.hf = 0.0D;
               this.K = 0.0D;
               this.J = 0.0D;
               this.hJ = q.u.HOOKED_IN_ENTITY;
               return;
            }

            float var9;
            int var10000 = (var9 = var1 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
            if(!this.hl.x) {
               this.d();
            }

            if(!this.hm && !this.k && !this.t) {
               ++this.h7;
            } else {
               this.h7 = 0;
               this.hf = 0.0D;
               this.K = 0.0D;
               this.J = 0.0D;
            }
         } else {
            if(this.hJ == q.u.HOOKED_IN_ENTITY) {
               if(this.hb != null) {
                  if(this.hb.Z) {
                     this.hb = null;
                     this.hJ = q.u.FLYING;
                  } else {
                     this.b = this.hb.b;
                     double var7 = (double)this.hb.m;
                     this.hS = this.hb.i().u + var7 * 0.8D;
                     this.hr = this.hb.hr;
                     this.t(this.b, this.hS, this.hr);
                  }
               }

               return;
            }

            if(this.hJ == q.u.BOBBING) {
               this.hf *= 0.9D;
               this.J *= 0.9D;
               double var4 = this.hS + this.K - (double)var2.h() - (double)var1;
               if(Math.abs(var4) < 0.01D) {
                  var4 += Math.signum(var4) * 0.1D;
               }

               this.K -= var4 * (double)this.p.nextFloat() * 0.2D;
               if(!this.hl.x) {
                  float var10;
                  int var8 = (var10 = var1 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
               }
            }
         }

         if(var3.n() != net.y1.l.p) {
            this.K -= 0.03D;
         }

         this.N(net.ne.f.SELF, this.hf, this.K, this.J);
         this.Q();
         double var6 = 0.92D;
         this.hf *= 0.92D;
         this.K *= 0.92D;
         this.J *= 0.92D;
         this.t(this.b, this.hS, this.hr);
      }

   }

   private boolean E() {
      ks var1 = this.h1.S();
      ks var2 = this.h1.L();
      boolean var3 = var1.Z() == net.nb.j.WQ;
      boolean var4 = var2.Z() == net.nb.j.WQ;
      if(!this.h1.Z && this.h1.P() && this.F(this.h1) <= 1024.0D) {
         return false;
      } else {
         this.B();
         return true;
      }
   }

   private void Q() {
      float var1 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);

      for(this.V = (float)(net.u.t.V(this.K, (double)var1) * 57.29577951308232D); this.V - this.d < -180.0F; this.d -= 360.0F) {
         ;
      }

      while(this.V - this.d >= 180.0F) {
         this.d += 360.0F;
      }

      while(this.hN - this.hq < -180.0F) {
         this.hq -= 360.0F;
      }

      while(this.hN - this.hq >= 180.0F) {
         this.hq += 360.0F;
      }

      this.V = this.d + (this.V - this.d) * 0.2F;
      this.hN = this.hq + (this.hN - this.hq) * 0.2F;
   }

   private void d() {
      net.u.r var1 = new net.u.r(this.b, this.hS, this.hr);
      net.u.r var2 = new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      net.u.m var3 = this.hl.s(var1, var2, false, true, false);
      var1 = new net.u.r(this.b, this.hS, this.hr);
      new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      var2 = new net.u.r(var3.z.p, var3.z.H, var3.z.a);
      net.ne.l var4 = null;
      List var5 = this.hl.u(this, this.i().T(this.hf, this.K, this.J).x(1.0D));
      double var6 = 0.0D;

      for(net.ne.l var9 : var5) {
         if(this.c(var9) && (var9 != this.h1 || this.h7 >= 5)) {
            e var10 = var9.i().x(0.30000001192092896D);
            net.u.m var11 = var10.G(var1, var2);
            double var12 = var1.Y(var11.z);
            if(var12 >= var6) {
               double var17;
               int var10000 = (var17 = var6 - 0.0D) == 0.0D?0:(var17 < 0.0D?-1:1);
            }

            var4 = var9;
            var6 = var12;
         }
      }

      var3 = new net.u.m(var4);
      if(var3.v != net.u.m.MISS) {
         if(var3.v == net.u.m.ENTITY) {
            this.hb = var3.e;
            this.m();
         } else {
            this.hm = true;
         }
      }

   }

   private void m() {
      this.A().d(hh, Integer.valueOf(this.hb.G() + 1));
   }

   private void G(net.u.j var1) {
      o.s.H();
      d var3 = (d)this.hl;
      int var4 = 1;
      net.u.j var5 = var1.h();
      if(Float.compare(this.p.nextFloat(), 0.25F) < 0 && this.hl.F(var5)) {
         ++var4;
      }

      if(Float.compare(this.p.nextFloat(), 0.5F) < 0 && !this.hl.V(var5)) {
         --var4;
      }

      if(this.hQ > 0) {
         --this.hQ;
         if(this.hQ <= 0) {
            this.h5 = 0;
            this.ht = 0;
         }

         this.K -= 0.2D * (double)this.p.nextFloat() * (double)this.p.nextFloat();
      }

      if(this.ht > 0) {
         this.ht -= var4;
         if(this.ht > 0) {
            this.hD = (float)((double)this.hD + this.p.nextGaussian() * 4.0D);
            float var6 = this.hD * 0.017453292F;
            float var7 = net.u.t.A(var6);
            float var8 = net.u.t.m(var6);
            double var9 = this.b + (double)(var7 * (float)this.ht * 0.1F);
            double var11 = (double)((float)net.u.t.L(this.i().u) + 1.0F);
            double var13 = this.hr + (double)(var8 * (float)this.ht * 0.1F);
            net.y9.l var15 = var3.Z(new net.u.j(var9, var11 - 1.0D, var13)).Q();
            if(var15 == net.nb.f.uM || var15 == net.nb.f.dy) {
               if(this.p.nextFloat() < 0.15F) {
                  var3.q(ai.WATER_BUBBLE, var9, var11 - 0.10000000149011612D, var13, 1, (double)var7, 0.1D, (double)var8, 0.0D, new int[0]);
               }

               float var16 = var7 * 0.04F;
               float var17 = var8 * 0.04F;
               var3.q(ai.WATER_WAKE, var9, var11, var13, 0, (double)var17, 0.01D, (double)(-var16), 1.0D, new int[0]);
               var3.q(ai.WATER_WAKE, var9, var11, var13, 0, (double)(-var17), 0.01D, (double)var16, 1.0D, new int[0]);
            }
         }

         this.K = (double)(-0.4F * net.u.t.M(this.p, 0.6F, 1.0F));
         this.I(net.nb.l.MZ, 0.25F, 1.0F + (this.p.nextFloat() - this.p.nextFloat()) * 0.4F);
         double var18 = this.i().u + 0.5D;
         var3.q(ai.WATER_BUBBLE, this.b, var18, this.hr, (int)(1.0F + this.h9 * 20.0F), (double)this.h9, 0.0D, (double)this.h9, 0.20000000298023224D, new int[0]);
         var3.q(ai.WATER_WAKE, this.b, var18, this.hr, (int)(1.0F + this.h9 * 20.0F), (double)this.h9, 0.0D, (double)this.h9, 0.20000000298023224D, new int[0]);
         this.hQ = net.u.t.A(this.p, 20, 40);
      }

      if(this.h5 > 0) {
         this.h5 -= var4;
         float var19 = 0.15F;
         if(this.h5 < 20) {
            var19 = (float)((double)var19 + (double)(20 - this.h5) * 0.05D);
         }

         if(this.h5 < 40) {
            var19 = (float)((double)var19 + (double)(40 - this.h5) * 0.02D);
         }

         if(this.h5 < 60) {
            var19 = (float)((double)var19 + (double)(60 - this.h5) * 0.01D);
         }

         if(Float.compare(this.p.nextFloat(), var19) < 0) {
            float var20 = net.u.t.M(this.p, 0.0F, 360.0F) * 0.017453292F;
            float var21 = net.u.t.M(this.p, 25.0F, 60.0F);
            double var22 = this.b + (double)(net.u.t.A(var20) * var21 * 0.1F);
            double var23 = (double)((float)net.u.t.L(this.i().u) + 1.0F);
            double var24 = this.hr + (double)(net.u.t.m(var20) * var21 * 0.1F);
            net.y9.l var25 = var3.Z(new net.u.j((int)var22, (int)var23 - 1, (int)var24)).Q();
            if(var25 == net.nb.f.uM || var25 == net.nb.f.dy) {
               var3.q(ai.WATER_SPLASH, var22, var23, var24, 2 + this.p.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D, new int[0]);
            }
         }

         if(this.h5 <= 0) {
            this.hD = net.u.t.M(this.p, 0.0F, 360.0F);
            this.ht = net.u.t.A(this.p, 20, 80);
         }
      }

      this.h5 = net.u.t.A(this.p, 100, 600);
      this.h5 -= this.hk * 20 * 5;
   }

   protected boolean c(net.ne.l var1) {
      return var1.w() || var1 instanceof i;
   }

   public void I(net.nj.f var1) {
   }

   public void o(net.nj.f var1) {
   }

   public int V() {
      if(!this.hl.x && this.h1 != null) {
         int var1 = 0;
         if(this.hb != null) {
            this.b();
            this.hl.k(this, (byte)31);
            var1 = this.hb instanceof i?3:5;
         } else if(this.hQ > 0) {
            net.y7.r var2 = new net.y7.r((d)this.hl);
            var2.v((float)this.hc + this.h1.u());

            for(ks var4 : this.hl.o().k(net.y7.p.w).g(this.p, var2.w())) {
               i var5 = new i(this.hl, this.b, this.hS, this.hr, var4);
               double var6 = this.h1.b - this.b;
               double var8 = this.h1.hS - this.hS;
               double var10 = this.h1.hr - this.hr;
               double var12 = (double)net.u.t.R(var6 * var6 + var8 * var8 + var10 * var10);
               double var10000 = 0.1D;
               var5.hf = var6 * 0.1D;
               var5.K = var8 * 0.1D + (double)net.u.t.R(var12) * 0.08D;
               var5.J = var10 * 0.1D;
               this.hl.S(var5);
               this.h1.hl.S(new net.nm.s(this.h1.hl, this.h1.b, this.h1.hS + 0.5D, this.h1.hr + 0.5D, this.p.nextInt(6) + 1));
               net.n0.y var16 = var4.Z();
               if(var16 == net.nb.j.YB || var16 == net.nb.j.YY) {
                  this.h1.m(net.v.q.j, 1);
               }
            }

            var1 = 1;
         }

         if(this.hm) {
            var1 = 2;
         }

         this.B();
         return var1;
      } else {
         return 0;
      }
   }

   public void R(byte var1) {
      if(var1 == 31 && this.hl.x && this.hb instanceof r && ((r)this.hb).VV()) {
         this.b();
      }

      super.R(var1);
   }

   protected void b() {
      if(this.h1 != null) {
         double var1 = this.h1.b - this.b;
         double var3 = this.h1.hS - this.hS;
         double var5 = this.h1.hr - this.hr;
         double var10000 = 0.1D;
         this.hb.hf += var1 * 0.1D;
         this.hb.K += var3 * 0.1D;
         this.hb.J += var5 * 0.1D;
      }

   }

   protected boolean k() {
      return false;
   }

   public void B() {
      super.B();
      if(this.h1 != null) {
         this.h1.aS = null;
      }

   }

   public r k() {
      return this.h1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static enum u {
      FLYING,
      HOOKED_IN_ENTITY,
      BOBBING;
   }
}
