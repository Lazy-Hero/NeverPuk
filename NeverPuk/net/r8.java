package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nn.j;
import net.y0.ce;
import net.y0.d;
import net.y6.e8;
import net.y6.jb;

public class r8 extends iy {
   public r8() {
      super(net.a.z.class, "wither", 0.5F);
   }

   public net.y6.z J() {
      return new e8(0.0F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof e8)) {
         return null;
      } else {
         e8 var4 = (e8)var1;
         String var5 = "body";
         if(var2.startsWith(var5)) {
            jb[] var10 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.uX));
            return null;
         } else {
            String var6 = "head";
            if(var2.startsWith(var6)) {
               jb[] var7 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.uB));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      ce var4 = new ce(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
