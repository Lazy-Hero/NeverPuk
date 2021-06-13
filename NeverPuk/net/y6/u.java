package net.y6;

import net.xn;
import net.y6.jb;

public class u extends net.y6.z {
   public jb w;
   public jb g;
   public jb[] X = new jb[4];

   public u() {
      this.f = 64;
      this.C = 64;
      this.w = new jb(this, 0, 0);
      this.w.d(0.0F, 0.0F, 0.0F, 16, 16, 6, 0.0F);
      this.g = new jb(this, 0, 22);
      this.g.d(0.0F, 0.0F, 0.0F, 16, 16, 6, 0.0F);
      this.X[0] = new jb(this, 50, 0);
      this.X[1] = new jb(this, 50, 6);
      this.X[2] = new jb(this, 50, 12);
      this.X[3] = new jb(this, 50, 18);
      this.X[0].U(0.0F, 6.0F, -16.0F, 3, 3, 3);
      this.X[1].U(0.0F, 6.0F, 0.0F, 3, 3, 3);
      this.X[2].U(-16.0F, 6.0F, -16.0F, 3, 3, 3);
      this.X[3].U(-16.0F, 6.0F, 0.0F, 3, 3, 3);
      this.X[0].b = 1.5707964F;
      this.X[1].b = 1.5707964F;
      this.X[2].b = 1.5707964F;
      this.X[3].b = 1.5707964F;
      this.X[0].c = 0.0F;
      this.X[1].c = 1.5707964F;
      this.X[2].c = 4.712389F;
      this.X[3].c = 3.1415927F;
   }

   public int M() {
      return 51;
   }

   public void v() {
      this.w.B(0.0625F);
      this.g.B(0.0625F);
      this.X[0].B(0.0625F);
      this.X[1].B(0.0625F);
      this.X[2].B(0.0625F);
      this.X[3].B(0.0625F);
   }

   public void q(boolean var1) {
      net.y6.z.W();
      this.w.B = var1;
      this.g.B = !var1;
      this.X[0].B = !var1;
      this.X[1].B = var1;
      this.X[2].B = !var1;
      this.X[3].B = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
