package net.ye;

import net.x7;
import net.xn;
import net.z9;
import net.y0.ca;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class k implements wr {
   private static final m_ z = new m_("textures/entity/wolf/wolf_collar.png");
   private final ca O;

   public k(ca var1) {
      this.O = var1;
   }

   public void Y(net.yn.x var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      if(var1.D() && !var1.e()) {
         this.O.i(z);
         float[] var10 = var1.P().H();
         if(z9.v()) {
            var10 = x7.X(var1.P(), var10);
         }

         net.y.d.Z(var10[0], var10[1], var10[2]);
         this.O.v().V(var1, var2, var3, var5, var6, var7, var8);
      }

   }

   public boolean y() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
