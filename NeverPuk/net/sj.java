package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.nr.h;
import net.u.d;
import net.z.tg;
import org.lwjgl.input.Keyboard;

public class sj extends mk {
   public sj() {
      super("InventoryWalk", or.Player);
   }

   @mr
   public void k(zn var1) {
      mk.Y();
      h[] var3 = new h[]{p.T.ib, p.T.P, p.T.w2, p.T.tT, p.T.iD, p.T.iE};
      if(p.s5 != null && !(p.s5 instanceof tg)) {
         int var5 = var3.length;
         byte var4 = 0;
         if(var4 < var5) {
            h var7 = var3[var4];
            var7.V = Keyboard.isKeyDown(var7.m());
            ++var4;
            d.h(new d[3]);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
