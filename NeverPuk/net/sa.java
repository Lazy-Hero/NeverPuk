package net;

import net._v;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.u.d;
import net.u.e;
import net.z.tr;

public class sa extends mk {
   public sa() {
      super("DeathCoords", or.World);
   }

   @mr
   public void m(zn var1) {
      d[] var2 = e.T();
      if(Float.compare(p.sf.h(), 0.0F) <= 0 && p.s5 instanceof tr) {
         int var3 = p.sf.z().t();
         int var4 = p.sf.z().h();
         int var5 = p.sf.z().y();
         if(p.sf.x % 8 == 0) {
            _v.A("Death Coords: X: " + var3 + " Y: " + var4 + " Z: " + var5);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
