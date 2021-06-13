package net.y6;

import net.y6.jb;

public class r extends net.y6.z {
   public jb l;
   public jb a;
   public jb U;

   public r() {
      this.f = 64;
      this.C = 64;
      this.l = new jb(this, 0, 0);
      this.l.d(-10.0F, 0.0F, -2.0F, 20, 40, 1, 0.0F);
      this.a = new jb(this, 44, 0);
      this.a.d(-1.0F, -30.0F, -1.0F, 2, 42, 2, 0.0F);
      this.U = new jb(this, 0, 42);
      this.U.d(-10.0F, -32.0F, -1.0F, 20, 2, 2, 0.0F);
   }

   public void p() {
      this.l.I = -32.0F;
      this.l.B(0.0625F);
      this.a.B(0.0625F);
      this.U.B(0.0625F);
   }
}
