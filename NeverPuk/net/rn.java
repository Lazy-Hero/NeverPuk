package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nn.j;
import net.y0.c0;
import net.y0.d;
import net.y6.eq;
import net.y6.jb;
import net.yn.m;

public class rn extends iy {
   public rn() {
      super(m.class, "squid", 0.7F);
   }

   public net.y6.z J() {
      return new eq();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof eq)) {
         return null;
      } else {
         eq var4 = (eq)var1;
         if(var2.equals("body")) {
            return (jb)i6.G((Object)var4, (mf)i6.uI);
         } else {
            String var5 = "tentacle";
            if(var2.startsWith(var5)) {
               jb[] var6 = (jb[])((jb[])i6.G((Object)var4, (mf)i6.M4));
               return null;
            } else {
               return null;
            }
         }
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      c0 var4 = new c0(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
