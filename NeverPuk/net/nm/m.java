package net.nm;

import net.xn;
import net.n0.ks;
import net.n1.o;
import net.nm.w;
import net.y9.g3;
import net.yz.ai;

public class m extends w {
   private int iz = -1;

   public m(net.yv.r var1) {
      super(var1);
   }

   public m(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void w(net.c0.d var0) {
      w.L(var0, m.class);
   }

   public w.h R() {
      return w.h.TNT;
   }

   public net.yw.n M() {
      return net.nb.f.T7.p();
   }

   public void A() {
      w.h.s();
      super.A();
      if(this.iz > 0) {
         --this.iz;
         this.hl.n(ai.SMOKE_NORMAL, this.b, this.hS + 0.5D, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
      }

      if(this.iz == 0) {
         this.X(this.hf * this.hf + this.J * this.J);
      }

      if(this.t) {
         double var2 = this.hf * this.hf + this.J * this.J;
         if(var2 >= 0.009999999776482582D) {
            this.X(var2);
         }
      }

   }

   public boolean H(net.yz.z var1, float var2) {
      net.ne.l var3 = var1.g();
      if(var3 instanceof o) {
         o var4 = (o)var3;
         if(var4.a()) {
            this.X(var4.hf * var4.hf + var4.K * var4.K + var4.J * var4.J);
         }
      }

      return super.H(var1, var2);
   }

   public void n(net.yz.z var1) {
      double var2 = this.hf * this.hf + this.J * this.J;
      if(!var1.q() && !var1.e() && var2 < 0.009999999776482582D) {
         super.n(var1);
         if(!var1.e() && this.hl.N().b("doEntityDrops")) {
            this.O(new ks(net.nb.f.T7, 1), 0.0F);
         }
      } else if(this.iz < 0) {
         this.d();
         this.iz = this.p.nextInt(20) + this.p.nextInt(20);
      }

   }

   protected void X(double var1) {
      if(!this.hl.x) {
         double var3 = Math.sqrt(var1);
         if(var3 > 5.0D) {
            var3 = 5.0D;
         }

         this.hl.B(this, this.b, this.hS, this.hr, (float)(4.0D + this.p.nextDouble() * 1.5D * var3), true);
         this.B();
      }

   }

   public void v(float var1, float var2) {
      if(var1 >= 3.0F) {
         float var3 = var1 / 10.0F;
         this.X((double)(var3 * var3));
      }

      super.v(var1, var2);
   }

   public void K(int var1, int var2, int var3, boolean var4) {
      if(this.iz < 0) {
         this.d();
      }

   }

   public void R(byte var1) {
      if(var1 == 10) {
         this.d();
      } else {
         super.R(var1);
      }

   }

   public void d() {
      this.iz = 80;
      if(!this.hl.x) {
         this.hl.k(this, (byte)10);
         if(!this.c()) {
            this.hl.L((net.r.r)null, this.b, this.hS, this.hr, net.nb.l.H8, net.yz.p.BLOCKS, 1.0F, 1.0F);
         }
      }

   }

   public int W() {
      return this.iz;
   }

   public boolean F() {
      return this.iz > -1;
   }

   public float x(net.yv.u var1, net.yv.r var2, net.u.j var3, net.yw.n var4) {
      return this.F() && (g3.B(var4) || g3.g(var2, var3.h()))?0.0F:super.x(var1, var2, var3, var4);
   }

   public boolean Z(net.yv.u var1, net.yv.r var2, net.u.j var3, net.yw.n var4, float var5) {
      return (!this.F() || !g3.B(var4) && !g3.g(var2, var3.h())) && super.Z(var1, var2, var3, var4, var5);
   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      if(var1.K("TNTFuse", 99)) {
         this.iz = var1.P("TNTFuse");
      }

   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      var1.r("TNTFuse", this.iz);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
