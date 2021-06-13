package net.yz;

import net.xn;
import net.yz.m_;

public enum aa {
   LEFT(new net.cb.h("options.mainHand.left", new Object[0])),
   RIGHT(new net.cb.h("options.mainHand.right", new Object[0]));

   private final net.cb.t j;

   private aa(net.cb.t var3) {
      this.j = var3;
   }

   public aa O() {
      int var1 = m_.g();
      return this == LEFT?RIGHT:LEFT;
   }

   public String toString() {
      return this.j.l();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
