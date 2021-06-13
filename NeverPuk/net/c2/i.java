package net.c2;

import net.xn;
import net.c2.h;
import net.c2.j;
import net.c2.n;
import net.nl.z1;
import net.yn.l;
import net.yn.q;
import net.yz.m_;

public class i extends n {
   private static final m_ kb = new m_("textures/gui/container/horse.png");
   private final z1 kE;
   private final z1 ku;
   private final net.yn.j kZ;
   private float kL;
   private float kA;

   public i(z1 var1, z1 var2, net.yn.j var3) {
      super(new net.nl.b(var1, var2, var3, net.nn.j.b().sf));
      this.kE = var1;
      this.ku = var2;
      this.kZ = var3;
      this.E = false;
   }

   protected void z(int var1, int var2) {
      this.O.v(this.ku.b().l(), 8.0F, 6.0F, 4210752);
      this.O.v(this.kE.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(kb);
      j.u.g();
      int var5 = (q - this.s) / 2;
      int var6 = (V - this.W) / 2;
      this.g(var5, var6, 0, 0, this.s, this.W);
      if(this.kZ instanceof q) {
         q var7 = (q)this.kZ;
         if(var7.TJ()) {
            this.g(var5 + 79, var6 + 17, 0, this.W, var7.k() * 18, 54);
         }
      }

      if(this.kZ.Ui()) {
         this.g(var5 + 7, var6 + 35 - 18, 18, this.W + 54, 18, 18);
      }

      if(this.kZ.UC()) {
         if(this.kZ instanceof l) {
            this.g(var5 + 7, var6 + 35, 36, this.W + 54, 18, 18);
         }

         this.g(var5 + 7, var6 + 35, 0, this.W + 54, 18, 18);
      }

      h.i((float)(var5 + 51), (float)(var6 + 60), 17, (float)(var5 + 51) - this.kL, (float)(var6 + 75 - 50) - this.kA, this.kZ);
   }

   public void v(int var1, int var2, float var3) {
      this.C();
      this.kL = (float)var1;
      this.kA = (float)var2;
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
