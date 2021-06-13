package net.yz;

import net.xn;
import net.yz.m_;

public class s {
   public int J;
   public float x;
   public float E = 1.0F;
   public float G;
   float h;
   private double r;
   private long f;
   private long D;
   private long w;
   private double t = 1.0D;

   public s(float var1) {
      this.h = var1;
      this.f = net.nn.j.E();
      this.D = System.nanoTime() / 1000000L;
   }

   public void i() {
      int var1;
      long var2;
      double var8;
      label0: {
         int var10000 = m_.J();
         var2 = net.nn.j.E();
         long var4 = var2 - this.f;
         long var6 = System.nanoTime() / 1000000L;
         var8 = (double)var6 / 1000.0D;
         var1 = var10000;
         if(Long.compare(var4, 1000L) <= 0 && var4 >= 0L) {
            this.w += var4;
            if(this.w > 1000L) {
               long var10 = var6 - this.D;
               double var12 = (double)this.w / (double)var10;
               this.t += (var12 - this.t) * 0.20000000298023224D;
               this.D = var6;
               this.w = 0L;
            }

            if(this.w >= 0L) {
               break label0;
            }

            this.D = var6;
         }

         this.r = var8;
      }

      this.f = var2;
      double var15 = (var8 - this.r) * this.t;
      this.r = var8;
      var15 = net.u.t.F(var15, 0.0D, 1.0D);
      this.G = (float)((double)this.G + var15 * (double)this.E * (double)this.h);
      this.J = (int)this.G;
      this.G -= (float)this.J;
      if(this.J > 10) {
         this.J = 10;
      }

      this.x = this.G;
      if(net.u.d.y() == null) {
         ++var1;
         m_.p(var1);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
