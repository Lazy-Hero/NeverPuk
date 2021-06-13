package net.c2;

import net.c2.n;
import net.nl.z1;
import net.yz.m_;

public class s extends n {
   private static final m_ Yj = new m_("textures/gui/container/dispenser.png");
   private final net.r.i Y8;
   public z1 Yf;

   public s(net.r.i var1, z1 var2) {
      super(new net.nl.n(var1, var2));
      this.Y8 = var1;
      this.Yf = var2;
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      String var3 = this.Yf.b().l();
      this.O.v(var3, (float)(this.s / 2 - this.O.r(var3) / 2), 6.0F, 4210752);
      this.O.v(this.Y8.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(Yj);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
   }
}
