package net.y6;

import net.y6.jb;

public class e1 extends net.y6.z {
   public jb[] p = new jb[7];

   public e1() {
      this.p[0] = new jb(this, 0, 10);
      this.p[1] = new jb(this, 0, 0);
      this.p[2] = new jb(this, 0, 0);
      this.p[3] = new jb(this, 0, 0);
      this.p[4] = new jb(this, 0, 0);
      this.p[5] = new jb(this, 44, 10);
      boolean var10000 = true;
      var10000 = true;
      var10000 = true;
      var10000 = true;
      this.p[0].d(-10.0F, -8.0F, -1.0F, 20, 16, 2, 0.0F);
      this.p[0].n(0.0F, 4.0F, 0.0F);
      this.p[5].d(-9.0F, -7.0F, -1.0F, 18, 14, 1, 0.0F);
      this.p[5].n(0.0F, 4.0F, 0.0F);
      this.p[1].d(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
      this.p[1].n(-9.0F, 4.0F, 0.0F);
      this.p[2].d(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
      this.p[2].n(9.0F, 4.0F, 0.0F);
      this.p[3].d(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
      this.p[3].n(0.0F, 4.0F, -7.0F);
      this.p[4].d(-8.0F, -9.0F, -1.0F, 16, 8, 2, 0.0F);
      this.p[4].n(0.0F, 4.0F, 7.0F);
      this.p[0].b = 1.5707964F;
      this.p[1].N = 4.712389F;
      this.p[2].N = 1.5707964F;
      this.p[3].N = 3.1415927F;
      this.p[5].b = -1.5707964F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.W();
      this.p[5].I = 4.0F - var4;
      int var9 = 0;
      this.p[var9].B(var7);
      ++var9;
   }
}
