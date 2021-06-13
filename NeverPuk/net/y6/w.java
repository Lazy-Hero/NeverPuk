package net.y6;

import net.xn;
import net.n0.ks;
import net.y6.jb;
import net.y6.t;
import net.yz.aa;

public class w extends t {
   public w() {
      this(0.0F, false);
   }

   public w(float var1, boolean var2) {
      net.y6.z.W();
      super(var1, 0.0F, 64, 32);
      this.A = new jb(this, 40, 16);
      this.A.d(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.A.n(-5.0F, 2.0F, 0.0F);
      this.B = new jb(this, 40, 16);
      this.B.x = true;
      this.B.d(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.B.n(5.0F, 2.0F, 0.0F);
      this.H = new jb(this, 0, 16);
      this.H.d(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.H.n(-2.0F, 12.0F, 0.0F);
      this.a = new jb(this, 0, 16);
      this.a.x = true;
      this.a.d(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.a.n(2.0F, 12.0F, 0.0F);
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      this.X = t.g.EMPTY;
      this.e = t.g.EMPTY;
      ks var5 = var1.o(net.yz.k.MAIN_HAND);
      if(var5.Z() == net.nb.j.w && ((net.nk.q)var1).yy()) {
         if(var1.a() == aa.RIGHT) {
            this.X = t.g.BOW_AND_ARROW;
         } else {
            this.e = t.g.BOW_AND_ARROW;
         }
      }

      super.x(var1, var2, var3, var4);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      net.y6.z.W();
      ks var9 = ((net.ne.a)var7).S();
      net.nk.q var10 = (net.nk.q)var7;
      if(var10.yy() && (var9.B() || var9.Z() != net.nb.j.w)) {
         float var11 = net.u.t.A(this.v * 3.1415927F);
         float var12 = net.u.t.A((1.0F - (1.0F - this.v) * (1.0F - this.v)) * 3.1415927F);
         this.A.c = 0.0F;
         this.B.c = 0.0F;
         this.A.N = -(0.1F - var11 * 0.6F);
         this.B.N = 0.1F - var11 * 0.6F;
         this.A.b = -1.5707964F;
         this.B.b = -1.5707964F;
         this.A.b -= var11 * 1.2F - var12 * 0.4F;
         this.B.b -= var11 * 1.2F - var12 * 0.4F;
         this.A.c += net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
         this.B.c -= net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
         this.A.b += net.u.t.A(var3 * 0.067F) * 0.05F;
         this.B.b -= net.u.t.A(var3 * 0.067F) * 0.05F;
      }

   }

   public void V(float var1, aa var2) {
      float var3 = var2 == aa.RIGHT?1.0F:-1.0F;
      jb var4 = this.O(var2);
      var4.l += var3;
      var4.I(var1);
      var4.l -= var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
