package net.c2;

import net.xn;
import net.c2.j;
import net.c2.n;
import net.nl.z1;
import net.yz.m_;

public class t extends n {
   private static final m_ Zz = new m_("textures/gui/container/brewing_stand.png");
   private static final int[] Z_ = new int[]{29, 24, 20, 16, 11, 6, 0};
   private final net.r.i Z6;
   private final z1 Zn;

   public t(net.r.i var1, z1 var2) {
      super(new net.nl.i(var1, var2));
      this.Z6 = var1;
      this.Zn = var2;
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      String var3 = this.Zn.b().l();
      this.O.v(var3, (float)(this.s / 2 - this.O.r(var3) / 2), 6.0F, 4210752);
      this.O.v(this.Z6.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      j.u.g();
      this.A.n().E(Zz);
      int var5 = (q - this.s) / 2;
      int var6 = (V - this.W) / 2;
      this.g(var5, var6, 0, 0, this.s, this.W);
      int var7 = this.Zn.e(1);
      int var8 = net.u.t.g((18 * var7 + 20 - 1) / 20, 0, 18);
      if(var8 > 0) {
         this.g(var5 + 60, var6 + 44, 176, 29, var8, 4);
      }

      int var9 = this.Zn.e(0);
      if(var9 > 0) {
         int var10 = (int)(28.0F * (1.0F - (float)var9 / 400.0F));
         if(var10 > 0) {
            this.g(var5 + 97, var6 + 16, 176, 0, 9, var10);
         }

         var10 = Z_[var9 / 2 % 7];
         if(var10 > 0) {
            this.g(var5 + 63, var6 + 14 + 29 - var10, 185, 29 - var10, 12, var10);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
