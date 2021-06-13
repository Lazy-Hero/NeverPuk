package net.a;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.b.c;
import net.b.l;
import net.k.n;
import net.k.v;
import net.ne.a;
import net.ne.d;
import net.ne.e;
import net.ne.f;
import net.ne.i;
import net.ne.y;
import net.nk.fc;
import net.nm.j;
import net.nm.s;
import net.nw.x;
import net.yv.k;
import net.yv.r;
import net.yz.ai;
import net.yz.m_;
import net.yz.p;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t extends y implements e, fc {
   private static final Logger k6 = LogManager.getLogger();
   public static final v kf = n.q(t.class, net.k.y.d);
   public double[][] kh = new double[64][3];
   public int kZ = -1;
   public i[] k7;
   public i kG = new i(this, "head", 6.0F, 6.0F);
   public i kp = new i(this, "neck", 6.0F, 6.0F);
   public i kU = new i(this, "body", 8.0F, 8.0F);
   public i kM = new i(this, "tail", 4.0F, 4.0F);
   public i kQ = new i(this, "tail", 4.0F, 4.0F);
   public i ke = new i(this, "tail", 4.0F, 4.0F);
   public i kc = new i(this, "wing", 4.0F, 4.0F);
   public i kR = new i(this, "wing", 4.0F, 4.0F);
   public float k8;
   public float ks;
   public boolean kx;
   public int k9;
   public j k5;
   private final net.yd.y kK;
   private final net.nw.i ka;
   private int kF = 200;
   private int kW;
   private final c[] kB = new c[24];
   private final int[] kw = new int[24];
   private final l kO = new l();

   public t(r var1) {
      super(var1);
      this.k7 = new i[]{this.kG, this.kp, this.kU, this.kM, this.kQ, this.ke, this.kc, this.kR};
      this.u(this.w());
      this.S(16.0F, 8.0F);
      this.r = true;
      this.hw = true;
      this.kF = 100;
      this.hz = true;
      if(!var1.x && var1.F instanceof k) {
         this.kK = ((k)var1.F).C();
      } else {
         this.kK = null;
      }

      this.ka = new net.nw.i(this);
   }

   protected void W() {
      super.W();
      this.t(d.C).t(200.0D);
   }

   protected void g() {
      super.g();
      this.A().r(kf, Integer.valueOf(net.nw.v.E.a()));
   }

   public double[] O(int var1, float var2) {
      if(this.h() <= 0.0F) {
         var2 = 0.0F;
      }

      var2 = 1.0F - var2;
      int var3 = this.kZ - var1 & 63;
      int var4 = this.kZ - var1 - 1 & 63;
      double[] var5 = new double[3];
      double var6 = this.kh[var3][0];
      double var8 = net.u.t.p(this.kh[var4][0] - var6);
      var5[0] = var6 + var8 * (double)var2;
      var6 = this.kh[var3][1];
      var8 = this.kh[var4][1] - var6;
      var5[1] = var6 + var8 * (double)var2;
      var5[2] = this.kh[var3][2] + (this.kh[var4][2] - this.kh[var3][2]) * (double)var2;
      return var5;
   }

   public void d() {
      boolean var1 = net.r.r.D();
      if(this.hl.x) {
         this.u(this.h());
         if(!this.c()) {
            float var2 = net.u.t.m(this.ks * 6.2831855F);
            float var3 = net.u.t.m(this.k8 * 6.2831855F);
            if(Float.compare(var3, -0.3F) <= 0 && Float.compare(var2, -0.3F) >= 0) {
               this.hl.m(this.b, this.hS, this.hr, net.nb.l.PG, this.E(), 5.0F, 0.8F + this.p.nextFloat() * 0.3F, false);
            }

            if(!this.ka.V().C() && --this.kF < 0) {
               this.hl.m(this.b, this.hS, this.hr, net.nb.l.oA, this.E(), 2.5F, 0.8F + this.p.nextFloat() * 0.3F, false);
               this.kF = 200 + this.p.nextInt(200);
            }
         }
      }

      this.k8 = this.ks;
      if(this.h() <= 0.0F) {
         float var23 = (this.p.nextFloat() - 0.5F) * 8.0F;
         float var26 = (this.p.nextFloat() - 0.5F) * 4.0F;
         float var4 = (this.p.nextFloat() - 0.5F) * 8.0F;
         this.hl.n(ai.EXPLOSION_LARGE, this.b + (double)var23, this.hS + 2.0D + (double)var26, this.hr + (double)var4, 0.0D, 0.0D, 0.0D, new int[0]);
         net.u.d.h(new net.u.d[3]);
      }

      this.H();
      float var24 = 0.2F / (net.u.t.R(this.hf * this.hf + this.J * this.J) * 10.0F + 1.0F);
      var24 = var24 * (float)Math.pow(2.0D, this.K);
      if(this.ka.V().C()) {
         this.ks += 0.1F;
      }

      if(this.kx) {
         this.ks += var24 * 0.5F;
      }

      this.ks += var24;
      this.hN = net.u.t.k(this.hN);
      if(this.lJ()) {
         this.ks = 0.5F;
      }

      if(this.kZ < 0) {
         int var27 = 0;
         if(var27 < this.kh.length) {
            this.kh[var27][0] = (double)this.hN;
            this.kh[var27][1] = this.hS;
            ++var27;
         }
      }

      if(++this.kZ == this.kh.length) {
         this.kZ = 0;
      }

      this.kh[this.kZ][0] = (double)this.hN;
      this.kh[this.kZ][1] = this.hS;
      if(this.hl.x) {
         if(this.A9 > 0) {
            double var29 = this.b + (this.Ag - this.b) / (double)this.A9;
            double var5 = this.hS + (this.AW - this.hS) / (double)this.A9;
            double var7 = this.hr + (this.Ah - this.hr) / (double)this.A9;
            double var9 = net.u.t.p(this.Ak - (double)this.hN);
            this.hN = (float)((double)this.hN + var9 / (double)this.A9);
            this.V = (float)((double)this.V + (this.As - (double)this.V) / (double)this.A9);
            --this.A9;
            this.t(var29, var5, var7);
            this.r(this.hN, this.V);
         }

         this.ka.V().H();
      }

      x var30 = this.ka.V();
      var30.J();
      if(this.ka.V() != var30) {
         var30 = this.ka.V();
         var30.J();
      }

      net.u.r var32 = var30.Y();
      double var36 = var32.p - this.b;
      double var38 = var32.H - this.hS;
      double var41 = var32.a - this.hr;
      double var11 = var36 * var36 + var38 * var38 + var41 * var41;
      float var13 = var30.H();
      var38 = net.u.t.F(var38 / (double)net.u.t.R(var36 * var36 + var41 * var41), (double)(-var13), (double)var13);
      this.K += var38 * 0.10000000149011612D;
      this.hN = net.u.t.k(this.hN);
      double var14 = net.u.t.F(net.u.t.p(180.0D - net.u.t.V(var36, var41) * 57.29577951308232D - (double)this.hN), -50.0D, 50.0D);
      net.u.r var16 = (new net.u.r(var32.p - this.b, var32.H - this.hS, var32.a - this.hr)).I();
      net.u.r var17 = (new net.u.r((double)net.u.t.A(this.hN * 0.017453292F), this.K, (double)(-net.u.t.m(this.hN * 0.017453292F)))).I();
      float var18 = Math.max(((float)var17.d(var16) + 0.5F) / 1.5F, 0.0F);
      this.Ad *= 0.8F;
      this.Ad = (float)((double)this.Ad + var14 * (double)var30.l());
      this.hN += this.Ad * 0.1F;
      float var19 = (float)(2.0D / (var11 + 1.0D));
      float var10000 = 0.06F;
      this.h(0.0F, 0.0F, -1.0F, 0.06F * (var18 * var19 + (1.0F - var19)));
      if(this.kx) {
         this.N(f.SELF, this.hf * 0.800000011920929D, this.K * 0.800000011920929D, this.J * 0.800000011920929D);
      }

      this.N(f.SELF, this.hf, this.K, this.J);
      net.u.r var21 = (new net.u.r(this.hf, this.K, this.J)).I();
      float var22 = ((float)var21.d(var17) + 1.0F) / 2.0F;
      var22 = 0.8F + 0.15F * var22;
      this.hf *= (double)var22;
      this.J *= (double)var22;
      this.K *= 0.9100000262260437D;
      this.AK = this.hN;
      this.kG.h9 = 1.0F;
      this.kG.m = 1.0F;
      this.kp.h9 = 3.0F;
      this.kp.m = 3.0F;
      this.kM.h9 = 2.0F;
      this.kM.m = 2.0F;
      this.kQ.h9 = 2.0F;
      this.kQ.m = 2.0F;
      this.ke.h9 = 2.0F;
      this.ke.m = 2.0F;
      this.kU.m = 3.0F;
      this.kU.h9 = 5.0F;
      this.kc.m = 2.0F;
      this.kc.h9 = 4.0F;
      this.kR.m = 3.0F;
      this.kR.h9 = 4.0F;
      net.u.r[] var31 = new net.u.r[this.k7.length];
      int var33 = 0;
      if(var33 < this.k7.length) {
         var31[var33] = new net.u.r(this.k7[var33].b, this.k7[var33].hS, this.k7[var33].hr);
         ++var33;
      }

      float var35 = (float)(this.O(5, 1.0F)[1] - this.O(10, 1.0F)[1]) * 10.0F * 0.017453292F;
      float var37 = net.u.t.m(var35);
      float var6 = net.u.t.A(var35);
      float var40 = this.hN * 0.017453292F;
      float var8 = net.u.t.A(var40);
      float var42 = net.u.t.m(var40);
      this.kU.A();
      this.kU.S(this.b + (double)(var8 * 0.5F), this.hS, this.hr - (double)(var42 * 0.5F), 0.0F, 0.0F);
      this.kc.A();
      this.kc.S(this.b + (double)(var42 * 4.5F), this.hS + 2.0D, this.hr + (double)(var8 * 4.5F), 0.0F, 0.0F);
      this.kR.A();
      this.kR.S(this.b - (double)(var42 * 4.5F), this.hS + 2.0D, this.hr - (double)(var8 * 4.5F), 0.0F, 0.0F);
      if(!this.hl.x && this.Xl == 0) {
         this.D(this.hl.u(this, this.kc.i().f(4.0D, 2.0D, 4.0D).w(0.0D, -2.0D, 0.0D)));
         this.D(this.hl.u(this, this.kR.i().f(4.0D, 2.0D, 4.0D).w(0.0D, -2.0D, 0.0D)));
         this.X(this.hl.u(this, this.kG.i().x(1.0D)));
         this.X(this.hl.u(this, this.kp.i().x(1.0D)));
      }

      double[] var10 = this.O(5, 1.0F);
      float var43 = net.u.t.A(this.hN * 0.017453292F - this.Ad * 0.01F);
      float var12 = net.u.t.m(this.hN * 0.017453292F - this.Ad * 0.01F);
      this.kG.A();
      this.kp.A();
      var13 = this.J(1.0F);
      this.kG.S(this.b + (double)(var43 * 6.5F * var37), this.hS + (double)var13 + (double)(var6 * 6.5F), this.hr - (double)(var12 * 6.5F * var37), 0.0F, 0.0F);
      this.kp.S(this.b + (double)(var43 * 5.5F * var37), this.hS + (double)var13 + (double)(var6 * 5.5F), this.hr - (double)(var12 * 5.5F * var37), 0.0F, 0.0F);
      int var45 = 0;
      i var15 = null;
      var15 = this.kM;
      double[] var50 = this.O(12 + var45 * 2, 1.0F);
      float var51 = this.hN * 0.017453292F + this.I(var50[0] - var10[0]) * 0.017453292F;
      var18 = net.u.t.A(var51);
      var19 = net.u.t.m(var51);
      var10000 = 1.5F;
      float var54 = (float)(var45 + 1) * 2.0F;
      var15.A();
      var15.S(this.b - (double)((var8 * 1.5F + var18 * var54) * var37), this.hS + (var50[1] - var10[1]) - (double)((var54 + 1.5F) * var6) + 1.5D, this.hr + (double)((var42 * 1.5F + var19 * var54) * var37), 0.0F, 0.0F);
      ++var45;
      if(!this.hl.x) {
         this.kx = this.O(this.kG.i()) | this.O(this.kp.i()) | this.O(this.kU.i());
         if(this.kK != null) {
            this.kK.j(this);
         }
      }

      var45 = 0;
      if(var45 < this.k7.length) {
         this.k7[var45].h = var31[var45].p;
         this.k7[var45].h6 = var31[var45].H;
         this.k7[var45].l = var31[var45].a;
         ++var45;
      }

   }

   private float J(float var1) {
      double var2;
      if(this.ka.V().C()) {
         var2 = -1.0D;
      } else {
         double[] var4 = this.O(5, 1.0F);
         double[] var5 = this.O(0, 1.0F);
         var2 = var4[1] - var5[1];
      }

      return (float)var2;
   }

   private void H() {
      if(this.k5 != null) {
         if(this.k5.Z) {
            this.k5 = null;
         } else if(this.x % 10 == 0 && this.h() < this.w()) {
            this.u(this.h() + 1.0F);
         }
      }

      if(this.p.nextInt(10) == 0) {
         List var1 = this.hl.p(j.class, this.i().x(32.0D));
         j var2 = null;
         double var3 = Double.MAX_VALUE;

         for(j var6 : var1) {
            double var7 = var6.F(this);
            if(var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }

         this.k5 = var2;
      }

   }

   private void D(List var1) {
      double var2 = (this.kU.i().n + this.kU.i().d) / 2.0D;
      double var4 = (this.kU.i().N + this.kU.i().r) / 2.0D;

      for(net.ne.l var7 : var1) {
         if(var7 instanceof a) {
            double var8 = var7.b - var2;
            double var10 = var7.hr - var4;
            double var12 = var8 * var8 + var10 * var10;
            var7.u(var8 / var12 * 4.0D, 0.20000000298023224D, var10 / var12 * 4.0D);
            if(!this.ka.V().C() && ((a)var7).h() < var7.x - 2) {
               var7.H(net.yz.z.O(this), 5.0F);
               this.q(this, var7);
            }
         }
      }

   }

   private void X(List var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         net.ne.l var3 = (net.ne.l)var1.get(var2);
         if(var3 instanceof a) {
            var3.H(net.yz.z.O(this), 10.0F);
            this.q(this, var3);
         }
      }

   }

   private float I(double var1) {
      return (float)net.u.t.p(var1);
   }

   private boolean O(net.u.e var1) {
      int var2 = net.u.t.L(var1.n);
      int var3 = net.u.t.L(var1.u);
      int var4 = net.u.t.L(var1.N);
      int var5 = net.u.t.L(var1.d);
      int var6 = net.u.t.L(var1.c);
      int var7 = net.u.t.L(var1.r);
      boolean var8 = false;
      boolean var9 = false;

      for(int var10 = var2; var10 <= var5; ++var10) {
         for(int var11 = var3; var11 <= var6; ++var11) {
            for(int var12 = var4; var12 <= var7; ++var12) {
               net.u.j var13 = new net.u.j(var10, var11, var12);
               net.yw.n var14 = this.hl.Z(var13);
               net.y9.l var15 = var14.Q();
               if(var14.n() != net.y1.l.q && var14.n() != net.y1.l.X) {
                  if(!this.hl.N().b("mobGriefing")) {
                     var8 = true;
                  } else if(var15 != net.nb.f.dr && var15 != net.nb.f.c && var15 != net.nb.f.Tz && var15 != net.nb.f.T8 && var15 != net.nb.f.TG && var15 != net.nb.f.dE) {
                     if(var15 != net.nb.f.i && var15 != net.nb.f.M && var15 != net.nb.f.Tc && var15 != net.nb.f.d8 && var15 != net.nb.f.dU) {
                        if(!this.hl.J(var13)) {
                           ;
                        }

                        var9 = true;
                     } else {
                        var8 = true;
                     }
                  } else {
                     var8 = true;
                  }
               }
            }
         }
      }

      double var17 = var1.n + (var1.d - var1.n) * (double)this.p.nextFloat();
      double var18 = var1.u + (var1.c - var1.u) * (double)this.p.nextFloat();
      double var19 = var1.N + (var1.r - var1.N) * (double)this.p.nextFloat();
      this.hl.n(ai.EXPLOSION_LARGE, var17, var18, var19, 0.0D, 0.0D, 0.0D, new int[0]);
      return var8;
   }

   public boolean j(i var1, net.yz.z var2, float var3) {
      var3 = this.ka.V().e(var1, var2, var3);
      if(var1 != this.kG) {
         var3 = var3 / 4.0F + Math.min(var3, 1.0F);
      }

      if(var3 < 0.01F) {
         return false;
      } else {
         if(var2.v() instanceof net.r.r || var2.e()) {
            float var4 = this.h();
            this.s(var2, var3);
            if(this.h() <= 0.0F && !this.ka.V().C()) {
               this.u(1.0F);
               this.ka.D(net.nw.v.Q);
            }

            if(this.ka.V().C()) {
               this.kW = (int)((float)this.kW + (var4 - this.h()));
               if((float)this.kW > 0.25F * this.w()) {
                  this.kW = 0;
                  this.ka.D(net.nw.v.V);
               }
            }
         }

         return true;
      }
   }

   public boolean H(net.yz.z var1, float var2) {
      if(var1 instanceof net.yz.v && ((net.yz.v)var1).c()) {
         this.j(this.kU, var1, var2);
      }

      return false;
   }

   protected boolean s(net.yz.z var1, float var2) {
      return super.H(var1, var2);
   }

   public void L() {
      this.B();
      if(this.kK != null) {
         this.kK.j(this);
         this.kK.k(this);
      }

   }

   protected void u() {
      if(this.kK != null) {
         this.kK.j(this);
      }

      ++this.k9;
      if(this.k9 >= 180 && this.k9 <= 200) {
         float var1 = (this.p.nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.p.nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.p.nextFloat() - 0.5F) * 8.0F;
         this.hl.n(ai.EXPLOSION_HUGE, this.b + (double)var1, this.hS + 2.0D + (double)var2, this.hr + (double)var3, 0.0D, 0.0D, 0.0D, new int[0]);
      }

      boolean var4 = this.hl.N().b("doMobLoot");
      short var5 = 500;
      if(this.kK != null && !this.kK.O()) {
         var5 = 12000;
      }

      if(!this.hl.x) {
         if(this.k9 > 150 && this.k9 % 5 == 0) {
            this.F(net.u.t.M((float)var5 * 0.08F));
         }

         if(this.k9 == 1) {
            this.hl.A(1028, new net.u.j(this), 0);
         }
      }

      this.N(f.SELF, 0.0D, 0.10000000149011612D, 0.0D);
      this.hN += 20.0F;
      this.AK = this.hN;
      if(this.k9 == 200 && !this.hl.x) {
         this.F(net.u.t.M((float)var5 * 0.2F));
         if(this.kK != null) {
            this.kK.k(this);
         }

         this.B();
      }

   }

   private void F(int var1) {
      while(true) {
         int var2 = s.Z(var1);
         var1 -= var2;
         this.hl.S(new s(this.hl, this.b, this.hS, this.hr, var2));
      }
   }

   public int e() {
      if(this.kB[0] == null) {
         int var1 = 0;

         while(true) {
            byte var2 = 5;
            int var3 = (int)(60.0F * net.u.t.m(2.0F * (-3.1415927F + 0.2617994F * (float)var1)));
            int var4 = (int)(60.0F * net.u.t.A(2.0F * (-3.1415927F + 0.2617994F * (float)var1)));
            int var5 = Math.max(this.hl.k() + 10, this.hl.D(new net.u.j(var3, 0, var4)).h() + var2);
            this.kB[var1] = new c(var3, var5, var4);
            ++var1;
         }
      }

      return this.W(this.b, this.hS, this.hr);
   }

   public int W(double var1, double var3, double var5) {
      float var7 = 10000.0F;
      boolean var10000 = false;
      c var9 = new c(net.u.t.L(var1), net.u.t.L(var3), net.u.t.L(var5));
      byte var10 = 0;
      if(this.kK == null || this.kK.w() == 0) {
         var10 = 12;
      }

      int var11 = var10;

      while(true) {
         if(this.kB[var11] != null) {
            float var12 = this.kB[var11].Q(var9);
            if(var12 < var7) {
               var7 = var12;
            }
         }

         ++var11;
      }
   }

   @Nullable
   public net.b.t v(int var1, int var2, @Nullable c var3) {
      int var4 = 0;

      while(true) {
         c var5 = this.kB[var4];
         var5.e = false;
         var5.Y = 0.0F;
         var5.z = 0.0F;
         var5.x = 0.0F;
         var5.c = null;
         var5.K = -1;
         ++var4;
      }
   }

   private net.b.t B(c var1, c var2) {
      int var3 = 1;

      for(c var4 = var2; var4.c != null; var4 = var4.c) {
         ++var3;
      }

      c[] var7 = new c[var3];
      c var5 = var2;
      --var3;

      for(var7[var3] = var2; var5.c != null; var7[var3] = var5) {
         var5 = var5.c;
         --var3;
      }

      return new net.b.t(var7);
   }

   public static void j(net.c0.d var0) {
      y.J(var0, t.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.r("DragonPhase", this.ka.V().x().a());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      if(var1.G("DragonPhase")) {
         this.ka.D(net.nw.v.V(var1.P("DragonPhase")));
      }

   }

   protected void b() {
   }

   public net.ne.l[] T() {
      return this.k7;
   }

   public boolean w() {
      return false;
   }

   public r o() {
      return this.hl;
   }

   public p E() {
      return p.HOSTILE;
   }

   protected net.yz.a T() {
      return net.nb.l.Cj;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.Hz;
   }

   protected float G() {
      return 5.0F;
   }

   @Nullable
   protected m_ N() {
      return net.y7.p.pC;
   }

   public float P(int var1, double[] var2, double[] var3) {
      x var4 = this.ka.V();
      net.nw.v var5 = var4.x();
      double var6;
      if(var5 != net.nw.v.W && var5 != net.nw.v.V) {
         if(var4.C()) {
            var6 = (double)var1;
         } else if(var1 == 6) {
            var6 = 0.0D;
         } else {
            var6 = var3[1] - var2[1];
         }
      } else {
         net.u.j var8 = this.hl.D(net.w.e.z);
         float var9 = Math.max(net.u.t.R(this.H(var8)) / 4.0F, 1.0F);
         var6 = (double)((float)var1 / var9);
      }

      return (float)var6;
   }

   public net.u.r c(float var1) {
      x var2 = this.ka.V();
      net.nw.v var3 = var2.x();
      net.u.r var4;
      if(var3 != net.nw.v.W && var3 != net.nw.v.V) {
         if(var2.C()) {
            float var10 = this.V;
            float var11 = 1.5F;
            this.V = -45.0F;
            var4 = this.r(var1);
            this.V = var10;
         } else {
            var4 = this.r(var1);
         }
      } else {
         net.u.j var5 = this.hl.D(net.w.e.z);
         float var6 = Math.max(net.u.t.R(this.H(var5)) / 4.0F, 1.0F);
         float var7 = 6.0F / var6;
         float var8 = this.V;
         float var10000 = 1.5F;
         this.V = -var7 * 1.5F * 5.0F;
         var4 = this.r(var1);
         this.V = var8;
      }

      return var4;
   }

   public void B(j var1, net.u.j var2, net.yz.z var3) {
      net.r.r var4;
      if(var3.v() instanceof net.r.r) {
         var4 = (net.r.r)var3.v();
      } else {
         var4 = this.hl.o(var2, 64.0D, 64.0D);
      }

      if(var1 == this.k5) {
         this.j(this.kG, net.yz.z.J(var4), 10.0F);
      }

      this.ka.V().g(var1, var2, var3, var4);
   }

   public void O(v var1) {
      if(kf.equals(var1) && this.hl.x) {
         this.ka.D(net.nw.v.V(((Integer)this.A().a(kf)).intValue()));
      }

      super.O(var1);
   }

   public net.nw.i c() {
      return this.ka;
   }

   @Nullable
   public net.yd.y k() {
      return this.kK;
   }

   public void o(net.n_.i var1) {
   }

   protected boolean P(net.ne.l var1) {
      return false;
   }

   public boolean S() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
