package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.a.t;
import net.nw.s;
import net.nw.v;
import net.nw.y;
import net.u.d;
import net.u.r;
import net.yz.ai;

public class w extends s {
   private r Z;

   public w(t var1) {
      super(var1);
   }

   public void H() {
      s.H();
      r var2 = this.h.c(1.0F).I();
      var2.T(-0.7853982F);
      double var3 = this.h.kG.b;
      double var5 = this.h.kG.hS + (double)(this.h.kG.m / 2.0F);
      double var7 = this.h.kG.hr;
      int var9 = 0;
      double var10 = var3 + this.h.Q().nextGaussian() / 2.0D;
      double var12 = var5 + this.h.Q().nextGaussian() / 2.0D;
      double var14 = var7 + this.h.Q().nextGaussian() / 2.0D;
      this.h.hl.n(ai.DRAGON_BREATH, var10, var12, var14, -var2.p * 0.07999999821186066D + this.h.hf, -var2.H * 0.30000001192092896D + this.h.K, -var2.a * 0.07999999821186066D + this.h.J, new int[0]);
      var2.T(0.19634955F);
      ++var9;
      d.h(new d[3]);
   }

   public void J() {
      d[] var1 = s.H();
      if(this.Z == null) {
         this.Z = new r(this.h.hl.D(net.w.e.z));
      }

      if(this.Z.s(this.h.b, this.h.hS, this.h.hr) < 1.0D) {
         ((y)this.h.c().E(v.a)).x();
         this.h.c().D(v.H);
      }

   }

   public float H() {
      return 1.5F;
   }

   public float l() {
      float var1 = net.u.t.R(this.h.hf * this.h.hf + this.h.J * this.h.J) + 1.0F;
      float var2 = Math.min(var1, 40.0F);
      return var2 / var1;
   }

   public void h() {
      this.Z = null;
   }

   @Nullable
   public r Y() {
      return this.Z;
   }

   public v x() {
      return v.W;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
