package net.y6;

import net.y6.jb;

public class ej extends net.y6.z {
   private final jb A;

   public ej() {
      this(0.0F);
   }

   public ej(float var1) {
      this.A = new jb(this);
      boolean var10000 = true;
      this.A.k(0, 0).d(-4.0F, 0.0F, 0.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(0.0F, -4.0F, 0.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(0.0F, 0.0F, -4.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(0.0F, 0.0F, 0.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(2.0F, 0.0F, 0.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(0.0F, 2.0F, 0.0F, 2, 2, 2, var1);
      this.A.k(0, 0).d(0.0F, 0.0F, 2.0F, 2, 2, 2, var1);
      this.A.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.A.B(var7);
   }
}
