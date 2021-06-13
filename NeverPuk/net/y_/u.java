package net.y_;

import net.xn;
import net.y_.b;

public class u {
   protected final net.ne.y D;
   protected double c;
   protected double X;
   protected double Y;
   protected double b;
   protected float R;
   protected float i;
   public u.t p = u.t.WAIT;

   public u(net.ne.y var1) {
      this.D = var1;
   }

   public boolean J() {
      return this.p == u.t.MOVE_TO;
   }

   public double A() {
      return this.b;
   }

   public void Q(double var1, double var3, double var5, double var7) {
      this.c = var1;
      this.X = var3;
      this.Y = var5;
      this.b = var7;
      this.p = u.t.MOVE_TO;
   }

   public void d(float var1, float var2) {
      this.p = u.t.STRAFE;
      this.R = var1;
      this.i = var2;
      this.b = 0.25D;
   }

   public void n(u var1) {
      this.p = var1.p;
      this.c = var1.c;
      this.X = var1.X;
      this.Y = var1.Y;
      this.b = Math.max(var1.b, 1.0D);
      this.R = var1.R;
      this.i = var1.i;
   }

   public void D() {
      boolean var1 = b.E();
      if(this.p == u.t.STRAFE) {
         float var2 = (float)this.D.t(net.ne.d.G).K();
         float var3 = (float)this.b * var2;
         float var4 = this.R;
         float var5 = this.i;
         float var6 = net.u.t.g(var4 * var4 + var5 * var5);
         if(var6 < 1.0F) {
            var6 = 1.0F;
         }

         var6 = var3 / var6;
         var4 = var4 * var6;
         var5 = var5 * var6;
         float var7 = net.u.t.A(this.D.hN * 0.017453292F);
         float var8 = net.u.t.m(this.D.hN * 0.017453292F);
         float var9 = var4 * var8 - var5 * var7;
         float var10 = var5 * var8 + var4 * var7;
         net.b.n var11 = this.D.H();
         net.b.r var12 = var11.o();
         if(var12.H(this.D.hl, net.u.t.L(this.D.b + (double)var9), net.u.t.L(this.D.hS), net.u.t.L(this.D.hr + (double)var10)) != net.b.m.WALKABLE) {
            this.R = 1.0F;
            this.i = 0.0F;
            var3 = var2;
         }

         this.D.P(var3);
         this.D.M(this.R);
         this.D.E(this.i);
         this.p = u.t.WAIT;
      }

      if(this.p == u.t.MOVE_TO) {
         this.p = u.t.WAIT;
         double var13 = this.c - this.D.b;
         double var15 = this.Y - this.D.hr;
         double var18 = this.X - this.D.hS;
         double var19 = var13 * var13 + var18 * var18 + var15 * var15;
         if(var19 < 2.500000277905201E-7D) {
            this.D.M(0.0F);
            return;
         }

         float var20 = (float)(net.u.t.V(var15, var13) * 57.29577951308232D) - 90.0F;
         this.D.hN = this.p(this.D.hN, var20, 90.0F);
         this.D.P((float)(this.b * this.D.t(net.ne.d.G).K()));
         if(Double.compare(var18, (double)this.D.ha) > 0 && var13 * var13 + var15 * var15 < (double)Math.max(1.0F, this.D.h9)) {
            this.D.D().F();
            this.p = u.t.JUMPING;
         }
      }

      if(this.p == u.t.JUMPING) {
         this.D.P((float)(this.b * this.D.t(net.ne.d.G).K()));
         if(!this.D.k) {
            return;
         }

         this.p = u.t.WAIT;
      }

      this.D.M(0.0F);
   }

   protected float p(float var1, float var2, float var3) {
      float var4 = net.u.t.k(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      float var5 = var1 + var4;
      if(var5 < 0.0F) {
         var5 += 360.0F;
      } else if(var5 > 360.0F) {
         var5 -= 360.0F;
      }

      return var5;
   }

   public double H() {
      return this.c;
   }

   public double F() {
      return this.X;
   }

   public double s() {
      return this.Y;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum t {
      WAIT,
      MOVE_TO,
      STRAFE,
      JUMPING;
   }
}
