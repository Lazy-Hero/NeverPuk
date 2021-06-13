package net.y6;

import net.xn;
import net.y6.jb;

public class ef extends net.y6.z {
   private static final int[][] M = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] S = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private static final int X = M.length;
   private final jb[] Z;

   public ef() {
      net.y6.z.C();
      super();
      this.Z = new jb[X];
      float var2 = -3.5F;
      int var3 = 0;
      if(var3 < this.Z.length) {
         this.Z[var3] = new jb(this, S[var3][0], S[var3][1]);
         this.Z[var3].U((float)M[var3][0] * -0.5F, 0.0F, (float)M[var3][2] * -0.5F, M[var3][0], M[var3][1], M[var3][2]);
         this.Z[var3].n(0.0F, (float)(24 - M[var3][1]), var2);
         if(var3 < this.Z.length - 1) {
            float var10000 = var2 + (float)(M[var3][2] + M[var3 + 1][2]) * 0.5F;
         }

         ++var3;
      }

   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);

      for(jb var11 : this.Z) {
         var11.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.y6.z.C();
      int var9 = 0;
      if(var9 < this.Z.length) {
         this.Z[var9].N = net.u.t.m(var3 * 0.9F + (float)var9 * 0.15F * 3.1415927F) * 3.1415927F * 0.01F * (float)(1 + Math.abs(var9 - 2));
         this.Z[var9].l = net.u.t.A(var3 * 0.9F + (float)var9 * 0.15F * 3.1415927F) * 3.1415927F * 0.1F * (float)Math.abs(var9 - 2);
         ++var9;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
