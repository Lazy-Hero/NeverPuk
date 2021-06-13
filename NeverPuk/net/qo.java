package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nk.f8;
import net.nn.j;
import net.y0.d;
import net.y6.ei;
import net.y6.jb;

public class qo extends iy {
   public qo() {
      super(f8.class, "magma_cube", 0.5F);
   }

   public net.y6.z J() {
      return new ei();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ei)) {
         return null;
      } else {
         ei var4 = (ei)var1;
         if(var2.equals("core")) {
            return (jb)i6.G((Object)var4, (mf)i6.Bf);
         } else {
            String var5 = "segment";
            if(var2.startsWith(var5)) {
               jb[] var6 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.uq));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.dn var4 = new net.y0.dn(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
