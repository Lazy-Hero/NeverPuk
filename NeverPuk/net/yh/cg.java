package net.yh;

import java.util.Random;
import net.xn;
import net.yh.c;
import net.yh.x;

public class cg extends x {
   private static final Random n = new Random();
   private int v = 128;

   protected cg(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.5D - n.nextDouble(), var10, 0.5D - n.nextDouble());
      this.R *= 0.20000000298023224D;
      if(var8 == 0.0D && var12 == 0.0D) {
         this.B *= 0.10000000149011612D;
         this.L *= 0.10000000149011612D;
      }

      this.g *= 0.75F;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public boolean u() {
      return true;
   }

   public void f() {
      this.i = this.K;
      x.f();
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.Y(this.v + (7 - this.x * 8 / this.a));
      this.R += 0.004D;
      this.f(this.B, this.R, this.L);
      if(Double.compare(this.C, this.m) == 0) {
         this.B *= 1.1D;
         this.L *= 1.1D;
      }

      this.B *= 0.9599999785423279D;
      this.R *= 0.9599999785423279D;
      this.L *= 0.9599999785423279D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   public void c(int var1) {
      this.v = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class d implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         cg var16 = new cg(var2, var3, var5, var7, var9, var11, var13);
         ((cg)var16).c(144);
         float var17 = var2.G.nextFloat() * 0.5F + 0.35F;
         var16.W(1.0F * var17, 0.0F * var17, 1.0F * var17);
         return var16;
      }
   }

   public static class g implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new cg(var2, var3, var5, var7, var9, var11, var13);
      }
   }

   public static class l implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         cg var16 = new cg(var2, var3, var5, var7, var9, var11, var13);
         var16.n(0.15F);
         var16.W((float)var9, (float)var11, (float)var13);
         return var16;
      }
   }

   public static class p implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         cg var16 = new cg(var2, var3, var5, var7, var9, var11, var13);
         ((cg)var16).c(144);
         return var16;
      }
   }

   public static class z implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         cg var16 = new cg(var2, var3, var5, var7, var9, var11, var13);
         var16.W((float)var9, (float)var11, (float)var13);
         return var16;
      }
   }
}
