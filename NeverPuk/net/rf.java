package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nk.e;
import net.nn.j;
import net.y0.d;
import net.y6.eu;
import net.y6.jb;

public class rf extends iy {
   public rf() {
      super(e.class, "silverfish", 0.3F);
   }

   public net.y6.z J() {
      return new eu();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eu)) {
         return null;
      } else {
         eu var4 = (eu)var1;
         String var5 = "body";
         if(var2.startsWith(var5)) {
            jb[] var10 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.uj));
            return null;
         } else {
            String var6 = "wing";
            if(var2.startsWith(var6)) {
               jb[] var7 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.B_));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.dg var4 = new net.y0.dg(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
