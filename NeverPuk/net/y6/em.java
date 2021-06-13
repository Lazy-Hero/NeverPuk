package net.y6;

import net.y6.jb;

public class em extends net.y6.z {
   public jb M;
   public jb L;

   public em() {
      this.f = 64;
      this.C = 64;
      this.M = new jb(this, 0, 0);
      this.M.d(-6.0F, -11.0F, -2.0F, 12, 22, 1, 0.0F);
      this.L = new jb(this, 26, 0);
      this.L.d(-1.0F, -3.0F, -1.0F, 2, 6, 6, 0.0F);
   }

   public void w() {
      this.M.B(0.0625F);
      this.L.B(0.0625F);
   }
}
