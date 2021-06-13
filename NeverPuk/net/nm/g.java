package net.nm;

import net.xn;
import net.k.y;
import net.n0.ks;
import net.nm.w;
import net.y9.zw;
import net.yz.ai;
import net.yz.aq;

public class g extends w {
   private static final net.k.v pg = net.k.n.q(g.class, y.f);
   private int px;
   public double pn;
   public double pT;

   public g(net.yv.r var1) {
      super(var1);
   }

   public g(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public static void s(net.c0.d var0) {
      w.L(var0, g.class);
   }

   public w.h R() {
      return w.h.FURNACE;
   }

   protected void g() {
      super.g();
      this.G.r(pg, Boolean.valueOf(false));
   }

   public void A() {
      super.A();
      if(this.px > 0) {
         --this.px;
      }

      if(this.px <= 0) {
         this.pn = 0.0D;
         this.pT = 0.0D;
      }

      this.u(this.px > 0);
      if(this.U() && this.p.nextInt(4) == 0) {
         this.hl.n(ai.SMOKE_LARGE, this.b, this.hS + 0.8D, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   protected double y() {
      return 0.2D;
   }

   public void n(net.yz.z var1) {
      super.n(var1);
      if(!var1.e() && this.hl.N().b("doEntityDrops")) {
         this.O(new ks(net.nb.f.uY, 1), 0.0F);
      }

   }

   protected void v(net.u.j var1, net.yw.n var2) {
      w.h.s();
      super.v(var1, var2);
      double var4 = this.pn * this.pn + this.pT * this.pT;
      if(Double.compare(var4, 1.0E-4D) > 0 && this.hf * this.hf + this.J * this.J > 0.001D) {
         var4 = (double)net.u.t.R(var4);
         this.pn /= var4;
         this.pT /= var4;
         if(this.pn * this.hf + this.pT * this.J < 0.0D) {
            this.pn = 0.0D;
            this.pT = 0.0D;
         }

         double var6 = var4 / this.y();
         this.pn *= var6;
         this.pT *= var6;
      }

   }

   protected void D() {
      w.h.s();
      double var2 = this.pn * this.pn + this.pT * this.pT;
      if(var2 > 1.0E-4D) {
         var2 = (double)net.u.t.R(var2);
         this.pn /= var2;
         this.pT /= var2;
         double var10000 = 1.0D;
         this.hf *= 0.800000011920929D;
         this.K *= 0.0D;
         this.J *= 0.800000011920929D;
         this.hf += this.pn * 1.0D;
         this.J += this.pT * 1.0D;
      }

      this.hf *= 0.9800000190734863D;
      this.K *= 0.0D;
      this.J *= 0.9800000190734863D;
      super.D();
   }

   public boolean a(net.r.r var1, net.yz.k var2) {
      ks var3 = var1.o((net.yz.k)var2);
      if(var3.Z() == net.nb.j.u && this.px + 3600 <= 32000) {
         if(!var1.a6.V) {
            var3.H(1);
         }

         this.px += 3600;
      }

      this.pn = this.b - var1.b;
      this.pT = this.hr - var1.hr;
      return true;
   }

   protected void I(net.nj.f var1) {
      super.I(var1);
      var1.a("PushX", this.pn);
      var1.a("PushZ", this.pT);
      var1.h("Fuel", (short)this.px);
   }

   protected void o(net.nj.f var1) {
      super.o(var1);
      this.pn = var1.g("PushX");
      this.pT = var1.g("PushZ");
      this.px = var1.E("Fuel");
   }

   protected boolean U() {
      return ((Boolean)this.G.a(pg)).booleanValue();
   }

   protected void u(boolean var1) {
      this.G.d(pg, Boolean.valueOf(var1));
   }

   public net.yw.n M() {
      return (this.U()?net.nb.f.d7:net.nb.f.uY).p().s(zw.M, aq.NORTH);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
