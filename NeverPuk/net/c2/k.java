package net.c2;

import net.xn;
import net.c2.j;
import net.c2.n;
import net.ni.l;
import net.nl.z1;
import net.yz.m_;

public class k extends n {
   private static final m_ M4 = new m_("textures/gui/container/furnace.png");
   private final net.r.i MC;
   private final z1 Md;

   public k(net.r.i var1, z1 var2) {
      super(new net.nl.g(var1, var2));
      this.MC = var1;
      this.Md = var2;
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      String var3 = this.Md.b().l();
      this.O.v(var3, (float)(this.s / 2 - this.O.r(var3) / 2), 6.0F, 4210752);
      this.O.v(this.MC.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      j.u.g();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(M4);
      int var5 = (q - this.s) / 2;
      int var6 = (V - this.W) / 2;
      this.g(var5, var6, 0, 0, this.s, this.W);
      if(l.K(this.Md)) {
         int var7 = this.T(13);
         this.g(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 1);
      }

      int var8 = this.S(24);
      this.g(var5 + 79, var6 + 34, 176, 14, var8 + 1, 16);
   }

   private int S(int var1) {
      int var3 = this.Md.e(2);
      j.u.C();
      int var4 = this.Md.e(3);
      return var4 != 0 && var3 != 0?var3 * var1 / var4:0;
   }

   private int T(int var1) {
      int var2 = this.Md.e(1);
      var2 = 200;
      return this.Md.e(0) * var1 / var2;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
