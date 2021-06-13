package net.y6;

import net.xn;
import net.y6.jb;
import net.y6.t;
import net.yz.aa;

public class f extends t {
   public jb s;
   public jb O;
   public jb i;
   public jb b;
   public jb I;
   private final jb Q;
   private final jb L;
   private final boolean Z;

   public f(float var1, boolean var2) {
      super(var1, 0.0F, 64, 64);
      this.Z = var2;
      this.L = new jb(this, 24, 0);
      net.y6.z.C();
      this.L.d(-3.0F, -6.0F, -1.0F, 6, 6, 1, var1);
      this.Q = new jb(this, 0, 0);
      this.Q.R(64, 32);
      this.Q.d(-5.0F, 0.0F, -1.0F, 10, 16, 1, var1);
      this.B = new jb(this, 32, 48);
      this.B.d(-1.0F, -2.0F, -2.0F, 3, 12, 4, var1);
      this.B.n(5.0F, 2.5F, 0.0F);
      this.A = new jb(this, 40, 16);
      this.A.d(-2.0F, -2.0F, -2.0F, 3, 12, 4, var1);
      this.A.n(-5.0F, 2.5F, 0.0F);
      this.s = new jb(this, 48, 48);
      this.s.d(-1.0F, -2.0F, -2.0F, 3, 12, 4, var1 + 0.25F);
      this.s.n(5.0F, 2.5F, 0.0F);
      this.O = new jb(this, 40, 32);
      this.O.d(-2.0F, -2.0F, -2.0F, 3, 12, 4, var1 + 0.25F);
      this.O.n(-5.0F, 2.5F, 10.0F);
      this.B = new jb(this, 32, 48);
      this.B.d(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.B.n(5.0F, 2.0F, 0.0F);
      this.s = new jb(this, 48, 48);
      this.s.d(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.s.n(5.0F, 2.0F, 0.0F);
      this.O = new jb(this, 40, 32);
      this.O.d(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.O.n(-5.0F, 2.0F, 10.0F);
      this.a = new jb(this, 16, 48);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.a.n(1.9F, 12.0F, 0.0F);
      this.i = new jb(this, 0, 48);
      this.i.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.i.n(1.9F, 12.0F, 0.0F);
      this.b = new jb(this, 0, 32);
      this.b.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.25F);
      this.b.n(-1.9F, 12.0F, 0.0F);
      this.I = new jb(this, 16, 32);
      this.I.d(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1 + 0.25F);
      this.I.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      super.V(var1, var2, var3, var4, var5, var6, var7);
      net.y.d.c();
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.i.B(var7);
         this.b.B(var7);
         this.s.B(var7);
         this.O.B(var7);
         this.I.B(var7);
      }

      if(var1.Q()) {
         net.y.d.O(0.0F, 0.2F, 0.0F);
      }

      this.i.B(var7);
      this.b.B(var7);
      this.s.B(var7);
      this.O.B(var7);
      this.I.B(var7);
      net.y.d.Y();
   }

   public void H(float var1) {
      b(this.G, this.L);
      this.L.l = 0.0F;
      this.L.I = 0.0F;
      this.L.B(var1);
   }

   public void C(float var1) {
      this.Q.B(var1);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      b(this.a, this.i);
      b(this.H, this.b);
      b(this.B, this.s);
      b(this.A, this.O);
      b(this.N, this.I);
   }

   public void k(boolean var1) {
      super.k(var1);
      this.s.B = var1;
      this.O.B = var1;
      this.i.B = var1;
      this.b.B = var1;
      this.I.B = var1;
      this.Q.B = var1;
      this.L.B = var1;
   }

   public void V(float var1, aa var2) {
      jb var3 = this.O(var2);
      if(this.Z) {
         float var4 = 0.5F * (float)(var2 == aa.RIGHT?1:-1);
         var3.l += var4;
         var3.I(var1);
         var3.l -= var4;
      } else {
         var3.I(var1);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
