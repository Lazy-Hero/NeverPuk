package net.y6;

import net.xn;
import net.y6.jb;

public class eu extends net.y6.z {
   private final jb[] e = new jb[7];
   private final jb[] S;
   private final float[] I;
   private static final int[][] K = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] p = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public eu() {
      net.y6.z.W();
      this.I = new float[7];
      float var2 = -3.5F;
      int var3 = 0;
      if(var3 < this.e.length) {
         this.e[var3] = new jb(this, p[var3][0], p[var3][1]);
         this.e[var3].U((float)K[var3][0] * -0.5F, 0.0F, (float)K[var3][2] * -0.5F, K[var3][0], K[var3][1], K[var3][2]);
         this.e[var3].n(0.0F, (float)(24 - K[var3][1]), var2);
         this.I[var3] = var2;
         if(var3 < this.e.length - 1) {
            float var10000 = var2 + (float)(K[var3][2] + K[var3 + 1][2]) * 0.5F;
         }

         ++var3;
      }

      this.S = new jb[3];
      this.S[0] = new jb(this, 20, 0);
      this.S[0].U(-5.0F, 0.0F, (float)K[2][2] * -0.5F, 10, 8, K[2][2]);
      this.S[0].n(0.0F, 16.0F, this.I[2]);
      this.S[1] = new jb(this, 20, 11);
      this.S[1].U(-3.0F, 0.0F, (float)K[4][2] * -0.5F, 6, 4, K[4][2]);
      this.S[1].n(0.0F, 20.0F, this.I[4]);
      this.S[2] = new jb(this, 20, 18);
      this.S[2].U(-3.0F, 0.0F, (float)K[4][2] * -0.5F, 6, 5, K[1][2]);
      this.S[2].n(0.0F, 19.0F, this.I[1]);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);

      for(jb var11 : this.e) {
         var11.B(var7);
      }

      for(jb var15 : this.S) {
         var15.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      for(int var8 = 0; var8 < this.e.length; ++var8) {
         this.e[var8].N = net.u.t.m(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (float)(1 + Math.abs(var8 - 2));
         this.e[var8].l = net.u.t.A(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * (float)Math.abs(var8 - 2);
      }

      this.S[0].N = this.e[2].N;
      this.S[1].N = this.e[4].N;
      this.S[1].l = this.e[4].l;
      this.S[2].N = this.e[1].N;
      this.S[2].l = this.e[1].l;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
