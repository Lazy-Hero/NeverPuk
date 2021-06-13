package net.y6;

import net.y6.jb;

public class eq extends net.y6.z {
   jb o;
   jb[] p;

   public eq() {
      net.y6.z.W();
      super();
      this.p = new jb[8];
      boolean var10000 = true;
      this.o = new jb(this, 0, 0);
      this.o.U(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.o.I += 8.0F;
      int var3 = 0;
      if(var3 < this.p.length) {
         this.p[var3] = new jb(this, 48, 0);
         double var4 = (double)var3 * 3.141592653589793D * 2.0D / (double)this.p.length;
         float var6 = (float)Math.cos(var4) * 5.0F;
         float var7 = (float)Math.sin(var4) * 5.0F;
         this.p[var3].U(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.p[var3].l = var6;
         this.p[var3].h = var7;
         this.p[var3].I = 15.0F;
         var4 = (double)var3 * 3.141592653589793D * -2.0D / (double)this.p.length + 1.5707963267948966D;
         this.p[var3].N = (float)var4;
         ++var3;
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      jb[] var9 = this.p;
      net.y6.z.C();
      int var10 = var9.length;
      int var11 = 0;
      if(var11 < var10) {
         jb var12 = var9[var11];
         var12.b = var3;
         ++var11;
      }

   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      net.y6.z.C();
      this.o.B(var7);
      jb[] var9 = this.p;
      int var10 = var9.length;
      int var11 = 0;
      if(var11 < var10) {
         jb var12 = var9[var11];
         var12.B(var7);
         ++var11;
      }

   }
}
