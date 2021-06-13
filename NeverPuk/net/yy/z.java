package net.yy;

import com.mojang.authlib.GameProfile;
import net.xn;
import net.nn.j;
import net.u.d;
import net.u.t;
import net.y9.l;
import net.yv.r;
import net.yy.f;

public class z extends f {
   private int Kl;
   private double K3;
   private double Kc;
   private double Kw;
   private double Kx;
   private double KA;

   public z(r var1, GameProfile var2) {
      super(var1, var2);
      this.ha = 1.0F;
      this.r = true;
      this.ax = 0.25F;
   }

   public boolean p(double var1) {
      double var3 = this.i().O() * 10.0D;
      if(Double.isNaN(var3)) {
         var3 = 1.0D;
      }

      var3 = var3 * 64.0D * v();
      return var1 < var3 * var3;
   }

   public boolean H(net.yz.z var1, float var2) {
      return true;
   }

   public void j(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.K3 = var1;
      this.Kc = var3;
      this.Kw = var5;
      this.Kx = (double)var7;
      this.KA = (double)var8;
      this.Kl = var9;
   }

   public void A() {
      this.ax = 0.0F;
      super.A();
      this.AS = this.Aq;
      double var1 = this.b - this.h;
      double var3 = this.hr - this.l;
      float var5 = t.R(var1 * var1 + var3 * var3) * 4.0F;
      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.Aq += (var5 - this.Aq) * 0.4F;
      this.A5 += this.Aq;
   }

   public void d() {
      boolean var1 = l.S();
      if(this.Kl > 0) {
         double var2 = this.b + (this.K3 - this.b) / (double)this.Kl;
         double var4 = this.hS + (this.Kc - this.hS) / (double)this.Kl;
         double var6 = this.hr + (this.Kw - this.hr) / (double)this.Kl;
         double var8 = this.Kx - (double)this.hN;
         if(var8 < -180.0D) {
            var8 += 360.0D;
         }

         if(var8 >= 180.0D) {
            var8 -= 360.0D;
         }

         this.hN = (float)((double)this.hN + var8 / (double)this.Kl);
         this.V = (float)((double)this.V + (this.KA - (double)this.V) / (double)this.Kl);
         --this.Kl;
         this.t(var2, var4, var6);
         this.r(this.hN, this.V);
      }

      this.aj = this.af;
      this.V();
      float var10 = t.R(this.hf * this.hf + this.J * this.J);
      float var3 = (float)Math.atan(-this.K * 0.20000000298023224D) * 15.0F;
      if(Float.compare(var10, 0.1F) > 0) {
         var10 = 0.1F;
      }

      if(!this.k || this.h() <= 0.0F) {
         var10 = 0.0F;
      }

      if(this.k || this.h() <= 0.0F) {
         var3 = 0.0F;
      }

      this.af += (var10 - this.af) * 0.4F;
      this.Ab += (var3 - this.Ab) * 0.8F;
      this.hl.M.K("push");
      this.z();
      this.hl.M.N();
      if(d.y() == null) {
         l.g(false);
      }

   }

   public void r(net.cb.t var1) {
      j.b().y.I().G(var1);
   }

   public boolean n(int var1, String var2) {
      return false;
   }

   public net.u.j z() {
      return new net.u.j(this.b + 0.5D, this.hS + 0.5D, this.hr + 0.5D);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
