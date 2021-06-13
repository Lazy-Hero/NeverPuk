package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nk.x;
import net.nn.j;
import net.y0.d;
import net.y6.jb;
import net.y6.q;

public class qi extends iy {
   public qi() {
      super(x.class, "blaze", 0.5F);
   }

   public net.y6.z J() {
      return new q();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof q)) {
         return null;
      } else {
         q var4 = (q)var1;
         if(var2.equals("head")) {
            return (jb)i6.G((Object)var4, (mf)i6.U2);
         } else {
            String var5 = "stick";
            if(var2.startsWith(var5)) {
               jb[] var6 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.MP));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.dt var4 = new net.y0.dt(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
