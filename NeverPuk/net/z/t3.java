package net.z;

import net.xn;
import net.z.g;
import net.z.m;
import net.z.v;

public class t3 extends m {
   private float V = 1.0F;
   public boolean H;
   private final String o;
   private final float M;
   private final float y;
   private final v.e c;
   private final t3.o u;

   public t3(v.e var1, int var2, int var3, int var4, String var5, float var6, float var7, float var8, t3.o var9) {
      super(var2, var3, var4, 150, 20, "");
      this.o = var5;
      this.M = var6;
      this.y = var7;
      this.V = (var8 - var6) / (var7 - var6);
      this.u = var9;
      this.c = var1;
      this.J = this.U();
   }

   public float L() {
      return this.M + (this.y - this.M) * this.V;
   }

   public void j(float var1, boolean var2) {
      this.V = (var1 - this.M) / (this.y - this.M);
      this.J = this.U();
      this.c.t(this.g, this.L());
   }

   public float i() {
      return this.V;
   }

   private String U() {
      return this.u == null?net.c9.b.x(this.o, new Object[0]) + ": " + this.L():this.u.B(this.g, net.c9.b.x(this.o, new Object[0]), this.L());
   }

   protected int O(boolean var1) {
      return 0;
   }

   protected void N(net.nn.j var1, int var2, int var3) {
      boolean var4 = g.B();
      if(this.F) {
         if(this.H) {
            this.V = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
            if(Float.compare(this.V, 0.0F) < 0) {
               this.V = 0.0F;
            }

            if(this.V > 1.0F) {
               this.V = 1.0F;
            }

            this.J = this.U();
            this.c.t(this.g, this.L());
         }

         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.g(this.D + (int)(this.V * (float)(this.s - 8)), this.R, 0, 66, 4, 20);
         this.g(this.D + (int)(this.V * (float)(this.s - 8)) + 4, this.R, 196, 66, 4, 20);
      }

   }

   public void X(float var1) {
      this.V = var1;
      this.J = this.U();
      this.c.t(this.g, this.L());
   }

   public boolean X(net.nn.j var1, int var2, int var3) {
      if(super.X(var1, var2, var3)) {
         this.V = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
         if(this.V < 0.0F) {
            this.V = 0.0F;
         }

         if(this.V > 1.0F) {
            this.V = 1.0F;
         }

         this.J = this.U();
         this.c.t(this.g, this.L());
         this.H = true;
         return true;
      } else {
         return false;
      }
   }

   public void A(int var1, int var2) {
      this.H = false;
   }

   private static xn c(xn var0) {
      return var0;
   }

   public interface o {
      String B(int var1, String var2, float var3);
   }
}
