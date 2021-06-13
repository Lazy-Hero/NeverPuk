package net.z;

import net.xn;
import net.z.g;
import net.z.m;

public class tl extends m {
   private float B;
   public boolean W;
   private final net.nr.d q;
   private final float I;
   private final float C;

   public tl(int var1, int var2, int var3, net.nr.d var4) {
      this(var1, var2, var3, var4, 0.0F, 1.0F);
   }

   public tl(int var1, int var2, int var3, net.nr.d var4, float var5, float var6) {
      super(var1, var2, var3, 150, 20, "");
      this.B = 1.0F;
      this.q = var4;
      this.I = var5;
      this.C = var6;
      net.nn.j var7 = net.nn.j.b();
      this.B = var4.f(var7.T.T(var4));
      this.J = var7.T.L(var4);
   }

   protected int O(boolean var1) {
      return 0;
   }

   protected void N(net.nn.j var1, int var2, int var3) {
      boolean var4 = g.C();
      if(this.F) {
         if(this.W) {
            this.B = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
            this.B = net.u.t.T(this.B, 0.0F, 1.0F);
            float var5 = this.q.y(this.B);
            var1.T.N(this.q, var5);
            this.B = this.q.f(var5);
            this.J = var1.T.L(this.q);
         }

         var1.n().E(b);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.g(this.D + (int)(this.B * (float)(this.s - 8)), this.R, 0, 66, 4, 20);
         this.g(this.D + (int)(this.B * (float)(this.s - 8)) + 4, this.R, 196, 66, 4, 20);
      }

   }

   public boolean X(net.nn.j var1, int var2, int var3) {
      boolean var4 = g.B();
      if(super.X(var1, var2, var3)) {
         this.B = (float)(var2 - (this.D + 4)) / (float)(this.s - 8);
         this.B = net.u.t.T(this.B, 0.0F, 1.0F);
         var1.T.N(this.q, this.q.y(this.B));
         this.J = var1.T.L(this.q);
         this.W = true;
         return true;
      } else {
         return false;
      }
   }

   public void A(int var1, int var2) {
      this.W = false;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
