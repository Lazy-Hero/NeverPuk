package net.ni;

import net.xn;
import net.ni.v;
import net.ni.w;

public class n extends v implements net.yz.i {
   public float N;
   public float G;
   public int b;
   private int K;

   public void m() {
      int[] var1 = w.C();
      if(++this.K % 20 * 4 == 0) {
         this.J.x(this.S, net.nb.f.uy, 1, this.b);
      }

      this.G = this.N;
      int var2 = this.S.t();
      int var3 = this.S.h();
      int var4 = this.S.y();
      float var10000 = 0.1F;
      if(this.b > 0 && Float.compare(this.N, 0.0F) == 0) {
         double var6 = (double)var2 + 0.5D;
         double var8 = (double)var4 + 0.5D;
         this.J.L((net.r.r)null, var6, (double)var3 + 0.5D, var8, net.nb.l.oq, net.yz.p.BLOCKS, 0.5F, this.J.G.nextFloat() * 0.1F + 0.9F);
      }

      if(this.b == 0 && this.N > 0.0F || this.b > 0 && this.N < 1.0F) {
         float var12 = this.N;
         if(this.b > 0) {
            this.N += 0.1F;
         }

         this.N -= 0.1F;
         if(this.N > 1.0F) {
            this.N = 1.0F;
         }

         var10000 = 0.5F;
         if(Float.compare(this.N, 0.5F) < 0 && Float.compare(var12, 0.5F) >= 0) {
            double var13 = (double)var2 + 0.5D;
            double var10 = (double)var4 + 0.5D;
            this.J.L((net.r.r)null, var13, (double)var3 + 0.5D, var10, net.nb.l.Pd, net.yz.p.BLOCKS, 0.5F, this.J.G.nextFloat() * 0.1F + 0.9F);
         }

         if(this.N < 0.0F) {
            this.N = 0.0F;
         }
      }

   }

   public boolean q(int var1, int var2) {
      if(var1 == 1) {
         this.b = var2;
         return true;
      } else {
         return super.q(var1, var2);
      }
   }

   public void Z() {
      this.K();
      super.Z();
   }

   public void Y() {
      ++this.b;
      this.J.x(this.S, net.nb.f.uy, 1, this.b);
   }

   public void T() {
      --this.b;
      this.J.x(this.S, net.nb.f.uy, 1, this.b);
   }

   public boolean W(net.r.r var1) {
      return this.J.L(this.S) != this?false:var1.o((double)this.S.t() + 0.5D, (double)this.S.h() + 0.5D, (double)this.S.y() + 0.5D) <= 64.0D;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
