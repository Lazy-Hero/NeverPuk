package net.y6;

import net.xn;
import net.y6.jb;
import net.yz.aa;

public class t extends net.y6.z {
   public jb G;
   public jb P;
   public jb N;
   public jb A;
   public jb B;
   public jb H;
   public jb a;
   public t.g e;
   public t.g X;
   public boolean T;

   public t() {
      this(0.0F);
   }

   public t(float var1) {
      this(var1, 0.0F, 64, 32);
   }

   public t(float var1, float var2, int var3, int var4) {
      this.e = t.g.EMPTY;
      this.X = t.g.EMPTY;
      this.f = var3;
      this.C = var4;
      this.G = new jb(this, 0, 0);
      this.G.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.G.n(0.0F, 0.0F + var2, 0.0F);
      this.P = new jb(this, 32, 0);
      this.P.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.P.n(0.0F, 0.0F + var2, 0.0F);
      this.N = new jb(this, 16, 16);
      this.N.d(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.N.n(0.0F, 0.0F + var2, 0.0F);
      this.A = new jb(this, 40, 16);
      this.A.d(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.A.n(-5.0F, 2.0F + var2, 0.0F);
      this.B = new jb(this, 40, 16);
      this.B.x = true;
      this.B.d(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.B.n(5.0F, 2.0F + var2, 0.0F);
      this.H = new jb(this, 0, 16);
      this.H.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.H.n(-1.9F, 12.0F + var2, 0.0F);
      this.a = new jb(this, 0, 16);
      this.a.x = true;
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.a.n(1.9F, 12.0F + var2, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      net.y.d.c();
      if(this.n) {
         float var10000 = 2.0F;
         net.y.d.W(0.75F, 0.75F, 0.75F);
         net.y.d.O(0.0F, 16.0F * var7, 0.0F);
         this.G.B(var7);
         net.y.d.Y();
         net.y.d.c();
         net.y.d.W(0.5F, 0.5F, 0.5F);
         net.y.d.O(0.0F, 24.0F * var7, 0.0F);
         this.N.B(var7);
         this.A.B(var7);
         this.B.B(var7);
         this.H.B(var7);
         this.a.B(var7);
         this.P.B(var7);
      } else {
         if(var1.Q()) {
            net.y.d.O(0.0F, 0.2F, 0.0F);
         }

         this.G.B(var7);
         this.N.B(var7);
         this.A.B(var7);
         this.B.B(var7);
         this.H.B(var7);
         this.a.B(var7);
         this.P.B(var7);
      }

      net.y.d.Y();
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      boolean var8 = net.y6.z.C();
      if(var7 instanceof net.ne.a && ((net.ne.a)var7).F() > 4) {
         boolean var20 = true;
      } else {
         boolean var10000 = false;
      }

      this.G.N = var4 * 0.017453292F;
      this.G.b = -0.7853982F;
      this.G.b = var5 * 0.017453292F;
      this.N.N = 0.0F;
      this.A.h = 0.0F;
      this.A.l = -5.0F;
      this.B.h = 0.0F;
      this.B.l = 5.0F;
      float var10 = 1.0F;
      Float.compare(var10, 1.0F);
      this.A.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F / var10;
      this.B.b = net.u.t.m(var1 * 0.6662F) * 2.0F * var2 * 0.5F / var10;
      this.A.c = 0.0F;
      this.B.c = 0.0F;
      this.H.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2 / var10;
      this.a.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 / var10;
      this.H.N = 0.0F;
      this.a.N = 0.0F;
      this.H.c = 0.0F;
      this.a.c = 0.0F;
      if(this.z) {
         this.A.b += -0.62831855F;
         this.B.b += -0.62831855F;
         this.H.b = -1.4137167F;
         this.H.N = 0.31415927F;
         this.H.c = 0.07853982F;
         this.a.b = -1.4137167F;
         this.a.N = -0.31415927F;
         this.a.c = -0.07853982F;
      }

      this.A.N = 0.0F;
      this.A.c = 0.0F;
      switch(null.k[this.e.ordinal()]) {
      case 1:
         this.B.N = 0.0F;
      case 2:
         this.B.b = this.B.b * 0.5F - 0.9424779F;
         this.B.N = 0.5235988F;
      case 3:
         this.B.b = this.B.b * 0.5F - 0.31415927F;
         this.B.N = 0.0F;
      default:
         switch(null.k[this.X.ordinal()]) {
         case 1:
            this.A.N = 0.0F;
         case 2:
            this.A.b = this.A.b * 0.5F - 0.9424779F;
            this.A.N = -0.5235988F;
         case 3:
            this.A.b = this.A.b * 0.5F - 0.31415927F;
            this.A.N = 0.0F;
         default:
            if(Float.compare(this.v, 0.0F) > 0) {
               aa var11 = this.x(var7);
               jb var12 = this.O(var11);
               float var13 = this.v;
               this.N.N = net.u.t.A(net.u.t.g(var13) * 6.2831855F) * 0.2F;
               if(var11 == aa.LEFT) {
                  this.N.N *= -1.0F;
               }

               this.A.h = net.u.t.A(this.N.N) * 5.0F;
               this.A.l = -net.u.t.m(this.N.N) * 5.0F;
               this.B.h = -net.u.t.A(this.N.N) * 5.0F;
               this.B.l = net.u.t.m(this.N.N) * 5.0F;
               this.A.N += this.N.N;
               this.B.N += this.N.N;
               this.B.b += this.N.N;
               var13 = 1.0F - this.v;
               var13 = var13 * var13;
               var13 = var13 * var13;
               var13 = 1.0F - var13;
               float var14 = net.u.t.A(var13 * 3.1415927F);
               float var15 = net.u.t.A(this.v * 3.1415927F) * -(this.G.b - 0.7F) * 0.75F;
               var12.b = (float)((double)var12.b - ((double)var14 * 1.2D + (double)var15));
               var12.N += this.N.N * 2.0F;
               var12.c += net.u.t.A(this.v * 3.1415927F) * -0.4F;
            }

            if(this.T) {
               this.N.b = 0.5F;
               this.A.b += 0.4F;
               this.B.b += 0.4F;
               this.H.h = 4.0F;
               this.a.h = 4.0F;
               this.H.I = 9.0F;
               this.a.I = 9.0F;
               this.G.I = 1.0F;
            }

            this.N.b = 0.0F;
            this.H.h = 0.1F;
            this.a.h = 0.1F;
            this.H.I = 12.0F;
            this.a.I = 12.0F;
            this.G.I = 0.0F;
            this.A.c += net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
            this.B.c -= net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
            this.A.b += net.u.t.A(var3 * 0.067F) * 0.05F;
            this.B.b -= net.u.t.A(var3 * 0.067F) * 0.05F;
            if(this.X == t.g.BOW_AND_ARROW) {
               this.A.N = -0.1F + this.G.N;
               this.B.N = 0.1F + this.G.N + 0.4F;
               this.A.b = -1.5707964F + this.G.b;
               this.B.b = -1.5707964F + this.G.b;
            }

            if(this.e == t.g.BOW_AND_ARROW) {
               this.A.N = -0.1F + this.G.N - 0.4F;
               this.B.N = 0.1F + this.G.N;
               this.A.b = -1.5707964F + this.G.b;
               this.B.b = -1.5707964F + this.G.b;
            }

            b(this.G, this.P);
         }
      }
   }

   public void q(net.y6.z var1) {
      super.q(var1);
      if(var1 instanceof t) {
         t var2 = (t)var1;
         this.e = var2.e;
         this.X = var2.X;
         this.T = var2.T;
      }

   }

   public void k(boolean var1) {
      this.G.B = var1;
      this.P.B = var1;
      this.N.B = var1;
      this.A.B = var1;
      this.B.B = var1;
      this.H.B = var1;
      this.a.B = var1;
   }

   public void V(float var1, aa var2) {
      this.O(var2).I(var1);
   }

   protected jb O(aa var1) {
      return var1 == aa.LEFT?this.B:this.A;
   }

   protected aa x(net.ne.l var1) {
      if(var1 instanceof net.ne.a) {
         net.ne.a var2 = (net.ne.a)var1;
         aa var3 = var2.a();
         return var2.XE == net.yz.k.MAIN_HAND?var3:var3.O();
      } else {
         return aa.RIGHT;
      }
   }

   private static xn d(xn var0) {
      return var0;
   }

   public static enum g {
      EMPTY,
      ITEM,
      BLOCK,
      BOW_AND_ARROW;
   }
}
