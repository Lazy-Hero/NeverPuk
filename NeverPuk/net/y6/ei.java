package net.y6;

import net.xn;
import net.nk.f8;
import net.y6.jb;

public class ei extends net.y6.z {
   jb[] a;
   jb Y;

   public ei() {
      net.y6.z.C();
      this.a = new jb[8];
      int var2 = 0;
      if(var2 < this.a.length) {
         byte var3 = 0;
         this.a[var2] = new jb(this, var3, var2);
         this.a[var2].U(-4.0F, (float)(16 + var2), -4.0F, 8, 1, 8);
         ++var2;
      }

      this.Y = new jb(this, 0, 16);
      this.Y.U(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      f8 var5 = (f8)var1;
      float var6 = var5.ur + (var5.uK - var5.ur) * var4;
      if(var6 < 0.0F) {
         var6 = 0.0F;
      }

      for(int var7 = 0; var7 < this.a.length; ++var7) {
         this.a[var7].I = (float)(-(4 - var7)) * var6 * 1.7F;
      }

   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.Y.B(var7);

      for(jb var11 : this.a) {
         var11.B(var7);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
