package net.n1;

import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.n1.o;
import net.ne.bl;
import net.u.d;
import net.u.e;
import net.yv.r;
import net.yz.ai;

public class c extends net.ne.l implements bl {
   public net.yn.l BM;
   private net.nj.f B_;

   public c(r var1) {
      super(var1);
   }

   public c(r var1, net.yn.l var2) {
      super(var1);
      this.BM = var2;
      this.t(var2.b - (double)(var2.h9 + 1.0F) * 0.5D * (double)net.u.t.A(var2.AK * 0.017453292F), var2.hS + (double)var2.A() - 0.10000000149011612D, var2.hr + (double)(var2.h9 + 1.0F) * 0.5D * (double)net.u.t.m(var2.AK * 0.017453292F));
      this.S(0.25F, 0.25F);
   }

   public c(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.t(var2, var4, var6);
      int var14 = 0;

      while(true) {
         double var15 = 0.4D + 0.1D * (double)var14;
         var1.n(ai.SPIT, var2, var4, var6, var8 * var15, var10, var12 * var15, new int[0]);
         ++var14;
      }
   }

   public void A() {
      o.s.H();
      super.A();
      if(this.B_ != null) {
         this.w();
      }

      net.u.r var2 = new net.u.r(this.b, this.hS, this.hr);
      net.u.r var3 = new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      net.u.m var4 = this.hl.d(var2, var3);
      var2 = new net.u.r(this.b, this.hS, this.hr);
      new net.u.r(this.b + this.hf, this.hS + this.K, this.hr + this.J);
      var3 = new net.u.r(var4.z.p, var4.z.H, var4.z.a);
      net.ne.l var5 = this.a(var2, var3);
      var4 = new net.u.m(var5);
      this.e(var4);
      this.b += this.hf;
      this.hS += this.K;
      this.hr += this.J;
      float var6 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var6) * 57.29577951308232D);
      if(this.V - this.d < -180.0F) {
         this.d -= 360.0F;
         d.h(new d[5]);
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
      float var10000 = 0.99F;
      var10000 = 0.06F;
      if(!this.hl.I(this.i(), net.y1.l.q)) {
         this.B();
      }

      if(this.p()) {
         this.B();
      }

      this.hf *= 0.9900000095367432D;
      this.K *= 0.9900000095367432D;
      this.J *= 0.9900000095367432D;
      if(!this.j()) {
         this.K -= 0.05999999865889549D;
      }

      this.t(this.b, this.hS, this.hr);
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      if(this.d == 0.0F && this.hq == 0.0F) {
         float var7 = net.u.t.R(var1 * var1 + var5 * var5);
         this.V = (float)(net.u.t.V(var3, (double)var7) * 57.29577951308232D);
         this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
         this.d = this.V;
         this.hq = this.hN;
         this.S(this.b, this.hS, this.hr, this.hN, this.V);
      }

   }

   @Nullable
   private net.ne.l a(net.u.r var1, net.u.r var2) {
      net.ne.l var3 = null;
      List var4 = this.hl.u(this, this.i().T(this.hf, this.K, this.J).x(1.0D));
      double var5 = 0.0D;

      for(net.ne.l var8 : var4) {
         if(var8 != this.BM) {
            e var9 = var8.i().x(0.30000001192092896D);
            net.u.m var10 = var9.G(var1, var2);
            double var11 = var1.Y(var10.z);
            if(var11 >= var5) {
               double var13;
               int var10000 = (var13 = var5 - 0.0D) == 0.0D?0:(var13 < 0.0D?-1:1);
            }

            var3 = var8;
            var5 = var11;
         }
      }

      return var3;
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
   }

   public void e(net.u.m var1) {
      if(var1.e != null && this.BM != null) {
         var1.e.H(net.yz.z.o(this, this.BM).g(), 1.0F);
      }

      if(!this.hl.x) {
         this.B();
      }

   }

   protected void g() {
   }

   protected void o(net.nj.f var1) {
      if(var1.K("Owner", 10)) {
         this.B_ = var1.o("Owner");
      }

   }

   protected void I(net.nj.f var1) {
      if(this.BM != null) {
         net.nj.f var2 = new net.nj.f();
         UUID var3 = this.BM.O();
         var2.h("OwnerUUID", var3);
         var1.K("Owner", var2);
      }

   }

   private void w() {
      if(this.B_ != null && this.B_.H("OwnerUUID")) {
         UUID var1 = this.B_.R("OwnerUUID");

         for(net.yn.l var3 : this.hl.p(net.yn.l.class, this.i().x(15.0D))) {
            if(var3.O().equals(var1)) {
               this.BM = var3;
               break;
            }
         }
      }

      this.B_ = null;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
