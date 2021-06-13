package net.nw;

import net.xn;
import net.a.t;
import net.nb.b;
import net.nw.h;
import net.nw.s;
import net.nw.v;
import net.u.j;
import net.u.r;
import net.yz.ai;

public class y extends h {
   private int l;
   private int n;
   private net.ne.w f;

   public y(t var1) {
      super(var1);
   }

   public void H() {
      ++this.l;
      if(this.l % 2 == 0 && this.l < 10) {
         r var1 = this.h.c(1.0F).I();
         var1.T(-0.7853982F);
         double var2 = this.h.kG.b;
         double var4 = this.h.kG.hS + (double)(this.h.kG.m / 2.0F);
         double var6 = this.h.kG.hr;
         boolean var8 = false;
         double var9 = var2 + this.h.Q().nextGaussian() / 2.0D;
         double var11 = var4 + this.h.Q().nextGaussian() / 2.0D;
         double var13 = var6 + this.h.Q().nextGaussian() / 2.0D;
         int var15 = 0;

         while(true) {
            this.h.hl.n(ai.DRAGON_BREATH, var9, var11, var13, -var1.p * 0.07999999821186066D * (double)var15, -var1.H * 0.6000000238418579D, -var1.a * 0.07999999821186066D * (double)var15, new int[0]);
            ++var15;
         }
      }

   }

   public void J() {
      s.H();
      ++this.l;
      if(this.l >= 200) {
         if(this.n >= 4) {
            this.h.c().D(v.V);
         }

         this.h.c().D(v.H);
      }

      if(this.l == 10) {
         r var2 = (new r(this.h.kG.b - this.h.b, 0.0D, this.h.kG.hr - this.h.hr)).I();
         float var10000 = 5.0F;
         double var4 = this.h.kG.b + var2.p * 5.0D / 2.0D;
         double var6 = this.h.kG.hr + var2.a * 5.0D / 2.0D;
         double var8 = this.h.kG.hS + (double)(this.h.kG.m / 2.0F);
         j.v var10 = new j.v(net.u.t.L(var4), net.u.t.L(var8), net.u.t.L(var6));
         if(this.h.hl.y((j)var10)) {
            --var8;
            var10.V(net.u.t.L(var4), net.u.t.L(var8), net.u.t.L(var6));
         }

         var8 = (double)(net.u.t.L(var8) + 1);
         this.f = new net.ne.w(this.h.hl, var4, var8, var6);
         this.f.L(this.h);
         this.f.h(5.0F);
         this.f.I(200);
         this.f.Q(ai.DRAGON_BREATH);
         this.f.Y(new net.n_.i(b.W));
         this.h.hl.S(this.f);
      }

   }

   public void h() {
      this.l = 0;
      ++this.n;
   }

   public void o() {
      if(this.f != null) {
         this.f.B();
         this.f = null;
      }

   }

   public v x() {
      return v.a;
   }

   public void x() {
      this.n = 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
