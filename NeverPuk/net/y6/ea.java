package net.y6;

import net.xn;
import net.y6.e2;
import net.y6.jb;

public class ea extends e2 {
   public boolean h;
   private final jb B = (new jb(this)).R(64, 128);
   private final jb c;

   public ea(float var1) {
      super(var1, 0.0F, 64, 128);
      this.B.n(0.0F, -2.0F, 0.0F);
      this.B.k(0, 0).d(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.U.s(this.B);
      this.c = (new jb(this)).R(64, 128);
      this.c.n(-5.0F, -10.03125F, -5.0F);
      this.c.k(0, 64).U(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.S.s(this.c);
      jb var2 = (new jb(this)).R(64, 128);
      var2.n(1.75F, -4.0F, 2.0F);
      var2.k(0, 76).U(0.0F, 0.0F, 0.0F, 7, 4, 7);
      var2.b = -0.05235988F;
      var2.c = 0.02617994F;
      this.c.s(var2);
      jb var3 = (new jb(this)).R(64, 128);
      var3.n(1.75F, -4.0F, 2.0F);
      var3.k(0, 87).U(0.0F, 0.0F, 0.0F, 4, 4, 4);
      var3.b = -0.10471976F;
      var3.c = 0.05235988F;
      var2.s(var3);
      jb var4 = (new jb(this)).R(64, 128);
      var4.n(1.75F, -2.0F, 2.0F);
      var4.k(0, 95).d(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      var4.b = -0.20943952F;
      var4.c = 0.10471976F;
      var3.s(var4);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.U.D = 0.0F;
      net.y6.z.W();
      this.U.F = 0.0F;
      this.U.X = 0.0F;
      float var9 = 0.01F * (float)(var7.G() % 10);
      this.U.b = net.u.t.A((float)var7.x * var9) * 4.5F * 0.017453292F;
      this.U.N = 0.0F;
      this.U.c = net.u.t.m((float)var7.x * var9) * 2.5F * 0.017453292F;
      if(this.h) {
         this.U.b = -0.9F;
         this.U.X = -0.09375F;
         this.U.F = 0.1875F;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
