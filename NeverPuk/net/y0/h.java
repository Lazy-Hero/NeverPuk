package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.o;
import net.yz.m_;

public class h extends o {
   public static final m_ I = new m_("textures/entity/armorstand/wood.png");

   public h(d var1) {
      super(var1, new net.y6.d(), 0.0F);
      net.ye.d var2 = new net.ye.d(this) {
         protected void H() {
            this.W = new net.y6.p(0.5F);
            this.z = new net.y6.p(1.0F);
         }
      };
      this.k(var2);
      this.k(new net.ye.s(this));
      this.k(new net.ye.z(this));
      this.k(new net.ye.w(this.z().G));
   }

   protected m_ M(net.nm.z var1) {
      return I;
   }

   public net.y6.d z() {
      return (net.y6.d)super.v();
   }

   protected void G(net.nm.z var1, float var2, float var3, float var4) {
      net.y.d.P(180.0F - var3, 0.0F, 1.0F, 0.0F);
      c.q();
      float var6 = (float)(var1.hl.y() - var1.VF) + var4;
      if(var6 < 5.0F) {
         net.y.d.P(net.u.t.A(var6 / 1.5F * 3.1415927F) * 3.0F, 0.0F, 1.0F, 0.0F);
      }

   }

   protected boolean p(net.nm.z var1) {
      return var1.y();
   }

   public void e(net.nm.z var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.q();
      if(var1.Ji()) {
         this.Q = true;
      }

      super.R(var1, var2, var4, var6, var8, var9);
      if(var1.Ji()) {
         this.Q = false;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
