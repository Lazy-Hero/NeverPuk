package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;
import net.m.s;
import net.n0.ks;
import net.n2.k;
import net.nb.j;
import net.yn.w;
import org.lwjgl.input.Mouse;

public class v1 extends mk {
   public v1() {
      super("MiddleClickPearl", or.Player);
   }

   @mr
   public void H(zg var1) {
      int[] var2 = w.I();
      if(Mouse.isButtonDown(2)) {
         int var3 = 0;
         ks var4 = p.sf.a8.A(var3);
         if(var4.Z() == j.Ys) {
            p.sf.x3.L((k)(new s(var3)));
            p.sf.x3.L((k)(new net.m.j(net.yz.k.MAIN_HAND)));
            p.sf.x3.L((k)(new s(p.sf.a8.r)));
         }

         ++var3;
      }

   }

   public void H() {
      p.sf.x3.L((k)(new s(p.sf.a8.r)));
      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
