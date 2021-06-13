package net.nm;

import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.nm.w;
import net.yz.ai;

public class k extends net.ne.l {
   private static final net.k.v Qp = net.k.n.q(k.class, y.d);
   @Nullable
   private net.ne.a Qo;
   private int Qc;

   public k(net.yv.r var1) {
      super(var1);
      this.Qc = 80;
      this.a = true;
      this.hw = true;
      this.S(0.98F, 0.98F);
   }

   public k(net.yv.r var1, double var2, double var4, double var6, net.ne.a var8) {
      this(var1);
      this.t(var2, var4, var6);
      float var9 = (float)(Math.random() * 6.283185307179586D);
      this.hf = (double)(-((float)Math.sin((double)var9)) * 0.02F);
      this.K = 0.20000000298023224D;
      this.J = (double)(-((float)Math.cos((double)var9)) * 0.02F);
      this.d(80);
      this.h = var2;
      this.h6 = var4;
      this.l = var6;
      this.Qo = var8;
   }

   protected void g() {
      this.G.r(Qp, Integer.valueOf(80));
   }

   protected boolean k() {
      return false;
   }

   public boolean w() {
      return !this.Z;
   }

   public void A() {
      w.h.u();
      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      if(!this.j()) {
         this.K -= 0.03999999910593033D;
      }

      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      this.hf *= 0.9800000190734863D;
      this.K *= 0.9800000190734863D;
      this.J *= 0.9800000190734863D;
      if(this.k) {
         this.hf *= 0.699999988079071D;
         this.J *= 0.699999988079071D;
         this.K *= -0.5D;
      }

      --this.Qc;
      if(this.Qc <= 0) {
         this.B();
         if(this.hl.x) {
            return;
         }

         this.l();
      }

      this.r();
      this.hl.n(ai.SMOKE_NORMAL, this.b, this.hS + 0.5D, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
   }

   private void l() {
      float var10000 = 4.0F;
      this.hl.B(this, this.b, this.hS + (double)(this.m / 16.0F), this.hr, 4.0F, true);
   }

   protected void I(net.nj.f var1) {
      var1.h("Fuse", (short)this.z());
   }

   protected void o(net.nj.f var1) {
      this.d(var1.E("Fuse"));
   }

   @Nullable
   public net.ne.a J() {
      return this.Qo;
   }

   public float A() {
      return 0.0F;
   }

   public void d(int var1) {
      this.G.d(Qp, Integer.valueOf(var1));
      this.Qc = var1;
   }

   public void O(net.k.v var1) {
      if(Qp.equals(var1)) {
         this.Qc = this.s();
      }

   }

   public int s() {
      return ((Integer)this.G.a(Qp)).intValue();
   }

   public int z() {
      return this.Qc;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
