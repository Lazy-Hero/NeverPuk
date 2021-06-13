package net.c1;

import net.xn;
import net.c1.c;
import net.c1.d;
import net.c1.y;
import net.n0.ks;
import net.nl.z2;

public class z extends c {
   protected z(c.u var1, z2... var2) {
      super(var1, d.DIGGER, var2);
      this.Q("digging");
   }

   public int O(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   public int x(int var1) {
      return super.O(var1) + 50;
   }

   public int h() {
      return 5;
   }

   public boolean U(ks var1) {
      String var2 = y.j();
      return var1.Z() == net.nb.j.W5 || super.U(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
