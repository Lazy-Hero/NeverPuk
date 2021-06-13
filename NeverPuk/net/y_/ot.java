package net.y_;

import java.util.List;
import java.util.Random;
import net.b2;
import net.xn;
import net.y_.b;
import net.yz.ai;

public class ot extends b {
   private final net.yn.w c;
   private final Class g;
   net.yv.r N;
   private net.yn.w U;
   int v;
   double Y;

   public ot(net.yn.w var1, double var2) {
      this(var1, var2, var1.getClass());
   }

   public ot(net.yn.w var1, double var2, Class var4) {
      this.c = var1;
      this.N = var1.hl;
      this.g = var4;
      this.Y = var2;
      this.h(3);
   }

   public boolean f() {
      if(!this.c.BZ()) {
         return false;
      } else {
         this.U = this.D();
         return this.U != null;
      }
   }

   public boolean X() {
      return this.U.P() && this.U.BZ() && this.v < 60;
   }

   public void C() {
      this.U = null;
      this.v = 0;
   }

   public void E() {
      this.c.E().n(this.U, 10.0F, (float)this.c.w());
      this.c.H().F(this.U, this.Y);
      ++this.v;
      if(this.v >= 60 && this.c.F(this.U) < 9.0D) {
         this.K();
      }

   }

   private net.yn.w D() {
      List var1 = this.N.p(this.g, this.c.i().x(8.0D));
      double var2 = Double.MAX_VALUE;
      net.yn.w var4 = null;

      for(net.yn.w var6 : var1) {
         if(this.c.b(var6) && this.c.F(var6) < var2) {
            var4 = var6;
            var2 = this.c.F(var6);
         }
      }

      return var4;
   }

   private void K() {
      b.q();
      net.ne.j var2 = this.c.r(this.U);
      net.r.h var3 = this.c.Y();
      if(var3 == null && this.U.Y() != null) {
         var3 = this.U.Y();
      }

      if(var3 != null) {
         var3.S(net.v.q.I);
         b2.T.g(var3, this.c, this.U, var2);
      }

      this.c.V(6000);
      this.U.V(6000);
      this.c.p1();
      this.U.p1();
      var2.V(-24000);
      var2.S(this.c.b, this.c.hS, this.c.hr, 0.0F, 0.0F);
      this.N.S(var2);
      Random var4 = this.c.Q();
      int var5 = 0;
      double var6 = var4.nextGaussian() * 0.02D;
      double var8 = var4.nextGaussian() * 0.02D;
      double var10 = var4.nextGaussian() * 0.02D;
      double var12 = var4.nextDouble() * (double)this.c.h9 * 2.0D - (double)this.c.h9;
      double var14 = 0.5D + var4.nextDouble() * (double)this.c.m;
      double var16 = var4.nextDouble() * (double)this.c.h9 * 2.0D - (double)this.c.h9;
      this.N.n(ai.HEART, this.c.b + var12, this.c.hS + var14, this.c.hr + var16, var6, var8, var10, new int[0]);
      ++var5;
      if(this.N.N().b("doMobLoot")) {
         this.N.S(new net.nm.s(this.N, this.c.b, this.c.hS, this.c.hr, var4.nextInt(7) + 1));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
