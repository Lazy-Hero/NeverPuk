package net.z;

import net.xn;
import net.z.g;
import net.z.h;

public class q extends h {
   private final net.ct.h Z;

   public q(net.ct.h var1, int var2, int var3, int var4, int var5, int var6) {
      super(net.nn.j.b(), var2, var3, var4, var5, var6);
      this.Z = var1;
   }

   protected int V() {
      return this.Z.o();
   }

   protected void E(int var1, boolean var2, int var3, int var4) {
      this.Z.g(var1, var2, var3, var4);
   }

   protected boolean z(int var1) {
      return this.Z.d(var1);
   }

   protected void x() {
      this.Z.p();
   }

   protected void x(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      this.Z.M(var1, var2, var3, var4, var5, var6);
   }

   public int S() {
      return this.x;
   }

   public int B() {
      return this.N;
   }

   public int c() {
      return this.e;
   }

   protected int X() {
      return this.Z.u();
   }

   protected int I() {
      return this.Z.S();
   }

   public void q() {
      super.q();
   }

   public void Z(int var1, int var2, float var3) {
      boolean var4 = g.C();
      if(this.H) {
         this.e = var1;
         this.N = var2;
         this.x();
         int var5 = this.I();
         int var6 = var5 + 6;
         this.B();
         net.y.d.i();
         net.y.d.V();
         net.y.r var7 = net.y.r.f();
         net.y.p var8 = var7.k();
         int var9 = this.v + this.x / 2 - this.C() / 2 + 2;
         int var10 = this.a + 4 - (int)this.g;
         if(this.w) {
            this.A(var9, var10, var7);
         }

         this.e(var9, var10, var1, var2, var3);
         net.y.d.z();
         this.J(0, this.a, 255, 255);
         this.J(this.G, this.t, 255, 255);
         net.y.d.C();
         net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ZERO, net.y.d.ONE);
         net.y.d.d();
         net.y.d.Q(7425);
         net.y.d.w();
         int var11 = this.Z();
         if(var11 > 0) {
            int var12 = (this.G - this.a) * (this.G - this.a) / this.X();
            var12 = net.u.t.g(var12, 32, this.G - this.a - 8);
            int var13 = (int)this.g * (this.G - this.a - var12) / var11 + this.a;
            if(var13 < this.a) {
               var13 = this.a;
            }

            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)this.G, 0.0D).Y(0.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)var6, (double)this.G, 0.0D).Y(1.0D, 1.0D).V(0, 0, 0, 255).W();
            var8.H((double)var6, (double)this.a, 0.0D).Y(1.0D, 0.0D).V(0, 0, 0, 255).W();
            var8.H((double)var5, (double)this.a, 0.0D).Y(0.0D, 0.0D).V(0, 0, 0, 255).W();
            var7.p();
            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)(var13 + var12), 0.0D).Y(0.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var6, (double)(var13 + var12), 0.0D).Y(1.0D, 1.0D).V(128, 128, 128, 255).W();
            var8.H((double)var6, (double)var13, 0.0D).Y(1.0D, 0.0D).V(128, 128, 128, 255).W();
            var8.H((double)var5, (double)var13, 0.0D).Y(0.0D, 0.0D).V(128, 128, 128, 255).W();
            var7.p();
            var8.m(7, net.y8.x.r);
            var8.H((double)var5, (double)(var13 + var12 - 1), 0.0D).Y(0.0D, 1.0D).V(192, 192, 192, 255).W();
            var8.H((double)(var6 - 1), (double)(var13 + var12 - 1), 0.0D).Y(1.0D, 1.0D).V(192, 192, 192, 255).W();
            var8.H((double)(var6 - 1), (double)var13, 0.0D).Y(1.0D, 0.0D).V(192, 192, 192, 255).W();
            var8.H((double)var5, (double)var13, 0.0D).Y(0.0D, 0.0D).V(192, 192, 192, 255).W();
            var7.p();
         }

         this.M(var1, var2);
         net.y.d.S();
         net.y.d.Q(7424);
         net.y.d.m();
         net.y.d.E();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
