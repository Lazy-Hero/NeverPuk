package net.c2;

import java.awt.Color;
import net.gn;
import net.xn;
import net.c2.j;
import net.c2.n;
import net.nl.p;
import net.nl.z1;
import net.yz.m_;

public class f extends n {
   private static final m_ py = new m_("textures/gui/container/shulker_box.png");
   private final z1 pE;
   private final net.r.i pm;
   private float pn;

   public f(net.r.i var1, z1 var2) {
      super(new p(var1, var2, net.nn.j.b().sf));
      this.pm = var1;
      this.pE = var2;
      ++this.W;
   }

   public void v(int var1, int var2, float var3) {
      j.u.g();
      net.z.t var5 = new net.z.t(net.nn.j.b());
      if(this.A.sf != null && this.A.s8 != null) {
         float var6 = 160.0F;
         int var7 = (int)(var6 / 100.0F);
         if(Float.compare(this.pn, var6 - (float)var7) < 0) {
            this.pn += (float)var7;
         }

         if(this.pn > var6 - (float)var7 && Float.compare(this.pn, var6) != 0) {
            this.pn = (float)((int)var6);
         }

         if(this.pn != var6) {
            this.pn = (float)((int)var6);
         }

         Color var8 = new Color(gn.M().getRed(), gn.M().getGreen(), gn.M().getBlue(), (int)this.pn);
         Color var9 = new Color(0, 0, 0, 0);
         this.T(0, 0, (double)var5.u(), (double)var5.v(), var8.getRGB(), var9.getRGB());
      }

      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   protected void z(int var1, int var2) {
      this.O.v(this.pE.b().l(), 8.0F, 6.0F, 4210752);
      this.O.v(this.pm.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(py);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.W);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
