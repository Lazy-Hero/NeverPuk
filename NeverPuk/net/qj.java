package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nk.fb;
import net.nn.j;
import net.y0.d;
import net.y0.d6;
import net.y6.eb;
import net.y6.jb;

public class qj extends iy {
   public qj() {
      super(fb.class, "ghast", 0.5F);
   }

   public net.y6.z J() {
      return new eb();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eb)) {
         return null;
      } else {
         eb var4 = (eb)var1;
         if(var2.equals("body")) {
            return (jb)i6.G((Object)var4, (mf)i6.Bd);
         } else {
            String var5 = "tentacle";
            if(var2.startsWith(var5)) {
               jb[] var6 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.un));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      d6 var4 = new d6(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
