package net.y6;

import net.xn;
import net.y6.jb;
import net.y6.p;
import net.yz.aa;

public class d extends p {
   public jb D;
   public jb F;
   public jb d;
   public jb m;

   public d() {
      this(0.0F);
   }

   public d(float var1) {
      super(var1, 64, 64);
      this.G = new jb(this, 0, 0);
      this.G.d(-1.0F, -7.0F, -1.0F, 2, 7, 2, var1);
      this.G.n(0.0F, 0.0F, 0.0F);
      this.N = new jb(this, 0, 26);
      this.N.d(-6.0F, 0.0F, -1.5F, 12, 3, 3, var1);
      this.N.n(0.0F, 0.0F, 0.0F);
      this.A = new jb(this, 24, 0);
      this.A.d(-2.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.A.n(-5.0F, 2.0F, 0.0F);
      this.B = new jb(this, 32, 16);
      this.B.x = true;
      this.B.d(0.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.B.n(5.0F, 2.0F, 0.0F);
      this.H = new jb(this, 8, 0);
      this.H.d(-1.0F, 0.0F, -1.0F, 2, 11, 2, var1);
      this.H.n(-1.9F, 12.0F, 0.0F);
      this.a = new jb(this, 40, 16);
      this.a.x = true;
      this.a.d(-1.0F, 0.0F, -1.0F, 2, 11, 2, var1);
      this.a.n(1.9F, 12.0F, 0.0F);
      this.D = new jb(this, 16, 0);
      this.D.d(-3.0F, 3.0F, -1.0F, 2, 7, 2, var1);
      this.D.n(0.0F, 0.0F, 0.0F);
      this.D.B = true;
      this.F = new jb(this, 48, 16);
      this.F.d(1.0F, 3.0F, -1.0F, 2, 7, 2, var1);
      this.F.n(0.0F, 0.0F, 0.0F);
      this.d = new jb(this, 0, 48);
      this.d.d(-4.0F, 10.0F, -1.0F, 8, 2, 2, var1);
      this.d.n(0.0F, 0.0F, 0.0F);
      this.m = new jb(this, 0, 32);
      this.m.d(-6.0F, 11.0F, -6.0F, 12, 1, 12, var1);
      this.m.n(0.0F, 12.0F, 0.0F);
      this.P.B = false;
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.y6.z.C();
      super.p(var1, var2, var3, var4, var5, var6, var7);
      if(var7 instanceof net.nm.z) {
         net.nm.z var9 = (net.nm.z)var7;
         this.B.B = var9.D();
         this.A.B = var9.D();
         this.m.B = !var9.JY();
         this.a.n(1.9F, 12.0F, 0.0F);
         this.H.n(-1.9F, 12.0F, 0.0F);
         this.D.b = 0.017453292F * var9.G().D();
         this.D.N = 0.017453292F * var9.G().L();
         this.D.c = 0.017453292F * var9.G().K();
         this.F.b = 0.017453292F * var9.G().D();
         this.F.N = 0.017453292F * var9.G().L();
         this.F.c = 0.017453292F * var9.G().K();
         this.d.b = 0.017453292F * var9.G().D();
         this.d.N = 0.017453292F * var9.G().L();
         this.d.c = 0.017453292F * var9.G().K();
         this.m.b = 0.0F;
         this.m.N = 0.017453292F * -var7.hN;
         this.m.c = 0.0F;
      }

   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      super.V(var1, var2, var3, var4, var5, var6, var7);
      net.y.d.c();
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.D.B(var7);
         this.F.B(var7);
         this.d.B(var7);
         this.m.B(var7);
      }

      if(var1.Q()) {
         net.y.d.O(0.0F, 0.2F, 0.0F);
      }

      this.D.B(var7);
      this.F.B(var7);
      this.d.B(var7);
      this.m.B(var7);
      net.y.d.Y();
   }

   public void V(float var1, aa var2) {
      jb var3 = this.O(var2);
      boolean var4 = var3.B;
      var3.B = true;
      super.V(var1, var2);
      var3.B = var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
