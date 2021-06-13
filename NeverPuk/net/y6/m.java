package net.y6;

import net.y6.jb;

public class m extends net.y6.z {
   public jb p = (new jb(this, 0, 0)).R(64, 64);
   public jb D;
   public jb Y;

   public m() {
      this.p.d(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.p.l = 1.0F;
      this.p.I = 7.0F;
      this.p.h = 15.0F;
      this.Y = (new jb(this, 0, 0)).R(64, 64);
      this.Y.d(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.Y.l = 8.0F;
      this.Y.I = 7.0F;
      this.Y.h = 15.0F;
      this.D = (new jb(this, 0, 19)).R(64, 64);
      this.D.d(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.D.l = 1.0F;
      this.D.I = 6.0F;
      this.D.h = 1.0F;
   }

   public void x() {
      this.Y.b = this.p.b;
      this.p.B(0.0625F);
      this.Y.B(0.0625F);
      this.D.B(0.0625F);
   }
}
