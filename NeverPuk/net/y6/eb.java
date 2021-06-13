package net.y6;

import java.util.Random;
import net.xn;
import net.y6.jb;

public class eb extends net.y6.z {
   jb D;
   jb[] w = new jb[9];

   public eb() {
      net.y6.z.W();
      boolean var10001 = true;
      this.D = new jb(this, 0, 0);
      this.D.U(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      this.D.I += 8.0F;
      Random var3 = new Random(1660L);
      int var4 = 0;
      if(var4 < this.w.length) {
         this.w[var4] = new jb(this, 0, 0);
         float var5 = (((float)(var4 % 3) - (float)(var4 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var6 = ((float)(var4 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var7 = var3.nextInt(7) + 8;
         this.w[var4].U(-1.0F, 0.0F, -1.0F, 2, var7, 2);
         this.w[var4].l = var5;
         this.w[var4].h = var6;
         this.w[var4].I = 15.0F;
         ++var4;
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      for(int var8 = 0; var8 < this.w.length; ++var8) {
         this.w[var8].b = 0.2F * net.u.t.A(var3 * 0.3F + (float)var8) + 0.4F;
      }

   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      net.y6.z.C();
      net.y.d.c();
      net.y.d.O(0.0F, 0.6F, 0.0F);
      this.D.B(var7);
      jb[] var9 = this.w;
      int var10 = var9.length;
      int var11 = 0;
      if(var11 < var10) {
         jb var12 = var9[var11];
         var12.B(var7);
         ++var11;
      }

      net.y.d.Y();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
