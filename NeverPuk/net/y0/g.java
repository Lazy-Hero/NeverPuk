package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class g extends c {
   private static final m_[] q = new m_[]{new m_("textures/entity/boat/boat_oak.png"), new m_("textures/entity/boat/boat_spruce.png"), new m_("textures/entity/boat/boat_birch.png"), new m_("textures/entity/boat/boat_jungle.png"), new m_("textures/entity/boat/boat_acacia.png"), new m_("textures/entity/boat/boat_darkoak.png")};
   protected net.y6.z h = new net.y6.n();

   public g(d var1) {
      super(var1);
      this.W = 0.5F;
   }

   public void T(net.nm.b var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      net.y.d.c();
      this.P(var2, var4, var6);
      this.l(var1, var8, var9);
      this.j(var1);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      this.h.V(var1, var9, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   public void l(net.nm.b var1, float var2, float var3) {
      c.C();
      net.y.d.P(180.0F - var2, 0.0F, 1.0F, 0.0F);
      float var5 = (float)var1.J() - var3;
      float var6 = var1.Z() - var3;
      if(Float.compare(var6, 0.0F) < 0) {
         var6 = 0.0F;
      }

      if(var5 > 0.0F) {
         net.y.d.P(net.u.t.A(var5) * var5 * var6 / 10.0F * (float)var1.s(), 1.0F, 0.0F, 0.0F);
      }

      net.y.d.W(-1.0F, -1.0F, 1.0F);
   }

   public void P(double var1, double var3, double var5) {
      net.y.d.O((float)var1, (float)var3 + 0.375F, (float)var5);
   }

   protected m_ X(net.nm.b var1) {
      return q[var1.U().ordinal()];
   }

   public boolean K() {
      return true;
   }

   public void h(net.nm.b var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      this.P(var2, var4, var6);
      this.l(var1, var8, var9);
      this.j(var1);
      ((net.y6.e)this.h).B(var1, var9, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      net.y.d.Y();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
