package net.n1;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.c0.d;
import net.n1.o;
import net.ne.bl;
import net.u.e;
import net.yv.r;
import net.yz.ai;
import net.yz.m_;

public abstract class p extends net.ne.l implements bl {
   private int K4;
   private int Kl;
   private int Kp;
   private net.y9.l Kb;
   protected boolean K7;
   public int Kw;
   protected net.ne.a KG;
   private String KX;
   private int KF;
   private int KL;
   public net.ne.l KO;
   private int Ke;

   public p(r var1) {
      super(var1);
      this.K4 = -1;
      this.Kl = -1;
      this.Kp = -1;
      this.S(0.25F, 0.25F);
   }

   public p(r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
   }

   public p(r var1, net.ne.a var2) {
      this(var1, var2.b, var2.hS + (double)var2.A() - 0.10000000149011612D, var2.hr);
      this.KG = var2;
   }

   protected void g() {
   }

   public boolean p(double var1) {
      double var3 = this.i().O() * 4.0D;
      if(Double.isNaN(var3)) {
         var3 = 4.0D;
      }

      var3 = var3 * 64.0D;
      return var1 < var3 * var3;
   }

   public void X(net.ne.l var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = -net.u.t.A(var3 * 0.017453292F) * net.u.t.m(var2 * 0.017453292F);
      float var8 = -net.u.t.A((var2 + var4) * 0.017453292F);
      float var9 = net.u.t.m(var3 * 0.017453292F) * net.u.t.m(var2 * 0.017453292F);
      this.w((double)var7, (double)var8, (double)var9, var5, var6);
      this.hf += var1.hf;
      this.J += var1.J;
      if(!var1.k) {
         this.K += var1.K;
      }

   }

   public void w(double var1, double var3, double var5, float var7, float var8) {
      float var9 = net.u.t.R(var1 * var1 + var3 * var3 + var5 * var5);
      var1 = var1 / (double)var9;
      var3 = var3 / (double)var9;
      var5 = var5 / (double)var9;
      var1 = var1 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 = var3 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 = var5 + this.p.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 = var1 * (double)var7;
      var3 = var3 * (double)var7;
      var5 = var5 * (double)var7;
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      float var10 = net.u.t.R(var1 * var1 + var5 * var5);
      this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(var3, (double)var10) * 57.29577951308232D);
      this.hq = this.hN;
      this.d = this.V;
      this.KF = 0;
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
      o.s.H();
      this.hL = this.b;
      this.F = this.hS;
      this.A = this.hr;
      super.A();
      if(this.Kw > 0) {
         --this.Kw;
      }

      if(this.K7) {
         if(this.hl.Z(new net.u.j(this.K4, this.Kl, this.Kp)).Q() == this.Kb) {
            ++this.KF;
            if(this.KF == 1200) {
               this.B();
            }

            return;
         }

         this.K7 = false;
         this.hf *= (double)(this.p.nextFloat() * 0.2F);
         this.K *= (double)(this.p.nextFloat() * 0.2F);
         this.J *= (double)(this.p.nextFloat() * 0.2F);
         this.KF = 0;
         this.KL = 0;
      }

      ++this.KL;
      net.u.r var2 = new net.u.r(this.b, this.hS, this.hr);
      net.u.r var3 = new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      net.u.m var4 = this.hl.d(var2, var3);
      var2 = new net.u.r(this.b, this.hS, this.hr);
      new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      var3 = new net.u.r(var4.z.p, var4.z.H, var4.z.a);
      net.ne.l var5 = null;
      List var6 = this.hl.u(this, this.i().T(this.hf, this.K, this.J).x(1.0D));
      double var7 = 0.0D;
      boolean var9 = false;
      int var10 = 0;
      if(var10 < var6.size()) {
         net.ne.l var11 = (net.ne.l)var6.get(var10);
         if(var11.w()) {
            if(var11 == this.KO) {
               var9 = true;
            }

            if(this.KG != null && this.x < 2 && this.KO == null) {
               this.KO = var11;
               var9 = true;
            }

            var9 = false;
            e var12 = var11.i().x(0.30000001192092896D);
            net.u.m var13 = var12.G(var2, var3);
            double var14 = var2.Y(var13.z);
            if(var14 >= var7) {
               double var29;
               int var10000 = (var29 = var7 - 0.0D) == 0.0D?0:(var29 < 0.0D?-1:1);
            }

            var5 = var11;
         }

         ++var10;
      }

      if(this.KO != null && this.Ke-- <= 0) {
         this.KO = null;
      }

      if(var5 != null) {
         var4 = new net.u.m(var5);
      }

      if(var4 != null) {
         if(var4.v == net.u.m.BLOCK && this.hl.Z(var4.j()).Q() == net.nb.f.uJ) {
            this.k(var4.j());
         }

         this.I(var4);
      }

      this.b += this.hf;
      this.hS += this.K;
      this.hr += this.J;
      float var22 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var22) * 57.29577951308232D);
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
      float var23 = 0.99F;
      float var24 = this.v();
      if(this.p()) {
         int var25 = 0;
         float var27 = 0.25F;
         this.hl.n(ai.WATER_BUBBLE, this.b - this.hf * 0.25D, this.hS - this.K * 0.25D, this.hr - this.J * 0.25D, this.hf, this.K, this.J, new int[0]);
         ++var25;
         var23 = 0.8F;
      }

      this.hf *= (double)var23;
      this.K *= (double)var23;
      this.J *= (double)var23;
      if(!this.j()) {
         this.K -= (double)var24;
      }

      this.t(this.b, this.hS, this.hr);
   }

   protected float v() {
      return 0.03F;
   }

   protected abstract void I(net.u.m var1);

   public static void O(d var0, String var1) {
   }

   public void I(net.nj.f var1) {
      var1.r("xTile", this.K4);
      var1.r("yTile", this.Kl);
      var1.r("zTile", this.Kp);
      m_ var2 = (m_)net.y9.l.m.t(this.Kb);
      var1.b("inTile", "");
      var1.D("shake", (byte)this.Kw);
      var1.D("inGround", (byte)(this.K7?1:0));
      if((this.KX == null || this.KX.isEmpty()) && this.KG instanceof net.r.r) {
         this.KX = this.KG.Q();
      }

      var1.b("ownerName", this.KX == null?"":this.KX);
   }

   public void o(net.nj.f var1) {
      this.K4 = var1.P("xTile");
      this.Kl = var1.P("yTile");
      this.Kp = var1.P("zTile");
      if(var1.K("inTile", 8)) {
         this.Kb = net.y9.l.d(var1.J("inTile"));
      } else {
         this.Kb = net.y9.l.I(var1.R("inTile") & 255);
      }

      this.Kw = var1.R("shake") & 255;
      this.K7 = var1.R("inGround") == 1;
      this.KG = null;
      this.KX = var1.J("ownerName");
      if(this.KX != null && this.KX.isEmpty()) {
         this.KX = null;
      }

      this.KG = this.D();
   }

   @Nullable
   public net.ne.a D() {
      if(this.KG == null && this.KX != null && !this.KX.isEmpty()) {
         this.KG = this.hl.k(this.KX);
         if(this.KG == null && this.hl instanceof net.yv.d) {
            net.ne.l var1 = ((net.yv.d)this.hl).O(UUID.fromString(this.KX));
            if(var1 instanceof net.ne.a) {
               this.KG = (net.ne.a)var1;
            }
         }
      }

      return this.KG;
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
