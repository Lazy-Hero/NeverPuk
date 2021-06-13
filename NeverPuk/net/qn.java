package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y0.dk;
import net.y6.eo;
import net.y6.jb;

public class qn extends iy {
   public qn() {
      super(net.nk.z.class, "guardian", 0.5F);
   }

   public net.y6.z J() {
      return new eo();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eo)) {
         return null;
      } else {
         eo var4 = (eo)var1;
         if(var2.equals("body")) {
            return (jb)i6.G((Object)var4, (mf)i6.uF);
         } else if(var2.equals("eye")) {
            return (jb)i6.G((Object)var4, (mf)i6.uw);
         } else {
            String var5 = "spine";
            if(var2.startsWith(var5)) {
               jb[] var10 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.uO));
               return null;
            } else {
               String var6 = "tail";
               if(var2.startsWith(var6)) {
                  jb[] var7 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.C7));
                  return null;
               } else {
                  return null;
               }
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      dk var4 = new dk(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
