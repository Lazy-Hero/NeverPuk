package net.z;

import net.nl.z1;
import net.yz.m_;

public class wg extends net.c2.n {
   private static final m_ Fz = new m_("textures/gui/container/hopper.png");
   private final z1 Fc;
   private final z1 Fn;

   public wg(net.r.i var1, z1 var2) {
      super(new net.nl.k(var1, var2, net.nn.j.b().sf));
      this.Fc = var1;
      this.Fn = var2;
      this.E = false;
      this.W = 133;
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      this.O.v(this.Fn.b().l(), 8.0F, 6.0F, 4210752);
      this.O.v(this.Fc.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(Fz);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
   }
}
